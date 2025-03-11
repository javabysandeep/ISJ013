package _7_oops.polymorphism;

public class Demo2 {
    public static void main(String[] args) {
        class MessageService {
            void sendMessage(String message) {
                System.out.println("sending message using email : " + message);
            }
        }

        class WhatsApp extends MessageService {
           //method overriding
            public void sendMessage(String message) {
                System.out.println("sending message through whatsApp: " + message);
            }
        }

        MessageService messageService = new WhatsApp();
        messageService.sendMessage("hi");
    }
}
