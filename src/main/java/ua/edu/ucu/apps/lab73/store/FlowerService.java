package ua.edu.ucu.apps.lab73.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class FlowerService {
    @Autowired
    private FlowerRepository flowerRepository;
    public FlowerService(FlowerRepository flowerRepository){
        this.flowerRepository = flowerRepository;
    }
    public List<Flower> getFlowers(){
        return flowerRepository.findAll();
//        ua.edu.ucu.apps.lab73.store.Flower flower = new Flower(FlowerColor.BLUE, 100, 200);
//        return List.of(new ua.edu.ucu.apps.lab73.store.FlowerPack(flower, 20), new FlowerPack(flower, 300));
    }
    @PostMapping
    public void addFlower(@RequestBody Flower flower) {
        flowerRepository.save(flower);
    }
}
