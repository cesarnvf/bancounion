package bo.edu.insjem.bancounionapp.servicio;

import java.util.List;

import bo.edu.insjem.bancounionapp.modelo.Clientes;

public interface ClientesServicio {
    
    List<Clientes> obtenerTodos();

    Clientes obtenerPorId(Long id);

    void adicionar(Clientes dato);

    void modificar(Clientes dato);

    void eliminar(Long id);
    
}
