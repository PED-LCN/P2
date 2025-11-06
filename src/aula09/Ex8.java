package aula09;

public class Ex8 {
    public static void main(String[] args) {
        int[][] matriz ={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Soma da diagonal principal:"+somarDiagonalPrincipal(matriz));
    }

   public static int somarDiagonalPrincipal(int[][] matriz){
       int soma = 0;
       for(int i=0;i < matriz.length;i++ ){
           for(int j = 0;j < matriz[i].length;j++ ){
               if(i==j){
                   soma += matriz[i][j];}
           }
       }
       return soma;
   }
}
