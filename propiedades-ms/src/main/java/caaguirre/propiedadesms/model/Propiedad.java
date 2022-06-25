package caaguirre.propiedadesms.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Propiedad {

    private String ciudad;
    private String direccion;
    private int estrato;
    private Long id;
    private int propietario;

}
