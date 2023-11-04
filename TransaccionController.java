package com.transacciones.transaccion;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/transacciones")
public class TransaccionController {

    // Lista temporal para almacenar las transacciones 
    private List<Transaccion> transacciones = new ArrayList<>();

    @PostMapping("/agregar")
    public String agregarTransaccion(@RequestBody Transaccion transaccion) {
        // Aquí, deberías implementar la lógica para guardar la transacción en una base de datos o en otro lugar.
        transacciones.add(transaccion);
        return "Transacción agregada exitosamente.";
    }

    @GetMapping("/listar")
    public List<Transaccion> listarTransacciones() {
        return transacciones;
    }
}
