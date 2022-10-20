package com.example.petstoreapi.model.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

/* Pets Table*/
@Data
@Entity
@Table(name = "pets")
public class Pets implements Serializable {

    /*Entity
    * id    -> integer +PrimaryKey+
    * name  -> string
    * tag   -> string  +nullable+
    * */
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id_pet", unique = true, nullable = false)
    private int idPet;
    @Column(name = "name_pet", nullable = false)
    private String name;
    @Column(name = "tag_pet")
    private String tag;


}
