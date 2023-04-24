package org.acme.infrastructure.repository;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.acme.domain.Cookie;
import org.acme.domain.Size;
import org.acme.domain.repository.CookieRepository;

@ApplicationScoped
public class CookieRepositoryImpl implements CookieRepository {

  private static final List<Cookie> cookies = new ArrayList<>();

  static {
    cookies.add(new Cookie("Chocolate chip", Size.SMALL));
  }

  @Override
  public List<Cookie> list() {
    return cookies;
  }

  @Override
  public void add(Cookie cookie) {
    cookies.add(cookie);
  }
}
