package aula07;

public class Ex5 {
    public static void main(String[] args) {
        int[] notas = {7, 8, 6, 10, 9};
        double soma =0;
        int acimaMedia = 0;

        for (int nota : notas) {
            if(nota>=7){
                acimaMedia++;
            }
            soma += nota;
        }
        double media = soma / notas.length;

        System.out.println("Media das nota: " + media);
        System.out.printf("Houve %d notas acima da media",acimaMedia);
    }
}
