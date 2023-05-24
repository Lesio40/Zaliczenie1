import java.util.Scanner;
class Main {
  public static void main(String[] args) {
 Scanner  scanner = new Scanner(System.in);
    System.out.println("Podaj łańcuch znaków");
    String lan = scanner.next();
    int dl = lan.length();
    System.out.println("Długosc to " + dl);
  }
}