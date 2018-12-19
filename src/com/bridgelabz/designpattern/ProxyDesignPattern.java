package com.bridgelabz.designpattern;

public class ProxyDesignPattern
{
	public static void main(String[] args) 
	{
		CommandExecutor executor = new CommandExecutorProxy("Admin", "Admin123");		
		try
		{
			executor.runCommand("ls -l");
			executor.runCommand("rm -rf abc.txt");
		}
		catch(Exception e)
		{
			System.out.println("Excetion "+e.getMessage());
		}
	}
}
interface CommandExecutor 
{
	public void runCommand(String cmd)throws Exception;
}

class CommandExecutorImpl implements CommandExecutor
{
	@Override
	public void runCommand(String cmd) throws Exception {
		Runtime.getRuntime().exec(cmd);
		System.out.println(" "+cmd+" command executed ");
	}
	
}

/**This command validate user that it is authorized user or not
 * if yes then allow user to use rm command
 * @author admin1 
 *
 */
class CommandExecutorProxy implements CommandExecutor
{
	private CommandExecutor executor;
	private boolean isAdmin;
	public CommandExecutorProxy(String username , String password)
	{
		if("Admin".equals(username) && "Admin123".equals(password))
			isAdmin=true;
		executor = new CommandExecutorImpl(); 
	}	
	@Override
	public void runCommand(String cmd) throws Exception 
	{
		if(isAdmin)
		{
			executor.runCommand(cmd);
		}
		else
		{
			if(cmd.trim().startsWith("rm"))
				throw new Exception("Delete cmd not allowed for non admin user ..!!");
			else
				executor.runCommand(cmd);
		}		
	}	
}
