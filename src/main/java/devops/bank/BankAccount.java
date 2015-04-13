package devops.bank;
 
public class BankAccount {
 
private double balance;
 
public BankAccount(double balance) {
this.balance = balance;
}
 
public double debit(double amount) {
if (balance < amount) {
amount = balance;
System.out.println("This is the main class, changed just now for github2");
}
 
balance -= amount;
return amount;
}
 
} 