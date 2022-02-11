package za.co.sb.qpay.barista.boundary;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.sb.qpay.barista.control.BaristaService;
import za.co.sb.qpay.barista.entity.Coffee;

import java.util.List;

@RestController
@RequestMapping("barista")
@Log
@RequiredArgsConstructor
public class BaristaResource {

    private final BaristaService baristaService;

    @GetMapping
    public ResponseEntity<List<Coffee>> smokeTest() {
        List<Coffee> coffees = baristaService.listCoffees();
        return ResponseEntity.ok(coffees);
    }
}
