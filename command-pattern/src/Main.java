import com.command.example.MorseTranslator;
import com.command.example.TranslateCommand;
import com.command.example.Translator;

public class Main {
    public static void main(String[] args) {
        MorseTranslator morseTranslator = new MorseTranslator();
        TranslateCommand translateCommandFirst = new TranslateCommand(morseTranslator, "alice");
        TranslateCommand translateCommandSecond = new TranslateCommand(morseTranslator, "test");
        Translator translator = new Translator();
        translator.addCommand(translateCommandFirst);
        translator.addCommand(translateCommandSecond);
        translator.executeCommands();
    }
}