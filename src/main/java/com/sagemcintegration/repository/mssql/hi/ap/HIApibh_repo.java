package com.sagemcintegration.repository.mssql.hi.ap;

import com.sagemcintegration.model.mssql.hi.ap.Apibh;
import com.sagemcintegration.model.mssql.hi.ap.ApibhPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HIApibh_repo extends JpaRepository<Apibh, ApibhPK> {
}
