// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.client.payment;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * PaymentCreateRequest class.
 */
public class PaymentCreateRequest {
  /**
   * Data that could improve fraud analysis and conversion rates. Try to send as much information as
   * possible.
   */
  private final PaymentAdditionalInfoRequest additionalInfo;
  /**
   * Fee collected by a marketplace or MercadoPago Application.
   */
  private final BigDecimal applicationFee;
  /**
   * When set to true, the payment can only be approved or rejected. Otherwise in_process status is
   * added.
   */
  private final Boolean binaryMode;
  /**
   * URL where mercadopago does the final redirect (only for bank transfers).
   */
  private final String callbackUrl;
  /**
   * Discount campaign ID.
   */
  private final Long campaignId;
  /**
   * Determines if the payment should be captured (true) or just reserved (false).
   */
  private final Boolean capture;
  /**
   * Amount of the coupon discount.
   */
  private final BigDecimal couponAmount;
  /**
   * Discount campaign with a specific code.
   */
  private final String couponCode;
  /**
   * Date of expiration.
   */
  private final OffsetDateTime dateOfExpiration;
  /**
   * Payment reason or item title.
   */
  private final String description;
  /**
   * Id of the scheme for the absorption of financing fee.
   */
  private final Long differentialPricingId;
  /**
   * ID given by the merchant in their system.
   */
  private final String externalReference;
  /**
   * Selected quantity of installments.
   */
  private final Integer installments;
  /**
   * Payment method issuer.
   */
  private final String issuerId;
  /**
   * Merchant Id for complex payment cases.
   */
  private final String merchantAccountId;
  /**
   * Merchant services.
   */
  private final PaymentMerchantServicesRequest merchantServices;
  /**
   * Data that can be attached to the payment to record additional attributes of the merchant.
   */
  private final Map<String, Object> metadata;
  /**
   * Net amount.
   */
  private final BigDecimal netAmount;
  /**
   * URL where mercadopago will send notifications associated to changes in this payment.
   */
  private final String notificationUrl;
  /**
   * Order identifier.
   */
  private final PaymentOrderRequest order;
  /**
   * Payer information.
   */
  private final PaymentPayerRequest payer;
  /**
   * Payment method chosen to do the payment.
   */
  private final String paymentMethodId;
  /**
   * Payment method option id.
   */
  private final String paymentMethodOptionId;
  /**
   * Processing mode to define if an specific merchannt id should be used.
   */
  private final String processingMode;
  /**
   * Card token ID.
   */
  private final String token;
  /**
   * Amount paid.
   */
  private final BigDecimal transactionAmount;
  /**
   * Transaction details.
   */
  private final PaymentTransactionDetailsRequest transactionDetails;
  /**
   * Point of interaction.
   */
  private final PaymentPointOfInteractionRequest pointOfInteraction;
  /**
   * Sponsor Identification.
   */
  private final Long sponsorId;
  /**
   * How will look the payment in the card bill (e.g.: MERCADOPAGO).
   */
  private final String statementDescriptor;
  /**
   * Taxes for payments.
   */
  private final List<PaymentTaxRequest> taxes;

