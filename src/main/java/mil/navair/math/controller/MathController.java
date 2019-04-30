package mil.navair.math.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("add/{first}/{second}")
    public ResponseEntity add(@PathVariable Number first, @PathVariable Number second) {

        return new ResponseEntity(first.doubleValue() + second.doubleValue(), HttpStatus.OK);
    }

    @GetMapping("subtract/{first}/{second}")
    public ResponseEntity subtract(@PathVariable Number first, @PathVariable Number second) {
        return new ResponseEntity(first.doubleValue() - second.doubleValue(), HttpStatus.OK);
    }

    @GetMapping("multiple/{first}/{second}")
    public ResponseEntity multiply(@PathVariable Number first, @PathVariable Number second) {
        return new ResponseEntity(first.doubleValue() * second.doubleValue(), HttpStatus.OK);
    }

    @GetMapping("divide/{first}/{second}")
    public ResponseEntity divide(@PathVariable Number first, @PathVariable Number second) {
        return new ResponseEntity(first.doubleValue() / second.doubleValue(), HttpStatus.OK);
    }
}
