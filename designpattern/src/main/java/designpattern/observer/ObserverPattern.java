package designpattern.observer;

/**
 * 观察者模式
 * 注册观察者到服务，由服务通知观察者
 */
public class ObserverPattern {

    public static void main(String[] args) {
        // 服务
        WeatherData weatherData = new WeatherData();
        // 观察者
        CurrentConditions currentConditions = new CurrentConditions();
        // 注册观察者
        weatherData.registerObserver(currentConditions);
        weatherData.setData(32F, 101F, 65F);
    }
}
