package homework22;

public class RPGgame implements Keypad {
	// 현재 모드를 값으로 가지는 필드를 가지며
	// 생성자를 이용하여 값을 초기화한후 "RPGgmae 실행"을 출력한다.
	// ( 단, 매개변수를 이용하지 않으며 최초의 값은 NORMAL_MODE 이다. )
	public int currentMode = NORMAL_MODE;

	public RPGgame() {
		System.out.println("RPGgame 실행");
	}

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다");
	}

	@Override
	public void rightUpButton() {
		if (currentMode == NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		} else if (currentMode == HARD_MODE) {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
	}

	@Override
	public void rightDownButton() {
		if (currentMode == NORMAL_MODE) {
			System.out.println("캐릭터가 일반공격");
		} else if (currentMode == HARD_MODE) {
			System.out.println("캐릭터가 HIT 공격");
		}
	}

	@Override
	public void changeMode() {
		if (currentMode == NORMAL_MODE) {
			currentMode = HARD_MODE;
			System.out.println("현재 모드 : HARD_MODE");
		} else if (currentMode == HARD_MODE) {
			currentMode = NORMAL_MODE;
			System.out.println("현재 모드 : NORMAL_MODE");
		}
	}

}
