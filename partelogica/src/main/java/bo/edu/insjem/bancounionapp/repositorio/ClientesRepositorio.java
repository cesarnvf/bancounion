package bo.edu.insjem.bancounionapp.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import bo.edu.insjem.bancounionapp.modelo.Clientes;

public interface ClientesRepositorio extends JpaRepository<Clientes, Long>{
    
}
