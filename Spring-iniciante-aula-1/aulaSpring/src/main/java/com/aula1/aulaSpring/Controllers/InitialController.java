package com.aula1.aulaSpring.Controllers;

import com.aula1.aulaSpring.DTO.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/initial")
public class InitialController {
    @GetMapping
    public String hello() {
        return "Hello";
    }

    @GetMapping("{id}")
    public String helloWithId(@PathVariable Long id) {
        return "Hello" + id;
    }

    @GetMapping(params = "id")
    public String helloWithQuery(@RequestParam Long id) {
        return "Hello" + id;
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO userDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userDTO);
    }

    @PutMapping("{id}")//Atualizar dados completos
    public void update(@RequestBody UserDTO userDTO,@PathVariable Long id) {

    }

    @PatchMapping("{id}")//Atualizar dados específicos
    public void update(@PathVariable Long id, @RequestBody UserDTO userDTO) {

    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {

    }
}
