package pl.javastart.businesslogic;

import pl.javastart.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class PriceCalculator  {

    private List<Product> produkty = new ArrayList<>();
    private Double price=0.0;
    private Double mean;


    public PriceCalculator(List<Product> produkty) {
        this.produkty = produkty;
        for(Product p: produkty){
            price+=p.getCena();
        }
    }

    public double srednia(){
        return mean= Double.valueOf(Math.round(price*100/ produkty.size()))/100;
    }

    public List<Product> getProdukty() {
        return produkty;
    }

    public void setProdukty(List<Product> produkty) {
        this.produkty = produkty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getMean() {
        return mean;
    }

    public void setMean(Double mean) {
        this.mean = mean;
    }
}
