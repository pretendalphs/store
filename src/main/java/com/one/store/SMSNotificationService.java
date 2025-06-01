package com.one.store;

import org.springframework.stereotype.Service;

@Service
public class SMSNotificationService implements NotificationService {
    @Override
    public void sent(String message) {
        // Logic to send SMS notification
        System.out.println("SMS sent with message: " + message);
    }
}
