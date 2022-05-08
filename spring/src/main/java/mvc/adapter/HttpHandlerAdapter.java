package mvc.adapter;

import mvc.controller.HttpController;

public class HttpHandlerAdapter implements HandlerAdapter{
    @Override
    public boolean supported(Object handler) {
        return handler instanceof HttpController;
    }

    @Override
    public void handle(Object handler) {
        ((HttpController) handler).doSomething();
    }
}
