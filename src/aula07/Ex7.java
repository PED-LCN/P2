package aula07;

public class Ex7 {
    public static void main(String[] args) {
        String[] nomes = {"Ana","Bruno","Alê","Aline","Clara"};

        for(String nome : nomes){
            if(nome.startsWith("A")){
                System.out.println(nome);
            }
        }
    }
}
