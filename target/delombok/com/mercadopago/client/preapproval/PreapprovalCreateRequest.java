// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.client.preapproval;

/**
 * Data to create a Preapproval.
 */
public class PreapprovalCreateRequest {
  /**
   * Payer email.
   */
  private final String payerEmail;
  /**
   * Return URL.
   */
  private final String backUrl;
  /**
   * Seller ID.
   */
  private final String collectorId;
  /**
   * Preapproval title.
   */
  private final String reason;
  /**
   * Preapproval reference value.
   */
  private final String externalReference;
  /**
   * Preapproval status.
   */
  private final String status;
  /**
   * Recurring data.
   */
  private final PreApprovalAutoRecurringCreateRequest autoRecurring;

  @java.lang.SuppressWarnings("all")
  PreapprovalCreateRequest(final String payerEmail, final String backUrl, final String collectorId, final String reason, final String externalReference, final String status, final PreApprovalAutoRecurringCreateRequest autoRecurring) {
    this.payerEmail = payerEmail;
    this.backUrl = backUrl;
    this.collectorId = collectorId;
    this.reason = reason;
    this.externalReference = externalReference;
    this.status = status;
    this.autoRecurring = autoRecurring;
  }


  @java.lang.SuppressWarnings("all")
  public static class PreapprovalCreateRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private String payerEmail;
    @java.lang.SuppressWarnings("all")
    private String backUrl;
    @java.lang.SuppressWarnings("all")
    private String collectorId;
    @java.lang.SuppressWarnings("all")
    private String reason;
    @java.lang.SuppressWarnings("all")
    private String externalReference;
    @java.lang.SuppressWarnings("all")
    private String status;
    @java.lang.SuppressWarnings("all")
    private PreApprovalAutoRecurringCreateRequest autoRecurring;

    @java.lang.SuppressWarnings("all")
    PreapprovalCreateRequestBuilder() {
    }

    /**
     * Payer email.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreapprovalCreateRequest.PreapprovalCreateRequestBuilder payerEmail(final String payerEmail) {
      this.payerEmail = payerEmail;
      return this;
    }

    /**
     * Return URL.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreapprovalCreateRequest.PreapprovalCreateRequestBuilder backUrl(final String backUrl) {
      this.backUrl = backUrl;
      return this;
    }

    /**
     * Seller ID.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreapprovalCreateRequest.PreapprovalCreateRequestBuilder collectorId(final String collectorId) {
      this.collectorId = collectorId;
      return this;
    }

    /**
     * Preapproval title.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreapprovalCreateRequest.PreapprovalCreateRequestBuilder reason(final String reason) {
      this.reason = reason;
      return this;
    }

    /**
     * Preapproval reference value.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreapprovalCreateRequest.PreapprovalCreateRequestBuilder externalReference(final String externalReference) {
      this.externalReference = externalReference;
      return this;
    }

    /**
     * Preapproval status.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreapprovalCreateRequest.PreapprovalCreateRequestBuilder status(final String status) {
      this.status = status;
      return this;
    }

    /**
     * Recurring data.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PreapprovalCreateRequest.PreapprovalCreateRequestBuilder autoRecurring(final PreApprovalAutoRecurringCreateRequest autoRecurring) {
      this.autoRecurring = autoRecurring;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public PreapprovalCreateRequest build() {
      return new PreapprovalCreateRequest(this.payerEmail, this.backUrl, this.collectorId, this.reason, this.externalReference, this.status, this.autoRecurring);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "PreapprovalCreateRequest.PreapprovalCreateRequestBuilder(payerEmail=" + this.payerEmail + ", backUrl=" + this.backUrl + ", collectorId=" + this.collectorId + ", reason=" + this.reason + ", externalReference=" + this.externalReference + ", status=" + this.status + ", autoRecurring=" + this.autoRecurring + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static PreapprovalCreateRequest.PreapprovalCreateRequestBuilder builder() {
    return new PreapprovalCreateRequest.PreapprovalCreateRequestBuilder();
  }

  /**
   * Payer email.
   */
  @java.lang.SuppressWarnings("all")
  public String getPayerEmail() {
    return this.payerEmail;
  }

  /**
   * Return URL.
   */
  @java.lang.SuppressWarnings("all")
  public String getBackUrl() {
    return this.backUrl;
  }

  /**
   * Seller ID.
   */
  @java.lang.SuppressWarnings("all")
  public String getCollectorId() {
    return this.collectorId;
  }

  /**
   * Preapproval title.
   */
  @java.lang.SuppressWarnings("all")
  public String getReason() {
    return this.reason;
  }

  /**
   * Preapproval reference value.
   */
  @java.lang.SuppressWarnings("all")
  public String getExternalReference() {
    return this.externalReference;
  }

  /**
   * Preapproval status.
   */
  @java.lang.SuppressWarnings("all")
  public String getStatus() {
    return this.status;
  }

  /**
   * Recurring data.
   */
  @java.lang.SuppressWarnings("all")
  public PreApprovalAutoRecurringCreateRequest getAutoRecurring() {
    return this.autoRecurring;
  }
}
