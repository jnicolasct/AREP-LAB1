package edu.escuelaing.arep.AREPLAB1;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
        LinkedList lista = new LinkedList();
        File archivo = new File ("C:\\Users\\johan\\Desktop\\U\\10 Semestre\\AREP\\datos3.txt");
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        while (linea != null){
            double valor = Double.parseDouble(linea);
            lista.addNode(valor);
            linea = br.readLine();
        }
        Calculos programa = new Calculos(lista);
        System.out.println("El valor obtenido para el mean es: " + programa.mean());
        System.out.println("El valor obtenido par la deviation es: " + programa.deviation());
    }
}
