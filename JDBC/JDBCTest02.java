import java.sql.*;
public class JDBCTest02{

	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		try{
			//第一步：注册驱动
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);

			//第二步：获取连接
			String url = "jdbc:mysql://localhost:3306/bjpowernode";
			String user = "root";
			String password = "123456";
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("数据库连接成功：" + conn);
			//第三步：获取数据库操作对象
			stmt = conn.createStatement();
			//第四步：执行sql语句
			String sql = "update dept set LOC='成都' where DEPTNO=80";
			int count = stmt.executeUpdate(sql);
			System.out.println(count==1?"保存成功":"保存失败");
			//第五步：处理查询结果集
		}catch(SQLException e){
				e.printStackTrace();
		}finally{
			//第六步、释放资源
			try{
				if(stmt!=null){
					stmt.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			try{
				if(conn!=null){
					conn.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	
	}
}