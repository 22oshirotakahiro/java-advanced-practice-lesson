import java.sql.Connection;

import dao.ProductDao;
import entity.Product;
import util.DbUtil;

public class DbDevExam5_Update {
	
	public static void main(String[] args) {
		
		Connection connection = DbUtil.getConnection();
		ProductDao pd = new ProductDao(connection);
		
		Product prdct = pd.findById(101);
		System.out.println("product_id:" + prdct.getProductId() + ", product_name:" + prdct.getProductName() + ", price:" + prdct.getPrice());
		
		prdct.setProductName("シャープペンシル");
		prdct.setPrice(70);
		pd.update(prdct);
		System.out.println("product_id:" + prdct.getProductId() + ", product_name:" + prdct.getProductName() + ", price:" + prdct.getPrice());
		
		
	}
	
}