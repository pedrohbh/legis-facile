/**
 * generated by Xtext 2.23.0
 */
package ufes.mdd.lei.legisFacile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ufes.mdd.lei.legisFacile.Ementa;
import ufes.mdd.lei.legisFacile.Epigrafe;
import ufes.mdd.lei.legisFacile.LegisFacilePackage;
import ufes.mdd.lei.legisFacile.Preambulo;
import ufes.mdd.lei.legisFacile.Preliminar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preliminar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufes.mdd.lei.legisFacile.impl.PreliminarImpl#getEpigrage <em>Epigrage</em>}</li>
 *   <li>{@link ufes.mdd.lei.legisFacile.impl.PreliminarImpl#getEmenta <em>Ementa</em>}</li>
 *   <li>{@link ufes.mdd.lei.legisFacile.impl.PreliminarImpl#getPreambulo <em>Preambulo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreliminarImpl extends MinimalEObjectImpl.Container implements Preliminar
{
  /**
   * The cached value of the '{@link #getEpigrage() <em>Epigrage</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEpigrage()
   * @generated
   * @ordered
   */
  protected Epigrafe epigrage;

  /**
   * The cached value of the '{@link #getEmenta() <em>Ementa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmenta()
   * @generated
   * @ordered
   */
  protected Ementa ementa;

  /**
   * The cached value of the '{@link #getPreambulo() <em>Preambulo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreambulo()
   * @generated
   * @ordered
   */
  protected Preambulo preambulo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreliminarImpl()
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
    return LegisFacilePackage.Literals.PRELIMINAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Epigrafe getEpigrage()
  {
    return epigrage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEpigrage(Epigrafe newEpigrage, NotificationChain msgs)
  {
    Epigrafe oldEpigrage = epigrage;
    epigrage = newEpigrage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegisFacilePackage.PRELIMINAR__EPIGRAGE, oldEpigrage, newEpigrage);
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
  public void setEpigrage(Epigrafe newEpigrage)
  {
    if (newEpigrage != epigrage)
    {
      NotificationChain msgs = null;
      if (epigrage != null)
        msgs = ((InternalEObject)epigrage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegisFacilePackage.PRELIMINAR__EPIGRAGE, null, msgs);
      if (newEpigrage != null)
        msgs = ((InternalEObject)newEpigrage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegisFacilePackage.PRELIMINAR__EPIGRAGE, null, msgs);
      msgs = basicSetEpigrage(newEpigrage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegisFacilePackage.PRELIMINAR__EPIGRAGE, newEpigrage, newEpigrage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ementa getEmenta()
  {
    return ementa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmenta(Ementa newEmenta, NotificationChain msgs)
  {
    Ementa oldEmenta = ementa;
    ementa = newEmenta;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegisFacilePackage.PRELIMINAR__EMENTA, oldEmenta, newEmenta);
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
  public void setEmenta(Ementa newEmenta)
  {
    if (newEmenta != ementa)
    {
      NotificationChain msgs = null;
      if (ementa != null)
        msgs = ((InternalEObject)ementa).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegisFacilePackage.PRELIMINAR__EMENTA, null, msgs);
      if (newEmenta != null)
        msgs = ((InternalEObject)newEmenta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegisFacilePackage.PRELIMINAR__EMENTA, null, msgs);
      msgs = basicSetEmenta(newEmenta, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegisFacilePackage.PRELIMINAR__EMENTA, newEmenta, newEmenta));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Preambulo getPreambulo()
  {
    return preambulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreambulo(Preambulo newPreambulo, NotificationChain msgs)
  {
    Preambulo oldPreambulo = preambulo;
    preambulo = newPreambulo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegisFacilePackage.PRELIMINAR__PREAMBULO, oldPreambulo, newPreambulo);
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
  public void setPreambulo(Preambulo newPreambulo)
  {
    if (newPreambulo != preambulo)
    {
      NotificationChain msgs = null;
      if (preambulo != null)
        msgs = ((InternalEObject)preambulo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegisFacilePackage.PRELIMINAR__PREAMBULO, null, msgs);
      if (newPreambulo != null)
        msgs = ((InternalEObject)newPreambulo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegisFacilePackage.PRELIMINAR__PREAMBULO, null, msgs);
      msgs = basicSetPreambulo(newPreambulo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegisFacilePackage.PRELIMINAR__PREAMBULO, newPreambulo, newPreambulo));
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
      case LegisFacilePackage.PRELIMINAR__EPIGRAGE:
        return basicSetEpigrage(null, msgs);
      case LegisFacilePackage.PRELIMINAR__EMENTA:
        return basicSetEmenta(null, msgs);
      case LegisFacilePackage.PRELIMINAR__PREAMBULO:
        return basicSetPreambulo(null, msgs);
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
      case LegisFacilePackage.PRELIMINAR__EPIGRAGE:
        return getEpigrage();
      case LegisFacilePackage.PRELIMINAR__EMENTA:
        return getEmenta();
      case LegisFacilePackage.PRELIMINAR__PREAMBULO:
        return getPreambulo();
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
      case LegisFacilePackage.PRELIMINAR__EPIGRAGE:
        setEpigrage((Epigrafe)newValue);
        return;
      case LegisFacilePackage.PRELIMINAR__EMENTA:
        setEmenta((Ementa)newValue);
        return;
      case LegisFacilePackage.PRELIMINAR__PREAMBULO:
        setPreambulo((Preambulo)newValue);
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
      case LegisFacilePackage.PRELIMINAR__EPIGRAGE:
        setEpigrage((Epigrafe)null);
        return;
      case LegisFacilePackage.PRELIMINAR__EMENTA:
        setEmenta((Ementa)null);
        return;
      case LegisFacilePackage.PRELIMINAR__PREAMBULO:
        setPreambulo((Preambulo)null);
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
      case LegisFacilePackage.PRELIMINAR__EPIGRAGE:
        return epigrage != null;
      case LegisFacilePackage.PRELIMINAR__EMENTA:
        return ementa != null;
      case LegisFacilePackage.PRELIMINAR__PREAMBULO:
        return preambulo != null;
    }
    return super.eIsSet(featureID);
  }

} //PreliminarImpl
