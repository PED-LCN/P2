package aula09;


import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        int[][] matriz ={{1},{2},{3},{4},{5},{6},{7},{8},{9}};

        System.out.println("a soma é:"+ somarMatriz(matriz));
    }
  public static int  somarMatriz(int[][] matriz){
      int soma =0;
      for( int[] linha :matriz){
          for( int elemento : linha){
              soma += elemento;
          }
      }
      return soma;
  }
}
