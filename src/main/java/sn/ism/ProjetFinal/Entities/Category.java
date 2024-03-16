package sn.ism.ProjetFinal.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="category")
public class Category implements Serializable {
    @Id
    @NotEmpty(message = "Code Catégorie obligatoire")
    @Column(length = 255)
    private String codeCat;
    @NotEmpty(message = "Nom Catégorie obligatoire")
    private String nomCat;
    @OneToMany(mappedBy = "cat", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Product> listprod = new ArrayList<Product>();

}
