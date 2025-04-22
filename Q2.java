import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.print("Digite o salario:");
        Scanner entrada = new Scanner(System.in);
        double salario = Integer.valueOf(entrada.nextLine());
        double aumento;
        double taxa;
        if (salario > 1250) {
            taxa = 0.10;
            
        } else {
            taxa = 0.15;
        }
    aumento = salario * taxa;
    salario = salario + aumento;
    System.out.println("Aumento:" + aumento);
    System.out.println("Novo salario:" + salario);
    }
}
