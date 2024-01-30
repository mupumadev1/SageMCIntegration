package com.sagemcintegration.model.mssql.ic.ap;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class ApibdPK implements Serializable {
    private int cntbtch;
    private int cntitem;
    private int cntline;

    public int getCntbtch() {
        return cntbtch;
    }

    public void setCntbtch(int cntbtch) {
        this.cntbtch = cntbtch;
    }

    public int getCntitem() {
        return cntitem;
    }

    public void setCntitem(int cntitem) {
        this.cntitem = cntitem;
    }

    public int getCntline() {
        return cntline;
    }

    public void setCntline(int cntline) {
        this.cntline = cntline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApibdPK apibdPK = (ApibdPK) o;
        return cntbtch == apibdPK.cntbtch && cntitem == apibdPK.cntitem && cntline == apibdPK.cntline;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cntbtch, cntitem, cntline);
    }
}
