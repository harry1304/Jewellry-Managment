package Model;

public class Admin extends Person{
	
	private String adminId;
	private String uname;
	private String password;
	private String confPassword;
	public String getUid() {
		return adminId;
	}
	public void setadminId(String uid) {
		this.adminId = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfPassword() {
		return confPassword;
	}
	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}
	
	

}
