package io.github.fatcheetah.fnfdelivery.controller;

import io.github.fatcheetah.fnfdelivery.entity.Customer;
import io.github.fatcheetah.fnfdelivery.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/customer")
public class CustomerController {

  private CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping("/")
  public @ResponseBody
  ResponseEntity<List<Customer>> getAllStores() {
    return ResponseEntity.ok(customerService.getAllCustomers());
  }

  @PostMapping
  public @ResponseBody ResponseEntity<Customer> addStore(Customer customer) {
    return ResponseEntity.ok(customerService.addCustomer(customer));
  }

  @GetMapping("/{id}")
  public @ResponseBody ResponseEntity<Customer> getStore(@PathVariable Long id) {
    return ResponseEntity.ok(customerService.getCustomer(id));
  }

}
