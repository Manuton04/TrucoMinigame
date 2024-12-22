package tm.manuton.utils;

import tm.manuton.TrucoMinigame;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.UUID;

public class MessageUtils {

    // Can use MessageUtils.getColoredMessage(Message);
    public static String getColoredMessage(String message){
        if (message != null)
            return ChatColor.translateAlternateColorCodes('&', message);
        else
            return "";
    }

    public static String translateAll(OfflinePlayer p, String message){
        if (message == null)
            return "";

        if (p != null)
            message = message.replace("%player%", p.getName());
        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            message = PlaceholderAPI.setPlaceholders(p, message);
        }else{
            if (message.contains("%farmingplus_prefix%"))
                message = message.replace("%farmingplus_prefix%", TrucoMinigame.prefix);
        }
        message = getColoredMessage(message);
        return message;
    }

    public static boolean isStringEmpty(String string){
        return string.isEmpty() || string.isBlank();
    }

}
