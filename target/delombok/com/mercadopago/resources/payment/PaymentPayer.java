// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.resources.payment;

import com.mercadopago.resources.common.Identification;

/**
 * PaymentPayer class.
 */
public class PaymentPayer {
  /**
   * Payer's identification type (mandatory if the payer is a Customer).
   */
  private String type;
  /**
   * Payer's ID.
   */
  private String id;
  /**
   * Email of the payer.
   */
  private String email;
  /**
   * Payer's personal identification.
   */
  private Identification identification;
  /**
   * Payer's first name.
   */
  private String firstName;
  /**
   * Payer's last name.
   */
  private String lastName;
  /**
   * Payer's entity type (only for bank transfers).
   */
  private String entityType;

  /**
   * Payer's identification type (mandatory if the payer is a Customer).
   */
  @java.lang.SuppressWarnings("all")
  public String getType() {
    return this.type;
  }

  /**
   * Payer's ID.
   */
  @java.lang.SuppressWarnings("all")
  public String getId() {
    return this.id;
  }

  /**
   * Email of the payer.
   */
  @java.lang.SuppressWarnings("all")
  public String getEmail() {
    return this.email;
  }

  /**
   * Payer's personal identification.
   */
  @java.lang.SuppressWarnings("all")
  public Identification getIdentification() {
    return this.identification;
  }

  /**
   * Payer's first name.
   */
  @java.lang.SuppressWarnings("all")
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Payer's last name.
   */
  @java.lang.SuppressWarnings("all")
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Payer's entity type (only for bank transfers).
   */
  @java.lang.SuppressWarnings("all")
  public String getEntityType() {
    return this.entityType;
  }
}
