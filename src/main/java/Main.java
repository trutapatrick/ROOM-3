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


       // System.out.println("2.Transactie");
        HibernateUtil.shutdown();
    }
}
