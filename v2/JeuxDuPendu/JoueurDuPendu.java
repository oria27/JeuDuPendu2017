package V2.JeuxDuPendu;

import V2.Player;
import V2.Saisie;


/**
 * Created by Ice on 14/02/2017.
 */
public class JoueurDuPendu implements Player {

    public String getPlay() {
        String sl = Saisie.lireChaine("Veuillez saisir votre lettre : ");
        return sl;
    }

    public String getName(){
        String s = Saisie.lireChaine("Veuillez entrer votre nom : ");
        return s;
    }
}
