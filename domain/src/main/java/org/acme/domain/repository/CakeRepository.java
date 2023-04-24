package org.acme.domain.repository;

import java.util.List;
import org.acme.domain.Cake;

public interface CakeRepository {

  List<Cake> list();

  void add(Cake cake);
}
