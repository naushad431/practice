package in.practice.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.jms.ConnectionFactory;

@Configuration
public class ActiveMqConfig {

	@Bean
	public ConnectionFactory connection() {
		ActiveMQConnectionFactory am= new ActiveMQConnectionFactory();
		am.setBrokerURL("tcp://localhost:61616");
		am.setUserName("admin");
		am.setPassword("admin");
		return am;
	}
}
