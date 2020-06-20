package io.github.fatcheetah.fnfdelivery.repository;

import io.github.fatcheetah.fnfdelivery.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
