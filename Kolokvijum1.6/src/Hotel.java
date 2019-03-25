import java.util.ArrayList;

public class Hotel extends Smestaj{

	private ArrayList<Soba> soba= new ArrayList<Soba>();

	public Hotel() {
	}

	public Hotel(String naziv, String mesto, double profit) {
		super(naziv, mesto, profit);
		this.soba = soba;
	}
	
	public boolean dodajSobu(Soba s) {
		for(Soba so:soba) {
			if(so.getBrojSobe()==s.getBrojSobe()) {
				return false;
			}
		}
		return soba.add(s);
	}
	public boolean izbaciSobu(int brojSobe) {
		int toRemove=-1;
		for(int i=0; i<soba.size(); i++) {
			if(soba.get(i).getBrojSobe()==brojSobe) {
				toRemove=i;
				break;
			}
		}
		if(toRemove==-1) {
			return false;
		}
		else {
			return soba.remove(toRemove) != null;
		}
	}
	public double getPrihodi() {
		int suma=0;
		for(int i=0; i<soba.size(); i++) {
			suma+=soba.get(i).getCena();
		}
		return suma*getProfitMargin();
	}

	@Override
	public String toString() {
		return super.toString()+" Hotelska soba " + soba;
	}
	
}
