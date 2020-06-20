package io.github.fatcheetah.fnfdelivery.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "Store")
@Getter
@Setter
public class Store {
  @Id
  @GeneratedValue
  private Long id;

  private String guid;

  private String name;

  @ManyToMany(mappedBy = "store")
  private Set<Product> products;
}
