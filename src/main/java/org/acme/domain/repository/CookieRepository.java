package org.acme.domain.repository;

import java.util.List;
import org.acme.domain.Cookie;

public interface CookieRepository {

  List<Cookie> list();

  void add(Cookie cookie);
}
