package pl.klimek.springbootclientdocker;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
public class Animal {


    @Getter@Setter private Long id;

    @Getter@Setter private String name;

    public Animal(String name) {
        this.name = name;
    }
}
