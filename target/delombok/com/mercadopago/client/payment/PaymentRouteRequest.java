// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.client.payment;

import java.time.OffsetDateTime;

/**
 * PaymentRouteRequest class.
 */
public class PaymentRouteRequest {
  /**
   * Departure.
   */
  private final String departure;
  /**
   * Destination.
   */
  private final String destination;
  /**
   * Departure date time.
   */
  private final OffsetDateTime departureDateTime;
  /**
   * Arrival date time.
   */
  private final OffsetDateTime arrivalDateTime;
  /**
   * Company.
   */
  private final String company;

  @java.lang.SuppressWarnings("all")
  PaymentRouteRequest(final String departure, final String destination, final OffsetDateTime departureDateTime, final OffsetDateTime arrivalDateTime, final String company) {
    this.departure = departure;
    this.destination = destination;
    this.departureDateTime = departureDateTime;
    this.arrivalDateTime = arrivalDateTime;
    this.company = company;
  }


  @java.lang.SuppressWarnings("all")
  public static class PaymentRouteRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private String departure;
    @java.lang.SuppressWarnings("all")
    private String destination;
    @java.lang.SuppressWarnings("all")
    private OffsetDateTime departureDateTime;
    @java.lang.SuppressWarnings("all")
    private OffsetDateTime arrivalDateTime;
    @java.lang.SuppressWarnings("all")
    private String company;

    @java.lang.SuppressWarnings("all")
    PaymentRouteRequestBuilder() {
    }

    /**
     * Departure.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentRouteRequest.PaymentRouteRequestBuilder departure(final String departure) {
      this.departure = departure;
      return this;
    }

    /**
     * Destination.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentRouteRequest.PaymentRouteRequestBuilder destination(final String destination) {
      this.destination = destination;
      return this;
    }

    /**
     * Departure date time.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentRouteRequest.PaymentRouteRequestBuilder departureDateTime(final OffsetDateTime departureDateTime) {
      this.departureDateTime = departureDateTime;
      return this;
    }

    /**
     * Arrival date time.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentRouteRequest.PaymentRouteRequestBuilder arrivalDateTime(final OffsetDateTime arrivalDateTime) {
      this.arrivalDateTime = arrivalDateTime;
      return this;
    }

    /**
     * Company.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentRouteRequest.PaymentRouteRequestBuilder company(final String company) {
      this.company = company;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public PaymentRouteRequest build() {
      return new PaymentRouteRequest(this.departure, this.destination, this.departureDateTime, this.arrivalDateTime, this.company);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "PaymentRouteRequest.PaymentRouteRequestBuilder(departure=" + this.departure + ", destination=" + this.destination + ", departureDateTime=" + this.departureDateTime + ", arrivalDateTime=" + this.arrivalDateTime + ", company=" + this.company + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static PaymentRouteRequest.PaymentRouteRequestBuilder builder() {
    return new PaymentRouteRequest.PaymentRouteRequestBuilder();
  }

  /**
   * Departure.
   */
  @java.lang.SuppressWarnings("all")
  public String getDeparture() {
    return this.departure;
  }

  /**
   * Destination.
   */
  @java.lang.SuppressWarnings("all")
  public String getDestination() {
    return this.destination;
  }

  /**
   * Departure date time.
   */
  @java.lang.SuppressWarnings("all")
  public OffsetDateTime getDepartureDateTime() {
    return this.departureDateTime;
  }

  /**
   * Arrival date time.
   */
  @java.lang.SuppressWarnings("all")
  public OffsetDateTime getArrivalDateTime() {
    return this.arrivalDateTime;
  }

  /**
   * Company.
   */
  @java.lang.SuppressWarnings("all")
  public String getCompany() {
    return this.company;
  }
}
