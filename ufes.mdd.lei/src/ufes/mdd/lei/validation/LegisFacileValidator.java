/*
 * generated by Xtext 2.23.0
 */
package ufes.mdd.lei.validation;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

import ufes.mdd.lei.legisFacile.Caput;
import ufes.mdd.lei.legisFacile.LegisFacilePackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class LegisFacileValidator extends AbstractLegisFacileValidator {
	
//	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					LegisFacilePackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}
	
	public static final String INVALID_NAME = "invalidName";

	@Check
	public void checkNameStartsWithCapital(Caput caput)
	{
		if (!Character.isUpperCase(caput.getTexto().charAt(0)))
		{
			warning("O texto do \"caput\" deve começar com letra maiscula", LegisFacilePackage.Literals.CAPUT__TEXTO, INVALID_NAME);
		}
	}
	
}
