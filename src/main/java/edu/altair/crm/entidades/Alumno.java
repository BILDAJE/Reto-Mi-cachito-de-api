package edu.altair.crm.entidades;

// Importamos las anotaciones necesarias para JPA.
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

// Indicamos que esta clase representa una entidad de la base de datos.
@Entity

// Indicamos que la entidad está relacionada con la tabla "alumnos".
@Table(name = "alumnos")
public class Alumno {

    // DNI que identifica al alumno.
    @Id
    @Column(name = "dni", nullable = false, length = 20)
    private String dni;

    // Nombre del alumno.
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    // Relación: un alumno puede tener varias matrículas.
    @OneToMany(mappedBy = "alumno")
    private List<Matricula> matriculas = new ArrayList<>();

    // Constructor vacío necesario para JPA.
    public Alumno() {
    }

    // Constructor con los datos del alumno.
    public Alumno(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    // Devuelve el DNI del alumno.
    public String getDni() {
        return dni;
    }

    // Establece el DNI del alumno.
    public void setDni(String dni) {
        this.dni = dni;
    }

    // Devuelve el nombre del alumno.
    public String getNombre() {
        return nombre;
    }

    // Establece el nombre del alumno.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Devuelve las matrículas del alumno.
    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    // Establece las matrículas del alumno.
    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
