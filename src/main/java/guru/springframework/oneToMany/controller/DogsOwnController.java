package guru.springframework.oneToMany.controller;

import guru.springframework.oneToMany.model.Dog;
import guru.springframework.oneToMany.model.DogDto;
import guru.springframework.oneToMany.service.DogsOwnService;
import guru.springframework.oneToMany.service.DogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dogs2")
public class DogsOwnController {
    @Autowired
    DogsOwnService service;
//public List<Dog> getDogs(@PathVariable(required = true) String name)

    @GetMapping("/{name}")
    public List<Dog> getDogs(@PathVariable(required = true) String name) {
        return service.getDogs(name);
    }

}