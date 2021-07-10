package guru.springframework.oneToMany.controller;

import guru.springframework.oneToMany.model.DogDto;
import guru.springframework.oneToMany.repository.Dog;
import guru.springframework.oneToMany.service.DogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dogs")
public class DogsController {
    @Autowired
    DogsService service;

    @GetMapping
    public List<Dog> getDogs() {
        return service.getDogs();
    }

    @PostMapping
    public void postDogs(@RequestBody DogDto dto) {
        service.add(dto);
    }

    @GetMapping("/{id}")
    public Dog getById(@PathVariable(required = true) long id) {
        return service.getDogById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(required = true) long id) {
        service.delete(id);
    }
}