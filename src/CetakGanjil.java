import java.util.Scanner;
public class CetakGanjil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan batas :");
        int n = scanner.nextInt();
        scanner.close();
        for(var a = 1;a <= n ; a += 2){
            System.out.println(a);
        }
    }
}
