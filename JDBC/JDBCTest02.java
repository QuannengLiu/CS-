import java.sql.*;
public class JDBCTest02{

	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		try{
			//��һ����ע������
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);

			//�ڶ�������ȡ����
			String url = "jdbc:mysql://localhost:3306/bjpowernode";
			String user = "root";
			String password = "123456";
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("���ݿ����ӳɹ���" + conn);
			//����������ȡ���ݿ��������
			stmt = conn.createStatement();
			//���Ĳ���ִ��sql���
			String sql = "update dept set LOC='�ɶ�' where DEPTNO=80";
			int count = stmt.executeUpdate(sql);
			System.out.println(count==1?"����ɹ�":"����ʧ��");
			//���岽�������ѯ�����
		}catch(SQLException e){
				e.printStackTrace();
		}finally{
			//���������ͷ���Դ
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