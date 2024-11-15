package zombie;

import java.util.Random;
import java.util.Scanner;

public class ZombieGame {
	private Scanner sc = new Scanner(System.in);
	public static Random ran = new Random();

	private final int MOVE = 1;
	private final int EXIT = 2;
	private final int ATTACK = 1;
	private final int POTION = 2;

	private boolean isRun = true;

	private ZombieGame() {

	}

	private static ZombieGame instance = new ZombieGame();

	public static ZombieGame getInstance() {
		return instance;
	}

	// 용사/좀비/보스 생성
	Hero hero = new Hero(1, 200, 30, 2);
	Subordinate subordinate = new Subordinate(6, 100, 20);
	Boss boss = new Boss(9, 200, 40, 100);

	protected void run() {
		while (isRun) {
			play();
		}
	}

	private void play() {

		if (hero.getPos() == 5) {
			zombieRound();
		} else if (hero.getPos() == 9) {
			bossRound();
		} else {
			if (hero.getPos() == 10) {
				System.out.println("게임 승리!!");
				isRun = false;
				return;
			}
			showMenu();
			int sel = input("입력:");
			if (sel == MOVE) {
				hero.setPos(1);
			} else if (sel == EXIT) {
				isRun = false;
			}
		}

	}

	private void zombieRound() {
		System.out.println("부하 좀비를 만났습니다. 공격모드로 전환합니다.");
		while (true) {
			if (checkSusbordinateRoundEnd())
				break;
			int sel = input("1)공격 2)물약 \n입력");
			if (sel == ATTACK) {
				fightSusbordinate();
			} else if (sel == POTION) {
				hero.recover();
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	private boolean checkSusbordinateRoundEnd() {
		if (hero.getHp() == 0) {
			isRun = false;
			System.out.println("HERO DIE....");
			return true;
		}
		if (subordinate.getHp() == 0) {
			System.out.println("STAGE CLEAR~!!");
			heroLevelUp();
			hero.setPos(1);
			return true;
		}
		return false;
	}

	private void heroLevelUp() {
		// 몬스터 처치시 공격력 증가 및 피 회복
		hero.setHp(200-hero.getHp());
		hero.setMaxPower(10);
	}

	private void fightSusbordinate() {
		subordinate.attack(hero);
		hero.attack(subordinate);
		if (subordinate.getHp() > 0)
			subordinate.regenHp();
	}

	private void bossRound() {
		System.out.println("보스 좀비를 만났습니다. 공격모드로 전환합니다.");
		while (true) {
			if (checkBossRoundEnd())
				break;
			int sel = input("1)공격 2)물약 \n입력");
			if (sel == ATTACK) {
				fightBoss();
			} else if (sel == POTION) {
				hero.recover();
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	private void fightBoss() {
		boss.attack(hero);
		hero.attack(boss);
	}

	private boolean checkBossRoundEnd() {
		if (hero.getHp() <= 0) {
			isRun = false;
			System.out.println("HERO DIE....");
			return true;
		}
		if (boss.getHp() <= 0) {
			System.out.println("STAGE CLEAR~!!");
			hero.setPos(1);
			return true;
		}
		return false;
	}

	private int input(String msg) {
		System.out.print(msg + " : ");
		String input = sc.nextLine();
		int pick = -1;
		try {
			pick = Integer.parseInt(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pick;
	}

	private void showMenu() {
		String msg = String.format("현재 위치: %d\n1)이동하기 2)종료하기", hero.getPos());
		System.out.println(msg);
	}

}
