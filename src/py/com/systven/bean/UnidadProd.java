/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package py.com.systven.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author mauro
 */
@Entity
@Table(name = "unidad_prod", catalog = "sistvent", schema = "")
@NamedQueries({
    @NamedQuery(name = "UnidadProd.findAll", query = "SELECT u FROM UnidadProd u"),
    @NamedQuery(name = "UnidadProd.findByCodUnidad", query = "SELECT u FROM UnidadProd u WHERE u.codUnidad = :codUnidad"),
    @NamedQuery(name = "UnidadProd.findByDescUnidad", query = "SELECT u FROM UnidadProd u WHERE u.descUnidad = :descUnidad")})
public class UnidadProd implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_unidad")
    private Integer codUnidad;
    @Column(name = "desc_unidad")
    private String descUnidad;

    public UnidadProd() {
    }

    public UnidadProd(Integer codUnidad) {
        this.codUnidad = codUnidad;
    }

    public Integer getCodUnidad() {
        return codUnidad;
    }

    public void setCodUnidad(Integer codUnidad) {
        Integer oldCodUnidad = this.codUnidad;
        this.codUnidad = codUnidad;
        changeSupport.firePropertyChange("codUnidad", oldCodUnidad, codUnidad);
    }

    public String getDescUnidad() {
        return descUnidad;
    }

    public void setDescUnidad(String descUnidad) {
        String oldDescUnidad = this.descUnidad;
        this.descUnidad = descUnidad;
        changeSupport.firePropertyChange("descUnidad", oldDescUnidad, descUnidad);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUnidad != null ? codUnidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadProd)) {
            return false;
        }
        UnidadProd other = (UnidadProd) object;
        if ((this.codUnidad == null && other.codUnidad != null) || (this.codUnidad != null && !this.codUnidad.equals(other.codUnidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "py.com.systven.view.UnidadProd[codUnidad=" + codUnidad + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
