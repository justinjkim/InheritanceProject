package com.company;

public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    // right now compiler is complaining there's no default class because I haven't set the super method yet

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
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

    public String setStatus(String status) {
        super.status = status;
        return super.status;
    }

    // auto-generated
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
        return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
    }

    // auto-generated
    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() {
        // return super.clone(); - this is the original return statement automatically generated
        // I'm not sure if I understand the directions clearly, but I think I'm supposed to create a new instance? sorry, the code below is highlighted in red, not sure what it's asking...
        return new EmailNotification(String subject, String body, String recipient, String smtpProvider);
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

    @Override
    public String printText(String text) {
        System.out.println("Some more text after the override.");
        return super.printText(text);

    }
}
