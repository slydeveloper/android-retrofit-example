package pl.sly.android.retrofit.example.rest.service.event;

import pl.sly.android.retrofit.example.rest.core.base.BaseResponseEvent;
import pl.sly.android.retrofit.example.rest.service.model.Weather;

/**
 * Event of result send via {@link org.greenrobot.eventbus.EventBus}.
 */
public class GetWeatherResponseEvent extends BaseResponseEvent<Weather> {

}