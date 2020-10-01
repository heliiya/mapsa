package ir.mapsa.store.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import ir.mapsa.store.model.Product;
import ir.mapsa.store.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.io.IOException;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/product")
    public String products(Model model){
        List<Product> products = service.products();
        model.addAttribute("products", products);
        return "products";
    }

    @RequestMapping("/product/{id}")
    public String product(@PathVariable Long id, Model model) throws IOException {
        Product product = service.getProductById(id);
        model.addAttribute(product);
        return "viewProduct";
    }
}
