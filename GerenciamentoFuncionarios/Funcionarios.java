package ProjetoGestao;


public class Funcionarios {
	
	private String nome;
	private int idade;
	private double salario;
	private String cargo;
	
	
	public Funcionarios() {}
	
	
	public Funcionarios(String nome, int idade, double salario, String cargo) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void CalcSalario(double TaxaAumento){
		AumentoSalario aumentoSalarial = new AumentoSalario();
		salario = aumentoSalarial.CalcularSalario(TaxaAumento, salario);
	}


	@Override
	public String toString() {
		return " - Funcionario: \n Nome: " + nome + ",\n Idade: " + idade + ",\n Salario: " + salario + ",\n Cargo: " + cargo + ".";
	}
	
	
	

}
