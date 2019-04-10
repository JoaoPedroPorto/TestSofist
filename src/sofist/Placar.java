package sofist;

public class Placar {
	
	private int time1;
	private int time2;
	
	public Placar(int time1, int time2) {
		this.time1 = time1;
		this.time2 = time2;
	}

	public int getTime1() {
		return time1;
	}
	public int getTime2() {
		return time2;
	}
	
	public interface Bolao {
		
		public int calcularPontuacao(Placar aposta, Placar oficial);
		
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
