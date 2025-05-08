package com.corhuila.AgendaManager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.AgendaManager.Entity.City;
import com.corhuila.AgendaManager.IRepository.IBaseRepository;
import com.corhuila.AgendaManager.IRepository.ICityRepository;
import com.corhuila.AgendaManager.IService.ICityService;
@Service
public class CityService extends ABaseService<City> implements ICityService {
    @Override
    protected IBaseRepository<City, Long> getRepository() {
        return repository;
    }
    @Autowired
    private ICityRepository repository;
}
