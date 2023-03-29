package coe318.lab4;

public class Account {

    private String accName;
    private int accNum;
    private double accBal;

    public Account(String accName, int accNum, double initialBalance){
        this.accName = accName;
        this.accNum = accNum;
        accBal = initialBalance;
    }

    public String getName() {
        return this.accName;
    }

    public int getNumber() {
        return this.accNum;
    }

    public double getBalance() {
        return this.accBal;
    }

    public boolean deposit(double amount){
        if(amount <=0) {
            return false;
        }else {
            this.accBal = amount + this.accBal;
            return true;
        }
    }

    public boolean withdraw(double amount){
        if(amount <= 0 || amount > accBal)
            return false;
        else{
            this.accBal -= amount;
            return true;
        }
    }


    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
                String.format("$%.2f", getBalance()) + ")";
    }
}
