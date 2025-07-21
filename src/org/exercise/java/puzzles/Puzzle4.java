// ###🟡Puzzle 4:Prima lettera non ripetuta

// **Descrizione:
// Restituire la prima lettera in una stringa che non si ripete.

// Firma metodo attesa:
// public static Character primaNonRipetuta(String input)

package org.exercise.java.puzzles;

public class Puzzle4 {
    public static Character primaNonRipetuta(String input) {

        char[] charArray = input.toCharArray();

        for (char character : charArray) {

            int counter = 0;
            
            for (int i = 0; i < charArray.length; i++) {
                if (character == charArray[i])
                    counter++;
            }

            if (counter == 1) {
                return character;
            } else {
                counter = 0;
            }

        }

        return null;
    }
}
