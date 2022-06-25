package caaguirre.springbootwebfluxdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Propiedad {

    private String ciudad;
    private String direccion;
    private int estrato;
    private Long id;
    private int propietario;

}
