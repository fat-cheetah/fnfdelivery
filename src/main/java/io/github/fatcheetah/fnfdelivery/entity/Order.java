package io.github.fatcheetah.fnfdelivery.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Order {

  @Id
  @GeneratedValue
  private Long id;

  private Long customerId;

  private Long driverId;
}
