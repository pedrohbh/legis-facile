/**
 * generated by Xtext 2.23.0
 */
package ufes.mdd.lei.legisFacile.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ufes.mdd.lei.legisFacile.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ufes.mdd.lei.legisFacile.LegisFacilePackage
 * @generated
 */
public class LegisFacileAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LegisFacilePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LegisFacileAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LegisFacilePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LegisFacileSwitch<Adapter> modelSwitch =
    new LegisFacileSwitch<Adapter>()
    {
      @Override
      public Adapter caseLei(Lei object)
      {
        return createLeiAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter casePreliminar(Preliminar object)
      {
        return createPreliminarAdapter();
      }
      @Override
      public Adapter caseEpigrafe(Epigrafe object)
      {
        return createEpigrafeAdapter();
      }
      @Override
      public Adapter caseEmenta(Ementa object)
      {
        return createEmentaAdapter();
      }
      @Override
      public Adapter casePreambulo(Preambulo object)
      {
        return createPreambuloAdapter();
      }
      @Override
      public Adapter caseNormativa(Normativa object)
      {
        return createNormativaAdapter();
      }
      @Override
      public Adapter caseArtigo(Artigo object)
      {
        return createArtigoAdapter();
      }
      @Override
      public Adapter caseCaput(Caput object)
      {
        return createCaputAdapter();
      }
      @Override
      public Adapter caseParagrafo(Paragrafo object)
      {
        return createParagrafoAdapter();
      }
      @Override
      public Adapter caseInciso(Inciso object)
      {
        return createIncisoAdapter();
      }
      @Override
      public Adapter caseAlinea(Alinea object)
      {
        return createAlineaAdapter();
      }
      @Override
      public Adapter caseItem(Item object)
      {
        return createItemAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ufes.mdd.lei.legisFacile.Lei <em>Lei</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufes.mdd.lei.legisFacile.Lei
   * @generated
   */
  public Adapter createLeiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufes.mdd.lei.legisFacile.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufes.mdd.lei.legisFacile.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufes.mdd.lei.legisFacile.Preliminar <em>Preliminar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufes.mdd.lei.legisFacile.Preliminar
   * @generated
   */
  public Adapter createPreliminarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufes.mdd.lei.legisFacile.Epigrafe <em>Epigrafe</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufes.mdd.lei.legisFacile.Epigrafe
   * @generated
   */
  public Adapter createEpigrafeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufes.mdd.lei.legisFacile.Ementa <em>Ementa</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufes.mdd.lei.legisFacile.Ementa
   * @generated
   */
  public Adapter createEmentaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufes.mdd.lei.legisFacile.Preambulo <em>Preambulo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufes.mdd.lei.legisFacile.Preambulo
   * @generated
   */
  public Adapter createPreambuloAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufes.mdd.lei.legisFacile.Normativa <em>Normativa</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufes.mdd.lei.legisFacile.Normativa
   * @generated
   */
  public Adapter createNormativaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufes.mdd.lei.legisFacile.Artigo <em>Artigo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufes.mdd.lei.legisFacile.Artigo
   * @generated
   */
  public Adapter createArtigoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufes.mdd.lei.legisFacile.Caput <em>Caput</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufes.mdd.lei.legisFacile.Caput
   * @generated
   */
  public Adapter createCaputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufes.mdd.lei.legisFacile.Paragrafo <em>Paragrafo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufes.mdd.lei.legisFacile.Paragrafo
   * @generated
   */
  public Adapter createParagrafoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufes.mdd.lei.legisFacile.Inciso <em>Inciso</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufes.mdd.lei.legisFacile.Inciso
   * @generated
   */
  public Adapter createIncisoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufes.mdd.lei.legisFacile.Alinea <em>Alinea</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufes.mdd.lei.legisFacile.Alinea
   * @generated
   */
  public Adapter createAlineaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufes.mdd.lei.legisFacile.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufes.mdd.lei.legisFacile.Item
   * @generated
   */
  public Adapter createItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufes.mdd.lei.legisFacile.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufes.mdd.lei.legisFacile.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufes.mdd.lei.legisFacile.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufes.mdd.lei.legisFacile.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufes.mdd.lei.legisFacile.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufes.mdd.lei.legisFacile.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LegisFacileAdapterFactory
