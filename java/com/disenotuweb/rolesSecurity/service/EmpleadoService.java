package com.disenotuweb.rolesSecurity.service;

import com.disenotuweb.rolesSecurity.interfaceService.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disenotuweb.rolesSecurity.modelo.Empleado;
import com.disenotuweb.rolesSecurity.modeloDao.IEmpleado;
import com.disenotuweb.rolesSecurity.interfaceService.IEmpleadoService;

    @Service
    public class EmpleadoService implements IEmpleadoService {
        @Autowired
        private IEmpleado dao;

        @Override
        public List<Empleado> listar() {
            return (List<Empleado>) dao.findAll();
        }

        @Override
        public Optional<Empleado> listarId(int id) {
            return dao.findById(id);
        }

        @Override
        public int save(Empleado p) {
            int res=0;
            Empleado per=dao.save(p);
            if(!per.equals(null)) {
                res=1;
            }
            return res;
        }

        @Override
        public void delete(int id) {
            dao.deleteById(id);
        }
        }
