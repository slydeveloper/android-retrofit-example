package pl.sly.android.retrofit.example.rest.core;

import retrofit2.Call;

/**
 * Handler for make HTTP request and response.
 */
public final class RestCall {

    private Call call;
    private RestCallback callback;

    /**
     * Constructor.
     *
     * @param call instance of a Retrofit {@link Call} that sends a request to a server.
     * @param callback instance of a {@link RestCallback} that holds a response form a server.
     */
    public RestCall(Call call, RestCallback callback) {
        this.call = call;
        this.callback = callback;
    }

    /**
     * Check if call has been executed.
     *
     * @return true/false if executed.
     */
    public boolean isExecuted() {
        return call != null && call.isExecuted();
    }

    /**
     * Cancel call if has not been executed yet.
     */
    public void cancel() {
        if (isExecuted()) {
            call.cancel();

            if (callback != null) {
                callback.cancel();
            }
        }
    }
}
