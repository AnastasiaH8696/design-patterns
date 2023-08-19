import com.template.example.GreekPizza;
import com.template.example.MargarittaPizza;
import com.template.example.MushroomBlancoPizza;
import com.template.example.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza greekPizza = new GreekPizza();
        greekPizza.printRecipe();

        Pizza margarittaPizza = new MargarittaPizza();
        margarittaPizza.printRecipe();

        Pizza mushroomPizza = new MushroomBlancoPizza();
        mushroomPizza.printRecipe();
    }
}