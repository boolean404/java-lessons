package day12;
public interface OnClickListener{
	int FONT_SIZE =12;
	String FONT_FAMILY = "NOto-San";
	
	void onClick();
	void onDoubleClick();
	
}

class Button implements OnClickListener{
	private String name;
	
	public Button(String name) {
		this.name= name;
	}
	
	public void display() {
		System.out.println("Button name: " + name);
		System.out.println("Font size : " + FONT_SIZE);
		System.out.println("Font family :" + FONT_FAMILY);
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDoubleClick() {
		// TODO Auto-generated method stub
		
	}
}