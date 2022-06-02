package com.allstarsoft.walletapp.controllers;

import com.allstarsoft.walletapp.components.MyWallet;
import org.bitcoinj.core.Coin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/wallet")
public class HomeController {

    @Autowired
    private MyWallet myWallet;

    @RequestMapping
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/send")
    public String send(@RequestParam String amount, @RequestParam String address) {
        myWallet.send(amount, address);
        return "Done!";
    }

    @GetMapping("/mybalance")
    public Coin getBalance() {
        return myWallet.getBalance();
    }
}
