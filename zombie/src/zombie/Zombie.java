package zombie;

import java.util.Random;

public class Zombie extends Unit implements Regenable{

	protected Zombie(int pos, int hp, int maxPower) {
		super(pos, hp, maxPower);
	}

	@Override
	public void Attack(Unit target) {

		int power = ZombieGame.ran.nextInt(getMaxPower())+1;
		if (target.getHp() - power < 0) {
			target.setHp(-target.getHp());
		} else {
			target.setHp(-power);
		}
	}

	@Override
	public void Regenable() {
		int randomHeal = ZombieGame.ran.nextInt(20)+1;
		setHp(randomHeal);
		System.out.println("피를 자동으로 회복하였습니다.");
	}

}
