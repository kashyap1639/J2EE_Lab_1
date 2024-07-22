import java.sql.*;
public class Pselect{
	public static void main(String args[]){
		Connection con = null;
		Statement st = null;
		ResultSet rs;
		String url = "jdbc:mysql://localhost:3306/company";
		String user = "root";
      String pass = "tnrao";
        
		try{
		con = DriverManager.getConnection(url,user,pass);
			
		String sql = "select * from emp2 where id>=3";
		
		st = con.createStatement();
		
		/*ps.setInt(1,3);
		ps.setString(2,"devansh");
		ps.setString(3,"clerk");
		ps.setString(4,"New York");*/
		
		rs = st.executeQuery(sql);
		
		while(rs.next()){
			System.out.println("Number:"+rs.getInt(1));
			System.out.println("Name:"+rs.getString(2));
			System.out.println("Designation:"+rs.getString(3));
			System.out.println("city:"+rs.getString(4));
		}
		
		con.close();
		st.close();
		rs.close();
		
		}
		catch (Exception e) {
    		System.out.println("Error Generated: " + e.getMessage());
    		e.printStackTrace();
		}
	}
}
