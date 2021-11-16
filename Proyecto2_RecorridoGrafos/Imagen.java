package Proyecto2_RecorridoGrafos;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Imagen {
	
    public static final int anchoPermitido=1024;
    public static final int altoPermitido=720;
    private Color arreglo[][];
    private int ancho;
    private int alto;
    
    public Imagen(String archivo) {
        arreglo = new Color[anchoPermitido][anchoPermitido];
        cargarImagen(archivo);
    }
    
    public void cargarImagen(String archivo){
        BufferedImage tmp = null;
        try {
            tmp = ImageIO.read(new File(archivo));
        } catch (IOException ex) {
            Logger.getLogger(Imagen.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (tmp.getWidth() < anchoPermitido) {
            ancho = tmp.getWidth();
        }else
            ancho = anchoPermitido;
        if (tmp.getHeight() < altoPermitido) {
            alto = tmp.getHeight();
        }else
            alto = altoPermitido;
        int cont = 0;
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                cont++;
                arreglo[i][j] = new Color(tmp.getRGB(j, i));
                //System.out.println(cont + ":"+"RedGreenBlue:" + tmp.getRGB(j, i));
            }
        }
    }
   
    public void binarizarImagen(double umbral){
    	
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
            	
                Color pix= arreglo[i][j];
                
                int promedio =(pix.getBlue()+pix.getRed()+pix.getGreen())/3;
                
                if (promedio<umbral) 
                    arreglo[i][j]=Color.BLACK;
                else
                    arreglo[i][j] = Color.WHITE;
            }
        }
    }
    public BufferedImage imprimirImagen(){
    	
        BufferedImage salida = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                salida.setRGB(j, i, arreglo[i][j].getRGB());
            }
        }
        return salida;
    }
    
    public int[][] MatrizImg(BufferedImage img) 
    {
		Raster tmp = img.getData();
		
		int ancho = tmp.getWidth();
		int alto = tmp.getHeight();
		
		int p[][] = new int[ancho][alto];
		
		for (int i = 0; i < ancho; i++) {
			for(int j = 0; j< alto; j++) {
				p[i][j] = tmp.getSample(i,j,0);
			}
		}

		return p;
	}
}
