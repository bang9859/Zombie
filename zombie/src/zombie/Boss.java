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
		shield += power;
	}

	@Override
	protected void attack(Unit target) {
		int randSkill = ZombieGame.ran.nextInt(4);
		int power = ZombieGame.ran.nextInt(getMaxPower()) + 1;
		if (randSkill == 0) {
			power = power * 2;
			System.out.println("보스 특수스킬 발동[공격력 2배]");
		}
		int currentHeroHp = target.getHp();
		if (target.getHp() - power < 0) {
			target.setHp(-target.getHp());
		} else {
			target.setHp(-power);
		}
		String message = String.format("[BOSS %d 데미지로 공격!] 팍 [%d/%d]", power, target.getHp(), currentHeroHp);
		System.out.println(message);
	}

}
