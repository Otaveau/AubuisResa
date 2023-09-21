package com.aubuisapi.AubuisResa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class ReservationController {

    @Autowired
    ReservationRepository reservationRespository;

    public ReservationController(ReservationRepository reservationRespository) {
        this.reservationRespository = reservationRespository;
    }

    @GetMapping("/reservations")
    List<Reservation> findAll() {
        return reservationRespository.findAll();
    }

    @PostMapping("/reservations")
    Reservation newReservation(@RequestBody Reservation newReservation) {
        return reservationRespository.save(newReservation);
    }

}
