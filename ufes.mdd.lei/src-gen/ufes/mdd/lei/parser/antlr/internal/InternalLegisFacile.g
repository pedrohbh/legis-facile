/*
 * generated by Xtext 2.23.0
 */
grammar InternalLegisFacile;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package ufes.mdd.lei.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package ufes.mdd.lei.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ufes.mdd.lei.services.LegisFacileGrammarAccess;

}

@parser::members {

 	private LegisFacileGrammarAccess grammarAccess;

    public InternalLegisFacileParser(TokenStream input, LegisFacileGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Lei";
   	}

   	@Override
   	protected LegisFacileGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleLei
entryRuleLei returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLeiRule()); }
	iv_ruleLei=ruleLei
	{ $current=$iv_ruleLei.current; }
	EOF;

// Rule Lei
ruleLei returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getLeiAccess().getElementsTypeParserRuleCall_0());
			}
			lv_elements_0_0=ruleType
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getLeiRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"ufes.mdd.lei.LegisFacile.Type");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeAccess().getPreliminarPreliminarParserRuleCall_0_0());
				}
				lv_preliminar_0_0=rulePreliminar
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeRule());
					}
					set(
						$current,
						"preliminar",
						lv_preliminar_0_0,
						"ufes.mdd.lei.LegisFacile.Preliminar");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeAccess().getNormativaNormativaParserRuleCall_1_0());
				}
				lv_normativa_1_0=ruleNormativa
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeRule());
					}
					set(
						$current,
						"normativa",
						lv_normativa_1_0,
						"ufes.mdd.lei.LegisFacile.Normativa");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeAccess().getFinalFinalParserRuleCall_2_0());
				}
				lv_final_2_0=ruleFinal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeRule());
					}
					set(
						$current,
						"final",
						lv_final_2_0,
						"ufes.mdd.lei.LegisFacile.Final");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRulePreliminar
entryRulePreliminar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPreliminarRule()); }
	iv_rulePreliminar=rulePreliminar
	{ $current=$iv_rulePreliminar.current; }
	EOF;

// Rule Preliminar
rulePreliminar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Preliminar'
			{
				newLeafNode(otherlv_0, grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_0());
			}
			    |
			otherlv_1='preliminar'
			{
				newLeafNode(otherlv_1, grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_1());
			}
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPreliminarAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPreliminarAccess().getEpigrageEpigrafeParserRuleCall_2_0());
				}
				lv_epigrage_3_0=ruleEpigrafe
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPreliminarRule());
					}
					set(
						$current,
						"epigrage",
						lv_epigrage_3_0,
						"ufes.mdd.lei.LegisFacile.Epigrafe");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=','
		{
			newLeafNode(otherlv_4, grammarAccess.getPreliminarAccess().getCommaKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPreliminarAccess().getEmentaEmentaParserRuleCall_4_0());
				}
				lv_ementa_5_0=ruleEmenta
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPreliminarRule());
					}
					set(
						$current,
						"ementa",
						lv_ementa_5_0,
						"ufes.mdd.lei.LegisFacile.Ementa");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=','
		{
			newLeafNode(otherlv_6, grammarAccess.getPreliminarAccess().getCommaKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPreliminarAccess().getPreambuloPreambuloParserRuleCall_6_0());
				}
				lv_preambulo_7_0=rulePreambulo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPreliminarRule());
					}
					set(
						$current,
						"preambulo",
						lv_preambulo_7_0,
						"ufes.mdd.lei.LegisFacile.Preambulo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8=','
		{
			newLeafNode(otherlv_8, grammarAccess.getPreliminarAccess().getCommaKeyword_7());
		}
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getPreliminarAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleEpigrafe
entryRuleEpigrafe returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEpigrafeRule()); }
	iv_ruleEpigrafe=ruleEpigrafe
	{ $current=$iv_ruleEpigrafe.current; }
	EOF;

