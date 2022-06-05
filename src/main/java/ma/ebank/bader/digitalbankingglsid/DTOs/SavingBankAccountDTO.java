package ma.ebank.bader.digitalbankingglsid.DTOs;

import lombok.Data;
import ma.ebank.bader.digitalbankingglsid.Enums.AccountStatus;

import java.util.Date;
@Data
public class SavingBankAccountDTO extends BankAccountDTO {
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;
}
