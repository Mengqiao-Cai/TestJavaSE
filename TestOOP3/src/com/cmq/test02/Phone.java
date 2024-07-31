package com.cmq.test02;

import java.util.Objects;

/**
 * @author: cmq
 * @date: 7/24/2024 - 07 - 24 - 4:15 PM
 * @version: 1.0
 */
public class Phone {
    private String brand;
    private double price;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Phone() {
    }

    public Phone(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
/*    public boolean equals(Object obj) {
        //if a is an object instance of b
        if (!(obj instanceof Phone)) {
            return false;
        }
        //turn obj into phone type
        Phone other = (Phone) obj;  
        //return this.getBrand()==other.getBrand() && this.getPrice() == other.getPrice() && this.getYear() == other.getYear();
        return this.getBrand().equals(other.getBrand()) && this.getPrice() == other.getPrice() && this.getYear() == other.getYear();
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(price, phone.price) == 0 && year == phone.year && Objects.equals(brand, phone.brand);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, price, year);
    }
}
