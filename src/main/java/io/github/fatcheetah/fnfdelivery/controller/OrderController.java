package io.github.fatcheetah.fnfdelivery.controller;

import io.github.fatcheetah.fnfdelivery.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/apid/order")
public class OrderController {

  private OrderService orderService;
}
