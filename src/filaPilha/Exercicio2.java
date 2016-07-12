package filaPilha;

import java.util.Stack;

import javax.swing.JOptionPane;

public class Exercicio2 {

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
				
			}

			if (expressao.charAt(i) == ')') {
				try {
					fila2.adicionarFila(fila1.removerFila());
				} catch (Exception e) {

					JOptionPane.showMessageDialog(null, "Falta Abrir parenteses na expressão!", "Erro", JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}

			}
		}

		if(fila1.getSize()==0 && fila2.getSize()==0){
			JOptionPane.showMessageDialog(null, "OXI, faltou colocar parenteses na expressão!", "Erro", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		if(fila1.getSize() > fila2.getSize()){
			
			JOptionPane.showMessageDialog(null, "Falta fechar parenteses na expressão!", "Erro", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		if(fila1.getSize() < fila2.getSize()){
			
			JOptionPane.showMessageDialog(null, "Falta Abrir parenteses na expressão!", "Erro", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		if (fila1.getSize()== fila2.getSize()) {

			JOptionPane.showMessageDialog(null, "A expressão ta supimpa!", "YAAAY", JOptionPane.INFORMATION_MESSAGE);
			
		} 

	}


}
