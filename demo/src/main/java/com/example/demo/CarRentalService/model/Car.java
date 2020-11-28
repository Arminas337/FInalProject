package com.example.demo.CarRentalService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private  Integer price;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}

    public Integer getPrice(){return price;}

    public void setPrice(Integer price) {this.price = price;}

    public void saveToFile() throws IOException {
        PrintWriter outFile = new PrintWriter(new FileOutputStream(new File("Cars_Inventory.txt"), true));
			outFile.println(getCar() + " " + getCarPrice());
			outFile.close();
    }

    @org.jetbrains.annotations.Contract(pure = true)
    public Object getCarPrice() {
        return "Car";
    }

    public boolean getCar() {
        return false;
    }


    public void setCar(String carType, String carModel, double carPrice) {
        return;
    }
}
