package caaguirre.vehiculosms.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vehiculo {

    private String color;
    private String marca;
    private int modelo;
    private String placa;
    private String tipoVehiculo;
    private int propietario;

}
