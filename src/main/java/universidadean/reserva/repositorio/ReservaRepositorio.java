package universidadean.reserva.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import universidadean.reserva.modelo.Reserva;

@Repository
public interface ReservaRepositorio extends CrudRepository<Reserva, Long> {
}
