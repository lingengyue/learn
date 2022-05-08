package mvc.dispatcher;

import mvc.adapter.HandlerAdapter;
import mvc.adapter.HttpHandlerAdapter;
import mvc.adapter.SimpleHandlerAdapter;
import mvc.controller.HttpController;
import mvc.controller.SimpleController;

import java.util.ArrayList;
import java.util.List;

/**
 * 适配器模式
 * 每个Controller对应一个HandlerAdapter去适配调用
 */
public class DispatcherServlet {

    private static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    static {
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
    }

    private HandlerAdapter getHandlerAdapter(Object handler) {
        for (HandlerAdapter handlerAdapter : handlerAdapters) {
            if (handlerAdapter.supported(handler)) {
                return handlerAdapter;
            }
        }
        return null;
    }

    public void doDispatcher(Object handler) {
        getHandlerAdapter(handler).handle(handler);
    }

    public static void main(String[] args) {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        HttpController httpController = new HttpController();
        dispatcherServlet.doDispatcher(httpController);

        SimpleController simpleController = new SimpleController();
        dispatcherServlet.doDispatcher(simpleController);
    }
}
