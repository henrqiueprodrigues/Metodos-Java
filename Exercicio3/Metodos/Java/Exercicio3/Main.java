package Metodos.Java.Exercicio3;
public class Main {
    public static void main(String[] args) {

        //chama os metodos da classe quadrilaterio
        System.out.println("--------------- Exercicio retornos -------------");
        System.out.println("A area do quadrado é = " + Quadrilatero.area(5));
        System.out.println("A area do retangulo é = " + Quadrilatero.area(5,8));
        System.out.println("A area do trapézio é = " + Quadrilatero.area(5,8,5));
    }
}
