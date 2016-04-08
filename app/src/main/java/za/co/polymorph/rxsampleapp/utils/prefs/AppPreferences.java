package za.co.polymorph.rxsampleapp.utils.prefs;

import android.content.Context;
import android.content.SharedPreferences;

public class AppPreferences {

    /**
     * The Constant PREFS_NAMESPACE.
     */
    public static final String PREFS_NAMESPACE = "za.co.polymorph.rxsampleapp.prefs.app";
    private static final String TAG = AppPreferences.class.getSimpleName();

    private SharedPreferences prefs;
    private Context context;

    /**
     * Constructor
     *
     * @param context
     */
    public AppPreferences(Context context) {
        prefs = context.getSharedPreferences(PREFS_NAMESPACE,
                Context.MODE_PRIVATE);
        this.context = context;
    }
}
