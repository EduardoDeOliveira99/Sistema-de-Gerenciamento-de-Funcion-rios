package ProjetoGestao;


public class AumentoSalario implements CalcSalario {

    @Override
    public double CalcularSalario(double TaxaAumento, double salario) {
        System.out.println("Salário Atualizado!");
        return  salario = salario + (salario * (TaxaAumento/100));
    }
}
    

