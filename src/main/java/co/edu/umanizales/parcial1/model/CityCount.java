package co.edu.umanizales.parcial1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CityCount {

    public String cityProcedence;
    public int countJob;
    public int countNotJob;
}
