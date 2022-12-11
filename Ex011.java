import java.util.Scanner;

public class Ex011 {
    
    public static void main(String[] args) { 
        int n1, n2;
        double n3, produto1por2, soma1com3, n3aocubo;  
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo número interiro: ");
        n2 = sc.nextInt();
        System.out.print("Digite um número real: ");
        n3 = sc.nextDouble();
        sc.close();

        produto1por2 = (n1 * 2) * (n2/2);    
        System.out.println("O produto do dobro do primeiro número com a metade do segundo número é: " + produto1por2);

        soma1com3 = ((n1 * 3) + n3 );
        System.out.println("A soma do triplo do primeiro número com o terceiro é: " + soma1com3);

        n3aocubo = Math.pow(n3, 3);
        System.out.format("O terceiro número elevado ao cubo é: %.2f", n3aocubo); 




    }
}
