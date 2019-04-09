package sofist;

import java.util.Random;

import javax.swing.JOptionPane;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time1 = JOptionPane.showInputDialog("Time1: ");
		String time2 = JOptionPane.showInputDialog("Time2: ");
		Placar aposta = new Placar(Integer.parseInt(time1), Integer.parseInt(time2));
		Placar oficial = new Placar(new Random().nextInt(10), new Random().nextInt(10));
		Placar resultado = null;
		int pontos = resultado.calcularPontuacao(aposta, oficial);
		JOptionPane.showMessageDialog(null, "Pontos conquistados: " + pontos);
	}

}
