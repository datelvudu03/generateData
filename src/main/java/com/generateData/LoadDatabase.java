package com.generateData;

import com.generateData.Entity.Teacher;
import com.generateData.Repository.TeacherRepository;
import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;


@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(TeacherRepository teacherRepository) {
        Faker faker = new Faker(new Locale("vi"));

        return args -> {
            for (int i = 0; i < 50; i++) {
                log.info("Preloading " + teacherRepository.save(new Teacher(
                     faker.idNumber().hashCode(),faker.address().firstName(),faker.address().lastName(),
                        faker.name().username(),faker.internet().emailAddress(),faker.address().streetAddress(),faker.phoneNumber().cellPhone())));
            }


        };
    }
}