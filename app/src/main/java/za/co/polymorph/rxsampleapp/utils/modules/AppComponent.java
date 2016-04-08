package za.co.polymorph.rxsampleapp.utils.modules;

import javax.inject.Singleton;

import dagger.Component;
import za.co.polymorph.rxsampleapp.app.activity.MainActivity;

@Singleton
@Component(modules={PrefsModule.class})
public interface AppComponent {

    void inject(MainActivity activity);
    // void inject(MyFragment fragment);
    // void inject(MyService service);
}
