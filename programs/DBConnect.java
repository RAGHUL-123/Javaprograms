
// // /*Program :Design following using JDBC
// // Pre-requisites:- 
// // Jdk version 8,  mysql-connector-java-5.1.49 (any version above 4)
// // */
// // import java.sql.*;

// // class DBConnect
// // {
// // 	Statement s;
// // 	Connection c;
// // 	DBConnect()
// // 	{
// // 		try
// // 		{
// // 			Class.forName("com.mysql.jdbc.Driver");
// // 			c=DriverManager.getConnection("jdbc:mysql://localhost/db1","root","3278");  //test1 is dbname,   root is dbusername and dbpassword
// // 			s=c.createStatement();
// // 			s.execute("create table JavaLab(name text(16),surname text(6),city text(6))");
// // 			System.out.println("Table created");
// // 		}

// // 		catch(Exception e)
// // 		{
// // 			e.printStackTrace();
// // 		}
// // 	}

// // 	public static void main(String args[])
// // 	{
// // 		DBConnect x=new DBConnect();
// // 	}
// // }

// /*Program :Design following using JDBC
// Pre-requisites:- 
// Jdk version 8,  mysql-connector-j-9.0.0 (any version above 4)
// */
// import java.sql.*;

// import java.sql.*;

// class DBConnect {
//     Statement s;
//     Connection c;

//     DBConnect() {
//         try {
//             Class.forName("com.mysql.jdbc.Driver");
//             c = DriverManager.getConnection("jdbc:mysql://localhost/db2", "root", "3278");  // test1 is dbname, root is dbusername and dbpassword
//             s = c.createStatement();
//             s.execute("CREATE TABLE IF NOT EXISTS sri(name VARCHAR(16), surname VARCHAR(6), city VARCHAR(20), product_name VARCHAR(16))");
//             System.out.println("Table created or already exist");
//         } catch (Exception e) {
//             e.printStackTrace();
//         } finally {
//             try {
//                 if (s != null) s.close();
//                 if (c != null) c.close();
//             } catch (SQLException e) {
//                 e.printStackTrace();
//             }
//         }
//     }

//     public static void main(String args[]) {
//         DBConnect x = new DBConnect();
//     }
// }

// import java.sql.*;

// class DBConnect {
//     Statement s;
//     Connection c;

//     DBConnect() {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");  // Updated driver class name
//             c = DriverManager.getConnection("jdbc:mysql://localhost/db2", "root", "3278");  // Ensure your database credentials are correct
//             s = c.createStatement();
//             s.execute("CREATE TABLE IF NOT EXISTS sri(name VARCHAR(16), surname VARCHAR(6), city VARCHAR(20), product_name VARCHAR(16))");
//             System.out.println("Table created or already exists");
//         } catch (ClassNotFoundException e) {
//             System.out.println("MySQL JDBC Driver not found.");
//             e.printStackTrace();
//         } catch (SQLException e) {
//             System.out.println("Connection failed.");
//             e.printStackTrace();
//         } finally {
//             try {
//                 if (s != null) s.close();
//                 if (c != null) c.close();
//             } catch (SQLException e) {
//                 e.printStackTrace();
//             }
//         }
//     }

//     public static void main(String args[]) {
//         DBConnect x = new DBConnect();
//     }
// }

import java.sql.*;

class DBConnect {
    Statement s;
    Connection c;

    DBConnect() ;
    {
        try {
            // Ensure the MySQL JDBC driver is in your classpath
            Class.forName("com.mysql.cj.jdbc.Driver");  // Updated driver class name
            c = DriverManager.getConnection("jdbc:mysql://localhost/db2", "root", "3278");  // Ensure your database credentials are correct
            s = c.createStatement();
            s.execute("CREATE TABLE IF NOT EXISTS sri(name VARCHAR(16), surname VARCHAR(6), city VARCHAR(20), product_name VARCHAR(16))");
            System.out.println("Table created or already exists");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        } finally {
            try {
                if (s != null) s.close();
                if (c != null) c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        DBConnect x = new DBConnect();
    }
}