  @java.lang.SuppressWarnings("all")
  PaymentCreateRequest(final PaymentAdditionalInfoRequest additionalInfo, final BigDecimal applicationFee, final Boolean binaryMode, final String callbackUrl, final Long campaignId, final Boolean capture, final BigDecimal couponAmount, final String couponCode, final OffsetDateTime dateOfExpiration, final String description, final Long differentialPricingId, final String externalReference, final Integer installments, final String issuerId, final String merchantAccountId, final PaymentMerchantServicesRequest merchantServices, final Map<String, Object> metadata, final BigDecimal netAmount, final String notificationUrl, final PaymentOrderRequest order, final PaymentPayerRequest payer, final String paymentMethodId, final String paymentMethodOptionId, final String processingMode, final String token, final BigDecimal transactionAmount, final PaymentTransactionDetailsRequest transactionDetails, final PaymentPointOfInteractionRequest pointOfInteraction, final Long sponsorId, final String statementDescriptor, final List<PaymentTaxRequest> taxes) {
    this.additionalInfo = additionalInfo;
    this.applicationFee = applicationFee;
    this.binaryMode = binaryMode;
    this.callbackUrl = callbackUrl;
    this.campaignId = campaignId;
    this.capture = capture;
    this.couponAmount = couponAmount;
    this.couponCode = couponCode;
    this.dateOfExpiration = dateOfExpiration;
    this.description = description;
    this.differentialPricingId = differentialPricingId;
    this.externalReference = externalReference;
    this.installments = installments;
    this.issuerId = issuerId;
    this.merchantAccountId = merchantAccountId;
    this.merchantServices = merchantServices;
    this.metadata = metadata;
    this.netAmount = netAmount;
    this.notificationUrl = notificationUrl;
    this.order = order;
    this.payer = payer;
    this.paymentMethodId = paymentMethodId;
    this.paymentMethodOptionId = paymentMethodOptionId;
    this.processingMode = processingMode;
    this.token = token;
    this.transactionAmount = transactionAmount;
    this.transactionDetails = transactionDetails;
    this.pointOfInteraction = pointOfInteraction;
    this.sponsorId = sponsorId;
    this.statementDescriptor = statementDescriptor;
    this.taxes = taxes;
  }


  @java.lang.SuppressWarnings("all")
  public static class PaymentCreateRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private PaymentAdditionalInfoRequest additionalInfo;
    @java.lang.SuppressWarnings("all")
    private BigDecimal applicationFee;
    @java.lang.SuppressWarnings("all")
    private Boolean binaryMode;
    @java.lang.SuppressWarnings("all")
    private String callbackUrl;
    @java.lang.SuppressWarnings("all")
    private Long campaignId;
    @java.lang.SuppressWarnings("all")
    private Boolean capture;
    @java.lang.SuppressWarnings("all")
    private BigDecimal couponAmount;
    @java.lang.SuppressWarnings("all")
    private String couponCode;
    @java.lang.SuppressWarnings("all")
    private OffsetDateTime dateOfExpiration;
    @java.lang.SuppressWarnings("all")
    private String description;
    @java.lang.SuppressWarnings("all")
    private Long differentialPricingId;
    @java.lang.SuppressWarnings("all")
    private String externalReference;
    @java.lang.SuppressWarnings("all")
    private Integer installments;
    @java.lang.SuppressWarnings("all")
    private String issuerId;
    @java.lang.SuppressWarnings("all")
    private String merchantAccountId;
    @java.lang.SuppressWarnings("all")
    private PaymentMerchantServicesRequest merchantServices;
    @java.lang.SuppressWarnings("all")
    private Map<String, Object> metadata;
    @java.lang.SuppressWarnings("all")
    private BigDecimal netAmount;
    @java.lang.SuppressWarnings("all")
    private String notificationUrl;
    @java.lang.SuppressWarnings("all")
    private PaymentOrderRequest order;
    @java.lang.SuppressWarnings("all")
    private PaymentPayerRequest payer;
    @java.lang.SuppressWarnings("all")
    private String paymentMethodId;
    @java.lang.SuppressWarnings("all")
    private String paymentMethodOptionId;
    @java.lang.SuppressWarnings("all")
    private String processingMode;
    @java.lang.SuppressWarnings("all")
    private String token;
    @java.lang.SuppressWarnings("all")
    private BigDecimal transactionAmount;
    @java.lang.SuppressWarnings("all")
    private PaymentTransactionDetailsRequest transactionDetails;
    @java.lang.SuppressWarnings("all")
    private PaymentPointOfInteractionRequest pointOfInteraction;
    @java.lang.SuppressWarnings("all")
    private Long sponsorId;
    @java.lang.SuppressWarnings("all")
    private String statementDescriptor;
    @java.lang.SuppressWarnings("all")
    private List<PaymentTaxRequest> taxes;

    @java.lang.SuppressWarnings("all")
    PaymentCreateRequestBuilder() {
    }

