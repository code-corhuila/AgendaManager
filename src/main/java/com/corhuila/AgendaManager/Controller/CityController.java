package com.corhuila.AgendaManager.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.AgendaManager.Entity.City;
import com.corhuila.AgendaManager.IService.ICityService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("city")
public class CityController extends ABaseController<City, ICityService> {
    public CityController(ICityService service) {
        super(service, "City");
    }
}
