
import java.util.Scanner;

public class Ex010 {
    
    public static void main(String[] args) {
        double tempC, tempF;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        tempC = sc.nextDouble();
        sc.close();

        tempF = ((tempC * 1.8) + 32);

        System.out.print("A temperatura em Fahrenheit é: " + tempF);
    }
}
