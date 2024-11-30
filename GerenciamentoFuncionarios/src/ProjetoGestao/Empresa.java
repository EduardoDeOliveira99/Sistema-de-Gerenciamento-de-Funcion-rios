package ProjetoGestao;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Funcionarios> funcionarios = new ArrayList<>();
	
	public void addFuncionario(Funcionarios funcionario) {
		funcionarios.add(funcionario);
	}
	
	public Funcionarios getFuncionario(int i){
		Funcionarios novoFuncionario = funcionarios.get(i);
		return novoFuncionario;
	}

	@Override
	public String toString() {
		String informacao = "";
		for(Funcionarios funcionario: funcionarios) {
			informacao = informacao+funcionario;
		}
		
		return informacao;
	}
	
	
	
}
