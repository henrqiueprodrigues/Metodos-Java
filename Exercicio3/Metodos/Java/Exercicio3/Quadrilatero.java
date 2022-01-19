package Metodos.Java.Exercicio3;
public class Quadrilatero {

    //calculo da area de um quaddrado e retorna o seu resultado
    public static double area(double lado){

        return lado * lado;
    }

    //calcuoa da area de um retangulo e retorna o seu resultado
    public static double area(double lado1, double lado2){
        return lado1 * lado2;
    }

    //calcuoa da area de um trapézio e retorna o seu resultado
    public static double area(double baseMenor, double baseMaior, double altura){
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}