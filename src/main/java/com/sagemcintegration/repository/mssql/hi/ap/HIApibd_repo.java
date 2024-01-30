package com.sagemcintegration.repository.mssql.hi.ap;

import com.sagemcintegration.model.mssql.hi.ap.Apibd;
import com.sagemcintegration.model.mssql.hi.ap.ApibhPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HIApibd_repo extends JpaRepository<Apibd, ApibhPK> {
}
