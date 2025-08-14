import java.util.Scanner;

class Account {
    String Account_number;
    double Account_balance;

    public Account(String account_number, double account_balance) {
        Account_number = account_number;
        Account_balance = account_balance;
    }

    void deposit(int amount) {
        if (amount > 0) {
            Account_balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    void withdraw(int amount) {
        if (amount > 0 && Account_balance >= amount) {
            Account_balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Withdrawal failed due to insufficient balance or invalid amount.");
        }
    }

    void display_bal() {
        System.out.println("Account Number= " + Account_number + "\nAccount Balance= " + Account_balance);
    }
}

class Savings_Account extends Account {
    final double interest;

    public Savings_Account(String account_number, double account_balance, double rate_of_int) {
        super(account_number, account_balance);
        interest = rate_of_int;
    }

    @Override
    void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (Account_balance - 1000 >= amount) {
            Account_balance -= amount;
            System.out.println("Balance withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed. Minimum balance of 1000 must be maintained.");
        }
        display_bal();
    }

    void interest() {
        double interest_amount = (interest / 100) * Account_balance;
        System.out.println("Interest: " + interest_amount);
        Account_balance += interest_amount;
        display_bal();
    }
}

class Current_Account extends Account {
    double overdraftLimit;

    public Current_Account(String account_number, double account_balance, double overdraftLimit) {
        super(account_number, account_balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > Account_balance + overdraftLimit) {
            System.out.println("Can't withdraw money, amount is out of limit.");
            System.out.println("You can withdraw up to: " + (Account_balance + overdraftLimit) + " amount of money.");
        } else {
            Account_balance -= amount;
            System.out.println("Money withdrawn successfully.");
            display_bal();
        }
    }
}

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Account_number = "";
        double Account_balance = 0;
        Savings_Account sav = null;
        Current_Account cur = null;

        System.out.println("Types of Account\n1. Savings Account\n2. Current Account");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice > 0 && choice < 3) {
            System.out.print("Enter Account number: ");
            Account_number = sc.next() + sc.nextLine();
            System.out.print("Enter Account balance: ");
            Account_balance = sc.nextDouble();
        } else {
            System.out.println("Invalid choice. Exiting.");
            sc.close();
            System.exit(0);
        }

        switch (choice) {
            case 1:
                System.out.print("Enter rate of interest for savings account (%): ");
                double roi = sc.nextDouble();
                sav = new Savings_Account(Account_number, Account_balance, roi);
                break;
            case 2:
                System.out.print("Enter overdraft limit: ");
                double overDraft = sc.nextDouble();
                cur = new Current_Account(Account_number, Account_balance, overDraft);
                break;
            default:
                System.out.println("Exiting..");
                sc.close();
                System.exit(0);
        }

        while (true) {
            System.out.println("\nMENU"
                    + "\n1. DEPOSIT"
                    + "\n2. WITHDRAW"
                    + "\n3. DISPLAY BALANCE"
                    + "\n4. INTEREST FOR SAVINGS"
                    + "\n5. EXIT"
                    + "\nENTER YOUR CHOICE:");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter amount for deposit: ");
                    int amt = sc.nextInt();
                    if (choice == 1 && sav != null) {
                        sav.deposit(amt);
                    } else if (choice == 2 && cur != null) {
                        cur.deposit(amt);
                    } else {
                        System.out.println("Invalid operation.");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount for withdrawal: ");
                    int am = sc.nextInt();
                    if (choice == 1 && sav != null) {
                        sav.withdraw(am);
                    } else if (choice == 2 && cur != null) {
                        cur.withdraw(am);
                    } else {
                        System.out.println("Invalid operation.");
                    }
                    break;
                case 3:
                    if (choice == 1 && sav != null) {
                        sav.display_bal();
                    } else if (choice == 2 && cur != null) {
                        cur.display_bal();
                    } else {
                        System.out.println("Invalid operation.");
                    }
                    break;
                case 4:
                    if (choice == 1 && sav != null) {
                        sav.interest();
                    } else {
                        System.out.println("Interest calculation is available only for Savings Account.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
