import java.sql.*;
public class Pdelete{
	public static void main(String args[]){
		Connection con = null;
		PreparedStatement ps = null;
		String url = "jdbc:mysql://localhost:3306/company";
		String user = "root";
      String pass = "tnrao";
        
		try{
		con = DriverManager.getConnection(url,user,pass);
			
		String sql = "delete from emp2 where id = ?";
		
		ps = con.prepareStatement(sql);
		
		ps.setInt(1,4);
		
		
		int r = ps.executeUpdate();
		
		if(r>0){
			System.out.println("Record Insert Succesfully...");
		}
		else{
			System.out.println("Record Not Insert Succesfully...");
		}
		
		con.close();
		ps.close();
		
		}
		catch (Exception e) {
    		System.out.println("Error Generated: " + e.getMessage());
    		e.printStackTrace();
}
	}
}
