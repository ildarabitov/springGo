package com.ildar.sprinlearning.config;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
//@ConfigurationProperties(prefix="spring.datasource")
public class EmЬeddedJdbcConfig {
//    private String driverClassName;
//    private String url;
//
//    private String username;
//    private String password;
@Bean
    public DataSource dataSource(){
    try {
        EmbeddedDatabaseBuilder dbuilder = new EmbeddedDatabaseBuilder();
        return dbuilder.setType(EmbeddedDatabaseType.H2)
                .addScripts("classpath:resources/schema.sql", "classpath:resources/data.sql").build();
    }catch (Exception e){
        System.out.println(e+ " D a t a S o u r c e b e a n c a n n o t \" + \"Ье created!\"");
        return null;
    }
}
private Properties hibernateProperties(){
    Properties hibernateProp = new Properties();
    hibernateProp.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
    hibernateProp.put("hibernate.format sql", true);
    hibernateProp.put("hibernate.use sql comments", true);
    hibernateProp.put("hibernate.show_sql", true);
    hibernateProp.put("hibernate.max fetch_depth", 3);
    hibernateProp.put ("hibernate. jdbc.batch size", 10);
    hibernateProp.put ("hibernate.jdbc. fetch_size", 50);
    return hibernateProp;
}
@Bean
    public SessionFactory sessionFactory() throws IOException {
    LocalSessionFactoryBean sessionFactoryBean= new LocalSessionFactoryBean();
    sessionFactoryBean.setDataSource(dataSource());
    sessionFactoryBean.setPackagesToScan("com.ildar.sprinlearning.ch7.entities");
    sessionFactoryBean.setHibernateProperties(hibernateProperties());
    sessionFactoryBean.afterPropertiesSet();
    return sessionFactoryBean.getObject();
}
    @Bean
    public PlatformTransactionManager transactionManager() throws IOException {
        return new HibernateTransactionManager(sessionFactory());
    }
//
//    @Bean(name = "dataSource")
//    public DataSource getDataSource() {
//
//        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//        driverManagerDataSource.setDriverClassName(driverClassName);
//        driverManagerDataSource.setUrl(url);
//        driverManagerDataSource.setUsername(username);
//        driverManagerDataSource.setPassword(password);
//        return driverManagerDataSource;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getDriverClassName() {
//        return driverClassName;
//    }
//
//    public void setDriverClassName(String driverClassName) {
//        this.driverClassName = driverClassName;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }


}
