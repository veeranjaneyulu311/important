package com.example.secondproject;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@SpringBootApplication
public class SecondprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondprojectApplication.class, args);
	}
	
	@Bean
	public DataSourceTransactionManager configTransactionManager() {
		return new DataSourceTransactionManager(datasource);
	}
	
	@Autowired
	private DataSource datasource;

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

}
