package com.disenotuweb.rolesSecurity.repository;
import com.disenotuweb.rolesSecurity.entity.Empleados;
import org.springframework.data.repository.CrudRepository;
public class EmpleadosRepository {

    public interface PersonaDAO extends CrudRepository<Empleados, Long> {

    }
}
