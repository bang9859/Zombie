package zombie;

public class Hero extends Unit{
	private int potionCnt;
	
	protected Hero(int pos, int hp, int maxPower,int potionCnt) {
		super(pos, hp, maxPower);
		this.potionCnt = potionCnt;
	}
	

	
	protected void recover() {
		if(this.potionCnt==0) {
			System.out.println("물약을 모두 사용하였습니다.");
			return;
		}
		setHp(100);
		this.potionCnt--;
		System.out.printf("포션 사용으로 현재 용사의 채력 %d",getHp());
	}

	@Override
	protected void attack(Unit target) {
		int power = ZombieGame.ran.nextInt(getMaxPower())+1;
		if (target.getHp() - power < 0) {
			target.setHp(-target.getHp());
		} else {
			target.setHp(-power);
		}
	}
	

}
