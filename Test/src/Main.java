import java.util.logging.Logger;

public class Main {
    Logger logger = Logger.getLogger(getClass().getName());
    public static void main(String[] args) {
       Main main = new Main();
       main.doSomething();
    }

    public void doSomething(){
        logger.info("Hello world!");
    }
}