package io.github.fatcheetah.fnfdelivery.controller;

import io.github.fatcheetah.fnfdelivery.entity.Driver;
import io.github.fatcheetah.fnfdelivery.service.DriverService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/driver")
public class DriverController {

  private DriverService driverService;

  public DriverController(DriverService driverService){
    this.driverService = driverService;
  }

  @GetMapping("/")
  public @ResponseBody
  ResponseEntity<List<Driver>> getAllDrivers(){
    return ResponseEntity.ok(driverService.getAllDrivers());
  }

  @PostMapping("/")
  public @ResponseBody ResponseEntity<Driver> addDriver(Driver driver){
    return ResponseEntity.ok(driverService.addDriver(driver));
  }

  @GetMapping("/{id}")
  public @ResponseBody ResponseEntity<Driver> getDriver(@PathVariable final Long id){
    return ResponseEntity.ok(driverService.getDriver(id));
  }
}
