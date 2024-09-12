package lavisores;

public class Product {
    int productId;
    String productName;
    double productPrice;
    int stockQty;
    int soldQty;

    public void setProduct(int id, String name, double price, int stocks, int sold) {
        this.productId = id;
        this.productName = name;
        this.productPrice = price;
        this.stockQty = stocks;
        this.soldQty = sold;
    }

    public double calculateProfit() {
        return productPrice * soldQty;
    }

    public double calculateTotalValue() {
        return productPrice * stockQty;
    }

    public void viewProduct() {
        double profit = calculateProfit();
        double totalValue = calculateTotalValue();
        String availability = (stockQty > 0) ? "Available" : "Out-of-Stocks";

        System.out.println("ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + productPrice);
        System.out.println("Stocks: " + stockQty);
        System.out.println("Sold: " + soldQty);
        System.out.printf("Profit: %.2f%n", profit);
        System.out.printf("Total Estimated Value: %.2f%n", totalValue);
        System.out.println("Status: " + availability);
    }
}
