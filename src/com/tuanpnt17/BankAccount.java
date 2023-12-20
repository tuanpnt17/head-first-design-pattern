/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17;

/**
 *
 * @author TuanPNTSE173039
 */
public class BankAccount {

  private final String name;
  private final String accountNumber;
  private final String address;
  private final String email;
  private final boolean newsletter;
  private final boolean mobileBanking;

  private BankAccount(String name, String accountNumber, String address,
          String email, boolean newsletter, boolean mobileBanking) {
    super();
    this.name = name;
    this.accountNumber = accountNumber;
    this.address = address;
    this.email = email;
    this.newsletter = newsletter;
    this.mobileBanking = mobileBanking;
  }

//  Builder Class
  public static class BankAccountBuilder {

    private String name;
    private String accountNumber;
    private String address;
    private String email;
    private boolean newsletter;
    private boolean mobileBanking;

    public BankAccountBuilder(String name, String accountNumber) {
      this.name = name;
      this.accountNumber = accountNumber;
    }

    public BankAccountBuilder withAddress(String address) {
      this.address = address;
      return this;
    }

    public BankAccountBuilder withEmail(String email) {
      this.email = email;
      return this;
    }

    public BankAccountBuilder withNewsletter(boolean newsletter) {
      this.newsletter = newsletter;
      return this;
    }

    public BankAccountBuilder withMobileBanking(boolean mobileBanking) {
      this.mobileBanking = mobileBanking;
      return this;
    }

    public BankAccount build() {
      return new BankAccount(name, accountNumber, address, email, newsletter, mobileBanking);
    }

  }

  @Override
  public String toString() {
    return "BankAccount{" + "name=" + name + ", accountNumber=" + accountNumber + ", address=" + address + ", email=" + email + ", newsletter=" + newsletter + ", mobileBanking=" + mobileBanking + '}';
  }

}
