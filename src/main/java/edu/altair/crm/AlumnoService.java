
package edu.altair.crm;

import java.util.List;
import org.springframework.stereotype.Service;
import java.util.Optional;

// Indicamos a Spring que esta clase contiene la lógica de la aplicación.
@Service
public class AlumnoService {

    // Repositorio que permite acceder a los datos de los alumnos.
    private final AlumnoRepository alumnoRepository;

    // Constructor que recibe el repositorio para poder utilizarlo en el servicio.
    public AlumnoService(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    // Obtiene y devuelve la lista de todos los alumnos.
    public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }

    // Busca un alumno por su identificador.
    // Si no existe, lanza una excepción indicando que no se ha encontrado.
    public Alumno buscarPorId(Long id) {
        Optional<Alumno> alumno = alumnoRepository.findById(id);

        if (alumno.isPresent()) {
            return alumno.get();
        } else {
            throw new RuntimeException("Alumno no encontrado");
        }
    }
}
