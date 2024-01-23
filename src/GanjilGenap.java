import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bilangan: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number % 2 == 0) {
            System.out.println("Bilangan " + number + " adalah genap");
        } else {
            System.out.println("Bilangan " + number + " adalah ganjil");
        }
    }
}