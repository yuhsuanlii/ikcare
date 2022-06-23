package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DataSourceTests {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new FileSystemXmlApplicationContext(
						"C:\\JavaFramework\\eclipse-workspace\\final-proj-ikc\\src\\main\\webapp\\WEB-INF\\beans.config.xml");
		
		DataSource dataSource = context.getBean("dataSource", DataSource.class);
		Connection conn = dataSource.getConnection();
		PreparedStatement stmt = conn.prepareStatement("select * from members");
		ResultSet rset = stmt.executeQuery();
		while(rset.next()) {
			String row = "";
			for (int i = 1; i <= rset.getMetaData().getColumnCount() ; i++) {
				row += rset.getString(i) + " : ";
			}
			System.out.println(row);
		}
		rset.close();
		stmt.close();
		conn.close();
		
		((ConfigurableApplicationContext) context).close();
	}
}
