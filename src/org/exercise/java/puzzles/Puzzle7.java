// 🔴Puzzle 7:Numeri mancanti

// Descrizione:
// Dato un array di numeri interi e un valore massimo max,restituire la lista dei numeri mancanti da 1 a max.

// Firma metodo attesa:
// public static List<Integer>numeriMancanti(int[]array,int max)

package org.exercise.java.puzzles;

import java.util.ArrayList;
import java.util.List;

public class Puzzle7 {
    public static List<Integer> numeriMancanti(int[] array, int max) {

        List<Integer> missingNumbers = new ArrayList<>();

        for (int i = 1; i <= max; i++) {
            missingNumbers.add(i);
        }

        for (int n = 0; n < array.length; n++) {
            if (missingNumbers.contains(array[n])) {
                int index = missingNumbers.indexOf(array[n]);
                missingNumbers.remove(index);
            }
        }
        return missingNumbers;
    }
}
