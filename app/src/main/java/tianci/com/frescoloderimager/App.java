package tianci.com.frescoloderimager;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by Administrator on 2016/10/26.
 */
public class App extends Application
{

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
