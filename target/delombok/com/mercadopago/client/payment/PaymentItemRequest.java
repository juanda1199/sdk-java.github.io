// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.client.payment;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

/**
 * PaymentItemRequest class.
 */
public class PaymentItemRequest {
  /**
   * Item code.
   */
  private final String id;
  /**
   * Item name.
   */
  private final String title;
  /**
   * Long item description.
   */
  private final String description;
  /**
   * Image URL.
   */
  private final String pictureUrl;
  /**
   * Category of the item.
   */
  private final String categoryId;
  /**
   * Item's quantity.
   */
  private final Integer quantity;
  /**
   * Unit price.
   */
  private final BigDecimal unitPrice;
  /**
   * Item information related to the category.
   */
  private final PaymentCategoryDescriptorRequest categoryDescriptor;
  /**
   * True if you purchase the item with warranty, false if not.
   */
  private final boolean warranty;
  /**
   * Event date.
   */
  private final OffsetDateTime eventDate;

  @java.lang.SuppressWarnings("all")
  PaymentItemRequest(final String id, final String title, final String description, final String pictureUrl, final String categoryId, final Integer quantity, final BigDecimal unitPrice, final PaymentCategoryDescriptorRequest categoryDescriptor, final boolean warranty, final OffsetDateTime eventDate) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.pictureUrl = pictureUrl;
    this.categoryId = categoryId;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
    this.categoryDescriptor = categoryDescriptor;
    this.warranty = warranty;
    this.eventDate = eventDate;
  }


  @java.lang.SuppressWarnings("all")
  public static class PaymentItemRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private String id;
    @java.lang.SuppressWarnings("all")
    private String title;
    @java.lang.SuppressWarnings("all")
    private String description;
    @java.lang.SuppressWarnings("all")
    private String pictureUrl;
    @java.lang.SuppressWarnings("all")
    private String categoryId;
    @java.lang.SuppressWarnings("all")
    private Integer quantity;
    @java.lang.SuppressWarnings("all")
    private BigDecimal unitPrice;
    @java.lang.SuppressWarnings("all")
    private PaymentCategoryDescriptorRequest categoryDescriptor;
    @java.lang.SuppressWarnings("all")
    private boolean warranty;
    @java.lang.SuppressWarnings("all")
    private OffsetDateTime eventDate;

    @java.lang.SuppressWarnings("all")
    PaymentItemRequestBuilder() {
    }

    /**
     * Item code.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentItemRequest.PaymentItemRequestBuilder id(final String id) {
      this.id = id;
      return this;
    }

    /**
     * Item name.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentItemRequest.PaymentItemRequestBuilder title(final String title) {
      this.title = title;
      return this;
    }

    /**
     * Long item description.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentItemRequest.PaymentItemRequestBuilder description(final String description) {
      this.description = description;
      return this;
    }

    /**
     * Image URL.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentItemRequest.PaymentItemRequestBuilder pictureUrl(final String pictureUrl) {
      this.pictureUrl = pictureUrl;
      return this;
    }

    /**
     * Category of the item.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentItemRequest.PaymentItemRequestBuilder categoryId(final String categoryId) {
      this.categoryId = categoryId;
      return this;
    }

    /**
     * Item's quantity.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentItemRequest.PaymentItemRequestBuilder quantity(final Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * Unit price.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentItemRequest.PaymentItemRequestBuilder unitPrice(final BigDecimal unitPrice) {
      this.unitPrice = unitPrice;
      return this;
    }

    /**
     * Item information related to the category.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentItemRequest.PaymentItemRequestBuilder categoryDescriptor(final PaymentCategoryDescriptorRequest categoryDescriptor) {
      this.categoryDescriptor = categoryDescriptor;
      return this;
    }

    /**
     * True if you purchase the item with warranty, false if not.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentItemRequest.PaymentItemRequestBuilder warranty(final boolean warranty) {
      this.warranty = warranty;
      return this;
    }

    /**
     * Event date.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentItemRequest.PaymentItemRequestBuilder eventDate(final OffsetDateTime eventDate) {
      this.eventDate = eventDate;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public PaymentItemRequest build() {
      return new PaymentItemRequest(this.id, this.title, this.description, this.pictureUrl, this.categoryId, this.quantity, this.unitPrice, this.categoryDescriptor, this.warranty, this.eventDate);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "PaymentItemRequest.PaymentItemRequestBuilder(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", pictureUrl=" + this.pictureUrl + ", categoryId=" + this.categoryId + ", quantity=" + this.quantity + ", unitPrice=" + this.unitPrice + ", categoryDescriptor=" + this.categoryDescriptor + ", warranty=" + this.warranty + ", eventDate=" + this.eventDate + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static PaymentItemRequest.PaymentItemRequestBuilder builder() {
    return new PaymentItemRequest.PaymentItemRequestBuilder();
  }

  /**
   * Item code.
   */
  @java.lang.SuppressWarnings("all")
  public String getId() {
    return this.id;
  }

  /**
   * Item name.
   */
  @java.lang.SuppressWarnings("all")
  public String getTitle() {
    return this.title;
  }

  /**
   * Long item description.
   */
  @java.lang.SuppressWarnings("all")
  public String getDescription() {
    return this.description;
  }

  /**
   * Image URL.
   */
  @java.lang.SuppressWarnings("all")
  public String getPictureUrl() {
    return this.pictureUrl;
  }

  /**
   * Category of the item.
   */
  @java.lang.SuppressWarnings("all")
  public String getCategoryId() {
    return this.categoryId;
  }

  /**
   * Item's quantity.
   */
  @java.lang.SuppressWarnings("all")
  public Integer getQuantity() {
    return this.quantity;
  }

  /**
   * Unit price.
   */
  @java.lang.SuppressWarnings("all")
  public BigDecimal getUnitPrice() {
    return this.unitPrice;
  }

  /**
   * Item information related to the category.
   */
  @java.lang.SuppressWarnings("all")
  public PaymentCategoryDescriptorRequest getCategoryDescriptor() {
    return this.categoryDescriptor;
  }

  /**
   * True if you purchase the item with warranty, false if not.
   */
  @java.lang.SuppressWarnings("all")
  public boolean isWarranty() {
    return this.warranty;
  }

  /**
   * Event date.
   */
  @java.lang.SuppressWarnings("all")
  public OffsetDateTime getEventDate() {
    return this.eventDate;
  }
}