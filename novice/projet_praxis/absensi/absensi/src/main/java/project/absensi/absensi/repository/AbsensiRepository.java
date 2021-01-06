package project.absensi.absensi.repository;

import project.absensi.absensi.model.Absensi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface AbsensiRepository extends JpaRepository<Absensi, Long> {
 
    List<Absensi> findByIdIn(List<Long> AbsenId);
  
}