package com.sagemcintegration.model.mssql.hi.ap;

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
public class ApibsPK implements Serializable {

    private int cntbtch;

    private int cntitem;

    private int cntpaym;

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

    public int getCntpaym() {
        return cntpaym;
    }

    public void setCntpaym(int cntpaym) {
        this.cntpaym = cntpaym;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApibsPK apibsPK = (ApibsPK) o;
        return cntbtch == apibsPK.cntbtch && cntitem == apibsPK.cntitem && cntpaym == apibsPK.cntpaym;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cntbtch, cntitem, cntpaym);
    }
}
