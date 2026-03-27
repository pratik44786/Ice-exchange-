package A1;

import android.os.Handler;
import android.os.Looper;

public class e extends Handler {
    public e(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
