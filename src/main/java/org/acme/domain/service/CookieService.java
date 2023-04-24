package org.acme.domain.service;

import java.util.List;
import org.acme.domain.Cookie;
import org.acme.domain.Size;

public interface CookieService {

  List<Cookie> list();

  void add(String flavour, Size size);
}
