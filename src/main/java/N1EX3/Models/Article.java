package N1EX3.Models;

public class Article {

    private String coinType;

    private String name;

    private double price;

    public Article(String coinType, String name, double price) {
        this.coinType = coinType;
        this.name = name;
        this.price = price;
    }

    public String getCoinType() {
        return coinType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
