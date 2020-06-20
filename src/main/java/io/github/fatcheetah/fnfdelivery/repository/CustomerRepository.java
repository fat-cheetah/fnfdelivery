package io.github.fatcheetah.fnfdelivery.repository;

import io.github.fatcheetah.fnfdelivery.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
