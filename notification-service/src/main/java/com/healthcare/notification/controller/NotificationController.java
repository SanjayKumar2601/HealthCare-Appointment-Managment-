package com.healthcare.notification.controller;
import com.healthcare.notification.service.MailService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/notification")
public class NotificationController {
    @Autowired
    private MailService service;
    @GetMapping("/email-notification/{username}/{date}")
    public String mailNotification(@PathVariable String username,@PathVariable LocalDate date) throws MessagingException {
        return service.sendEmail(username,date);
    }
}