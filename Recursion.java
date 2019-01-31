public class Recursion {
  public static double sqrt(double n, double tolerance) {
    return sqrt(n, 1, tolerance);
  }
  public static double sqrt(double n, double guess, double tolerance) {
    if (Math.abs(((guess * guess - n) / n)) * 100 <= tolerance) {
      return guess;
    }
    if (n == 0) {
      return 0;
    }
    else {
      return sqrt(n, (n/guess + guess) / 2, tolerance);
    }
  }
  public static void main(String[] args) {
    System.out.println(sqrt(9.0, .000001));
    System.out.println(sqrt(2.0, .000001));
    System.out.println(sqrt(49.0, .000001));
    System.out.println(sqrt(100, .000001));
    System.out.println(sqrt(101, .000001));
    System.out.println(sqrt(1124, .000001));
    System.out.println(sqrt(0, .000001));
  }
}
