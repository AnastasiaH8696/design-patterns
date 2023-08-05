import com.facade.example.UtilityFacade;

public class Main {
    public static void main(String[] args) {
        double sum = UtilityFacade.add(5.0, 10.0);
        System.out.println("Sum: " + sum);

        double product = UtilityFacade.multiply(3.0, 4.0);
        System.out.println("Product: " + product);

        double price = 100.0;
        double vat = UtilityFacade.calculateVAT(price);
        System.out.println("VAT: " + vat);

        double shekels = 250.0;
        double dollars = UtilityFacade.convertFromShekelsToDollar(shekels);
        System.out.println("Dollars: " + dollars);
    }
}
