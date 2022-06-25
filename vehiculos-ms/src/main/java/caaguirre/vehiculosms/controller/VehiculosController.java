package caaguirre.vehiculosms.controller;

import caaguirre.vehiculosms.model.Vehiculo;
import caaguirre.vehiculosms.service.VehiculosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/vehiculos/api/v1")
public class VehiculosController {

    private final VehiculosService vehiculosService;

    public VehiculosController(VehiculosService vehiculosService) {
        this.vehiculosService = vehiculosService;
    }

    @GetMapping(path = "/{propietario}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Vehiculo>> validarClientes(@PathVariable int propietario) throws Exception {

        return new ResponseEntity(
                vehiculosService.obtenerVehiculosPorUsuario(propietario),
                HttpStatus.OK);
    }

}
