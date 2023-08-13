package com.proxy.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SoldierProxy implements ISoldier {
    private final String idNumber;

    public SoldierProxy(String idNumber) {
        this.idNumber = idNumber;
    }

    private Soldier loadSoldier() {
        try {
            File file = new File("proxy-pattern/resources/" + idNumber + ".csv");
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = reader.readLine();
                String[] data = line.split(",");
                reader.close();
                return new Soldier(data[0], data[1], data[2], Double.parseDouble(data[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void printDetails() {
        Soldier soldier = loadSoldier();
        if (soldier != null) {
            soldier.printDetails();
        } else {
            System.out.println("Soldier with ID " + idNumber + " not found.");
        }
    }
}
