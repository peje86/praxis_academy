package project.lokerku.loker.repository;

import java.util.Optional;
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import project.lokerku.loker.model.Lokers;


@Repository
public interface LokerRepository extends JpaRepository<Lokers ,Long> {  //mengambil data dari depedency
List<Lokers>findAll();
// Optional<Perusahaans>findById(Long id);
// // //Optional<Products> findByUsername(String username);

}



