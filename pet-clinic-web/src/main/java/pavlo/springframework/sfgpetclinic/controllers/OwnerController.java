package pavlo.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pavlo.springframework.sfgpetclinic.services.OwnerService;

import javax.jws.WebParam;

/**
 * Created by Pavlo 14.03.2021
 **/
@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @RequestMapping({"", "/", "/index", "/index.html"})
    public String ListOwners(Model model) {
model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
