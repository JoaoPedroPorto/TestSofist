package sofist;

public class Placar implements Bolao {
	
	private int time1;
	private int time2;
	
	public Placar(int time1, int time2) {
		this.time1 = time1;
		this.time2 = time2;
	}

	public int getTime1() {
		return time1;
	}
	public void setTime1(int time1) {
		this.time1 = time1;
	}
	public int getTime2() {
		return time2;
	}
	public void setTime2(int time2) {
		this.time2 = time2;
	}

	@Override
	public int calcularPontuacao(Placar aposta, Placar oficial) {
		// TODO Auto-generated method stub
		int contador = 0;
		if (aposta.equals(oficial) || (aposta.getTime1() == oficial.getTime1() && aposta.getTime2() == oficial.getTime2()))
			contador += 10;
		
				
		return contador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + time1;
		result = prime * result + time2;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Placar other = (Placar) obj;
		if (time1 != other.time1)
			return false;
		if (time2 != other.time2)
			return false;
		return true;
	}
	
	
	
	
	
	

}
