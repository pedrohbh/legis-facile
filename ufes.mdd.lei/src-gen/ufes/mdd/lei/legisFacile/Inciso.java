/**
 * generated by Xtext 2.23.0
 */
package ufes.mdd.lei.legisFacile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inciso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufes.mdd.lei.legisFacile.Inciso#getTexto <em>Texto</em>}</li>
 *   <li>{@link ufes.mdd.lei.legisFacile.Inciso#getAlineas <em>Alineas</em>}</li>
 * </ul>
 *
 * @see ufes.mdd.lei.legisFacile.LegisFacilePackage#getInciso()
 * @model
 * @generated
 */
public interface Inciso extends EObject
{
  /**
   * Returns the value of the '<em><b>Texto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Texto</em>' attribute.
   * @see #setTexto(String)
   * @see ufes.mdd.lei.legisFacile.LegisFacilePackage#getInciso_Texto()
   * @model
   * @generated
   */
  String getTexto();

  /**
   * Sets the value of the '{@link ufes.mdd.lei.legisFacile.Inciso#getTexto <em>Texto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texto</em>' attribute.
   * @see #getTexto()
   * @generated
   */
  void setTexto(String value);

  /**
   * Returns the value of the '<em><b>Alineas</b></em>' containment reference list.
   * The list contents are of type {@link ufes.mdd.lei.legisFacile.Alinea}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alineas</em>' containment reference list.
   * @see ufes.mdd.lei.legisFacile.LegisFacilePackage#getInciso_Alineas()
   * @model containment="true"
   * @generated
   */
  EList<Alinea> getAlineas();

} // Inciso