import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ProductDao;
import entity.Product;
import util.DbUtil;

public class DbExam4 {

	public static void main(String[] args) {
		
		Connection connection = DbUtil.getConnection();
		ProductDao pd = new ProductDao(connection);
		
//		List<Product> list = pd.findAll();
//		
		
		
//		System.out.println("合計金額:" + pd.sumAllPrice());
		
		Product p = new Product("ボールペン", 200);
		pd.insert(p);
		List<Product> list = pd.findAll();
		for (int i = 0; i < list.size(); i++) {
			Product prdct = list.get(i);
			System.out.println("product_id:" + prdct.getProductId() + ", product_name:" + prdct.getProductName() + ", price:" + prdct.getPrice());
		}
		
	}
	
	private List<Product> findByTest(Connection connection) {
		
		final String SQL_TEST1 = "SELECT * FROM products WHERE product_id = 101 OR product_name = '地球儀'";
		
		List<Product> list = new ArrayList<Product>();

		try (PreparedStatement stmt = connection.prepareStatement(SQL_TEST1)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Product p = new Product(rs.getInt("product_id"), rs.getString("product_name"), rs.getInt("price"));
				list.add(p);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}


}