import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;
public class TestmyDB {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Drive Found");
      Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/chakri ","root","root");
      System.out.println("Connection Success");
      Statement statement=connection.createStatement(); //to run query
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter id ,name and address to update");
      int a=scanner.nextInt();
      String n=scanner.next();
      String add=scanner.next();
      
      String uQuery =" UPDATE `chakri`.`studentdata` SET `studentname` = '"+n+"', `Address` = '"+add+"' WHERE (`ID` = '"+a+"')";
      statement.executeUpdate(uQuery);
      System.out.println("Data Updated");
      
            
//      Scanner scanner=new Scanner(System.in);
//      System.out.println("Enter ID, Studentname and Address");
//      int ID=scanner.nextInt();
//      String Studentname=scanner.next();
//      String Address=scanner.next();
//      
//      String query="INSERT INTO studentdata (`ID`, `studentname`, `Address`) VALUES ('"+ID+"', '"+Studentname+"', '"+Address+"');";
//       statement.executeUpdate(query);
//      System.out.println("Data Instered Successfully");	  
//	ResultSet rs=statement.executeQuery("SELECT * FROM chakri.studentdata");
//      while(rs.next())
//      {
//    	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//      }	
     }
		catch(Exception e) {
			System.out.println(e); 
		}
	}
}
