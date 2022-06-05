package ma.ebank.bader.digitalbankingglsid.DTOs;

import lombok.Data;
import ma.ebank.bader.digitalbankingglsid.Enums.OperationType;

import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}

