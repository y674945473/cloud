package org.getway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication 
{
	private static Logger Logger = LoggerFactory.getLogger(ZuulApplication.class);
    public static void main( String[] args )
    {
    	SpringApplication.run(ZuulApplication.class, args);
        Logger.info("------zuul服务启动成功----------");
    }
}