    /**
     * Data that could improve fraud analysis and conversion rates. Try to send as much information as
     * possible.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder additionalInfo(final PaymentAdditionalInfoRequest additionalInfo) {
      this.additionalInfo = additionalInfo;
      return this;
    }

    /**
     * Fee collected by a marketplace or MercadoPago Application.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder applicationFee(final BigDecimal applicationFee) {
      this.applicationFee = applicationFee;
      return this;
    }

    /**
     * When set to true, the payment can only be approved or rejected. Otherwise in_process status is
     * added.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder binaryMode(final Boolean binaryMode) {
      this.binaryMode = binaryMode;
      return this;
    }

    /**
     * URL where mercadopago does the final redirect (only for bank transfers).
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder callbackUrl(final String callbackUrl) {
      this.callbackUrl = callbackUrl;
      return this;
    }

    /**
     * Discount campaign ID.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder campaignId(final Long campaignId) {
      this.campaignId = campaignId;
      return this;
    }

    /**
     * Determines if the payment should be captured (true) or just reserved (false).
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder capture(final Boolean capture) {
      this.capture = capture;
      return this;
    }

    /**
     * Amount of the coupon discount.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder couponAmount(final BigDecimal couponAmount) {
      this.couponAmount = couponAmount;
      return this;
    }

    /**
     * Discount campaign with a specific code.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder couponCode(final String couponCode) {
      this.couponCode = couponCode;
      return this;
    }

    /**
     * Date of expiration.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder dateOfExpiration(final OffsetDateTime dateOfExpiration) {
      this.dateOfExpiration = dateOfExpiration;
      return this;
    }

    /**
     * Payment reason or item title.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder description(final String description) {
      this.description = description;
      return this;
    }

    /**
     * Id of the scheme for the absorption of financing fee.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder differentialPricingId(final Long differentialPricingId) {
      this.differentialPricingId = differentialPricingId;
      return this;
    }

    /**
     * ID given by the merchant in their system.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder externalReference(final String externalReference) {
      this.externalReference = externalReference;
      return this;
    }

    /**
     * Selected quantity of installments.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder installments(final Integer installments) {
      this.installments = installments;
      return this;
    }

    /**
     * Payment method issuer.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder issuerId(final String issuerId) {
      this.issuerId = issuerId;
      return this;
    }

    /**
     * Merchant Id for complex payment cases.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder merchantAccountId(final String merchantAccountId) {
      this.merchantAccountId = merchantAccountId;
      return this;
    }

    /**
     * Merchant services.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder merchantServices(final PaymentMerchantServicesRequest merchantServices) {
      this.merchantServices = merchantServices;
      return this;
    }

    /**
     * Data that can be attached to the payment to record additional attributes of the merchant.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder metadata(final Map<String, Object> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Net amount.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder netAmount(final BigDecimal netAmount) {
      this.netAmount = netAmount;
      return this;
    }

    /**
     * URL where mercadopago will send notifications associated to changes in this payment.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder notificationUrl(final String notificationUrl) {
      this.notificationUrl = notificationUrl;
      return this;
    }

    /**
     * Order identifier.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder order(final PaymentOrderRequest order) {
      this.order = order;
      return this;
    }

    /**
     * Payer information.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder payer(final PaymentPayerRequest payer) {
      this.payer = payer;
      return this;
    }

    /**
     * Payment method chosen to do the payment.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder paymentMethodId(final String paymentMethodId) {
      this.paymentMethodId = paymentMethodId;
      return this;
    }

    /**
     * Payment method option id.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder paymentMethodOptionId(final String paymentMethodOptionId) {
      this.paymentMethodOptionId = paymentMethodOptionId;
      return this;
    }

    /**
     * Processing mode to define if an specific merchannt id should be used.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder processingMode(final String processingMode) {
      this.processingMode = processingMode;
      return this;
    }

    /**
     * Card token ID.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder token(final String token) {
      this.token = token;
      return this;
    }

    /**
     * Amount paid.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder transactionAmount(final BigDecimal transactionAmount) {
      this.transactionAmount = transactionAmount;
      return this;
    }

    /**
     * Transaction details.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder transactionDetails(final PaymentTransactionDetailsRequest transactionDetails) {
      this.transactionDetails = transactionDetails;
      return this;
    }

    /**
     * Point of interaction.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder pointOfInteraction(final PaymentPointOfInteractionRequest pointOfInteraction) {
      this.pointOfInteraction = pointOfInteraction;
      return this;
    }

    /**
     * Sponsor Identification.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder sponsorId(final Long sponsorId) {
      this.sponsorId = sponsorId;
      return this;
    }

    /**
     * How will look the payment in the card bill (e.g.: MERCADOPAGO).
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder statementDescriptor(final String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * Taxes for payments.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest.PaymentCreateRequestBuilder taxes(final List<PaymentTaxRequest> taxes) {
      this.taxes = taxes;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public PaymentCreateRequest build() {
      return new PaymentCreateRequest(this.additionalInfo, this.applicationFee, this.binaryMode, this.callbackUrl, this.campaignId, this.capture, this.couponAmount, this.couponCode, this.dateOfExpiration, this.description, this.differentialPricingId, this.externalReference, this.installments, this.issuerId, this.merchantAccountId, this.merchantServices, this.metadata, this.netAmount, this.notificationUrl, this.order, this.payer, this.paymentMethodId, this.paymentMethodOptionId, this.processingMode, this.token, this.transactionAmount, this.transactionDetails, this.pointOfInteraction, this.sponsorId, this.statementDescriptor, this.taxes);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "PaymentCreateRequest.PaymentCreateRequestBuilder(additionalInfo=" + this.additionalInfo + ", applicationFee=" + this.applicationFee + ", binaryMode=" + this.binaryMode + ", callbackUrl=" + this.callbackUrl + ", campaignId=" + this.campaignId + ", capture=" + this.capture + ", couponAmount=" + this.couponAmount + ", couponCode=" + this.couponCode + ", dateOfExpiration=" + this.dateOfExpiration + ", description=" + this.description + ", differentialPricingId=" + this.differentialPricingId + ", externalReference=" + this.externalReference + ", installments=" + this.installments + ", issuerId=" + this.issuerId + ", merchantAccountId=" + this.merchantAccountId + ", merchantServices=" + this.merchantServices + ", metadata=" + this.metadata + ", netAmount=" + this.netAmount + ", notificationUrl=" + this.notificationUrl + ", order=" + this.order + ", payer=" + this.payer + ", paymentMethodId=" + this.paymentMethodId + ", paymentMethodOptionId=" + this.paymentMethodOptionId + ", processingMode=" + this.processingMode + ", token=" + this.token + ", transactionAmount=" + this.transactionAmount + ", transactionDetails=" + this.transactionDetails + ", pointOfInteraction=" + this.pointOfInteraction + ", sponsorId=" + this.sponsorId + ", statementDescriptor=" + this.statementDescriptor + ", taxes=" + this.taxes + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static PaymentCreateRequest.PaymentCreateRequestBuilder builder() {
    return new PaymentCreateRequest.PaymentCreateRequestBuilder();
  }

  /**
   * Data that could improve fraud analysis and conversion rates. Try to send as much information as
   * possible.
   */
  @java.lang.SuppressWarnings("all")
  public PaymentAdditionalInfoRequest getAdditionalInfo() {
    return this.additionalInfo;
  }

