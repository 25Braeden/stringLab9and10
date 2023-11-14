import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


       System.out.print("Enter a string: ");
       String text = scanner.nextLine();


       System.out.print("Enter the word to check for: ");
       String wordToCheck = scanner.nextLine();


       boolean multipleAppearances = false;


       int count = 0;
       int index = 0;


       while (index != -1) {
           index = text.toLowerCase().indexOf(wordToCheck.toLowerCase(), index);
           if (index != -1) {
               count++;
               index += wordToCheck.length();
               if (count > 1) {
                   multipleAppearances = true;
                   break;
               }
           }
       }


       System.out.println(multipleAppearances);


       scanner.close();
   }
}


