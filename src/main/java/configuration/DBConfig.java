package configuration;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import oracle.jdbc.datasource.impl.OracleDataSource;

@Configuration
@Profile("oracle")
public class DBConfig {

	
	@Bean
    public DataSource dataSource() throws SQLException {
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUser("books");
        dataSource.setPassword("books");
        dataSource.setURL("jdbc:oracle:thin:@//localhost:11521/ORCLPDB1");
        dataSource.setImplicitCachingEnabled(true);
        return dataSource;
    }
}