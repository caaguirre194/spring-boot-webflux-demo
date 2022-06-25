package caaguirre.propiedadesms.controller;

import caaguirre.propiedadesms.model.Propiedad;
import caaguirre.propiedadesms.service.PropiedadesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/propiedades/api/v1")
public class PropiedadesController {

    private final PropiedadesService propiedadesService;

    public PropiedadesController(PropiedadesService propiedadesService) {
        this.propiedadesService = propiedadesService;
    }

    @GetMapping(path = "/{propietario}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Propiedad>> validarClientes(@PathVariable int propietario) throws Exception {

        return new ResponseEntity(
                propiedadesService.obtenerPropiedadesPorUsuario(propietario),
                HttpStatus.OK);
    }

}
