
package edu.altair.crm;

// Importamos las anotaciones necesarias para relacionar la clase con la base de datos.
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Indicamos que esta clase representa una entidad de la base de datos.
@Entity
// Indicamos que la entidad está relacionada con la tabla "alumnos".
@Table(name = "alumnos")
public class Alumno {

    // Identificador único del alumno, que se genera automáticamente en MySQL.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Datos personales del alumno.
    private String nombre;
    private String apellidos;
    private String telefono_fijo;
    private String telefono_movil;
    private String email;
    private String email_secundario;
    private String localidad;

    // Constructor vacío necesario para que JPA pueda crear objetos de esta clase.
    public Alumno() {
    }

    // Devuelve el identificador del alumno.
    public Long getId() {
        return id;
    }

    // Establece el identificador del alumno.
    public void setId(Long id) {
        this.id = id;
    }

    // Devuelve el nombre del alumno.
    public String getNombre() {
        return nombre;
    }

    // Establece el nombre del alumno.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Devuelve los apellidos del alumno.
    public String getApellidos() {
        return apellidos;
    }

    // Establece los apellidos del alumno.
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // Devuelve el teléfono fijo del alumno.
    public String getTelefono_fijo() {
        return telefono_fijo;
    }

    // Establece el teléfono fijo del alumno.
    public void setTelefono_fijo(String telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    // Devuelve el teléfono móvil del alumno.
    public String getTelefono_movil() {
        return telefono_movil;
    }

    // Establece el teléfono móvil del alumno.
    public void setTelefono_movil(String telefono_movil) {
        this.telefono_movil = telefono_movil;
    }

    // Devuelve el correo electrónico principal del alumno.
    public String getEmail() {
        return email;
    }

    // Establece el correo electrónico principal del alumno.
    public void setEmail(String email) {
        this.email = email;
    }

    // Devuelve el correo electrónico secundario del alumno.
    public String getEmail_secundario() {
        return email_secundario;
    }

    // Establece el correo electrónico secundario del alumno.
    public void setEmail_secundario(String email_secundario) {
        this.email_secundario = email_secundario;
    }

    // Devuelve la localidad del alumno.
    public String getLocalidad() {
        return localidad;
    }

    // Establece la localidad del alumno.
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
