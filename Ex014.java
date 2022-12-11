import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
       double  peso, excesso, multa; 

       Scanner sc = new Scanner(System.in);
       System.out.println("Quantos kg de peixe João trouxe? ");
       peso = sc.nextDouble();
       sc.close();

        if (peso>50) {
            excesso = peso - 50;
            multa = excesso * 4;
            System.out.format("O peso ultrapassou o limite de %.2f kg, e você deverá pagar R$ %.2f ", excesso, multa);
        } else {
            System.out.println("O peso está dentro do limite");
        }
    }
}