// Rule Epigrafe
ruleEpigrafe returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Epigrafe'
			{
				newLeafNode(otherlv_0, grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_0());
			}
			    |
			otherlv_1='epigrafe'
			{
				newLeafNode(otherlv_1, grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_1());
			}
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getEpigrafeAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_ato_3_0=RULE_STRING
				{
					newLeafNode(lv_ato_3_0, grammarAccess.getEpigrafeAccess().getAtoSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEpigrafeRule());
					}
					setWithLastConsumed(
						$current,
						"ato",
						lv_ato_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=','
		{
			newLeafNode(otherlv_4, grammarAccess.getEpigrafeAccess().getCommaKeyword_3());
		}
		(
			(
				lv_numero_5_0=RULE_INT
				{
					newLeafNode(lv_numero_5_0, grammarAccess.getEpigrafeAccess().getNumeroINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEpigrafeRule());
					}
					setWithLastConsumed(
						$current,
						"numero",
						lv_numero_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_6=','
		{
			newLeafNode(otherlv_6, grammarAccess.getEpigrafeAccess().getCommaKeyword_5());
		}
		(
			(
				lv_ano_7_0=RULE_INT
				{
					newLeafNode(lv_ano_7_0, grammarAccess.getEpigrafeAccess().getAnoINTTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEpigrafeRule());
					}
					setWithLastConsumed(
						$current,
						"ano",
						lv_ano_7_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getEpigrafeAccess().getRightParenthesisKeyword_7());
		}
	)
;

// Entry rule entryRuleEmenta
entryRuleEmenta returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEmentaRule()); }
	iv_ruleEmenta=ruleEmenta
	{ $current=$iv_ruleEmenta.current; }
	EOF;

// Rule Ementa
ruleEmenta returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Ementa'
			{
				newLeafNode(otherlv_0, grammarAccess.getEmentaAccess().getEmentaKeyword_0_0());
			}
			    |
			otherlv_1='ementa'
			{
				newLeafNode(otherlv_1, grammarAccess.getEmentaAccess().getEmentaKeyword_0_1());
			}
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getEmentaAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_ementa_3_0=RULE_STRING
				{
					newLeafNode(lv_ementa_3_0, grammarAccess.getEmentaAccess().getEmentaSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEmentaRule());
					}
					setWithLastConsumed(
						$current,
						"ementa",
						lv_ementa_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getEmentaAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRulePreambulo
entryRulePreambulo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPreambuloRule()); }
	iv_rulePreambulo=rulePreambulo
	{ $current=$iv_rulePreambulo.current; }
	EOF;

// Rule Preambulo
rulePreambulo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Preambulo'
			{
				newLeafNode(otherlv_0, grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_0());
			}
			    |
			otherlv_1='preambulo'
			{
				newLeafNode(otherlv_1, grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_1());
			}
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getPreambuloAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_preambulo_3_0=RULE_STRING
				{
					newLeafNode(lv_preambulo_3_0, grammarAccess.getPreambuloAccess().getPreambuloSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPreambuloRule());
					}
					setWithLastConsumed(
						$current,
						"preambulo",
						lv_preambulo_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getPreambuloAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleNormativa
entryRuleNormativa returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNormativaRule()); }
	iv_ruleNormativa=ruleNormativa
	{ $current=$iv_ruleNormativa.current; }
	EOF;

// Rule Normativa
ruleNormativa returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Normativa'
			{
				newLeafNode(otherlv_0, grammarAccess.getNormativaAccess().getNormativaKeyword_0_0());
			}
			    |
			otherlv_1='normativa'
			{
				newLeafNode(otherlv_1, grammarAccess.getNormativaAccess().getNormativaKeyword_0_1());
			}
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getNormativaAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNormativaAccess().getArtigosArtigoParserRuleCall_2_0());
				}
				lv_artigos_3_0=ruleArtigo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNormativaRule());
					}
					add(
						$current,
						"artigos",
						lv_artigos_3_0,
						"ufes.mdd.lei.LegisFacile.Artigo");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getNormativaAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleArtigo
