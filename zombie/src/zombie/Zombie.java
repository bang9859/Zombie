package zombie;

public class Zombie extends Unit {
	private int power;

	protected Zombie(int pos, int hp, int maxPower) {
		super(pos, hp, maxPower);
	}

	@Override
	protected void attack(Unit target) {

		int power = ZombieGame.ran.nextInt(getMaxPower()) + 1;
		int currentHeroHp = target.getHp();
		if (target.getHp() - power < 0) {
			target.setHp(-target.getHp());
		} else {
			target.setHp(-power);
		}
		String message = String.format("[좀비 공격] 퍽 [%d(-%d)/%d]", target.getHp(), power, currentHeroHp);
		System.out.println(message);
	}

	public int getPower() {
		return this.power;
	}

}
