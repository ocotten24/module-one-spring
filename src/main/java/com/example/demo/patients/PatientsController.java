package com.example.demo.patients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/patients")

public class PatientsController {
    private final PatientsService patientsService;

    @Autowired
    public PatientsController(PatientsService patientsService) {
        this.patientsService = patientsService;
    }

    @GetMapping
    public List<Patients> getPatients() {
        return patientsService.getPatients();
    }

    @PostMapping
    public void registerNewPatient(@RequestBody Patients patients) {
        patientsService.addNewPatient(patients);

    }

    @DeleteMapping(path = "{patientsId}")
    public void deletePatients(@PathVariable("patientsId") Long patientsId) {
        patientsService.deletePatients(patientsId);
    }

    @PutMapping(path = "{patientsId}")
    public void updatePatients(
            @PathVariable("patientsId") Long patientsId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String phoneNumber,
            @RequestParam(required = false) String roomNumber) {
                patientsService.updatePatients(patientsId, name, phoneNumber, roomNumber);
    }

    @GetMapping(path = "{patientsId}")
    public Patients getPatient(@PathVariable("patientsId") Long patientsId) {
        return patientsService.getPatientsById(patientsId);
    }


}
