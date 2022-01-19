package Metodos.Java.Exercicio2;
public class Quadrilaterio {

    //calculo da area de um quaddrado
    public static void area(double lado){
        System.out.println("A area do quadrado é = "+ lado * lado);
    }

    //calcuoa da area de um retangulo
    public static void area(double lado1, double lado2){
        System.out.println("A area do retangulo é = "+ lado1 * lado2);
    }

    //calcuoa da area de um trapézio
    public static void area(double baseMenor, double baseMaior, double altura){
        System.out.println("A area do trapézio é = "+ ((baseMaior + baseMenor) * altura) / 2);
    }
}