  /**
   * Fee collected by a marketplace or MercadoPago Application.
   */
  @java.lang.SuppressWarnings("all")
  public BigDecimal getApplicationFee() {
    return this.applicationFee;
  }

  /**
   * When set to true, the payment can only be approved or rejected. Otherwise in_process status is
   * added.
   */
  @java.lang.SuppressWarnings("all")
  public Boolean getBinaryMode() {
    return this.binaryMode;
  }

  /**
   * URL where mercadopago does the final redirect (only for bank transfers).
   */
  @java.lang.SuppressWarnings("all")
  public String getCallbackUrl() {
    return this.callbackUrl;
  }

  /**
   * Discount campaign ID.
   */
  @java.lang.SuppressWarnings("all")
  public Long getCampaignId() {
    return this.campaignId;
  }

  /**
   * Determines if the payment should be captured (true) or just reserved (false).
   */
  @java.lang.SuppressWarnings("all")
  public Boolean getCapture() {
    return this.capture;
  }

  /**
   * Amount of the coupon discount.
   */
  @java.lang.SuppressWarnings("all")
  public BigDecimal getCouponAmount() {
    return this.couponAmount;
  }

  /**
   * Discount campaign with a specific code.
   */
  @java.lang.SuppressWarnings("all")
  public String getCouponCode() {
    return this.couponCode;
  }

