package io.github.fatcheetah.fnfdelivery.controller;

import io.github.fatcheetah.fnfdelivery.entity.Store;
import io.github.fatcheetah.fnfdelivery.service.StoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/store")
public class StoreController {

  private StoreService storeService;

  public StoreController(StoreService storeService) {
    this.storeService = storeService;
  }

  @GetMapping("/")
  public @ResponseBody ResponseEntity<List<Store>> getAllStores() {
    return ResponseEntity.ok(storeService.getAllStores());
  }

  @PostMapping
  public @ResponseBody ResponseEntity<Store> addStore(Store store) {
    return ResponseEntity.ok(storeService.addStore(store));
  }

  @GetMapping("/{id}")
  public @ResponseBody ResponseEntity<Store> getStore(@PathVariable Long id) {
    return ResponseEntity.ok(storeService.getStore(id));
  }
}
