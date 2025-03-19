package _7_oops.abstraction;

public class Demo4 {
    public static void main(String[] args) {
        interface MessageService {
            void sendMessage(String message);
        }
        class WhatsAppMessageService implements MessageService {
            @Override
            public void sendMessage(String message) {
                System.out.println("sending message using whatsApp " + message);
            }
        }
        MessageService messageService = new WhatsAppMessageService();
        messageService.sendMessage("good morning");
    }
}
