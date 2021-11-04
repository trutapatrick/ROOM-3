import entity.account.AccountRepository;
import entity.transaction.Transaction;
import entity.transaction.TransactionRepository;
import entity.user.User;
import entity.user.UserRepository;
import util.HibernateUtil;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();

        System.out.println("\n\t\t\t\t\tMENU");
        System.out.println("1.Log in");
        System.out.println("2.SignUp");
        System.out.println("3.Exit");

          System.out.println("Introduceti username");
           String username = sc.nextLine();

        UserRepository userRepository = new UserRepository();

        int option = sc.nextInt();

        switch (option) {
            case 1:
                User userByUsername = userRepository.findUsername(username);
                if (userByUsername != null) {
                    System.out.println("a.Show accounts");
                    AccountRepository accountRepository = new AccountRepository();
                    System.out.println(accountRepository.getAccounts());
                    System.out.println("b.Make transaction");
                    AccountRepository accountRepository1 = new AccountRepository();

                    String IBAN =  accountRepository1.findIbanByCodCl(userByUsername.getCodClient());
                    TransactionRepository transactionRepository = new TransactionRepository();
                    Transaction transaction = new Transaction();
                    transaction.setUsername(username);
                    transaction.setContCreditat(IBAN);
                    System.out.println("Adauga contul pentru transfer :");
                    transaction.setContDebitat(sc.nextLine());
                    transactionRepository.createTransaction(new Transaction());
                    System.out.println("c.Show transactions history for specific account");
                    TransactionRepository transactionRepository1 = new TransactionRepository();
                    transactionRepository1.getTransactions();
                } else {
                    System.out.println("Go to option 2 from Menu");
                }
                break;
            case 2:
                if (userRepository.findUsername(username) == null) {
                    user.setUsername(username);
                    System.out.println("Introduceti parola");
                    String pass = sc.nextLine();
                    user.setPassword(pass);
                    user.setCreationDate(new Date());
                    user.setStatus("Activ");
                    user.setLastStatusDate(new Date());
                    userRepository.createUser(user);
                }
                break;
            default:
                System.out.println("INVALID OPTION!!");
        }


        /**1.LoginIn-
         user si parola
         if user exists ->  a. show accounts
         b. make transaction
         c. show transactions history for specific account
         d. log off (send the client to the main menu)
         if user doesn't exist -> go to option 2 from the main menu
         2.SignUp
         "Enter your citizen ID"
         if client doesn't exist -> "Please go to the nearest bank branch to enroll as a client"
         if client exists -> "Please enter a username" //////////(that username doesn't already exist)
         "Please enter a password (to be remembered)"
         confirmare creare user nou + AUTO_LOG_IN (sa-l trimit in main menu 1. user exists)

         */

        HibernateUtil.shutdown();
    }
}
