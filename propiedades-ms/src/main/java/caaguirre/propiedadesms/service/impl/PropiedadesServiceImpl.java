package caaguirre.propiedadesms.service.impl;

import caaguirre.propiedadesms.model.Propiedad;
import caaguirre.propiedadesms.service.PropiedadesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de VehiculosService
 *
 * @author Carlos Aguirre <caaguirre194@gmail.com>
 * @version 1.0.0
 * @date 25/06/2022
 */
@Service
public class PropiedadesServiceImpl implements PropiedadesService {

    @Override
    public List<Propiedad> obtenerPropiedadesPorUsuario(int propietario) throws Exception {
        List<Propiedad> list = new ArrayList<>();
        List<Propiedad> propiedades = new ArrayList<>();

        Propiedad casa = new Propiedad("Bogotá",
                "Cll 1 # 1 - 1",
                3,
                1L,
                1);

        Propiedad apartamento = new Propiedad("Cali",
                "Cll 2 # 2 - 2",
                2,
                2L,
                2);

        Propiedad finca = new Propiedad("Medellín",
                "Cll 3 # 3 - 3",
                3,
                3L,
                3
        );

        list.add(casa);
        list.add(apartamento);
        list.add(finca);

        for (Propiedad p : list) {
            if (p.getPropietario() == propietario) {
                propiedades.add(p);
            }
        }

        return propiedades;
    }

}
