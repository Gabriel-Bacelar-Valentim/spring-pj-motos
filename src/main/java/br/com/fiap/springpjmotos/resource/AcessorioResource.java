package br.com.fiap.springpjmotos.resource;

import br.com.fiap.springpjmotos.entity.Acessorio;
import br.com.fiap.springpjmotos.repository.AcessorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acessorios")
public class AcessorioResource {


        @Autowired
        private AcessorioRepository acessorioRepo;

        @GetMapping
        public List<Acessorio> getAllAcessorios() {
            return acessorioRepo.findAll();
        }

        @GetMapping("/{id}")
        public Acessorio getAcessorioById(@PathVariable Long id) {
            return acessorioRepo.findById(id).get();
        }


        @PostMapping
        public ResponseEntity<Void> createAcessorio(@RequestBody Acessorio acessorio) {
            acessorioRepo.save(acessorio);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
    }


