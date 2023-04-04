package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo triangulo = new Triangulo(10.3, 13.1);

        System.out.print("Base: " +triangulo.base +"\n" +"Altura: " +triangulo.altura +"\n" +
                "Area: " + String.format("%.2f", triangulo.calculaArea()) +"\n");

        System.out.println();

        Triangulo triangulo1 = new Triangulo();

        System.out.print("Digite a base do triângulo: ");
        triangulo1.setBase(sc.nextDouble());
        System.out.print("Digite a altura do triângulo: ");
        triangulo1.setAltura(sc.nextDouble());

        triangulo1.imprimeDados();
    }

}
