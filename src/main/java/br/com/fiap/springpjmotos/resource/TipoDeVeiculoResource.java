package br.com.fiap.springpjmotos.resource;


import br.com.fiap.springpjmotos.entity.TipoDeVeiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TipoDeVeiculoResource {

    @RestController
    @RequestMapping("/tipoDeVeiculo")
    public class TipoVeiculoResource {

        @Autowired
        private TipoVeiculoResource tipoVeiculoResource;

        @GetMapping
        public List<TipoDeVeiculo> getAllTiposVeiculo() {
            return tipoVeiculoResource.getAllTiposVeiculo();
        }

        @GetMapping("/{id}")
        public TipoDeVeiculo getTipoVeiculoById(@PathVariable Long id) {
            return tipoVeiculoResource.getTipoVeiculoById(id);
        }

        @PostMapping
        public ResponseEntity<Void> createTipoVeiculo(@RequestBody TipoDeVeiculo tipoVeiculo) {
            tipoVeiculoResource.createTipoVeiculo(tipoVeiculo);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
    }


}
