package com.healthcare.notification.service;

import jakarta.mail.MessagingException;

import java.time.LocalDate;

public interface MailService {
    String sendEmail(String email, LocalDate date) throws MessagingException;
}
