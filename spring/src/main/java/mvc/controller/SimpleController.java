package mvc.controller;

public class SimpleController implements Controller {


    @Override
    public void handle() {
        System.out.println("SimpleController");
    }
}
