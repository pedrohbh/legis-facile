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

import ufes.mdd.lei.legisFacile.Artigo;
import ufes.mdd.lei.legisFacile.Caput;
import ufes.mdd.lei.legisFacile.LegisFacilePackage;
import ufes.mdd.lei.legisFacile.Paragrafo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artigo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufes.mdd.lei.legisFacile.impl.ArtigoImpl#getCaput <em>Caput</em>}</li>
 *   <li>{@link ufes.mdd.lei.legisFacile.impl.ArtigoImpl#getParagrafos <em>Paragrafos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtigoImpl extends MinimalEObjectImpl.Container implements Artigo
{
  /**
   * The cached value of the '{@link #getCaput() <em>Caput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaput()
   * @generated
   * @ordered
   */
  protected Caput caput;

  /**
   * The cached value of the '{@link #getParagrafos() <em>Paragrafos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParagrafos()
   * @generated
   * @ordered
   */
  protected EList<Paragrafo> paragrafos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArtigoImpl()
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
    return LegisFacilePackage.Literals.ARTIGO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Caput getCaput()
  {
    return caput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaput(Caput newCaput, NotificationChain msgs)
  {
    Caput oldCaput = caput;
    caput = newCaput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegisFacilePackage.ARTIGO__CAPUT, oldCaput, newCaput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCaput(Caput newCaput)
  {
    if (newCaput != caput)
    {
      NotificationChain msgs = null;
      if (caput != null)
        msgs = ((InternalEObject)caput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegisFacilePackage.ARTIGO__CAPUT, null, msgs);
      if (newCaput != null)
        msgs = ((InternalEObject)newCaput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegisFacilePackage.ARTIGO__CAPUT, null, msgs);
      msgs = basicSetCaput(newCaput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegisFacilePackage.ARTIGO__CAPUT, newCaput, newCaput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Paragrafo> getParagrafos()
  {
    if (paragrafos == null)
    {
      paragrafos = new EObjectContainmentEList<Paragrafo>(Paragrafo.class, this, LegisFacilePackage.ARTIGO__PARAGRAFOS);
    }
    return paragrafos;
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
      case LegisFacilePackage.ARTIGO__CAPUT:
        return basicSetCaput(null, msgs);
      case LegisFacilePackage.ARTIGO__PARAGRAFOS:
        return ((InternalEList<?>)getParagrafos()).basicRemove(otherEnd, msgs);
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
      case LegisFacilePackage.ARTIGO__CAPUT:
        return getCaput();
      case LegisFacilePackage.ARTIGO__PARAGRAFOS:
        return getParagrafos();
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
      case LegisFacilePackage.ARTIGO__CAPUT:
        setCaput((Caput)newValue);
        return;
      case LegisFacilePackage.ARTIGO__PARAGRAFOS:
        getParagrafos().clear();
        getParagrafos().addAll((Collection<? extends Paragrafo>)newValue);
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
      case LegisFacilePackage.ARTIGO__CAPUT:
        setCaput((Caput)null);
        return;
      case LegisFacilePackage.ARTIGO__PARAGRAFOS:
        getParagrafos().clear();
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
      case LegisFacilePackage.ARTIGO__CAPUT:
        return caput != null;
      case LegisFacilePackage.ARTIGO__PARAGRAFOS:
        return paragrafos != null && !paragrafos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArtigoImpl
