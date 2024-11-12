# Zombie Game 
- 자바로 다형성 콘솔 게임을 구현하였습니다.


> #### 게임 설명
- 맵을 돌아다니며 마주치는 좀비 몬스터들을 모두 쓰러트리는 게임이다.
- Hero가 가지고 있는 공격과 피를 회복할 수 있는 포션을 사용하여 게임을 성공하는 것이 목표이다.
  * 부하 좀비는 5스테이지에 보스 좀비는 9스테이지에 존재한다.
  * Hero가 해당 스테이지에 도착을 하여 적을 만나게 되면 공격모드로 전환된다.
  * 공격모드로 전환이 되면 1)공격 혹은 2) 회복을 할 수 있다.
  * 공격을 수행하게 되면 랜덤값(1~공격력)으로 상대방을 공격할 수 있다.
  * 회복을 선택하면 체력이 100이 회복되며 총 2번 사용할 수 있다.
  * 부하 좀비는 Hero와 공격을 주고 받은 다음에 피를 회복하게 된다.
  * 보스 좀비는 특정 조건이 충족이 되면 그 턴에만 데미지가 2배로 늘어나는 스킬을 보유하고 있다.
  * 각 스테이지를 이기게 되면 체력을 모두 충전시켜주고 공격력을 추가시켜준다.
  * 보스 좀비까지 클리어를 했다면 게임을 끝낸다.
  * 단, 영웅의 체력이 0이 되었다면 게임 실패이다.

> #### Class Diagram
![클래스 다이어그램](https://github.com/bang9859/Zombie/blob/master/zombie.drawio%20(1).png)

> #### Demo
> ![zombie demo](https://github.com/user-attachments/assets/ebb27aca-569a-409f-8bb1-819faa628970)

