
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        double num1,num2,num3,soma;

        System.out.print("Número 01: ");
        num1 = ler.nextDouble();
        System.out.print("Número 02: ");
        num2 = ler.nextDouble();
        System.out.print("Número 03: ");
        num3 = ler.nextDouble();

        soma = (num1 + num2 + num3) / 3;

        System.out.print("Resultado: " + soma);
    }




}
