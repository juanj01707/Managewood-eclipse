package co.com.uco.managewood.api.controller.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.uco.managewood.dto.ClienteDTO;
import co.com.uco.managewood.service.facade.cliente.RegistrarClienteFacade;


@RestController
@RequestMapping("managewood/api/v1/Cliente")
public class RegistrarClienteController {

    @Autowired
    private RegistrarClienteFacade facade;

    @PostMapping
    public ResponseEntity<String> execute(@RequestBody ClienteDTO Cliente){
        facade.execute(Cliente);
        return new ResponseEntity<>("Éxito", HttpStatus.ACCEPTED);
    }
}