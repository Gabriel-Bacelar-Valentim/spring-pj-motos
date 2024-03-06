package br.com.fiap.springpjmotos.resource;

import br.com.fiap.springpjmotos.entity.Acessorio;
import br.com.fiap.springpjmotos.entity.Veiculo;
import br.com.fiap.springpjmotos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/veiculos")
public class VeiculoResource {

    @Autowired
    private VeiculoRepository veiculoRepo;

    @GetMapping
    public List<Veiculo> getAllVeiculos() {
        return veiculoRepo.findAll();
    }

    @GetMapping("/{id}")
    public Veiculo getVeiculoById(@PathVariable Long id) {
        return veiculoRepo.findById(id).get();
    }

    @PostMapping
    public ResponseEntity<Void> createVeiculo(@RequestBody Veiculo veiculo) {
        veiculoRepo.save(veiculo);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}/acessorios")
    public Set<Acessorio> getAcessoriosByVeiculoId(@PathVariable Long id) {
        return (Set<Acessorio>) veiculoRepo.findById(id).get();
    }

    @PostMapping("/{id}/acessorios")
    public ResponseEntity<Void> addAcessorioToVeiculo(@PathVariable Long id, @RequestBody Acessorio acessorio) {
        veiculoRepo.save(acessorio);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

