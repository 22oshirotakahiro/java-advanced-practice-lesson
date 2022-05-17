package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Product;

public class ProductDao {

	// フィールド
	private Connection connection;

	private static final String SQL_SELECT_ALL = "SELECT * FROM products ORDER BY product_id";
	private static final String SQL_SELECT_WHERE_USER_ID = "SELECT product_id, product_name, price FROM products WHERE id = ?";
	private static final String SQL_INSERT = "INSERT INTO products (product_name, price) VALUES (?, ?)";
	private static final String SQL_UPDATE = "UPDATE products SET product_name = ?, price = ? WHERE product_id = ?";
	private static final String SQL_DELETE = "DELETE FROM products WHERE id = ?";
	private static final String SQL_SELECT_SUMALLPRICE = "SELECT sum(price) FROM products";

	// コンストラクタ
	public ProductDao(Connection connection) {
		this.connection = connection;
	}

	// メソッド
	public List<Product> findAll() {
		List<Product> list = new ArrayList<Product>();

		try (PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_ALL)) {
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

	public Product findById(int productId) {
		try (PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_WHERE_USER_ID)) {
			stmt.setInt(1, productId);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				return new Product(rs.getInt("product_id"), rs.getString("product_name"), rs.getInt("price"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return null;
	}

	public int insert(Product prod) {
		try (PreparedStatement stmt = connection.prepareStatement(SQL_INSERT)) {
			stmt.setString(1, prod.getProductName());
			stmt.setInt(2, prod.getPrice());
			
			return stmt.executeUpdate();
		} catch (Exception e) {
			throw new RuntimeException(e);
        }

	}

	public int update(Product prod) {
		try (PreparedStatement stmt = connection.prepareStatement(SQL_UPDATE)) {
	        stmt.setString(1, prod.getProductName());
	        stmt.setInt(2, prod.getPrice());
	        stmt.setInt(3, prod.getProductId());

	        return stmt.executeUpdate();
	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
    }

	public int delete(int productId) {
		try (PreparedStatement stmt = connection.prepareStatement(SQL_DELETE)) {
	        stmt.setInt(1, productId);

	        return stmt.executeUpdate();
	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
    }
	
	public int sumAllPrice() {
		try (PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_SUMALLPRICE)) {
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				return rs.getInt("sum");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return 0;
	}
	
}