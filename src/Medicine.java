public class Medicine {

    public double price;
    public String name;
    public String expirationDate;

    public Medicine(double price, String name, String expirationDate) {
        this.price = price;
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public Medicine() {
        this.price = 34.99;
        this.name = "Nurofen";
        this.expirationDate = "31.08.2024";
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpiration_date(String expirationDate {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", expiration_date=" + expirationDate +
                '}';
    }
}
