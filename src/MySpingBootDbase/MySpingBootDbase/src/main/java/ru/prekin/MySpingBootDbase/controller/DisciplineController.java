package ru.prekin.MySpingBootDbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.prekin.MySpingBootDbase.entity.Discipline;
import ru.prekin.MySpingBootDbase.service.DisciplineService;

import java.util.List;

@RestController
@RequestMapping("/api/disciplines")
public class DisciplineController {

    @Autowired
    private DisciplineService disciplineService;

    @GetMapping
    public List<Discipline> getAllDisciplines() {
        return disciplineService.getAllDisciplines();
    }

    @GetMapping("/{id}")
    public Discipline getDiscipline(@PathVariable("id") int id) {
        return disciplineService.getDiscipline(id);
    }

    @PostMapping
    public Discipline saveDiscipline(@RequestBody Discipline discipline) {
        return disciplineService.saveDiscipline(discipline);
    }

    @PutMapping
    public Discipline updateDiscipline(@RequestBody Discipline discipline) {
        return disciplineService.saveDiscipline(discipline);
    }

    @DeleteMapping("/{id}")
    public void deleteDiscipline(@PathVariable("id") int id) {
        disciplineService.deleteDiscipline(id);
    }
}
