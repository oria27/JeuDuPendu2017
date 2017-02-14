package v2;

public interface Partie {

	void newPlay( Player player );

	boolean isFinish();

	void nextPlay();

	String getState();

}
