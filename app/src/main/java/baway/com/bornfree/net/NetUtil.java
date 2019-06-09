package baway.com.bornfree.net;

public class NetUtil {
    private static final NetUtil ourInstance = new NetUtil();

    public static NetUtil getInstance() {
        return ourInstance;
    }

    private NetUtil() {
    }
    public void doHttpGet(final String url,final NetUtil.CallBackTask backTask){

    }
    public interface CallBackTask{
        void onSuccess(String s);
        void onError(int code,String msg);
    }
}
