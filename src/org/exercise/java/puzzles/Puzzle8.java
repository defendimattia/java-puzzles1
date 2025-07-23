// ### 🟠 Puzzle 8: Conta vocali

// Descrizione:  
// Contare il numero di vocali (a, e, i, o, u, sia minuscole che maiuscole) presenti in una stringa.

// Firma metodo attesa:  
// public static int contaVocali(String testo)

package org.exercise.java.puzzles;

public class Puzzle8 {
    public static int contaVocali(String testo) {

        int counter = 0;
        char[] tinyStringArray = testo.toLowerCase().toCharArray();

        for (char c : tinyStringArray) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
            }
        }
        return counter;
    }
}