package entity;

public class Product {

	// フィールド
	private Integer productId;
	private String productName;
	private Integer price;
	
	// コンストラクタ
	
	public Product(String productName, Integer price) {
	    this.productName = productName;
	    this.price = price;
	}
	public Product(Integer product_id, String productName, Integer price) {
		this.productId = product_id;
	    this.productName = productName;
	    this.price = price;
	}

	// アクセサ
		public Integer getProductId() {
			return this.productId;
		}
		public void setProductId(Integer productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return this.productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public Integer getPrice() {
			return this.price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
		

}