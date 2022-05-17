import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import dao.ProductDao;
import entity.Product;
import util.DbUtil;

public class DbDevExam5_Select {
	
	public static void main(String[] args) {
		
		Connection connection = DbUtil.getConnection();
		ProductDao pd = new ProductDao(connection);
		
		List<Product> list = new ArrayList<Product>();
		list.add(pd.findById(102));
		for (int i = 0; i < list.size(); i++) {
			Product prdct = list.get(i);
			System.out.println("product_id:" + prdct.getProductId() + ", product_name:" + prdct.getProductName() + ", price:" + prdct.getPrice());
		}
		
	}
	
}