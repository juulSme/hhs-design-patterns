package application;

import email.JavaxMailSenderThatYouCannotChange;
import stringOps.StringOperator;

import javax.mail.MessagingException;
import java.util.Scanner;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 19-9-16.
 */
public class Application {
    public static void main(String[] args){
        // Assignment 1.
        // Refactor the stringOps package so that this code will work. You will need
        // to use two design patterns
        String input = "Wat een fantastische code";
        System.out.println("Select the operation to apply to the hardcoded String.");
        System.out.println("<1> for more spaces, <2> for the first half, <3> for its length");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        StringOperator operator;
        switch (choice){
            case 1: operator = new SpaceCreator(); break;
            case 2: operator = new FirstHalfCreator(); break;
            case 3: operator = new LengthCreator(); break;
            default: throw new IllegalArgumentException("It's not that difficult. Try again!");
        }
        System.out.println(operator.Operate(input));

        // Assignment 2.
        // Apply a design pattern so that sending an email from this application
        // becomes easier and you don't need all of these parameters.
        // You cannot change the existing JavaxMailSender.
        JavaxMailSenderThatYouCannotChange emailSender = new JavaxMailSenderThatYouCannotChange();
        try{
            emailSender.sendEmail(
                    "emailadres ontvanger",
                    "onderwerp",
                    "body",
                    "qars@ziggo.nl",
                    "50Geblutsteautosgingenjevoor",
                    "true",
                    "true",
                    "smtp.ziggo.nl",
                    "587"
            );
        } catch (MessagingException mE){
            System.out.println("Email not sent.");
        }

    }
}
