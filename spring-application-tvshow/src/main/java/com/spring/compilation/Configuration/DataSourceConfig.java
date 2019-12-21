package com.spring.compilation.Configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

public class DataSourceConfig {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.mariadb.jdbc.Driver");
        dataSourceBuilder.url("jdbc:mariadb://192.168.1.2:3306/foosballaudit");
        dataSourceBuilder.username("foosballuser");
        dataSourceBuilder.password("root");
        return dataSourceBuilder.build();
    }
}