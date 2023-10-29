package week3.day1;

public class Desktop extends Computer{
	
	public void desktopSize()
	{
		System.out.println("15 inches");
		System.out.println("20 inches");
		System.out.println("40 inches");
		System.out.println("45 inches");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop d = new Desktop();
		d.desktopSize();
		d.computerModel();
	}

}
