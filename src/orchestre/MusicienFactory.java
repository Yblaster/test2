package orchestre;

public class MusicienFactory {

	//factory de musicien qui appelle le bon constucteur de classe celon le type d'instrument qu'a le musicien
	
	public static Musiciens getMusicien(String nom, String instrument) {
		if ("Piano".equalsIgnoreCase(instrument))
			return new MusicienPiano(nom, instrument);
		if ("Violon".equalsIgnoreCase(instrument))
			return new MusicienViolin(nom, instrument);
		if ("Trompette".equalsIgnoreCase(instrument))
			return new MusicienTrumpet(nom, instrument);
		else 
			return null; 
	}
	
	
	
}
