package com.formacionbdi.microservicios.app.respuestas.models.entity;

import com.formacionbdi.microservicios.commons.alumnos.models.entity.Alumno;
import com.formacionbdi.microservicios.commons.examenes.models.entity.Pregunta;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
//import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "respuestas")
@Getter
@Setter
public class Respuesta {

    @Id
    private String id;

    private String texto;

    //@Transient
    private Alumno alumno;

    private Long alumnoId;

    //@Transient
    private Pregunta pregunta;

    private Long preguntaId;
}
