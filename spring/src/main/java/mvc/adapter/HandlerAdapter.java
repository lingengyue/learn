package mvc.adapter;

public interface HandlerAdapter {

    public boolean supported(Object handler);

    public void handle(Object handler);
}
