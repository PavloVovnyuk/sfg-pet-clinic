package pavlo.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Pavlo 14.03.2021
 **/
@RequestMapping("/owners")
@Controller
public class OwnerController {
    @RequestMapping({"","/", "/index", "/index.html"})
    public String ListOwners(){
        return "owners/index";
    }
}
