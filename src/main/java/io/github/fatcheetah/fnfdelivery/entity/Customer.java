package io.github.fatcheetah.fnfdelivery.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Customer {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  private String email;

  private String mobileNo;

  @OneToMany
  private List<Address> addressList;
}
