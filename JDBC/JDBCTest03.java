import java.sql.*;
public class JDBCTest03{
	public static void main(String[] args){
		Statement stmt = null;
		Connection conn = null;
		try{
			//1��ע������
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			//2����ȡ����
			String url = "jdbc:mysql://localhost:3306/bjpowernode";
			String user = "root";
			String password = "123456";
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("���ݿ����ӳɹ���" + conn);
			//3���������ݿ����
			stmt = conn.createStatement();
			//4��ִ�����ݿ����
			String sql = "update dept set LOC = '����' where DEPTNO = 70";
			int count = stmt.executeUpdate(sql);
			System.out.println(count == 1?"����ɹ�":"����ʧ��");
			//5�����²�ѯ�����
		}
		catch (SQLException e){
			e.printStackTrace();
		}finally{
			//6���ͷ���Դ
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
