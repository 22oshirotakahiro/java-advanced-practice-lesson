package entity;

public class Cat extends Animal {

	//　コンストラクタ
	public Cat() {
		super();
	}
	public Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public String introduceAge() {
		String str;
		if (this.age < 1) {
			str = "0～10代中盤";
		} else if (this.age < 2) {
			str = "10代中盤";
		} else if (this.age < 4) {
			str = "20代";
		} else if (this.age < 6) {
			str = "30代";
		} else if (this.age < 9) {
			str = "40代";
		} else if (this.age < 11) {
			str = "50代";
		} else {
			str = "60歳以上";
		}
		return "種族はネコです。人間なら" + str + "です。";
	}

	@Override
	public String getFilePath() {
		return "C:\\Work\\cat.txt";
	}
	
}