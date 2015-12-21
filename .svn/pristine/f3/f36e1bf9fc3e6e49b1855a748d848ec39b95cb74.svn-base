//package com.checkAuto.appium.testcases.makemytrip;
//
// 
//import java.sql.Connection;
//import java.sql.DatabaseMetaData;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
// 
///**
// * This program demonstrates how to establish database connection to Microsoft
// * SQL Server.
// * @author www.codejava.net
// *
// */
//public class connectMSSQL2 {
//	
///*	-- To allow advanced options to be changed.
//	EXEC sp_configure 'show advanced options', 1
//	GO
//	-- To update the currently configured value for advanced options.
//	RECONFIGURE
//	GO
//	-- To enable the feature.
//	EXEC sp_configure 'xp_cmdshell', 1
//	GO
//	-- To update the currently configured value for this feature.
//	RECONFIGURE
//	GO
//
//	EXEC master..xp_cmdshell 'bcp Testdb2.dbo.Demo_A out c:\Temp.xls -c -q -S"ap4\Net2012" -U"sa" -P"sA"'*/
//	
//	
//	
// 
//	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
//		Connection conn = DriverManager.getConnection("jdbc:sqlserver://192.168.200.51;user=uxintest;password=123456;database=AutoDetectDBNew");
//		System.out.println("查询指定licensecar");
//		Statement sta = conn.createStatement();
//		String Sql = "declare @licensecar varchar (20) set @licensecar='沪DHL2335' select [DetectItemID],[DetectDefectID],[DetectLevel] from [AuctionCarSourceDetect]  where CarSourceID=(select CarID from carinfo where LicenseCar= @licensecar)";
//		ResultSet rs = sta.executeQuery(Sql);
//		while (rs.next()) {
//			System.out.println(rs.getString("DetectDefectID"));
//		}
//	}
//}