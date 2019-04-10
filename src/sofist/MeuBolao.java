package sofist;

public class MeuBolao implements Bolao {

	@Override
	public int calcularPontuacao(Placar aposta, Placar oficial) {	
		int pontos = 0;
		if (aposta.equals(oficial)) // ACERTOU O EMPATE OU VITORIA 
			return 20;
		if ((aposta.getTime1() == oficial.getTime1()) || (aposta.getTime2() == oficial.getTime2())) // ACERTOU O N DE GOLS DOS TIMES 
			pontos += 5;
		if ((aposta.getTime1() == aposta.getTime2() && oficial.getTime1() == oficial.getTime2()) ||
				(aposta.getTime1() > aposta.getTime2() && oficial.getTime1() > oficial.getTime2()) ||
				(aposta.getTime2() > aposta.getTime1() && oficial.getTime2() > oficial.getTime1())) // ACERTOU QUE HOUVE UM EMPATE OU QUAL TIME GANHOU
			pontos += 10;
		return pontos;
	}

}
