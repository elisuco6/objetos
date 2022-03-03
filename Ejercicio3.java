package examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Pre: ---
 * Post: Implementa un método informacionVideojuegos() que devuelve un ArrayList<String> que
 * agrupe todas las plataformas para las que hay videojuegos en el fichero entregado. Es
 * decir, se debe almacenar UNA SOLA VEZ, cada una de las plataformas que aparecen en
 * el fichero .csv.
 */
public class Ejercicio3 {

    /**
     * Pre: ---
     * Post: En el main pasamos por parametro la ruta del fichero y llamamos al metodo informacion
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String fichero = "C:/Users/elisa/OneDrive/Escritorio/ventasVideojuegos.csv";
        informacionVideojuegos(fichero);
    }

    /**
     * Pre: ---
     * Post: creamos un array donde se va guardar el 2 split empezando por 0 es decir el nombre de la consola
     * posteriormente
     */
    public static void informacionVideojuegos(String fichero) {
        ArrayList<String> consolas = new ArrayList<String>();
        File file = new File(fichero);
        boolean linea1 = true;
        try {
            Scanner f = new Scanner(file);

            /*
             * Debemos recorrer las lineas del csv saltandonos la del indice se puede hacer
             * con un boolean como se
             */
            while (f.hasNextLine()) {
                String linea = f.nextLine();
                if (linea1) {
                    linea1 = false;
                } else {
                    String[] lineaSep = linea.split(",");
                    consolas.add(lineaSep[2]);
                }
            }System.out.println(consolas);
        } catch (
                FileNotFoundException e) {
            System.out.println(e);
        }
    }
}