import com.strategy.example.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("USA", 331002651, 9833520, 21433225));
        countries.add(new Country("India", 1380004385, 3287263, 2875148));

        Context context = new Context(new AreaComperator());
        System.out.println("USA - India comparing area: " + context.executeStrategy(countries.get(0), countries.get(1)));

        context = new Context(new GDPComparator());
        System.out.println("USA - India comparing GDP: " + context.executeStrategy(countries.get(0), countries.get(1)));

        context = new Context(new PopulationComparator());
        System.out.println("USA - India comparing population: " + context.executeStrategy(countries.get(0), countries.get(1)));
    }
}