package v2.jeuDuPendu;

import v2.Partie;
import v2.Player;

public class JeuDuPendu implements Partie {

	private static final int ErrorsCountMax = 4;
	
	int errorsCount ;
	String secretWord = "" ;
	String currentWord = "" ;

	Player player;

	@Override
	public void newPlay( Player player ) {

		this.player = player ;
		secretWord = "Gateau" ;
		currentWord = "______" ;
	}

	@Override
	public boolean isFinish() {

		return secretWordFound()
			|| (errorsCount >= ErrorsCountMax) ;
	}

	private boolean secretWordFound() {
		return false;
	}

	@Override
	public void nextPlay() {

		String proposal = player.getPlay();

		// Chercher si "proposal" est contenu dans "secretWord"
		// Formuler autrement
		// Chercher la position de "proposal" dans "secretWord"
		//  Remplacer par "proposal" à la bonne positionn dans "currentWord"  
		
		
		errorsCount ++ ;
	}

	@Override
	public String getState() {

		return "Le mot: "
				+ currentWord
				+ " (reste "+ (ErrorsCountMax - errorsCount) + " erreur(s))";
	}

}

























