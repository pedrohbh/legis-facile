/**
 * generated by Xtext 2.23.0
 */
package ufes.mdd.lei.legisFacile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ufes.mdd.lei.legisFacile.Artigo;
import ufes.mdd.lei.legisFacile.LegisFacilePackage;
import ufes.mdd.lei.legisFacile.Normativa;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normativa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ufes.mdd.lei.legisFacile.impl.NormativaImpl#getArtigos <em>Artigos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormativaImpl extends MinimalEObjectImpl.Container implements Normativa
{
  /**
   * The cached value of the '{@link #getArtigos() <em>Artigos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtigos()
   * @generated
   * @ordered
   */
  protected EList<Artigo> artigos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NormativaImpl()
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
    return LegisFacilePackage.Literals.NORMATIVA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Artigo> getArtigos()
  {
    if (artigos == null)
    {
      artigos = new EObjectContainmentEList<Artigo>(Artigo.class, this, LegisFacilePackage.NORMATIVA__ARTIGOS);
    }
    return artigos;
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
      case LegisFacilePackage.NORMATIVA__ARTIGOS:
        return ((InternalEList<?>)getArtigos()).basicRemove(otherEnd, msgs);
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
      case LegisFacilePackage.NORMATIVA__ARTIGOS:
        return getArtigos();
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
      case LegisFacilePackage.NORMATIVA__ARTIGOS:
        getArtigos().clear();
        getArtigos().addAll((Collection<? extends Artigo>)newValue);
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
      case LegisFacilePackage.NORMATIVA__ARTIGOS:
        getArtigos().clear();
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
      case LegisFacilePackage.NORMATIVA__ARTIGOS:
        return artigos != null && !artigos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NormativaImpl
