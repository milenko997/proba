import java.util.ArrayList;

public class Evidencija {

	private ArrayList<Smestaj> smestaji= new ArrayList<Smestaj>();
	private String naziv;
	
	public Evidencija() {
		super();
		naziv="";
	}
	
	public Evidencija(String naziv) {
		super();
		this.smestaji = smestaji;
		this.naziv = naziv;
	}
	
	public boolean dodajSmestaj(Smestaj s) {
		for(Smestaj sa: smestaji) {
			if(sa.getNaziv()==s.getNaziv()) {
				return false;
			}
		}
		return smestaji.add(s);
	}
	
	public boolean izbaciSmestaj(String naziv) {
		int toRemove=-1;
		for(int i=0; i<smestaji.size(); i++) {
			if(smestaji.get(i).getNaziv().equals(naziv)) {
				toRemove=i;
				break;
			}
		}
		if(toRemove==-1) {
			return false;
		}
		else {
			return smestaji.remove(toRemove) != null;
		}
	}

	public String toString() {
		return "Evidencija [smestaji=" + smestaji + ", naziv=" + naziv + "]";
	}
	
}
