package universidadean.reserva.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import universidadean.reserva.modelo.Reserva;
import universidadean.reserva.servicio.ReservaServicio;

import java.util.Optional;

@RestController
public class ReservaControlador {
    @Autowired
    private ReservaServicio servicio;

    @PostMapping("/reserva")
    public ResponseEntity<String> crearReserva(@RequestBody Reserva reserva) {
        Long codReserva = servicio.crearReserva(reserva);
        return new ResponseEntity<>("La reserva se creó exitosamente " + codReserva,
                HttpStatus.CREATED);
    }

    @GetMapping("/reserva/{codReserva}")
    public Optional<Reserva> obtenerReserva(@PathVariable Long codReserva) {
        return servicio.obtenerReserva(codReserva);
    }

    @PostMapping("/eliminar-reserva")
    public ResponseEntity<String> eliminarReserva(@RequestBody Reserva reserva) {
        Long codReserva = servicio.eliminarReserva(reserva);
        return new ResponseEntity<>("La reserva se elimino exitosamente " + codReserva,
                HttpStatus.CREATED);
    }


}
