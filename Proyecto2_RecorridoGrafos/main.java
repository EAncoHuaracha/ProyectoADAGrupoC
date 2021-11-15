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
  
    }
}
