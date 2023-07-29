package bo.edu.insjem.bancounionapp.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bo.edu.insjem.bancounionapp.modelo.Clientes;
import bo.edu.insjem.bancounionapp.repositorio.ClientesRepositorio;
import bo.edu.insjem.bancounionapp.servicio.ClientesServicio;

@Service
public class ClientesServicioImplementacion implements ClientesServicio{

    @Autowired
    ClientesRepositorio clientesRepositorio;

    @Override
    public List<Clientes> obtenerTodos() {
        return clientesRepositorio.findAll();
    }

    @Override
    public Clientes obtenerPorId(Long id) {
        return clientesRepositorio.findById(id).orElse(null);
    }

    @Override
    public void adicionar(Clientes dato) {
        clientesRepositorio.save(dato);
    }

    @Override
    public void modificar(Clientes dato) {
        clientesRepositorio.save(dato);
    }

    @Override
    public void eliminar(Long id) {
        clientesRepositorio.deleteById(id);
    }
    
}
