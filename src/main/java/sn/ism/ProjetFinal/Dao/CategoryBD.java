package sn.ism.ProjetFinal.Dao;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.ism.ProjetFinal.Entities.Category;
import sn.ism.ProjetFinal.Repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryBD {
    @Autowired
    private CategoryRepository cateRepo;

    @Transactional
    public void saveCategory(Category category){
        cateRepo.save(category);
    }
    @Transactional
    public void deleteCategory(String codeCat){
        //Recuperer la categorie
        Category category = cateRepo.findByCodeCat(codeCat);
        //Verifier si la categorie existe
        if(category != null){
            //Supprimer la categorie
            cateRepo.delete(category);
        }
    }

    @Transactional
    public Category findCategory(String codeCat){
        Category cat = cateRepo.findByCodeCat(codeCat);
        return cat;
    }

    public List<Category> showAllCategory(){
        return cateRepo.findAll();
    }
}
