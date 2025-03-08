package PrototypePattern;

public class ConnectionProvider implements Cloneable {
	private String ip;
	private String impinfo;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getImpinfo() {
		return impinfo;
	}
	public void setImpinfo(String impinfo) {
		this.impinfo = impinfo;
	}
	//this method takes time of 5 seconds to run
	//to avoid this we will use the clone method
	public void loadImportantInformation() throws InterruptedException {
		this.impinfo="Very important information";
		Thread.sleep(5000);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "ConnectionProvider [ip=" + ip + ", impinfo=" + impinfo + "]";
	}
	
	
}
