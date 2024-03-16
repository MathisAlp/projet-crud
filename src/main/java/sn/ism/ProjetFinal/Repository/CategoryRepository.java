package sn.ism.ProjetFinal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.ism.ProjetFinal.Entities.Category;

public interface CategoryRepository extends JpaRepository<Category,String> {

    public Category findByCodeCat(String codeCat);
}
