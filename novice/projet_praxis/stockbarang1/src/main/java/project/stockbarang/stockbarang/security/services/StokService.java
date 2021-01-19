package project.stockbarang.stockbarang.security.services;

import java.util.ArrayList;
import java.util.List;

import project.stockbarang.stockbarang.model.Stoks;
import project.stockbarang.stockbarang.repository.StokRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StokService {

    @Autowired
    private StokRepository stokRepository;

    public List<Stoks> getAllStoks() {
        List<Stoks> stoks = new ArrayList<>();
        stokRepository.findAll().forEach(stoks::add);
        return stoks;
    }

    public Stoks getStoks(Long id) {
        Stoks stoks = stokRepository.findById(id).orElse(null);
        return stoks;
    }

    // public Stoks getIdProduct(Long id_product) {
    //     Stoks stoks = stokRepository.findById(id_product).orElse(null);
    //     return stoks;
    // }

    public Stoks addStoks(Stoks stoks) {
        stokRepository.save(stoks);
        return stoks;
    }

    public Stoks updateStoks(Long id, Stoks stoks) {
        stokRepository.save(stoks);
        return stoks;
    }

    public Stoks deleteStoks(Long id) {
        Stoks stoks = stokRepository.findById(id).orElse(null);
        stokRepository.deleteById(id);
        return stoks;
    }
}