entryRuleArtigo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArtigoRule()); }
	iv_ruleArtigo=ruleArtigo
	{ $current=$iv_ruleArtigo.current; }
	EOF;

// Rule Artigo
ruleArtigo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Artigo'
			{
				newLeafNode(otherlv_0, grammarAccess.getArtigoAccess().getArtigoKeyword_0_0());
			}
			    |
			otherlv_1='artigo'
			{
				newLeafNode(otherlv_1, grammarAccess.getArtigoAccess().getArtigoKeyword_0_1());
			}
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getArtigoAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getArtigoAccess().getCaputCaputParserRuleCall_2_0());
				}
				lv_caput_3_0=ruleCaput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getArtigoRule());
					}
					set(
						$current,
						"caput",
						lv_caput_3_0,
						"ufes.mdd.lei.LegisFacile.Caput");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getArtigoAccess().getParagrafosParagrafoParserRuleCall_3_0());
				}
				lv_paragrafos_4_0=ruleParagrafo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getArtigoRule());
					}
					add(
						$current,
						"paragrafos",
						lv_paragrafos_4_0,
						"ufes.mdd.lei.LegisFacile.Paragrafo");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getArtigoAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleCaput
entryRuleCaput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCaputRule()); }
	iv_ruleCaput=ruleCaput
	{ $current=$iv_ruleCaput.current; }
	EOF;

// Rule Caput
ruleCaput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Caput'
			{
				newLeafNode(otherlv_0, grammarAccess.getCaputAccess().getCaputKeyword_0_0());
			}
			    |
			otherlv_1='caput'
			{
				newLeafNode(otherlv_1, grammarAccess.getCaputAccess().getCaputKeyword_0_1());
			}
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getCaputAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_texto_3_0=RULE_STRING
				{
					newLeafNode(lv_texto_3_0, grammarAccess.getCaputAccess().getTextoSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCaputRule());
					}
					setWithLastConsumed(
						$current,
						"texto",
						lv_texto_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getCaputAccess().getRightParenthesisKeyword_3());
		}
		(
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getCaputAccess().getLeftCurlyBracketKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCaputAccess().getIncisosIncisoParserRuleCall_4_1_0());
					}
					lv_incisos_6_0=ruleInciso
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCaputRule());
						}
						add(
							$current,
							"incisos",
							lv_incisos_6_0,
							"ufes.mdd.lei.LegisFacile.Inciso");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_7='}'
			{
				newLeafNode(otherlv_7, grammarAccess.getCaputAccess().getRightCurlyBracketKeyword_4_2());
			}
		)?
	)
;

// Entry rule entryRuleParagrafo
entryRuleParagrafo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParagrafoRule()); }
	iv_ruleParagrafo=ruleParagrafo
	{ $current=$iv_ruleParagrafo.current; }
	EOF;

// Rule Paragrafo
ruleParagrafo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Paragrafo'
			{
				newLeafNode(otherlv_0, grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_0());
			}
			    |
			otherlv_1='paragrafo'
			{
				newLeafNode(otherlv_1, grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_1());
			}
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getParagrafoAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_texto_3_0=RULE_STRING
				{
					newLeafNode(lv_texto_3_0, grammarAccess.getParagrafoAccess().getTextoSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParagrafoRule());
					}
					setWithLastConsumed(
						$current,
						"texto",
						lv_texto_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getParagrafoAccess().getRightParenthesisKeyword_3());
		}
		(
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getParagrafoAccess().getLeftCurlyBracketKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getParagrafoAccess().getIncisosIncisoParserRuleCall_4_1_0());
					}
					lv_incisos_6_0=ruleInciso
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getParagrafoRule());
						}
						add(
							$current,
							"incisos",
							lv_incisos_6_0,
							"ufes.mdd.lei.LegisFacile.Inciso");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_7='}'
			{
				newLeafNode(otherlv_7, grammarAccess.getParagrafoAccess().getRightCurlyBracketKeyword_4_2());
			}
		)?
	)
