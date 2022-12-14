// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.resources.merchantorder;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

/**
 * Payment information.
 */
public class MerchantOrderPayment {
  /**
   * Payment ID.
   */
  private Long id;
  /**
   * Product cost.
   */
  private BigDecimal transactionAmount;
  /**
   * Total amount paid.
   */
  private BigDecimal totalPaidAmount;
  /**
   * Shipping fee.
   */
  private BigDecimal shippingCost;
  /**
   * ID of the currency used in payment.
   */
  private String currencyId;
  /**
   * Payment status.
   */
  private String status;
  /**
   * Gives more detailed information on the current state or rejection cause.
   */
  private String statusDetails;
  /**
   * Operation type.
   */
  private String operationType;
  /**
   * Approval date.
   */
  private OffsetDateTime dateApproved;
  /**
   * Date of creation.
   */
  private OffsetDateTime dateCreated;
  /**
   * Last modified date.
   */
  private OffsetDateTime lastModified;
  /**
   * Amount refunded in this payment.
   */
  private BigDecimal amountRefunded;

  /**
   * Payment ID.
   */
  @java.lang.SuppressWarnings("all")
  public Long getId() {
    return this.id;
  }

  /**
   * Product cost.
   */
  @java.lang.SuppressWarnings("all")
  public BigDecimal getTransactionAmount() {
    return this.transactionAmount;
  }

  /**
   * Total amount paid.
   */
  @java.lang.SuppressWarnings("all")
  public BigDecimal getTotalPaidAmount() {
    return this.totalPaidAmount;
  }

  /**
   * Shipping fee.
   */
  @java.lang.SuppressWarnings("all")
  public BigDecimal getShippingCost() {
    return this.shippingCost;
  }

  /**
   * ID of the currency used in payment.
   */
  @java.lang.SuppressWarnings("all")
  public String getCurrencyId() {
    return this.currencyId;
  }

  /**
   * Payment status.
   */
  @java.lang.SuppressWarnings("all")
  public String getStatus() {
    return this.status;
  }

  /**
   * Gives more detailed information on the current state or rejection cause.
   */
  @java.lang.SuppressWarnings("all")
  public String getStatusDetails() {
    return this.statusDetails;
  }

  /**
   * Operation type.
   */
  @java.lang.SuppressWarnings("all")
  public String getOperationType() {
    return this.operationType;
  }

  /**
   * Approval date.
   */
  @java.lang.SuppressWarnings("all")
  public OffsetDateTime getDateApproved() {
    return this.dateApproved;
  }

  /**
   * Date of creation.
   */
  @java.lang.SuppressWarnings("all")
  public OffsetDateTime getDateCreated() {
    return this.dateCreated;
  }

  /**
   * Last modified date.
   */
  @java.lang.SuppressWarnings("all")
  public OffsetDateTime getLastModified() {
    return this.lastModified;
  }

  /**
   * Amount refunded in this payment.
   */
  @java.lang.SuppressWarnings("all")
  public BigDecimal getAmountRefunded() {
    return this.amountRefunded;
  }
}
