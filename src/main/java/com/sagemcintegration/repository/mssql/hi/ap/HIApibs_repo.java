package com.sagemcintegration.repository.mssql.hi.ap;

import com.sagemcintegration.model.mssql.hi.ap.Apibs;
import com.sagemcintegration.model.mssql.hi.ap.ApibsPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HIApibs_repo extends JpaRepository<Apibs, ApibsPK> {
}
