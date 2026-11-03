package biblioteca;

public class Pendiente implements EstadoReserva {
    @Override
    public String nombre() {
        return "Pendiente";
    }

    @Override
    public void confirmar(Reserva reserva) {
    }

    @Override
    public void cancelar(Reserva reserva) {
    }

    @Override
    public void finalizar(Reserva reserva) {
    }
}

