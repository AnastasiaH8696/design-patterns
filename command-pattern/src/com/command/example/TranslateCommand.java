package com.command.example;

//Command implementation
public class TranslateCommand implements Command {
    private final MorseTranslator morseTranslator;
    private final String word;

    public TranslateCommand(MorseTranslator morseTranslator, String word) {
        this.morseTranslator = morseTranslator;
        this.word = word;
    }

    @Override
    public void execute() {
        morseTranslator.translate(word);
    }
}
