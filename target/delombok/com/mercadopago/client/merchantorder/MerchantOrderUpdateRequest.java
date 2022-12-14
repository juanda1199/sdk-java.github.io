// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.client.merchantorder;

import java.util.List;

/**
 * Parameters for update a Merchant Order.
 */
public class MerchantOrderUpdateRequest {
  /**
   * Country identifier that merchant order belongs to.
   */
  private final String siteId;
  /**
   * Payer information.
   */
  private final MerchantOrderPayerRequest payer;
  /**
   * Sponsor ID.
   */
  private final String sponsorId;
  /**
   * Items information.
   */
  private final List<MerchantOrderItemRequest> items;
  /**
   * Shipments information.
   */
  private final List<MerchantOrderShipmentRequest> shipments;
  /**
   * URL where you'd like to receive a payment notification.
   */
  private final String notificationUrl;
  /**
   * Additional information.
   */
  private final String additionalInfo;
  /**
   * Reference you can synchronize with your payment system.
   */
  private final String externalReference;
  /**
   * Origin of the payment.
   */
  private final String marketplace;

  @java.lang.SuppressWarnings("all")
  MerchantOrderUpdateRequest(final String siteId, final MerchantOrderPayerRequest payer, final String sponsorId, final List<MerchantOrderItemRequest> items, final List<MerchantOrderShipmentRequest> shipments, final String notificationUrl, final String additionalInfo, final String externalReference, final String marketplace) {
    this.siteId = siteId;
    this.payer = payer;
    this.sponsorId = sponsorId;
    this.items = items;
    this.shipments = shipments;
    this.notificationUrl = notificationUrl;
    this.additionalInfo = additionalInfo;
    this.externalReference = externalReference;
    this.marketplace = marketplace;
  }


  @java.lang.SuppressWarnings("all")
  public static class MerchantOrderUpdateRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private String siteId;
    @java.lang.SuppressWarnings("all")
    private MerchantOrderPayerRequest payer;
    @java.lang.SuppressWarnings("all")
    private String sponsorId;
    @java.lang.SuppressWarnings("all")
    private List<MerchantOrderItemRequest> items;
    @java.lang.SuppressWarnings("all")
    private List<MerchantOrderShipmentRequest> shipments;
    @java.lang.SuppressWarnings("all")
    private String notificationUrl;
    @java.lang.SuppressWarnings("all")
    private String additionalInfo;
    @java.lang.SuppressWarnings("all")
    private String externalReference;
    @java.lang.SuppressWarnings("all")
    private String marketplace;

    @java.lang.SuppressWarnings("all")
    MerchantOrderUpdateRequestBuilder() {
    }

    /**
     * Country identifier that merchant order belongs to.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderUpdateRequest.MerchantOrderUpdateRequestBuilder siteId(final String siteId) {
      this.siteId = siteId;
      return this;
    }

    /**
     * Payer information.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderUpdateRequest.MerchantOrderUpdateRequestBuilder payer(final MerchantOrderPayerRequest payer) {
      this.payer = payer;
      return this;
    }

    /**
     * Sponsor ID.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderUpdateRequest.MerchantOrderUpdateRequestBuilder sponsorId(final String sponsorId) {
      this.sponsorId = sponsorId;
      return this;
    }

    /**
     * Items information.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderUpdateRequest.MerchantOrderUpdateRequestBuilder items(final List<MerchantOrderItemRequest> items) {
      this.items = items;
      return this;
    }

    /**
     * Shipments information.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderUpdateRequest.MerchantOrderUpdateRequestBuilder shipments(final List<MerchantOrderShipmentRequest> shipments) {
      this.shipments = shipments;
      return this;
    }

    /**
     * URL where you'd like to receive a payment notification.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderUpdateRequest.MerchantOrderUpdateRequestBuilder notificationUrl(final String notificationUrl) {
      this.notificationUrl = notificationUrl;
      return this;
    }

    /**
     * Additional information.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderUpdateRequest.MerchantOrderUpdateRequestBuilder additionalInfo(final String additionalInfo) {
      this.additionalInfo = additionalInfo;
      return this;
    }

    /**
     * Reference you can synchronize with your payment system.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderUpdateRequest.MerchantOrderUpdateRequestBuilder externalReference(final String externalReference) {
      this.externalReference = externalReference;
      return this;
    }

    /**
     * Origin of the payment.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderUpdateRequest.MerchantOrderUpdateRequestBuilder marketplace(final String marketplace) {
      this.marketplace = marketplace;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public MerchantOrderUpdateRequest build() {
      return new MerchantOrderUpdateRequest(this.siteId, this.payer, this.sponsorId, this.items, this.shipments, this.notificationUrl, this.additionalInfo, this.externalReference, this.marketplace);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "MerchantOrderUpdateRequest.MerchantOrderUpdateRequestBuilder(siteId=" + this.siteId + ", payer=" + this.payer + ", sponsorId=" + this.sponsorId + ", items=" + this.items + ", shipments=" + this.shipments + ", notificationUrl=" + this.notificationUrl + ", additionalInfo=" + this.additionalInfo + ", externalReference=" + this.externalReference + ", marketplace=" + this.marketplace + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static MerchantOrderUpdateRequest.MerchantOrderUpdateRequestBuilder builder() {
    return new MerchantOrderUpdateRequest.MerchantOrderUpdateRequestBuilder();
  }

  /**
   * Country identifier that merchant order belongs to.
   */
  @java.lang.SuppressWarnings("all")
  public String getSiteId() {
    return this.siteId;
  }

  /**
   * Payer information.
   */
  @java.lang.SuppressWarnings("all")
  public MerchantOrderPayerRequest getPayer() {
    return this.payer;
  }

  /**
   * Sponsor ID.
   */
  @java.lang.SuppressWarnings("all")
  public String getSponsorId() {
    return this.sponsorId;
  }

  /**
   * Items information.
   */
  @java.lang.SuppressWarnings("all")
  public List<MerchantOrderItemRequest> getItems() {
    return this.items;
  }

  /**
   * Shipments information.
   */
  @java.lang.SuppressWarnings("all")
  public List<MerchantOrderShipmentRequest> getShipments() {
    return this.shipments;
  }

  /**
   * URL where you'd like to receive a payment notification.
   */
  @java.lang.SuppressWarnings("all")
  public String getNotificationUrl() {
    return this.notificationUrl;
  }

  /**
   * Additional information.
   */
  @java.lang.SuppressWarnings("all")
  public String getAdditionalInfo() {
    return this.additionalInfo;
  }

  /**
   * Reference you can synchronize with your payment system.
   */
  @java.lang.SuppressWarnings("all")
  public String getExternalReference() {
    return this.externalReference;
  }

  /**
   * Origin of the payment.
   */
  @java.lang.SuppressWarnings("all")
  public String getMarketplace() {
    return this.marketplace;
  }
}
