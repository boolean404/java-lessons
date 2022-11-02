package day12;

public class Demo {
	public static void main(String[] args) {
		OnClickListener btn1 = new Button("btn-login");
		
		btn1.onClick();
		btn1.onDoubleClick();
		
		Button btn2 = new Button("btn-loginout");
		btn2.display();
	}
}
