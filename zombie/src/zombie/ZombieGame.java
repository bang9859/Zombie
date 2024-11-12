package zombie;

import java.util.Random;
import java.util.Scanner;

public class ZombieGame {
	private Scanner sc = new Scanner(System.in);
	public static Random ran = new Random();
	
	private final int MOVE = 1;
	private final int EXIT = 2;
	
	private boolean isRun = true;
	
	private ZombieGame() {

	}

	private static ZombieGame instance = new ZombieGame();

	public static ZombieGame getInstance() {
		return instance;
	}

	// 용사/좀비/보스 생성
	Hero hero = new Hero(1, 100, 40, 2);
	Zombie zombie = new Zombie(6, 100, 20);
	Boss boss = new Boss(9, 300, 50, 50);

	protected void run() {
		while (isRun) {
			play();
		}
	}

	private void play() {
		
		if(hero.getPos() ==5) {
			zombieRound();
		}else if(hero.getPos()==9) {
			bossRound();
		}else {
			if(hero.getPos() == 10) {
				System.out.println("게임 승리!!");
				isRun = false;
				return;
			}
			showMenu();
			int sel = input("입력:");
			if(sel ==MOVE) {
				hero.setPos(1);
			}else if(sel == EXIT) {
				isRun = false;
			}
		}
		
	}

	private void bossRound() {
		System.out.println("보스를 만났습니다. 공격모드로 전환합니다.");
		
		
	}

	private void zombieRound() {
		System.out.println("좀비를 만났습니다. 공격모드로 전환합니다.");
		while(true) {
			
		}
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
