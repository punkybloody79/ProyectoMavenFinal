package es.vedruna;

public class Longitud {

    public static int getWordLength(String word){
        if (validador(word)) {
            return word.length();
        }
        // Si la palabra no pasa el validador devuelve 0
        return 0;
    }


    public static boolean validador(String word) {
        if (word== null) {
            return false; // Manejo de caso nulo
        }
        return true;


    }
}
