package zombie;

public class Hero extends Unit{
	private int potionCnt;
	
	protected Hero(int pos, int hp, int maxPower,int potionCnt) {
		super(pos, hp, maxPower);
		this.potionCnt = potionCnt;
	}

}
