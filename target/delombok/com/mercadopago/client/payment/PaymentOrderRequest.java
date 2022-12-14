// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.client.payment;

/**
 * PaymentOrderRequest class.
 */
public class PaymentOrderRequest {
  /**
   * Id of the associated purchase order.
   */
  private final Long id;
  /**
   * Order type.
   */
  private final String type;

  @java.lang.SuppressWarnings("all")
  PaymentOrderRequest(final Long id, final String type) {
    this.id = id;
    this.type = type;
  }


  @java.lang.SuppressWarnings("all")
  public static class PaymentOrderRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private Long id;
    @java.lang.SuppressWarnings("all")
    private String type;

    @java.lang.SuppressWarnings("all")
    PaymentOrderRequestBuilder() {
    }

    /**
     * Id of the associated purchase order.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentOrderRequest.PaymentOrderRequestBuilder id(final Long id) {
      this.id = id;
      return this;
    }

    /**
     * Order type.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentOrderRequest.PaymentOrderRequestBuilder type(final String type) {
      this.type = type;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public PaymentOrderRequest build() {
      return new PaymentOrderRequest(this.id, this.type);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "PaymentOrderRequest.PaymentOrderRequestBuilder(id=" + this.id + ", type=" + this.type + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static PaymentOrderRequest.PaymentOrderRequestBuilder builder() {
    return new PaymentOrderRequest.PaymentOrderRequestBuilder();
  }

  /**
   * Id of the associated purchase order.
   */
  @java.lang.SuppressWarnings("all")
  public Long getId() {
    return this.id;
  }

  /**
   * Order type.
   */
  @java.lang.SuppressWarnings("all")
  public String getType() {
    return this.type;
  }
}
