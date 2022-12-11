import java.util.Scanner;

public class Ex018 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        double arquivomb, internetmbps, resultado; 

        Scanner sc = new Scanner (System.in);
        System.out.print("Qual o tamanho do arquivo para download? (Ex: 20mb) ");
        arquivomb = sc.nextDouble();
        System.out.print("Qual a velocidade do link de internet? (Ex: 5mbps)");
        internetmbps = sc.nextDouble();
        sc.close();

        resultado = internetmbps/8;
        arquivomb = resultado/60;     

        System.out.format("O tempo de download em minutos é %.2f", arquivomb);
    }
}