  /**
   * Date of expiration.
   */
  @java.lang.SuppressWarnings("all")
  public OffsetDateTime getDateOfExpiration() {
    return this.dateOfExpiration;
  }

  /**
   * Payment reason or item title.
   */
  @java.lang.SuppressWarnings("all")
  public String getDescription() {
    return this.description;
  }

  /**
   * Id of the scheme for the absorption of financing fee.
   */
  @java.lang.SuppressWarnings("all")
  public Long getDifferentialPricingId() {
    return this.differentialPricingId;
  }

  /**
   * ID given by the merchant in their system.
   */
  @java.lang.SuppressWarnings("all")
  public String getExternalReference() {
    return this.externalReference;
  }

  /**
   * Selected quantity of installments.
   */
  @java.lang.SuppressWarnings("all")
  public Integer getInstallments() {
    return this.installments;
  }

  /**
   * Payment method issuer.
   */
  @java.lang.SuppressWarnings("all")
  public String getIssuerId() {
    return this.issuerId;
  }

  /**
   * Merchant Id for complex payment cases.
   */
  @java.lang.SuppressWarnings("all")
  public String getMerchantAccountId() {
    return this.merchantAccountId;
  }

  /**
   * Merchant services.
   */
  @java.lang.SuppressWarnings("all")
  public PaymentMerchantServicesRequest getMerchantServices() {
    return this.merchantServices;
  }

  /**
   * Data that can be attached to the payment to record additional attributes of the merchant.
   */
  @java.lang.SuppressWarnings("all")
  public Map<String, Object> getMetadata() {
    return this.metadata;
  }

  /**
   * Net amount.
   */
  @java.lang.SuppressWarnings("all")
  public BigDecimal getNetAmount() {
    return this.netAmount;
  }

  /**
   * URL where mercadopago will send notifications associated to changes in this payment.
   */
  @java.lang.SuppressWarnings("all")
  public String getNotificationUrl() {
    return this.notificationUrl;
  }

  /**
   * Order identifier.
   */
  @java.lang.SuppressWarnings("all")
  public PaymentOrderRequest getOrder() {
    return this.order;
  }

  /**
   * Payer information.
   */
  @java.lang.SuppressWarnings("all")
  public PaymentPayerRequest getPayer() {
    return this.payer;
  }

  /**
   * Payment method chosen to do the payment.
   */
  @java.lang.SuppressWarnings("all")
  public String getPaymentMethodId() {
    return this.paymentMethodId;
  }

  /**
   * Payment method option id.
   */
  @java.lang.SuppressWarnings("all")
  public String getPaymentMethodOptionId() {
    return this.paymentMethodOptionId;
  }

  /**
   * Processing mode to define if an specific merchannt id should be used.
   */
  @java.lang.SuppressWarnings("all")
  public String getProcessingMode() {
    return this.processingMode;
  }

  /**
   * Card token ID.
   */
  @java.lang.SuppressWarnings("all")
  public String getToken() {
    return this.token;
  }

  /**
   * Amount paid.
   */
  @java.lang.SuppressWarnings("all")
  public BigDecimal getTransactionAmount() {
    return this.transactionAmount;
  }

  /**
   * Transaction details.
   */
  @java.lang.SuppressWarnings("all")
  public PaymentTransactionDetailsRequest getTransactionDetails() {
    return this.transactionDetails;
  }

  /**
   * Point of interaction.
   */
  @java.lang.SuppressWarnings("all")
  public PaymentPointOfInteractionRequest getPointOfInteraction() {
    return this.pointOfInteraction;
  }

  /**
   * Sponsor Identification.
   */
  @java.lang.SuppressWarnings("all")
  public Long getSponsorId() {
    return this.sponsorId;
  }

  /**
   * How will look the payment in the card bill (e.g.: MERCADOPAGO).
   */
  @java.lang.SuppressWarnings("all")
  public String getStatementDescriptor() {
    return this.statementDescriptor;
  }

  /**
   * Taxes for payments.
   */
  @java.lang.SuppressWarnings("all")
  public List<PaymentTaxRequest> getTaxes() {
    return this.taxes;
  }
}
