package zombie;

public class Subordinate extends Zombie implements Regenable{

	protected Subordinate(int pos, int hp, int maxPower) {
		super(pos, hp, maxPower);
	}

	@Override
	public void regenable() {
		int randomHeal = ZombieGame.ran.nextInt(getHp())+1;
		setHp(randomHeal);
		System.out.printf("부하 좀비가 피를 %d만큼 회복하였습니다. 현재 부하좀비 HP: %d\n",randomHeal,getHp());
	}
}
 