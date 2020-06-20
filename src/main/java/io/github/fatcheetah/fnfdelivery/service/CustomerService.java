package io.github.fatcheetah.fnfdelivery.service;

import io.github.fatcheetah.fnfdelivery.entity.Customer;
import io.github.fatcheetah.fnfdelivery.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

  private CustomerRepository customerRepository;

  public CustomerService(CustomerRepository customerRepository){
    this.customerRepository = customerRepository;
  }

  public List<Customer> getAllCustomers(){
    return customerRepository.findAll();
  }

  public Customer addCustomer(final Customer customer){
    return customerRepository.save(customer);
  }

  public Customer getCustomer(final Long id){
    return customerRepository.getOne(id);
  }
}
