package examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Pre: ---
 * Post: Implementa un método informacionVideojuegos() que devuelve un ArrayList<String> que
 *       agrupe todas las plataformas para las que hay videojuegos en el fichero entregado. Es
 *       decir, se debe almacenar UNA SOLA VEZ, cada una de las plataformas que aparecen en
 *       el fichero .csv.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String fichero = "C:/Users/elisa/OneDrive/Escritorio/ventasVideojuegos.csv";
        informacionVideojuegos(fichero);
    }

    public static void informacionVideojuegos(String fichero) {
        ArrayList<String> consolas = new ArrayList<String>();
        File file = new File(fichero);
        boolean linea1 = true;
        try {
            Scanner f = new Scanner(file);
            int consolasdistintas = 0;
            while (f.hasNextLine()) {
                String linea = f.nextLine();
                if (linea1) {
                    linea1 = false;
                } else {
                    String[] lineaSep = linea.split(",");
                    for (int i = 0;i<lineaSep.length;i++){
                        if (lineaSep[2].contentEquals(lineaSep[2])){
                            consolas.add(lineaSep[2]);
                        }
                    }
                    System.out.println(consolas);
                }
            }
        }catch(FileNotFoundException e) {
            System.out.println(e);
        }
    }
}