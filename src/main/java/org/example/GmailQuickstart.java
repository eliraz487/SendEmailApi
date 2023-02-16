package org.example;


import javax.mail.MessagingException;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* class to demonstrate use of Gmail list labels API */
public class GmailQuickstart {
    public static void main(String[] args) {
        try {
            EmailSender.init("/Client.json");
            EmailSender.sendEmail("manraz487@gmail.com","try2","it work?");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}