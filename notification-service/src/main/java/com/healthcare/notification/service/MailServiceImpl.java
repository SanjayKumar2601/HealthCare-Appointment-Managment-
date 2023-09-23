package com.healthcare.notification.service;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import java.time.LocalDate;

@Service
public class MailServiceImpl implements MailService{
    private static final String SUCCESS_MESSAGE ="success";
    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${subject}")
    private String subject;

    @Value("${default-email}")
    private String sender;

    @Value("${default-text}")
    private String defaultText;
    @Override
    public String sendEmail(String email, LocalDate date) throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
        mimeMessageHelper.setFrom(sender);
        mimeMessageHelper.setTo(email);
        mimeMessageHelper.setText(defaultText+" "+date);
        mimeMessageHelper.setSubject(subject);
        javaMailSender.send(mimeMessage);
        return "SUCCESS";
    }
}
