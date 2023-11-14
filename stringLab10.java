import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);


      System.out.print("Enter a string: ");
      String text = scanner.nextLine();


      System.out.print("Enter the first word to check for: ");
      String firstWord = scanner.next();


      System.out.print("Enter the second word to check for: ");
      String secondWord = scanner.next();


      int count1 = 0;
      int count2 = 0;


      String word = "";
      for (int i = 0; i < text.length(); i++) {
          char c = text.charAt(i);
          if (c == ' ') {
              if (word.equals(firstWord)) {
                  count1++;
              } else if (word.equals(secondWord)) {
                  count2++;
              }
              word = "";
          } else {
              word += c;
          }
      }


      
      if (word.equals(firstWord)) {
          count1++;
      } else if (word.equals(secondWord)) {
          count2++;
      }


      boolean sameCount = count1 == count2;


      System.out.println(sameCount);


      scanner.close();
  }
}
