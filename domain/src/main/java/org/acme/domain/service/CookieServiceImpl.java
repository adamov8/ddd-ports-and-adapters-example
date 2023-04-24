package org.acme.domain.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.acme.domain.Cookie;
import org.acme.domain.Size;
import org.acme.domain.repository.CookieRepository;

@RequiredArgsConstructor
public class CookieServiceImpl implements CookieService {

  private final CookieRepository cookieRepository;

  @Override
  public List<Cookie> list() {
    return cookieRepository.list();
  }

  @Override
  public void add(String flavour, Size size) {
    cookieRepository.add(new Cookie(flavour, size));
  }
}
