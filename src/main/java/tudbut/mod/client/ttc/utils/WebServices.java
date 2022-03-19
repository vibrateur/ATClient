package tudbut.mod.client.ttc.utils;

import net.minecraft.client.Minecraft;
import tudbut.api.impl.RateLimit;
import tudbut.api.impl.TudbuTAPIV2;
import tudbut.mod.client.ttc.TTC;
import tudbut.net.pbic2.PBIC2;
import tudbut.net.pbic2.PBIC2AEventHandler;
import tudbut.net.pbic2.PBIC2AListener;
import tudbut.obj.DoubleTypedObject;
import tudbut.parsing.JSON;
import tudbut.parsing.TCN;
import tudbut.tools.Lock;

import java.io.IOException;
import java.util.ArrayList;

public class WebServices {
    
    public static PBIC2 client;
    public static PBIC2AEventHandler handler = new PBIC2AEventHandler();
    public static Lock keepAliveLock = new Lock(true);
    private static final PBIC2AListener listener = new PBIC2AListener() {
        @Override
        public void onMessage(String s) throws IOException {
        }
        
        @Override
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
        }
    };
    
    public static String[] usersOnline = new String[]{};
    
    public static void handshake() throws IOException, RateLimit {
    }
   
    private static void login() throws IOException, RateLimit {}
    
    private static boolean play() throws IOException, RateLimit {

        DoubleTypedObject<Boolean, String> s = null;
        return s.o;

}
   
    public static void doLogin() {}
    
    static ArrayList<TCN> queuedMessages = new ArrayList<>();
   
    public static void trackPlay() {}
   
    public static void queueMessage(TCN event) {}
   
    public static synchronized void sendQueuedMessages() {}
}
