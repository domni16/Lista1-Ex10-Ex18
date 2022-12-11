import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        double m2area, litros, latas, valortotal;
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Qual o tamanho da área que deve ser pintada? (Ex: 12m2) ");
        m2area = sc.nextDouble();
        sc.close();

        litros = m2area/3;
        latas = litros/18;
        valortotal = latas * 80; 
        System.out.format("Você vai precisar de %.2f litros para pintar %.2f metros da área, e vai precisar de %.2f latas, cujo valor total será de R$ %.2f ", litros, m2area, latas, valortotal);
    }
}
