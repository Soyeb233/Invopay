package com.messaging.commons;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.converter.SimpleMessageConverter;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;

@Configuration
public class Config {

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @Value("${borker_url}")
    private String url;
    @Bean
    public ConnectionFactory connectionFactory() throws JMSException {
        ActiveMQConnectionFactory connectionFactory =  new ActiveMQConnectionFactory();
//        connectionFactory.setBrokerURL("tcp://DESKTOP-61VQ03V:61616");
//        connectionFactory.setPassword("admin");
//        connectionFactory.setUserName("admin");
//        return connectionFactory;
        connectionFactory.setBrokerURL(url);
        connectionFactory.setPassword(password);
        connectionFactory.setUserName(username);
        return connectionFactory;
    }

    @Bean
    public JmsTemplate jmsTemplate() throws JMSException {
        JmsTemplate template = new JmsTemplate();
        template.setConnectionFactory(connectionFactory());
        template.setDefaultDestinationName("email");
        return template;
    }

    @Bean
    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() throws JMSException {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory());
        factory.setConcurrency("1-1");
        return factory;
    }

    @Bean
    MessageConverter converter(){
        return  new SimpleMessageConverter();
    }

}
