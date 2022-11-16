package homework22;

public class ArcadeGame implements Keypad {
	
	public int currentMode = NORMAL_MODE;

	public ArcadeGame() {
		System.out.println("ArcadeGame 실행");
	}

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒤쪽으로 이동한다");
	}

	@Override
	public void rightUpButton() {
		if (currentMode == NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격");
		} else if (currentMode == HARD_MODE) {
			System.out.println("캐릭터가 연속 공격");
		}
	}

	@Override
	public void rightDownButton() {
		if (currentMode == NORMAL_MODE) {
			System.out.println("캐릭터가 HIT 공격");
		} else if (currentMode == HARD_MODE) {
			System.out.println("캐릭터가 Double HIT 공격");
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
