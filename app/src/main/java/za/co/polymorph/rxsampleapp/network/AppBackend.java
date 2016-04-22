package za.co.polymorph.rxsampleapp.network;

import javax.inject.Inject;

import rx.Observable;
import za.co.polymorph.rxsampleapp.domain.api.Deck;


public class AppBackend implements Backend {
    private final static String TAG = AppBackend.class.getSimpleName();

    private AppEndpoint appEndpoints;

    @Inject
    public AppBackend(AppEndpoint appEndpoints) {
        this.appEndpoints = appEndpoints;
    }

    @Override
    public Observable<Deck> getNewDeck() {
        return appEndpoints.getNewDeck();
    }

    @Override
    public Observable<Deck> getNewDeckShuffled() {
        return appEndpoints.getNewDeckShuffled();
    }
}
