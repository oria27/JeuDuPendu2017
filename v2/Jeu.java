package v2;

import v2.jeuDuPendu.JeuDuPendu;
import v2.jeuDuPendu.JoueurDuPendu;

public class Jeu {

	public static void main(String[] args) {

		Partie partie = new JeuDuPendu() ;
		Player player = new JoueurDuPendu() ;
		
		partie.newPlay( player );

		while( ! partie.isFinish() )
		{
			partie.nextPlay();
			
			System.out.println( partie.getState() );

		}
	}

}
