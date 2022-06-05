package ma.ebank.bader.digitalbankingglsid.Repositories;

import ma.ebank.bader.digitalbankingglsid.Entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
