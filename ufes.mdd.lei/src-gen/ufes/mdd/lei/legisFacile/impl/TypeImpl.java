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

import ufes.mdd.lei.legisFacile.Final;
import ufes.mdd.lei.legisFacile.LegisFacilePackage;
import ufes.mdd.lei.legisFacile.Normativa;
import ufes.mdd.lei.legisFacile.Preliminar;
import ufes.mdd.lei.legisFacile.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufes.mdd.lei.legisFacile.impl.TypeImpl#getPreliminar <em>Preliminar</em>}</li>
 *   <li>{@link ufes.mdd.lei.legisFacile.impl.TypeImpl#getNormativa <em>Normativa</em>}</li>
 *   <li>{@link ufes.mdd.lei.legisFacile.impl.TypeImpl#getFinal <em>Final</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
  /**
   * The cached value of the '{@link #getPreliminar() <em>Preliminar</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreliminar()
   * @generated
   * @ordered
   */
  protected Preliminar preliminar;

  /**
   * The cached value of the '{@link #getNormativa() <em>Normativa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNormativa()
   * @generated
   * @ordered
   */
  protected Normativa normativa;

  /**
   * The cached value of the '{@link #getFinal() <em>Final</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinal()
   * @generated
   * @ordered
   */
  protected Final final_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return LegisFacilePackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Preliminar getPreliminar()
  {
    return preliminar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreliminar(Preliminar newPreliminar, NotificationChain msgs)
  {
    Preliminar oldPreliminar = preliminar;
    preliminar = newPreliminar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegisFacilePackage.TYPE__PRELIMINAR, oldPreliminar, newPreliminar);
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
  public void setPreliminar(Preliminar newPreliminar)
  {
    if (newPreliminar != preliminar)
    {
      NotificationChain msgs = null;
      if (preliminar != null)
        msgs = ((InternalEObject)preliminar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegisFacilePackage.TYPE__PRELIMINAR, null, msgs);
      if (newPreliminar != null)
        msgs = ((InternalEObject)newPreliminar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegisFacilePackage.TYPE__PRELIMINAR, null, msgs);
      msgs = basicSetPreliminar(newPreliminar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegisFacilePackage.TYPE__PRELIMINAR, newPreliminar, newPreliminar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Normativa getNormativa()
  {
    return normativa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNormativa(Normativa newNormativa, NotificationChain msgs)
  {
    Normativa oldNormativa = normativa;
    normativa = newNormativa;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegisFacilePackage.TYPE__NORMATIVA, oldNormativa, newNormativa);
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
  public void setNormativa(Normativa newNormativa)
  {
    if (newNormativa != normativa)
    {
      NotificationChain msgs = null;
      if (normativa != null)
        msgs = ((InternalEObject)normativa).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegisFacilePackage.TYPE__NORMATIVA, null, msgs);
      if (newNormativa != null)
        msgs = ((InternalEObject)newNormativa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegisFacilePackage.TYPE__NORMATIVA, null, msgs);
      msgs = basicSetNormativa(newNormativa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegisFacilePackage.TYPE__NORMATIVA, newNormativa, newNormativa));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Final getFinal()
  {
    return final_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFinal(Final newFinal, NotificationChain msgs)
  {
    Final oldFinal = final_;
    final_ = newFinal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegisFacilePackage.TYPE__FINAL, oldFinal, newFinal);
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
  public void setFinal(Final newFinal)
  {
    if (newFinal != final_)
    {
      NotificationChain msgs = null;
      if (final_ != null)
        msgs = ((InternalEObject)final_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegisFacilePackage.TYPE__FINAL, null, msgs);
      if (newFinal != null)
        msgs = ((InternalEObject)newFinal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegisFacilePackage.TYPE__FINAL, null, msgs);
      msgs = basicSetFinal(newFinal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegisFacilePackage.TYPE__FINAL, newFinal, newFinal));
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
      case LegisFacilePackage.TYPE__PRELIMINAR:
        return basicSetPreliminar(null, msgs);
      case LegisFacilePackage.TYPE__NORMATIVA:
        return basicSetNormativa(null, msgs);
      case LegisFacilePackage.TYPE__FINAL:
        return basicSetFinal(null, msgs);
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
      case LegisFacilePackage.TYPE__PRELIMINAR:
        return getPreliminar();
      case LegisFacilePackage.TYPE__NORMATIVA:
        return getNormativa();
      case LegisFacilePackage.TYPE__FINAL:
        return getFinal();
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
      case LegisFacilePackage.TYPE__PRELIMINAR:
        setPreliminar((Preliminar)newValue);
        return;
      case LegisFacilePackage.TYPE__NORMATIVA:
        setNormativa((Normativa)newValue);
        return;
      case LegisFacilePackage.TYPE__FINAL:
        setFinal((Final)newValue);
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
      case LegisFacilePackage.TYPE__PRELIMINAR:
        setPreliminar((Preliminar)null);
        return;
      case LegisFacilePackage.TYPE__NORMATIVA:
        setNormativa((Normativa)null);
        return;
      case LegisFacilePackage.TYPE__FINAL:
        setFinal((Final)null);
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
      case LegisFacilePackage.TYPE__PRELIMINAR:
        return preliminar != null;
      case LegisFacilePackage.TYPE__NORMATIVA:
        return normativa != null;
      case LegisFacilePackage.TYPE__FINAL:
        return final_ != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeImpl
