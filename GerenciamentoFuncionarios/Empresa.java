package ProjetoGestao;


import java.util.ArrayList;
import java.util.List;

public class Empresa implements Subject{
    private List<Funcionarios> funcionarios;
    private List<Observer> observers;

    public Empresa() {
        funcionarios = new ArrayList<>();
        observers = new ArrayList<>();
    }
	public void addFuncionario(Funcionarios funcionario) {
		funcionarios.add(funcionario);
	}
	
	public Funcionarios getFuncionario(int i){
		Funcionarios novoFuncionario = funcionarios.get(i -1);
		return novoFuncionario;
	}

	@Override
	public String toString() {
		String informacao = "";
		int i = 1;
		for(Funcionarios funcionario: funcionarios) {
			informacao = informacao + i +funcionario + "\n\n";
			i++;
		}
		
		return informacao;
	}

	@Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
	
	
	
}

