/**
 * generated by Xtext 2.23.0
 */
package ufes.mdd.lei.legisFacile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normativa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ufes.mdd.lei.legisFacile.Normativa#getArtigos <em>Artigos</em>}</li>
 * </ul>
 *
 * @see ufes.mdd.lei.legisFacile.LegisFacilePackage#getNormativa()
 * @model
 * @generated
 */
public interface Normativa extends EObject
{
  /**
   * Returns the value of the '<em><b>Artigos</b></em>' containment reference list.
   * The list contents are of type {@link ufes.mdd.lei.legisFacile.Artigo}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artigos</em>' containment reference list.
   * @see ufes.mdd.lei.legisFacile.LegisFacilePackage#getNormativa_Artigos()
   * @model containment="true"
   * @generated
   */
  EList<Artigo> getArtigos();

} // Normativa
