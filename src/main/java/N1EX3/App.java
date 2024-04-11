package N1EX3;


import N1EX3.Models.Article;
import N1EX3.Models.CoinConversion;
import N1EX3.Models.Exhibition;

public class App {

    private App(){}

    public static void runProgram() {
        CoinConversion coinConversion = new CoinConversion();
        Article article = new Article("EUR", "Shoes", 20);
        Exhibition exhibition = new Exhibition(coinConversion);

        int userOption;

        do {
            System.out.println("1. EUR");
            System.out.println("2. USD");
            System.out.println("3. GBP");
            System.out.println("0. Exit");
            userOption = Input.readInt("Select coin type you want to convert to");
            switch (userOption) {
                case 1:
                    exhibition.showConvertedPrice(article, "EUR");
                    break;
                case 2:
                    exhibition.showConvertedPrice(article, "USD");
                    break;
                case 3:
                    exhibition.showConvertedPrice(article, "GBP");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        } while(true);
    }
}