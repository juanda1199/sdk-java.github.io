// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.resources.preference;

import com.mercadopago.resources.common.Address;

/**
 * Shipping address.
 */
public class PreferenceReceiverAddress extends Address {
  /**
   * Country.
   */
  private String countryName;
  /**
   * State.
   */
  private String stateName;
  /**
   * Floor.
   */
  private String floor;
  /**
   * Apartment.
   */
  private String apartment;
  /**
   * City name.
   */
  private String cityName;

  /**
   * Country.
   */
  @java.lang.SuppressWarnings("all")
  public String getCountryName() {
    return this.countryName;
  }

  /**
   * State.
   */
  @java.lang.SuppressWarnings("all")
  public String getStateName() {
    return this.stateName;
  }

  /**
   * Floor.
   */
  @java.lang.SuppressWarnings("all")
  public String getFloor() {
    return this.floor;
  }

  /**
   * Apartment.
   */
  @java.lang.SuppressWarnings("all")
  public String getApartment() {
    return this.apartment;
  }

  /**
   * City name.
   */
  @java.lang.SuppressWarnings("all")
  public String getCityName() {
    return this.cityName;
  }
}
