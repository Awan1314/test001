package org;

public class Test {
    public static void main(String[] args) {
        Customer c = new Customer(101,2000,1.45);
        User user = new User("李白",c);
        user.getCustomer().withdrow(100);
        user.getCustomer().deposit(960);
        user.getCustomer().deposit(2000);

    }
}
class User{
    private String name;
    private Customer customer;

    public User() {
    }

    public User(String name, Customer customer) {
        this.name = name;
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

class Customer{
    private int id;
    private double balance;
    private double annualInterestRate;

    public Customer() {
    }

    public Customer(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdrow(int money){
        this.setBalance(this.getBalance() + money);
        System.out.println(this.getId()+"存" + money + "余额为：" + this.getBalance());

    }

    public void deposit(int money){
        if (money > this.getBalance()) {
            System.out.println("余额不足！");
            return;
        }
        this.setBalance(this.getBalance() - money);
        System.out.println(this.getId()+"取" + money + "余额为：" + this.getBalance());
    }
}