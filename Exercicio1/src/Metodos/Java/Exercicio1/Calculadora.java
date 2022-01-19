package Metodos.Java.Exercicio1;

public class Calculadora {

    //i mprime a soma de dois numeros
    public static void soma(double numero1, double numero2){
        double resultado= numero1 + numero2;
        System.out.println(numero1 + " + " + numero2 + "= " + resultado);
    }

    //imprime a subtração de  dois numeros
    public static void subtracao(double numero1, double numero2){
        double resultado= numero1 - numero2;
        System.out.println(numero1 + " - " + numero2 + "= " + resultado);
    }

    //imprime a multiplicação de dois numero
    public static void multiplicacao(double numero1, double numero2){
        double resultado= numero1 * numero2;
        System.out.println(numero1 + " x " + numero2 + "= " + resultado);
    }

    //imprime a divisão de dois numeros
    public static void divisao(double numero1, double numero2){
        double resultado= numero1 / numero2;
        System.out.println(numero1 + " / " + numero2 + "= " + resultado);
    }
}