/*
 * generated by Xtext 2.23.0
 */
package ufes.mdd.lei.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

import ufes.mdd.lei.legisFacile.Alinea;
import ufes.mdd.lei.legisFacile.Caput;
import ufes.mdd.lei.legisFacile.Inciso;
import ufes.mdd.lei.legisFacile.Item;
import ufes.mdd.lei.legisFacile.LegisFacilePackage;
import ufes.mdd.lei.legisFacile.Paragrafo;

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
	public void checkCaputEndWithSemicolonOrDot(Caput caput)
	{
		if ( caput.getIncisos() == null || caput.getIncisos().size() == 0)
		{
			if ( !caput.getTexto().trim().endsWith(".") )
			{
				warning("Deve terminar em \".\" quando não se desdobra em Incisos", LegisFacilePackage.Literals.CAPUT__TEXTO, INVALID_NAME);
			}
		}
		else
		{
			if ( !caput.getTexto().trim().endsWith(":") )
			{
				warning("Deve terminar em \":\" quando se desdobra em Incisos", LegisFacilePackage.Literals.CAPUT__TEXTO, INVALID_NAME);
			}
		}		
	}
	
	@Check
	public void checkParagrafoEndWithSemicolonOrDot(Paragrafo pragrafo)
	{
		if ( pragrafo.getIncisos() == null || pragrafo.getIncisos().size() == 0)
		{
			if ( !pragrafo.getTexto().trim().endsWith(".") )
			{
				warning("Deve terminar em \".\" quando não se desdobra em Incisos", LegisFacilePackage.Literals.PARAGRAFO__TEXTO, INVALID_NAME);
			}
		}
		else
		{
			if ( !pragrafo.getTexto().trim().endsWith(":") )
			{
				warning("Deve terminar em \":\" quando se desdobra em Incisos", LegisFacilePackage.Literals.PARAGRAFO__TEXTO, INVALID_NAME);
			}
		}		
	}
	
	@Check
	public void checkIncisoEndSemicolonOrTwoPoints(Inciso inciso)
	{
		if ( inciso.getAlineas() == null || inciso.getAlineas().size() == 0)
		{
			EObject elementroPai = inciso.eContainer();
			if ( elementroPai instanceof Caput )
			{
				Caput caputPai = (Caput) elementroPai;
				int indiceElemento = caputPai.getIncisos().indexOf(inciso);
				if ( indiceElemento == (caputPai.getIncisos().size()-1) )
				{
					if ( !inciso.getTexto().endsWith(".") )
					{
						warning("Deve terminar em \".\" quando não se desdobra em alíneas", LegisFacilePackage.Literals.INCISO__TEXTO, INVALID_NAME);
					}
					
				}
				else if ( !inciso.getTexto().trim().endsWith(";") )
				{
					warning("Deve terminar em \";\" quando não se desdobra em Alíneas", LegisFacilePackage.Literals.INCISO__TEXTO, INVALID_NAME);
				}
			}
			else if ( elementroPai instanceof Paragrafo )
			{
				Paragrafo caputPai = (Paragrafo) elementroPai;
				int indiceElemento = caputPai.getIncisos().indexOf(inciso);
				if ( indiceElemento == (caputPai.getIncisos().size()-1) )
				{
					if ( !inciso.getTexto().endsWith(".") )
					{
						warning("Deve terminar em \".\" quando se é o último elemento e não se desdobra em alíneas", LegisFacilePackage.Literals.INCISO__TEXTO, INVALID_NAME);
					}
					
				}
				else if ( !inciso.getTexto().trim().endsWith(";") )
				{
					warning("Deve terminar em \";\" quando não se desdobra em Alíneas", LegisFacilePackage.Literals.INCISO__TEXTO, INVALID_NAME);
				}
			}
			
			
		}
		else
		{
			if ( !inciso.getTexto().trim().endsWith(":") )
			{
				warning("Deve terminar em \":\" quando se desdobra em Alíneas", LegisFacilePackage.Literals.INCISO__TEXTO, INVALID_NAME);
			}
		}
	}
	
	@Check
	public void checkAlineaEndSemicolonOrTwoPoints(Alinea alinea)
	{
		if ( alinea.getItens() != null && alinea.getItens().size() != 0)
		{
			if ( !alinea.getTexto().trim().endsWith(":") )
			{
				warning("Deve terminar em \":\" quando se desdobra em itens", LegisFacilePackage.Literals.ALINEA__TEXTO, INVALID_NAME);
			}
		}
		else
		{
			Inciso incisoPai = (Inciso) alinea.eContainer();
			int indiceElemento = incisoPai.getAlineas().indexOf(alinea);
			if ( indiceElemento == (incisoPai.getAlineas().size()-1) )
			{
				if ( !alinea.getTexto().endsWith(".") )
				{
					warning("Deve terminar em \".\" quando se é o último elemento e não se desdobra em itens", LegisFacilePackage.Literals.ALINEA__TEXTO, INVALID_NAME);
				}				
			}
			else if ( !alinea.getTexto().trim().endsWith(";") )
			{
				warning("Deve terminar em \";\" quando não se desdobra em itens", LegisFacilePackage.Literals.ALINEA__TEXTO, INVALID_NAME);
			}
		}
	}
	
	@Check
	public void verificaSeNaoSeDesdobraEmUmaUnicaAlinea(Inciso inciso)
	{
		if ( inciso.getAlineas() != null && inciso.getAlineas().size() == 1)
		{
			error("O texto de um inciso não poderá desdobrar-se em uma única alínea.", LegisFacilePackage.Literals.INCISO__ALINEAS);
		}
	}
	
	@Check
	public void checkCaputStartsWithCapital(Caput caput)
	{
		if (!caput.getTexto().isEmpty() && !Character.isUpperCase(caput.getTexto().charAt(0)))
		{
			warning("O texto do \"caput\" deve começar com letra maiúscula", LegisFacilePackage.Literals.CAPUT__TEXTO, INVALID_NAME);
		}
	}
	
	@Check
	public void checkParagrafoStartsWithCapital(Paragrafo paragrafo)
	{
		if (!paragrafo.getTexto().isEmpty() && !Character.isUpperCase(paragrafo.getTexto().charAt(0)))
		{
			warning("O texto do \"Parágrafo\" deve começar com letra maiúscula", LegisFacilePackage.Literals.CAPUT__TEXTO, INVALID_NAME);
		}
	}
	
	@Check
	public void checkIncisoStartWithLowerCase(Inciso inciso)
	{
		if (!inciso.getTexto().isEmpty() && !Character.isLowerCase(inciso.getTexto().charAt(0)) )
		{
			warning("O texto do \"Inciso\" deve começar com letra minúscula exceto para nomes próprios", LegisFacilePackage.Literals.INCISO__TEXTO, INVALID_NAME);
		}
	}

	@Check
	public void checkAlineaStartWithLowerCase(Alinea alinea)
	{
		if (!alinea.getTexto().isEmpty() && !Character.isLowerCase(alinea.getTexto().charAt(0)) )
		{
			warning("O texto do \"Alinea\" deve começar com letra minúscula exceto para nomes próprios", LegisFacilePackage.Literals.ALINEA__TEXTO, INVALID_NAME);
		}
	}
	
	@Check
	public void checkItemStartWithLowerCase(Item item)
	{
		if (!item.getTexto().isEmpty() && !Character.isLowerCase(item.getTexto().charAt(0)) )
		{
			warning("O texto do \"Item\" deve começar com letra minúscula exceto para nomes próprios", LegisFacilePackage.Literals.ITEM__TEXTO, INVALID_NAME);
		}
	}
	
	
	
}
