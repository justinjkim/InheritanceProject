package com.company;

public class Email extends Notification {
    private String recipient;
    private String smtpProvider;

    // right now compiler is complaining there's no default class because I haven't set the super method yet

    public Email(String subject, String body, String recipient, String smtpProvider) {
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
    public void transport() throws NoTransportException {
        // super.transport(); do I need this?
        System.out.println(super.getCreatedAt());
        System.out.println(super.getSubject());
        System.out.println(super.getBody());
        System.out.println(getRecipient());
        System.out.println(getSmtpProvider());
    }
}
