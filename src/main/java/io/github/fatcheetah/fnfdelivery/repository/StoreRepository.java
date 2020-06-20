package io.github.fatcheetah.fnfdelivery.repository;

import io.github.fatcheetah.fnfdelivery.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
}
