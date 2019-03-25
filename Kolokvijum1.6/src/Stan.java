
public class Stan extends Smestaj{

	private Soba s;
	private int sprat;
	
	public Stan() {
		super();
		s=null;
		sprat=0;
	}
	public Stan(String naziv, String mesto, double profit, Soba s, int brojSpratova) {
		super(naziv, mesto, profit);
		this.s = s;
		this.sprat = brojSpratova;
	}
	
	public Soba getS() {
		return s;
	}
	public void setS(Soba s) {
		this.s = s;
	}
	public int getSprat() {
		return sprat;
	}
	public void setSprat(int sprat) {
		this.sprat = sprat;
	}
	
	public double getPrihodi() {
		if(s==null) {
			return 0;
		}
		else {
			return s.getCena()*getProfitMargin();
		}
	}
	
	public String toString() {
		return super.toString()+" Soba u stanu " + s + ", nalazi se na spratu broj " + sprat;
	}
}
