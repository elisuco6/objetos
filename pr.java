package Ejercicio3;

import java.util.Random;

public class pr {
        public static void main(String args[]){
            char n;
            Random rnd = new Random();
            String cadena = new String();
            for (int i=0; i < 10 ; i++) {
                n = (char)(rnd.nextDouble() * 26.0 + 65.0 );
                cadena += n; }
            System.out.println(cadena);
        }
    }

