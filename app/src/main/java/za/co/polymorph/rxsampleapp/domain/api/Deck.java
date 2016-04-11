package za.co.polymorph.rxsampleapp.domain.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("deck_id")
    @Expose
    private String deckId;
    @SerializedName("shuffled")
    @Expose
    private Boolean shuffled;
    @SerializedName("remaining")
    @Expose
    private Integer remaining;
    @SerializedName("cards")
    @Expose
    public List<Card> cards = new ArrayList<Card>();
}
