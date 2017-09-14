package com.company;

import java.io.IOException;
import java.time.LocalDateTime;

public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();

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

    public void showStatus() {
        System.out.println(status);
    }

    protected String printText(String text) {
        System.out.println(text);
        return text;
    }

    public void transport() throws NoTransportException { // forewarns there may be a NoTransportException; "BEWARE...proceed at own risk"
        // hmm what is supposed to go here?
    }
}
