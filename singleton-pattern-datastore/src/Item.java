public class Item {
    private String productName;
    private int price;
    private String condition;

    public Item(String productName, int price, String condition) {
        this.productName = productName;
        this.price = price;
        this.condition = condition;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public String getCondition() {
        return condition;
    }
}
