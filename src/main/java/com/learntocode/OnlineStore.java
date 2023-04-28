package com.learntocode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        Collections.sort(inventory, Comparator.comparing(Product::getId));

        for (Product product : inventory){
            System.out.println(product);
        }
        Scanner input = new Scanner(System.in);
        int command = 0;

        while(command != 3) {
            System.out.println("What would you like to do?");
            System.out.println("1. Show products");
            System.out.println("2. Show cart");
            System.out.println("3. Exit - Closes out the application");

            System.out.print("Enter Command: ");
            command = input.nextInt();

            switch  (command) {
                case 1:
                    listAllProducts(inventory);
                    break;
                case 2:

                case 3: return;
                default:
                    System.out.println("Invalid Input");


            }
        }


    }
    private static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader("inventory.csv"));
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                inventory.add(new Product(id, name, price));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inventory;
    }
    private static void listAllProducts(ArrayList<Product> inventory) {
        for (Product product : inventory) {
            System.out.println(product);
        }


        }
}

