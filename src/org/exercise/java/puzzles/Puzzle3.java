// 🟡Puzzle 3:Anagrammi

// Descrizione:
// Controllare se due stringhe sono anagrammi,ovvero contengono gli stessi caratteri con la stessa frequenza,indipendentemente dall’ordine.

// Firma metodo attesa:
// public static boolean sonoAnagrammi(String a,String b)

package org.exercise.java.puzzles;

public class Puzzle3 {
    public static boolean sonoAnagrammi(String a, String b) {

        if (a.length() == b.length()) {

            char[] arrayA = a.toCharArray();

            for (char character : arrayA) {
                if (!b.contains(character + "")) {
                    return false;
                }

            }
            return true;
        }
        return false;
    }

}
