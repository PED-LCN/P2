package aula09;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,12,23,34,45,6,7,8,9};
        System.out.println("Pares|Impares: "+Arrays.toString(contarParesImpares(numeros)));
    }

    public static int[] contarParesImpares(int[] array){
        int pares = 0;
        int impares = 0;
        for(int i:array ){
            if(i%2==0){
                pares++;
            }
            else {
                impares++;
            }
        }
        int[] parImpar = {pares,impares};
        return parImpar;
    }
}
