package br.com.pedro;

public class MediaNotas {

    public static void main(String args[]){
    calculaMedia();
    }

    public static void calculaMedia(){
        int nota1 = 4;
        int nota2 = 5;
        int nota3 = 6;
        int nota4 = 7;

        int numNotas = 4;

        float somaNotas  = nota1 + nota2 + nota3 + nota4;
        float mediaFinal = somaNotas /  numNotas ;

        System.out.println("A média final dessas 4 notas é de " + mediaFinal);
    }

}
