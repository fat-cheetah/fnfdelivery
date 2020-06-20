package io.github.fatcheetah.fnfdelivery.service;

import io.github.fatcheetah.fnfdelivery.entity.Store;
import io.github.fatcheetah.fnfdelivery.repository.StoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

  private StoreRepository storeRepository;

  public StoreService(StoreRepository storeRepository) {
    this.storeRepository = storeRepository;
  }

  public List<Store> getAllStores() {
    return storeRepository.findAll();
  }

  public Store getStore(final Long id) {
    return storeRepository.getOne(id);
  }

  public Store addStore(Store store) {
    return storeRepository.save(store);
  }
}
