package za.co.polymorph.rxsampleapp.domain.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CardImages {
    @SerializedName("png")
    @Expose
    public String png;
    @SerializedName("svg")
    @Expose
    public String svg;
}
