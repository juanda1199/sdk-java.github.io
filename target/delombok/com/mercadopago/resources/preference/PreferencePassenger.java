// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.resources.preference;

import com.mercadopago.client.common.IdentificationRequest;

/**
 * Passenger info.
 */
public class PreferencePassenger {
  /**
   * First name.
   */
  private String firstName;
  /**
   * Last name.
   */
  private String lastName;
  /**
   * Identification.
   */
  private IdentificationRequest identification;

  /**
   * First name.
   */
  @java.lang.SuppressWarnings("all")
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Last name.
   */
  @java.lang.SuppressWarnings("all")
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Identification.
   */
  @java.lang.SuppressWarnings("all")
  public IdentificationRequest getIdentification() {
    return this.identification;
  }
}
