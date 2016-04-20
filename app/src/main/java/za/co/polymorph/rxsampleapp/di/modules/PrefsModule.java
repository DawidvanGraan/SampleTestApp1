package za.co.polymorph.rxsampleapp.di.modules;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import za.co.polymorph.rxsampleapp.utils.prefs.AppPreferences;
import za.co.polymorph.rxsampleapp.utils.prefs.AppProperties;

@Module
public class PrefsModule {

    private Context context;

    public PrefsModule(Context ctx) {
        this.context = ctx;
    }

    @Provides
    @Singleton
    AppPreferences provideAppPreferences() {
        return new AppPreferences(context);
    }

    @Provides
    @Singleton
    AppProperties provideAppProperties() {
        return new AppProperties(context);
    }
}
