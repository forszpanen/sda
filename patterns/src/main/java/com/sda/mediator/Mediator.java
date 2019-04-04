package com.sda.mediator;

public interface Mediator {
  void send(String message, Person person);
}