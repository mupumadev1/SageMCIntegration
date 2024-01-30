package com.sagemcintegration.repository.mssql.ic.gl;
import com.sagemcintegration.model.mssql.ic.gl.Glamf;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface






















































Glamf_repo extends JpaRepository<Glamf,Integer> {
    public Optional<Glamf> findByAcctfmttd(String acctid);
}
