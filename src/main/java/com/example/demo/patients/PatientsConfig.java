package com.example.demo.patients;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration

public class PatientsConfig {
    @Bean
    CommandLineRunner commandLineRunner(PatientsRepository repository) {
        return args -> {
            Patients johnDoe = new Patients(
                    "John Doe",
                    LocalDate.of(2000, 3, 1),
                    "662-738-9999",
                    "MALE",
                    "ICU-1",
                    LocalDate.of(2022, 2, 28),
                    LocalDate.of(2022, 3, 10),
                    "Pneumonia",
                    "Antibiotics",
                    "None",
                    20000
            );

            Patients janeDoe = new Patients(
                    "Jane Doe",
                    LocalDate.of(2000, 8, 15),
                    "662-738-1111",
                    "FEMALE",
                    "Maternity-002",
                    LocalDate.of(2022, 3, 5),
                    null,
                    "Pregnancy",
                    "Prenatal vitamins",
                    "None",
                    7500
            );



            repository.saveAll(
                    List.of(johnDoe, janeDoe)
            );

        };
    }
}
