package sofist;

import java.util.Random;

import javax.swing.JOptionPane;

public class Jogo {

	public static void main(String[] args) {
		int jogarNovamente;
		do {
			Integer time1 = null, time2 = null;
			boolean t1, t2;
			// LE O VALOR DO TIME 1
			do {
				t1 = false;
				try {
					time1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Time1 (0 a 10): "));
					if (time1 != null && (time1 < 0 && time1 > 10)) { 
						t1 = false;
						JOptionPane.showMessageDialog(null,"Somente é possível informar valores entre 0 e 10 para Time1...", "Informação", JOptionPane.INFORMATION_MESSAGE);
					}
					t1 = true;
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"O valor informado para o Time 1 deve ser um valor numérico...", "Erro", JOptionPane.ERROR_MESSAGE);
				}
			} while(t1 == false || time1 == null);
			
			// LE O VALOR DO TIME 1// LE O VALOR DO TIME 2
			do {
				t2 = false;
				try {
					time2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Time2 (0 a 10): "));
					if (time2 != null && (time2 < 0 && time2 > 10)) { 
						t2 = false;
						JOptionPane.showMessageDialog(null,"Somente é possível informar valores entre 0 e 10 para Time2...", "Informação", JOptionPane.INFORMATION_MESSAGE);
					}
					t2 = true;
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"O valor informado para o Time 2 deve ser um valor numérico...", "Erro", JOptionPane.ERROR_MESSAGE);
				}
			} while(t2 == false || time2 == null);
			
			// SETA O VALOR DA APOSTA FEITA
			Placar aposta = new Placar(time1, time2);
			// SETA O VALOR OFICIAL DO JOGO
			Placar oficial = new Placar(new Random().nextInt(10), new Random().nextInt(10));
			// GERA O RESULTADO E MOSTRA
			MeuBolao resultado = new MeuBolao();
			String textAposta = "Aposta realizada: " + aposta.getTime1() + " X " + aposta.getTime2() + "\n";
			String textOficial = "Oficial: " + oficial.getTime1() + " X " + oficial.getTime2() + "\n";
			String textPontos = "Pontos conquistados: " + resultado.calcularPontuacao(aposta, oficial);
			JOptionPane.showMessageDialog(null, textAposta + textOficial + textPontos);
			
			// PERGURNTA PARA O USUARIO SE DESEJA APOSTAR NOVAMENTE
			jogarNovamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente? ", "Apostar", JOptionPane.YES_NO_OPTION);
		} while(jogarNovamente == JOptionPane.YES_OPTION);

	}

}
