// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.exceptions;

/**
 * MPException Class.
 */
public class MPException extends Exception {
  /**
   * MPException constructor.
   *
   * @param message message
   */
  public MPException(String message) {
    super(message);
  }

  /**
   * MPException constructor.
   *
   * @param message message
   * @param cause cause
   */
  public MPException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * MPException class.
   *
   * @param cause cause
   */
  public MPException(Throwable cause) {
    super(cause);
  }
}
