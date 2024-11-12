import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    //prob1:
    int count = 0;
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

  }
}

