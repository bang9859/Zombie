package zombie;

public class Hero extends Unit {
	private int potionCnt;

	protected Hero(int pos, int hp, int maxPower, int potionCnt) {
		super(pos, hp, maxPower);
		this.potionCnt = potionCnt;
	}
 //  
	@Override
	protected void attack(Unit target) {
		int power = ZombieGame.ran.nextInt(getMaxPower()) + 1;
		if (target instanceof Boss) {
			Boss boss = (Boss) target;
			int currentBossHp = boss.getHp();
			if (boss.getSheild() - power > 0) {
				boss.setSheild(-power);
			} else {
				boss.setSheild(-boss.getSheild());
				if (boss.getHp() - power < 0) {
					boss.setHp(-boss.getHp());
				} else {
					boss.setHp(-power);
				}
			}
			String message = String.format("[HERO %d 데미지로 공격!] 푹 보스 좀비 체력: 쉴드:%d [%d/%d]", power, boss.getSheild(),
					boss.getHp(), currentBossHp);

			System.out.println(message);

		} else {
			int currentZombieHp = target.getHp();
			if (target.getHp() - power < 0) {
				target.setHp(-target.getHp());
			} else {
				target.setHp(-power);
			}
			String message = String.format("[HERO %d 데미지로 공격!] 푹 부하 좀비 체력: [%d/%d]", power, target.getHp(),
					currentZombieHp);
			System.out.println(message);
		}
	}

	protected void recover() {
		if (this.potionCnt == 0) {
			System.out.println("물약을 모두 사용하였습니다.");
			return;
		}
		setHp(100);
		this.potionCnt--;
		System.out.printf("포션 사용으로 현재 용사의 채력 %d\n", getHp());
	}

}
