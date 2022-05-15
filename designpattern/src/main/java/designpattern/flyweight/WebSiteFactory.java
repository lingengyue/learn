package designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {

    private Map<String, WebSite> pool = new HashMap<>();

    public WebSite getWebSite(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }
}
