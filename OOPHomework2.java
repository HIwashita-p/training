// 2.Look at exercise above, we are using the syntax below to send email:
//   Let refactor the source code on the exercise to use syntax below to send email
// (LINK: https://gitlab.com/pascaliaasia/pav-training/-/blob/basic-training/basic-programing/java/oop-exercise.md)

import java.util.ArrayList;
import java.util.List;

abstract class Emailer {
    // Declare properties
    protected String sender;
    protected List<String> recipients;
    protected String subject;
    protected String body;

    // Use Constructor to initialize sender and recipients
    public Emailer(String sender) {
        this.sender = sender;
        this.recipients = new ArrayList<String>(); 
    }

    public Emailer addRecipients(String recipient) {
        this.recipients.add(recipient);
    	return this;
    }

    public Emailer setSubject(String subject) {
        this.subject = subject;
    	return this;
    }

    public Emailer setBody(String body) {
        this.body = body;
    	return this;
    }

    /**
    * abstract method
    */
    public abstract void send();
}

// Implement method send for SendGrid and MailChimp

class SendGrid extends Emailer {
  public SendGrid(String sender) {
    super(sender);
  }
  
  public void send() {
    for (String recipient : this.recipients) {
      System.out.println("SendGrid successfully sent to " + recipient);
      System.out.println("Sender: " + this.sender);
      System.out.println("Subject: " + this.subject);
      System.out.println("Content: " + this.body);
    }
  }
}

class MailChimp extends Emailer {
  public MailChimp(String sender) {
    super(sender);
  }

  public void send() {
    for (String recipient : this.recipients) {
      System.out.println("MailChimp successfully sent to " + recipient);
      System.out.println("Sender: " + this.sender);
      System.out.println("Subject: " + this.subject);
      System.out.println("Content: " + this.body);
    }
  }
}


//public class Main {
public class OOPHomework2 {
    public static void main(String[] args) {
        // SendGrid
        SendGrid sgEmailer = new SendGrid("youremail@yourdomain.com");
        sgEmailer.addRecipients("emailID@domain.com")
                 .setSubject("Just a Test")
                 .setBody("Hi Name, How are you?")
                 .send();
        
        // MailChimp
        MailChimp mcEmailer = new MailChimp("youremail@yourdomain.com");
        mcEmailer.addRecipients("emailID@domain.com")
                 .setSubject("Just a Test")
                 .setBody("Hi Name, How are you?")
                 .send();
        
    }
}