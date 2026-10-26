package edu.altair.crm.entidades;

// Importamos las anotaciones necesarias para JPA.
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDate;

// Indicamos que esta clase representa una entidad de la base de datos.
@Entity

// Indicamos el nombre de la tabla.
@Table(name = "matriculas")
public class Matricula {

    // Identificador único de la matrícula.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Fecha en la que se realiza la matrícula.
    @Column(name = "fecha_matriculacion", nullable = false)
    private LocalDate fechaMatriculacion;

    // Nota final del alumno en la asignatura.
    @Column(name = "nota_final")
    private Double notaFinal;

    // Relación: una matrícula corresponde a un alumno.
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_alumno", nullable = false)
    private Alumno alumno;

    // Relación: una matrícula corresponde a una asignatura.
    @ManyToOne(optional = false)
    @JoinColumn(name = "codigo_asignatura", nullable = false)
    private Asignatura asignatura;

    // Constructor vacío necesario para JPA.
    public Matricula() {
    }

    // Constructor con los datos de la matrícula.
    public Matricula(LocalDate fechaMatriculacion, Double notaFinal,
                     Alumno alumno, Asignatura asignatura) {
        this.fechaMatriculacion = fechaMatriculacion;
        this.notaFinal = notaFinal;
        this.alumno = alumno;
        this.asignatura = asignatura;
    }

    // Devuelve el identificador de la matrícula.
    public Long getId() {
        return id;
    }

    // Establece el identificador de la matrícula.
    public void setId(Long id) {
        this.id = id;
    }

    // Devuelve la fecha de matriculación.
    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    // Establece la fecha de matriculación.
    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    // Devuelve la nota final.
    public Double getNotaFinal() {
        return notaFinal;
    }

    // Establece la nota final.
    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }

    // Devuelve el alumno matriculado.
    public Alumno getAlumno() {
        return alumno;
    }

    // Establece el alumno matriculado.
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    // Devuelve la asignatura de la matrícula.
    public Asignatura getAsignatura() {
        return asignatura;
    }

    // Establece la asignatura de la matrícula.
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}
