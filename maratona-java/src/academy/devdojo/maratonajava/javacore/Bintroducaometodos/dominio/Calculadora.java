package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somarDoisNumeros(int n, int n1){
        System.out.println(n + n1);
    }
    public void subtrairDoisNumeros(int n, int n1){
        System.out.println(n - n1);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
       if (num2 == 0){
           System.out.println("Não existe divisão por zero");
           return;
       }
        System.out.println(num1/num2);
    }
    public void alteraDoisNumeros (int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+ num1);
        System.out.println("Num2 "+ num2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma = soma + num;
        }
        System.out.println(soma);
    }
    public void somarVarArgs(int... numeros){
        int soma = 0;
        for(int num: numeros){
            soma = soma + num;
        }
        System.out.println(soma);
        }
}

