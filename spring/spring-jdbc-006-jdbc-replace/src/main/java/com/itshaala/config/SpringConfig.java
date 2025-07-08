package com.itshaala.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
@PropertySource("classpath*:application.properties")
public class SpringConfig {

    @Autowired
    private Environment environment;

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
      /*  ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/isj013");
        ds.setUsername("root");
        ds.setPassword("root");*/
        ds.setDriverClassName(environment.getProperty("mysql.driver.class"));
        ds.setUrl(environment.getProperty("mysql.url"));
        ds.setUsername(environment.getProperty("mysql.username"));
        ds.setPassword(environment.getProperty("mysql.password"));
        return ds;
    }
}
