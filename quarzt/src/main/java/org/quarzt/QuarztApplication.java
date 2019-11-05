package org.quarzt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class QuarztApplication 
{
	private static Logger Logger = LoggerFactory.getLogger(QuarztApplication.class);
    public static void main( String[] args )
    {
    	SpringApplication.run(QuarztApplication.class, args);
    	Logger.info("------quarzt服务启动成功--------");
    }
}