;

// Entry rule entryRuleInciso
entryRuleInciso returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIncisoRule()); }
	iv_ruleInciso=ruleInciso
	{ $current=$iv_ruleInciso.current; }
	EOF;

// Rule Inciso
ruleInciso returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Inciso'
			{
				newLeafNode(otherlv_0, grammarAccess.getIncisoAccess().getIncisoKeyword_0_0());
			}
			    |
			otherlv_1='inciso'
			{
				newLeafNode(otherlv_1, grammarAccess.getIncisoAccess().getIncisoKeyword_0_1());
			}
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getIncisoAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_texto_3_0=RULE_STRING
				{
					newLeafNode(lv_texto_3_0, grammarAccess.getIncisoAccess().getTextoSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIncisoRule());
					}
					setWithLastConsumed(
						$current,
						"texto",
						lv_texto_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getIncisoAccess().getRightParenthesisKeyword_3());
		}
		(
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getIncisoAccess().getLeftCurlyBracketKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIncisoAccess().getAlineasAlineaParserRuleCall_4_1_0());
					}
					lv_alineas_6_0=ruleAlinea
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIncisoRule());
						}
						add(
							$current,
							"alineas",
							lv_alineas_6_0,
							"ufes.mdd.lei.LegisFacile.Alinea");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_7='}'
			{
				newLeafNode(otherlv_7, grammarAccess.getIncisoAccess().getRightCurlyBracketKeyword_4_2());
			}
		)?
	)
;

// Entry rule entryRuleAlinea
entryRuleAlinea returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAlineaRule()); }
	iv_ruleAlinea=ruleAlinea
	{ $current=$iv_ruleAlinea.current; }
	EOF;

// Rule Alinea
ruleAlinea returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='alinea'
			{
				newLeafNode(otherlv_0, grammarAccess.getAlineaAccess().getAlineaKeyword_0_0());
			}
			    |
			otherlv_1='Alinea'
			{
				newLeafNode(otherlv_1, grammarAccess.getAlineaAccess().getAlineaKeyword_0_1());
			}
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getAlineaAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_texto_3_0=RULE_STRING
				{
					newLeafNode(lv_texto_3_0, grammarAccess.getAlineaAccess().getTextoSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAlineaRule());
					}
					setWithLastConsumed(
						$current,
						"texto",
						lv_texto_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getAlineaAccess().getRightParenthesisKeyword_3());
		}
		(
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getAlineaAccess().getLeftCurlyBracketKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAlineaAccess().getItensItemParserRuleCall_4_1_0());
					}
					lv_itens_6_0=ruleItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAlineaRule());
						}
						add(
							$current,
							"itens",
							lv_itens_6_0,
							"ufes.mdd.lei.LegisFacile.Item");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_7='}'
			{
				newLeafNode(otherlv_7, grammarAccess.getAlineaAccess().getRightCurlyBracketKeyword_4_2());
			}
		)?
	)
;

// Entry rule entryRuleItem
entryRuleItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getItemRule()); }
	iv_ruleItem=ruleItem
	{ $current=$iv_ruleItem.current; }
	EOF;

// Rule Item
ruleItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Item'
			{
				newLeafNode(otherlv_0, grammarAccess.getItemAccess().getItemKeyword_0_0());
			}
			    |
			otherlv_1='item'
			{
				newLeafNode(otherlv_1, grammarAccess.getItemAccess().getItemKeyword_0_1());
			}
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getItemAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_texto_3_0=RULE_STRING
				{
					newLeafNode(lv_texto_3_0, grammarAccess.getItemAccess().getTextoSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getItemRule());
					}
					setWithLastConsumed(
						$current,
						"texto",
						lv_texto_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getItemAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleFinal
entryRuleFinal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFinalRule()); }
	iv_ruleFinal=ruleFinal
	{ $current=$iv_ruleFinal.current; }
	EOF;

