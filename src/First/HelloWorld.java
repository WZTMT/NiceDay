package First;

public class HelloWorld{
    public static void main(String[] args){
        GreetingService greetService1 = message -> System.out.println("Hello " + message);
        greetService1.sayMessage("hello");
    }

    @FunctionalInterface
    interface GreetingService
    {
        void sayMessage(String message);
    }

}
