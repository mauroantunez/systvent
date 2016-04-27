/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package py.com.systven.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author mauro
 */
@Entity
@Table(name = "cliente", catalog = "sistvent", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCodCliente", query = "SELECT c FROM Cliente c WHERE c.codCliente = :codCliente"),
    @NamedQuery(name = "Cliente.findByFchNacimiento", query = "SELECT c FROM Cliente c WHERE c.fchNacimiento = :fchNacimiento"),
    @NamedQuery(name = "Cliente.findByDesdeCliente", query = "SELECT c FROM Cliente c WHERE c.desdeCliente = :desdeCliente"),
    @NamedQuery(name = "Cliente.findByProfesionCliente", query = "SELECT c FROM Cliente c WHERE c.profesionCliente = :profesionCliente"),
    @NamedQuery(name = "Cliente.findByEmpresaCliente", query = "SELECT c FROM Cliente c WHERE c.empresaCliente = :empresaCliente"),
    @NamedQuery(name = "Cliente.findByNomCliente", query = "SELECT c FROM Cliente c WHERE c.nomCliente = :nomCliente"),
    @NamedQuery(name = "Cliente.findByTelEmpresa", query = "SELECT c FROM Cliente c WHERE c.telEmpresa = :telEmpresa"),
    @NamedQuery(name = "Cliente.findByRentaCliente", query = "SELECT c FROM Cliente c WHERE c.rentaCliente = :rentaCliente"),
    @NamedQuery(name = "Cliente.findByTipoCliente", query = "SELECT c FROM Cliente c WHERE c.tipoCliente = :tipoCliente"),
    @NamedQuery(name = "Cliente.findByRucCliente", query = "SELECT c FROM Cliente c WHERE c.rucCliente = :rucCliente"),
    @NamedQuery(name = "Cliente.findByRefCliente", query = "SELECT c FROM Cliente c WHERE c.refCliente = :refCliente"),
    @NamedQuery(name = "Cliente.findByTelReferencia", query = "SELECT c FROM Cliente c WHERE c.telReferencia = :telReferencia"),
    @NamedQuery(name = "Cliente.findByEmail", query = "SELECT c FROM Cliente c WHERE c.email = :email")})
public class Cliente implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_cliente")
    private Integer codCliente;
    @Column(name = "fch_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fchNacimiento;
    @Column(name = "desde_cliente")
    @Temporal(TemporalType.DATE)
    private Date desdeCliente;
    @Column(name = "profesion_cliente")
    private String profesionCliente;
    @Column(name = "empresa_cliente")
    private String empresaCliente;
    @Column(name = "nom_cliente")
    private String nomCliente;
    @Column(name = "tel_empresa")
    private String telEmpresa;
    @Column(name = "renta_cliente")
    private Double rentaCliente;
    @Column(name = "tipo_cliente")
    private Character tipoCliente;
    @Column(name = "ruc_cliente")
    private String rucCliente;
    @Column(name = "ref_cliente")
    private String refCliente;
    @Column(name = "tel_referencia")
    private String telReferencia;
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "cliente")
    private List<ClienteDireccion> clienteDireccionList;

    public Cliente() {
    }

    public Cliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        Integer oldCodCliente = this.codCliente;
        this.codCliente = codCliente;
        changeSupport.firePropertyChange("codCliente", oldCodCliente, codCliente);
    }

    public Date getFchNacimiento() {
        return fchNacimiento;
    }

    public void setFchNacimiento(Date fchNacimiento) {
        Date oldFchNacimiento = this.fchNacimiento;
        this.fchNacimiento = fchNacimiento;
        changeSupport.firePropertyChange("fchNacimiento", oldFchNacimiento, fchNacimiento);
    }

    public Date getDesdeCliente() {
        return desdeCliente;
    }

    public void setDesdeCliente(Date desdeCliente) {
        Date oldDesdeCliente = this.desdeCliente;
        this.desdeCliente = desdeCliente;
        changeSupport.firePropertyChange("desdeCliente", oldDesdeCliente, desdeCliente);
    }

    public String getProfesionCliente() {
        return profesionCliente;
    }

    public void setProfesionCliente(String profesionCliente) {
        String oldProfesionCliente = this.profesionCliente;
        this.profesionCliente = profesionCliente;
        changeSupport.firePropertyChange("profesionCliente", oldProfesionCliente, profesionCliente);
    }

    public String getEmpresaCliente() {
        return empresaCliente;
    }

    public void setEmpresaCliente(String empresaCliente) {
        String oldEmpresaCliente = this.empresaCliente;
        this.empresaCliente = empresaCliente;
        changeSupport.firePropertyChange("empresaCliente", oldEmpresaCliente, empresaCliente);
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        String oldNomCliente = this.nomCliente;
        this.nomCliente = nomCliente;
        changeSupport.firePropertyChange("nomCliente", oldNomCliente, nomCliente);
    }

    public String getTelEmpresa() {
        return telEmpresa;
    }

    public void setTelEmpresa(String telEmpresa) {
        String oldTelEmpresa = this.telEmpresa;
        this.telEmpresa = telEmpresa;
        changeSupport.firePropertyChange("telEmpresa", oldTelEmpresa, telEmpresa);
    }

    public Double getRentaCliente() {
        return rentaCliente;
    }

    public void setRentaCliente(Double rentaCliente) {
        Double oldRentaCliente = this.rentaCliente;
        this.rentaCliente = rentaCliente;
        changeSupport.firePropertyChange("rentaCliente", oldRentaCliente, rentaCliente);
    }

    public Character getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Character tipoCliente) {
        Character oldTipoCliente = this.tipoCliente;
        this.tipoCliente = tipoCliente;
        changeSupport.firePropertyChange("tipoCliente", oldTipoCliente, tipoCliente);
    }

    public String getRucCliente() {
        return rucCliente;
    }

    public void setRucCliente(String rucCliente) {
        String oldRucCliente = this.rucCliente;
        this.rucCliente = rucCliente;
        changeSupport.firePropertyChange("rucCliente", oldRucCliente, rucCliente);
    }

    public String getRefCliente() {
        return refCliente;
    }

    public void setRefCliente(String refCliente) {
        String oldRefCliente = this.refCliente;
        this.refCliente = refCliente;
        changeSupport.firePropertyChange("refCliente", oldRefCliente, refCliente);
    }

    public String getTelReferencia() {
        return telReferencia;
    }

    public void setTelReferencia(String telReferencia) {
        String oldTelReferencia = this.telReferencia;
        this.telReferencia = telReferencia;
        changeSupport.firePropertyChange("telReferencia", oldTelReferencia, telReferencia);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public List<ClienteDireccion> getClienteDireccionList() {
        return clienteDireccionList;
    }

    public void setClienteDireccionList(List<ClienteDireccion> clienteDireccionList) {
        this.clienteDireccionList = clienteDireccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCliente != null ? codCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codCliente == null && other.codCliente != null) || (this.codCliente != null && !this.codCliente.equals(other.codCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "py.com.systven.view.Cliente[codCliente=" + codCliente + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
