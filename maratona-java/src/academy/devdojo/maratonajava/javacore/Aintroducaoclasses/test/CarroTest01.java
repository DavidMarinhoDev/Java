package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro2.nome = "Voyage";
        carro2.modelo = "Sedãn";
        carro2.ano = 2018;

        carro.nome = "Celta";
        carro.modelo = "hat";
        carro.ano = 2003;

        carro = carro2;

        System.out.println("Nome:"+ carro.nome+ " \nModelo:"+ carro.modelo + " \nAno:" + carro.ano);
        System.out.println("-------------------");
        System.out.println("Nome:"+ carro2.nome+ " \nModelo:"+ carro2.modelo + " \nAno:" + carro2.ano);
    }
}
