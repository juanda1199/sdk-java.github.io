// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.resources.preference;

import com.mercadopago.net.MPResource;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Preference resource.
 */
public class PreferenceSearch extends MPResource {
  /**
   * Preference ID.
   */
  private String id;
  /**
   * Client ID.
   */
  private String clientId;
  /**
   * Collector ID.
   */
  private Long collectorId;
  /**
   * Created date of cash payment.
   */
  private OffsetDateTime dateCreated;
  /**
   * Date when the preference will be active.
   */
  private OffsetDateTime expirationDateFrom;
  /**
   * Date when the preference will be expired.
   */
  private OffsetDateTime expirationDateTo;
  /**
   * True if a preference expires, false if not.
   */
  private Boolean expires;
  /**
   * Reference you can synchronize with your payment system.
   */
  private String externalReference;
  /**
   * List of items to be paid.
   */
  private List<String> items;
  /**
   * Last updated.
   */
  private OffsetDateTime lastUpdated;
  /**
   * Live mode.
   */
  private Boolean liveMode;
  /**
   * Origin of the payment. Default value: NONE.
   */
  private String marketplace;
  /**
   * Operation type.
   */
  private String operationType;
  /**
   * Payer email.
   */
  private String payerEmail;
  /**
   * Payer id.
   */
  private String payerId;
  /**
   * Platform id.
   */
  private String platformId;
  /**
   * Configures which processing modes to use.
   */
  private List<String> processingModes;
  /**
   * Product id.
   */
  private String productId;
  /**
   * Purpose.
   */
  private String purpose;
  /**
   * Site id.
   */
  private String siteId;
  /**
   * Sponsor id.
   */
  private Long sponsorId;
  /**
   * Shipping mode.
   */
  private String shippingMode;

  /**
   * Preference ID.
   */
  @java.lang.SuppressWarnings("all")
  public String getId() {
    return this.id;
  }

  /**
   * Client ID.
   */
  @java.lang.SuppressWarnings("all")
  public String getClientId() {
    return this.clientId;
  }

  /**
   * Collector ID.
   */
  @java.lang.SuppressWarnings("all")
  public Long getCollectorId() {
    return this.collectorId;
  }

  /**
   * Created date of cash payment.
   */
  @java.lang.SuppressWarnings("all")
  public OffsetDateTime getDateCreated() {
    return this.dateCreated;
  }

  /**
   * Date when the preference will be active.
   */
  @java.lang.SuppressWarnings("all")
  public OffsetDateTime getExpirationDateFrom() {
    return this.expirationDateFrom;
  }

  /**
   * Date when the preference will be expired.
   */
  @java.lang.SuppressWarnings("all")
  public OffsetDateTime getExpirationDateTo() {
    return this.expirationDateTo;
  }

  /**
   * True if a preference expires, false if not.
   */
  @java.lang.SuppressWarnings("all")
  public Boolean getExpires() {
    return this.expires;
  }

  /**
   * Reference you can synchronize with your payment system.
   */
  @java.lang.SuppressWarnings("all")
  public String getExternalReference() {
    return this.externalReference;
  }

  /**
   * List of items to be paid.
   */
  @java.lang.SuppressWarnings("all")
  public List<String> getItems() {
    return this.items;
  }

  /**
   * Last updated.
   */
  @java.lang.SuppressWarnings("all")
  public OffsetDateTime getLastUpdated() {
    return this.lastUpdated;
  }

  /**
   * Live mode.
   */
  @java.lang.SuppressWarnings("all")
  public Boolean getLiveMode() {
    return this.liveMode;
  }

  /**
   * Origin of the payment. Default value: NONE.
   */
  @java.lang.SuppressWarnings("all")
  public String getMarketplace() {
    return this.marketplace;
  }

  /**
   * Operation type.
   */
  @java.lang.SuppressWarnings("all")
  public String getOperationType() {
    return this.operationType;
  }

  /**
   * Payer email.
   */
  @java.lang.SuppressWarnings("all")
  public String getPayerEmail() {
    return this.payerEmail;
  }

  /**
   * Payer id.
   */
  @java.lang.SuppressWarnings("all")
  public String getPayerId() {
    return this.payerId;
  }

  /**
   * Platform id.
   */
  @java.lang.SuppressWarnings("all")
  public String getPlatformId() {
    return this.platformId;
  }

  /**
   * Configures which processing modes to use.
   */
  @java.lang.SuppressWarnings("all")
  public List<String> getProcessingModes() {
    return this.processingModes;
  }

  /**
   * Product id.
   */
  @java.lang.SuppressWarnings("all")
  public String getProductId() {
    return this.productId;
  }

  /**
   * Purpose.
   */
  @java.lang.SuppressWarnings("all")
  public String getPurpose() {
    return this.purpose;
  }

  /**
   * Site id.
   */
  @java.lang.SuppressWarnings("all")
  public String getSiteId() {
    return this.siteId;
  }

  /**
   * Sponsor id.
   */
  @java.lang.SuppressWarnings("all")
  public Long getSponsorId() {
    return this.sponsorId;
  }

  /**
   * Shipping mode.
   */
  @java.lang.SuppressWarnings("all")
  public String getShippingMode() {
    return this.shippingMode;
  }
}