package V2.ihm;

import V2.Display;

/**
 * Created by Ice on 15/02/2017.
 */
public class Displayconsole implements Display {

    public void say(String message) {
        System.out.println( message );
    }
}
