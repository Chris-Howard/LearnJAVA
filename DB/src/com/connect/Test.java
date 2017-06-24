/*
 * 
 * 
 * */
package com.connect;

import java.sql.*;

public class Test
{

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	Connection ct = null;
	Statement sm = null;
	 ResultSet rSet=null;
	try
	{
	  //  Class.forName("oracle.jdbc.driver.OracleDriver");
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    ct = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
	    sm = ct.createStatement();
	    rSet = sm.executeQuery("select * from dept");
	   
	   while (rSet.next())
	{
	    int deptno = rSet.getInt(1);
	    String danme=rSet.getString(2);
	    String loc = rSet.getString(3);
	    System.out.println(deptno+" "+danme+" "+loc);
	    
	}
	} catch (Exception e)
	{
	    // TODO: handle exception
	    e.printStackTrace();
	} finally
	{
	    try
	    {if (rSet!=null)
	    {
		rSet.close();
	    }
		if (sm != null)
		{
		    sm.close();
		}
		if (ct!=null)
		{
		    ct.close();
		}

	    } catch (SQLException e)
	    {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }

	}

    }

}
