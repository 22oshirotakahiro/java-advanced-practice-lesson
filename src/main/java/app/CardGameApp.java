package app;

public class CardGameApp extends GameApp {
	
	public CardGameApp() {
		super();
	}
	public CardGameApp(String item) {
		super(item);
	}
	
	@Override
	public String start(String name) {
		String str = name + "さんと" + this.item + "でゲームを開始します。ババ抜きを行います。";
		return str;
	}
}