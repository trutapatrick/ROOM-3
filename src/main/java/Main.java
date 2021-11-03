import entity.user.User;
import entity.user.UserRepository;
import util.HibernateUtil;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1.SignUp");
        User user =new User();
        System.out.println("Introduceti username");
        String username=sc.nextLine();
        user.setUsername(username);
        System.out.println("Introduceti parola");
        String pass = sc.nextLine();
        user.setPassword(pass);
        user.setCreationDate(new Date());
        user.setStatus("Activ");
        user.setLastStatusDate(new Date());
        UserRepository userRepository =new UserRepository();
        userRepository.createUser(user);


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
