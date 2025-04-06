package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main (String[] args){
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "um graaaaande texto";

        System.out.println("A idade é " + idade + " anos.");
        System.out.println(verdadeiro);
        System.out.println(salarioDouble);
        System.out.println(caractere);
        System.out.println(nome);
        System.out.println(idadeShort);
    }
}
