package edu.altair.crm.entidades;

// Importamos las anotaciones necesarias para JPA.
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.FetchType;

import java.util.ArrayList;
import java.util.List;

// Indicamos que esta clase representa una entidad de la base de datos.
@Entity

// Indicamos el nombre de la tabla.
@Table(name = "profesores")
public class Profesor {

    // DNI que identifica al profesor.
    @Id
    @Column(name = "dni", nullable = false, length = 20)
    private String dni;

    // Nombre del profesor.
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    // Relación: muchos profesores pueden pertenecer a un departamento.
    // Cada profesor debe tener un departamento.
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_departamento", nullable = false)
    private Departamento departamento;

    // Relación: un profesor puede impartir varias asignaturas.
    @OneToMany(mappedBy = "profesor")
    private List<Asignatura> asignaturas = new ArrayList<>();

    // Constructor vacío necesario para JPA.
    public Profesor() {
    }

    // Constructor con los datos del profesor.
    public Profesor(String dni, String nombre, Departamento departamento) {
        this.dni = dni;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    // Devuelve el DNI del profesor.
    public String getDni() {
        return dni;
    }

    // Establece el DNI del profesor.
    public void setDni(String dni) {
        this.dni = dni;
    }

    // Devuelve el nombre del profesor.
    public String getNombre() {
        return nombre;
    }

    // Establece el nombre del profesor.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Devuelve el departamento del profesor.
    public Departamento getDepartamento() {
        return departamento;
    }

    // Establece el departamento del profesor.
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    // Devuelve la lista de asignaturas impartidas.
    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    // Establece la lista de asignaturas impartidas.
    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
