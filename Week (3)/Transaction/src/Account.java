import java.util.ArrayList;

public class Account {
private double balance;
private ArrayList<Transaction> transitionList = new ArrayList<>();

/**
* comment.
*/
private void deposit(double amount) {
if (amount <= 0) {
System.out.print("So tien ban nap vao khong hop le!");
} else {
balance += amount;
}
}

/**
* comment.
*/
private void withdraw(double amount) {
if (amount <= 0) {
System.out.print("So tien ban rut ra khong hop le!");
} else if (amount > balance) {
System.out.print("So tien ban rut vuot qua so du!");
} else {
balance -= amount;
}
}

/**
* comment.
*/
public void addTransaction(double amount, String operation) {
if (operation.equals(Transaction.DEPOSIT)) {
deposit(amount);
transitionList.add(new Transaction(operation, amount, balance));
} else if (operation.equals(Transaction.WITHDRAW)) {
withdraw(amount);
transitionList.add(new Transaction(operation, amount, balance));
} else {
System.out.print("Yeu cau khong hop le!");
}
}

/**
* comment.
*/
public void printTransaction() {
for (int i = 0; i < transitionList.size(); i++) {
System.out.print("Giao dich " + (i + 1) + ": ");
if (transitionList.get(i).getOperation().equals(Transaction.DEPOSIT)) {
System.out.print("Nap tien");
} else {
System.out.print("Rut tien");
}
System.out.print(" $");
System.out.print(String.format("%.2f", transitionList.get(i).getAmount()));
System.out.print(". So du luc nay: $");
System.out.print(String.format("%.2f", transitionList.get(i).getBalance()));
System.out.print(".\n");
}
}

}
