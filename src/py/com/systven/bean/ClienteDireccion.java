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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author mauro
 */
@Entity
@Table(name = "cliente_direccion", catalog = "sistvent", schema = "")
@NamedQueries({
    @NamedQuery(name = "ClienteDireccion.findAll", query = "SELECT c FROM ClienteDireccion c"),
    @NamedQuery(name = "ClienteDireccion.findByCodDireccion", query = "SELECT c FROM ClienteDireccion c WHERE c.codDireccion = :codDireccion"),
    @NamedQuery(name = "ClienteDireccion.findByDesDireccion", query = "SELECT c FROM ClienteDireccion c WHERE c.desDireccion = :desDireccion"),
    @NamedQuery(name = "ClienteDireccion.findByBarrioDireccion", query = "SELECT c FROM ClienteDireccion c WHERE c.barrioDireccion = :barrioDireccion"),
    @NamedQuery(name = "ClienteDireccion.findByInfoCliente", query = "SELECT c FROM ClienteDireccion c WHERE c.infoCliente = :infoCliente"),
    @NamedQuery(name = "ClienteDireccion.findByCiudadDireccion", query = "SELECT c FROM ClienteDireccion c WHERE c.ciudadDireccion = :ciudadDireccion"),
    @NamedQuery(name = "ClienteDireccion.findByComplementoDireccion", query = "SELECT c FROM ClienteDireccion c WHERE c.complementoDireccion = :complementoDireccion")})
public class ClienteDireccion implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_direccion")
    private Integer codDireccion;
    @Column(name = "des_direccion")
    private String desDireccion;
    @Column(name = "barrio_direccion")
    private String barrioDireccion;
    @Column(name = "info_cliente")
    private String infoCliente;
    @Column(name = "ciudad_direccion")
    private String ciudadDireccion;
    @Column(name = "complemento_direccion")
    private String complementoDireccion;
    @JoinColumn(name = "cod_cliente", referencedColumnName = "cod_cliente")
    @ManyToOne
    private Cliente cliente;

    public ClienteDireccion() {
    }

    public ClienteDireccion(Integer codDireccion) {
        this.codDireccion = codDireccion;
    }

    public Integer getCodDireccion() {
        return codDireccion;
    }

    public void setCodDireccion(Integer codDireccion) {
        Integer oldCodDireccion = this.codDireccion;
        this.codDireccion = codDireccion;
        changeSupport.firePropertyChange("codDireccion", oldCodDireccion, codDireccion);
    }

    public String getDesDireccion() {
        return desDireccion;
    }

    public void setDesDireccion(String desDireccion) {
        String oldDesDireccion = this.desDireccion;
        this.desDireccion = desDireccion;
        changeSupport.firePropertyChange("desDireccion", oldDesDireccion, desDireccion);
    }

    public String getBarrioDireccion() {
        return barrioDireccion;
    }

    public void setBarrioDireccion(String barrioDireccion) {
        String oldBarrioDireccion = this.barrioDireccion;
        this.barrioDireccion = barrioDireccion;
        changeSupport.firePropertyChange("barrioDireccion", oldBarrioDireccion, barrioDireccion);
    }

    public String getInfoCliente() {
        return infoCliente;
    }

    public void setInfoCliente(String infoCliente) {
        String oldInfoCliente = this.infoCliente;
        this.infoCliente = infoCliente;
        changeSupport.firePropertyChange("infoCliente", oldInfoCliente, infoCliente);
    }

    public String getCiudadDireccion() {
        return ciudadDireccion;
    }

    public void setCiudadDireccion(String ciudadDireccion) {
        String oldCiudadDireccion = this.ciudadDireccion;
        this.ciudadDireccion = ciudadDireccion;
        changeSupport.firePropertyChange("ciudadDireccion", oldCiudadDireccion, ciudadDireccion);
    }

    public String getComplementoDireccion() {
        return complementoDireccion;
    }

    public void setComplementoDireccion(String complementoDireccion) {
        String oldComplementoDireccion = this.complementoDireccion;
        this.complementoDireccion = complementoDireccion;
        changeSupport.firePropertyChange("complementoDireccion", oldComplementoDireccion, complementoDireccion);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        Cliente oldCliente = this.cliente;
        this.cliente = cliente;
        changeSupport.firePropertyChange("cliente", oldCliente, cliente);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDireccion != null ? codDireccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClienteDireccion)) {
            return false;
        }
        ClienteDireccion other = (ClienteDireccion) object;
        if ((this.codDireccion == null && other.codDireccion != null) || (this.codDireccion != null && !this.codDireccion.equals(other.codDireccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "py.com.systven.view.ClienteDireccion[codDireccion=" + codDireccion + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
