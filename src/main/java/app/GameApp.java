package app;

public abstract class GameApp implements App{
	
	//　フィールド
	private String item;
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	
	private int playTime;
	
	public int getPlayTime() {
		return playTime;
	}
	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	
	//　コンストラクタ
	public GameApp() {
		
	}
	public GameApp(String item) {
		this.item = item;
	}
	
	//　メソッド
	protected abstract String play();
	
	@Override
	public String start(String name) {
		String str = name + "さんと" + this.item + "でゲームを開始します。" + this.play();
		return str;
	}
}
