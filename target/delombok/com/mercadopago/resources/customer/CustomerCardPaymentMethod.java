// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.resources.customer;

/**
 * Payment method details related to a customer card.
 */
public class CustomerCardPaymentMethod {
  /**
   * Id of the payment method.
   */
  private String id;
  /**
   * Name of payment method.
   */
  private String name;
  /**
   * Type of payment method.
   */
  private String paymentTypeId;
  /**
   * Thumbnail of payment method.
   */
  private String thumbnail;
  /**
   * Thumbnail of payment method from a secure source.
   */
  private String secureThumbnail;

  /**
   * Id of the payment method.
   */
  @java.lang.SuppressWarnings("all")
  public String getId() {
    return this.id;
  }

  /**
   * Name of payment method.
   */
  @java.lang.SuppressWarnings("all")
  public String getName() {
    return this.name;
  }

  /**
   * Type of payment method.
   */
  @java.lang.SuppressWarnings("all")
  public String getPaymentTypeId() {
    return this.paymentTypeId;
  }

  /**
   * Thumbnail of payment method.
   */
  @java.lang.SuppressWarnings("all")
  public String getThumbnail() {
    return this.thumbnail;
  }

  /**
   * Thumbnail of payment method from a secure source.
   */
  @java.lang.SuppressWarnings("all")
  public String getSecureThumbnail() {
    return this.secureThumbnail;
  }
}
