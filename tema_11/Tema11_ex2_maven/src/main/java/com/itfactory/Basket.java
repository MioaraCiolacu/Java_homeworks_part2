package com.itfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Basket {
    List<Product> listaCumparaturi = new ArrayList<Product>();

    public void addProduct(Product produs) {
        listaCumparaturi.add(produs);
    }


    // metoda care  calculeaza costul total al produselor din cos
    public double getTotal() {
        double total = 0;
        for (Product produs : listaCumparaturi) {
            total += produs.getPret() * produs.getCantitate();
        }
        return total;
    }

    //// metoda care  calculeaza costul total al fiecarui tip de produs separat
    public double calculeazaCostTip(TYPE type) {
        double costPeElemente = 0.0;
        for (Product product : listaCumparaturi) {
            if (product.getType() == type) {
                costPeElemente += product.getPret() * product.getCantitate();
            }
        }
        return costPeElemente;
    }


    //metoda ce returneaza lista intreaga de produse.
    public List<Product> getProducts() {
        return listaCumparaturi;
    }


    //metoda ce returneaza listele de produse separat, in functie de tipul lor
    public List<Product> produseSeparate(TYPE type) {
        List<Product> productsByType = new ArrayList<Product>();
        for (Product product : listaCumparaturi) {
            if (product.getType() == type) {
                productsByType.add(product);
            }
        }
        return productsByType;
    }


}
