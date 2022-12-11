import java.util.Scanner;

public class Ex012 {
    
    public static void main(String[] args) {
        double pesoid, altura;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();
        sc.close();

        pesoid = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + pesoid); 

    }
}
