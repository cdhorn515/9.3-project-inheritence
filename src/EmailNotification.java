/**
 * Created by cdhorn on 7/19/17.
 */
public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider, String serviceProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;

    }

    public String getRecipient() {
        return recipient;
    }
    public String getSmtpProvider() {
        return smtpProvider;
    }
    @Override
    public void transport () {
        System.out.println("Current values: recipient: " + this.recipient + " smtpProvider: "+ this.smtpProvider + " subject: "+ getSubject() + " body: "+ getBody()+ " createdAt: " + getCreatedAt());
    }
    @Override
    public void misc () {
        System.out.println("And now the method is public");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

       EmailNotification emailNotification2 = new EmailNotification(getSubject(), getBody(), this.recipient, this.smtpProvider, this.serviceProvider);
        return emailNotification2;
    }
}

