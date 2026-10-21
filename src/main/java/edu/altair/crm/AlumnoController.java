
package edu.altair.crm;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Indicamos a Spring que esta clase es un controlador REST.
@RestController
// Establecemos la ruta base de los endpoints de alumnos.
@RequestMapping("/api/alumnos")
public class AlumnoController {

    // Servicio encargado de gestionar las operaciones sobre los alumnos.
    private final AlumnoService alumnoService;

    // Constructor que recibe el servicio para poder utilizarlo en el controlador.
    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    // Endpoint GET que devuelve la lista de todos los alumnos.
    // URL: /api/alumnos
    @GetMapping
    public List<Alumno> listarAlumnos() {
        return alumnoService.listarAlumnos();
    }

    // Endpoint GET que devuelve un alumno a partir de su identificador.
    // URL: /api/alumnos/{id}
    @GetMapping("/{id}")
    public Alumno buscarPorId(@PathVariable Long id) {
        return alumnoService.buscarPorId(id);
    }
}
