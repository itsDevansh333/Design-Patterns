package PrototypePattern;

public class MAIN {
	public static void main(String[] args) throws InterruptedException {
		ConnectionProvider con=new ConnectionProvider();
		con.setIp("192.168.10.40");
		con.loadImportantInformation();
		
		ConnectionProvider con2=null;
		try {
			//this saves making time of 5 seconds for the ConnectionProvider Object
			con2=(ConnectionProvider) con.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		con2.setIp("192.168.20.13");
		System.out.println(con);
		System.out.println(con2);
		
	}
}
