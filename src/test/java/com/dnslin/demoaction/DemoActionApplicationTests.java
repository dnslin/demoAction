package com.dnslin.demoaction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import utils.MailClient;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;
import java.util.Map;

@SpringBootTest
public class DemoActionApplicationTests {
    @Autowired
    JavaMailSenderImpl mailSender;

    @Value("${spring.mail.username}")
    private String username;

    @Test
    public void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("wjy");
        message.setText("核酸做不完");
        message.setTo("i@zr.ci"); //收件人邮箱地址,请自行修改
        message.setFrom(username);
        mailSender.send(message);
    }
}
