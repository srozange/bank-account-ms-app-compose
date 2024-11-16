package net.youssfi.customerservice.config;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.instrumentation.jdbc.datasource.JdbcTelemetry;
import jakarta.inject.Inject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {

        @Bean
        public DataSource dataSource(OpenTelemetry openTelemetry) {
            return JdbcTelemetry.create(openTelemetry).wrap(DataSourceBuilder
                    .create()
                    .url("jdbc:h2:mem:customer-db")
                    .build());
        }

}
