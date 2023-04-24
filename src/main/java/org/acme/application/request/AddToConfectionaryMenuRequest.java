package org.acme.application.request;

import org.acme.domain.Size;

public record AddToConfectionaryMenuRequest(ConfectionaryType type, String flavour, Size size) {

}
