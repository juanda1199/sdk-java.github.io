// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.client.payment;

/**
 * PaymentTransactionDetailsRequest class.
 */
public class PaymentTransactionDetailsRequest {
  /**
   * External financial institution identifier.
   */
  private final String financialInstitution;

  @java.lang.SuppressWarnings("all")
  PaymentTransactionDetailsRequest(final String financialInstitution) {
    this.financialInstitution = financialInstitution;
  }


  @java.lang.SuppressWarnings("all")
  public static class PaymentTransactionDetailsRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private String financialInstitution;

    @java.lang.SuppressWarnings("all")
    PaymentTransactionDetailsRequestBuilder() {
    }

    /**
     * External financial institution identifier.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentTransactionDetailsRequest.PaymentTransactionDetailsRequestBuilder financialInstitution(final String financialInstitution) {
      this.financialInstitution = financialInstitution;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public PaymentTransactionDetailsRequest build() {
      return new PaymentTransactionDetailsRequest(this.financialInstitution);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "PaymentTransactionDetailsRequest.PaymentTransactionDetailsRequestBuilder(financialInstitution=" + this.financialInstitution + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static PaymentTransactionDetailsRequest.PaymentTransactionDetailsRequestBuilder builder() {
    return new PaymentTransactionDetailsRequest.PaymentTransactionDetailsRequestBuilder();
  }

  /**
   * External financial institution identifier.
   */
  @java.lang.SuppressWarnings("all")
  public String getFinancialInstitution() {
    return this.financialInstitution;
  }
}
