package Metodos.Java.Exercicio1;

public class Emprestimo {
    //Faz o calculo do valor total a se pagar com base no numero de parcelas
    public static void calculoTaxa(double valor, int quantidadeParcelas){
        if(quantidadeParcelas>3){ //caso de saida para numero de parcelas acima do maximo
            System.out.println("Quantidade de parcelas exede o limite para esse emprestimo.");
        }

        else{
            double valorFinal; //variavle para guardar o valor final
            switch (quantidadeParcelas){ //determina qual função chamar
                case 1: //pagamento a vista
                    System.out.println("Pagamento a vista: sem taxas adicionais valor final= " + valor);
                    break;
                case 2://parcelado em 2 vezes
                    valorFinal= valor + determinaJuros(valor,quantidadeParcelas);
                    System.out.println("Pagamento parcelado em 2 vezes, valor final com juros= " + valorFinal);
                    break;
                case 3://parcelado em 3 vezes
                    valorFinal= valor + determinaJuros(valor,quantidadeParcelas);
                    System.out.println("Pagamento parcelado em 3 vezes, valor final com juros= " + valorFinal);
                    break;
            }
        }
    }

    //---------------------- Defeinção quandidade de juros-----------------------
    public static double determinaJuros(double valor, int quantidadeParcelas){
        if(quantidadeParcelas == 2) {
            return valor * 0.3; //em caso de 2 parcelas adiciona 30% do valor
        }else {
            return valor * 0.45; //em caso de 3 parcelas adiciona 45% do valor
        }

    }

    //------------------- Metodos get quantidade parcelas ----------------------------
    public static int getDuasParcelas(){
        return 2;
    }

    public static int getTresParcelas(){
        return 3;
    }


}