package zombie;

import java.util.Random;

public class Zombie extends Unit {

	protected Zombie(int pos, int hp, int maxPower) {
		super(pos, hp, maxPower);
	}

	@Override
	public void Attack(Unit target) {

		int power = ZombieGame.ran.nextInt(getMaxPower());
		if (target.getHp() - power < 0) {
			target.setHp(-target.getHp());
		} else {
			target.setHp(-power);
		}
	}

}
