package com.encrypttest.encrypt.controller;

import com.encrypttest.encrypt.security.StringEncrypter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URLDecoder;

@Controller
public class IndexController {

    @RequestMapping(value = "decrypt", method = RequestMethod.POST)
    public String Decrypter(Model model, @RequestParam(value="dectext")String dectext)throws Exception{

        StringEncrypter se = new StringEncrypter("585beda0e4b0382e","Aloha@J!Os0191me");

        String basicText = dectext;
        String decryptedTxt = se.decrypt(dectext);

        model.addAttribute("basicTxt", basicText);
        model.addAttribute("decrypted", decryptedTxt);
        return "index";
    }

    @RequestMapping(value="urldecrypt", method = RequestMethod.POST)
    public String URLDecrypt(Model model, @RequestParam(value="urldectxt")String urldectxt) throws Exception{

        StringEncrypter se = new StringEncrypter("585beda0e4b0382e","Aloha@J!Os0191me");

        String basicURLEncrypt = urldectxt;
        String urlDecoder = URLDecoder.decode(basicURLEncrypt, "UTF-8");
        String urlDecrypter = se.decrypt(urlDecoder);

        model.addAttribute("basicURLTxt", basicURLEncrypt);
        model.addAttribute("urlDecrypted", urlDecrypter);

        return "index";
    }
}
