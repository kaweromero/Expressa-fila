package filaPilha;

public class NoFilaCircular {

	public NoFilaCircular proximo;
	public int dado;
	
	public NoFilaCircular(int dado){
		this.proximo = null;
		this.dado = dado;
	}
}
