// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.client.merchantorder;

/**
 * Shipping address of a Merchant Order.
 */
public class MerchantOrderReceiverAddressRequest {
  /**
   * Receiver address ID.
   */
  private final Long id;
  /**
   * Street name and number of receiver address.
   */
  private final String addressLine;
  /**
   * Apartment.
   */
  private final String apartment;
  /**
   * City information.
   */
  private final MerchantOrderReceiverAddressCityRequest city;
  /**
   * State information.
   */
  private final MerchantOrderReceiverAddressStateRequest state;
  /**
   * Country information.
   */
  private final MerchantOrderReceiverAddressCountryRequest country;
  /**
   * Comment about receiver address.
   */
  private final String comment;
  /**
   * Contact information.
   */
  private final String contact;
  /**
   * Postal code.
   */
  private final String zipCode;
  /**
   * Street name.
   */
  private final String streetName;
  /**
   * Street number.
   */
  private final String streetNumber;
  /**
   * Floor.
   */
  private final String floor;
  /**
   * Phone.
   */
  private final String phone;
  /**
   * Latitude.
   */
  private final String latitude;
  /**
   * Longitude.
   */
  private final String longitude;

  @java.lang.SuppressWarnings("all")
  MerchantOrderReceiverAddressRequest(final Long id, final String addressLine, final String apartment, final MerchantOrderReceiverAddressCityRequest city, final MerchantOrderReceiverAddressStateRequest state, final MerchantOrderReceiverAddressCountryRequest country, final String comment, final String contact, final String zipCode, final String streetName, final String streetNumber, final String floor, final String phone, final String latitude, final String longitude) {
    this.id = id;
    this.addressLine = addressLine;
    this.apartment = apartment;
    this.city = city;
    this.state = state;
    this.country = country;
    this.comment = comment;
    this.contact = contact;
    this.zipCode = zipCode;
    this.streetName = streetName;
    this.streetNumber = streetNumber;
    this.floor = floor;
    this.phone = phone;
    this.latitude = latitude;
    this.longitude = longitude;
  }


  @java.lang.SuppressWarnings("all")
  public static class MerchantOrderReceiverAddressRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private Long id;
    @java.lang.SuppressWarnings("all")
    private String addressLine;
    @java.lang.SuppressWarnings("all")
    private String apartment;
    @java.lang.SuppressWarnings("all")
    private MerchantOrderReceiverAddressCityRequest city;
    @java.lang.SuppressWarnings("all")
    private MerchantOrderReceiverAddressStateRequest state;
    @java.lang.SuppressWarnings("all")
    private MerchantOrderReceiverAddressCountryRequest country;
    @java.lang.SuppressWarnings("all")
    private String comment;
    @java.lang.SuppressWarnings("all")
    private String contact;
    @java.lang.SuppressWarnings("all")
    private String zipCode;
    @java.lang.SuppressWarnings("all")
    private String streetName;
    @java.lang.SuppressWarnings("all")
    private String streetNumber;
    @java.lang.SuppressWarnings("all")
    private String floor;
    @java.lang.SuppressWarnings("all")
    private String phone;
    @java.lang.SuppressWarnings("all")
    private String latitude;
    @java.lang.SuppressWarnings("all")
    private String longitude;

    @java.lang.SuppressWarnings("all")
    MerchantOrderReceiverAddressRequestBuilder() {
    }

