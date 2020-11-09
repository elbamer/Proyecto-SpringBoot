package com.disenotuweb.rolesSecurity.interfaceService;

import com.disenotuweb.rolesSecurity.modelo.Empleado;

import java.util.List;
import java.util.Optional;

public interface IEmpleadoService {

    public List<Empleado> listar();

    public Optional<Empleado> listarId(int id);

    public int save(Empleado p);

    public void delete(int id);
}
