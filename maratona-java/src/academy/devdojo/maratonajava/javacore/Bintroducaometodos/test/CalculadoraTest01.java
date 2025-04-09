package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somarDoisNumeros(5, 10);
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtrairDoisNumeros(20, 15);
    }
}
