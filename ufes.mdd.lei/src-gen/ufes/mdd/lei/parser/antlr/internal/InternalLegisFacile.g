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
		{
			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0());
		}
		this_DataType_0=ruleDataType
		{
			$current = $this_DataType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1());
		}
		this_Entity_1=ruleEntity
		{
			$current = $this_Entity_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTypeAccess().getPreliminarPreliminarParserRuleCall_2_0_0());
					}
					lv_preliminar_2_0=rulePreliminar
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypeRule());
						}
						set(
							$current,
							"preliminar",
							lv_preliminar_2_0,
							"ufes.mdd.lei.LegisFacile.Preliminar");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTypeAccess().getNormativaNormativaParserRuleCall_2_1_0());
					}
					lv_normativa_3_0=ruleNormativa
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypeRule());
						}
						set(
							$current,
							"normativa",
							lv_normativa_3_0,
							"ufes.mdd.lei.LegisFacile.Normativa");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTypeAccess().getFinalFinalParserRuleCall_2_2_0());
					}
					lv_final_4_0=ruleFinal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypeRule());
						}
						set(
							$current,
							"final",
							lv_final_4_0,
							"ufes.mdd.lei.LegisFacile.Final");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
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
			lv_texto_0_0=RULE_STRING
			{
				newLeafNode(lv_texto_0_0, grammarAccess.getCaputAccess().getTextoSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getCaputRule());
				}
				setWithLastConsumed(
					$current,
					"texto",
					lv_texto_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
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
						newCompositeNode(grammarAccess.getParagrafoAccess().getAlineasAlineaParserRuleCall_4_1_0());
					}
					lv_alineas_6_0=ruleAlinea
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getParagrafoRule());
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
				newLeafNode(otherlv_7, grammarAccess.getParagrafoAccess().getRightCurlyBracketKeyword_4_2());
			}
		)?
	)
;

// Entry rule entryRuleAlinea
entryRuleAlinea returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAlineaRule()); }
	iv_ruleAlinea=ruleAlinea
	{ $current=$iv_ruleAlinea.current.getText(); }
	EOF;

// Rule Alinea
ruleAlinea returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='alinea'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getAlineaAccess().getAlineaKeyword_0_0());
			}
			    |
			kw='Alinea'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getAlineaAccess().getAlineaKeyword_0_1());
			}
		)
		kw='{'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAlineaAccess().getLeftCurlyBracketKeyword_1());
		}
		kw='}'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAlineaAccess().getRightCurlyBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleFinal
entryRuleFinal returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFinalRule()); }
	iv_ruleFinal=ruleFinal
	{ $current=$iv_ruleFinal.current.getText(); }
	EOF;

// Rule Final
ruleFinal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='Final'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFinalAccess().getFinalKeyword_0_0());
			}
			    |
			kw='final'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFinalAccess().getFinalKeyword_0_1());
			}
		)
		kw='{'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_1());
		}
		kw='}'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleDataType
entryRuleDataType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeRule()); }
	iv_ruleDataType=ruleDataType
	{ $current=$iv_ruleDataType.current; }
	EOF;

// Rule DataType
ruleDataType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='datatype'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='entity'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='extends'
			{
				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEntityRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0());
					}
				)
			)
		)?
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0());
				}
				lv_features_5_0=ruleFeature
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					add(
						$current,
						"features",
						lv_features_5_0,
						"ufes.mdd.lei.LegisFacile.Feature");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	iv_ruleFeature=ruleFeature
	{ $current=$iv_ruleFeature.current; }
	EOF;

// Rule Feature
ruleFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_many_0_0='many'
				{
					newLeafNode(lv_many_0_0, grammarAccess.getFeatureAccess().getManyManyKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
					setWithLastConsumed($current, "many", lv_many_0_0 != null, "many");
				}
			)
		)?
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0());
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
