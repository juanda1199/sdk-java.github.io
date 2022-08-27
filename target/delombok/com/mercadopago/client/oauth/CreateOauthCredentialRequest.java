// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.client.oauth;

/**
 * Credential information to perform a create credential request. Go to <a
 * href="https://www.mercadopago.com.br/developers/en/guides/security/oauth">this page</a> to learn
 * more.
 */
public class CreateOauthCredentialRequest {
  /**
   * Specify type of operation to perform to get your credentials. This is a fixed parameter with an
   * authorization_code value.
   */
  private final String grantType = "authorization_code";
  /**
   * Private key to be used in some plugins to generate payments. You can get it in Your
   * credentials.
   */
  private final String clientSecret;
  /**
   * Unique ID that identifies your integration. You can get it in Your credentials.
   */
  private final String clientId;
  /**
   * The authorization code you get in the authorization url for linking.
   */
  private final String code;
  /**
   * This is the URL you set up in the Redirect URL field in your application.
   */
  private final String redirectUri;

  @java.lang.SuppressWarnings("all")
  CreateOauthCredentialRequest(final String clientSecret, final String clientId, final String code, final String redirectUri) {
    this.clientSecret = clientSecret;
    this.clientId = clientId;
    this.code = code;
    this.redirectUri = redirectUri;
  }


  @java.lang.SuppressWarnings("all")
  public static class CreateOauthCredentialRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private String clientSecret;
    @java.lang.SuppressWarnings("all")
    private String clientId;
    @java.lang.SuppressWarnings("all")
    private String code;
    @java.lang.SuppressWarnings("all")
    private String redirectUri;

    @java.lang.SuppressWarnings("all")
    CreateOauthCredentialRequestBuilder() {
    }

    /**
     * Private key to be used in some plugins to generate payments. You can get it in Your
     * credentials.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public CreateOauthCredentialRequest.CreateOauthCredentialRequestBuilder clientSecret(final String clientSecret) {
      this.clientSecret = clientSecret;
      return this;
    }

    /**
     * Unique ID that identifies your integration. You can get it in Your credentials.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public CreateOauthCredentialRequest.CreateOauthCredentialRequestBuilder clientId(final String clientId) {
      this.clientId = clientId;
      return this;
    }

    /**
     * The authorization code you get in the authorization url for linking.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public CreateOauthCredentialRequest.CreateOauthCredentialRequestBuilder code(final String code) {
      this.code = code;
      return this;
    }

    /**
     * This is the URL you set up in the Redirect URL field in your application.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public CreateOauthCredentialRequest.CreateOauthCredentialRequestBuilder redirectUri(final String redirectUri) {
      this.redirectUri = redirectUri;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public CreateOauthCredentialRequest build() {
      return new CreateOauthCredentialRequest(this.clientSecret, this.clientId, this.code, this.redirectUri);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "CreateOauthCredentialRequest.CreateOauthCredentialRequestBuilder(clientSecret=" + this.clientSecret + ", clientId=" + this.clientId + ", code=" + this.code + ", redirectUri=" + this.redirectUri + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static CreateOauthCredentialRequest.CreateOauthCredentialRequestBuilder builder() {
    return new CreateOauthCredentialRequest.CreateOauthCredentialRequestBuilder();
  }

  /**
   * Specify type of operation to perform to get your credentials. This is a fixed parameter with an
   * authorization_code value.
   */
  @java.lang.SuppressWarnings("all")
  public String getGrantType() {
    return this.grantType;
  }

  /**
   * Private key to be used in some plugins to generate payments. You can get it in Your
   * credentials.
   */
  @java.lang.SuppressWarnings("all")
  public String getClientSecret() {
    return this.clientSecret;
  }

  /**
   * Unique ID that identifies your integration. You can get it in Your credentials.
   */
  @java.lang.SuppressWarnings("all")
  public String getClientId() {
    return this.clientId;
  }

  /**
   * The authorization code you get in the authorization url for linking.
   */
  @java.lang.SuppressWarnings("all")
  public String getCode() {
    return this.code;
  }

  /**
   * This is the URL you set up in the Redirect URL field in your application.
   */
  @java.lang.SuppressWarnings("all")
  public String getRedirectUri() {
    return this.redirectUri;
  }
}