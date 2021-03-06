package com.code4ro.legalconsultation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories
@EnableCaching
@EnableTransactionManagement
public class LegalConsultationApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegalConsultationApplication.class, args);
    }

}
