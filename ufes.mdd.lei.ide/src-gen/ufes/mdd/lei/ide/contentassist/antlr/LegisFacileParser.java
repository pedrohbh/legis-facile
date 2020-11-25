/*
 * generated by Xtext 2.23.0
 */
package ufes.mdd.lei.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import ufes.mdd.lei.ide.contentassist.antlr.internal.InternalLegisFacileParser;
import ufes.mdd.lei.services.LegisFacileGrammarAccess;

public class LegisFacileParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LegisFacileGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LegisFacileGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getPreliminarAccess().getAlternatives_0(), "rule__Preliminar__Alternatives_0");
			builder.put(grammarAccess.getEpigrafeAccess().getAlternatives_0(), "rule__Epigrafe__Alternatives_0");
			builder.put(grammarAccess.getEmentaAccess().getAlternatives_0(), "rule__Ementa__Alternatives_0");
			builder.put(grammarAccess.getPreambuloAccess().getAlternatives_0(), "rule__Preambulo__Alternatives_0");
			builder.put(grammarAccess.getNormativaAccess().getAlternatives_0(), "rule__Normativa__Alternatives_0");
			builder.put(grammarAccess.getArtigoAccess().getAlternatives_0(), "rule__Artigo__Alternatives_0");
			builder.put(grammarAccess.getParagrafoAccess().getAlternatives_0(), "rule__Paragrafo__Alternatives_0");
			builder.put(grammarAccess.getAlineaAccess().getAlternatives_0(), "rule__Alinea__Alternatives_0");
			builder.put(grammarAccess.getItemAccess().getAlternatives_0(), "rule__Item__Alternatives_0");
			builder.put(grammarAccess.getFinalAccess().getAlternatives_0(), "rule__Final__Alternatives_0");
			builder.put(grammarAccess.getTypeAccess().getGroup_2(), "rule__Type__Group_2__0");
			builder.put(grammarAccess.getPreliminarAccess().getGroup(), "rule__Preliminar__Group__0");
			builder.put(grammarAccess.getEpigrafeAccess().getGroup(), "rule__Epigrafe__Group__0");
			builder.put(grammarAccess.getEmentaAccess().getGroup(), "rule__Ementa__Group__0");
			builder.put(grammarAccess.getPreambuloAccess().getGroup(), "rule__Preambulo__Group__0");
			builder.put(grammarAccess.getNormativaAccess().getGroup(), "rule__Normativa__Group__0");
			builder.put(grammarAccess.getArtigoAccess().getGroup(), "rule__Artigo__Group__0");
			builder.put(grammarAccess.getCaputAccess().getGroup(), "rule__Caput__Group__0");
			builder.put(grammarAccess.getCaputAccess().getGroup_4(), "rule__Caput__Group_4__0");
			builder.put(grammarAccess.getParagrafoAccess().getGroup(), "rule__Paragrafo__Group__0");
			builder.put(grammarAccess.getParagrafoAccess().getGroup_4(), "rule__Paragrafo__Group_4__0");
			builder.put(grammarAccess.getAlineaAccess().getGroup(), "rule__Alinea__Group__0");
			builder.put(grammarAccess.getAlineaAccess().getGroup_4(), "rule__Alinea__Group_4__0");
			builder.put(grammarAccess.getItemAccess().getGroup(), "rule__Item__Group__0");
			builder.put(grammarAccess.getFinalAccess().getGroup(), "rule__Final__Group__0");
			builder.put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_2(), "rule__Entity__Group_2__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
			builder.put(grammarAccess.getLeiAccess().getElementsAssignment(), "rule__Lei__ElementsAssignment");
			builder.put(grammarAccess.getTypeAccess().getPreliminarAssignment_2_0(), "rule__Type__PreliminarAssignment_2_0");
			builder.put(grammarAccess.getTypeAccess().getNormativaAssignment_2_1(), "rule__Type__NormativaAssignment_2_1");
			builder.put(grammarAccess.getTypeAccess().getFinalAssignment_2_2(), "rule__Type__FinalAssignment_2_2");
			builder.put(grammarAccess.getPreliminarAccess().getEpigrageAssignment_2(), "rule__Preliminar__EpigrageAssignment_2");
			builder.put(grammarAccess.getPreliminarAccess().getEmentaAssignment_4(), "rule__Preliminar__EmentaAssignment_4");
			builder.put(grammarAccess.getPreliminarAccess().getPreambuloAssignment_6(), "rule__Preliminar__PreambuloAssignment_6");
			builder.put(grammarAccess.getEpigrafeAccess().getAtoAssignment_2(), "rule__Epigrafe__AtoAssignment_2");
			builder.put(grammarAccess.getEpigrafeAccess().getNumeroAssignment_4(), "rule__Epigrafe__NumeroAssignment_4");
			builder.put(grammarAccess.getEpigrafeAccess().getAnoAssignment_6(), "rule__Epigrafe__AnoAssignment_6");
			builder.put(grammarAccess.getEmentaAccess().getEmentaAssignment_2(), "rule__Ementa__EmentaAssignment_2");
			builder.put(grammarAccess.getPreambuloAccess().getPreambuloAssignment_2(), "rule__Preambulo__PreambuloAssignment_2");
			builder.put(grammarAccess.getNormativaAccess().getArtigosAssignment_2(), "rule__Normativa__ArtigosAssignment_2");
			builder.put(grammarAccess.getArtigoAccess().getCaputAssignment_2(), "rule__Artigo__CaputAssignment_2");
			builder.put(grammarAccess.getArtigoAccess().getParagrafosAssignment_3(), "rule__Artigo__ParagrafosAssignment_3");
			builder.put(grammarAccess.getCaputAccess().getTextoAssignment_2(), "rule__Caput__TextoAssignment_2");
			builder.put(grammarAccess.getCaputAccess().getParagrafosAssignment_4_1(), "rule__Caput__ParagrafosAssignment_4_1");
			builder.put(grammarAccess.getParagrafoAccess().getTextoAssignment_2(), "rule__Paragrafo__TextoAssignment_2");
			builder.put(grammarAccess.getParagrafoAccess().getAlineasAssignment_4_1(), "rule__Paragrafo__AlineasAssignment_4_1");
			builder.put(grammarAccess.getAlineaAccess().getTextoAssignment_2(), "rule__Alinea__TextoAssignment_2");
			builder.put(grammarAccess.getAlineaAccess().getItensAssignment_4_1(), "rule__Alinea__ItensAssignment_4_1");
			builder.put(grammarAccess.getItemAccess().getTextoAssignment_2(), "rule__Item__TextoAssignment_2");
			builder.put(grammarAccess.getDataTypeAccess().getNameAssignment_1(), "rule__DataType__NameAssignment_1");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
			builder.put(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1(), "rule__Entity__SuperTypeAssignment_2_1");
			builder.put(grammarAccess.getEntityAccess().getFeaturesAssignment_4(), "rule__Entity__FeaturesAssignment_4");
			builder.put(grammarAccess.getFeatureAccess().getManyAssignment_0(), "rule__Feature__ManyAssignment_0");
			builder.put(grammarAccess.getFeatureAccess().getNameAssignment_1(), "rule__Feature__NameAssignment_1");
			builder.put(grammarAccess.getFeatureAccess().getTypeAssignment_3(), "rule__Feature__TypeAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LegisFacileGrammarAccess grammarAccess;

	@Override
	protected InternalLegisFacileParser createParser() {
		InternalLegisFacileParser result = new InternalLegisFacileParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LegisFacileGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LegisFacileGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
