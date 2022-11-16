package homework22;

public class PlayGame {

	public static void main(String[] args) {
		Keypad kpad = new RPGgame();

		kpad.leftUpButton();
		kpad.rightUpButton();
		kpad.changeMode();
		kpad.rightUpButton();
		kpad.rightDownButton();
		kpad.leftDownButton();
		kpad.changeMode();

		System.out.println("======================");

		kpad = new ArcadeGame();

		kpad.leftUpButton();
		kpad.rightUpButton();
		kpad.leftDownButton();
		kpad.changeMode();
		kpad.rightUpButton();
		kpad.leftUpButton();
		kpad.rightDownButton();

	}

}
