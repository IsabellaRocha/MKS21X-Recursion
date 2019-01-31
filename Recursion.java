public class Recursion {
  public static double sqrt(double n) {
    return sqrt(n, 1);
  }
  public static double sqrt(double n, double guess) {
    if (Math.abs(((guess * guess - n) / n)) * 100 <= .0000001) {
      return guess;
    }
    if (n == 0) {
      return 0;
    }
    else {
      return sqrt(n, (n/guess + guess) / 2);
    }
  }
  public static void main(String[] args) {
    System.out.println(sqrt(9.0));
    System.out.println(sqrt(2.0));
    System.out.println(sqrt(49.0));
    System.out.println(sqrt(100));
    System.out.println(sqrt(101));
    System.out.println(sqrt(1124));
    System.out.println(sqrt(0));
  }
}
