package org.quarzt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
//@EnableEurekaClient
@EntityScan("org.quarzt.entity")
@EnableJpaRepositories("org.quarzt.dao")
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@ComponentScan(basePackages={"org.quarzt.web","org.quarzt.conf"})
public class QuarztApplication 
{
	private static Logger Logger = LoggerFactory.getLogger(QuarztApplication.class);
    public static void main( String[] args )
    {
    	SpringApplication.run(QuarztApplication.class, args);
    	Logger.info("------quarzt服务启动成功--------");
    }
}
