// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.client.merchantorder;

/**
 * State information.
 */
public class MerchantOrderReceiverAddressStateRequest {
  /**
   * State ID.
   */
  private final String id;
  /**
   * State name.
   */
  private final String name;

  @java.lang.SuppressWarnings("all")
  MerchantOrderReceiverAddressStateRequest(final String id, final String name) {
    this.id = id;
    this.name = name;
  }


  @java.lang.SuppressWarnings("all")
  public static class MerchantOrderReceiverAddressStateRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private String id;
    @java.lang.SuppressWarnings("all")
    private String name;

    @java.lang.SuppressWarnings("all")
    MerchantOrderReceiverAddressStateRequestBuilder() {
    }

    /**
     * State ID.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressStateRequest.MerchantOrderReceiverAddressStateRequestBuilder id(final String id) {
      this.id = id;
      return this;
    }

    /**
     * State name.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressStateRequest.MerchantOrderReceiverAddressStateRequestBuilder name(final String name) {
      this.name = name;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressStateRequest build() {
      return new MerchantOrderReceiverAddressStateRequest(this.id, this.name);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "MerchantOrderReceiverAddressStateRequest.MerchantOrderReceiverAddressStateRequestBuilder(id=" + this.id + ", name=" + this.name + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static MerchantOrderReceiverAddressStateRequest.MerchantOrderReceiverAddressStateRequestBuilder builder() {
    return new MerchantOrderReceiverAddressStateRequest.MerchantOrderReceiverAddressStateRequestBuilder();
  }

  /**
   * State ID.
   */
  @java.lang.SuppressWarnings("all")
  public String getId() {
    return this.id;
  }

  /**
   * State name.
   */
  @java.lang.SuppressWarnings("all")
  public String getName() {
    return this.name;
  }
}
