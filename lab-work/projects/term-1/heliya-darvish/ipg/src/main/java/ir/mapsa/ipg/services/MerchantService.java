package ir.mapsa.ipg.services;

import org.springframework.stereotype.Service;

@Service
public class MerchantService {

    public void addMerchant(String id, String name) {
        System.err.println("merchant by id: " + id + ", name: " + name + " added.");
        //todo
    }

}
