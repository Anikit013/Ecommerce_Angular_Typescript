//package hbase;
//import java.io.IOException;
//
//import org.apache.hadoop.conf.Configuration;
//import org.apache.hadoop.hbase.HBaseConfiguration;
//import org.apache.hadoop.hbase.TableName;
//import org.apache.hadoop.hbase.client.Connection;
//import org.apache.hadoop.hbase.client.ConnectionFactory;
//import org.apache.hadoop.hbase.client.Result;
//import org.apache.hadoop.hbase.client.ResultScanner;
//import org.apache.hadoop.hbase.client.Scan;
//import org.apache.hadoop.hbase.client.Table;
//public class HbaseSample {
//	static Configuration conf = HBaseConfiguration.create();
//	public static Table configuration() throws IOException {
//		conf.set("hbase.zookeeper.quorum", "localhost");	
//		conf.set("hbase.zookeeper.property.clientPort", "2181");
//
//		Connection connection = ConnectionFactory.createConnection(conf);
//		Table table =connection.getTable(TableName.valueOf("customers"));
//		
////		Scan scan1 = new Scan();
////		ResultScanner resscan = table.getScanner(scan1);
////		
////
////		for(Result res : resscan) {
////			System.out.println(res);
////		}
//		
//		return table;
//	}
//}
//
////By this we created the connection between the hbase and spring.
