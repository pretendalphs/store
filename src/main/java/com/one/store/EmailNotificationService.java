package com.one.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {
    @Override
    public void sent(String message) {
        // Logic to send email notification
        System.out.println("Email sent with message: " + message);
    }
}
