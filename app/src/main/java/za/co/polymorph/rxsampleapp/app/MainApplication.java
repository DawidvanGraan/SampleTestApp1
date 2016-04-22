package za.co.polymorph.rxsampleapp.app;

import android.app.Application;
import android.content.Context;
import android.os.StrictMode;

import com.facebook.stetho.Stetho;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import za.co.polymorph.rxsampleapp.BuildConfig;
import za.co.polymorph.rxsampleapp.di.components.AppComponent;
import za.co.polymorph.rxsampleapp.di.components.DaggerAppComponent;
import za.co.polymorph.rxsampleapp.di.modules.PrefsModule;

public class MainApplication extends Application {

    public static boolean DEVELOPER_MODE = true;

    private AppComponent appComponent;
    private RefWatcher refWatcher;

    @Override
    public void onCreate() {
        super.onCreate();

        // Crashlytics.setString("git_sha", BuildConfig.GIT_SHA);


        if (DEVELOPER_MODE) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                    .detectDiskReads()
                    .detectDiskWrites()
                    .detectNetwork()   // or .detectAll() for all detectable problems
                    .penaltyLog()
                    .build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                    .detectLeakedSqlLiteObjects()
                    .detectLeakedClosableObjects()
                    .penaltyLog()
                    .penaltyDeath()
                    .build());
        }

        if (BuildConfig.DEBUG) {
            refWatcher = LeakCanary.install(this);
            Stetho.initializeWithDefaults(this);
            //Timber.plant(new Timber.DebugTree());
        }

        // Dagger%COMPONENT_NAME%
        appComponent = DaggerAppComponent.builder()
                // list of modules that are part of this component need to be created here too
                .prefsModule(new PrefsModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public static RefWatcher getRefWatcher(Context context) {
        MainApplication application = (MainApplication) context.getApplicationContext();
        return application.refWatcher;
    }
}

