package br.com.fiap.springpjmotos.resource;

import br.com.fiap.springpjmotos.repository.VeiculoRepository;
import br.com.fiap.springpjmotos.resource.VeiculoResource;
import br.com.fiap.springpjmotos.entity.Loja;
import br.com.fiap.springpjmotos.entity.Veiculo;
import br.com.fiap.springpjmotos.repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/lojas")
public class LojaResource {

        @Autowired
        private LojaRepository lojaRepo;

        @Autowired VeiculoRepository veiculoRepo;

        @GetMapping
        public List<Loja> getAllLojas() {
            return lojaRepo.findAll();
        }

        @GetMapping("/{id}")
        public Loja getLojaById(@PathVariable Long id) {
            return lojaRepo.findById(id).get();
        }

        @PostMapping
        public ResponseEntity<Void> createLoja(@RequestBody Loja loja) {
            lojaRepo.save(loja);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }

        @GetMapping("/{id}/veiculos")
        public Set<Veiculo> getVeiculosByLojaId(@PathVariable Long id) {
            return lojaRepo.findById(id).get().getVeiculosComercializados();
        }

        @PostMapping("/{id}/veiculos")
        public ResponseEntity<Void> addVeiculoToLoja(@PathVariable Long id, @RequestBody Veiculo veiculo) {
            veiculoRepo.save(veiculo);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }


}



