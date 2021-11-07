import java.util.Scanner;
import java.util.Stack;

public class ReverseStringByStack {

  public static void main(String[] args) {
    Stack<Character> stack = new Stack<>();

    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter string to reverse: ");
    String inputStr = sc.nextLine();
    char[] characters = inputStr.toCharArray();
    for (char c : characters) {
      stack.push(c);
    }
    for (int i = 0; i < characters.length; i++) {
      characters[i] = stack.pop();
    }
    System.out.println("reverse of string is " + new String(characters));
    sc.close();
  }

}
