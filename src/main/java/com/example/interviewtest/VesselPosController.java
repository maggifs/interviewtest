package com.example.interviewtest;

import java.util.Optional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VesselPosController {
  private final RestRepository repository;
  VesselPosController(RestRepository repository) {
    this.repository = repository;
  }

  // Get list of objects in repository
  @GetMapping("/positions")
  Iterable<VesselPos> all() {
    return repository.findAll();
  }

  // POST object to repository
  @PostMapping("/positions")
  VesselPos newVesselPos(@RequestBody VesselPos newVesselPos) {
    return repository.save(newVesselPos);
  }

  // GET object by id from repository
  @GetMapping("/positions/{id}")
  Optional<VesselPos> pos(@PathVariable Long id) {
    return repository.findById(id);
  }

  // DELETE object from repository
  @DeleteMapping("/positions/{id}") 
  void deletePosition(@PathVariable Long id) {
    repository.deleteById(id);
  }
}