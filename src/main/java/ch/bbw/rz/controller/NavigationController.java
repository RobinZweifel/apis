package ch.bbw.rz.controller;

import ch.bbw.rz.model.Animal;
import ch.bbw.rz.model.Enclosure;
import ch.bbw.rz.model.Zookeeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class NavigationController {

    @GetMapping("/weather")
    public String getAnimals(Model model){
        model.addAttribute("animals", animalController.getAllAnimals());
        return "animals";
    }


}
