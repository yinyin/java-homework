
public class ConfigContent
{
	public String user_account;
	public int employee_sn;
	public String[] server_address;

	public ConfigContent(String user_account, int employee_sn, String[] server_address)
	{
		this.user_account = user_account;
		this.employee_sn = employee_sn;
		this.server_address = server_address;
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof ConfigContent))
		{ return false; }
		ConfigContent c = (ConfigContent)(obj);
		if(c.user_account.equals(this.user_account)
			&& (c.employee_sn == this.employee_sn)
			&& (c.server_address.equals(this.server_address)))
		{
			return true;
		}
		return false;
	}
}

