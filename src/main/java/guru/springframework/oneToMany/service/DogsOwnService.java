package guru.springframework.oneToMany.service;

import guru.springframework.oneToMany.exception.DogNotFoundException;
import guru.springframework.oneToMany.model.Dog;
import guru.springframework.oneToMany.model.DogDto;
import guru.springframework.oneToMany.repository.DogsRepositoryWildcardWithQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DogsOwnService {
    @Autowired
    DogsRepositoryWildcardWithQuery repository;

    public List<Dog> getDogs(String name) {
        return (List<Dog>) repository.findByNameLike(name);
    }


}