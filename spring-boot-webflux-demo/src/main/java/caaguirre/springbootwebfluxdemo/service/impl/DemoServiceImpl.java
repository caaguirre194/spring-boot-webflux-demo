package caaguirre.springbootwebfluxdemo.service.impl;

import caaguirre.springbootwebfluxdemo.model.Propiedad;
import caaguirre.springbootwebfluxdemo.model.Vehiculo;
import caaguirre.springbootwebfluxdemo.service.DemoService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Implementación de DemoService
 *
 * @author Carlos Aguirre <caaguirre194@gmail.com>
 * @version 1.0.0
 * @date 25/06/2022
 */
@Service
public class DemoServiceImpl implements DemoService {

    WebClient webClientVehiculos = WebClient.create("http://localhost:8087");
    WebClient webClientPropiedades = WebClient.create("http://localhost:8088");

    public Mono<Vehiculo[]> obtenerVehiculosPorUsuario(int id) {

        return webClientVehiculos.get()
                .uri("/vehiculos/api/v1/" + id)
                .retrieve()
                .bodyToMono(Vehiculo[].class);
    }

    public Mono<Propiedad[]> obtenerPropiedadesPorUsuario(int id) {

        return webClientPropiedades.get()
                .uri("/propiedades/api/v1/" + id)
                .retrieve()
                .bodyToMono(Propiedad[].class);
    }

    @Override
    public Flux<Object> obtenerTodasPropiedadesPorUsuario(int propietario) throws Exception {
        return Flux.merge(obtenerPropiedadesPorUsuario(propietario), obtenerVehiculosPorUsuario(propietario));
    }
}
