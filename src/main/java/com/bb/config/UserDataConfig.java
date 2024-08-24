package com.bb.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "userEntityManagerFactory",
        transactionManagerRef = "userTransactionManager",
        basePackages = "com.user.repository")
public class UserDataConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.user-datasource")
    public DataSourceProperties sqlServerDataSourceProperties() {
        return new DataSourceProperties();
    }
    @Bean
    public DataSource sqlServerDataSource(@Qualifier("sqlServerDataSourceProperties") DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }

    @Bean(name = "userEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean sqlServerEntityManagerFactory(@Qualifier("sqlServerDataSource") DataSource sqlServerDataSource, EntityManagerFactoryBuilder builder) {

        return builder.dataSource(sqlServerDataSource)
                .packages("com.user.entity")
                .persistenceUnit("entity")
                .build();

    }

    @Bean(name = "userTransactionManager")
    public PlatformTransactionManager sqlServerTransactionManager(@Qualifier("userEntityManagerFactory")
                                                                              EntityManagerFactory factory) {
        return new JpaTransactionManager(factory);
    }
}