    /**
     * Receiver address ID.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder id(final Long id) {
      this.id = id;
      return this;
    }

    /**
     * Street name and number of receiver address.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder addressLine(final String addressLine) {
      this.addressLine = addressLine;
      return this;
    }

    /**
     * Apartment.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder apartment(final String apartment) {
      this.apartment = apartment;
      return this;
    }

    /**
     * City information.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder city(final MerchantOrderReceiverAddressCityRequest city) {
      this.city = city;
      return this;
    }

    /**
     * State information.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder state(final MerchantOrderReceiverAddressStateRequest state) {
      this.state = state;
      return this;
    }

    /**
     * Country information.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder country(final MerchantOrderReceiverAddressCountryRequest country) {
      this.country = country;
      return this;
    }

    /**
     * Comment about receiver address.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder comment(final String comment) {
      this.comment = comment;
      return this;
    }

    /**
     * Contact information.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder contact(final String contact) {
      this.contact = contact;
      return this;
    }

    /**
     * Postal code.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder zipCode(final String zipCode) {
      this.zipCode = zipCode;
      return this;
    }

    /**
     * Street name.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder streetName(final String streetName) {
      this.streetName = streetName;
      return this;
    }

    /**
     * Street number.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder streetNumber(final String streetNumber) {
      this.streetNumber = streetNumber;
      return this;
    }

    /**
     * Floor.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder floor(final String floor) {
      this.floor = floor;
      return this;
    }

    /**
     * Phone.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder phone(final String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * Latitude.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder latitude(final String latitude) {
      this.latitude = latitude;
      return this;
    }

    /**
     * Longitude.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder longitude(final String longitude) {
      this.longitude = longitude;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public MerchantOrderReceiverAddressRequest build() {
      return new MerchantOrderReceiverAddressRequest(this.id, this.addressLine, this.apartment, this.city, this.state, this.country, this.comment, this.contact, this.zipCode, this.streetName, this.streetNumber, this.floor, this.phone, this.latitude, this.longitude);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder(id=" + this.id + ", addressLine=" + this.addressLine + ", apartment=" + this.apartment + ", city=" + this.city + ", state=" + this.state + ", country=" + this.country + ", comment=" + this.comment + ", contact=" + this.contact + ", zipCode=" + this.zipCode + ", streetName=" + this.streetName + ", streetNumber=" + this.streetNumber + ", floor=" + this.floor + ", phone=" + this.phone + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder builder() {
    return new MerchantOrderReceiverAddressRequest.MerchantOrderReceiverAddressRequestBuilder();
  }

  /**
   * Receiver address ID.
   */
  @java.lang.SuppressWarnings("all")
  public Long getId() {
    return this.id;
  }

  /**
   * Street name and number of receiver address.
   */
  @java.lang.SuppressWarnings("all")
  public String getAddressLine() {
    return this.addressLine;
  }

  /**
   * Apartment.
   */
  @java.lang.SuppressWarnings("all")
  public String getApartment() {
    return this.apartment;
  }

  /**
   * City information.
   */
  @java.lang.SuppressWarnings("all")
  public MerchantOrderReceiverAddressCityRequest getCity() {
    return this.city;
  }

  /**
   * State information.
   */
  @java.lang.SuppressWarnings("all")
  public MerchantOrderReceiverAddressStateRequest getState() {
    return this.state;
  }

  /**
   * Country information.
   */
  @java.lang.SuppressWarnings("all")
  public MerchantOrderReceiverAddressCountryRequest getCountry() {
    return this.country;
  }

  /**
   * Comment about receiver address.
   */
  @java.lang.SuppressWarnings("all")
  public String getComment() {
    return this.comment;
  }

  /**
   * Contact information.
   */
  @java.lang.SuppressWarnings("all")
  public String getContact() {
    return this.contact;
  }

  /**
   * Postal code.
   */
  @java.lang.SuppressWarnings("all")
  public String getZipCode() {
    return this.zipCode;
  }

  /**
   * Street name.
   */
  @java.lang.SuppressWarnings("all")
  public String getStreetName() {
    return this.streetName;
  }

  /**
   * Street number.
   */
  @java.lang.SuppressWarnings("all")
  public String getStreetNumber() {
    return this.streetNumber;
  }

  /**
   * Floor.
   */
  @java.lang.SuppressWarnings("all")
  public String getFloor() {
    return this.floor;
  }

  /**
   * Phone.
   */
  @java.lang.SuppressWarnings("all")
  public String getPhone() {
    return this.phone;
  }

  /**
   * Latitude.
   */
  @java.lang.SuppressWarnings("all")
  public String getLatitude() {
    return this.latitude;
  }

  /**
   * Longitude.
   */
  @java.lang.SuppressWarnings("all")
  public String getLongitude() {
    return this.longitude;
  }
}
