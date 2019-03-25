
public class Program {

	public static void main(String[] args) {

		Soba s1= new Soba(2, 100, 25, false);
		Soba s2 = new Soba(2, 145, 20, false);
		Soba s3 = new Soba(4, 112, 65, false);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		Hotel h1= new Hotel("Raj", "Laizy Links", 754);
		Hotel h2= new Hotel("Pakao", "Tilted Towers", 1241);		
		h1.dodajSobu(s2);
		h2.dodajSobu(s3);
		System.out.println(h1);
		System.out.println(h2);
		
		Stan st1= new Stan("Stan", "Paradise Palms", 95, s3, 8);
		Stan st2= new Stan("Stan 2", "Snobi shores", 88, s2, 2);
		System.out.println(st1);
		System.out.println(st2);
		Evidencija e1= new Evidencija("Moja evidencija");
		Evidencija e2= new Evidencija("Ne kontam cemu ovo");

		
		e1.dodajSmestaj(st1);
		e1.dodajSmestaj(h2);
		System.out.println(e1);
		
		e1.izbaciSmestaj("Stan");
		System.out.println(e1);
		
		
	}

}
