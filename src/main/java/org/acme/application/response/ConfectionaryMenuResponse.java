package org.acme.application.response;

import java.util.List;
import org.acme.domain.Cake;
import org.acme.domain.Cookie;

public record ConfectionaryMenuResponse(List<Cake> cakes, List<Cookie> cookies) {

}
