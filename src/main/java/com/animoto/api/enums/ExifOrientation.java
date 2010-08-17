package com.animoto.api.enums;

public enum ExifOrientation {
  ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8);

  private int value;

  ExifOrientation(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
