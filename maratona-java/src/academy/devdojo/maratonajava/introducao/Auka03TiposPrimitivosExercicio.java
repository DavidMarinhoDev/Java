package academy.devdojo.maratonajava.introducao;

/*
* Pratica
* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
*
* Eu <nome>, morando no endereço <endereço>,
* confirmo que recebi o salário de <salario>, na data <data>
*
* */

public class Auka03TiposPrimitivosExercicio {
    public static void main (String[] args){
    String nome = "David";
    String endereco = "QNP 15 Conjunto F casa 42";
    double salario = 2500.0D;
    String dataRecebimentoSalario = "05/04/2025";
    //String relatorio = "Eu "+ nome + ", morando no endereço "+ endereco+ " confirmo que recebi o salário de "+ salario +", na data "+ dataRecebimentoSalario;

    //System.out.println(relatorio);
    System.out.println("Eu "+ nome + ", morando no endereço "+ endereco);
    System.out.println("confirmo que recebi o salário de "+ salario +", na data "+ dataRecebimentoSalario);
    }

}
