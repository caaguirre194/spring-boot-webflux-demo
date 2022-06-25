package caaguirre.springbootwebfluxdemo.controller;

import caaguirre.springbootwebfluxdemo.service.DemoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/demo/api/v1")
public class DemoController {

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping(path = "/{propietario}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Flux<Object>> validarClientes(@PathVariable int propietario) throws Exception {

        return new ResponseEntity(
                demoService.obtenerTodasPropiedadesPorUsuario(propietario),
                HttpStatus.OK);
    }

}
