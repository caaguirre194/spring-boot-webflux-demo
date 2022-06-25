package caaguirre.springbootwebfluxdemo.service;

import reactor.core.publisher.Flux;

import java.util.List;

/**
 * Interfaz con las firmas para implementación de WebFlux
 *
 * @author Carlos Aguirre <caaguirre194@gmail.com>
 * @version 1.0.0
 * @date 25/06/2022
 */
public interface DemoService {

    Flux<Object> obtenerTodasPropiedadesPorUsuario(int propietario) throws Exception;

}
