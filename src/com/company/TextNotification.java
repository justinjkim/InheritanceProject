package com.company;

public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        printText("TextNotification, printing from a superclass method?");
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        // super.transport(); do I need this?
        System.out.println(super.getCreatedAt());
        System.out.println(super.getSubject());
        System.out.println(super.getBody());
        System.out.println(getRecipient());
        System.out.println(getSmsProvider());
    }
}
