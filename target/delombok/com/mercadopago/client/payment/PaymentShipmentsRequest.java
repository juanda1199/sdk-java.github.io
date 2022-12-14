// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.client.payment;

/**
 * PaymentShipmentsRequest class.
 */
public class PaymentShipmentsRequest {
  /**
   * Receiver Address.
   */
  private final PaymentReceiverAddressRequest receiverAddress;
  /**
   * True if the product is picked up at the store, false if not.
   */
  private final boolean localPickup;
  /**
   * True if the shipment is express, false if not.
   */
  private final boolean expressShipment;

  @java.lang.SuppressWarnings("all")
  PaymentShipmentsRequest(final PaymentReceiverAddressRequest receiverAddress, final boolean localPickup, final boolean expressShipment) {
    this.receiverAddress = receiverAddress;
    this.localPickup = localPickup;
    this.expressShipment = expressShipment;
  }


  @java.lang.SuppressWarnings("all")
  public static class PaymentShipmentsRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private PaymentReceiverAddressRequest receiverAddress;
    @java.lang.SuppressWarnings("all")
    private boolean localPickup;
    @java.lang.SuppressWarnings("all")
    private boolean expressShipment;

    @java.lang.SuppressWarnings("all")
    PaymentShipmentsRequestBuilder() {
    }

    /**
     * Receiver Address.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentShipmentsRequest.PaymentShipmentsRequestBuilder receiverAddress(final PaymentReceiverAddressRequest receiverAddress) {
      this.receiverAddress = receiverAddress;
      return this;
    }

    /**
     * True if the product is picked up at the store, false if not.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentShipmentsRequest.PaymentShipmentsRequestBuilder localPickup(final boolean localPickup) {
      this.localPickup = localPickup;
      return this;
    }

    /**
     * True if the shipment is express, false if not.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentShipmentsRequest.PaymentShipmentsRequestBuilder expressShipment(final boolean expressShipment) {
      this.expressShipment = expressShipment;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public PaymentShipmentsRequest build() {
      return new PaymentShipmentsRequest(this.receiverAddress, this.localPickup, this.expressShipment);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "PaymentShipmentsRequest.PaymentShipmentsRequestBuilder(receiverAddress=" + this.receiverAddress + ", localPickup=" + this.localPickup + ", expressShipment=" + this.expressShipment + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static PaymentShipmentsRequest.PaymentShipmentsRequestBuilder builder() {
    return new PaymentShipmentsRequest.PaymentShipmentsRequestBuilder();
  }

  /**
   * Receiver Address.
   */
  @java.lang.SuppressWarnings("all")
  public PaymentReceiverAddressRequest getReceiverAddress() {
    return this.receiverAddress;
  }

  /**
   * True if the product is picked up at the store, false if not.
   */
  @java.lang.SuppressWarnings("all")
  public boolean isLocalPickup() {
    return this.localPickup;
  }

  /**
   * True if the shipment is express, false if not.
   */
  @java.lang.SuppressWarnings("all")
  public boolean isExpressShipment() {
    return this.expressShipment;
  }
}
