package week3.day1.important;

public class BrowserSuperclass {

	public void openURL()
	{
		String a="OpenURL";
		System.out.println(a);
	}
	
	public void closeBrowser()
	{
		String b="closing Browser";
		System.out.println(b);
	}
	
	public void navigateBack()
	{
		String c="navigate back to the browser";
		System.out.println(c);
	}
	
public void browserVersion()
{
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserSuperclass b = new BrowserSuperclass();
		b.openURL();
		b.closeBrowser();
		b.navigateBack();

	}

}
