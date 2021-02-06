package exp4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDataAcessPrep {


	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
					
					String query ="update emp set sal=? where empno=?";//update
					PreparedStatement upstmt = con.prepareStatement(query);
					
					upstmt.setString(1,"54000");
					upstmt.setString(2,"1204");
					
					
					int rows = upstmt.executeUpdate();
					System.out.println(rows+" row(s) updated");
					
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("select * from emp");
					System.out.println("empno\tename\tsal\tdept");
					while(rs.next()) {
						System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
					}
					con.close();
			
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	
	



}