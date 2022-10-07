import java.util.*;
public class ilk_deneme {



    public static void main(String[] args) {

        int savings = 1435;
        int chequing = 356;
        System.out.println("Welcome to Ekinci Bank! Please enter your password to continue");
        Scanner scanone = new Scanner(System.in);
        String password = scanone.nextLine();
        int sifre=534534;
        if (sifre==534534) {
            System.out.println("Welcome Ali, What would you like to do today");
        }
        else {
            System.out.println("Entered wrong password");
        }



String transactions [] = {"0)Withdraw", "1)Deposit", "2)Check Balance","3)Transfer"};
        System.out.println("Enter a number to continue");
        System.out.println(transactions[0]);
        System.out.println(transactions[1]);
        System.out.println(transactions[2]);
        System.out.println(transactions[3]);


        Scanner scan = new Scanner(System.in);
        String account = scan.nextLine();
        System.out.println("Please chose an account to continue");
        System.out.println("Press 0 for Chequinng or 1 for Savings account");

        String accounts [] = {"0)Checking","1)Savings"};
        System.out.println(accounts[0]);
        System.out.println(accounts[1]);

        Scanner hesap = new Scanner(System.in);
        String hesapbir = hesap.nextLine();

        System.out.println("Please enter the amount that you would like to deposit");

        Scanner amount = new Scanner(System.in);
        int money = amount.nextInt();
        System.out.println("You have deposited "+money + ("$ and your current balance is "+(chequing+money)+("$")));
        System.out.println("Would you like to do anything else?");

        }
    }
