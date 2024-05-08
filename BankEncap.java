import java.util.Scanner;

class Account 
{
    private String accountHolderName;
    private String address;
    private String aadharNumber;
    private String panNumber;
    private int pin;
    private double balance;
    private String phoneNumber;

    public Account(String accountHolderName, String address, String aadharNumber, String panNumber, int pin, double balance, String phoneNumber) 
    {
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.aadharNumber = aadharNumber;
        this.panNumber = panNumber;
        this.pin = pin;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountHolderName() 
    {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) 
    {
        this.accountHolderName = accountHolderName;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAadharNumber() 
    {
        return aadharNumber;
    }

    public String getPanNumber() 
    {
        return panNumber;
    }

    public int getPin() 
    {
        return pin;
    }

    public void setPin(int pin) 
    {
        this.pin = pin;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println(" Deposit successful.") ;
        System.out.println("Now your new balance : " + balance);
    }

    public boolean withdraw(double amount) 
    {
        if (balance >= amount) 
        {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance: " + balance);
            return true;
        } 
        else 
        {
            System.out.println("Insufficient balance.");
            return false;
        }
    }
}

class Bank 
{
    private Account account;
    private Scanner sc;

    public Bank() 
    {
        sc = new Scanner(System.in);
	}

    public void createAccount() 
    {
        System.out.print(" Enter account holder name : ");
        String name = sc.nextLine();
        System.out.print(" Enter address:");
        String address = sc.nextLine();
        System.out.print(" Enter Aadhar number : ");
        String aadhar = sc.nextLine();
        System.out.print(" Enter PAN number : ");
        String pan = sc.nextLine();
        System.out.print(" Set PIN : ");
        int pin = sc.nextInt();
        sc.nextLine(); 
        System.out.print(" Enter phone number : ");
        String phone = sc.nextLine();
        System.out.print(" Enter initial deposit balance : ");
        double balance = sc.nextDouble();
        sc.nextLine();

        account = new Account(name, address, aadhar, pan, pin, balance, phone);
        System.out.println("Account Created successfully.");
    }

    public void existingUser() 
    {
        if (account == null) 
        {
            System.out.println("No account found. Please create account first.");
            return;
        }

        System.out.println("Enter PIN :");
        int pin = sc.nextInt();
        sc.nextLine();
        if (pin != account.getPin()) 
        {
            System.out.println("Incorrect PIN.");
            return;
        }

        while (true) 
        {
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Update account");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");
            System.out.print(" Select an option : ");
            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt) 
            {
                case 1:
                    System.out.println(" Your balance : " + account.getBalance());
                    break;
                case 2:
                    System.out.println("Enter amount to deposit : ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    if (account.withdraw(withdrawAmount)) 
                    {
                        System.out.println("Withdrawal successful.");
                    }
                    break;
                case 4:
                    updateAccount();
                    break;
                case 5:
                    displayAccount();
                    break;
                case 6:
                    System.out.println("Exiting user options.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private void updateAccount() 
    {
        while(true)
        {
        System.out.println("1. Update account holder name");
        System.out.println("2. Update address");
        System.out.println("3. Update PIN");
        System.out.println("4. Update phone number");
        System.out.println("5. Display Account Details");
        System.out.println("6. Exit");
        System.out.println("Select an option:");
        int opt = sc.nextInt();
        sc.nextLine(); 

        switch (opt) 
        {
            case 1:
                System.out.println("Enter new account holder name:");
                String newName = sc.nextLine();
                account.setAccountHolderName(newName);
                break;
            case 2:
                System.out.println("Enter new address:");
                String newAddress = sc.nextLine();
                account.setAddress(newAddress);
                break;
            case 3:
                System.out.println("Enter new PIN:");
                int newPin = sc.nextInt();
                account.setPin(newPin);
                break;
            case 4:
                System.out.println("Enter new phone number:");
                String newPhone = sc.nextLine();
                account.setPhoneNumber(newPhone);
                break;
            case 5:
                System.out.println("Account Details");
                displayAccount();
                break;
            case 6:
                System.out.println("Exit");
                return;
            default:
                System.out.println("Invalid option.");
        }
    }
	}

    public void displayAccount()
    {
        System.out.println("** Accound Detals *** ");
        System.out.println();
        System.out.println("Accound Holder Name : "+account.getAccountHolderName());
        System.out.println("Address : " +account.getAddress());
        System.out.println("Addhar Number : "+account.getAddress());
        System.out.println("Pan Number : "+account.getPanNumber());
        System.out.println("Phone Number : "+account.getPhoneNumber());
        System.out.println("Balance : "+account.getBalance());
    }
}

public class BankEncap 
{
    public static void main(String[] args) 
    {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while (true) 
        {
        	System.out.println();
        	System.out.println(" *** WELCOME TO SS BANK ***");
            System.out.println(" 1. Create account");
            System.out.println(" 2. Existing user");
            System.out.println(" 3. Exit");
            System.out.print(" Select an option : ");
            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt) 
            {
                case 1:
                    bank.createAccount();
                    break;
                case 2:
                    bank.existingUser();
                    break;
                case 3:
                    System.out.println("Application Closed.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
                    System.exit(0);
            }
        }
    }
}