import java.util.ListResourceBundle;
import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        double m2area, litros, latas, galoes, valorlata, valorgalao, valorlatagalao;
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Qual o tamanho em metros da área a ser pintada? (Ex: 30m2) ");
        m2area = sc.nextDouble();
        sc.close();

        litros = m2area/6;
        latas = litros/18;
        galoes = litros/3.6;
        valorlata = latas * 80; 
        valorgalao = galoes * 25;
        valorlatagalao = (litros/18 + litros/3.6);


        System.out.println("A quantidade total de tinta a ser comprada em litros é de " + litros);
        System.out.format("Se você comprar apenas latas de tinta o valor total será de R$ %.2f \n", valorlata);
        System.out.format("Se você comprar apenas galões de tinta o valor total será de R$ %.2f \n", valorgalao);
        System.out.format("Se você comprar latas e galões para desperdiçar menos tinta o valor total será de R$ %.2f \n", valorlatagalao);
    
    
    }

}
