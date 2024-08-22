import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();

    // Print different types of triangles
    printDecreasingTriangle(length, '*');
    System.out.println();

    printIncreasingTriangle(length, '*');
    System.out.println();

    printLeftSidedTriangle(length);
    System.out.println();

    printRightSidedTriangle(length);
    System.out.println();

    printTriangle(length);
    System.out.println();

    printReverseTriangle(length);
    System.out.println();

    sc.close();
  }

  // 1. Generalized Decreasing triangle
  public static void printDecreasingTriangle(int length, char ch) {
    for (int i = length; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print(ch);
      }
      System.out.println();
    }
  }

  // 2. Generalized Increasing triangle
  public static void printIncreasingTriangle(int length, char ch) {
    for (int i = 1; i <= length; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(ch);
      }
      System.out.println();
    }
  }

  // 3. Left sided triangle (Increasing triangle space + Decreasing triangle star)
  public static void printLeftSidedTriangle(int length) {
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length - i - 1; j++) {
        System.out.print(' '); // Space for the left side
      }
      for (int j = 0; j <= i; j++) {
        System.out.print('*'); // Stars for the right side
      }
      System.out.println();
    }
  }

  // 4. Left sided downward triangle (Decreasing triangle star + Increasing
  // triangle space)
  public static void printLeftSidedDownwardTriangle(int length) {
    for (int i = 0; i < length; i++) {
      for (int j = i; j < length; j++) {
        System.out.print('*'); // Stars for the left side
      }
      for (int j = 0; j < i; j++) {
        System.out.print(' '); // Space for the right side
      }
      System.out.println();
    }
  }

  // 5. Right sided triangle (Decreasing triangle space + Increasing triangle
  // star)
  public static void printRightSidedTriangle(int length) {
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(' '); // Space for the left side
      }
      for (int j = 0; j < length - i; j++) {
        System.out.print('*'); // Stars for the right side
      }
      System.out.println();
    }
  }

  // 6. Right sided downward triangle (Decreasing triangle star + Increasing
  // triangle space)
  public static void printRightSidedDownwardTriangle(int length) {
    for (int i = 0; i < length; i++) {
      for (int j = i; j < length; j++) {
        System.out.print('*'); // Stars for the left side
      }
      for (int j = 0; j < i; j++) {
        System.out.print(' '); // Space for the right side
      }
      System.out.println();
    }
  }

  // 7. Triangle (Right sided triangle + Increasing triangle star)
  public static void printTriangle(int length) {
    for (int i = 0; i < length; i++) {
      // Printing spaces
      for (int j = 0; j < length - i - 1; j++) {
        System.out.print(' '); // Space for the left side
      }
      // Printing stars for the left side
      for (int j = 0; j < i + 1; j++) {
        System.out.print('*');
      }
      // Printing additional stars for symmetry
      for (int j = 0; j < i; j++) {
        System.out.print('*');
      }
      System.out.println();
    }
  }

  // 8. Reverse triangle (Right sided downward triangle + Decreasing triangle
  // star)
  public static void printReverseTriangle(int length) {
    for (int i = 0; i < length; i++) {
      // Printing spaces
      for (int j = 0; j < i + 1; j++) {
        System.out.print(' ');
      }
      // Printing stars
      for (int j = i; j < length; j++) {
        System.out.print('*');
      }
      // Printing stars for the right side
      for (int j = i; j < length; j++) {
        System.out.print('*');
      }
      System.out.println();
    }
  }
}
