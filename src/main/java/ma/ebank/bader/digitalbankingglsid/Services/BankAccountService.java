package ma.ebank.bader.digitalbankingglsid.Services;

import ma.ebank.bader.digitalbankingglsid.DTOs.*;
import ma.ebank.bader.digitalbankingglsid.Entities.BankAccount;
import ma.ebank.bader.digitalbankingglsid.Entities.CurrentAccount;
import ma.ebank.bader.digitalbankingglsid.Entities.Customer;
import ma.ebank.bader.digitalbankingglsid.Entities.SavingAccount;
import ma.ebank.bader.digitalbankingglsid.Exceptions.BalanceNotSufficientException;
import ma.ebank.bader.digitalbankingglsid.Exceptions.BankAccountNotFoundException;
import ma.ebank.bader.digitalbankingglsid.Exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<CustomerDTO> listCustomers();
    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;

    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);

    List<AccountOperationDTO> accountHistory(String accountId);

    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFoundException;

    List<CustomerDTO> searchCustomers(String keyword);
}
