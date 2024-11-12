package zombie;

public class Zombie extends Unit {

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
		String message = String.format("[좀비 %d 데미지로 공격!] 퍽 [%d/%d]", power, target.getHp(), currentHeroHp);
		System.out.println(message);
	}

	

}
