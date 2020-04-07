package com.javaspringdatarestendpoint.javaspringdatarest.configuration;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/***
 * This configuration bean is used to enable allowOrigins, this is needed in order to expose our service.
 * It's a security feature that prevents the service to be exposed without security.
 */

@Configuration
public class RestConfiguration {

    @Bean
    public FilterRegistrationBean corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration().applyPermitDefaultValues();
        source.registerCorsConfiguration("/**", config);
        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
        bean.setOrder(0);
        return bean;
    }

    /**
     * Another possible configuration when the allowedOrigins can be more restricted
     **/
    //    @Configuration
    //    public class ConfigRepositoryRest implements RepositoryRestConfigurer {
    //        @Override
    //        public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
    //            config.getCorsRegistry()
    //                    .addMapping("/**")
    //                    .allowedOrigins("http://localhost:3000");
    //        }

}