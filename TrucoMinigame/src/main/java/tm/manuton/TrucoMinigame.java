package tm.manuton;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import tm.manuton.config.CustomConfig;
import tm.manuton.utils.MessageUtils;
import tm.manuton.utils.Metrics;
import tm.manuton.utils.UpdateChecker;

public class TrucoMinigame extends JavaPlugin {
    public static String prefix = null;
    private final String version = getDescription().getVersion();
    private static TrucoMinigame plugin;
    private final String link = "";
    private final int pluginIdSpigot = 0; // ADD PLUGIN ID SPIGOT //
    public void onEnable() {
        plugin = this;
        CustomConfig configFile;
        configFile = new CustomConfig("config.yml", null, TrucoMinigame.getPlugin());
        configFile.registerConfig();
        FileConfiguration config = configFile.getConfig();

        Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage("&f&l------------------------------------------------"));
        Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage(prefix+"&fHas been enabled. &cVersion: "+version));
        Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage("&f&l------------------------------------------------"));

        if (getMainConfigManager().isEnabledMetrics()){
            int pluginId = 24201; // ID OF PLUGIN IN BSTATS //
            Metrics metrics = new Metrics(this, pluginId);
            Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage(prefix+"&aMetrics are enabled."));
        }else
            Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage(prefix+"&cMetrics are not enabled :c."));

        new UpdateChecker(this, pluginIdSpigot).getVersion(versionn -> {
            if (version.equals(versionn)) {
                Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage(prefix+"&fThere is not a new update available."));
            } else {
                Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage(prefix+"&fThere is a new update available."));
                Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage(prefix+"&cVersion: "+versionn+ " &eLink: "+link));
            }
        });
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage("&f&l------------------------------------------------"));
        Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage(prefix+"&fHas been disabled. &cVersion: "+version));
        Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage("&f&l------------------------------------------------"));
    }

    public static TrucoMinigame getPlugin() {
        return plugin;
    }


}