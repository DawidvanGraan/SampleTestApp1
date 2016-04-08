package za.co.polymorph.rxsampleapp.domain;

import java.util.Currency;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Entry {
    public abstract Currency currency();
    public abstract long amount();

    public static Entry create(Currency currency, long amount) {
        return new AutoValue_Entry(currency, amount);
    }

    public String displayString() {
        return currency().getSymbol() + amount();
    }
}