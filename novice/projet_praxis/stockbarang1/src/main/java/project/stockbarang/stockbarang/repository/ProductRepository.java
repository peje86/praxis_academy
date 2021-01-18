package project.stockbarang.stockbarang.repository;

import java.util.Optional;
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import project.stockbarang.stockbarang.model.Products;


@Repository
public interface ProductRepository extends JpaRepository<Products ,Long> {  //mengambil data dari depedency
List<Products>findAll();
Optional<Products>findById(Long id);
//Optional<Products> findByUsername(String username);

}