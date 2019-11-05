package org.multithread;

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
public class MultithreadApplication 
{
	private static Logger Logger = LoggerFactory.getLogger(MultithreadApplication.class);
    public static void main( String[] args )
    {
    	SpringApplication.run(MultithreadApplication.class, args);
        Logger.info("----多线程测试服务启动成功-------");
    }
}
