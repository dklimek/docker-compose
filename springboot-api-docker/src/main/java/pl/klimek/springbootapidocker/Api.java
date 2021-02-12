package pl.klimek.springbootapidocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

@RestController
@RequestMapping("/api")
public class Api {

    private AnimalRepo animalRepo;

    @Autowired
    public Api(AnimalRepo animalRepo){
        this.animalRepo= animalRepo;
        animalRepo.save(new Animal("pies"));
    }

    @GetMapping("/animals")
    public Iterable<Animal> getAnimals(){
        return animalRepo.findAll();
    }

    @PostMapping("/animals")
    public Animal addAnimals(@RequestBody Animal animal){
        return  animalRepo.save(animal);
    }
}
