package za.co.polymorph.rxsampleapp.utils.prefs;

import android.content.Context;
import android.content.res.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import za.co.polymorph.rxsampleapp.R;

/**
 * Reads properties from main/res/raw/app.properties [DEBUG-BUILD] or release/res/raw/app.properties [RELEASE-BUILD]
 */
public final class AppProperties {
    public static final String TRUE = "true";

    private Properties props;

    public static class BuildVariant {
        public static String DEBUG = "debug";
        public static String DEMO = "demo";
        public static String EXTERNAL = "external";
        public static String RELEASE = "release";
    }

    public AppProperties(final Context context) {
        InputStream raw = null;
        try {
            raw = context.getResources().openRawResource(R.raw.app);
            this.props = new Properties();
            this.props.load(raw);
        } catch (Resources.NotFoundException rnf) {
            // FIXME
        } catch (IOException ioe) {
            // FIXME
        } finally {
            try {
                if (raw != null) raw.close();
            } catch (Throwable t) {
                //nop
            }
        }
    }

    /**
     * Returns the property value for the specified {@code tag}
     *
     * @param key a named property
     * @return the property value
     */
    public String getProperty(String key) {
        return this.props.getProperty(key);
    }

    /**
     * Returns the boolean value for the specified {@code tag}
     *
     * @param key a named property
     * @return the true or false
     */
    public boolean getBoolean(String key) {
        return TRUE.equals(getProperty(key));
    }
}
