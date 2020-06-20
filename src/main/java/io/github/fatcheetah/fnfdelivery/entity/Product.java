package io.github.fatcheetah.fnfdelivery.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
public class Product {

  @Id
  @GeneratedValue
  private Long id;

  @NotNull
  private String name;

  private String description;

  @ManyToMany
  @JoinColumn(name="store_id", nullable=false)
  private List<Store> store;
}
