// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.client.merchantorder;

/**
 * Payer information.
 */
public class MerchantOrderPayerRequest {
  /**
   * Payer ID.
   */
  private final Long id;
  /**
   * Payer nickname.
   */
  private final String nickname;

  @java.lang.SuppressWarnings("all")
  MerchantOrderPayerRequest(final Long id, final String nickname) {
    this.id = id;
    this.nickname = nickname;
  }


  @java.lang.SuppressWarnings("all")
  public static class MerchantOrderPayerRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private Long id;
    @java.lang.SuppressWarnings("all")
    private String nickname;

    @java.lang.SuppressWarnings("all")
    MerchantOrderPayerRequestBuilder() {
    }

    /**
     * Payer ID.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderPayerRequest.MerchantOrderPayerRequestBuilder id(final Long id) {
      this.id = id;
      return this;
    }

    /**
     * Payer nickname.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public MerchantOrderPayerRequest.MerchantOrderPayerRequestBuilder nickname(final String nickname) {
      this.nickname = nickname;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public MerchantOrderPayerRequest build() {
      return new MerchantOrderPayerRequest(this.id, this.nickname);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "MerchantOrderPayerRequest.MerchantOrderPayerRequestBuilder(id=" + this.id + ", nickname=" + this.nickname + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static MerchantOrderPayerRequest.MerchantOrderPayerRequestBuilder builder() {
    return new MerchantOrderPayerRequest.MerchantOrderPayerRequestBuilder();
  }

  /**
   * Payer ID.
   */
  @java.lang.SuppressWarnings("all")
  public Long getId() {
    return this.id;
  }

  /**
   * Payer nickname.
   */
  @java.lang.SuppressWarnings("all")
  public String getNickname() {
    return this.nickname;
  }
}
