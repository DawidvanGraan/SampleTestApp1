package za.co.polymorph.rxsampleapp.app.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.jakewharton.rxbinding.view.RxView;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action1;
import rx.subscriptions.CompositeSubscription;
import za.co.polymorph.rxsampleapp.R;
import za.co.polymorph.rxsampleapp.app.MainApplication;
import za.co.polymorph.rxsampleapp.utils.prefs.AppPreferences;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btnHello)
    View btnHello;
    @Bind(R.id.etInput1)
    EditText etInput1;
    @Bind(R.id.lMain)
    View lMain;
    @Bind(R.id.tvHello)
    TextView tvHello;

//    @Inject
//    AppPreferences prefs;

    private CompositeSubscription mCompositeSubscription = new CompositeSubscription();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Dagger inject
        ((MainApplication) getApplication()).getAppComponent().inject(this);

        // Butterknife bind view
        ButterKnife.bind(this);

        // Attach a click event
        Subscription sub1 = RxView.clicks(btnHello)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(x -> {
                    // do what you need here
                    tvHello.setText("Hello Button");
                }, crashOnError());
        mCompositeSubscription.add(sub1);

        // Example Crash
//        Observable.empty()
//                .first()
//                .subscribe(o -> {
//                    // onNext
//                }, crashOnError());

        // Example Crash
//        Observable.empty()
//                .first()
//                .subscribe(o -> {
//                    // onNext
//                });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mCompositeSubscription.clear();
    }


    public static Action1<Throwable> crashOnError() {
        final Throwable checkpoint = new Throwable();
        return throwable -> {
            StackTraceElement[] stackTrace = checkpoint.getStackTrace();
            StackTraceElement element = stackTrace[1]; // First element after `crashOnError()`
            String msg = String.format("onError() crash from subscribe() in %s.%s(%s:%s)",
                    element.getClassName(),
                    element.getMethodName(),
                    element.getFileName(),
                    element.getLineNumber());

            throw new OnErrorNotImplementedException(msg, throwable);
        };
    }
}
