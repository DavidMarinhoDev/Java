package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os numeros pares de 0 até 1000000

        int number = 0;
        for (number = 0; number <= 1000000; number++){
            if (number % 2 == 0){
                System.out.println(number);
            }
        }
    }
}
