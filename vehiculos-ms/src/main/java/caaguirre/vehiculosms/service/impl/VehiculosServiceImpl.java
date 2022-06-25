package caaguirre.vehiculosms.service.impl;

import caaguirre.vehiculosms.model.Vehiculo;
import caaguirre.vehiculosms.service.VehiculosService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Implementación de VehiculosService
 *
 * @author Carlos Aguirre <caaguirre194@gmail.com>
 * @version 1.0.0
 * @date 25/06/2022
 */
@Slf4j
@Service
public class VehiculosServiceImpl implements VehiculosService {

    @Override
    public List<Vehiculo> obtenerVehiculosPorUsuario(int propietario) throws Exception {

        List<Vehiculo> list = new ArrayList<>();
        List<Vehiculo> vehiculosPropietario = new ArrayList<>();

        Vehiculo carro = new Vehiculo("Rojo",
                "Volkswagen",
                2015,
                "ABC123",
                "Cuatro ruedas", 1);

        Vehiculo moto = new Vehiculo("Blanco",
                "Yamaha",
                2018,
                "ABC12E",
                "Dos ruedas", 2);

        Vehiculo camioneta = new Vehiculo(
                "Gris",
                "Toyota",
                2021,
                "ABC321",
                "Cuatro ruedas", 3
        );

        Vehiculo bicicleta = new Vehiculo(
                "Negro",
                "Focus",
                2019,
                "",
                "Dos ruedas", 1
        );

        list.add(carro);
        list.add(moto);
        list.add(camioneta);
        list.add(bicicleta);

        for (Vehiculo v : list) {
            if (v.getPropietario() == propietario) {
                vehiculosPropietario.add(v);
            }
        }

        Thread.sleep(2000);

        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm:ss");
        Date resultDate = new Date(System.currentTimeMillis());
        log.info("Vehiculos -> " + sdf.format(resultDate));

        return vehiculosPropietario;
    }

}
