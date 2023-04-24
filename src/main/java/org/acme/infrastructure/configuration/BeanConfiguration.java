package org.acme.infrastructure.configuration;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.acme.domain.repository.CakeRepository;
import org.acme.domain.repository.CookieRepository;
import org.acme.domain.service.CakeService;
import org.acme.domain.service.CakeServiceImpl;
import org.acme.domain.service.CookieService;
import org.acme.domain.service.CookieServiceImpl;

@ApplicationScoped
public class BeanConfiguration {

  @Produces
  CakeService cakeService(final CakeRepository cakeRepository) {
    return new CakeServiceImpl(cakeRepository);
  }

  @Produces
  CookieService cookieService(final CookieRepository cookieRepository) {
    return new CookieServiceImpl(cookieRepository);
  }
}
