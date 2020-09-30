package Lab7;

public class Sofa extends Furniture{
    private double nozhki;

    public Sofa(String material, String size, String color, double price, String manufacturer, double nozhki) {
        super(material, size, color, price, manufacturer);
        this.nozhki = nozhki;
    }

    public double getNozhki() {
        return nozhki;
    }

    public void setNozhki(double nozhki) {
        this.nozhki = nozhki;
    }

    @Override
    public String getMaterial() {
        return super.getMaterial();
    }

    @Override
    public void setMaterial(String material) {
        super.setMaterial(material);
    }

    @Override
    public String getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(String size) {
        super.setSize(size);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String getManufacturer() {
        return super.getManufacturer();
    }

    @Override
    public void setManufacturer(String manufacturer) {
        super.setManufacturer(manufacturer);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
