package bo.edu.insjem.bancounionapp.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcliente;
    private String paterno;
    private String materno;
    private String nombres;
    private String genero;
    private LocalDate fechanacimiento;    
}

