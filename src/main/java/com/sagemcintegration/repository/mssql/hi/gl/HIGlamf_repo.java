package com.sagemcintegration.repository.mssql.hi.gl;
import com.sagemcintegration.model.mssql.hi.gl.Glamf;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface
HIGlamf_repo extends JpaRepository<Glamf,Integer> {
    public Optional<Glamf> findByAcctfmttd(String acctid);
}
