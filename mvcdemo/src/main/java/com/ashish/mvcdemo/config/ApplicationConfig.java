package com.ashish.mvcdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

//@Configuration
//@EnableRedisHttpSession
//@ComponentScan("com.ashish.mvcdemo")
public class ApplicationConfig {

	@Value("${ashish.test}")
	private String testProperty;

	/*
	 * @Bean public RedisHttpSessionConfiguration httpSessionConfiguration() {
	 * return new RedisHttpSessionConfiguration(); }
	 */

	
	/*
	 * @Bean public LettuceConnectionFactory connectionFactory() {
	 * System.out.println("Hiiiii" + testProperty); LettuceConnectionFactory
	 * lettuceConnectionFactory = new LettuceConnectionFactory(); return
	 * lettuceConnectionFactory; }
	 */
	 
}
