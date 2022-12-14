// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.resources.payment;

/**
 * PaymentTransactionData class.
 */
public class PaymentTransactionData {
  /**
   * QR code.
   */
  private String qrCode;
  /**
   * QR code image in Base 64.
   */
  private String qrCodeBase64;
  /**
   * Transaction ID.
   */
  private String transactionId;
  /**
   * Bank transfer ID.
   */
  private Long bankTransferId;
  /**
   * Financial institution.
   */
  private Long financialInstitution;
  /**
   * Bank info.
   */
  private PaymentBankInfo bankInfo;
  /**
   * Ticket Url.
   */
  private String ticketUrl;

  /**
   * QR code.
   */
  @java.lang.SuppressWarnings("all")
  public String getQrCode() {
    return this.qrCode;
  }

  /**
   * QR code image in Base 64.
   */
  @java.lang.SuppressWarnings("all")
  public String getQrCodeBase64() {
    return this.qrCodeBase64;
  }

  /**
   * Transaction ID.
   */
  @java.lang.SuppressWarnings("all")
  public String getTransactionId() {
    return this.transactionId;
  }

  /**
   * Bank transfer ID.
   */
  @java.lang.SuppressWarnings("all")
  public Long getBankTransferId() {
    return this.bankTransferId;
  }

  /**
   * Financial institution.
   */
  @java.lang.SuppressWarnings("all")
  public Long getFinancialInstitution() {
    return this.financialInstitution;
  }

  /**
   * Bank info.
   */
  @java.lang.SuppressWarnings("all")
  public PaymentBankInfo getBankInfo() {
    return this.bankInfo;
  }

  /**
   * Ticket Url.
   */
  @java.lang.SuppressWarnings("all")
  public String getTicketUrl() {
    return this.ticketUrl;
  }
}
