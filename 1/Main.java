import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    sc.close();

    // 1. Decreasing triangle star
    for (int i = 0; i < length; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      // Space
      System.out.println();
    }

    System.out.println();

    // 2. Increasing triangle star
    for (int i = 0; i < length; i++) {
      for (int j = i; j < length; j++) {
        System.out.print("*");
      }
      // Space
      System.out.println();
    }

    System.out.println();

    // 3. Left sided triangle (Increasing triangle space + Decreasing triangle star)
    for (int i = 0; i < length; i++) {
      // 3.1 Increasing triangle space
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      // 3.2 Decreasing triangle star
      for (int j = i; j < length; j++) {
        System.out.print("*");
      }
      // Space
      System.out.println();
    }

    System.out.println();

    // 4. Right sided triangle (Decreasing triangle space + Increasing triangle
    // star)
    for (int i = 0; i < length; i++) {
      // 4.1 Decreasing triangle space
      for (int j = i; j < length - 1; j++) {
        System.out.print(" ");
      }
      // 4.2 Increasing triangle star
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      // Space
      System.out.println();
    }

    System.out.println();

    // 5. Triangle (Left sided triangle + Increasing triangle star)
    for (int i = 0; i < length; i++) {
      // 5.1 Left sided triangle (Decreasing triangle space + Increasing triangle
      // star)
      // 5.1.1 Decreasing triangle Space
      for (int j = i; j < length - 1; j++) {
        System.out.print(" ");
      }
      // 5.1.2 Increasing triangle star
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }

      // 5.2 Increasing triangle star
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
