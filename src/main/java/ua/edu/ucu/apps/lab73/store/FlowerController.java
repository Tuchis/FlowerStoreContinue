package ua.edu.ucu.apps.lab73.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flower")
public class FlowerController {
    @GetMapping
    public List<ua.edu.ucu.apps.lab73.store.FlowerPack> hello(){
        ua.edu.ucu.apps.lab73.store.Flower flower = new Flower(FlowerColor.BLUE, 100, 200);
//        return List.of(new Flower("blue", 100, 100),
//                new Flower("red", 299, 129),
//                new Flower("white", 399, 123));
        return List.of(new ua.edu.ucu.apps.lab73.store.FlowerPack(flower, 20), new FlowerPack(flower, 300));
    }
}
