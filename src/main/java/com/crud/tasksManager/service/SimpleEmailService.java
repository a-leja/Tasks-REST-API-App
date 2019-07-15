package com.crud.tasksManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class SimpleEmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void send(final String receiverEmail, final String subject, final String message) {

        LOGGER.info("Starting email preparation...");

        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setTo(receiverEmail);
            mailMessage.setSubject(subject);
            mailMessage.setText(message);

            javaMailSender.send(mailMessage);

            LOGGER.info("Email has been sent.");

        } catch (MailException e) {

            LOGGER.error("Failed to process email sending: ", e.getMessage(), e);
        }
    }
}
