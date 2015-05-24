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
		getLogger().info("JoinMsgPlus ���ڼ��� by mingtfarc");
		getServer().getPluginManager().registerEvents(new MsgListening(), this);
		getLogger().info("1/3 ����ļ���");
		File dir=new File("./plugins/JoinMsgPlus");
		if(!dir.exists())
		{
			getLogger().info("�����ļ��в����ڣ����ڴ���");
			dir.mkdir();
		}
		getLogger().info("2/3 ��������ļ�");
		File conf=new File("./plugins/JoinMsgPlus/config.yml");
		if(!conf.exists())
		{
			getLogger().info("�����ļ������ڣ����ڴ���");
			this.saveDefaultConfig();
		}
		getLogger().info("3/3 ����������");
		pre=getConfig().getString("prefix", "&a[JoinMsgPlus]&b").replaceAll("&", "��");
		msg=getConfig().getString("msg", "&b%player%�����˷�����").replaceAll("&", "��");//%player%��ʱδ����
		getLogger().info("JoinMsgPlus �������");
	}

	@Override
	public void onDisable()
	{
		getLogger().info("JoinMsgPlus �ѹر� by mingtfarc");
	}
}
