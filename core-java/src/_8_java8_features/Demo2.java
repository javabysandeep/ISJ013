package _8_java8_features;

public class Demo2 {
    public static void main(String[] args) {

        abstract class MessageService {
            public abstract void send(String message);
        }

        //subclass creation using anonymous way
        MessageService messageService = new MessageService() {
            @Override
            public void send(String message) {
                System.out.println("sending message using anonymous class "+message);
            }
        };
        messageService.send("Hello World");



    }
}
