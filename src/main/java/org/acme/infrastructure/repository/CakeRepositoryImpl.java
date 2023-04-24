package org.acme.infrastructure.repository;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.acme.domain.Cake;
import org.acme.domain.Size;
import org.acme.domain.repository.CakeRepository;

@ApplicationScoped
public class CakeRepositoryImpl implements CakeRepository {

  private static final List<Cake> cakes = new ArrayList<>();

  static {
    cakes.addAll(List.of(new Cake("Chocolate", Size.LARGE),
        new Cake("Strawberry", Size.MEDIUM)));
  }

  @Override
  public List<Cake> list() {
    return cakes;
  }

  @Override
  public void add(Cake cake) {
    cakes.add(cake);
  }
}
