package za.co.polymorph.rxsampleapp.di.modules;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import za.co.polymorph.rxsampleapp.BuildConfig;
import za.co.polymorph.rxsampleapp.network.AppBackend;
import za.co.polymorph.rxsampleapp.network.AppEndpoint;
import za.co.polymorph.rxsampleapp.network.Backend;

@Module
public class ApiModule {
    private String baseUrl;

    public ApiModule(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Provides
    @Singleton
    Backend provideBackend(AppEndpoint endpoints) {
        return new AppBackend(endpoints);
    }

    @Provides
    @Singleton
    AppEndpoint provideAppEndpoint(Retrofit retrofit) {
        return retrofit.create(AppEndpoint.class);
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(Converter.Factory converterFactory,
                             OkHttpClient okHttpClient,
                             RxJavaCallAdapterFactory rxJavaCallAdapterFactory) {

        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addCallAdapterFactory(rxJavaCallAdapterFactory)
                .addConverterFactory(converterFactory)
                .client(okHttpClient)
                .build();
    }

    @Provides
    @Singleton
    RxJavaCallAdapterFactory provideRxJavaCallAdapterFactory() {
        return RxJavaCallAdapterFactory.create();
    }

    @Provides
    @Singleton
    Converter.Factory provideConverterFactory(Gson gson) {
        return GsonConverterFactory.create(gson);
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder().create();
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient() {
        OkHttpClient okHttpClient = new OkHttpClient();

        //okHttpClient.interceptors().add(interceptor);

        if (BuildConfig.DEBUG)
            okHttpClient.networkInterceptors().add(new StethoInterceptor());

        return okHttpClient;
    }

}
