// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.resources.preference;

import java.math.BigDecimal;

/**
 * Tax from preference.
 */
public class PreferenceTax {
  /**
   * Tax type.
   */
  private String type;
  /**
   * Tax value.
   */
  private BigDecimal value;

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
