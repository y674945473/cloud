package org.quarzt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableEurekaClient
@ComponentScan(value="org.quarzt.dao.JobEntityRepository")
public class QuarztApplication 
{
	private static Logger Logger = LoggerFactory.getLogger(QuarztApplication.class);
    public static void main( String[] args )
    {
    	SpringApplication.run(QuarztApplication.class, args);
    	Logger.info("------quarzt服务启动成功--------");
    }
}
