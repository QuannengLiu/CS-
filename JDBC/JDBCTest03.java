import java.sql.*;
public class JDBCTest03{
	public static void main(String[] args){
		Statement stmt = null;
		Connection conn = null;
		try{
			//1、注册驱动
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			//2、获取连接
			String url = "jdbc:mysql://localhost:3306/bjpowernode";
			String user = "root";
			String password = "123456";
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("数据库连接成功：" + conn);
			//3、创建数据库对象
			stmt = conn.createStatement();
			//4、执行数据库语句
			String sql = "update dept set LOC = '重庆' where DEPTNO = 70";
			int count = stmt.executeUpdate(sql);
			System.out.println(count == 1?"保存成功":"保存失败");
			//5、更新查询结果集
		}
		catch (SQLException e){
			e.printStackTrace();
		}finally{
			//6、释放资源
			try{
				if(stmt!=null){
					stmt.close();
				}
			}
			catch (SQLException e){
				e.printStackTrace();
			}
			try{
				if(conn!=null){
					conn.close();
				}
			}
			catch (SQLException e){
				e.printStackTrace();
			}
		}
		
	}
}
