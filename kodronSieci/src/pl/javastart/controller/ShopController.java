package pl.javastart.controller;

import pl.javastart.businesslogic.PriceCalculator;
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

@WebServlet( "/sklep")
public class ShopController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Product> produkty = new ArrayList<>();

        System.out.println("Request to /sklep received ");
        request.setCharacterEncoding("UTF-8");
        String firstPrice=request.getParameter("firstPrice");
        String firstName=request.getParameter("firstName");
        String secondPrice=request.getParameter("secondPrice");
        String secondName=request.getParameter("secondName");
        String thirdPrice=request.getParameter("thirdPrice");
        String thirdName=request.getParameter("thirdName");
        String fourthPrice=request.getParameter("fourthPrice");
        String fourthName=request.getParameter("fourthName");


        try {
            produkty.add(new Product(firstName, Double.parseDouble(firstPrice)));
            produkty.add(new Product(secondName, Double.parseDouble(secondPrice)));
            produkty.add(new Product(thirdName, Double.parseDouble(thirdPrice)));
            produkty.add(new Product(fourthName, Double.parseDouble(fourthPrice)));
            PriceCalculator priceCalculator = new PriceCalculator(produkty);
            request.setAttribute("cena",priceCalculator.getPrice());
            request.setAttribute("srednia",priceCalculator.srednia());
            request.setAttribute("produkty",produkty);
            request.getRequestDispatcher("summary.jsp").forward(request,response);
        }catch (NumberFormatException e){
            request.getRequestDispatcher("empty.jsp").forward(request,response);
        }




    }

}
