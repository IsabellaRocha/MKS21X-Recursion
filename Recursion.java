import java.util.ArrayList;
public class Recursion {
  public static double sqrt(double n, double tolerance) {
    return sqrtHelp(n, 1, tolerance);
  }
  public static double sqrtHelp(double n, double guess, double tolerance) {
    if (Math.abs(((guess * guess - n) / n)) * 100 <= tolerance) {
      return guess;
    }
    if (n == 0) {
      return 0;
    }
    else {
      return sqrtHelp(n, (n/guess + guess) / 2, tolerance);
    }
  }
  public static long fib(long n) {
    if (n == 0) {
      return 0;
    }
    return fibHelp(n, 1, 0, 1);
  }
  public static long fibHelp(long n, long i, long prev, long partial) {
    if (n == i) {
      return partial;
    }
    return fibHelp(n, i + 1, partial, prev + partial);
  }
  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> L = new ArrayList<Integer>();
    return L;
  }
  public static int ms(int n, int partial){
    return partial;
  }

  public static void main(String[] args) {
    System.out.println(sqrt(9.0, .000001));
    System.out.println(sqrt(2.0, .000001));
    System.out.println(sqrt(49.0, .000001));
    System.out.println(sqrt(100, .000001));
    System.out.println(sqrt(101, .000001));
    System.out.println(sqrt(1124, .000001));
    System.out.println(fib(0));
    System.out.println(fib(1));
    System.out.println(fib(2));
    System.out.println(fib(3));
    System.out.println(fib(4));
    System.out.println(fib(5));
    System.out.println(fib(7));
    System.out.println(fib(50));
  }
}
