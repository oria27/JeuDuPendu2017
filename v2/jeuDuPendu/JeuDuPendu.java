package v2.jeuDuPendu;

import v2.Partie;
import v2.Player;

import java.lang.String;

/**
 * Created by Ice on 14/02/2017.
 */
public class JeuDuPendu implements Partie {
    /**
     * Attribute
     */
    int errorsCount;
    private static final int errorsCountMax = 10;
    String secretWord = "";
    String currentWord = "";
    Player player;

    public void newPlay(Player player) {

        this.player = player;
        secretWord = "babar";
        currentWord = setShadowWord();
    }

    private String setShadowWord() {
        for (int i = 0; i < secretWord.length(); i++) {
            currentWord += "_";
        }
        return currentWord;
    }

    public boolean isFinish() {

        return secretWordFound()
               || errorsCount >= errorsCountMax;
    }

    public void nextPlay() {
    	
        String proposal = player.getPlay();

        if (!isInWord(proposal)){
            errorsCount++;
        } else {
        	updateCurrentWord( proposal );
        }
    }

    private boolean isInWord(String proposal){
        return secretWord.contains(proposal);
    }

    private void updateCurrentWord( String proposal )
    {
        char p = proposal.charAt(0);
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i)==p){

                StringBuilder tempWord = new StringBuilder(currentWord);
                tempWord.setCharAt(i, p);

                currentWord =  tempWord.toString();
            }
        }

    }
    
    public String getState() {
        if (!isFinish()){
            return "Le Mot : "
                    + currentWord
                    + " (reste "+ (errorsCountMax-errorsCount) + " erreur(s))";
        }else {
            return result();
        }
    }

    private boolean secretWordFound() {
        if (currentWord.equals(secretWord)){
            return true;
        }else {
            return false;
        }
    }

    private String result(){
        if (secretWordFound()){
            return "Victory";
        }else {
            return "You're dead";
        }
    }

}
