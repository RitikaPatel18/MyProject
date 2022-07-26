package com.jpa.LoginApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Repository("weatherRepository")
public interface WeatherRepository extends CrudRepository<WeatherReport,Long>{
    
}

