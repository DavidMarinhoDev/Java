package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros1 = {1,2,3,4,5};
        int[] numeros2 = new int[]{5,4,3,2,1};

        for(int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        //foreach
        for(int num : numeros1){
            System.out.println(num);
        }
    }
} 
