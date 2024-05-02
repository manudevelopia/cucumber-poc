package info.developia.testing.poc;

import io.cucumber.core.cli.Main;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        init(args);
    }

    public static void init(String[] args){
        Main.main(args);
    }
}
