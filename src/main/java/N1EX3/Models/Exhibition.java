package N1EX3.Models;

public class Exhibition {

    private CoinConversion coinConversion;

    public Exhibition(CoinConversion coinConversion) {
        this.coinConversion = coinConversion;
    }

    public void showConvertedPrice(Article article, String coinToConvert) {
        double coinConvertedValue = coinConversion.convertCoin(article.getPrice(), article.getCoinType(), coinToConvert);
        System.out.println("The price of the article " + article.getName() + " is: " + coinConvertedValue + " in " + coinToConvert);
    }

}
