package pl.sly.android.retrofit.example.rest.core;

import pl.sly.android.retrofit.example.rest.core.base.BaseResponseEvent;
import retrofit2.Call;

/**
 * Wrapper for HTTP request and response.
 */
public final class RestRequest {

    private final Call call;
    private final BaseResponseEvent baseResponseEvent;
    private final boolean useStickyIntent;

    /**
     * Constructor.
     *
     * @param builder instance of {@link Builder} for build request object.
     */
    public RestRequest(Builder builder) {
        this.call = builder.call;
        this.baseResponseEvent = builder.baseResponseEvent;
        this.useStickyIntent = builder.useStickyIntent;
    }

    /**
     * Get {@link Call} instance.
     *
     * @return {@link Call} instance.
     */
    public Call getCall() {
        return call;
    }

    /**
     * Get {@link BaseResponseEvent} instance.
     *
     * @return {@link BaseResponseEvent} instance.
     */
    public BaseResponseEvent getBaseResponseEvent() {
        return baseResponseEvent;
    }

    /**
     * Check if {@link org.greenrobot.eventbus.EventBus} should use
     * {@link org.greenrobot.eventbus.EventBus#postSticky(Object)}.
     *
     * @return true/false if should use sticky intent.
     */
    public boolean isUseStickyIntent() {
        return useStickyIntent;
    }

    /**
     * Check if {@link BaseResponseEvent} is set.
     *
     * @return true/false if {@link BaseResponseEvent} is not null.
     */
    public boolean hasBaseResponseEvent() {
        return baseResponseEvent != null;
    }

    /**
     * Builder of {@link RestRequest}.
     */
    public static class Builder {

        private Call call;
        private BaseResponseEvent baseResponseEvent;
        private boolean useStickyIntent;

        /**
         * Add {@link Call} instance.
         *
         * @param call instance of {@link Call}.
         * @return self instance of {@link Builder}
         */
        public Builder call(Call call) {
            this.call = call;
            return this;
        }

        /**
         * Add {@link BaseResponseEvent} instance.
         *
         * @param baseResponseEvent BaseResponseEvent of {@link Call}.
         * @return self instance of {@link Builder}
         */
        public Builder baseResponseEvent(BaseResponseEvent baseResponseEvent) {
            this.baseResponseEvent = baseResponseEvent;
            return this;
        }

        /**
         * Add true/false flag if use sticky intent.
         * See {@link org.greenrobot.eventbus.EventBus#postSticky(Object)}.
         *
         * @param useStickyIntent true/false if use sticky intent.
         * @return self instance of {@link Builder}
         */
        public Builder useStickyIntent(boolean useStickyIntent) {
            this.useStickyIntent = useStickyIntent;
            return this;
        }

        /**
         * Create new instance of {@link Builder}
         *
         * @return self instance of {@link Builder}
         */
        public RestRequest build() {
            return new RestRequest(this);
        }
    }
}
