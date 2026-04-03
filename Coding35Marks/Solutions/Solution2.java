package Coding35Marks.Solutions;

class Phone {
    private int id, price;
    private String os, brand;

    public Phone(int id, String os, String brand, int price) {
        this.id = id;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    // getters
    public int getId() {
        return this.id;
    }
    public String getOs() {
        return this.os;
    }
    public String getBrand() {
        return this.brand;
    }
    public int getPrice() {
        return this.price;
    }
}

public class Solution2 {
    private static int findPriceForGivenBrand(Phone[] phones, String brand) {
        int sum = 0;

        for (Phone phone: phones) {
            if (phone.getBrand().equalsIgnoreCase(brand)) {
                sum += phone.getPrice();
            }
        }

        return sum;
    }
    private static Phone getPhoneIdBasedOnOs(Phone[] phones, String os) {
        for (Phone phone: phones) {
            if (phone.getOs().equalsIgnoreCase(os) && phone.getPrice() >= 50000) {
                return phone;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        Phone[] phones = {
            new Phone(1, "Android", "Samsung", 45000),
            new Phone(2, "iOS", "Apple", 75000),
            new Phone(3, "Android", "OnePlus", 55000),
            new Phone(4, "iOS", "Apple", 90000)
        };

        // findPriceForGivenBrand: print total price if > 0, else print not-found message
        String brand = "Apple";
        int totalPrice = findPriceForGivenBrand(phones, brand);
        if (totalPrice > 0) {
            System.out.println(totalPrice);
        } else {
            System.out.println("The given Brand is not available");
        }

        // getPhoneIdBasedOnOs: print phoneId if found, else print not-found message
        String os = "Android";
        Phone result = getPhoneIdBasedOnOs(phones, os);
        if (result != null) {
            System.out.println(result.getId());
        } else {
            System.out.println("No phones are available with specified os and price range");
        }
    }
}
