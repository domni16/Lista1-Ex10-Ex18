import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        double salporhora, horaspormes, inss, ider, sindi, salbruto, salliquido, descontos;
        Scanner sc = new Scanner (System.in);
        System.out.print("Qual o seu salário por hora? (Ex: R$12/h) ");
        salporhora = sc.nextDouble();
        System.out.print("E quantas horas você trabalha por mês? (Ex: 200h/mês) ");
        horaspormes = sc.nextDouble();
        sc.close();

        salbruto = salporhora * horaspormes;
        System.out.println("Seu salário bruto é R$" + salbruto);

        ider = salbruto * 0.11; 
        System.out.println("A parte do seu salário que vai para o Imposto de Renda é de R$" + ider);

        inss = salbruto * 0.08; 
        System.out.println("A parte do seu salário que vai para o INSS é de R$" + inss);

        sindi = salbruto * 0.05;
        System.out.println("A parte do seu salário que vai para o Sindicato é de R$" + sindi);

        descontos = inss + ider + sindi; 
        salliquido = salbruto - descontos;
        System.out.println("Seu salário líquido é de R$" + salliquido);




        
        
    }
}
