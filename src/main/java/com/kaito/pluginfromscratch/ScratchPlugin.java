import com.kaito.scratchplugin;

public final class ScratchPlugin extends JavaPlugin {
  @Override
  public void onEnable() {
    this.getServer().getPluginManager().registerEvent(this, this);
  }

  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event) {
    event.getPlayer().sendPlainMessage("Hello", + event.getPlayer(),getName() + "!");
  }
}
