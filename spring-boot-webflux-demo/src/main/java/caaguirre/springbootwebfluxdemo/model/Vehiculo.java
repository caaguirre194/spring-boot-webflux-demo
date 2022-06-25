package caaguirre.springbootwebfluxdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculo {

    private String color;
    private String marca;
    private int modelo;
    private String placa;
    private String tipoVehiculo;
    private int propietario;

}
