package caaguirre.springbootwebfluxdemo.service.impl;

import caaguirre.springbootwebfluxdemo.model.Propiedad;
import caaguirre.springbootwebfluxdemo.model.Vehiculo;
import caaguirre.springbootwebfluxdemo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Implementación de DemoService
 *
 * @author Carlos Aguirre <caaguirre194@gmail.com>
 * @version 1.0.0
 * @date 25/06/2022
 */
@Slf4j
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
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm:ss");
        Date resultDate = new Date(System.currentTimeMillis());
        log.info("WebFlux -> " + sdf.format(resultDate));

        Flux<Object> propiedadesUsuario$ = Flux.merge(obtenerPropiedadesPorUsuario(propietario), obtenerVehiculosPorUsuario(propietario));
        propiedadesUsuario$.subscribe(i -> {
            log.info(i.getClass() + "-> " + sdf.format(new Date(System.currentTimeMillis())));
        });

        return propiedadesUsuario$;
    }
}
