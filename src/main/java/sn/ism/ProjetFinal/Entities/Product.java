package sn.ism.ProjetFinal.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@Table(name="product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numProd;
    @NotEmpty(message = "nom obligatoire")
    private String nomProd;
    @NotNull(message = "Prix obligatoire")
    private Integer prix;
    @ManyToOne
    @JoinColumn(name="codeCat")
    private Category cat;

    public Product(){};

    public Integer getNumProd() {
        return numProd;
    }

    public void setNumProd(Integer numProd) {
        this.numProd = numProd;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Category getCat() {
        return cat;
    }

    public void setCat(Category cat) {
        this.cat = cat;
    }
}
