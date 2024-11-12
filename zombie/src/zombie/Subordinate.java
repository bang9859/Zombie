package zombie;

public class Subordinate extends Zombie implements Regenable{

	protected Subordinate(int pos, int hp, int maxPower) {
		super(pos, hp, maxPower);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void regenable() {
		int randomHeal = ZombieGame.ran.nextInt(getHp())+1;
		setHp(randomHeal);
		System.out.println("피를 자동으로 회복하였습니다.");
	}
}
 