/**
 * generated by Xtext 2.23.0
 */
package ufes.mdd.lei.legisFacile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ufes.mdd.lei.legisFacile.Alinea;
import ufes.mdd.lei.legisFacile.Item;
import ufes.mdd.lei.legisFacile.LegisFacilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alinea</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufes.mdd.lei.legisFacile.impl.AlineaImpl#getTexto <em>Texto</em>}</li>
 *   <li>{@link ufes.mdd.lei.legisFacile.impl.AlineaImpl#getItens <em>Itens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlineaImpl extends MinimalEObjectImpl.Container implements Alinea
{
  /**
   * The default value of the '{@link #getTexto() <em>Texto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTexto()
   * @generated
   * @ordered
   */
  protected static final String TEXTO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTexto() <em>Texto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTexto()
   * @generated
   * @ordered
   */
  protected String texto = TEXTO_EDEFAULT;

  /**
   * The cached value of the '{@link #getItens() <em>Itens</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItens()
   * @generated
   * @ordered
   */
  protected EList<Item> itens;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlineaImpl()
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
    return LegisFacilePackage.Literals.ALINEA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTexto()
  {
    return texto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTexto(String newTexto)
  {
    String oldTexto = texto;
    texto = newTexto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegisFacilePackage.ALINEA__TEXTO, oldTexto, texto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Item> getItens()
  {
    if (itens == null)
    {
      itens = new EObjectContainmentEList<Item>(Item.class, this, LegisFacilePackage.ALINEA__ITENS);
    }
    return itens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LegisFacilePackage.ALINEA__ITENS:
        return ((InternalEList<?>)getItens()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LegisFacilePackage.ALINEA__TEXTO:
        return getTexto();
      case LegisFacilePackage.ALINEA__ITENS:
        return getItens();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LegisFacilePackage.ALINEA__TEXTO:
        setTexto((String)newValue);
        return;
      case LegisFacilePackage.ALINEA__ITENS:
        getItens().clear();
        getItens().addAll((Collection<? extends Item>)newValue);
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
      case LegisFacilePackage.ALINEA__TEXTO:
        setTexto(TEXTO_EDEFAULT);
        return;
      case LegisFacilePackage.ALINEA__ITENS:
        getItens().clear();
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
      case LegisFacilePackage.ALINEA__TEXTO:
        return TEXTO_EDEFAULT == null ? texto != null : !TEXTO_EDEFAULT.equals(texto);
      case LegisFacilePackage.ALINEA__ITENS:
        return itens != null && !itens.isEmpty();
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
    result.append(" (texto: ");
    result.append(texto);
    result.append(')');
    return result.toString();
  }

} //AlineaImpl