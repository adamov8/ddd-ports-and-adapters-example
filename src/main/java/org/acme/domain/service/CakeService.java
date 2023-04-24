package org.acme.domain.service;

import java.util.List;
import org.acme.domain.Cake;
import org.acme.domain.Size;

public interface CakeService {

  List<Cake> list();

  void add(String flavour, Size size);
}
