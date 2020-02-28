package orchestre;

public class Partitions {
	
	//partition composé de son nom et de sa tonalité 
	public String nom, tonalite;
	
	public Partitions(String nom, String tonalite) {
		this.nom = nom;
		this.tonalite = tonalite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTonalite() {
		return tonalite;
	}

	public void setTonalite(String tonalite) {
		this.tonalite = tonalite;
	}

	public void attach(PartitionObserver partitionObserver) {
		// TODO Auto-generated method stub
		
	} 
	
	

}
