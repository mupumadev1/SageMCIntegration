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
public class ApibhPK implements Serializable {
    private int cntbtch;

    private int cntitem;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApibhPK apibhPK = (ApibhPK) o;
        return cntbtch == apibhPK.cntbtch && cntitem == apibhPK.cntitem;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cntbtch, cntitem);
    }
}
