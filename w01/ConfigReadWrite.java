

class ConfigReadWrite
{
	public static void SaveConfig(ConfigContent cfg)
	{
		// TODO: implement
	}

	public static ConfigContent LoadConfig()
	{
		// TODO: implement
		return null;
	}

	public static void main(String arg[])
	{
		ConfigContent cfg_in;
		ConfigContent cfg_out;

		cfg_in = new ConfigContent("user01", 1, new String[] {"192.168.100.1", "192.168.100.2", "192.168.30.19"});
		ConfigReadWrite.SaveConfig(cfg_in);
		cfg_out = ConfigReadWrite.LoadConfig();
		System.out.println("W01: check case 1: "+(cfg_in.equals(cfg_out) ? "OK" : "Failed"));

		cfg_in = new ConfigContent("user02", 65536, new String[] {"mx1.for-test.com.tw", "mx2.for_test.com", "[IPV6:Long:ADDRESS::0000"});
		ConfigReadWrite.SaveConfig(cfg_in);
		cfg_out = ConfigReadWrite.LoadConfig();
		System.out.println("W01: check case 2: "+(cfg_in.equals(cfg_out) ? "OK" : "Failed"));
	}
}
