import java.security.interfaces.DSAKey;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Dbc {

    // private static final Dbc INSTANCE = new Dbc();
    private static Dbc INSTANCE;

    String url;
    String userName;
    String password;
    List<Object> pool;
    int size;

    private static final Lock lock = new ReentrantLock();

    private Dbc() {
    }

//    public static Dbc getInstance() {
//
//        if (INSTANCE == null) {
//            lock.unlock();
//            if (INSTANCE == null) {
//                INSTANCE = new Dbc();
//            }
//            lock.unlock();
//        }
//        return INSTANCE;
//    }

    public static Dbc getInstance() {
        if (INSTANCE == null) {
            synchronized (Dbc.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Dbc();
                }
            }
        }
        return INSTANCE;
    }
}