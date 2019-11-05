package org.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication 
{
	private static Logger Logger = LoggerFactory.getLogger(EurekaApplication.class);
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaApplication.class, args);
        Logger.info("---------注册中心启动成功----------");
    }
}
