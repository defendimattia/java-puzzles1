// 🟢Puzzle 2: Duplicati consecutivi 

// Descrizione:
// Verificare se un array contiene elementi consecutivi uguali.

// Firma metodo attesa:
// public static boolean haDuplicatiConsecutivi(int[]array)

package org.exercise.java.puzzles;

public class Puzzle2 {
    public static boolean haDuplicatiConsecutivi(int[] array) {

        boolean hasConsecutiveDuplicates = false;
        int prevNumber = array[0];

        for (int index = 1; index < array.length; index++) {
            if (array[index] == prevNumber) {
                hasConsecutiveDuplicates = true;
                break;
            } else {
                prevNumber = array[index];
            }
        }

        return hasConsecutiveDuplicates;
    }
}
