import java.sql.*;
public class Pinsert{
	public static void main(String args[]){
		Connection con = null;
		PreparedStatement ps = null;
		String url = "jdbc:mysql://localhost:3306/company";
		String user = "root";
      String pass = "tnrao";
        
		try{
		con = DriverManager.getConnection(url,user,pass);
			
		String sql = "insert into emp2(id,name,desig,city) values(?,?,?,?)";
		
		ps = con.prepareStatement(sql);
		
		ps.setInt(1,4);
		ps.setString(2,"kalpesh");
		ps.setString(3,"mng");
		ps.setString(4,"New York");
		
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
