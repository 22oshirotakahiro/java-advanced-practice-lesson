package entity;

public class Rabbit extends Animal {

	//　コンストラクタ
	public Rabbit() {
		super();
	}
	public Rabbit(String name, int age) {
		super(name, age);
	}
	
	@Override
	public String introduceAge() {
		String str;
		if (this.age < 1) {
			str = "0～10代中盤";
		} else if (this.age < 2) {
			str = "10代中盤";
		} else if (this.age < 3) {
			str = "20代";
		} else if (this.age < 4) {
			str = "30代";
		} else if (this.age < 5) {
			str = "40代";
		} else if (this.age < 6) {
			str = "50代";
		} else {
			str = "60歳以上";
		}
		return "種族はウサギです。人間なら" + str + "です。";
	}

	@Override
	public String getFilePath() {
		return "C:\\Work\\Rabbit.txt";
	}
	
}