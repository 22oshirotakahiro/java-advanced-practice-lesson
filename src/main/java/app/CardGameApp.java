package app;

public class CardGameApp extends GameApp {
	
	public CardGameApp() {
		super();
	}
	public CardGameApp(String s) {
		super();
		if ("card".equals(s)) {
			this.item = "トランプ";
		} else if ("game".equals(s)) {
			this.item = "何か";
		} else {
			this.item = "";
		}
	}
	
	@Override
	public String start(String name) {
		String str = name + "さんと" + this.item + "でゲームを開始します。ババ抜きを行います。";
		return str;
	}
}