import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // //prob1:
    int count = 0;
    System.out.println("Enter a string: ");
    String word = sc.nextLine();
    word = word.toLowerCase();

    for (int i = 0; i < word.length()-1; i++){
      String letters = word.substring(i, i+2);
      if (letters.equals("pa") || letters.equals("pe") || letters.equals("po") || letters.equals("pu") || letters.equals("pi")){
        count++;
      }
    }
    System.out.println(count);

    //prob2:
    System.out.println("Enter a string: ");
    word = sc.nextLine();
    word = word.toLowerCase();
    String newWord = "";

    for (int i = 0; i < word.length(); i++){
      String letter = word.substring(i, i+1);
      if (letter.equals("e") || letter.equals("t") || letter.equals("a") || letter.equals("i") || letter.equals("o")){
        newWord += "";
      }
      else {
        newWord += letter;
      }
    }
    System.out.println(newWord);

    //prob3:
    String s1 = "balloon";
    String s2 = "atrophy";
    if (s1.compareTo(s2) == 0){
      System.out.println("error"); //if not same length, print error
    }
    
  }
}

