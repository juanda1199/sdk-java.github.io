// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.resources.preference;

import java.math.BigDecimal;
import java.util.List;

/**
 * Shipments information from preference.
 */
public class PreferenceShipments {
  /**
   * Shipment mode.
   */
  private String mode;
  /**
   * The payer have the option to pick up the shipment in your store (mode:me2 only).
   */
  private Boolean localPickup;
  /**
   * Dimensions of the shipment in cm x cm x cm, gr (mode:me2 only).
   */
  private String dimensions;
  /**
   * Select default shipping method in checkout (mode:me2 only).
   */
  private String defaultShippingMethod;
  /**
   * Offer a shipping method as free shipping (mode:me2 only).
   */
  private List<PreferenceFreeMethod> freeMethods;
  /**
   * Shipment cost (mode:custom only).
   */
  private BigDecimal cost;
  /**
   * Free shipping for mode:custom.
   */
  private Boolean freeShipping;
  /**
   * Shipping address.
   */
  private PreferenceReceiverAddress receiverAddress;
  /**
   * If use express shipment.
   */
  private Boolean expressShipment;

  /**
   * Shipment mode.
   */
  @java.lang.SuppressWarnings("all")
  public String getMode() {
    return this.mode;
  }

  /**
   * The payer have the option to pick up the shipment in your store (mode:me2 only).
   */
  @java.lang.SuppressWarnings("all")
  public Boolean getLocalPickup() {
    return this.localPickup;
  }

  /**
   * Dimensions of the shipment in cm x cm x cm, gr (mode:me2 only).
   */
  @java.lang.SuppressWarnings("all")
  public String getDimensions() {
    return this.dimensions;
  }

  /**
   * Select default shipping method in checkout (mode:me2 only).
   */
  @java.lang.SuppressWarnings("all")
  public String getDefaultShippingMethod() {
    return this.defaultShippingMethod;
  }

  /**
   * Offer a shipping method as free shipping (mode:me2 only).
   */
  @java.lang.SuppressWarnings("all")
  public List<PreferenceFreeMethod> getFreeMethods() {
    return this.freeMethods;
  }

  /**
   * Shipment cost (mode:custom only).
   */
  @java.lang.SuppressWarnings("all")
  public BigDecimal getCost() {
    return this.cost;
  }

  /**
   * Free shipping for mode:custom.
   */
  @java.lang.SuppressWarnings("all")
  public Boolean getFreeShipping() {
    return this.freeShipping;
  }

  /**
   * Shipping address.
   */
  @java.lang.SuppressWarnings("all")
  public PreferenceReceiverAddress getReceiverAddress() {
    return this.receiverAddress;
  }

  /**
   * If use express shipment.
   */
  @java.lang.SuppressWarnings("all")
  public Boolean getExpressShipment() {
    return this.expressShipment;
  }
}
