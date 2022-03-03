package examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {

    /**
     * Pre: ---
     * Post: En el main pedimos al usuario por parametro la longitud que queremos que superen las palabras a buscar
     *       y tambien le damos la ruta en la que se encuentra nuestro fichero.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String fichero = "C:/Users/elisa/OneDrive/Escritorio/textoExamen.txt";
        System.out.println("Longitud de busqueda de la palabra: ");
        int longitud = entrada.nextInt();
        palabrasMasLargasQue(fichero,longitud);
    }

    /**
     *
     *
     *
     */
    public static void palabrasMasLargasQue(String fichero,int longitud){
        File file = new File(fichero);
        try {
            Scanner f = new Scanner(file);
            int contador = longitud;

            while (f.hasNextLine()){
                String linea=f.nextLine();
                String palabra=f.next();
                palabra=palabra.replaceAll(","," ").replaceAll("."," ").replaceAll
                                      (":"," ").replaceAll("\"\"","");
                String[] lineasep = linea.split(" ");
                for (int i = 0; i<lineasep.length;i++){
                    if (palabra.length() > contador){
                        System.out.println(palabra);
                    }
                }
            }
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
