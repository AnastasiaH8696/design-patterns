package com.command.example;

//The implementation of this translator inspired by the GFG solution
public class MorseTranslator {
    // Morse code by indexing
    private final String[] code
            = { ".-",   "-...", "-.-.", "-..",  ".",
            "..-.", "--.",  "....", "..",   ".---",
            "-.-",  ".-..", "--",   "-.",   "---",
            ".--.", "--.-", ".-.",  "...",  "-",
            "..-",  "...-", ".--",  "-..-", "-.--",
            "--..", "|" };

    public void translate(String word)
    {
        for (int i = 0; i < word.length(); i++) {
            System.out.print(
                    code[word.charAt(i) - 'a'] + " ");
        }
        System.out.println();
    }
}
