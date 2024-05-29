package exceptions;

public class Account {
    double amount;
    
    public void deposite(double amount){
        // return amount;
        if(amount <= 0) {
            throw new IllegalArgumentException("Deposite amount cannot be less than 0");
        }
        System.out.println(amount);
    }
}
