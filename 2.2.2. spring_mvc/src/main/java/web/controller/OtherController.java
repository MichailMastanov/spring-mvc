package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Dao.CarDao;

@Controller
public class OtherController {

   private final CarDao carDao;

   @Autowired
   public OtherController(CarDao carDao){
       this.carDao = carDao;
   }



    @GetMapping("/car")
    public String show(@RequestParam(value = "count", required = false) String count, Model model){
       System.out.println(carDao.getAllCars().toString());
       model.addAttribute("cars", carDao.getCars(count));
        return "/car";
    }

}
