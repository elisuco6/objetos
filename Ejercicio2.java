package examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Pre: ---
 * Post: Dado el fichero “textoExamen.txt”, implementa un método
 *       palabrasMasLargasQue(int longitud) el cual devuelve un entero indicando el número de
 *       palabras del texto cuya longitud es mayor o igual que [longitud].
 */
public class Ejercicio2 {

    /**
     * Pre: ---
     * Post: En el main pedimos al usuario por parametro la longitud que queremos que superen las palabras a buscar
     * y tambien le damos la ruta en la que se encuentra nuestro fichero.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String fichero = "C:/Users/elisa/OneDrive/Escritorio/textoExamen.txt";
        System.out.println("Longitud de busqueda de la palabra: ");
        int longitud = entrada.nextInt();
        palabrasMasLargasQue(fichero, longitud);
    }

    /**
     * Pre: ---
     * Post: En este metodo vamos a contar la longitud de las palabras y por ende a compararla con
     * la variable pasada por parametro si coincide mostrara la palabra si no continuara.
     */
    public static void palabrasMasLargasQue(String fichero, int longitud) {
        File file = new File(fichero);
        try {
            Scanner f = new Scanner(file);

            // generamos los contadores y asignamos a la varible distancia el parametro del usuario
            int distancia = longitud;
            int contador = 0;

            /*
             * Arrancamos un bucle que avanza de palabra en palabra en este caso, dentro generamos la variable
             * palabra encargada de detectar la siguiente posteriormente remplazamos puntos y espacios del texto
             * inecesarios por comas para posteriormente splitear.
             */
            while (f.hasNext()) {
                String palabra = f.next();
                palabra = palabra.replaceAll(" ", ",").replaceAll("\\.", "");

                // creamos esta tabla con lo que hay entre los split es decir las palabras
                String[] lineasep = palabra.split(",");

                //en el bucle for recorremos la tabla y dentro del bucle mediante una condicion comparamos lo que ocupa
                for (int i = 0; i < lineasep.length; i++) {
                    if (lineasep[i].length() > distancia) {
                        contador++;
                    }
                }
            } System.out.println("Hay " + contador + " palabras con mas de " + distancia + " letras.");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}