package V2.JeuxDuPendu;

import V2.Partie;
import V2.Player;

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
        char p = proposal.charAt(0);


        if (!isInWord(proposal)){
            errorsCount++;
        } else {

                for (int i = 0; i < secretWord.length(); i++) {
                    if (secretWord.charAt(i)==p){

                        StringBuilder tempWord = new StringBuilder(currentWord);
                        tempWord.setCharAt(i, p);

                        currentWord =  tempWord.toString();
                    }
                }
            }
    }

    private boolean isInWord(String proposal){
        return secretWord.contains(proposal);
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
