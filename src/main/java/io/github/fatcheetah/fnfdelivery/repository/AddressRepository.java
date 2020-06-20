package io.github.fatcheetah.fnfdelivery.repository;

import io.github.fatcheetah.fnfdelivery.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
