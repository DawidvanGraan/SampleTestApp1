package za.co.polymorph.rxsampleapp.utils.modules.api;

import retrofit2.Retrofit;

public class AppBackend implements Backend {
    private final static String TAG = AppBackend.class.getSimpleName();

    private Retrofit retrofit;
    private AppEndpoint appEndpoint;

    public AppBackend(Retrofit retrofit) {
        this.retrofit = retrofit;
        this.appEndpoint = retrofit.create(AppEndpoint.class);
    }
}
