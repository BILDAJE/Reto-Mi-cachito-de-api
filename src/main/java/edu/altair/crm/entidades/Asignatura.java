package edu.altair.crm.entidades;

// Importamos las anotaciones necesarias para JPA.
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

import java.util.ArrayList;
import java.util.List;

// Indicamos que esta clase representa una entidad de la base de datos.
@Entity

// Indicamos el nombre de la tabla.
@Table(name = "asignaturas")
public class Asignatura {

    // Código que identifica a la asignatura.
    @Id
    @Column(name = "codigo", nullable = false, length = 20)
    private String codigo;

    // Nombre de la asignatura.
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    // Relación: cada asignatura es impartida por un único profesor.
    @ManyToOne(optional = false)
    @JoinColumn(name = "dni_profesor", nullable = false)
    private Profesor profesor;

    // Relación: una asignatura puede tener varias matrículas.
    @OneToMany(mappedBy = "asignatura")
    private List<Matricula> matriculas = new ArrayList<>();

    // Constructor vacío necesario para JPA.
    public Asignatura() {
    }

    // Constructor con los datos de la asignatura.
    public Asignatura(String codigo, String nombre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
    }
    
 // Comprobar si la asignatura está activa
    public boolean estaActiva() {
        if (matriculas.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    // Devuelve el código de la asignatura.
    public String getCodigo() {
        return codigo;
    }

    // Establece el código de la asignatura.
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Devuelve el nombre de la asignatura.
    public String getNombre() {
        return nombre;
    }

    // Establece el nombre de la asignatura.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Devuelve el profesor que imparte la asignatura.
    public Profesor getProfesor() {
        return profesor;
    }

    // Establece el profesor que imparte la asignatura.
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    // Devuelve las matrículas de la asignatura.
    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    // Establece las matrículas de la asignatura.
    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
