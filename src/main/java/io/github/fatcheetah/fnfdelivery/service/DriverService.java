package io.github.fatcheetah.fnfdelivery.service;

import io.github.fatcheetah.fnfdelivery.entity.Driver;
import io.github.fatcheetah.fnfdelivery.repository.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

  private final DriverRepository driverRepository;

  public DriverService(DriverRepository driverRepository){
    this.driverRepository = driverRepository;
  }

  public List<Driver> getAllDrivers(){
    return driverRepository.findAll();
  }

  public Driver addDriver(Driver driver){
    return driverRepository.save(driver);
  }

  public Driver getDriver(final Long id){
    return driverRepository.getOne(id);
  }
}
