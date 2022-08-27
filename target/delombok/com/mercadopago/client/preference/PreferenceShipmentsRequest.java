// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.client.preference;

import java.math.BigDecimal;
import java.util.List;

/**
 * Shipments information.
 */
public class PreferenceShipmentsRequest {
  /**
   * Shipment mode.
   */
  private final String mode;
  /**
   * The payer have the option to pick up the shipment in your store (mode:me2 only).
   */
  private final Boolean localPickup;
  /**
   * Dimensions of the shipment in cm x cm x cm, gr (mode:me2 only).
   */
  private final String dimensions;
  /**
   * Select default shipping method in checkout (mode:me2 only).
   */
  private final String defaultShippingMethod;
  /**
   * Offer a shipping method as free shipping (mode:me2 only).
   */
  private final List<PreferenceFreeMethodRequest> freeMethods;
  /**
   * Shipment cost (mode:custom only).
   */
  private final BigDecimal cost;
  /**
   * Free shipping for mode:custom.
   */
  private final Boolean freeShipping;
  /**
   * Shipping address.
   */
  private final PreferenceReceiverAddressRequest receiverAddress;
  /**
   * If use express shipment.
   */
  private final Boolean expressShipment;

  @java.lang.SuppressWarnings("all")
  PreferenceShipmentsRequest(final String mode, final Boolean localPickup, final String dimensions, final String defaultShippingMethod, final List<PreferenceFreeMethodRequest> freeMethods, final BigDecimal cost, final Boolean freeShipping, final PreferenceReceiverAddressRequest receiverAddress, final Boolean expressShipment) {
    this.mode = mode;
    this.localPickup = localPickup;
    this.dimensions = dimensions;
    this.defaultShippingMethod = defaultShippingMethod;
    this.freeMethods = freeMethods;
    this.cost = cost;
    this.freeShipping = freeShipping;
    this.receiverAddress = receiverAddress;
    this.expressShipment = expressShipment;
  }


  @java.lang.SuppressWarnings("all")
  public static class PreferenceShipmentsRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private String mode;
    @java.lang.SuppressWarnings("all")
    private Boolean localPickup;
    @java.lang.SuppressWarnings("all")
    private String dimensions;
    @java.lang.SuppressWarnings("all")
    private String defaultShippingMethod;
    @java.lang.SuppressWarnings("all")
    private List<PreferenceFreeMethodRequest> freeMethods;
    @java.lang.SuppressWarnings("all")
    private BigDecimal cost;
    @java.lang.SuppressWarnings("all")
    private Boolean freeShipping;
    @java.lang.SuppressWarnings("all")
    private PreferenceReceiverAddressRequest receiverAddress;
    @java.lang.SuppressWarnings("all")
    private Boolean expressShipment;

    @java.lang.SuppressWarnings("all")
    PreferenceShipmentsRequestBuilder() {
    }

    /**
     * Shipment mode.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreferenceShipmentsRequest.PreferenceShipmentsRequestBuilder mode(final String mode) {
      this.mode = mode;
      return this;
    }

    /**
     * The payer have the option to pick up the shipment in your store (mode:me2 only).
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreferenceShipmentsRequest.PreferenceShipmentsRequestBuilder localPickup(final Boolean localPickup) {
      this.localPickup = localPickup;
      return this;
    }

    /**
     * Dimensions of the shipment in cm x cm x cm, gr (mode:me2 only).
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreferenceShipmentsRequest.PreferenceShipmentsRequestBuilder dimensions(final String dimensions) {
      this.dimensions = dimensions;
      return this;
    }

    /**
     * Select default shipping method in checkout (mode:me2 only).
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreferenceShipmentsRequest.PreferenceShipmentsRequestBuilder defaultShippingMethod(final String defaultShippingMethod) {
      this.defaultShippingMethod = defaultShippingMethod;
      return this;
    }

    /**
     * Offer a shipping method as free shipping (mode:me2 only).
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreferenceShipmentsRequest.PreferenceShipmentsRequestBuilder freeMethods(final List<PreferenceFreeMethodRequest> freeMethods) {
      this.freeMethods = freeMethods;
      return this;
    }

    /**
     * Shipment cost (mode:custom only).
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreferenceShipmentsRequest.PreferenceShipmentsRequestBuilder cost(final BigDecimal cost) {
      this.cost = cost;
      return this;
    }

    /**
     * Free shipping for mode:custom.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreferenceShipmentsRequest.PreferenceShipmentsRequestBuilder freeShipping(final Boolean freeShipping) {
      this.freeShipping = freeShipping;
      return this;
    }

    /**
     * Shipping address.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreferenceShipmentsRequest.PreferenceShipmentsRequestBuilder receiverAddress(final PreferenceReceiverAddressRequest receiverAddress) {
      this.receiverAddress = receiverAddress;
      return this;
    }

    /**
     * If use express shipment.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreferenceShipmentsRequest.PreferenceShipmentsRequestBuilder expressShipment(final Boolean expressShipment) {
      this.expressShipment = expressShipment;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public PreferenceShipmentsRequest build() {
      return new PreferenceShipmentsRequest(this.mode, this.localPickup, this.dimensions, this.defaultShippingMethod, this.freeMethods, this.cost, this.freeShipping, this.receiverAddress, this.expressShipment);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "PreferenceShipmentsRequest.PreferenceShipmentsRequestBuilder(mode=" + this.mode + ", localPickup=" + this.localPickup + ", dimensions=" + this.dimensions + ", defaultShippingMethod=" + this.defaultShippingMethod + ", freeMethods=" + this.freeMethods + ", cost=" + this.cost + ", freeShipping=" + this.freeShipping + ", receiverAddress=" + this.receiverAddress + ", expressShipment=" + this.expressShipment + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static PreferenceShipmentsRequest.PreferenceShipmentsRequestBuilder builder() {
    return new PreferenceShipmentsRequest.PreferenceShipmentsRequestBuilder();
  }

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
  public List<PreferenceFreeMethodRequest> getFreeMethods() {
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
  public PreferenceReceiverAddressRequest getReceiverAddress() {
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