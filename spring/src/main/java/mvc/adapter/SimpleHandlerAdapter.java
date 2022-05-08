package mvc.adapter;

import mvc.controller.Controller;
import mvc.controller.SimpleController;

public class SimpleHandlerAdapter implements HandlerAdapter{
    @Override
    public boolean supported(Object handler) {
        return handler instanceof SimpleController;
    }

    @Override
    public void handle(Object handler) {
        ((Controller) handler).handle();
    }
}
