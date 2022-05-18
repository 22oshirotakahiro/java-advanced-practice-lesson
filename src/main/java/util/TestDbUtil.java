package util;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class TestDbUtil {

	@Test
	void test() {
		Connection conn = DbUtil.getConnection();
		
		try {
			assertEquals(false, conn.isClosed());
		} catch (SQLException e) {
			assertEquals("", "a");
		}
	}

}
