package _gui.entity;

public class Product {
    private String productNum;

    private String getProductName;

    private int stickNum;

    private int unitPrice;

    private String manufacturer;

    public String getProductName() {
        return productNum;
    }

    public String getGetProductName() {
        return getProductName;
    }

    public void setGetProductName(String getProductName) {
        this.getProductName = getProductName;
    }

    public int getStickNum() {
        return stickNum;
    }

    public void setStickNum(int stickNum) {
        this.stickNum = stickNum;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
