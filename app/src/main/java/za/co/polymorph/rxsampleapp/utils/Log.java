package za.co.polymorph.rxsampleapp.utils;

/**
 * Convenience Log wrapper
 */
public class Log {
    public static void d( final String tag, final String msg, final Object... vargs ) {
        android.util.Log.d( tag, String.format( msg, vargs ) );
    }
    public static void d( final String tag, final String msg, final Throwable throwable, final Object... vargs ) {
        android.util.Log.d( tag, String.format( msg, vargs ), throwable );
    }
    public static void w( final String tag, final String msg, final Object... vargs ) {
        android.util.Log.w( tag, String.format( msg, vargs ) );
    }
    public static void w( final String tag, final String msg, final Throwable throwable, final Object... vargs ) {
        android.util.Log.w( tag, String.format( msg, vargs ), throwable );
    }
    public static void e( final String tag, final String msg, final Object... vargs ) {
        android.util.Log.e( tag, String.format( msg, vargs ) );
    }
    public static void e( final String tag, final String msg, final Throwable throwable, final Object... vargs ) {
        android.util.Log.e( tag, String.format( msg, vargs ), throwable );
    }
}