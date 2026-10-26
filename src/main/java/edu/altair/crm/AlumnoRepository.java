
package edu.altair.crm;

// Importamos JpaRepository, que proporciona operaciones para trabajar con la base de datos.
import org.springframework.data.jpa.repository.JpaRepository;

import edu.altair.crm.entidades.Alumno;

// Repositorio encargado de acceder a los datos de los alumnos.
// Hereda de JpaRepository las operaciones básicas de consulta y modificación.
public interface AlumnoRepository extends JpaRepository<Alumno, String> {

}
