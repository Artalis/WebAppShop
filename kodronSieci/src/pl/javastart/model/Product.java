package pl.javastart.model;


public class Product {

    private String name;
    private double cena;

    public Product(String name, double cena) {
        this.name = name;
        this.cena = cena;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
