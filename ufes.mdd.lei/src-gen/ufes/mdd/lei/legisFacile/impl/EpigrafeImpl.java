/**
 * generated by Xtext 2.23.0
 */
package ufes.mdd.lei.legisFacile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ufes.mdd.lei.legisFacile.Epigrafe;
import ufes.mdd.lei.legisFacile.LegisFacilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Epigrafe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufes.mdd.lei.legisFacile.impl.EpigrafeImpl#getAto <em>Ato</em>}</li>
 *   <li>{@link ufes.mdd.lei.legisFacile.impl.EpigrafeImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link ufes.mdd.lei.legisFacile.impl.EpigrafeImpl#getAno <em>Ano</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EpigrafeImpl extends MinimalEObjectImpl.Container implements Epigrafe
{
  /**
   * The default value of the '{@link #getAto() <em>Ato</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAto()
   * @generated
   * @ordered
   */
  protected static final String ATO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAto() <em>Ato</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAto()
   * @generated
   * @ordered
   */
  protected String ato = ATO_EDEFAULT;

  /**
   * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumero()
   * @generated
   * @ordered
   */
  protected static final int NUMERO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumero()
   * @generated
   * @ordered
   */
  protected int numero = NUMERO_EDEFAULT;

  /**
   * The default value of the '{@link #getAno() <em>Ano</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAno()
   * @generated
   * @ordered
   */
  protected static final int ANO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAno() <em>Ano</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAno()
   * @generated
   * @ordered
   */
  protected int ano = ANO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EpigrafeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LegisFacilePackage.Literals.EPIGRAFE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAto()
  {
    return ato;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAto(String newAto)
  {
    String oldAto = ato;
    ato = newAto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegisFacilePackage.EPIGRAFE__ATO, oldAto, ato));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNumero()
  {
    return numero;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumero(int newNumero)
  {
    int oldNumero = numero;
    numero = newNumero;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegisFacilePackage.EPIGRAFE__NUMERO, oldNumero, numero));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getAno()
  {
    return ano;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAno(int newAno)
  {
    int oldAno = ano;
    ano = newAno;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegisFacilePackage.EPIGRAFE__ANO, oldAno, ano));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LegisFacilePackage.EPIGRAFE__ATO:
        return getAto();
      case LegisFacilePackage.EPIGRAFE__NUMERO:
        return getNumero();
      case LegisFacilePackage.EPIGRAFE__ANO:
        return getAno();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LegisFacilePackage.EPIGRAFE__ATO:
        setAto((String)newValue);
        return;
      case LegisFacilePackage.EPIGRAFE__NUMERO:
        setNumero((Integer)newValue);
        return;
      case LegisFacilePackage.EPIGRAFE__ANO:
        setAno((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LegisFacilePackage.EPIGRAFE__ATO:
        setAto(ATO_EDEFAULT);
        return;
      case LegisFacilePackage.EPIGRAFE__NUMERO:
        setNumero(NUMERO_EDEFAULT);
        return;
      case LegisFacilePackage.EPIGRAFE__ANO:
        setAno(ANO_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LegisFacilePackage.EPIGRAFE__ATO:
        return ATO_EDEFAULT == null ? ato != null : !ATO_EDEFAULT.equals(ato);
      case LegisFacilePackage.EPIGRAFE__NUMERO:
        return numero != NUMERO_EDEFAULT;
      case LegisFacilePackage.EPIGRAFE__ANO:
        return ano != ANO_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (ato: ");
    result.append(ato);
    result.append(", numero: ");
    result.append(numero);
    result.append(", ano: ");
    result.append(ano);
    result.append(')');
    return result.toString();
  }

} //EpigrafeImpl
