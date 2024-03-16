package sn.ism.ProjetFinal.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import sn.ism.ProjetFinal.Entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
