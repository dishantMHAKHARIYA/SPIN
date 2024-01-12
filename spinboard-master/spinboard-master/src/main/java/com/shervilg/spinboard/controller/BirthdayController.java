package com.shervilg.spinboard.controller;

import com.shervilg.spinboard.auth.ClientAuthentication;
import com.shervilg.spinboard.entity.Birthday;
import com.shervilg.spinboard.service.BirthdayService;
import com.shervilg.spinboard.dto.request.BirthdayCreationRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Month;
import java.util.List;
import java.util.StringJoiner;

@RestController
@RequestMapping("/birthday")
public class BirthdayController {

  @Autowired
  private BirthdayService birthdayService;

  @ClientAuthentication
  @PostMapping("/create")
  public Birthday createBirthday(@RequestBody BirthdayCreationRequest birthdayCreationRequest) {
    return birthdayService.createBirthday(birthdayCreationRequest);
  }

  @ClientAuthentication
  @GetMapping("/list")
  public List<Birthday> listBirthdays() {
    return birthdayService.getAllBirthdays();
  }

  @ClientAuthentication
  @GetMapping("/nearest")
  public String getNearest() {
    Birthday nearestBirthday = birthdayService.getNearestBirthday();
    StringJoiner joiner = new StringJoiner(" ");

    joiner.add(nearestBirthday.getFirstName());
    joiner.add(nearestBirthday.getLastName());
    joiner.add("" + nearestBirthday.getDate());
    joiner.add("" + Month.of(nearestBirthday.getMonth()));

    return "\"" + joiner + "\"";
  }
}
