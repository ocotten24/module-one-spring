package com.example.demo.patients;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Patients {
    private String name;
    @Id
    @SequenceGenerator(
            name = "patient_sequence",
            sequenceName = "patient_sequence",
            allocationSize = 1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE,
            generator = "patient_sequence"
    )
    private Long id;
    private LocalDate dob;
    @Transient
    private int age;
    private String phoneNumber;
    private String gender;
    private String roomNumber;
    private LocalDate admissionDate;
    private LocalDate dischargeDate;
    private String diagnosis;
    private String medication;
    private String allergies;
    private double cost;

    public Patients() {
    }

    public Patients(String name,
                    Long id,
                    LocalDate dob,
                    String phoneNumber,
                    String gender,
                    String roomNumber,
                    LocalDate admissionDate,
                    LocalDate dischargeDate,
                    String diagnosis,
                    String medication,
                    String allergies,
                    double cost) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.roomNumber = roomNumber;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.diagnosis = diagnosis;
        this.medication = medication;
        this.allergies = allergies;
        this.cost = cost;
    }

    public Patients(String name,
                    LocalDate dob,
                    String phoneNumber,
                    String gender,
                    String roomNumber,
                    LocalDate admissionDate,
                    LocalDate dischargeDate,
                    String diagnosis,
                    String medication,
                    String allergies,
                    double cost) {
        this.name = name;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.roomNumber = roomNumber;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.diagnosis = diagnosis;
        this.medication = medication;
        this.allergies = allergies;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public LocalDate getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(LocalDate dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dob=" + dob +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", admissionDate=" + admissionDate +
                ", dischargeDate=" + dischargeDate +
                ", diagnosis='" + diagnosis + '\'' +
                ", medication='" + medication + '\'' +
                ", allergies='" + allergies + '\'' +
                ", cost=" + cost +
                '}';
    }
}
