package com.corhuila.AgendaManager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.AgendaManager.Entity.Estate;
import com.corhuila.AgendaManager.IRepository.IBaseRepository;
import com.corhuila.AgendaManager.IRepository.IEstateRepository;
import com.corhuila.AgendaManager.IService.IEstateService;
@Service
public class EstateService extends ABaseService<Estate> implements IEstateService {
    @Override
    protected IBaseRepository<Estate, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IEstateRepository repository;
}
