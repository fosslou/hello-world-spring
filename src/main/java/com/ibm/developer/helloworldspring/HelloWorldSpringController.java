package com.ibm.developer.helloworldspring;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

@Controller
public class HelloWorldSpringController {

  @RequestMapping("/hello")
  @ResponseBody
  public Collection<String> sayHello() {
    return IntStream.range(0, 10)
    .mapToObj(i -> "Hello number " + i)
    .collect(Collectors.toList());
  }
}
