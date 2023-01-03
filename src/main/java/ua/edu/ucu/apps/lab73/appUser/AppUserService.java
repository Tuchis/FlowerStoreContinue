package ua.edu.ucu.apps.lab73.appUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ua.edu.ucu.apps.lab73.appUser.AppUser;

import java.util.List;

@Service
public class AppUserService {
    @Autowired
    private ua.edu.ucu.apps.lab73.appUser.AppUserRepository appUserRepository;
    public AppUserService(ua.edu.ucu.apps.lab73.appUser.AppUserRepository appUserRepository){
        this.appUserRepository = appUserRepository;
    }
    public List<AppUser> getAppUser(){
        return appUserRepository.findAll();
//        ua.edu.ucu.apps.lab73.store.Flower flower = new Flower(FlowerColor.BLUE, 100, 200);
//        return List.of(new ua.edu.ucu.apps.lab73.store.FlowerPack(flower, 20), new FlowerPack(flower, 300));
    }
    @PostMapping
    public void addAppUser(@RequestBody AppUser appUser) {
        appUserRepository.save(appUser);
    }
}
