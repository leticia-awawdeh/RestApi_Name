package com.db.proj;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class NomeController {

    private final NomeRepository repository;

    @PostMapping("/nomes")
    public Nome adicionarNome (@RequestBody Nome nome) {
        return repository.save(nome);
    }

    @GetMapping("/listarNomes")
    public List<Nome> listarNomes() {
        return repository.findAll();
    }

    @DeleteMapping("/nomes/{id}")
    public void deletarNome (@PathVariable Long id) {
        repository.deleteById(id);
    }
}
