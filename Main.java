import java.util.Scanner;

 class Main {
  
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Podaj liczbę: ");
    int a = input.nextInt();

    System.out.print("Podaj drugą liczbę: ");
    int b = input.nextInt();

    System.out.print("Podaj trzecią liczbę: ");
    int c = input.nextInt();

    int liczba1 = a;

    if (b > liczba1) {
      liczba1 = b;
    }

    if (c > liczba1) {
      liczba1 = c;
      
    }

    System.out.println("Największa liczba to:" + liczba1);
    

     }
 }