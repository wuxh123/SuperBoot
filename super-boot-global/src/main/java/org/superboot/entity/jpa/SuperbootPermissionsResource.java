package org.superboot.entity.jpa;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * <b>  </b>
 * <p>
 * 功能描述:
 * </p>
 *
 */
@Entity
@Table(name = "superboot_permissions_resource", schema = "superboot", catalog = "")
public class SuperbootPermissionsResource {
    private Timestamp ts;
    private Integer dr;
    private Timestamp createtime;
    private Long createby;
    private Timestamp lastmodifytime;
    private Long lastmodifyby;
    private Long pkPermissionsResource;
    private Long pkPermissions;
    private Long pkResource;

    @Basic
    @Column(name = "ts")
    public Timestamp getTs() {
        return ts;
    }

    public void setTs(Timestamp ts) {
        this.ts = ts;
    }

    @Basic
    @Column(name = "dr")
    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    @Basic
    @Column(name = "createtime")
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "createby")
    public Long getCreateby() {
        return createby;
    }

    public void setCreateby(Long createby) {
        this.createby = createby;
    }

    @Basic
    @Column(name = "lastmodifytime")
    public Timestamp getLastmodifytime() {
        return lastmodifytime;
    }

    public void setLastmodifytime(Timestamp lastmodifytime) {
        this.lastmodifytime = lastmodifytime;
    }

    @Basic
    @Column(name = "lastmodifyby")
    public Long getLastmodifyby() {
        return lastmodifyby;
    }

    public void setLastmodifyby(Long lastmodifyby) {
        this.lastmodifyby = lastmodifyby;
    }

    @Id
    @Column(name = "pk_permissions_resource")
    public Long getPkPermissionsResource() {
        return pkPermissionsResource;
    }

    public void setPkPermissionsResource(Long pkPermissionsResource) {
        this.pkPermissionsResource = pkPermissionsResource;
    }

    @Basic
    @Column(name = "pk_permissions")
    public Long getPkPermissions() {
        return pkPermissions;
    }

    public void setPkPermissions(Long pkPermissions) {
        this.pkPermissions = pkPermissions;
    }

    @Basic
    @Column(name = "pk_resource")
    public Long getPkResource() {
        return pkResource;
    }

    public void setPkResource(Long pkResource) {
        this.pkResource = pkResource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperbootPermissionsResource that = (SuperbootPermissionsResource) o;
        return Objects.equals(ts, that.ts) &&
                Objects.equals(dr, that.dr) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(createby, that.createby) &&
                Objects.equals(lastmodifytime, that.lastmodifytime) &&
                Objects.equals(lastmodifyby, that.lastmodifyby) &&
                Objects.equals(pkPermissionsResource, that.pkPermissionsResource) &&
                Objects.equals(pkPermissions, that.pkPermissions) &&
                Objects.equals(pkResource, that.pkResource);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ts, dr, createtime, createby, lastmodifytime, lastmodifyby, pkPermissionsResource, pkPermissions, pkResource);
    }
}
