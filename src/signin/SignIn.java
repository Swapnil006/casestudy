package signin;

public class SignIn 
{
	private String userName;
	private String password;
	
	public SignIn(String userName, String password) 
	{
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean verify(String userName,String password)
	{
		if(userName==this.getUserName() && password == this.getPassword())
		{
			System.out.println("password matched");
			return true;
		}
		System.out.println("Passwrd not matched");
		return false;
	}
}
