// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.client.preference;

import java.math.BigDecimal;

/**
 * Tax from preference.
 */
public class PreferenceTaxRequest {
  /**
   * Tax type.
   */
  private final String type;
  /**
   * Tax value.
   */
  private final BigDecimal value;

  @java.lang.SuppressWarnings("all")
  PreferenceTaxRequest(final String type, final BigDecimal value) {
    this.type = type;
    this.value = value;
  }


  @java.lang.SuppressWarnings("all")
  public static class PreferenceTaxRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private String type;
    @java.lang.SuppressWarnings("all")
    private BigDecimal value;

    @java.lang.SuppressWarnings("all")
    PreferenceTaxRequestBuilder() {
    }

    /**
     * Tax type.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreferenceTaxRequest.PreferenceTaxRequestBuilder type(final String type) {
      this.type = type;
      return this;
    }

    /**
     * Tax value.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreferenceTaxRequest.PreferenceTaxRequestBuilder value(final BigDecimal value) {
      this.value = value;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public PreferenceTaxRequest build() {
      return new PreferenceTaxRequest(this.type, this.value);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "PreferenceTaxRequest.PreferenceTaxRequestBuilder(type=" + this.type + ", value=" + this.value + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static PreferenceTaxRequest.PreferenceTaxRequestBuilder builder() {
    return new PreferenceTaxRequest.PreferenceTaxRequestBuilder();
  }

  /**
   * Tax type.
   */
  @java.lang.SuppressWarnings("all")
  public String getType() {
    return this.type;
  }

  /**
   * Tax value.
   */
  @java.lang.SuppressWarnings("all")
  public BigDecimal getValue() {
    return this.value;
  }
}
