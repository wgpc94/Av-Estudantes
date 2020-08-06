package entidades;

public class Estudantes {
	public String nome ="null";
	public double av1;
	public double av2;
	public double av3;
	public  String situacao;
	public double CalcularNota() {
		double notaFinal = (av1 + av2 + av3);
		if (notaFinal>=60) {
			situacao = "APROVADO";
		}else {
			situacao = "REPROVADO";
		}
		return notaFinal;
	}

}
