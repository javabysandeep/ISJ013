package _8_java8_features;

public class Demo1 {
    public static void main(String[] args) {

        abstract class MessageService {
            public abstract void send(String message);
        }

        //1. subclass creation using traditional way
        class WhatsApp extends MessageService {
            public void send(String message) {
                System.out.println("sending message using whatsApp : "+message);
            }
        }

        MessageService service = new WhatsApp();
        service.send("Good morning");


    }
}
