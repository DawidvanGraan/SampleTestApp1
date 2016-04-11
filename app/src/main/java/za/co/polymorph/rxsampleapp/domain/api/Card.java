package za.co.polymorph.rxsampleapp.domain.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Card {

    @SerializedName("suit")
    @Expose
    public String suit;
    @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("image")
    @Expose
    public String image;
    @SerializedName("images")
    @Expose
    public CardImages images;
    @SerializedName("value")
    @Expose
    public String value;
}
