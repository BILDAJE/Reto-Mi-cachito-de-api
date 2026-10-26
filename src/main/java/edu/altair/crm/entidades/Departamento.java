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

// Indicamos el nombre de la tabla.
@Table(name = "departamentos")
public class Departamento {

    // Código que identifica al departamento.
    @Id
    @Column(name = "codigo", nullable = false, length = 20)
    private String codigo;

    // Nombre del departamento.
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    // Relación: un departamento puede tener varios profesores.
    @OneToMany(mappedBy = "departamento")
    private List<Profesor> profesores = new ArrayList<>();

    // Constructor vacío necesario para JPA.
    public Departamento() {
    }

    // Constructor con los datos del departamento.
    public Departamento(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Devuelve el código del departamento.
    public String getCodigo() {
        return codigo;
    }

    // Establece el código del departamento.
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Devuelve el nombre del departamento.
    public String getNombre() {
        return nombre;
    }

    // Establece el nombre del departamento.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Devuelve la lista de profesores.
    public List<Profesor> getProfesores() {
        return profesores;
    }

    // Establece la lista de profesores.
    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
}
