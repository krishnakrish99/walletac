package com.walletaccount.service.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.FetchType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionid;


    @NotNull(message = "Transaction Type is required")
    private String transactionType;

    @NotNull(message = "Transaction Date is required")
    private LocalDate transactionDate;

    @NotNull(message = "Transaction Time is required")
    private LocalTime transactionTime;
   

    @NotNull(message = "Sender or Receiverid is required")
    private Long senderorReceiverid;
    
   
    @Positive(message = "Amount must be positive")
    private double amount;

    @ManyToOne(fetch =FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "wallet_account_id")
    private WalletAccount walletAccount;
}
