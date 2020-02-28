package orchestre;

import java.util.ArrayList;

public class Serveur {
	

	//liste des musiciens attacher au serveur 
	private static ArrayList<Musiciens> listMusicien = new ArrayList<>();
	
	//liste des partitions attacher au serveur 
	private static ArrayList<Partitions> listPartition = new ArrayList<>();
	
	//liste des Observers 
	private static ArrayList<PartitionObserver> listObserver = new ArrayList<>();
	
	
	//objet serveur en vu de faire un Singleton 
	private static Serveur obj;
	
	private Serveur() {
		
	}
	//mis en place d'un Singleton pour n'avoir qu'une seul instance de Serveur 
	public static Serveur getInstanceOfServeur() {
		if (obj == null)
			obj= new Serveur();
		return obj;	
	}
	
	//ajout de musicien a la liste
	public static void addMusicien(Musiciens musicien) {
		listMusicien.add(musicien);
		System.out.println("musicien ajouter !");
		
	}
	//suppression musicien
	public static void eraseMusicien(Musiciens musicien) {
		listMusicien.remove(musicien);
	}
	//ajout partition a la liste 
	public static void addPartition(Partitions partition) {
		listPartition.add(partition);
		//listObserver.add(partition);
		System.out.println("partition ajouter !");
		
	}
	//retourne le nombre de musicien 
	public static int nbrMusicien() {
		return listMusicien.size();
	}
	//retourne le nombre de partition
	public static int nbrPartition() {
		return listPartition.size();
	}

}
