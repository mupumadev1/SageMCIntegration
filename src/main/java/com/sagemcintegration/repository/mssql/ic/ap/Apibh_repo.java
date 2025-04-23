package com.sagemcintegration.repository.mssql.ic.ap;

import com.sagemcintegration.model.mssql.ic.ap.Apibh;
import com.sagemcintegration.model.mssql.ic.ap.ApibhPK;
import com.sagemcintegration.model.mssql.ic.ap.Apobl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Apibh_repo extends JpaRepository<Apibh, ApibhPK> {
    Optional<Apibh> findByIdinvcContainingAndDateinvc(String idinvc,int Date);
}
