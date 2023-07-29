package bo.edu.insjem.bancounionapp.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bo.edu.insjem.bancounionapp.modelo.Clientes;
import bo.edu.insjem.bancounionapp.servicio.ClientesServicio;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClientesControlador {

    @Autowired
    ClientesServicio clientesServicio;

    @GetMapping
    ResponseEntity<?> obtenerTodos() {
        return new ResponseEntity<List<Clientes>>(clientesServicio.obtenerTodos(), HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    ResponseEntity<?> obtenerPorId(@PathVariable Long id) {
        return new ResponseEntity<Clientes>(clientesServicio.obtenerPorId(id), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<?> adicionar(@RequestBody Clientes dato) {
        clientesServicio.adicionar(dato);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
