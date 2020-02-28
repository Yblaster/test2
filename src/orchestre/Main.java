package orchestre;

public class Main {

	public static void main(String[] args) {
		
		
		// création du serveur unique 
		Serveur serveur = Serveur.getInstanceOfServeur();
		
		//création des different musicien en les ajoutants a notre serveur 
		Musiciens piano =  MusicienFactory.getMusicien("beethoven", "Piano");
		System.out.println(piano.getInstrument());
		serveur.addMusicien(piano);
		
		Musiciens trumpet =  MusicienFactory.getMusicien("jazz", "Trompette");
		System.out.println(trumpet.getInstrument());
		serveur.addMusicien(trumpet);
		
		Musiciens violin =  MusicienFactory.getMusicien("Mozart", "Violon");
		System.out.println(violin.getInstrument());
		serveur.addMusicien(violin);
		
		
		//création des partitions 
		Partitions partition1 = new Partitions("part1", "A");
		Partitions partition2 = new Partitions("part2", "B");
		
		//ajout des partitions au serveur 
		serveur.addPartition(partition1);
		serveur.addPartition(partition2);
		
		System.out.println("nombre de musiciens : " + serveur.nbrMusicien());
		System.out.println("nombre de partitions : " + serveur.nbrPartition());

	}

}
