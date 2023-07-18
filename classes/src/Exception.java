import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
  public static void main(String[] args) {
    execute();
    System.out.println("End of program!");
  }

  public static void execute() {
    Scanner sc = new Scanner(System.in);

    try {
      String[] vect = sc.nextLine().split(" ");
      int position = sc.nextInt();
      System.out.println(vect[position]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid position!");
      e.printStackTrace();
    } catch (InputMismatchException e) {
      System.out.println("Input error!");
      e.printStackTrace();
    } finally {
      System.out.println("End of execute");
    }
  }
}
