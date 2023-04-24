package org.acme.domain.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.acme.domain.Cake;
import org.acme.domain.Size;
import org.acme.domain.repository.CakeRepository;

@RequiredArgsConstructor
public class CakeServiceImpl implements CakeService {

  private final CakeRepository cakeRepository;

  @Override
  public List<Cake> list() {
    return cakeRepository.list();
  }

  @Override
  public void add(String flavour, Size size) {
    cakeRepository.add(new Cake(flavour, size));
  }
}
