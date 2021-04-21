package com.formacionbdi.microservicios.app.usuarios.services;

import com.formacionbdi.microservicios.commons.services.CommonService;
import com.formacionbdi.microservicios.commons.alumnos.models.entity.Alumno;

import java.util.List;

public interface AlumnoService extends CommonService<Alumno> {

    public List<Alumno> findByNombreOrApellidos(String term);

    public Iterable<Alumno> findAllById(Iterable<Long> ids);

    public void eliminarCursoAlumnoPorId(Long id);
}
