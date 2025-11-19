import java.util.ArrayList;

public class Teste {
    static ArrayList<FormaBidimencional> bidimencionals = new ArrayList<>();
    static ArrayList<FormaTridimensional> tridimensionals = new ArrayList<>();
    public static void main(String[] args) {

        bidimencionals.add(new Circulo(5.0));
        bidimencionals.add(new Quadrado(4.0));
        bidimencionals.add(new Retangulo(3.0, 6.0));


        tridimensionals.add(new Cubo(2.0));


        for (FormaBidimencional forma : bidimencionals) {
            System.out.println("Forma: " + forma.getNome());
            System.out.println("Área: " + forma.calcularArea());
            System.out.printf("Perímetro: %.2f \n ", forma.calcularPerimetro());
            System.out.println();

        }


        for (FormaTridimensional forma : tridimensionals) {
            System.out.println("Forma: " + forma.getNome());
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Volume: " + forma.calcularVolume());
            System.out.println();
        }
    }
}
