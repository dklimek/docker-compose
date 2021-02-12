package pl.klimek.springbootapidocker;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter@Setter private Long id;

    @Getter@Setter private String name;
    public Animal() {}
    public Animal(String name) {
        this.name = name;
    }
}
