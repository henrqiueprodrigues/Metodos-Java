package Metodos.Java.Exercicio1;

public class Main {
    public static void main(String[] args) {
        //Métodos da calculadora
        System.out.println("--------------- Execicio calculadora --------------");
        Calculadora.soma(5,6);
        Calculadora.subtracao(15,10);
        Calculadora.multiplicacao(5,5);
        Calculadora.divisao(90,9);

        //metodo da mesnaagem a partir da hora do dia
        System.out.println("\n--------------- Execicio mensagem --------------");
        Mensagem_Hora_Dia.defineMensagem(9);
        Mensagem_Hora_Dia.defineMensagem(16);
        Mensagem_Hora_Dia.defineMensagem(3);
        Mensagem_Hora_Dia.defineMensagem(28);

        //metodo do Emprestimo
        System.out.println("\n---------------- Exercico Emprestimo ------------");
        Emprestimo.calculoTaxa(1000,1);
        Emprestimo.calculoTaxa(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calculoTaxa(1000,Emprestimo.getTresParcelas());
        Emprestimo.calculoTaxa(1000,5);
    }
}
