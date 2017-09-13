package com.company;

import javax.xml.soap.Text;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EmailNotification emailNotification = new EmailNotification("Hello", "It's great to hear from you, George.", "Justin", "SendGrid");
        TextNotification textNotification = new TextNotification("Hey", "Dinner at 8?", "Deanna", "Verizon");
        emailNotification.transport();
        textNotification.transport();
    }
}
