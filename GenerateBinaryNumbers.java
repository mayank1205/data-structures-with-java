import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumbers {

  public static void generateBinaryNumbers(int n) {
    String[] result = new String[n];
    Queue<String> q = new LinkedList<>();
    q.offer("1");
    for (int i = 0; i < n; i++) {
      result[i] = q.poll();
      String n1 = result[i] + "0";
      String n2 = result[i] + "1";
      q.offer(n1);
      q.offer(n2);
    }
    for (String r : result) {
      System.out.println(r);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int num = sc.nextInt();
    generateBinaryNumbers(num);
    sc.close();
  }

}
