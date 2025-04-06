package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana considerando 1 como domingo;
        byte dia = 1;
        // char, int , byte, short, enum, String
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Segunda");
                break;
            case 4:
                System.out.println("Segunda");
                break;
            case 5:
                System.out.println("Segunda");
                break;
            case 6:
                System.out.println("Segunda");
                break;
            case 7:
                System.out.println("Segunda");
                break;
            default:
                System.out.println("Escolha um número de 1 a 7");
                break;
        }
    }
}
