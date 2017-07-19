public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        EmailNotification myEmailNotification = new EmailNotification("hi", "hello message", "christina", "1234abcd", "Comcast");
        myEmailNotification.transport();
        myEmailNotification.provider();
        myEmailNotification.misc ();
        Object emailNotificationClone = null;
        try {
             emailNotificationClone = myEmailNotification.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        myEmailNotification.equals(emailNotificationClone);

        TextNotification myTextNotification = new TextNotification("bye", "goodbye message", "christina", "4321dcba");
        myTextNotification.transport();
        myTextNotification.provider();

    }
}

