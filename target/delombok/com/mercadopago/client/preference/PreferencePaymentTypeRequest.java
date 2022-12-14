// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.client.preference;

/**
 * Payment type information.
 */
public class PreferencePaymentTypeRequest {
  /**
   * Payment type ID.
   */
  private final String id;

  @java.lang.SuppressWarnings("all")
  PreferencePaymentTypeRequest(final String id) {
    this.id = id;
  }


  @java.lang.SuppressWarnings("all")
  public static class PreferencePaymentTypeRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private String id;

    @java.lang.SuppressWarnings("all")
    PreferencePaymentTypeRequestBuilder() {
    }

    /**
     * Payment type ID.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreferencePaymentTypeRequest.PreferencePaymentTypeRequestBuilder id(final String id) {
      this.id = id;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public PreferencePaymentTypeRequest build() {
      return new PreferencePaymentTypeRequest(this.id);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "PreferencePaymentTypeRequest.PreferencePaymentTypeRequestBuilder(id=" + this.id + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static PreferencePaymentTypeRequest.PreferencePaymentTypeRequestBuilder builder() {
    return new PreferencePaymentTypeRequest.PreferencePaymentTypeRequestBuilder();
  }

  /**
   * Payment type ID.
   */
  @java.lang.SuppressWarnings("all")
  public String getId() {
    return this.id;
  }
}
