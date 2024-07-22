import java.sql.*;
public class Pupdate{
	public static void main(String args[]){
		Connection con = null;
		PreparedStatement ps = null;
		String url = "jdbc:mysql://localhost:3306/company";
		String user = "root";
      String pass = "tnrao";
        
		try{
		con = DriverManager.getConnection(url,user,pass);
			
		String sql = "update emp2 set name = ? where id = ?";
		
		ps = con.prepareStatement(sql);
		
		ps.setString(1,"Kashyap Thakor");
		ps.setInt(2,1);
		
		
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
