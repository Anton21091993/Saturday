package Saturday;

import java.util.Objects;
import java.util.Scanner;

public class OperatorsTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String yourName = scanner.nextLine();

         String friendName = "Ivan";
          String girlName = "Nastya";

          boolean isFriend = (Objects.equals (friendName, yourName ));
          boolean isGirl =(Objects.equals (friendName, yourName ));



        if (Objects.equals (friendName, yourName ));
        System.out.println("привет");
        System.out.println("я тебя так долго ждал");


        if (Objects.equals(girlName, yourName)) {
            System.out.println("Я тебя так долго ждал");
        }

        friendName ="Slava";
        if (!Objects.equals(friendName, yourName)&& !Objects.equals(girlName, yourName))  {

            System.out.println("WHo are you");
        }






    }


}
