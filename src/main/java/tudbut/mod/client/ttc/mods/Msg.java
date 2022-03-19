package tudbut.mod.client.ttc.mods;

import tudbut.api.impl.TudbuTAPI;
import tudbut.api.impl.TudbuTAPIV2;
import tudbut.mod.client.ttc.TTC;
import tudbut.mod.client.ttc.utils.ChatUtils;
import tudbut.mod.client.ttc.utils.Module;
import tudbut.mod.client.ttc.utils.WebServices;

import java.util.UUID;

public class Msg extends Module {
    
    @Override
    public boolean displayOnClickGUI() {
        return false;
    }
    
    @Override
    public void onEveryChat(String s, String[] args) {
    }
}
