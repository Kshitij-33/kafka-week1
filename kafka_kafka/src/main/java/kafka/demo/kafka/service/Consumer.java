package kafka.demo.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "ABC" , groupId="ABC_group")
	public void listenToTopic(String recievedMessage)
	{
		System.out.println("The message is "+recievedMessage);
		
	}
}
