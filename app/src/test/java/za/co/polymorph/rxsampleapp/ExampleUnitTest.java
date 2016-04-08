package za.co.polymorph.rxsampleapp;

import android.widget.Button;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import za.co.polymorph.rxsampleapp.app.activity.MainActivity;

import static org.assertj.android.api.Assertions.assertThat;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(sdk = 21, constants = BuildConfig.class, packageName = "za.co.polymorph.rxsampleapp")
public class ExampleUnitTest {

    private Button btnHello;
    private TextView tvHello;

    @Before
    public void setup() {
        final MainActivity activity = Robolectric.buildActivity(MainActivity.class).create().get();
        btnHello = (Button) activity.findViewById(R.id.btnHello);
        tvHello = (TextView) activity.findViewById(R.id.tvHello);
    }

    @Test
    public void testHelloButton() {
        assertThat(btnHello).hasText("Click Me");
        assertThat(tvHello).hasText("Hello RxSample App");
        btnHello.performClick();
        assertThat(tvHello).hasText("Hello Button");
    }
}