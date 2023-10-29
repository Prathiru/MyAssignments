package week3.day1.important;

public class Chrome extends BrowserSuperclass{

	public void openIncognito()
	{
		System.out.println("OpenIncognito print");
	}

	public void clearCache()
	{
		System.out.println("Clear cache print");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome c = new Chrome();
		c.openIncognito();
		c.clearCache();
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
	}

}
