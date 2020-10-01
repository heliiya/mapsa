package ir.mapsa.ipg.controller;

import ir.mapsa.ipg.services.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MerchantController {

    @Autowired
    private MerchantService service;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/addMerchant")
    public String addMerchant(){
        return "addMerchant";
    }

    @PostMapping("/addMerchant")
    public String addMerchant(@RequestParam String id, @RequestParam String name){
        service.addMerchant(id, name);
        return "addMerchant";
    }

    @RequestMapping("/addCustomer")
    public String addCustomer(){
        return "addCustomer";
    }

    @RequestMapping("/payment")
    public String payment(){
        return "payment";
    }

    @PostMapping("/ipg")
    public ModelAndView ipg(@RequestParam String merchantId, @RequestParam String amount){
        ModelAndView mav = new ModelAndView();
        mav.addObject("merchantId", merchantId);
        mav.addObject("amount", amount);
        mav.setViewName("ipg");
        return mav;
    }
}