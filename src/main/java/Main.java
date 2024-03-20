import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
    System.out.println("Wybierz opcje: ");
    System.out.println("1 : Dodawanie");
    System.out.println("2 : Odejmowanie");
    System.out.println("3 : Mnożenie");
    System.out.println("4 : Dzielenie");
    int choice = scanner.nextInt();
    System.out.println("Podaj pierwszą liczbę: ");
    double num1 = scanner.nextDouble();
    System.out.println("Podaj drugą liczbę: ");
    double num2 = scanner.nextDouble();
    double result = 0;
    switch (choice)
    {
      case 1:
        result = num1 + num2;
        System.out.println("Wynik: " + result);
        break;
      case 2:
        result = num1 - num2;
        System.out.println("Wynik: " + result);
        break;
      case 3:
        result = num1 * num2;
        System.out.println("Wynik: " + result);
        break;
      case 4:
        result = num1 / num2;
        System.out.println("Wynik: " + result);
        break;
      default:
        System.out.println("Nieprawidłowa opcja");
    }
  }

}