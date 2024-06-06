package org.webapp.webapp;

import org.webapp.models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "productServlet", value = "/product-servlet")
public class ProductServlet extends HttpServlet {

    List<Product> productsList = new ArrayList<>();

    public void init() {
        Product product = new Product("1","Butter","5.50");
        productsList.add(product);
        product = new Product("2","Meat","11.50");
        productsList.add(product);
        product = new Product("3", "Ice cream","8.70");
        productsList.add(product);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<table>");
        out.println("<tr>");
        out.println("<th>Id</th>");
        out.println("<th>Name</th>");
        out.println("<th>Price</th>");
        out.println("</tr>");

        for(Product product : productsList) {
            out.println("<tr>");
            out.println("<td>" + product.getId() + "</td>");
            out.println("<td>" + product.getName() + "</td>");
            out.println("<td>" + product.getPrice() + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        productsList.add(
                new Product(
                        request.getParameter("productId"),
                        request.getParameter("productName"),
                        request.getParameter("productPrice")
                )
        );
    }

    public void destroy() {
    }
}