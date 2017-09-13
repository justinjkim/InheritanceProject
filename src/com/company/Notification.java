package com.company;

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
        this.status = "Good";
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

    public void transport() throws NoTransportException {

    }
}
