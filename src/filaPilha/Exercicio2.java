package filaPilha;

import java.util.Stack;

import javax.swing.JOptionPane;

public class Exercicio2 {

	//Stack<String> stack = new Stack<>();
	FilaCircularDinamica fila1 = new FilaCircularDinamica();
	FilaCircularDinamica fila2 = new FilaCircularDinamica();

	public static void main(String[] args) {
		Exercicio2 ex = new Exercicio2();
		ex.testeExpressao();
	}

	public void testeExpressao() {

		String expressao = null;
		expressao = JOptionPane.showInputDialog("Insira a expressão");
		System.out.println(expressao);
		split(expressao);

	}

	public void split(String expressao) {

		for (int i = 0; i < expressao.length(); i++) {
			if (expressao.charAt(i) == '(') {
				fila1.adicionarFila(1);
				//String abre = "(";
				//inserir(fila1, abre);
				//stack.addElement(abre);
			}

			if (expressao.charAt(i) == ')') {
				try {
					fila2.adicionarFila(fila1.removerFila());
				} catch (Exception e) {

					JOptionPane.showMessageDialog(null, "Falta Abrir parenteses na expressão!");
				}

			}

		}

		
		if(fila1.getSize() > fila2.getSize()){
			
			JOptionPane.showMessageDialog(null, "Falta fechar parenteses na expressão!", "Erro", JOptionPane.ERROR_MESSAGE);
	
		}
		if(fila1.getSize() < fila2.getSize()){
			
			JOptionPane.showMessageDialog(null, "Falta Abrir parenteses na expressão!", "Erro", JOptionPane.ERROR_MESSAGE);

		}
		
		if (fila1.getSize()== fila2.getSize()) {

			JOptionPane.showMessageDialog(null, "A expressão ta supimpa!", "YAAAY", JOptionPane.INFORMATION_MESSAGE);

		} 

	}


}
