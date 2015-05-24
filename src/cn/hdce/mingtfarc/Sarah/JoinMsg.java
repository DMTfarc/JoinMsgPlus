package cn.hdce.mingtfarc.Sarah;

import java.io.File;
import org.bukkit.plugin.java.JavaPlugin;

public class JoinMsg extends JavaPlugin
{
	public static String pre;
	public static String msg;
	@Override
	public void onEnable()
	{
		getLogger().info("JoinMsgPlus 正在加载 by mingtfarc");
		getServer().getPluginManager().registerEvents(new MsgListening(), this);
		getLogger().info("1/3 检查文件夹");
		File dir=new File("./plugins/JoinMsgPlus");
		if(!dir.exists())
		{
			getLogger().info("配置文件夹不存在，正在创建");
			dir.mkdir();
		}
		getLogger().info("2/3 检查配置文件");
		File conf=new File("./plugins/JoinMsgPlus/config.yml");
		if(!conf.exists())
		{
			getLogger().info("配置文件不存在，正在创建");
			this.saveDefaultConfig();
		}
		getLogger().info("3/3 加载配置项");
		pre=getConfig().getString("prefix", "&a[JoinMsgPlus]&b").replaceAll("&", "§");
		msg=getConfig().getString("msg", "&b%player%加入了服务器").replaceAll("&", "§");//%player%此时未处理
		getLogger().info("JoinMsgPlus 加载完成");
	}

	@Override
	public void onDisable()
	{
		getLogger().info("JoinMsgPlus 已关闭 by mingtfarc");
	}
}
