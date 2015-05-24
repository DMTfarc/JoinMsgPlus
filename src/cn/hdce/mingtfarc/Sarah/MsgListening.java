package cn.hdce.mingtfarc.Sarah;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.permissions.Permission;

public class MsgListening implements Listener
{
	@EventHandler
	public void PlayerLoginEvent(PlayerJoinEvent e)
	{
		Player p = e.getPlayer();		
		if (p.hasPermission("JoinMsgPlus.broadcast"))
		{
			e.setJoinMessage(null);
			Bukkit.broadcastMessage(JoinMsg.pre+JoinMsg.msg.replaceAll("%player%", p.getName()));
		}
	}
}
