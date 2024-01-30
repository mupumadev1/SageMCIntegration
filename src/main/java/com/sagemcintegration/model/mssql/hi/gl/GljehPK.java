package com.sagemcintegration.model.mssql.hi.gl;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GljehPK implements Serializable {

    private String batchid;

    private String btchentry;

    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    public String getBtchentry() {
        return btchentry;
    }

    public void setBtchentry(String btchentry) {
        this.btchentry = btchentry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GljehPK gljehPK = (GljehPK) o;
        return Objects.equals(batchid, gljehPK.batchid) && Objects.equals(btchentry, gljehPK.btchentry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchid, btchentry);
    }
}
