import java.sql.*;
public class JDBCTest01{
	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		try{
			//1、注册驱动
			//driver是个接口，没法new对象，需要找driver的实现类。
			//Driver driver = new com.mysql.cj.jdbc.Driver();
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);

			//2、获取连接
			String url = "jdbc:mysql://localhost:3306/bjpowernode";
			String user = "root";
			String password = "123456";
				//conn需要先在try catch语句块外面定义，不然不能关闭
				//getConnection是DriverManager的一个静态方法，static Connection getConnection
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("数据库连接对象：" + conn);
			//3、获取数据库操作对象
			stmt = conn.createStatement();

			//4、执行sql语句
			String sql = "insert into dept(DEPTNO,DNAME,LOC) value(80,'人事部','北京')";

			int count = stmt.executeUpdate(sql);

			System.out.println(count == 1?"保存成功":"保存失败");

			//5、处理查询结果集
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			//6、释放资源
			//为保证资源一定释放，在finally语句块中关闭资源
			//并从小到大分别关闭（先关Statement再关Conntection）,且分别try catch
			try{
				if(stmt != null){
					stmt.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			try{
				if(conn != null){
					conn.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
	}
}