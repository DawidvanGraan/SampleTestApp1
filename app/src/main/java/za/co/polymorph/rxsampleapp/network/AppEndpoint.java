package za.co.polymorph.rxsampleapp.network;

import retrofit2.http.GET;
import rx.Observable;
import za.co.polymorph.rxsampleapp.domain.api.Deck;

public interface AppEndpoint {

    @GET("/deck/new/")
    Observable<Deck> getNewDeck();

    @GET("/deck/new/shuffle/")
    Observable<Deck> getNewDeckShuffled();


}
