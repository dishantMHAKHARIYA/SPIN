package com.shervilg.spinboard.alexa.common;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public enum AlexaIntent {
  NEAREST_BDAY_INTENT("GetNearestBirthdayIntent"),
  STOP_INTENT("AMAZON.StopIntent"),
  CANCEL_INTENT("AMAZON.CancelIntent"),
  LIST_BDAY_INTENT("ListBirthdayIntent"),
  HELLO_WORLD_INTENT("HelloWorldIntent"),
  SET_KEY_INTENT("SetKeyIntent"),
  GET_KEY_INTENT("GetKeyIntent");

  private final String value;
}
