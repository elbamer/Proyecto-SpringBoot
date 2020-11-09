package com.disenotuweb.rolesSecurity.modeloDao;

import com.disenotuweb.rolesSecurity.modelo.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface IEmpleado extends CrudRepository<Empleado, Integer> {

    }
