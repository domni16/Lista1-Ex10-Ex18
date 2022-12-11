import java.util.Scanner;

public class Ex013 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        double altura, pesoid; 
        char sexo; 

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua altura em metros (Ex: 1.75m): ");
        altura = sc.nextDouble();
        System.out.print("Digite o seu sexo: ");
        sexo = sc.next().charAt(0);
        sc.close();

        if (sexo=='M' || sexo=='m') {
            pesoid = (72.2*altura) - 58;
            System.out.println("Seu peso ideal é " + pesoid);
        } else if (sexo=='F' || sexo=='f') {
            pesoid = (62.1*altura) - 44.7;
            System.out.println("Seu peso ideal é " + pesoid);
        } else {
            System.out.println("Gênero não encontrado");
         }        
    }
}
