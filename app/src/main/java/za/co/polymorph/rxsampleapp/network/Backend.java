package za.co.polymorph.rxsampleapp.network;

import rx.Observable;
import za.co.polymorph.rxsampleapp.domain.api.Deck;

public interface Backend {

    // /deck/new/:
    // /deck/new/shuffle/:


    Observable<Deck> getNewDeck();

    Observable<Deck> getNewDeckShuffled();
}
