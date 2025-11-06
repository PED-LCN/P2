package aula09;

public class Ex7 {
    public static void main(String[] args) {
        int[][] numeros ={{5},{4},{3},{14},{50},{36},{17},{28},{9}};

        System.out.println("O menor valor é: "+ encontrarMenorValorMatriz(numeros));
    }

    public static int encontrarMenorValorMatriz(int[][] matriz){
        int menor = matriz[0][0];
        for(int[] linha: matriz){
            for(int elemento: linha){
                if(elemento < menor){
                    menor = elemento;
                }
            }
        }
        return menor;
    }
}
