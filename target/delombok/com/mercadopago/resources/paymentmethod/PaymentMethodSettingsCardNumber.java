// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.resources.paymentmethod;

/**
 * Card number settings.
 */
public class PaymentMethodSettingsCardNumber {
  /**
   * Card number length.
   */
  private Integer length;
  /**
   * Whether the card number can be validated using a checksum algorithm (usually Luhn).
   */
  private String validation;

  /**
   * Card number length.
   */
  @java.lang.SuppressWarnings("all")
  public Integer getLength() {
    return this.length;
  }

  /**
   * Whether the card number can be validated using a checksum algorithm (usually Luhn).
   */
  @java.lang.SuppressWarnings("all")
  public String getValidation() {
    return this.validation;
  }
}
