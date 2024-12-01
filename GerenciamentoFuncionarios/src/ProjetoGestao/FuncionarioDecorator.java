// Branch 4
package ProjetoGestao;


public abstract class FuncionarioDecorator extends Funcionario {
    protected Funcionario funcionario;

    public FuncionarioDecorator(Funcionario funcionario) {
        super(funcionario.getNome(), funcionario.getCargo(), funcionario.getSalario());
        this.funcionario = funcionario;
    }

    @Override
    public double getSalario() {
        return funcionario.getSalario();
    }
}

public class FuncionarioComBonus extends FuncionarioDecorator {
    private double bonus;

    public FuncionarioComBonus(Funcionario funcionario, double bonus) {
        super(funcionario);
        this.bonus = bonus;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + bonus;
    }
}