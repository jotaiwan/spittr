package com.spittr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.spittr.dto.Spittle;
import com.spittr.data.SpittleRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

  private static final String MAX_LONG_AS_STRING = "9223372036854775807";

//  private SpittleRepository spittleRepository;
//
//  @Autowired
//  public SpittleController(SpittleRepository spittleRepository) {
//    this.spittleRepository = spittleRepository;
//  }

//  @RequestMapping(method=RequestMethod.GET)
//  public List<Spittle> spittles(
//      @RequestParam(value="max", defaultValue=MAX_LONG_AS_STRING) long max,
//      @RequestParam(value="count", defaultValue="20") int count) {
//    return spittleRepository.findSpittles(max, count);
//  }

//  @RequestMapping(value="/{spittleId}", method=RequestMethod.GET)
//  public String spittle(
//      @PathVariable("spittleId") long spittleId,
//      Model model) {
//    model.addAttribute(spittleRepository.findOne(spittleId));
//    return "spittle";
//  }

//  @RequestMapping(method=RequestMethod.POST)
//  public String saveSpittle(SpittleForm form, Model model) throws Exception {
//    spittleRepository.save(new Spittle(null, form.getMessage(), new Date(),
//        form.getLongitude(), form.getLatitude()));
//    return "redirect:/spittles";
//  }


  @RequestMapping(method=RequestMethod.GET)
  public List<Spittle> spittles(
          @RequestParam(value="max", defaultValue=MAX_LONG_AS_STRING) long max,
          @RequestParam(value="count", defaultValue="20") int count) {

    List<Spittle> spittles = new ArrayList<Spittle>();
    spittles.add(new Spittle("m1", new Date(), 1234d, 5678d));
    return spittles;
  }

}
