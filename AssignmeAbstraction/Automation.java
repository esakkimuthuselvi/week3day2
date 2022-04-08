package AssignmeAbstraction;

public class Automation extends MultipleLangauge implements Language, TestTool {
	@Override
	public void ruby() {
		System.out.println("Ruby in Automation");
	}

	public void selenium() {
		System.out.println("Selenium in Automation");
	}

	public void java() {
		System.out.println("Java in automation");
		
	}

	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.ruby();
		auto.java();
		auto.selenium();
		auto.python();
        
	}

}
