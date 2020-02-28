package orchestre;

public class MusicienViolin extends Musiciens{
	
	//musicien avec violon, défini par son nom et son instrument 
	
	public String nom, instrument;
	
	
	public MusicienViolin(String nom, String instrument) {
		this.nom = nom;
		this.instrument = instrument;
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	
	
	

}
