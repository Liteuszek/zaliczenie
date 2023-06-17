package com.company.model;

/**
 * Reprezentuje produkt.
 */
public class Product {
    private String name;
    private double price;

    /**
     * Tworzy nowy produkt.
     *
     * @param name  nazwa produktu
     * @param price cena produktu
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Zwraca nazwę produktu.
     *
     * @return nazwa produktu
     */
    public String getName() {
        return name;
    }

    /**
     * Zwraca cenę produktu.
     *
     * @return cena produktu
     */
    public double getPrice() {
        return price;
    }
}
