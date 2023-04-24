package org.acme.domain;

import java.util.List;
import lombok.Value;

@Value
class Inventory {

  List<Cake> cakes;
  List<Cookie> cookies;
  TotalAmount totalAmount;

  
}
