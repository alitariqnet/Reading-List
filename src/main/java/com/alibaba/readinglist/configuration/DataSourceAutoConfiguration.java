//package com.alibaba.readinglist.configuration;
//
//import org.hibernate.sql.exec.spi.JdbcOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Conditional;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import org.springframework.jdbc.core.JdbcTemplate;
//
///*
//As you can see, DataSourceAutoConfiguration is a @Configuration-annotated class
//that (among other things) imports some additional configuration from other configuration
//classes and defines a few beans of its own. What’s most important to notice here
//is that DataSourceAutoConfiguration is annotated with @ConditionalOnClass to
//require that both DataSource and EmbeddedDatabaseType be available on the classpath.
//If they aren’t available, then the condition fails and any configuration provided
//by DataSourceAutoConfiguration will be ignored.
// */
//@Configuration
////@ConditionalOnClass({DataSource.class, EmbeddedDataType.class})
//@EnableConfigurationProperties(DataSourceProperties.class)
////@Import({Registrar.class, DataSourcePoolMetadataProvidersConfiguration.class})
//public class DataSourceAutoConfiguration {
//
//    @Configuration
////    @Conditional(DataSourceAutoConfiguration.DataSourceAvailableCondition.class)
//    protected static class JdbcTemplateConfiguration{
////        @Autowired(required = false)
////        private DataSource dataSource;
////        @Bean
////        @ConditionalOnMissingBean(JdbcOperation.class)
////        public JdbcTemplate jdcbTemplate(){
////            return new JdbcTemplate(this.dataSource);
////        }
//    }
//}
