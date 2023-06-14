package co.com.uco.managewood.api.controller.ciudad;

import co.com.uco.managewood.dto.CiudadDTO;
import co.com.uco.managewood.service.facade.ciudad.RegistrarCiudadFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("managewood/api/v1/ciudad")
public class RegistrarCiudadController {

    @Autowired
    private RegistrarCiudadFacade facade;

    @PostMapping
    public ResponseEntity<String> execute(@RequestBody CiudadDTO ciudad){
        facade.execute(ciudad);
        return new ResponseEntity<>("Éxito", HttpStatus.ACCEPTED);
    }
}
