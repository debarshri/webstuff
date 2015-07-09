package io.github.debarshri.controller;

import io.github.debarshri.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("product")
public class ProductController {

    @RequestMapping(method =  RequestMethod.GET)
    public @ResponseBody Product getProduct()
    {
        return new Product("The Martian", 10L);
    }
}
