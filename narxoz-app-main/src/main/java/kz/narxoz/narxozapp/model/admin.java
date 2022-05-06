package kz.narxoz.narxozapp.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

    @Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(name = "users")
    public class admin {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        private String name;

        private String surname;

        private String email;

        @ManyToMany
        private Set<Role> roles;

    }

