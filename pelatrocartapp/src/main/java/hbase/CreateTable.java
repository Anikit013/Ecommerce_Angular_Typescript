//package hbase;
//
//import java.io.IOException;
//
//import org.apache.hadoop.conf.Configuration;
//import org.apache.hadoop.hbase.HBaseConfiguration;
//import org.apache.hadoop.hbase.HColumnDescriptor;
//import org.apache.hadoop.hbase.HTableDescriptor;
//import org.apache.hadoop.hbase.TableName;
//import org.apache.hadoop.hbase.client.Admin;
//import org.apache.hadoop.hbase.client.Connection;
//import org.apache.hadoop.hbase.client.ConnectionFactory;
//
//
//
//public class CreateTable {
//
//	public static void main(String[] args) throws IOException {
//		
//		Configuration conf = HBaseConfiguration.create();
//		Connection connection = ConnectionFactory.createConnection(conf);
//		
//		Admin admin = connection.getAdmin();
//		
//		HTableDescriptor tableName = new HTableDescriptor(TableName.valueOf("mytable"));
//		
//		tableName.addFamily(new HColumnDescriptor("colfam1"));
//		tableName.addFamily(new HColumnDescriptor("colfam2"));
//		
//		if (!admin.tableExists(tableName.getTableName())) {
//			System.out.println("Creating Table");
//			admin.createTable(tableName);
//			System.out.println("DONE");
//			
//		}
//		
//		
//	}
//
//}
