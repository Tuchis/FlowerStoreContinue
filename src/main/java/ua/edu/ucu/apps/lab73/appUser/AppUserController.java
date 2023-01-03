package ua.edu.ucu.apps.lab73.appUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.edu.ucu.apps.lab73.appUser.AppUser;
import ua.edu.ucu.apps.lab73.appUser.AppUserService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flower")
public class AppUserController {
    private final AppUserService appUserService;
    @Autowired
    public AppUserController(AppUserService appUserService){
        this.appUserService = appUserService;
    }

    @GetMapping
    public List<AppUser> getAppUser(){
        return appUserService.getAppUser();
    }

    @PostMapping
    public void addAppUser(@RequestBody AppUser appUser){
        appUserService.addAppUser(appUser);
    }

}
