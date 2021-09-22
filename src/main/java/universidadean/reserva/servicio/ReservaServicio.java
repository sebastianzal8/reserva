package universidadean.reserva.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import universidadean.reserva.modelo.Reserva;
import universidadean.reserva.repositorio.ReservaRepositorio;

import java.util.Optional;

@Service
public class ReservaServicio {
    @Autowired
    private ReservaRepositorio repositorio;

    // Guarda en la BD una reserva nueva con la informacion en el objeto r
    // Retornar en número de la reserva
    public Long crearReserva(Reserva r) {
        Reserva nuevaReserva = repositorio.save(r);
        return nuevaReserva.getCodReserva();
    }

    // Retorna una cuenta con el numero dado
    public Optional<Reserva> obtenerReserva(Long codReserva) {
        return repositorio.findById(codReserva);
    }

}
