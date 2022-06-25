package caaguirre.propiedadesms.service;

import caaguirre.propiedadesms.model.Propiedad;

import java.util.List;

/**
 * Interfaz con las firmas para implementación de propiedades
 *
 * @author Carlos Aguirre <caaguirre194@gmail.com>
 * @version 1.0.0
 * @date 25/06/2022
 */
public interface PropiedadesService {

    List<Propiedad> obtenerPropiedadesPorUsuario(int propietario) throws Exception;

}
