package week3.day1;

public class AutomationClass extends MultipleLangauge implements Language, TestTool {

	public static void main(String[] args) {

		AutomationClass c = new AutomationClass();
		c.Selenium();
		c.java();
		c.ruby();
		c.python();
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");

	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");

	}

}
