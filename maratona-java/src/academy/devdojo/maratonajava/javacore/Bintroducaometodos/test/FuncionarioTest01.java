package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Joao";
        funcionario.idade = 22;
        funcionario.salarios = new double[]{1500,1850,2000};
        funcionario.imprime();
    }
}
