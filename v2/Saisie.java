package V2;

import java.util.Scanner;

/**
 * Created by Ice on 15/02/2017.
 */
public class Saisie {

    private static final Scanner sc = new Scanner(System.in);

    public static String lireChaine(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
}
