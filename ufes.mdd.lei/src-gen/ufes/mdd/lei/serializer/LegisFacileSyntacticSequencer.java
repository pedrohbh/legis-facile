/*
 * generated by Xtext 2.23.0
 */
package ufes.mdd.lei.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import ufes.mdd.lei.services.LegisFacileGrammarAccess;

@SuppressWarnings("all")
public class LegisFacileSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LegisFacileGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Artigo_ArtigoKeyword_0_0_or_ArtigoKeyword_0_1;
	protected AbstractElementAlias match_Ementa_EmentaKeyword_0_0_or_EmentaKeyword_0_1;
	protected AbstractElementAlias match_Epigrafe_EpigrafeKeyword_0_0_or_EpigrafeKeyword_0_1;
	protected AbstractElementAlias match_Normativa_NormativaKeyword_0_0_or_NormativaKeyword_0_1;
	protected AbstractElementAlias match_Paragrafo_ParagrafoKeyword_0_0_or_ParagrafoKeyword_0_1;
	protected AbstractElementAlias match_Paragrafo___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q;
	protected AbstractElementAlias match_Preambulo_PreambuloKeyword_0_0_or_PreambuloKeyword_0_1;
	protected AbstractElementAlias match_Preliminar_PreliminarKeyword_0_0_or_PreliminarKeyword_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LegisFacileGrammarAccess) access;
		match_Artigo_ArtigoKeyword_0_0_or_ArtigoKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getArtigoAccess().getArtigoKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getArtigoAccess().getArtigoKeyword_0_1()));
		match_Ementa_EmentaKeyword_0_0_or_EmentaKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getEmentaAccess().getEmentaKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getEmentaAccess().getEmentaKeyword_0_1()));
		match_Epigrafe_EpigrafeKeyword_0_0_or_EpigrafeKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_1()));
		match_Normativa_NormativaKeyword_0_0_or_NormativaKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNormativaAccess().getNormativaKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getNormativaAccess().getNormativaKeyword_0_1()));
		match_Paragrafo_ParagrafoKeyword_0_0_or_ParagrafoKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_1()));
		match_Paragrafo___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getParagrafoAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getParagrafoAccess().getRightCurlyBracketKeyword_4_2()));
		match_Preambulo_PreambuloKeyword_0_0_or_PreambuloKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_1()));
		match_Preliminar_PreliminarKeyword_0_0_or_PreliminarKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Artigo_ArtigoKeyword_0_0_or_ArtigoKeyword_0_1.equals(syntax))
				emit_Artigo_ArtigoKeyword_0_0_or_ArtigoKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Ementa_EmentaKeyword_0_0_or_EmentaKeyword_0_1.equals(syntax))
				emit_Ementa_EmentaKeyword_0_0_or_EmentaKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Epigrafe_EpigrafeKeyword_0_0_or_EpigrafeKeyword_0_1.equals(syntax))
				emit_Epigrafe_EpigrafeKeyword_0_0_or_EpigrafeKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Normativa_NormativaKeyword_0_0_or_NormativaKeyword_0_1.equals(syntax))
				emit_Normativa_NormativaKeyword_0_0_or_NormativaKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Paragrafo_ParagrafoKeyword_0_0_or_ParagrafoKeyword_0_1.equals(syntax))
				emit_Paragrafo_ParagrafoKeyword_0_0_or_ParagrafoKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Paragrafo___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q.equals(syntax))
				emit_Paragrafo___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Preambulo_PreambuloKeyword_0_0_or_PreambuloKeyword_0_1.equals(syntax))
				emit_Preambulo_PreambuloKeyword_0_0_or_PreambuloKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Preliminar_PreliminarKeyword_0_0_or_PreliminarKeyword_0_1.equals(syntax))
				emit_Preliminar_PreliminarKeyword_0_0_or_PreliminarKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'Artigo' | 'artigo'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '{' caput=Caput
	 */
	protected void emit_Artigo_ArtigoKeyword_0_0_or_ArtigoKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Ementa' | 'ementa'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' ementa=STRING
	 */
	protected void emit_Ementa_EmentaKeyword_0_0_or_EmentaKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Epigrafe' | 'epigrafe'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' ato=STRING
	 */
	protected void emit_Epigrafe_EpigrafeKeyword_0_0_or_EpigrafeKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Normativa' | 'normativa'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '{' artigos+=Artigo
	 */
	protected void emit_Normativa_NormativaKeyword_0_0_or_NormativaKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Paragrafo' | 'paragrafo'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' texto=STRING
	 */
	protected void emit_Paragrafo_ParagrafoKeyword_0_0_or_ParagrafoKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     texto=STRING ')' (ambiguity) (rule end)
	 */
	protected void emit_Paragrafo___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Preambulo' | 'preambulo'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' preambulo=STRING
	 */
	protected void emit_Preambulo_PreambuloKeyword_0_0_or_PreambuloKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Preliminar' | 'preliminar'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '{' epigrage=Epigrafe
	 */
	protected void emit_Preliminar_PreliminarKeyword_0_0_or_PreliminarKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
