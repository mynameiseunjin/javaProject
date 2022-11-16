package homework22;

public interface Keypad {
	public static final int NORMAL_MODE = 0;
	public int HARD_MODE = 1;

	public abstract void leftUpButton(); // 왼쪽에서 위쪽 버튼을 눌렀을 때 동작하는 기능

	public abstract void leftDownButton();

	public abstract void rightUpButton();

	public abstract void rightDownButton();

	public abstract void changeMode();
	// 모드를 바꾸고 현재 모드를 출력하는 기능
	// ( NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
}
