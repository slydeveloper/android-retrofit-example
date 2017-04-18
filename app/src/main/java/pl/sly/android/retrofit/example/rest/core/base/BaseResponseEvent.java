package pl.sly.android.retrofit.example.rest.core.base;

/**
 * Event propagated when HTTP request accomplished.
 * @param <T> the type of the value.
 */
public abstract class BaseResponseEvent<T> {

    private T response;
    private int code;
    private boolean isCanceled;

    /**
     * Get response of HTTP request.
     *
     * @return response data.
     */
    public T getResponse() {
        return response;
    }

    /**
     * Set response of HTTP request.
     *
     * @param response data.
     */
    public void setResponse(T response) {
        this.response = response;
    }

    /**
     * Get HTTP status code.
     *
     * @return HTTP status code.
     */
    public int getCode() {
        return code;
    }

    /**
     * Set HTTP status code.
     *
     * @param code HTTP status code.
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Returns true if request has been canceled.
     *
     * @return true/false.
     */
    public boolean isCanceled() {
        return isCanceled;
    }

    /**
     * Sets true if request has been canceled.
     *
     * @param canceled true/false.
     */
    public void setCanceled(boolean canceled) {
        isCanceled = canceled;
    }

    /**
     * Returns true if request contains response.
     *
     * @return true/false.
     */
    public boolean hasResponse() {
        return response != null;
    }
}
