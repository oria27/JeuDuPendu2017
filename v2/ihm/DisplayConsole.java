package v2.ihm;

import v2.Display;

public class DisplayConsole implements Display {

	@Override
	public void say(String message) {
		System.out.print( message );
		
	}

}
