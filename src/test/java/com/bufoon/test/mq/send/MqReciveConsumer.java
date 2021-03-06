package com.bufoon.test.mq.send;

import com.rabbitmq.client.*;

import java.io.IOException;

public class MqReciveConsumer {

  private final static String QUEUE_NAME = "hello";

  public static void main(String[] argv) throws Exception {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("localhost");
    factory.setUsername("devjqm");
    factory.setPassword("devjqm");
    factory.setPort(5672);
    factory.setVirtualHost("GDP_VHOST");
    Connection connection = factory.newConnection();
    Channel channel = connection.createChannel();

//    channel.queueDeclare(QUEUE_NAME, false, false, false, null);
    System.out.println(" [2] Waiting for messages. To exit press CTRL+C");
    Consumer consumer = new DefaultConsumer(channel) {
      @Override
      public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
          throws IOException {
        String message = new String(body, "UTF-8");
        System.out.println(" [2] Received '" + message + "'");
      }
    };
    channel.basicConsume(QUEUE_NAME, true, consumer);
  }
}