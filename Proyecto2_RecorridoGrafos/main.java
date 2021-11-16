package Proyecto2_RecorridoGrafos;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class main {
	
    public static void main(String[] args) throws IOException {
        // Direccion de la imagen, lectura
        Imagen obj = new Imagen("C:\\Users\\erick\\eclipse-workspace\\2B\\src\\Proyecto2_RecorridoGrafos\\images\\imagen1.jpg");
        obj.binarizarImagen(100);
        
        // guardado de imagen
        BufferedImage img = obj.imprimirImagen();
        ImageIO.write(img, "jpg", new File("C:\\Users\\erick\\eclipse-workspace\\2B\\src\\Proyecto2_RecorridoGrafos\\images\\Salidaimagen1.jpg"));
        
        int matrizImg [][]= obj.MatrizImg(img);

		//Impresion de matriz
        mostrarMatriz(matrizImg);
        
        BreadFirstSearch objBFS = new BreadFirstSearch();
        objBFS.BFS(matrizImg);
        
        mostrarMatriz(matrizImg);
        
        DepthFirstSearch objDFS = new DepthFirstSearch();
        objDFS.DFS(matrizImg, 0, 0, 0);   
        
        mostrarMatriz(matrizImg);
    }
    
    public static void mostrarMatriz (int [][] matrizImg) {
    	 for (int i = 0; i < matrizImg.length; i++) {
 			for (int j = 0; j < matrizImg[i].length; j++) {
 				System.out.print("(" + matrizImg[i][j] + ")\t");
 			}
 			System.out.println("");
 		} 
    }
}