// Rule Final
ruleFinal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Final'
			{
				newLeafNode(otherlv_0, grammarAccess.getFinalAccess().getFinalKeyword_0_0());
			}
			    |
			otherlv_1='final'
			{
				newLeafNode(otherlv_1, grammarAccess.getFinalAccess().getFinalKeyword_0_1());
			}
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getFinalAccess().getVigenciaVigenciaParserRuleCall_2_0_0_0());
						}
						lv_vigencia_3_0=ruleVigencia
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFinalRule());
							}
							set(
								$current,
								"vigencia",
								lv_vigencia_3_0,
								"ufes.mdd.lei.LegisFacile.Vigencia");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getFinalAccess().getRevogacaoRevogacaoParserRuleCall_2_0_1_0());
						}
						lv_revogacao_4_0=ruleRevogacao
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFinalRule());
							}
							set(
								$current,
								"revogacao",
								lv_revogacao_4_0,
								"ufes.mdd.lei.LegisFacile.Revogacao");
							afterParserOrEnumRuleCall();
						}
					)
				)?
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getFinalAccess().getRevogacaoRevogacaoParserRuleCall_2_1_0_0());
						}
						lv_revogacao_5_0=ruleRevogacao
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFinalRule());
							}
							set(
								$current,
								"revogacao",
								lv_revogacao_5_0,
								"ufes.mdd.lei.LegisFacile.Revogacao");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getFinalAccess().getVigenciaVigenciaParserRuleCall_2_1_1_0());
						}
						lv_vigencia_6_0=ruleVigencia
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFinalRule());
							}
							set(
								$current,
								"vigencia",
								lv_vigencia_6_0,
								"ufes.mdd.lei.LegisFacile.Vigencia");
							afterParserOrEnumRuleCall();
						}
					)
				)?
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleVigencia
entryRuleVigencia returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVigenciaRule()); }
	iv_ruleVigencia=ruleVigencia
	{ $current=$iv_ruleVigencia.current; }
	EOF;

// Rule Vigencia
ruleVigencia returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='vigencia'
			{
				newLeafNode(otherlv_0, grammarAccess.getVigenciaAccess().getVigenciaKeyword_0_0());
			}
			    |
			otherlv_1='Vigencia'
			{
				newLeafNode(otherlv_1, grammarAccess.getVigenciaAccess().getVigenciaKeyword_0_1());
			}
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getVigenciaAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_texto_3_0=RULE_STRING
				{
					newLeafNode(lv_texto_3_0, grammarAccess.getVigenciaAccess().getTextoSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVigenciaRule());
					}
					setWithLastConsumed(
						$current,
						"texto",
						lv_texto_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getVigenciaAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleRevogacao
entryRuleRevogacao returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRevogacaoRule()); }
	iv_ruleRevogacao=ruleRevogacao
	{ $current=$iv_ruleRevogacao.current; }
	EOF;

// Rule Revogacao
ruleRevogacao returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='revoga'
			{
				newLeafNode(otherlv_0, grammarAccess.getRevogacaoAccess().getRevogaKeyword_0_0());
			}
			    |
			otherlv_1='Revoga'
			{
				newLeafNode(otherlv_1, grammarAccess.getRevogacaoAccess().getRevogaKeyword_0_1());
			}
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getRevogacaoAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_texto_3_0=RULE_STRING
				{
					newLeafNode(lv_texto_3_0, grammarAccess.getRevogacaoAccess().getTextoSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRevogacaoRule());
					}
					setWithLastConsumed(
						$current,
						"texto",
						lv_texto_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getRevogacaoAccess().getRightParenthesisKeyword_3());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
