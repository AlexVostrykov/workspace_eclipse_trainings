package sqlconnect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class ConnectMSSQLServer
{
   public void dbConnect(String db_connect_string,
            String db_userid,
            String db_password)
   {
      try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection conn = DriverManager.getConnection(db_connect_string,
                  db_userid, db_password);
         System.out.println("connected");
         Statement statement = conn.createStatement();
         String queryString = "select * from sysobjects";// where type='u'";
         ResultSet rs = statement.executeQuery(queryString);
         while (rs.next()) {
            System.out.println(rs.getString(1));
         }
         
         // inserting data:
         System.out.println("INSERTing data:");
         
         PreparedStatement insertStmt = conn.prepareStatement("INSERT INTO [dbo].[TestTable]([TestField]) VALUES (?);");
         insertStmt.setString(1, "y");
         insertStmt.execute();
         
         System.out.println("Successfully inserted");
         
         /*
          * Calling a stored proc named stpTest (@fakeParam int);
          */
         System.out.println("calling stored proc:");
         
         CallableStatement stpCall = conn.prepareCall("{?=call dbo.stpTest (?)}");
         stpCall.registerOutParameter(1, Types.INTEGER);
         stpCall.setInt(2, 2323);
         ResultSet rs1 = stpCall.executeQuery();
         while (rs1.next()) {
        	 System.out.println(rs1.getString(2));
	     }
         
         
         System.out.println("Successfully called a stored proc");
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public static void main(String[] args)
   {
      ConnectMSSQLServer connServer = new ConnectMSSQLServer();
      connServer.dbConnect("jdbc:sqlserver://MW100711\\SQLEXPRESS;databaseName=TestDb;", "test", "test");
   }
}