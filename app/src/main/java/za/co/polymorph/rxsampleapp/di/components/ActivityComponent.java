package za.co.polymorph.rxsampleapp.di.components;

import dagger.Component;
import za.co.polymorph.rxsampleapp.app.activity.MainActivity;
import za.co.polymorph.rxsampleapp.di.scope.PerActivity;

@PerActivity
@Component(dependencies = AppComponent.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}

