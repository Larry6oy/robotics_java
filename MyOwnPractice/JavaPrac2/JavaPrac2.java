package MyOwnPractice.JavaPrac2;
import java.util.Scanner;

public class JavaPrac2 {
   public JavaPrac2() {
   }

   public static void main(String[] var0) {
       try (Scanner inputname = new Scanner(System.in)) {
           System.out.println("hello, what is your name? ");
           String name = inputname.nextLine();
           System.out.println("Hello there," + name + "! How are you doing today?");
       }
   }
}
