package caaguirre.vehiculosms.service;

import caaguirre.vehiculosms.model.Vehiculo;

import java.util.List;

/**
 * Interfaz con las firmas para implementación de vehiculos
 *
 * @author Carlos Aguirre <caaguirre194@gmail.com>
 * @version 1.0.0
 * @date 25/06/2022
 */
public interface VehiculosService {

    List<Vehiculo> obtenerVehiculosPorUsuario(int propietario) throws Exception;

}
