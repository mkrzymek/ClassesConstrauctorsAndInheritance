package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        Car2 porsche = new Car2();
        Car2 holden = new Car2();

        porsche.setModel("911");
        System.out.println(porsche.getModel());

//        bankAccount();
//        vipCustomer();
//        inheritance();
        inheritanceChallenge();
    }

    public static void bankAccount() {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        Account bobsAccount = new Account(); // "12345", 0.00, "Bob Brown", "myemail@bob.com",
        // "(087) 123-4567");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(1.0);
        bobsAccount.withdrawal(100.0);

        Account timsAccount = new Account("tim", "tim@wp.pl", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
    }

    public static void vipCustomer() {
        VipCustomer michal = new VipCustomer();
        System.out.println("name: " + michal.getName() + ", limit: " + michal.getCreditLimit() + ", email: " + michal.getEmail());
        VipCustomer emil = new VipCustomer("Emil", "emil@wp.pl");
        System.out.println("name: " + emil.getName() + ", limit: " + emil.getCreditLimit() + ", email: " + emil.getEmail());
        VipCustomer janek = new VipCustomer("Janek", 3000, "janek@wp.pl");
        System.out.println("name: " + janek.getName() + ", limit: " + janek.getCreditLimit() + ", email: " + janek.getEmail());
    }

    public static void inheritance() { // dziedziczenie

        Animal animal = new Animal("animal", 1, 1, 5, 5);

        Dog dog = new Dog("yorkie", 8 ,20 , 2, 4, 1, 22, "long silky");
//        dog.eat();
        dog.walk();
//        dog.run();
    }

    public static void inheritanceChallenge() {
        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}
