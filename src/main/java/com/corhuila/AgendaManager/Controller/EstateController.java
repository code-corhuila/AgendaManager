package com.corhuila.AgendaManager.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.AgendaManager.Entity.Estate;
import com.corhuila.AgendaManager.IService.IEstateService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("estate")
public class EstateController extends ABaseController<Estate, IEstateService> {
    public EstateController(IEstateService service) {
        super(service, "Estate");
    }
}
