package zombie;

public class ZombieGameSystem {

	private static ZombieGame zombieGame = ZombieGame.getInstance();

	public static void main(String[] args) {
		zombieGame.run();

	}

}
