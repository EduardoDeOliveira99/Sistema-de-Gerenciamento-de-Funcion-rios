public class AumentoSalario implements CalcSalario {

    @Override
    public double CalcSalario(double TaxaAumento, double salario) {
        System.out.println("Salário Atualizado!");
        return  salario = salario * TaxaAumento;
    }
}
    

