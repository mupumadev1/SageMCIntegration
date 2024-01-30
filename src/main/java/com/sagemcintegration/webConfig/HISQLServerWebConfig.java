package com.sagemcintegration.webConfig;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.Objects;
import java.util.Properties;
@Configuration
@PropertySource({"classpath:application.properties"})
@EnableJpaRepositories(
        basePackages = "com.sagemcintegration.repository.mssql.hi",
        entityManagerFactoryRef = "SecondarySQLServerEntityManager",
        transactionManagerRef = "SecondarySQLServerTransactionManager")
public class HISQLServerWebConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.third-datasource")
    public DataSourceProperties secondarySQLServerSpringDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource secondarySQLServerSpringDataSource() {
        return secondarySQLServerSpringDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean SecondarySQLServerEntityManager() {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(secondarySQLServerSpringDataSource());
        em.setPackagesToScan(
                "com.sagemcintegration.model.mssql.hi");
        em.setPersistenceProviderClass(HibernatePersistenceProvider.class);
        em.setJpaProperties(getJpaProperties());
        return em;
    }

    @Bean
    public PlatformTransactionManager SecondarySQLServerTransactionManager() {
        return new JpaTransactionManager(Objects.requireNonNull(SecondarySQLServerEntityManager().getObject()));
    }

    private Properties getJpaProperties() {
        Properties props = new Properties();
        props.put("hibernate.dialect", "org.hibernate.dialect.SQLServerDialect");
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.format_sql", "true");
        return props;
    }
}
