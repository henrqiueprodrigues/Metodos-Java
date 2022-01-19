package Metodos.Java.Exercicio1;

public class Mensagem_Hora_Dia {
    //define mensagem a ser eviada com base na hora fornecida
    public static void defineMensagem(double horario){
        if(horario>24){ //horario inexistente
            System.out.println("Horario invalido..");
        }
        else if (horario>4 && horario<13){ // horario entre 5 da manha(05h) e meio dia(12h)
            System.out.println("Bom dia!");
        }

        else if(horario>12 && horario<18){ // horario entre 1(13h) e 5(17) da tarde
            System.out.println("Boa tarde!");
        }

        else{ //horario entre 6 da noite(18h) e 4 da manha(04h)
            System.out.println("Boa noite!");
        }
    }
}