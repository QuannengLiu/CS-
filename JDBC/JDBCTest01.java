import java.sql.*;
public class JDBCTest01{
	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		try{
			//1��ע������
			//driver�Ǹ��ӿڣ�û��new������Ҫ��driver��ʵ���ࡣ
			//Driver driver = new com.mysql.cj.jdbc.Driver();
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);

			//2����ȡ����
			String url = "jdbc:mysql://localhost:3306/bjpowernode";
			String user = "root";
			String password = "123456";
				//conn��Ҫ����try catch�������涨�壬��Ȼ���ܹر�
				//getConnection��DriverManager��һ����̬������static Connection getConnection
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("���ݿ����Ӷ���" + conn);
			//3����ȡ���ݿ��������
			stmt = conn.createStatement();

			//4��ִ��sql���
			String sql = "insert into dept(DEPTNO,DNAME,LOC) value(80,'���²�','����')";

			int count = stmt.executeUpdate(sql);

			System.out.println(count == 1?"����ɹ�":"����ʧ��");

			//5�������ѯ�����
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			//6���ͷ���Դ
			//Ϊ��֤��Դһ���ͷţ���finally�����йر���Դ
			//����С����ֱ�رգ��ȹ�Statement�ٹ�Conntection��,�ҷֱ�try catch
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