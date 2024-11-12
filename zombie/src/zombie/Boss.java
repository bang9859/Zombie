package zombie;

public class Boss extends Zombie {
	private int shield;

	protected Boss(int pos, int hp, int maxPower, int shield) {
		super(pos, hp, maxPower);
		this.shield = shield;
	}

	public int getSheild() {
		return shield;
	}
	public void setSheild(int power) {
		shield+=power;
	}
	
	@Override
	protected void attack(Unit target) {
		int randSkill = ZombieGame.ran.nextInt(4);
		int power = ZombieGame.ran.nextInt(getMaxPower()) + 1;
		if (randSkill == 1) {
			power = power * 3;
			System.out.println("보스 특수스킬 발동[공격력 3배]");
		}
		int currentHeroHp = target.getHp();
		if (target.getHp() - power < 0) {
			target.setHp(-target.getHp());
		} else {
			target.setHp(-power);
		}
		String message = String.format("퍽퍽 [%d(-%d)/%d]", currentHeroHp, power, target.getHp());
		System.out.println(message);
	}

}
