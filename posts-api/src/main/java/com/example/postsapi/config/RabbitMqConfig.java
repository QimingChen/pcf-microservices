package com.example.postsapi.config;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("pcf")
public class RabbitMqConfig {

  @Bean
  public ConnectionFactory rabbitConnectionFactory() {
    String hostname = "termite.rmq.cloudamqp.com";
    int port = 5672;
    String username = "xaomxryn";
    String password = "Ptx0muIDUma9lXpXpMhMbdalF7fNxLzL";
    String vhost = username;
    CachingConnectionFactory connectionFactory = new CachingConnectionFactory(hostname);
    connectionFactory.setUsername(username);
    connectionFactory.setPassword(password);
    connectionFactory.setPort(port);
    connectionFactory.setVirtualHost(vhost);
    return connectionFactory;
  }
}