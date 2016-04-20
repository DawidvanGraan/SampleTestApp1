package za.co.polymorph.rxsampleapp.di.components;

import javax.inject.Singleton;

import dagger.Component;
import za.co.polymorph.rxsampleapp.app.activity.MainActivity;
import za.co.polymorph.rxsampleapp.di.modules.PrefsModule;

@Singleton
@Component(modules={PrefsModule.class})
public interface AppComponent {

    void inject(MainActivity activity);
    // void inject(MyFragment fragment);
    // void inject(MyService service);
}
