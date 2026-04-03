package Coding35Marks.Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Medicine {
    private String name, batch, disease;
    private int price;

    public Medicine(String name, String batch, String disease, int price) {
        this.name = name;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    // getters
    public String getName() {
        return this.name;
    }
    public String getBatch() {
        return this.batch;
    }
    public String getDisease() {
        return this.disease;
    }
    public int getPrice() {
        return this.price;
    }
}

public class Solution4 {
    private static Integer[] getPriceByDisease(Medicine[] medicines, String disease) {
        ArrayList<Integer> prices = new ArrayList<>();

        for (Medicine med: medicines) {
            if (med.getDisease().equalsIgnoreCase(disease)) {
                prices.add(med.getPrice());
            }
        }

        Integer[] pricesArr = prices.toArray(new Integer[0]);
        Arrays.sort(pricesArr);
        return pricesArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Medicine[] medicines = new Medicine[4];
        for (int i = 0; i < 4; i++) {
            String name = sc.next();
            String batch = sc.next();
            String disease = sc.next();
            int price = sc.nextInt();
            medicines[i] = new Medicine(name, batch, disease, price);
        }

        String disease = sc.next();
        sc.close();

        Integer[] prices = getPriceByDisease(medicines, disease);

        if (prices.length == 0) {
            System.out.println("No medicines found for the given disease");
        } else {
            for (int price : prices) {
                System.out.println(price);
            }
        }
    }
}
