/*
 * generated by Xtext 2.23.0
 */
package ufes.mdd.lei.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import ufes.mdd.lei.legisFacile.Alinea;
import ufes.mdd.lei.legisFacile.Artigo;
import ufes.mdd.lei.legisFacile.Caput;
import ufes.mdd.lei.legisFacile.Ementa;
import ufes.mdd.lei.legisFacile.Epigrafe;
import ufes.mdd.lei.legisFacile.Final;
import ufes.mdd.lei.legisFacile.Inciso;
import ufes.mdd.lei.legisFacile.Item;
import ufes.mdd.lei.legisFacile.LegisFacilePackage;
import ufes.mdd.lei.legisFacile.Lei;
import ufes.mdd.lei.legisFacile.Normativa;
import ufes.mdd.lei.legisFacile.Paragrafo;
import ufes.mdd.lei.legisFacile.Preambulo;
import ufes.mdd.lei.legisFacile.Preliminar;
import ufes.mdd.lei.legisFacile.Revogacao;
import ufes.mdd.lei.legisFacile.Type;
import ufes.mdd.lei.legisFacile.Vigencia;
import ufes.mdd.lei.services.LegisFacileGrammarAccess;

@SuppressWarnings("all")
public class LegisFacileSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LegisFacileGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LegisFacilePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LegisFacilePackage.ALINEA:
				sequence_Alinea(context, (Alinea) semanticObject); 
				return; 
			case LegisFacilePackage.ARTIGO:
				sequence_Artigo(context, (Artigo) semanticObject); 
				return; 
			case LegisFacilePackage.CAPUT:
				sequence_Caput(context, (Caput) semanticObject); 
				return; 
			case LegisFacilePackage.EMENTA:
				sequence_Ementa(context, (Ementa) semanticObject); 
				return; 
			case LegisFacilePackage.EPIGRAFE:
				sequence_Epigrafe(context, (Epigrafe) semanticObject); 
				return; 
			case LegisFacilePackage.FINAL:
				sequence_Final(context, (Final) semanticObject); 
				return; 
			case LegisFacilePackage.INCISO:
				sequence_Inciso(context, (Inciso) semanticObject); 
				return; 
			case LegisFacilePackage.ITEM:
				sequence_Item(context, (Item) semanticObject); 
				return; 
			case LegisFacilePackage.LEI:
				sequence_Lei(context, (Lei) semanticObject); 
				return; 
			case LegisFacilePackage.NORMATIVA:
				sequence_Normativa(context, (Normativa) semanticObject); 
				return; 
			case LegisFacilePackage.PARAGRAFO:
				sequence_Paragrafo(context, (Paragrafo) semanticObject); 
				return; 
			case LegisFacilePackage.PREAMBULO:
				sequence_Preambulo(context, (Preambulo) semanticObject); 
				return; 
			case LegisFacilePackage.PRELIMINAR:
				sequence_Preliminar(context, (Preliminar) semanticObject); 
				return; 
			case LegisFacilePackage.REVOGACAO:
				sequence_Revogacao(context, (Revogacao) semanticObject); 
				return; 
			case LegisFacilePackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case LegisFacilePackage.VIGENCIA:
				sequence_Vigencia(context, (Vigencia) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Alinea returns Alinea
	 *
	 * Constraint:
	 *     (texto=STRING itens+=Item*)
	 */
	protected void sequence_Alinea(ISerializationContext context, Alinea semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Artigo returns Artigo
	 *
	 * Constraint:
	 *     (caput=Caput paragrafos+=Paragrafo*)
	 */
	protected void sequence_Artigo(ISerializationContext context, Artigo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Caput returns Caput
	 *
	 * Constraint:
	 *     (texto=STRING incisos+=Inciso*)
	 */
	protected void sequence_Caput(ISerializationContext context, Caput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Ementa returns Ementa
	 *
	 * Constraint:
	 *     ementa=STRING
	 */
	protected void sequence_Ementa(ISerializationContext context, Ementa semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegisFacilePackage.Literals.EMENTA__EMENTA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegisFacilePackage.Literals.EMENTA__EMENTA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEmentaAccess().getEmentaSTRINGTerminalRuleCall_2_0(), semanticObject.getEmenta());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Epigrafe returns Epigrafe
	 *
	 * Constraint:
	 *     (ato=STRING numero=INT ano=INT)
	 */
	protected void sequence_Epigrafe(ISerializationContext context, Epigrafe semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegisFacilePackage.Literals.EPIGRAFE__ATO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegisFacilePackage.Literals.EPIGRAFE__ATO));
			if (transientValues.isValueTransient(semanticObject, LegisFacilePackage.Literals.EPIGRAFE__NUMERO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegisFacilePackage.Literals.EPIGRAFE__NUMERO));
			if (transientValues.isValueTransient(semanticObject, LegisFacilePackage.Literals.EPIGRAFE__ANO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegisFacilePackage.Literals.EPIGRAFE__ANO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEpigrafeAccess().getAtoSTRINGTerminalRuleCall_2_0(), semanticObject.getAto());
		feeder.accept(grammarAccess.getEpigrafeAccess().getNumeroINTTerminalRuleCall_4_0(), semanticObject.getNumero());
		feeder.accept(grammarAccess.getEpigrafeAccess().getAnoINTTerminalRuleCall_6_0(), semanticObject.getAno());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Final returns Final
	 *
	 * Constraint:
	 *     ((vigencia=Vigencia revogacao=Revogacao?) | (revogacao=Revogacao vigencia=Vigencia?))
	 */
	protected void sequence_Final(ISerializationContext context, Final semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Inciso returns Inciso
	 *
	 * Constraint:
	 *     (texto=STRING alineas+=Alinea*)
	 */
	protected void sequence_Inciso(ISerializationContext context, Inciso semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Item returns Item
	 *
	 * Constraint:
	 *     texto=STRING
	 */
	protected void sequence_Item(ISerializationContext context, Item semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegisFacilePackage.Literals.ITEM__TEXTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegisFacilePackage.Literals.ITEM__TEXTO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getItemAccess().getTextoSTRINGTerminalRuleCall_2_0(), semanticObject.getTexto());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Lei returns Lei
	 *
	 * Constraint:
	 *     elements+=Type+
	 */
	protected void sequence_Lei(ISerializationContext context, Lei semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Normativa returns Normativa
	 *
	 * Constraint:
	 *     artigos+=Artigo+
	 */
	protected void sequence_Normativa(ISerializationContext context, Normativa semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Paragrafo returns Paragrafo
	 *
	 * Constraint:
	 *     (texto=STRING incisos+=Inciso*)
	 */
	protected void sequence_Paragrafo(ISerializationContext context, Paragrafo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Preambulo returns Preambulo
	 *
	 * Constraint:
	 *     preambulo=STRING
	 */
	protected void sequence_Preambulo(ISerializationContext context, Preambulo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegisFacilePackage.Literals.PREAMBULO__PREAMBULO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegisFacilePackage.Literals.PREAMBULO__PREAMBULO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPreambuloAccess().getPreambuloSTRINGTerminalRuleCall_2_0(), semanticObject.getPreambulo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Preliminar returns Preliminar
	 *
	 * Constraint:
	 *     (epigrage=Epigrafe ementa=Ementa preambulo=Preambulo)
	 */
	protected void sequence_Preliminar(ISerializationContext context, Preliminar semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegisFacilePackage.Literals.PRELIMINAR__EPIGRAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegisFacilePackage.Literals.PRELIMINAR__EPIGRAGE));
			if (transientValues.isValueTransient(semanticObject, LegisFacilePackage.Literals.PRELIMINAR__EMENTA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegisFacilePackage.Literals.PRELIMINAR__EMENTA));
			if (transientValues.isValueTransient(semanticObject, LegisFacilePackage.Literals.PRELIMINAR__PREAMBULO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegisFacilePackage.Literals.PRELIMINAR__PREAMBULO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPreliminarAccess().getEpigrageEpigrafeParserRuleCall_2_0(), semanticObject.getEpigrage());
		feeder.accept(grammarAccess.getPreliminarAccess().getEmentaEmentaParserRuleCall_4_0(), semanticObject.getEmenta());
		feeder.accept(grammarAccess.getPreliminarAccess().getPreambuloPreambuloParserRuleCall_6_0(), semanticObject.getPreambulo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Revogacao returns Revogacao
	 *
	 * Constraint:
	 *     texto=STRING
	 */
	protected void sequence_Revogacao(ISerializationContext context, Revogacao semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegisFacilePackage.Literals.REVOGACAO__TEXTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegisFacilePackage.Literals.REVOGACAO__TEXTO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRevogacaoAccess().getTextoSTRINGTerminalRuleCall_2_0(), semanticObject.getTexto());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *
	 * Constraint:
	 *     (preliminar=Preliminar normativa=Normativa final=Final?)
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Vigencia returns Vigencia
	 *
	 * Constraint:
	 *     texto=STRING
	 */
	protected void sequence_Vigencia(ISerializationContext context, Vigencia semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LegisFacilePackage.Literals.VIGENCIA__TEXTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegisFacilePackage.Literals.VIGENCIA__TEXTO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVigenciaAccess().getTextoSTRINGTerminalRuleCall_2_0(), semanticObject.getTexto());
		feeder.finish();
	}
	
	
}
