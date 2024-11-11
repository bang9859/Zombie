package zombie;

public class ZombieGame {

	private ZombieGame() {

	}

	private static ZombieGame instance = new ZombieGame();

	public static ZombieGame getInstance() {
		return instance;
	}

	protected void run() {

	}
}
