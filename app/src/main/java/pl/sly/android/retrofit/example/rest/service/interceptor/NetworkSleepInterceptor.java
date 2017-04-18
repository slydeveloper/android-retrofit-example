package pl.sly.android.retrofit.example.rest.service.interceptor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.Response;
import timber.log.Timber;

/**
 * Simulate sleep of HTTP request
 */
public class NetworkSleepInterceptor implements Interceptor {

    private int timeout;
    private TimeUnit timeUnit;

    /**
     * Constructor.
     *
     * @param timeout in unit depends on {@link TimeUnit}
     * @param timeUnit instance define unit ouf timeout.
     */
    public NetworkSleepInterceptor(int timeout, TimeUnit timeUnit) {
        this.timeout = timeout;
        this.timeUnit = timeUnit;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Timber.d("Intercept");
        sleep();
        return chain.proceed(chain.request());
    }

    /**
     * Sleep thread for some time.
     */
    private void sleep() {
        try {
            Timber.d("Start sleep");
            timeUnit.sleep(timeout);
            Timber.d("Stop sleep");
        } catch (InterruptedException e) {
            Timber.e("Interrupted", e);
        }
    }
}