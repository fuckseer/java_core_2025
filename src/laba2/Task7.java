package laba2;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements BankAccount {
    private double balance;

    public SavingsAccount() {
        this.balance = 0.0;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Пополнение на %.2f. Текущий баланс: %.2f%n", amount, balance);
        } else {
            System.out.println("Сумма пополнения должна быть положительной.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Снятие %.2f. Текущий баланс: %.2f%n", amount, balance);
        } else {
            System.out.println("Недостаточно средств для снятия или сумма снятия неправильная");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

public class Task7 {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();

        account.deposit(1000.0);
        account.withdraw(250.0);
        System.out.printf("Текущий баланс на счете: %.2f%n", account.getBalance());
        account.withdraw(800.0);
    }
}
