package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class issuerecorddao
{
	private Connection connection;
	private PreparedStatement insertstatement;
	private PreparedStatement updatestatement;
	private PreparedStatement deletestatement;
	private PreparedStatement selectstatement;

	public issuerecorddao() throws Exception 
	{
	this.deletestatement=connection.prepareCall("");
	this.insertstatement=connection.prepareCall("");
	this.selectstatement=connection.prepareCall("");
	this.updatestatement=connection.prepareCall("");
	}

}
