package co.edu.umanizales.parcial1.service;


import co.edu.umanizales.parcial1.model.CityCount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<CityCount> students;
    private List<CityCount> cityCounts;

    public StudentService() {
        students = new ArrayList<>();
        students.add(new CityCount("Manizales", 0, 0,"100254","Sergio",true));
        students.add(new CityCount("Manizales", 0, 0, "1452154","Alvarar",true));
        students.add(new CityCount("Pereira", 0, 0, "456789123","Jilma",true));
    }
    public List<CityCount> getCantStudentsJob()
    {
        return students;
    }
    public List<CityCount> getStudentsJob() {
        List<String> cityCounts = new ArrayList<>();

        int cityManizales = 0;
        int cityPereira = 0;
        for (CityCount student : students) {

            if (student.getCity() == "Manizales" && student.isJob() == true) {
                cityManizales++;
            }
            cityCounts.add(String.valueOf(cityM));
        }
        if (student.getCity() == "Pereira" && student.isJob() == true) {
            cityManizales++;
        }
        cityCounts.add(String.valueOf(cityM));
    }

        return cityCounts;
    }
}
