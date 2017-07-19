import java.time.LocalDateTime;

/**
 * Created by cdhorn on 7/19/17.
 */
public class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String serviceProvider = "Charter";

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
    }
    public String getServiceProvider() {
        return serviceProvider;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public String getSubject() {
        return subject;
    }
    public String getBody() {
        return body;
    }

    public void transport () {
        try {
            throw new NoTransportException();
        } catch(Exception e) {
            System.out.println("oops! there's an error somewhere");
        }
    }


    public void provider () {
        System.out.println("Your service provider is " +  getServiceProvider());
    }

    protected void misc () {
        System.out.println("Random text from the protected method");
    }
}

