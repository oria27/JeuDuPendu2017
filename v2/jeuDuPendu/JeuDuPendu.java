package v2.jeuDuPendu;

import v2.Partie;
import v2.Player;

public class JeuDuPendu implements Partie {

	private static final int ErrorsCountMax = 4;

	int errorsCount;
	String secretWord = "";
	String currentWord = "";

	Player player;

	@Override
	public void newPlay(Player player) {

		this.player = player;
		secretWord = "Gateau";
		currentWord = "______";
	}

	@Override
	public boolean isFinish() {

		return secretWordFound() || (errorsCount >= ErrorsCountMax);
	}

	private boolean secretWordFound() {
		return false;
	}

	@Override
	public void nextPlay() {

		String proposal = player.getPlay();

		// Chercher la position de "proposal" dans "secretWord"
		// Si position >= 0 (trouvé)
		// Dans "currentWord" à la position a-t-on un "_" ou "proposal" ?
		// Si "_", remplacer par "proposal" à la position dans "currentWord"
		// Si "proposal", ne rien faire
		// Si non
		// incrémenter "errorsCount"

		if (!isInWord(proposal)) {
			errorsCount++;
		} else {
			updateCurrentWord(proposal);
		}

	}

	private void updateCurrentWord(String proposal) {

		StringBuilder tempWord = new StringBuilder(currentWord);
		char p = proposal.charAt(0);
		for (int i = 0; i < secretWord.length(); i++) {
			if (secretWord.charAt(i) == p) {
				tempWord.setCharAt(i, p);
			}
		}
		currentWord = tempWord.toString();
	}

	private boolean isInWord(String proposal) {

		return secretWord.contains(proposal);
	}

	@Override
	public String getState() {

		return "Le mot: " + currentWord + " (reste " + (ErrorsCountMax - errorsCount) + " erreur(s))";
	}

}
