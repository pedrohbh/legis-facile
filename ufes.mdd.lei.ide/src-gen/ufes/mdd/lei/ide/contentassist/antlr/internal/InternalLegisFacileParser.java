package ufes.mdd.lei.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ufes.mdd.lei.services.LegisFacileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLegisFacileParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Preliminar'", "'preliminar'", "'Epigrafe'", "'epigrafe'", "'Ementa'", "'ementa'", "'Preambulo'", "'preambulo'", "'Normativa'", "'normativa'", "'Artigo'", "'artigo'", "'Caput'", "'caput'", "'Paragrafo'", "'paragrafo'", "'Inciso'", "'inciso'", "'alinea'", "'Alinea'", "'Item'", "'item'", "'Final'", "'final'", "'{'", "','", "'}'", "'('", "')'", "'datatype'", "'entity'", "'extends'", "':'", "'many'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalLegisFacileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLegisFacileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLegisFacileParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLegisFacile.g"; }


    	private LegisFacileGrammarAccess grammarAccess;

    	public void setGrammarAccess(LegisFacileGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleLei"
    // InternalLegisFacile.g:53:1: entryRuleLei : ruleLei EOF ;
    public final void entryRuleLei() throws RecognitionException {
        try {
            // InternalLegisFacile.g:54:1: ( ruleLei EOF )
            // InternalLegisFacile.g:55:1: ruleLei EOF
            {
             before(grammarAccess.getLeiRule()); 
            pushFollow(FOLLOW_1);
            ruleLei();

            state._fsp--;

             after(grammarAccess.getLeiRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLei"


    // $ANTLR start "ruleLei"
    // InternalLegisFacile.g:62:1: ruleLei : ( ( rule__Lei__ElementsAssignment )* ) ;
    public final void ruleLei() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:66:2: ( ( ( rule__Lei__ElementsAssignment )* ) )
            // InternalLegisFacile.g:67:2: ( ( rule__Lei__ElementsAssignment )* )
            {
            // InternalLegisFacile.g:67:2: ( ( rule__Lei__ElementsAssignment )* )
            // InternalLegisFacile.g:68:3: ( rule__Lei__ElementsAssignment )*
            {
             before(grammarAccess.getLeiAccess().getElementsAssignment()); 
            // InternalLegisFacile.g:69:3: ( rule__Lei__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=40 && LA1_0<=41)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLegisFacile.g:69:4: rule__Lei__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Lei__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLeiAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLei"


    // $ANTLR start "entryRuleType"
    // InternalLegisFacile.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalLegisFacile.g:79:1: ( ruleType EOF )
            // InternalLegisFacile.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalLegisFacile.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalLegisFacile.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalLegisFacile.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalLegisFacile.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalLegisFacile.g:94:3: ( rule__Type__Alternatives )
            // InternalLegisFacile.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePreliminar"
    // InternalLegisFacile.g:103:1: entryRulePreliminar : rulePreliminar EOF ;
    public final void entryRulePreliminar() throws RecognitionException {
        try {
            // InternalLegisFacile.g:104:1: ( rulePreliminar EOF )
            // InternalLegisFacile.g:105:1: rulePreliminar EOF
            {
             before(grammarAccess.getPreliminarRule()); 
            pushFollow(FOLLOW_1);
            rulePreliminar();

            state._fsp--;

             after(grammarAccess.getPreliminarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePreliminar"


    // $ANTLR start "rulePreliminar"
    // InternalLegisFacile.g:112:1: rulePreliminar : ( ( rule__Preliminar__Group__0 ) ) ;
    public final void rulePreliminar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:116:2: ( ( ( rule__Preliminar__Group__0 ) ) )
            // InternalLegisFacile.g:117:2: ( ( rule__Preliminar__Group__0 ) )
            {
            // InternalLegisFacile.g:117:2: ( ( rule__Preliminar__Group__0 ) )
            // InternalLegisFacile.g:118:3: ( rule__Preliminar__Group__0 )
            {
             before(grammarAccess.getPreliminarAccess().getGroup()); 
            // InternalLegisFacile.g:119:3: ( rule__Preliminar__Group__0 )
            // InternalLegisFacile.g:119:4: rule__Preliminar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Preliminar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPreliminarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePreliminar"


    // $ANTLR start "entryRuleEpigrafe"
    // InternalLegisFacile.g:128:1: entryRuleEpigrafe : ruleEpigrafe EOF ;
    public final void entryRuleEpigrafe() throws RecognitionException {
        try {
            // InternalLegisFacile.g:129:1: ( ruleEpigrafe EOF )
            // InternalLegisFacile.g:130:1: ruleEpigrafe EOF
            {
             before(grammarAccess.getEpigrafeRule()); 
            pushFollow(FOLLOW_1);
            ruleEpigrafe();

            state._fsp--;

             after(grammarAccess.getEpigrafeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEpigrafe"


    // $ANTLR start "ruleEpigrafe"
    // InternalLegisFacile.g:137:1: ruleEpigrafe : ( ( rule__Epigrafe__Group__0 ) ) ;
    public final void ruleEpigrafe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:141:2: ( ( ( rule__Epigrafe__Group__0 ) ) )
            // InternalLegisFacile.g:142:2: ( ( rule__Epigrafe__Group__0 ) )
            {
            // InternalLegisFacile.g:142:2: ( ( rule__Epigrafe__Group__0 ) )
            // InternalLegisFacile.g:143:3: ( rule__Epigrafe__Group__0 )
            {
             before(grammarAccess.getEpigrafeAccess().getGroup()); 
            // InternalLegisFacile.g:144:3: ( rule__Epigrafe__Group__0 )
            // InternalLegisFacile.g:144:4: rule__Epigrafe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Epigrafe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEpigrafeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEpigrafe"


    // $ANTLR start "entryRuleEmenta"
    // InternalLegisFacile.g:153:1: entryRuleEmenta : ruleEmenta EOF ;
    public final void entryRuleEmenta() throws RecognitionException {
        try {
            // InternalLegisFacile.g:154:1: ( ruleEmenta EOF )
            // InternalLegisFacile.g:155:1: ruleEmenta EOF
            {
             before(grammarAccess.getEmentaRule()); 
            pushFollow(FOLLOW_1);
            ruleEmenta();

            state._fsp--;

             after(grammarAccess.getEmentaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmenta"


    // $ANTLR start "ruleEmenta"
    // InternalLegisFacile.g:162:1: ruleEmenta : ( ( rule__Ementa__Group__0 ) ) ;
    public final void ruleEmenta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:166:2: ( ( ( rule__Ementa__Group__0 ) ) )
            // InternalLegisFacile.g:167:2: ( ( rule__Ementa__Group__0 ) )
            {
            // InternalLegisFacile.g:167:2: ( ( rule__Ementa__Group__0 ) )
            // InternalLegisFacile.g:168:3: ( rule__Ementa__Group__0 )
            {
             before(grammarAccess.getEmentaAccess().getGroup()); 
            // InternalLegisFacile.g:169:3: ( rule__Ementa__Group__0 )
            // InternalLegisFacile.g:169:4: rule__Ementa__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ementa__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmentaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmenta"


    // $ANTLR start "entryRulePreambulo"
    // InternalLegisFacile.g:178:1: entryRulePreambulo : rulePreambulo EOF ;
    public final void entryRulePreambulo() throws RecognitionException {
        try {
            // InternalLegisFacile.g:179:1: ( rulePreambulo EOF )
            // InternalLegisFacile.g:180:1: rulePreambulo EOF
            {
             before(grammarAccess.getPreambuloRule()); 
            pushFollow(FOLLOW_1);
            rulePreambulo();

            state._fsp--;

             after(grammarAccess.getPreambuloRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePreambulo"


    // $ANTLR start "rulePreambulo"
    // InternalLegisFacile.g:187:1: rulePreambulo : ( ( rule__Preambulo__Group__0 ) ) ;
    public final void rulePreambulo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:191:2: ( ( ( rule__Preambulo__Group__0 ) ) )
            // InternalLegisFacile.g:192:2: ( ( rule__Preambulo__Group__0 ) )
            {
            // InternalLegisFacile.g:192:2: ( ( rule__Preambulo__Group__0 ) )
            // InternalLegisFacile.g:193:3: ( rule__Preambulo__Group__0 )
            {
             before(grammarAccess.getPreambuloAccess().getGroup()); 
            // InternalLegisFacile.g:194:3: ( rule__Preambulo__Group__0 )
            // InternalLegisFacile.g:194:4: rule__Preambulo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Preambulo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPreambuloAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePreambulo"


    // $ANTLR start "entryRuleNormativa"
    // InternalLegisFacile.g:203:1: entryRuleNormativa : ruleNormativa EOF ;
    public final void entryRuleNormativa() throws RecognitionException {
        try {
            // InternalLegisFacile.g:204:1: ( ruleNormativa EOF )
            // InternalLegisFacile.g:205:1: ruleNormativa EOF
            {
             before(grammarAccess.getNormativaRule()); 
            pushFollow(FOLLOW_1);
            ruleNormativa();

            state._fsp--;

             after(grammarAccess.getNormativaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNormativa"


    // $ANTLR start "ruleNormativa"
    // InternalLegisFacile.g:212:1: ruleNormativa : ( ( rule__Normativa__Group__0 ) ) ;
    public final void ruleNormativa() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:216:2: ( ( ( rule__Normativa__Group__0 ) ) )
            // InternalLegisFacile.g:217:2: ( ( rule__Normativa__Group__0 ) )
            {
            // InternalLegisFacile.g:217:2: ( ( rule__Normativa__Group__0 ) )
            // InternalLegisFacile.g:218:3: ( rule__Normativa__Group__0 )
            {
             before(grammarAccess.getNormativaAccess().getGroup()); 
            // InternalLegisFacile.g:219:3: ( rule__Normativa__Group__0 )
            // InternalLegisFacile.g:219:4: rule__Normativa__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Normativa__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNormativaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNormativa"


    // $ANTLR start "entryRuleArtigo"
    // InternalLegisFacile.g:228:1: entryRuleArtigo : ruleArtigo EOF ;
    public final void entryRuleArtigo() throws RecognitionException {
        try {
            // InternalLegisFacile.g:229:1: ( ruleArtigo EOF )
            // InternalLegisFacile.g:230:1: ruleArtigo EOF
            {
             before(grammarAccess.getArtigoRule()); 
            pushFollow(FOLLOW_1);
            ruleArtigo();

            state._fsp--;

             after(grammarAccess.getArtigoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArtigo"


    // $ANTLR start "ruleArtigo"
    // InternalLegisFacile.g:237:1: ruleArtigo : ( ( rule__Artigo__Group__0 ) ) ;
    public final void ruleArtigo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:241:2: ( ( ( rule__Artigo__Group__0 ) ) )
            // InternalLegisFacile.g:242:2: ( ( rule__Artigo__Group__0 ) )
            {
            // InternalLegisFacile.g:242:2: ( ( rule__Artigo__Group__0 ) )
            // InternalLegisFacile.g:243:3: ( rule__Artigo__Group__0 )
            {
             before(grammarAccess.getArtigoAccess().getGroup()); 
            // InternalLegisFacile.g:244:3: ( rule__Artigo__Group__0 )
            // InternalLegisFacile.g:244:4: rule__Artigo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Artigo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArtigoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArtigo"


    // $ANTLR start "entryRuleCaput"
    // InternalLegisFacile.g:253:1: entryRuleCaput : ruleCaput EOF ;
    public final void entryRuleCaput() throws RecognitionException {
        try {
            // InternalLegisFacile.g:254:1: ( ruleCaput EOF )
            // InternalLegisFacile.g:255:1: ruleCaput EOF
            {
             before(grammarAccess.getCaputRule()); 
            pushFollow(FOLLOW_1);
            ruleCaput();

            state._fsp--;

             after(grammarAccess.getCaputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCaput"


    // $ANTLR start "ruleCaput"
    // InternalLegisFacile.g:262:1: ruleCaput : ( ( rule__Caput__Group__0 ) ) ;
    public final void ruleCaput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:266:2: ( ( ( rule__Caput__Group__0 ) ) )
            // InternalLegisFacile.g:267:2: ( ( rule__Caput__Group__0 ) )
            {
            // InternalLegisFacile.g:267:2: ( ( rule__Caput__Group__0 ) )
            // InternalLegisFacile.g:268:3: ( rule__Caput__Group__0 )
            {
             before(grammarAccess.getCaputAccess().getGroup()); 
            // InternalLegisFacile.g:269:3: ( rule__Caput__Group__0 )
            // InternalLegisFacile.g:269:4: rule__Caput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Caput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCaput"


    // $ANTLR start "entryRuleParagrafo"
    // InternalLegisFacile.g:278:1: entryRuleParagrafo : ruleParagrafo EOF ;
    public final void entryRuleParagrafo() throws RecognitionException {
        try {
            // InternalLegisFacile.g:279:1: ( ruleParagrafo EOF )
            // InternalLegisFacile.g:280:1: ruleParagrafo EOF
            {
             before(grammarAccess.getParagrafoRule()); 
            pushFollow(FOLLOW_1);
            ruleParagrafo();

            state._fsp--;

             after(grammarAccess.getParagrafoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParagrafo"


    // $ANTLR start "ruleParagrafo"
    // InternalLegisFacile.g:287:1: ruleParagrafo : ( ( rule__Paragrafo__Group__0 ) ) ;
    public final void ruleParagrafo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:291:2: ( ( ( rule__Paragrafo__Group__0 ) ) )
            // InternalLegisFacile.g:292:2: ( ( rule__Paragrafo__Group__0 ) )
            {
            // InternalLegisFacile.g:292:2: ( ( rule__Paragrafo__Group__0 ) )
            // InternalLegisFacile.g:293:3: ( rule__Paragrafo__Group__0 )
            {
             before(grammarAccess.getParagrafoAccess().getGroup()); 
            // InternalLegisFacile.g:294:3: ( rule__Paragrafo__Group__0 )
            // InternalLegisFacile.g:294:4: rule__Paragrafo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Paragrafo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParagrafoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParagrafo"


    // $ANTLR start "entryRuleInciso"
    // InternalLegisFacile.g:303:1: entryRuleInciso : ruleInciso EOF ;
    public final void entryRuleInciso() throws RecognitionException {
        try {
            // InternalLegisFacile.g:304:1: ( ruleInciso EOF )
            // InternalLegisFacile.g:305:1: ruleInciso EOF
            {
             before(grammarAccess.getIncisoRule()); 
            pushFollow(FOLLOW_1);
            ruleInciso();

            state._fsp--;

             after(grammarAccess.getIncisoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInciso"


    // $ANTLR start "ruleInciso"
    // InternalLegisFacile.g:312:1: ruleInciso : ( ( rule__Inciso__Group__0 ) ) ;
    public final void ruleInciso() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:316:2: ( ( ( rule__Inciso__Group__0 ) ) )
            // InternalLegisFacile.g:317:2: ( ( rule__Inciso__Group__0 ) )
            {
            // InternalLegisFacile.g:317:2: ( ( rule__Inciso__Group__0 ) )
            // InternalLegisFacile.g:318:3: ( rule__Inciso__Group__0 )
            {
             before(grammarAccess.getIncisoAccess().getGroup()); 
            // InternalLegisFacile.g:319:3: ( rule__Inciso__Group__0 )
            // InternalLegisFacile.g:319:4: rule__Inciso__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inciso__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncisoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInciso"


    // $ANTLR start "entryRuleAlinea"
    // InternalLegisFacile.g:328:1: entryRuleAlinea : ruleAlinea EOF ;
    public final void entryRuleAlinea() throws RecognitionException {
        try {
            // InternalLegisFacile.g:329:1: ( ruleAlinea EOF )
            // InternalLegisFacile.g:330:1: ruleAlinea EOF
            {
             before(grammarAccess.getAlineaRule()); 
            pushFollow(FOLLOW_1);
            ruleAlinea();

            state._fsp--;

             after(grammarAccess.getAlineaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlinea"


    // $ANTLR start "ruleAlinea"
    // InternalLegisFacile.g:337:1: ruleAlinea : ( ( rule__Alinea__Group__0 ) ) ;
    public final void ruleAlinea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:341:2: ( ( ( rule__Alinea__Group__0 ) ) )
            // InternalLegisFacile.g:342:2: ( ( rule__Alinea__Group__0 ) )
            {
            // InternalLegisFacile.g:342:2: ( ( rule__Alinea__Group__0 ) )
            // InternalLegisFacile.g:343:3: ( rule__Alinea__Group__0 )
            {
             before(grammarAccess.getAlineaAccess().getGroup()); 
            // InternalLegisFacile.g:344:3: ( rule__Alinea__Group__0 )
            // InternalLegisFacile.g:344:4: rule__Alinea__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alinea__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlineaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlinea"


    // $ANTLR start "entryRuleItem"
    // InternalLegisFacile.g:353:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalLegisFacile.g:354:1: ( ruleItem EOF )
            // InternalLegisFacile.g:355:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalLegisFacile.g:362:1: ruleItem : ( ( rule__Item__Group__0 ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:366:2: ( ( ( rule__Item__Group__0 ) ) )
            // InternalLegisFacile.g:367:2: ( ( rule__Item__Group__0 ) )
            {
            // InternalLegisFacile.g:367:2: ( ( rule__Item__Group__0 ) )
            // InternalLegisFacile.g:368:3: ( rule__Item__Group__0 )
            {
             before(grammarAccess.getItemAccess().getGroup()); 
            // InternalLegisFacile.g:369:3: ( rule__Item__Group__0 )
            // InternalLegisFacile.g:369:4: rule__Item__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleFinal"
    // InternalLegisFacile.g:378:1: entryRuleFinal : ruleFinal EOF ;
    public final void entryRuleFinal() throws RecognitionException {
        try {
            // InternalLegisFacile.g:379:1: ( ruleFinal EOF )
            // InternalLegisFacile.g:380:1: ruleFinal EOF
            {
             before(grammarAccess.getFinalRule()); 
            pushFollow(FOLLOW_1);
            ruleFinal();

            state._fsp--;

             after(grammarAccess.getFinalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // InternalLegisFacile.g:387:1: ruleFinal : ( ( rule__Final__Group__0 ) ) ;
    public final void ruleFinal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:391:2: ( ( ( rule__Final__Group__0 ) ) )
            // InternalLegisFacile.g:392:2: ( ( rule__Final__Group__0 ) )
            {
            // InternalLegisFacile.g:392:2: ( ( rule__Final__Group__0 ) )
            // InternalLegisFacile.g:393:3: ( rule__Final__Group__0 )
            {
             before(grammarAccess.getFinalAccess().getGroup()); 
            // InternalLegisFacile.g:394:3: ( rule__Final__Group__0 )
            // InternalLegisFacile.g:394:4: rule__Final__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFinal"


    // $ANTLR start "entryRuleDataType"
    // InternalLegisFacile.g:403:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalLegisFacile.g:404:1: ( ruleDataType EOF )
            // InternalLegisFacile.g:405:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalLegisFacile.g:412:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:416:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalLegisFacile.g:417:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalLegisFacile.g:417:2: ( ( rule__DataType__Group__0 ) )
            // InternalLegisFacile.g:418:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalLegisFacile.g:419:3: ( rule__DataType__Group__0 )
            // InternalLegisFacile.g:419:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // InternalLegisFacile.g:428:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalLegisFacile.g:429:1: ( ruleEntity EOF )
            // InternalLegisFacile.g:430:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalLegisFacile.g:437:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:441:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalLegisFacile.g:442:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalLegisFacile.g:442:2: ( ( rule__Entity__Group__0 ) )
            // InternalLegisFacile.g:443:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalLegisFacile.g:444:3: ( rule__Entity__Group__0 )
            // InternalLegisFacile.g:444:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalLegisFacile.g:453:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalLegisFacile.g:454:1: ( ruleFeature EOF )
            // InternalLegisFacile.g:455:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalLegisFacile.g:462:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:466:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalLegisFacile.g:467:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalLegisFacile.g:467:2: ( ( rule__Feature__Group__0 ) )
            // InternalLegisFacile.g:468:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalLegisFacile.g:469:3: ( rule__Feature__Group__0 )
            // InternalLegisFacile.g:469:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalLegisFacile.g:477:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) | ( ( rule__Type__Group_2__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:481:1: ( ( ruleDataType ) | ( ruleEntity ) | ( ( rule__Type__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt2=1;
                }
                break;
            case 41:
                {
                alt2=2;
                }
                break;
            case 11:
            case 12:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLegisFacile.g:482:2: ( ruleDataType )
                    {
                    // InternalLegisFacile.g:482:2: ( ruleDataType )
                    // InternalLegisFacile.g:483:3: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:488:2: ( ruleEntity )
                    {
                    // InternalLegisFacile.g:488:2: ( ruleEntity )
                    // InternalLegisFacile.g:489:3: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLegisFacile.g:494:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalLegisFacile.g:494:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalLegisFacile.g:495:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalLegisFacile.g:496:3: ( rule__Type__Group_2__0 )
                    // InternalLegisFacile.g:496:4: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Preliminar__Alternatives_0"
    // InternalLegisFacile.g:504:1: rule__Preliminar__Alternatives_0 : ( ( 'Preliminar' ) | ( 'preliminar' ) );
    public final void rule__Preliminar__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:508:1: ( ( 'Preliminar' ) | ( 'preliminar' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLegisFacile.g:509:2: ( 'Preliminar' )
                    {
                    // InternalLegisFacile.g:509:2: ( 'Preliminar' )
                    // InternalLegisFacile.g:510:3: 'Preliminar'
                    {
                     before(grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:515:2: ( 'preliminar' )
                    {
                    // InternalLegisFacile.g:515:2: ( 'preliminar' )
                    // InternalLegisFacile.g:516:3: 'preliminar'
                    {
                     before(grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Alternatives_0"


    // $ANTLR start "rule__Epigrafe__Alternatives_0"
    // InternalLegisFacile.g:525:1: rule__Epigrafe__Alternatives_0 : ( ( 'Epigrafe' ) | ( 'epigrafe' ) );
    public final void rule__Epigrafe__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:529:1: ( ( 'Epigrafe' ) | ( 'epigrafe' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLegisFacile.g:530:2: ( 'Epigrafe' )
                    {
                    // InternalLegisFacile.g:530:2: ( 'Epigrafe' )
                    // InternalLegisFacile.g:531:3: 'Epigrafe'
                    {
                     before(grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:536:2: ( 'epigrafe' )
                    {
                    // InternalLegisFacile.g:536:2: ( 'epigrafe' )
                    // InternalLegisFacile.g:537:3: 'epigrafe'
                    {
                     before(grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Alternatives_0"


    // $ANTLR start "rule__Ementa__Alternatives_0"
    // InternalLegisFacile.g:546:1: rule__Ementa__Alternatives_0 : ( ( 'Ementa' ) | ( 'ementa' ) );
    public final void rule__Ementa__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:550:1: ( ( 'Ementa' ) | ( 'ementa' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLegisFacile.g:551:2: ( 'Ementa' )
                    {
                    // InternalLegisFacile.g:551:2: ( 'Ementa' )
                    // InternalLegisFacile.g:552:3: 'Ementa'
                    {
                     before(grammarAccess.getEmentaAccess().getEmentaKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEmentaAccess().getEmentaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:557:2: ( 'ementa' )
                    {
                    // InternalLegisFacile.g:557:2: ( 'ementa' )
                    // InternalLegisFacile.g:558:3: 'ementa'
                    {
                     before(grammarAccess.getEmentaAccess().getEmentaKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEmentaAccess().getEmentaKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ementa__Alternatives_0"


    // $ANTLR start "rule__Preambulo__Alternatives_0"
    // InternalLegisFacile.g:567:1: rule__Preambulo__Alternatives_0 : ( ( 'Preambulo' ) | ( 'preambulo' ) );
    public final void rule__Preambulo__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:571:1: ( ( 'Preambulo' ) | ( 'preambulo' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLegisFacile.g:572:2: ( 'Preambulo' )
                    {
                    // InternalLegisFacile.g:572:2: ( 'Preambulo' )
                    // InternalLegisFacile.g:573:3: 'Preambulo'
                    {
                     before(grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:578:2: ( 'preambulo' )
                    {
                    // InternalLegisFacile.g:578:2: ( 'preambulo' )
                    // InternalLegisFacile.g:579:3: 'preambulo'
                    {
                     before(grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preambulo__Alternatives_0"


    // $ANTLR start "rule__Normativa__Alternatives_0"
    // InternalLegisFacile.g:588:1: rule__Normativa__Alternatives_0 : ( ( 'Normativa' ) | ( 'normativa' ) );
    public final void rule__Normativa__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:592:1: ( ( 'Normativa' ) | ( 'normativa' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLegisFacile.g:593:2: ( 'Normativa' )
                    {
                    // InternalLegisFacile.g:593:2: ( 'Normativa' )
                    // InternalLegisFacile.g:594:3: 'Normativa'
                    {
                     before(grammarAccess.getNormativaAccess().getNormativaKeyword_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getNormativaAccess().getNormativaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:599:2: ( 'normativa' )
                    {
                    // InternalLegisFacile.g:599:2: ( 'normativa' )
                    // InternalLegisFacile.g:600:3: 'normativa'
                    {
                     before(grammarAccess.getNormativaAccess().getNormativaKeyword_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getNormativaAccess().getNormativaKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normativa__Alternatives_0"


    // $ANTLR start "rule__Artigo__Alternatives_0"
    // InternalLegisFacile.g:609:1: rule__Artigo__Alternatives_0 : ( ( 'Artigo' ) | ( 'artigo' ) );
    public final void rule__Artigo__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:613:1: ( ( 'Artigo' ) | ( 'artigo' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLegisFacile.g:614:2: ( 'Artigo' )
                    {
                    // InternalLegisFacile.g:614:2: ( 'Artigo' )
                    // InternalLegisFacile.g:615:3: 'Artigo'
                    {
                     before(grammarAccess.getArtigoAccess().getArtigoKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getArtigoAccess().getArtigoKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:620:2: ( 'artigo' )
                    {
                    // InternalLegisFacile.g:620:2: ( 'artigo' )
                    // InternalLegisFacile.g:621:3: 'artigo'
                    {
                     before(grammarAccess.getArtigoAccess().getArtigoKeyword_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getArtigoAccess().getArtigoKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Alternatives_0"


    // $ANTLR start "rule__Caput__Alternatives_0"
    // InternalLegisFacile.g:630:1: rule__Caput__Alternatives_0 : ( ( 'Caput' ) | ( 'caput' ) );
    public final void rule__Caput__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:634:1: ( ( 'Caput' ) | ( 'caput' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLegisFacile.g:635:2: ( 'Caput' )
                    {
                    // InternalLegisFacile.g:635:2: ( 'Caput' )
                    // InternalLegisFacile.g:636:3: 'Caput'
                    {
                     before(grammarAccess.getCaputAccess().getCaputKeyword_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getCaputAccess().getCaputKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:641:2: ( 'caput' )
                    {
                    // InternalLegisFacile.g:641:2: ( 'caput' )
                    // InternalLegisFacile.g:642:3: 'caput'
                    {
                     before(grammarAccess.getCaputAccess().getCaputKeyword_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getCaputAccess().getCaputKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Alternatives_0"


    // $ANTLR start "rule__Paragrafo__Alternatives_0"
    // InternalLegisFacile.g:651:1: rule__Paragrafo__Alternatives_0 : ( ( 'Paragrafo' ) | ( 'paragrafo' ) );
    public final void rule__Paragrafo__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:655:1: ( ( 'Paragrafo' ) | ( 'paragrafo' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalLegisFacile.g:656:2: ( 'Paragrafo' )
                    {
                    // InternalLegisFacile.g:656:2: ( 'Paragrafo' )
                    // InternalLegisFacile.g:657:3: 'Paragrafo'
                    {
                     before(grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:662:2: ( 'paragrafo' )
                    {
                    // InternalLegisFacile.g:662:2: ( 'paragrafo' )
                    // InternalLegisFacile.g:663:3: 'paragrafo'
                    {
                     before(grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Alternatives_0"


    // $ANTLR start "rule__Inciso__Alternatives_0"
    // InternalLegisFacile.g:672:1: rule__Inciso__Alternatives_0 : ( ( 'Inciso' ) | ( 'inciso' ) );
    public final void rule__Inciso__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:676:1: ( ( 'Inciso' ) | ( 'inciso' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            else if ( (LA11_0==28) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalLegisFacile.g:677:2: ( 'Inciso' )
                    {
                    // InternalLegisFacile.g:677:2: ( 'Inciso' )
                    // InternalLegisFacile.g:678:3: 'Inciso'
                    {
                     before(grammarAccess.getIncisoAccess().getIncisoKeyword_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getIncisoAccess().getIncisoKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:683:2: ( 'inciso' )
                    {
                    // InternalLegisFacile.g:683:2: ( 'inciso' )
                    // InternalLegisFacile.g:684:3: 'inciso'
                    {
                     before(grammarAccess.getIncisoAccess().getIncisoKeyword_0_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getIncisoAccess().getIncisoKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Alternatives_0"


    // $ANTLR start "rule__Alinea__Alternatives_0"
    // InternalLegisFacile.g:693:1: rule__Alinea__Alternatives_0 : ( ( 'alinea' ) | ( 'Alinea' ) );
    public final void rule__Alinea__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:697:1: ( ( 'alinea' ) | ( 'Alinea' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            else if ( (LA12_0==30) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLegisFacile.g:698:2: ( 'alinea' )
                    {
                    // InternalLegisFacile.g:698:2: ( 'alinea' )
                    // InternalLegisFacile.g:699:3: 'alinea'
                    {
                     before(grammarAccess.getAlineaAccess().getAlineaKeyword_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getAlineaAccess().getAlineaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:704:2: ( 'Alinea' )
                    {
                    // InternalLegisFacile.g:704:2: ( 'Alinea' )
                    // InternalLegisFacile.g:705:3: 'Alinea'
                    {
                     before(grammarAccess.getAlineaAccess().getAlineaKeyword_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getAlineaAccess().getAlineaKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Alternatives_0"


    // $ANTLR start "rule__Item__Alternatives_0"
    // InternalLegisFacile.g:714:1: rule__Item__Alternatives_0 : ( ( 'Item' ) | ( 'item' ) );
    public final void rule__Item__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:718:1: ( ( 'Item' ) | ( 'item' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            else if ( (LA13_0==32) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalLegisFacile.g:719:2: ( 'Item' )
                    {
                    // InternalLegisFacile.g:719:2: ( 'Item' )
                    // InternalLegisFacile.g:720:3: 'Item'
                    {
                     before(grammarAccess.getItemAccess().getItemKeyword_0_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getItemAccess().getItemKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:725:2: ( 'item' )
                    {
                    // InternalLegisFacile.g:725:2: ( 'item' )
                    // InternalLegisFacile.g:726:3: 'item'
                    {
                     before(grammarAccess.getItemAccess().getItemKeyword_0_1()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getItemAccess().getItemKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Alternatives_0"


    // $ANTLR start "rule__Final__Alternatives_0"
    // InternalLegisFacile.g:735:1: rule__Final__Alternatives_0 : ( ( 'Final' ) | ( 'final' ) );
    public final void rule__Final__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:739:1: ( ( 'Final' ) | ( 'final' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalLegisFacile.g:740:2: ( 'Final' )
                    {
                    // InternalLegisFacile.g:740:2: ( 'Final' )
                    // InternalLegisFacile.g:741:3: 'Final'
                    {
                     before(grammarAccess.getFinalAccess().getFinalKeyword_0_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getFinalAccess().getFinalKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:746:2: ( 'final' )
                    {
                    // InternalLegisFacile.g:746:2: ( 'final' )
                    // InternalLegisFacile.g:747:3: 'final'
                    {
                     before(grammarAccess.getFinalAccess().getFinalKeyword_0_1()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getFinalAccess().getFinalKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Alternatives_0"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalLegisFacile.g:756:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:760:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalLegisFacile.g:761:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Type__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalLegisFacile.g:768:1: rule__Type__Group_2__0__Impl : ( ( rule__Type__PreliminarAssignment_2_0 ) ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:772:1: ( ( ( rule__Type__PreliminarAssignment_2_0 ) ) )
            // InternalLegisFacile.g:773:1: ( ( rule__Type__PreliminarAssignment_2_0 ) )
            {
            // InternalLegisFacile.g:773:1: ( ( rule__Type__PreliminarAssignment_2_0 ) )
            // InternalLegisFacile.g:774:2: ( rule__Type__PreliminarAssignment_2_0 )
            {
             before(grammarAccess.getTypeAccess().getPreliminarAssignment_2_0()); 
            // InternalLegisFacile.g:775:2: ( rule__Type__PreliminarAssignment_2_0 )
            // InternalLegisFacile.g:775:3: rule__Type__PreliminarAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__PreliminarAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getPreliminarAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalLegisFacile.g:783:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:787:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalLegisFacile.g:788:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__Type__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalLegisFacile.g:795:1: rule__Type__Group_2__1__Impl : ( ( rule__Type__NormativaAssignment_2_1 ) ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:799:1: ( ( ( rule__Type__NormativaAssignment_2_1 ) ) )
            // InternalLegisFacile.g:800:1: ( ( rule__Type__NormativaAssignment_2_1 ) )
            {
            // InternalLegisFacile.g:800:1: ( ( rule__Type__NormativaAssignment_2_1 ) )
            // InternalLegisFacile.g:801:2: ( rule__Type__NormativaAssignment_2_1 )
            {
             before(grammarAccess.getTypeAccess().getNormativaAssignment_2_1()); 
            // InternalLegisFacile.g:802:2: ( rule__Type__NormativaAssignment_2_1 )
            // InternalLegisFacile.g:802:3: rule__Type__NormativaAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__NormativaAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNormativaAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group_2__2"
    // InternalLegisFacile.g:810:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:814:1: ( rule__Type__Group_2__2__Impl )
            // InternalLegisFacile.g:815:2: rule__Type__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2"


    // $ANTLR start "rule__Type__Group_2__2__Impl"
    // InternalLegisFacile.g:821:1: rule__Type__Group_2__2__Impl : ( ( rule__Type__FinalAssignment_2_2 ) ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:825:1: ( ( ( rule__Type__FinalAssignment_2_2 ) ) )
            // InternalLegisFacile.g:826:1: ( ( rule__Type__FinalAssignment_2_2 ) )
            {
            // InternalLegisFacile.g:826:1: ( ( rule__Type__FinalAssignment_2_2 ) )
            // InternalLegisFacile.g:827:2: ( rule__Type__FinalAssignment_2_2 )
            {
             before(grammarAccess.getTypeAccess().getFinalAssignment_2_2()); 
            // InternalLegisFacile.g:828:2: ( rule__Type__FinalAssignment_2_2 )
            // InternalLegisFacile.g:828:3: rule__Type__FinalAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Type__FinalAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getFinalAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2__Impl"


    // $ANTLR start "rule__Preliminar__Group__0"
    // InternalLegisFacile.g:837:1: rule__Preliminar__Group__0 : rule__Preliminar__Group__0__Impl rule__Preliminar__Group__1 ;
    public final void rule__Preliminar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:841:1: ( rule__Preliminar__Group__0__Impl rule__Preliminar__Group__1 )
            // InternalLegisFacile.g:842:2: rule__Preliminar__Group__0__Impl rule__Preliminar__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Preliminar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preliminar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__0"


    // $ANTLR start "rule__Preliminar__Group__0__Impl"
    // InternalLegisFacile.g:849:1: rule__Preliminar__Group__0__Impl : ( ( rule__Preliminar__Alternatives_0 ) ) ;
    public final void rule__Preliminar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:853:1: ( ( ( rule__Preliminar__Alternatives_0 ) ) )
            // InternalLegisFacile.g:854:1: ( ( rule__Preliminar__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:854:1: ( ( rule__Preliminar__Alternatives_0 ) )
            // InternalLegisFacile.g:855:2: ( rule__Preliminar__Alternatives_0 )
            {
             before(grammarAccess.getPreliminarAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:856:2: ( rule__Preliminar__Alternatives_0 )
            // InternalLegisFacile.g:856:3: rule__Preliminar__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Preliminar__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPreliminarAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__0__Impl"


    // $ANTLR start "rule__Preliminar__Group__1"
    // InternalLegisFacile.g:864:1: rule__Preliminar__Group__1 : rule__Preliminar__Group__1__Impl rule__Preliminar__Group__2 ;
    public final void rule__Preliminar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:868:1: ( rule__Preliminar__Group__1__Impl rule__Preliminar__Group__2 )
            // InternalLegisFacile.g:869:2: rule__Preliminar__Group__1__Impl rule__Preliminar__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Preliminar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preliminar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__1"


    // $ANTLR start "rule__Preliminar__Group__1__Impl"
    // InternalLegisFacile.g:876:1: rule__Preliminar__Group__1__Impl : ( '{' ) ;
    public final void rule__Preliminar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:880:1: ( ( '{' ) )
            // InternalLegisFacile.g:881:1: ( '{' )
            {
            // InternalLegisFacile.g:881:1: ( '{' )
            // InternalLegisFacile.g:882:2: '{'
            {
             before(grammarAccess.getPreliminarAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPreliminarAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__1__Impl"


    // $ANTLR start "rule__Preliminar__Group__2"
    // InternalLegisFacile.g:891:1: rule__Preliminar__Group__2 : rule__Preliminar__Group__2__Impl rule__Preliminar__Group__3 ;
    public final void rule__Preliminar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:895:1: ( rule__Preliminar__Group__2__Impl rule__Preliminar__Group__3 )
            // InternalLegisFacile.g:896:2: rule__Preliminar__Group__2__Impl rule__Preliminar__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Preliminar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preliminar__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__2"


    // $ANTLR start "rule__Preliminar__Group__2__Impl"
    // InternalLegisFacile.g:903:1: rule__Preliminar__Group__2__Impl : ( ( rule__Preliminar__EpigrageAssignment_2 ) ) ;
    public final void rule__Preliminar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:907:1: ( ( ( rule__Preliminar__EpigrageAssignment_2 ) ) )
            // InternalLegisFacile.g:908:1: ( ( rule__Preliminar__EpigrageAssignment_2 ) )
            {
            // InternalLegisFacile.g:908:1: ( ( rule__Preliminar__EpigrageAssignment_2 ) )
            // InternalLegisFacile.g:909:2: ( rule__Preliminar__EpigrageAssignment_2 )
            {
             before(grammarAccess.getPreliminarAccess().getEpigrageAssignment_2()); 
            // InternalLegisFacile.g:910:2: ( rule__Preliminar__EpigrageAssignment_2 )
            // InternalLegisFacile.g:910:3: rule__Preliminar__EpigrageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Preliminar__EpigrageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPreliminarAccess().getEpigrageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__2__Impl"


    // $ANTLR start "rule__Preliminar__Group__3"
    // InternalLegisFacile.g:918:1: rule__Preliminar__Group__3 : rule__Preliminar__Group__3__Impl rule__Preliminar__Group__4 ;
    public final void rule__Preliminar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:922:1: ( rule__Preliminar__Group__3__Impl rule__Preliminar__Group__4 )
            // InternalLegisFacile.g:923:2: rule__Preliminar__Group__3__Impl rule__Preliminar__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Preliminar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preliminar__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__3"


    // $ANTLR start "rule__Preliminar__Group__3__Impl"
    // InternalLegisFacile.g:930:1: rule__Preliminar__Group__3__Impl : ( ',' ) ;
    public final void rule__Preliminar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:934:1: ( ( ',' ) )
            // InternalLegisFacile.g:935:1: ( ',' )
            {
            // InternalLegisFacile.g:935:1: ( ',' )
            // InternalLegisFacile.g:936:2: ','
            {
             before(grammarAccess.getPreliminarAccess().getCommaKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPreliminarAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__3__Impl"


    // $ANTLR start "rule__Preliminar__Group__4"
    // InternalLegisFacile.g:945:1: rule__Preliminar__Group__4 : rule__Preliminar__Group__4__Impl rule__Preliminar__Group__5 ;
    public final void rule__Preliminar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:949:1: ( rule__Preliminar__Group__4__Impl rule__Preliminar__Group__5 )
            // InternalLegisFacile.g:950:2: rule__Preliminar__Group__4__Impl rule__Preliminar__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Preliminar__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preliminar__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__4"


    // $ANTLR start "rule__Preliminar__Group__4__Impl"
    // InternalLegisFacile.g:957:1: rule__Preliminar__Group__4__Impl : ( ( rule__Preliminar__EmentaAssignment_4 ) ) ;
    public final void rule__Preliminar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:961:1: ( ( ( rule__Preliminar__EmentaAssignment_4 ) ) )
            // InternalLegisFacile.g:962:1: ( ( rule__Preliminar__EmentaAssignment_4 ) )
            {
            // InternalLegisFacile.g:962:1: ( ( rule__Preliminar__EmentaAssignment_4 ) )
            // InternalLegisFacile.g:963:2: ( rule__Preliminar__EmentaAssignment_4 )
            {
             before(grammarAccess.getPreliminarAccess().getEmentaAssignment_4()); 
            // InternalLegisFacile.g:964:2: ( rule__Preliminar__EmentaAssignment_4 )
            // InternalLegisFacile.g:964:3: rule__Preliminar__EmentaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Preliminar__EmentaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPreliminarAccess().getEmentaAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__4__Impl"


    // $ANTLR start "rule__Preliminar__Group__5"
    // InternalLegisFacile.g:972:1: rule__Preliminar__Group__5 : rule__Preliminar__Group__5__Impl rule__Preliminar__Group__6 ;
    public final void rule__Preliminar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:976:1: ( rule__Preliminar__Group__5__Impl rule__Preliminar__Group__6 )
            // InternalLegisFacile.g:977:2: rule__Preliminar__Group__5__Impl rule__Preliminar__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Preliminar__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preliminar__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__5"


    // $ANTLR start "rule__Preliminar__Group__5__Impl"
    // InternalLegisFacile.g:984:1: rule__Preliminar__Group__5__Impl : ( ',' ) ;
    public final void rule__Preliminar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:988:1: ( ( ',' ) )
            // InternalLegisFacile.g:989:1: ( ',' )
            {
            // InternalLegisFacile.g:989:1: ( ',' )
            // InternalLegisFacile.g:990:2: ','
            {
             before(grammarAccess.getPreliminarAccess().getCommaKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPreliminarAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__5__Impl"


    // $ANTLR start "rule__Preliminar__Group__6"
    // InternalLegisFacile.g:999:1: rule__Preliminar__Group__6 : rule__Preliminar__Group__6__Impl rule__Preliminar__Group__7 ;
    public final void rule__Preliminar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1003:1: ( rule__Preliminar__Group__6__Impl rule__Preliminar__Group__7 )
            // InternalLegisFacile.g:1004:2: rule__Preliminar__Group__6__Impl rule__Preliminar__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Preliminar__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preliminar__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__6"


    // $ANTLR start "rule__Preliminar__Group__6__Impl"
    // InternalLegisFacile.g:1011:1: rule__Preliminar__Group__6__Impl : ( ( rule__Preliminar__PreambuloAssignment_6 ) ) ;
    public final void rule__Preliminar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1015:1: ( ( ( rule__Preliminar__PreambuloAssignment_6 ) ) )
            // InternalLegisFacile.g:1016:1: ( ( rule__Preliminar__PreambuloAssignment_6 ) )
            {
            // InternalLegisFacile.g:1016:1: ( ( rule__Preliminar__PreambuloAssignment_6 ) )
            // InternalLegisFacile.g:1017:2: ( rule__Preliminar__PreambuloAssignment_6 )
            {
             before(grammarAccess.getPreliminarAccess().getPreambuloAssignment_6()); 
            // InternalLegisFacile.g:1018:2: ( rule__Preliminar__PreambuloAssignment_6 )
            // InternalLegisFacile.g:1018:3: rule__Preliminar__PreambuloAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Preliminar__PreambuloAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPreliminarAccess().getPreambuloAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__6__Impl"


    // $ANTLR start "rule__Preliminar__Group__7"
    // InternalLegisFacile.g:1026:1: rule__Preliminar__Group__7 : rule__Preliminar__Group__7__Impl rule__Preliminar__Group__8 ;
    public final void rule__Preliminar__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1030:1: ( rule__Preliminar__Group__7__Impl rule__Preliminar__Group__8 )
            // InternalLegisFacile.g:1031:2: rule__Preliminar__Group__7__Impl rule__Preliminar__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Preliminar__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preliminar__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__7"


    // $ANTLR start "rule__Preliminar__Group__7__Impl"
    // InternalLegisFacile.g:1038:1: rule__Preliminar__Group__7__Impl : ( ',' ) ;
    public final void rule__Preliminar__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1042:1: ( ( ',' ) )
            // InternalLegisFacile.g:1043:1: ( ',' )
            {
            // InternalLegisFacile.g:1043:1: ( ',' )
            // InternalLegisFacile.g:1044:2: ','
            {
             before(grammarAccess.getPreliminarAccess().getCommaKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPreliminarAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__7__Impl"


    // $ANTLR start "rule__Preliminar__Group__8"
    // InternalLegisFacile.g:1053:1: rule__Preliminar__Group__8 : rule__Preliminar__Group__8__Impl ;
    public final void rule__Preliminar__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1057:1: ( rule__Preliminar__Group__8__Impl )
            // InternalLegisFacile.g:1058:2: rule__Preliminar__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Preliminar__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__8"


    // $ANTLR start "rule__Preliminar__Group__8__Impl"
    // InternalLegisFacile.g:1064:1: rule__Preliminar__Group__8__Impl : ( '}' ) ;
    public final void rule__Preliminar__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1068:1: ( ( '}' ) )
            // InternalLegisFacile.g:1069:1: ( '}' )
            {
            // InternalLegisFacile.g:1069:1: ( '}' )
            // InternalLegisFacile.g:1070:2: '}'
            {
             before(grammarAccess.getPreliminarAccess().getRightCurlyBracketKeyword_8()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPreliminarAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__Group__8__Impl"


    // $ANTLR start "rule__Epigrafe__Group__0"
    // InternalLegisFacile.g:1080:1: rule__Epigrafe__Group__0 : rule__Epigrafe__Group__0__Impl rule__Epigrafe__Group__1 ;
    public final void rule__Epigrafe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1084:1: ( rule__Epigrafe__Group__0__Impl rule__Epigrafe__Group__1 )
            // InternalLegisFacile.g:1085:2: rule__Epigrafe__Group__0__Impl rule__Epigrafe__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Epigrafe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Epigrafe__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Group__0"


    // $ANTLR start "rule__Epigrafe__Group__0__Impl"
    // InternalLegisFacile.g:1092:1: rule__Epigrafe__Group__0__Impl : ( ( rule__Epigrafe__Alternatives_0 ) ) ;
    public final void rule__Epigrafe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1096:1: ( ( ( rule__Epigrafe__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1097:1: ( ( rule__Epigrafe__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1097:1: ( ( rule__Epigrafe__Alternatives_0 ) )
            // InternalLegisFacile.g:1098:2: ( rule__Epigrafe__Alternatives_0 )
            {
             before(grammarAccess.getEpigrafeAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1099:2: ( rule__Epigrafe__Alternatives_0 )
            // InternalLegisFacile.g:1099:3: rule__Epigrafe__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Epigrafe__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getEpigrafeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Group__0__Impl"


    // $ANTLR start "rule__Epigrafe__Group__1"
    // InternalLegisFacile.g:1107:1: rule__Epigrafe__Group__1 : rule__Epigrafe__Group__1__Impl rule__Epigrafe__Group__2 ;
    public final void rule__Epigrafe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1111:1: ( rule__Epigrafe__Group__1__Impl rule__Epigrafe__Group__2 )
            // InternalLegisFacile.g:1112:2: rule__Epigrafe__Group__1__Impl rule__Epigrafe__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Epigrafe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Epigrafe__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Group__1"


    // $ANTLR start "rule__Epigrafe__Group__1__Impl"
    // InternalLegisFacile.g:1119:1: rule__Epigrafe__Group__1__Impl : ( '(' ) ;
    public final void rule__Epigrafe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1123:1: ( ( '(' ) )
            // InternalLegisFacile.g:1124:1: ( '(' )
            {
            // InternalLegisFacile.g:1124:1: ( '(' )
            // InternalLegisFacile.g:1125:2: '('
            {
             before(grammarAccess.getEpigrafeAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEpigrafeAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Group__1__Impl"


    // $ANTLR start "rule__Epigrafe__Group__2"
    // InternalLegisFacile.g:1134:1: rule__Epigrafe__Group__2 : rule__Epigrafe__Group__2__Impl rule__Epigrafe__Group__3 ;
    public final void rule__Epigrafe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1138:1: ( rule__Epigrafe__Group__2__Impl rule__Epigrafe__Group__3 )
            // InternalLegisFacile.g:1139:2: rule__Epigrafe__Group__2__Impl rule__Epigrafe__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Epigrafe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Epigrafe__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Group__2"


    // $ANTLR start "rule__Epigrafe__Group__2__Impl"
    // InternalLegisFacile.g:1146:1: rule__Epigrafe__Group__2__Impl : ( ( rule__Epigrafe__AtoAssignment_2 ) ) ;
    public final void rule__Epigrafe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1150:1: ( ( ( rule__Epigrafe__AtoAssignment_2 ) ) )
            // InternalLegisFacile.g:1151:1: ( ( rule__Epigrafe__AtoAssignment_2 ) )
            {
            // InternalLegisFacile.g:1151:1: ( ( rule__Epigrafe__AtoAssignment_2 ) )
            // InternalLegisFacile.g:1152:2: ( rule__Epigrafe__AtoAssignment_2 )
            {
             before(grammarAccess.getEpigrafeAccess().getAtoAssignment_2()); 
            // InternalLegisFacile.g:1153:2: ( rule__Epigrafe__AtoAssignment_2 )
            // InternalLegisFacile.g:1153:3: rule__Epigrafe__AtoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Epigrafe__AtoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEpigrafeAccess().getAtoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Group__2__Impl"


    // $ANTLR start "rule__Epigrafe__Group__3"
    // InternalLegisFacile.g:1161:1: rule__Epigrafe__Group__3 : rule__Epigrafe__Group__3__Impl rule__Epigrafe__Group__4 ;
    public final void rule__Epigrafe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1165:1: ( rule__Epigrafe__Group__3__Impl rule__Epigrafe__Group__4 )
            // InternalLegisFacile.g:1166:2: rule__Epigrafe__Group__3__Impl rule__Epigrafe__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Epigrafe__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Epigrafe__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Group__3"


    // $ANTLR start "rule__Epigrafe__Group__3__Impl"
    // InternalLegisFacile.g:1173:1: rule__Epigrafe__Group__3__Impl : ( ',' ) ;
    public final void rule__Epigrafe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1177:1: ( ( ',' ) )
            // InternalLegisFacile.g:1178:1: ( ',' )
            {
            // InternalLegisFacile.g:1178:1: ( ',' )
            // InternalLegisFacile.g:1179:2: ','
            {
             before(grammarAccess.getEpigrafeAccess().getCommaKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEpigrafeAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Group__3__Impl"


    // $ANTLR start "rule__Epigrafe__Group__4"
    // InternalLegisFacile.g:1188:1: rule__Epigrafe__Group__4 : rule__Epigrafe__Group__4__Impl rule__Epigrafe__Group__5 ;
    public final void rule__Epigrafe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1192:1: ( rule__Epigrafe__Group__4__Impl rule__Epigrafe__Group__5 )
            // InternalLegisFacile.g:1193:2: rule__Epigrafe__Group__4__Impl rule__Epigrafe__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Epigrafe__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Epigrafe__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Group__4"


    // $ANTLR start "rule__Epigrafe__Group__4__Impl"
    // InternalLegisFacile.g:1200:1: rule__Epigrafe__Group__4__Impl : ( ( rule__Epigrafe__NumeroAssignment_4 ) ) ;
    public final void rule__Epigrafe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1204:1: ( ( ( rule__Epigrafe__NumeroAssignment_4 ) ) )
            // InternalLegisFacile.g:1205:1: ( ( rule__Epigrafe__NumeroAssignment_4 ) )
            {
            // InternalLegisFacile.g:1205:1: ( ( rule__Epigrafe__NumeroAssignment_4 ) )
            // InternalLegisFacile.g:1206:2: ( rule__Epigrafe__NumeroAssignment_4 )
            {
             before(grammarAccess.getEpigrafeAccess().getNumeroAssignment_4()); 
            // InternalLegisFacile.g:1207:2: ( rule__Epigrafe__NumeroAssignment_4 )
            // InternalLegisFacile.g:1207:3: rule__Epigrafe__NumeroAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Epigrafe__NumeroAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEpigrafeAccess().getNumeroAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Group__4__Impl"


    // $ANTLR start "rule__Epigrafe__Group__5"
    // InternalLegisFacile.g:1215:1: rule__Epigrafe__Group__5 : rule__Epigrafe__Group__5__Impl rule__Epigrafe__Group__6 ;
    public final void rule__Epigrafe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1219:1: ( rule__Epigrafe__Group__5__Impl rule__Epigrafe__Group__6 )
            // InternalLegisFacile.g:1220:2: rule__Epigrafe__Group__5__Impl rule__Epigrafe__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Epigrafe__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Epigrafe__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Group__5"


    // $ANTLR start "rule__Epigrafe__Group__5__Impl"
    // InternalLegisFacile.g:1227:1: rule__Epigrafe__Group__5__Impl : ( ',' ) ;
    public final void rule__Epigrafe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1231:1: ( ( ',' ) )
            // InternalLegisFacile.g:1232:1: ( ',' )
            {
            // InternalLegisFacile.g:1232:1: ( ',' )
            // InternalLegisFacile.g:1233:2: ','
            {
             before(grammarAccess.getEpigrafeAccess().getCommaKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEpigrafeAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Group__5__Impl"


    // $ANTLR start "rule__Epigrafe__Group__6"
    // InternalLegisFacile.g:1242:1: rule__Epigrafe__Group__6 : rule__Epigrafe__Group__6__Impl rule__Epigrafe__Group__7 ;
    public final void rule__Epigrafe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1246:1: ( rule__Epigrafe__Group__6__Impl rule__Epigrafe__Group__7 )
            // InternalLegisFacile.g:1247:2: rule__Epigrafe__Group__6__Impl rule__Epigrafe__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Epigrafe__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Epigrafe__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Group__6"


    // $ANTLR start "rule__Epigrafe__Group__6__Impl"
    // InternalLegisFacile.g:1254:1: rule__Epigrafe__Group__6__Impl : ( ( rule__Epigrafe__AnoAssignment_6 ) ) ;
    public final void rule__Epigrafe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1258:1: ( ( ( rule__Epigrafe__AnoAssignment_6 ) ) )
            // InternalLegisFacile.g:1259:1: ( ( rule__Epigrafe__AnoAssignment_6 ) )
            {
            // InternalLegisFacile.g:1259:1: ( ( rule__Epigrafe__AnoAssignment_6 ) )
            // InternalLegisFacile.g:1260:2: ( rule__Epigrafe__AnoAssignment_6 )
            {
             before(grammarAccess.getEpigrafeAccess().getAnoAssignment_6()); 
            // InternalLegisFacile.g:1261:2: ( rule__Epigrafe__AnoAssignment_6 )
            // InternalLegisFacile.g:1261:3: rule__Epigrafe__AnoAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Epigrafe__AnoAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEpigrafeAccess().getAnoAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Group__6__Impl"


    // $ANTLR start "rule__Epigrafe__Group__7"
    // InternalLegisFacile.g:1269:1: rule__Epigrafe__Group__7 : rule__Epigrafe__Group__7__Impl ;
    public final void rule__Epigrafe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1273:1: ( rule__Epigrafe__Group__7__Impl )
            // InternalLegisFacile.g:1274:2: rule__Epigrafe__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Epigrafe__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Group__7"


    // $ANTLR start "rule__Epigrafe__Group__7__Impl"
    // InternalLegisFacile.g:1280:1: rule__Epigrafe__Group__7__Impl : ( ')' ) ;
    public final void rule__Epigrafe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1284:1: ( ( ')' ) )
            // InternalLegisFacile.g:1285:1: ( ')' )
            {
            // InternalLegisFacile.g:1285:1: ( ')' )
            // InternalLegisFacile.g:1286:2: ')'
            {
             before(grammarAccess.getEpigrafeAccess().getRightParenthesisKeyword_7()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEpigrafeAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__Group__7__Impl"


    // $ANTLR start "rule__Ementa__Group__0"
    // InternalLegisFacile.g:1296:1: rule__Ementa__Group__0 : rule__Ementa__Group__0__Impl rule__Ementa__Group__1 ;
    public final void rule__Ementa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1300:1: ( rule__Ementa__Group__0__Impl rule__Ementa__Group__1 )
            // InternalLegisFacile.g:1301:2: rule__Ementa__Group__0__Impl rule__Ementa__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Ementa__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ementa__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ementa__Group__0"


    // $ANTLR start "rule__Ementa__Group__0__Impl"
    // InternalLegisFacile.g:1308:1: rule__Ementa__Group__0__Impl : ( ( rule__Ementa__Alternatives_0 ) ) ;
    public final void rule__Ementa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1312:1: ( ( ( rule__Ementa__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1313:1: ( ( rule__Ementa__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1313:1: ( ( rule__Ementa__Alternatives_0 ) )
            // InternalLegisFacile.g:1314:2: ( rule__Ementa__Alternatives_0 )
            {
             before(grammarAccess.getEmentaAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1315:2: ( rule__Ementa__Alternatives_0 )
            // InternalLegisFacile.g:1315:3: rule__Ementa__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Ementa__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getEmentaAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ementa__Group__0__Impl"


    // $ANTLR start "rule__Ementa__Group__1"
    // InternalLegisFacile.g:1323:1: rule__Ementa__Group__1 : rule__Ementa__Group__1__Impl rule__Ementa__Group__2 ;
    public final void rule__Ementa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1327:1: ( rule__Ementa__Group__1__Impl rule__Ementa__Group__2 )
            // InternalLegisFacile.g:1328:2: rule__Ementa__Group__1__Impl rule__Ementa__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Ementa__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ementa__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ementa__Group__1"


    // $ANTLR start "rule__Ementa__Group__1__Impl"
    // InternalLegisFacile.g:1335:1: rule__Ementa__Group__1__Impl : ( '(' ) ;
    public final void rule__Ementa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1339:1: ( ( '(' ) )
            // InternalLegisFacile.g:1340:1: ( '(' )
            {
            // InternalLegisFacile.g:1340:1: ( '(' )
            // InternalLegisFacile.g:1341:2: '('
            {
             before(grammarAccess.getEmentaAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEmentaAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ementa__Group__1__Impl"


    // $ANTLR start "rule__Ementa__Group__2"
    // InternalLegisFacile.g:1350:1: rule__Ementa__Group__2 : rule__Ementa__Group__2__Impl rule__Ementa__Group__3 ;
    public final void rule__Ementa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1354:1: ( rule__Ementa__Group__2__Impl rule__Ementa__Group__3 )
            // InternalLegisFacile.g:1355:2: rule__Ementa__Group__2__Impl rule__Ementa__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Ementa__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ementa__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ementa__Group__2"


    // $ANTLR start "rule__Ementa__Group__2__Impl"
    // InternalLegisFacile.g:1362:1: rule__Ementa__Group__2__Impl : ( ( rule__Ementa__EmentaAssignment_2 ) ) ;
    public final void rule__Ementa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1366:1: ( ( ( rule__Ementa__EmentaAssignment_2 ) ) )
            // InternalLegisFacile.g:1367:1: ( ( rule__Ementa__EmentaAssignment_2 ) )
            {
            // InternalLegisFacile.g:1367:1: ( ( rule__Ementa__EmentaAssignment_2 ) )
            // InternalLegisFacile.g:1368:2: ( rule__Ementa__EmentaAssignment_2 )
            {
             before(grammarAccess.getEmentaAccess().getEmentaAssignment_2()); 
            // InternalLegisFacile.g:1369:2: ( rule__Ementa__EmentaAssignment_2 )
            // InternalLegisFacile.g:1369:3: rule__Ementa__EmentaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Ementa__EmentaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEmentaAccess().getEmentaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ementa__Group__2__Impl"


    // $ANTLR start "rule__Ementa__Group__3"
    // InternalLegisFacile.g:1377:1: rule__Ementa__Group__3 : rule__Ementa__Group__3__Impl ;
    public final void rule__Ementa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1381:1: ( rule__Ementa__Group__3__Impl )
            // InternalLegisFacile.g:1382:2: rule__Ementa__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ementa__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ementa__Group__3"


    // $ANTLR start "rule__Ementa__Group__3__Impl"
    // InternalLegisFacile.g:1388:1: rule__Ementa__Group__3__Impl : ( ')' ) ;
    public final void rule__Ementa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1392:1: ( ( ')' ) )
            // InternalLegisFacile.g:1393:1: ( ')' )
            {
            // InternalLegisFacile.g:1393:1: ( ')' )
            // InternalLegisFacile.g:1394:2: ')'
            {
             before(grammarAccess.getEmentaAccess().getRightParenthesisKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEmentaAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ementa__Group__3__Impl"


    // $ANTLR start "rule__Preambulo__Group__0"
    // InternalLegisFacile.g:1404:1: rule__Preambulo__Group__0 : rule__Preambulo__Group__0__Impl rule__Preambulo__Group__1 ;
    public final void rule__Preambulo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1408:1: ( rule__Preambulo__Group__0__Impl rule__Preambulo__Group__1 )
            // InternalLegisFacile.g:1409:2: rule__Preambulo__Group__0__Impl rule__Preambulo__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Preambulo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preambulo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preambulo__Group__0"


    // $ANTLR start "rule__Preambulo__Group__0__Impl"
    // InternalLegisFacile.g:1416:1: rule__Preambulo__Group__0__Impl : ( ( rule__Preambulo__Alternatives_0 ) ) ;
    public final void rule__Preambulo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1420:1: ( ( ( rule__Preambulo__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1421:1: ( ( rule__Preambulo__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1421:1: ( ( rule__Preambulo__Alternatives_0 ) )
            // InternalLegisFacile.g:1422:2: ( rule__Preambulo__Alternatives_0 )
            {
             before(grammarAccess.getPreambuloAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1423:2: ( rule__Preambulo__Alternatives_0 )
            // InternalLegisFacile.g:1423:3: rule__Preambulo__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Preambulo__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPreambuloAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preambulo__Group__0__Impl"


    // $ANTLR start "rule__Preambulo__Group__1"
    // InternalLegisFacile.g:1431:1: rule__Preambulo__Group__1 : rule__Preambulo__Group__1__Impl rule__Preambulo__Group__2 ;
    public final void rule__Preambulo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1435:1: ( rule__Preambulo__Group__1__Impl rule__Preambulo__Group__2 )
            // InternalLegisFacile.g:1436:2: rule__Preambulo__Group__1__Impl rule__Preambulo__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Preambulo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preambulo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preambulo__Group__1"


    // $ANTLR start "rule__Preambulo__Group__1__Impl"
    // InternalLegisFacile.g:1443:1: rule__Preambulo__Group__1__Impl : ( '(' ) ;
    public final void rule__Preambulo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1447:1: ( ( '(' ) )
            // InternalLegisFacile.g:1448:1: ( '(' )
            {
            // InternalLegisFacile.g:1448:1: ( '(' )
            // InternalLegisFacile.g:1449:2: '('
            {
             before(grammarAccess.getPreambuloAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPreambuloAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preambulo__Group__1__Impl"


    // $ANTLR start "rule__Preambulo__Group__2"
    // InternalLegisFacile.g:1458:1: rule__Preambulo__Group__2 : rule__Preambulo__Group__2__Impl rule__Preambulo__Group__3 ;
    public final void rule__Preambulo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1462:1: ( rule__Preambulo__Group__2__Impl rule__Preambulo__Group__3 )
            // InternalLegisFacile.g:1463:2: rule__Preambulo__Group__2__Impl rule__Preambulo__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Preambulo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preambulo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preambulo__Group__2"


    // $ANTLR start "rule__Preambulo__Group__2__Impl"
    // InternalLegisFacile.g:1470:1: rule__Preambulo__Group__2__Impl : ( ( rule__Preambulo__PreambuloAssignment_2 ) ) ;
    public final void rule__Preambulo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1474:1: ( ( ( rule__Preambulo__PreambuloAssignment_2 ) ) )
            // InternalLegisFacile.g:1475:1: ( ( rule__Preambulo__PreambuloAssignment_2 ) )
            {
            // InternalLegisFacile.g:1475:1: ( ( rule__Preambulo__PreambuloAssignment_2 ) )
            // InternalLegisFacile.g:1476:2: ( rule__Preambulo__PreambuloAssignment_2 )
            {
             before(grammarAccess.getPreambuloAccess().getPreambuloAssignment_2()); 
            // InternalLegisFacile.g:1477:2: ( rule__Preambulo__PreambuloAssignment_2 )
            // InternalLegisFacile.g:1477:3: rule__Preambulo__PreambuloAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Preambulo__PreambuloAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPreambuloAccess().getPreambuloAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preambulo__Group__2__Impl"


    // $ANTLR start "rule__Preambulo__Group__3"
    // InternalLegisFacile.g:1485:1: rule__Preambulo__Group__3 : rule__Preambulo__Group__3__Impl ;
    public final void rule__Preambulo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1489:1: ( rule__Preambulo__Group__3__Impl )
            // InternalLegisFacile.g:1490:2: rule__Preambulo__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Preambulo__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preambulo__Group__3"


    // $ANTLR start "rule__Preambulo__Group__3__Impl"
    // InternalLegisFacile.g:1496:1: rule__Preambulo__Group__3__Impl : ( ')' ) ;
    public final void rule__Preambulo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1500:1: ( ( ')' ) )
            // InternalLegisFacile.g:1501:1: ( ')' )
            {
            // InternalLegisFacile.g:1501:1: ( ')' )
            // InternalLegisFacile.g:1502:2: ')'
            {
             before(grammarAccess.getPreambuloAccess().getRightParenthesisKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPreambuloAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preambulo__Group__3__Impl"


    // $ANTLR start "rule__Normativa__Group__0"
    // InternalLegisFacile.g:1512:1: rule__Normativa__Group__0 : rule__Normativa__Group__0__Impl rule__Normativa__Group__1 ;
    public final void rule__Normativa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1516:1: ( rule__Normativa__Group__0__Impl rule__Normativa__Group__1 )
            // InternalLegisFacile.g:1517:2: rule__Normativa__Group__0__Impl rule__Normativa__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Normativa__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Normativa__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normativa__Group__0"


    // $ANTLR start "rule__Normativa__Group__0__Impl"
    // InternalLegisFacile.g:1524:1: rule__Normativa__Group__0__Impl : ( ( rule__Normativa__Alternatives_0 ) ) ;
    public final void rule__Normativa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1528:1: ( ( ( rule__Normativa__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1529:1: ( ( rule__Normativa__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1529:1: ( ( rule__Normativa__Alternatives_0 ) )
            // InternalLegisFacile.g:1530:2: ( rule__Normativa__Alternatives_0 )
            {
             before(grammarAccess.getNormativaAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1531:2: ( rule__Normativa__Alternatives_0 )
            // InternalLegisFacile.g:1531:3: rule__Normativa__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Normativa__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNormativaAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normativa__Group__0__Impl"


    // $ANTLR start "rule__Normativa__Group__1"
    // InternalLegisFacile.g:1539:1: rule__Normativa__Group__1 : rule__Normativa__Group__1__Impl rule__Normativa__Group__2 ;
    public final void rule__Normativa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1543:1: ( rule__Normativa__Group__1__Impl rule__Normativa__Group__2 )
            // InternalLegisFacile.g:1544:2: rule__Normativa__Group__1__Impl rule__Normativa__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Normativa__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Normativa__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normativa__Group__1"


    // $ANTLR start "rule__Normativa__Group__1__Impl"
    // InternalLegisFacile.g:1551:1: rule__Normativa__Group__1__Impl : ( '{' ) ;
    public final void rule__Normativa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1555:1: ( ( '{' ) )
            // InternalLegisFacile.g:1556:1: ( '{' )
            {
            // InternalLegisFacile.g:1556:1: ( '{' )
            // InternalLegisFacile.g:1557:2: '{'
            {
             before(grammarAccess.getNormativaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNormativaAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normativa__Group__1__Impl"


    // $ANTLR start "rule__Normativa__Group__2"
    // InternalLegisFacile.g:1566:1: rule__Normativa__Group__2 : rule__Normativa__Group__2__Impl rule__Normativa__Group__3 ;
    public final void rule__Normativa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1570:1: ( rule__Normativa__Group__2__Impl rule__Normativa__Group__3 )
            // InternalLegisFacile.g:1571:2: rule__Normativa__Group__2__Impl rule__Normativa__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Normativa__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Normativa__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normativa__Group__2"


    // $ANTLR start "rule__Normativa__Group__2__Impl"
    // InternalLegisFacile.g:1578:1: rule__Normativa__Group__2__Impl : ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) ) ;
    public final void rule__Normativa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1582:1: ( ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) ) )
            // InternalLegisFacile.g:1583:1: ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) )
            {
            // InternalLegisFacile.g:1583:1: ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) )
            // InternalLegisFacile.g:1584:2: ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* )
            {
            // InternalLegisFacile.g:1584:2: ( ( rule__Normativa__ArtigosAssignment_2 ) )
            // InternalLegisFacile.g:1585:3: ( rule__Normativa__ArtigosAssignment_2 )
            {
             before(grammarAccess.getNormativaAccess().getArtigosAssignment_2()); 
            // InternalLegisFacile.g:1586:3: ( rule__Normativa__ArtigosAssignment_2 )
            // InternalLegisFacile.g:1586:4: rule__Normativa__ArtigosAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__Normativa__ArtigosAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNormativaAccess().getArtigosAssignment_2()); 

            }

            // InternalLegisFacile.g:1589:2: ( ( rule__Normativa__ArtigosAssignment_2 )* )
            // InternalLegisFacile.g:1590:3: ( rule__Normativa__ArtigosAssignment_2 )*
            {
             before(grammarAccess.getNormativaAccess().getArtigosAssignment_2()); 
            // InternalLegisFacile.g:1591:3: ( rule__Normativa__ArtigosAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=21 && LA15_0<=22)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLegisFacile.g:1591:4: rule__Normativa__ArtigosAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Normativa__ArtigosAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getNormativaAccess().getArtigosAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normativa__Group__2__Impl"


    // $ANTLR start "rule__Normativa__Group__3"
    // InternalLegisFacile.g:1600:1: rule__Normativa__Group__3 : rule__Normativa__Group__3__Impl ;
    public final void rule__Normativa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1604:1: ( rule__Normativa__Group__3__Impl )
            // InternalLegisFacile.g:1605:2: rule__Normativa__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Normativa__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normativa__Group__3"


    // $ANTLR start "rule__Normativa__Group__3__Impl"
    // InternalLegisFacile.g:1611:1: rule__Normativa__Group__3__Impl : ( '}' ) ;
    public final void rule__Normativa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1615:1: ( ( '}' ) )
            // InternalLegisFacile.g:1616:1: ( '}' )
            {
            // InternalLegisFacile.g:1616:1: ( '}' )
            // InternalLegisFacile.g:1617:2: '}'
            {
             before(grammarAccess.getNormativaAccess().getRightCurlyBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNormativaAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normativa__Group__3__Impl"


    // $ANTLR start "rule__Artigo__Group__0"
    // InternalLegisFacile.g:1627:1: rule__Artigo__Group__0 : rule__Artigo__Group__0__Impl rule__Artigo__Group__1 ;
    public final void rule__Artigo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1631:1: ( rule__Artigo__Group__0__Impl rule__Artigo__Group__1 )
            // InternalLegisFacile.g:1632:2: rule__Artigo__Group__0__Impl rule__Artigo__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Artigo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artigo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group__0"


    // $ANTLR start "rule__Artigo__Group__0__Impl"
    // InternalLegisFacile.g:1639:1: rule__Artigo__Group__0__Impl : ( ( rule__Artigo__Alternatives_0 ) ) ;
    public final void rule__Artigo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1643:1: ( ( ( rule__Artigo__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1644:1: ( ( rule__Artigo__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1644:1: ( ( rule__Artigo__Alternatives_0 ) )
            // InternalLegisFacile.g:1645:2: ( rule__Artigo__Alternatives_0 )
            {
             before(grammarAccess.getArtigoAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1646:2: ( rule__Artigo__Alternatives_0 )
            // InternalLegisFacile.g:1646:3: rule__Artigo__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Artigo__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getArtigoAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group__0__Impl"


    // $ANTLR start "rule__Artigo__Group__1"
    // InternalLegisFacile.g:1654:1: rule__Artigo__Group__1 : rule__Artigo__Group__1__Impl rule__Artigo__Group__2 ;
    public final void rule__Artigo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1658:1: ( rule__Artigo__Group__1__Impl rule__Artigo__Group__2 )
            // InternalLegisFacile.g:1659:2: rule__Artigo__Group__1__Impl rule__Artigo__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Artigo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artigo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group__1"


    // $ANTLR start "rule__Artigo__Group__1__Impl"
    // InternalLegisFacile.g:1666:1: rule__Artigo__Group__1__Impl : ( '{' ) ;
    public final void rule__Artigo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1670:1: ( ( '{' ) )
            // InternalLegisFacile.g:1671:1: ( '{' )
            {
            // InternalLegisFacile.g:1671:1: ( '{' )
            // InternalLegisFacile.g:1672:2: '{'
            {
             before(grammarAccess.getArtigoAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getArtigoAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group__1__Impl"


    // $ANTLR start "rule__Artigo__Group__2"
    // InternalLegisFacile.g:1681:1: rule__Artigo__Group__2 : rule__Artigo__Group__2__Impl rule__Artigo__Group__3 ;
    public final void rule__Artigo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1685:1: ( rule__Artigo__Group__2__Impl rule__Artigo__Group__3 )
            // InternalLegisFacile.g:1686:2: rule__Artigo__Group__2__Impl rule__Artigo__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Artigo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artigo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group__2"


    // $ANTLR start "rule__Artigo__Group__2__Impl"
    // InternalLegisFacile.g:1693:1: rule__Artigo__Group__2__Impl : ( ( rule__Artigo__CaputAssignment_2 ) ) ;
    public final void rule__Artigo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1697:1: ( ( ( rule__Artigo__CaputAssignment_2 ) ) )
            // InternalLegisFacile.g:1698:1: ( ( rule__Artigo__CaputAssignment_2 ) )
            {
            // InternalLegisFacile.g:1698:1: ( ( rule__Artigo__CaputAssignment_2 ) )
            // InternalLegisFacile.g:1699:2: ( rule__Artigo__CaputAssignment_2 )
            {
             before(grammarAccess.getArtigoAccess().getCaputAssignment_2()); 
            // InternalLegisFacile.g:1700:2: ( rule__Artigo__CaputAssignment_2 )
            // InternalLegisFacile.g:1700:3: rule__Artigo__CaputAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Artigo__CaputAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArtigoAccess().getCaputAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group__2__Impl"


    // $ANTLR start "rule__Artigo__Group__3"
    // InternalLegisFacile.g:1708:1: rule__Artigo__Group__3 : rule__Artigo__Group__3__Impl rule__Artigo__Group__4 ;
    public final void rule__Artigo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1712:1: ( rule__Artigo__Group__3__Impl rule__Artigo__Group__4 )
            // InternalLegisFacile.g:1713:2: rule__Artigo__Group__3__Impl rule__Artigo__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Artigo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artigo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group__3"


    // $ANTLR start "rule__Artigo__Group__3__Impl"
    // InternalLegisFacile.g:1720:1: rule__Artigo__Group__3__Impl : ( ( rule__Artigo__ParagrafosAssignment_3 )* ) ;
    public final void rule__Artigo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1724:1: ( ( ( rule__Artigo__ParagrafosAssignment_3 )* ) )
            // InternalLegisFacile.g:1725:1: ( ( rule__Artigo__ParagrafosAssignment_3 )* )
            {
            // InternalLegisFacile.g:1725:1: ( ( rule__Artigo__ParagrafosAssignment_3 )* )
            // InternalLegisFacile.g:1726:2: ( rule__Artigo__ParagrafosAssignment_3 )*
            {
             before(grammarAccess.getArtigoAccess().getParagrafosAssignment_3()); 
            // InternalLegisFacile.g:1727:2: ( rule__Artigo__ParagrafosAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=25 && LA16_0<=26)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLegisFacile.g:1727:3: rule__Artigo__ParagrafosAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Artigo__ParagrafosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getArtigoAccess().getParagrafosAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group__3__Impl"


    // $ANTLR start "rule__Artigo__Group__4"
    // InternalLegisFacile.g:1735:1: rule__Artigo__Group__4 : rule__Artigo__Group__4__Impl ;
    public final void rule__Artigo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1739:1: ( rule__Artigo__Group__4__Impl )
            // InternalLegisFacile.g:1740:2: rule__Artigo__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Artigo__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group__4"


    // $ANTLR start "rule__Artigo__Group__4__Impl"
    // InternalLegisFacile.g:1746:1: rule__Artigo__Group__4__Impl : ( '}' ) ;
    public final void rule__Artigo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1750:1: ( ( '}' ) )
            // InternalLegisFacile.g:1751:1: ( '}' )
            {
            // InternalLegisFacile.g:1751:1: ( '}' )
            // InternalLegisFacile.g:1752:2: '}'
            {
             before(grammarAccess.getArtigoAccess().getRightCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getArtigoAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group__4__Impl"


    // $ANTLR start "rule__Caput__Group__0"
    // InternalLegisFacile.g:1762:1: rule__Caput__Group__0 : rule__Caput__Group__0__Impl rule__Caput__Group__1 ;
    public final void rule__Caput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1766:1: ( rule__Caput__Group__0__Impl rule__Caput__Group__1 )
            // InternalLegisFacile.g:1767:2: rule__Caput__Group__0__Impl rule__Caput__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Caput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Caput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Group__0"


    // $ANTLR start "rule__Caput__Group__0__Impl"
    // InternalLegisFacile.g:1774:1: rule__Caput__Group__0__Impl : ( ( rule__Caput__Alternatives_0 ) ) ;
    public final void rule__Caput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1778:1: ( ( ( rule__Caput__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1779:1: ( ( rule__Caput__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1779:1: ( ( rule__Caput__Alternatives_0 ) )
            // InternalLegisFacile.g:1780:2: ( rule__Caput__Alternatives_0 )
            {
             before(grammarAccess.getCaputAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1781:2: ( rule__Caput__Alternatives_0 )
            // InternalLegisFacile.g:1781:3: rule__Caput__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Caput__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCaputAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Group__0__Impl"


    // $ANTLR start "rule__Caput__Group__1"
    // InternalLegisFacile.g:1789:1: rule__Caput__Group__1 : rule__Caput__Group__1__Impl rule__Caput__Group__2 ;
    public final void rule__Caput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1793:1: ( rule__Caput__Group__1__Impl rule__Caput__Group__2 )
            // InternalLegisFacile.g:1794:2: rule__Caput__Group__1__Impl rule__Caput__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Caput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Caput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Group__1"


    // $ANTLR start "rule__Caput__Group__1__Impl"
    // InternalLegisFacile.g:1801:1: rule__Caput__Group__1__Impl : ( '(' ) ;
    public final void rule__Caput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1805:1: ( ( '(' ) )
            // InternalLegisFacile.g:1806:1: ( '(' )
            {
            // InternalLegisFacile.g:1806:1: ( '(' )
            // InternalLegisFacile.g:1807:2: '('
            {
             before(grammarAccess.getCaputAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCaputAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Group__1__Impl"


    // $ANTLR start "rule__Caput__Group__2"
    // InternalLegisFacile.g:1816:1: rule__Caput__Group__2 : rule__Caput__Group__2__Impl rule__Caput__Group__3 ;
    public final void rule__Caput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1820:1: ( rule__Caput__Group__2__Impl rule__Caput__Group__3 )
            // InternalLegisFacile.g:1821:2: rule__Caput__Group__2__Impl rule__Caput__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Caput__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Caput__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Group__2"


    // $ANTLR start "rule__Caput__Group__2__Impl"
    // InternalLegisFacile.g:1828:1: rule__Caput__Group__2__Impl : ( ( rule__Caput__TextoAssignment_2 ) ) ;
    public final void rule__Caput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1832:1: ( ( ( rule__Caput__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:1833:1: ( ( rule__Caput__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:1833:1: ( ( rule__Caput__TextoAssignment_2 ) )
            // InternalLegisFacile.g:1834:2: ( rule__Caput__TextoAssignment_2 )
            {
             before(grammarAccess.getCaputAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:1835:2: ( rule__Caput__TextoAssignment_2 )
            // InternalLegisFacile.g:1835:3: rule__Caput__TextoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Caput__TextoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCaputAccess().getTextoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Group__2__Impl"


    // $ANTLR start "rule__Caput__Group__3"
    // InternalLegisFacile.g:1843:1: rule__Caput__Group__3 : rule__Caput__Group__3__Impl rule__Caput__Group__4 ;
    public final void rule__Caput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1847:1: ( rule__Caput__Group__3__Impl rule__Caput__Group__4 )
            // InternalLegisFacile.g:1848:2: rule__Caput__Group__3__Impl rule__Caput__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Caput__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Caput__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Group__3"


    // $ANTLR start "rule__Caput__Group__3__Impl"
    // InternalLegisFacile.g:1855:1: rule__Caput__Group__3__Impl : ( ')' ) ;
    public final void rule__Caput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1859:1: ( ( ')' ) )
            // InternalLegisFacile.g:1860:1: ( ')' )
            {
            // InternalLegisFacile.g:1860:1: ( ')' )
            // InternalLegisFacile.g:1861:2: ')'
            {
             before(grammarAccess.getCaputAccess().getRightParenthesisKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCaputAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Group__3__Impl"


    // $ANTLR start "rule__Caput__Group__4"
    // InternalLegisFacile.g:1870:1: rule__Caput__Group__4 : rule__Caput__Group__4__Impl ;
    public final void rule__Caput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1874:1: ( rule__Caput__Group__4__Impl )
            // InternalLegisFacile.g:1875:2: rule__Caput__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Caput__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Group__4"


    // $ANTLR start "rule__Caput__Group__4__Impl"
    // InternalLegisFacile.g:1881:1: rule__Caput__Group__4__Impl : ( ( rule__Caput__Group_4__0 )? ) ;
    public final void rule__Caput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1885:1: ( ( ( rule__Caput__Group_4__0 )? ) )
            // InternalLegisFacile.g:1886:1: ( ( rule__Caput__Group_4__0 )? )
            {
            // InternalLegisFacile.g:1886:1: ( ( rule__Caput__Group_4__0 )? )
            // InternalLegisFacile.g:1887:2: ( rule__Caput__Group_4__0 )?
            {
             before(grammarAccess.getCaputAccess().getGroup_4()); 
            // InternalLegisFacile.g:1888:2: ( rule__Caput__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLegisFacile.g:1888:3: rule__Caput__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Caput__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCaputAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Group__4__Impl"


    // $ANTLR start "rule__Caput__Group_4__0"
    // InternalLegisFacile.g:1897:1: rule__Caput__Group_4__0 : rule__Caput__Group_4__0__Impl rule__Caput__Group_4__1 ;
    public final void rule__Caput__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1901:1: ( rule__Caput__Group_4__0__Impl rule__Caput__Group_4__1 )
            // InternalLegisFacile.g:1902:2: rule__Caput__Group_4__0__Impl rule__Caput__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__Caput__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Caput__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Group_4__0"


    // $ANTLR start "rule__Caput__Group_4__0__Impl"
    // InternalLegisFacile.g:1909:1: rule__Caput__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Caput__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1913:1: ( ( '{' ) )
            // InternalLegisFacile.g:1914:1: ( '{' )
            {
            // InternalLegisFacile.g:1914:1: ( '{' )
            // InternalLegisFacile.g:1915:2: '{'
            {
             before(grammarAccess.getCaputAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCaputAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Group_4__0__Impl"


    // $ANTLR start "rule__Caput__Group_4__1"
    // InternalLegisFacile.g:1924:1: rule__Caput__Group_4__1 : rule__Caput__Group_4__1__Impl rule__Caput__Group_4__2 ;
    public final void rule__Caput__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1928:1: ( rule__Caput__Group_4__1__Impl rule__Caput__Group_4__2 )
            // InternalLegisFacile.g:1929:2: rule__Caput__Group_4__1__Impl rule__Caput__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__Caput__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Caput__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Group_4__1"


    // $ANTLR start "rule__Caput__Group_4__1__Impl"
    // InternalLegisFacile.g:1936:1: rule__Caput__Group_4__1__Impl : ( ( rule__Caput__IncisosAssignment_4_1 )* ) ;
    public final void rule__Caput__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1940:1: ( ( ( rule__Caput__IncisosAssignment_4_1 )* ) )
            // InternalLegisFacile.g:1941:1: ( ( rule__Caput__IncisosAssignment_4_1 )* )
            {
            // InternalLegisFacile.g:1941:1: ( ( rule__Caput__IncisosAssignment_4_1 )* )
            // InternalLegisFacile.g:1942:2: ( rule__Caput__IncisosAssignment_4_1 )*
            {
             before(grammarAccess.getCaputAccess().getIncisosAssignment_4_1()); 
            // InternalLegisFacile.g:1943:2: ( rule__Caput__IncisosAssignment_4_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=27 && LA18_0<=28)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLegisFacile.g:1943:3: rule__Caput__IncisosAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Caput__IncisosAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getCaputAccess().getIncisosAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Group_4__1__Impl"


    // $ANTLR start "rule__Caput__Group_4__2"
    // InternalLegisFacile.g:1951:1: rule__Caput__Group_4__2 : rule__Caput__Group_4__2__Impl ;
    public final void rule__Caput__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1955:1: ( rule__Caput__Group_4__2__Impl )
            // InternalLegisFacile.g:1956:2: rule__Caput__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Caput__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Group_4__2"


    // $ANTLR start "rule__Caput__Group_4__2__Impl"
    // InternalLegisFacile.g:1962:1: rule__Caput__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Caput__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1966:1: ( ( '}' ) )
            // InternalLegisFacile.g:1967:1: ( '}' )
            {
            // InternalLegisFacile.g:1967:1: ( '}' )
            // InternalLegisFacile.g:1968:2: '}'
            {
             before(grammarAccess.getCaputAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCaputAccess().getRightCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__Group_4__2__Impl"


    // $ANTLR start "rule__Paragrafo__Group__0"
    // InternalLegisFacile.g:1978:1: rule__Paragrafo__Group__0 : rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1 ;
    public final void rule__Paragrafo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1982:1: ( rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1 )
            // InternalLegisFacile.g:1983:2: rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Paragrafo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragrafo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group__0"


    // $ANTLR start "rule__Paragrafo__Group__0__Impl"
    // InternalLegisFacile.g:1990:1: rule__Paragrafo__Group__0__Impl : ( ( rule__Paragrafo__Alternatives_0 ) ) ;
    public final void rule__Paragrafo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1994:1: ( ( ( rule__Paragrafo__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1995:1: ( ( rule__Paragrafo__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1995:1: ( ( rule__Paragrafo__Alternatives_0 ) )
            // InternalLegisFacile.g:1996:2: ( rule__Paragrafo__Alternatives_0 )
            {
             before(grammarAccess.getParagrafoAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1997:2: ( rule__Paragrafo__Alternatives_0 )
            // InternalLegisFacile.g:1997:3: rule__Paragrafo__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Paragrafo__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getParagrafoAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group__0__Impl"


    // $ANTLR start "rule__Paragrafo__Group__1"
    // InternalLegisFacile.g:2005:1: rule__Paragrafo__Group__1 : rule__Paragrafo__Group__1__Impl rule__Paragrafo__Group__2 ;
    public final void rule__Paragrafo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2009:1: ( rule__Paragrafo__Group__1__Impl rule__Paragrafo__Group__2 )
            // InternalLegisFacile.g:2010:2: rule__Paragrafo__Group__1__Impl rule__Paragrafo__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Paragrafo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragrafo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group__1"


    // $ANTLR start "rule__Paragrafo__Group__1__Impl"
    // InternalLegisFacile.g:2017:1: rule__Paragrafo__Group__1__Impl : ( '(' ) ;
    public final void rule__Paragrafo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2021:1: ( ( '(' ) )
            // InternalLegisFacile.g:2022:1: ( '(' )
            {
            // InternalLegisFacile.g:2022:1: ( '(' )
            // InternalLegisFacile.g:2023:2: '('
            {
             before(grammarAccess.getParagrafoAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getParagrafoAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group__1__Impl"


    // $ANTLR start "rule__Paragrafo__Group__2"
    // InternalLegisFacile.g:2032:1: rule__Paragrafo__Group__2 : rule__Paragrafo__Group__2__Impl rule__Paragrafo__Group__3 ;
    public final void rule__Paragrafo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2036:1: ( rule__Paragrafo__Group__2__Impl rule__Paragrafo__Group__3 )
            // InternalLegisFacile.g:2037:2: rule__Paragrafo__Group__2__Impl rule__Paragrafo__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Paragrafo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragrafo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group__2"


    // $ANTLR start "rule__Paragrafo__Group__2__Impl"
    // InternalLegisFacile.g:2044:1: rule__Paragrafo__Group__2__Impl : ( ( rule__Paragrafo__TextoAssignment_2 ) ) ;
    public final void rule__Paragrafo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2048:1: ( ( ( rule__Paragrafo__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:2049:1: ( ( rule__Paragrafo__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:2049:1: ( ( rule__Paragrafo__TextoAssignment_2 ) )
            // InternalLegisFacile.g:2050:2: ( rule__Paragrafo__TextoAssignment_2 )
            {
             before(grammarAccess.getParagrafoAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:2051:2: ( rule__Paragrafo__TextoAssignment_2 )
            // InternalLegisFacile.g:2051:3: rule__Paragrafo__TextoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Paragrafo__TextoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParagrafoAccess().getTextoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group__2__Impl"


    // $ANTLR start "rule__Paragrafo__Group__3"
    // InternalLegisFacile.g:2059:1: rule__Paragrafo__Group__3 : rule__Paragrafo__Group__3__Impl rule__Paragrafo__Group__4 ;
    public final void rule__Paragrafo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2063:1: ( rule__Paragrafo__Group__3__Impl rule__Paragrafo__Group__4 )
            // InternalLegisFacile.g:2064:2: rule__Paragrafo__Group__3__Impl rule__Paragrafo__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Paragrafo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragrafo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group__3"


    // $ANTLR start "rule__Paragrafo__Group__3__Impl"
    // InternalLegisFacile.g:2071:1: rule__Paragrafo__Group__3__Impl : ( ')' ) ;
    public final void rule__Paragrafo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2075:1: ( ( ')' ) )
            // InternalLegisFacile.g:2076:1: ( ')' )
            {
            // InternalLegisFacile.g:2076:1: ( ')' )
            // InternalLegisFacile.g:2077:2: ')'
            {
             before(grammarAccess.getParagrafoAccess().getRightParenthesisKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getParagrafoAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group__3__Impl"


    // $ANTLR start "rule__Paragrafo__Group__4"
    // InternalLegisFacile.g:2086:1: rule__Paragrafo__Group__4 : rule__Paragrafo__Group__4__Impl ;
    public final void rule__Paragrafo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2090:1: ( rule__Paragrafo__Group__4__Impl )
            // InternalLegisFacile.g:2091:2: rule__Paragrafo__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paragrafo__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group__4"


    // $ANTLR start "rule__Paragrafo__Group__4__Impl"
    // InternalLegisFacile.g:2097:1: rule__Paragrafo__Group__4__Impl : ( ( rule__Paragrafo__Group_4__0 )? ) ;
    public final void rule__Paragrafo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2101:1: ( ( ( rule__Paragrafo__Group_4__0 )? ) )
            // InternalLegisFacile.g:2102:1: ( ( rule__Paragrafo__Group_4__0 )? )
            {
            // InternalLegisFacile.g:2102:1: ( ( rule__Paragrafo__Group_4__0 )? )
            // InternalLegisFacile.g:2103:2: ( rule__Paragrafo__Group_4__0 )?
            {
             before(grammarAccess.getParagrafoAccess().getGroup_4()); 
            // InternalLegisFacile.g:2104:2: ( rule__Paragrafo__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLegisFacile.g:2104:3: rule__Paragrafo__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Paragrafo__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParagrafoAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group__4__Impl"


    // $ANTLR start "rule__Paragrafo__Group_4__0"
    // InternalLegisFacile.g:2113:1: rule__Paragrafo__Group_4__0 : rule__Paragrafo__Group_4__0__Impl rule__Paragrafo__Group_4__1 ;
    public final void rule__Paragrafo__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2117:1: ( rule__Paragrafo__Group_4__0__Impl rule__Paragrafo__Group_4__1 )
            // InternalLegisFacile.g:2118:2: rule__Paragrafo__Group_4__0__Impl rule__Paragrafo__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__Paragrafo__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragrafo__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group_4__0"


    // $ANTLR start "rule__Paragrafo__Group_4__0__Impl"
    // InternalLegisFacile.g:2125:1: rule__Paragrafo__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Paragrafo__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2129:1: ( ( '{' ) )
            // InternalLegisFacile.g:2130:1: ( '{' )
            {
            // InternalLegisFacile.g:2130:1: ( '{' )
            // InternalLegisFacile.g:2131:2: '{'
            {
             before(grammarAccess.getParagrafoAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getParagrafoAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group_4__0__Impl"


    // $ANTLR start "rule__Paragrafo__Group_4__1"
    // InternalLegisFacile.g:2140:1: rule__Paragrafo__Group_4__1 : rule__Paragrafo__Group_4__1__Impl rule__Paragrafo__Group_4__2 ;
    public final void rule__Paragrafo__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2144:1: ( rule__Paragrafo__Group_4__1__Impl rule__Paragrafo__Group_4__2 )
            // InternalLegisFacile.g:2145:2: rule__Paragrafo__Group_4__1__Impl rule__Paragrafo__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__Paragrafo__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragrafo__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group_4__1"


    // $ANTLR start "rule__Paragrafo__Group_4__1__Impl"
    // InternalLegisFacile.g:2152:1: rule__Paragrafo__Group_4__1__Impl : ( ( rule__Paragrafo__IncisosAssignment_4_1 )* ) ;
    public final void rule__Paragrafo__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2156:1: ( ( ( rule__Paragrafo__IncisosAssignment_4_1 )* ) )
            // InternalLegisFacile.g:2157:1: ( ( rule__Paragrafo__IncisosAssignment_4_1 )* )
            {
            // InternalLegisFacile.g:2157:1: ( ( rule__Paragrafo__IncisosAssignment_4_1 )* )
            // InternalLegisFacile.g:2158:2: ( rule__Paragrafo__IncisosAssignment_4_1 )*
            {
             before(grammarAccess.getParagrafoAccess().getIncisosAssignment_4_1()); 
            // InternalLegisFacile.g:2159:2: ( rule__Paragrafo__IncisosAssignment_4_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=27 && LA20_0<=28)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLegisFacile.g:2159:3: rule__Paragrafo__IncisosAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Paragrafo__IncisosAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getParagrafoAccess().getIncisosAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group_4__1__Impl"


    // $ANTLR start "rule__Paragrafo__Group_4__2"
    // InternalLegisFacile.g:2167:1: rule__Paragrafo__Group_4__2 : rule__Paragrafo__Group_4__2__Impl ;
    public final void rule__Paragrafo__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2171:1: ( rule__Paragrafo__Group_4__2__Impl )
            // InternalLegisFacile.g:2172:2: rule__Paragrafo__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paragrafo__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group_4__2"


    // $ANTLR start "rule__Paragrafo__Group_4__2__Impl"
    // InternalLegisFacile.g:2178:1: rule__Paragrafo__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Paragrafo__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2182:1: ( ( '}' ) )
            // InternalLegisFacile.g:2183:1: ( '}' )
            {
            // InternalLegisFacile.g:2183:1: ( '}' )
            // InternalLegisFacile.g:2184:2: '}'
            {
             before(grammarAccess.getParagrafoAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getParagrafoAccess().getRightCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group_4__2__Impl"


    // $ANTLR start "rule__Inciso__Group__0"
    // InternalLegisFacile.g:2194:1: rule__Inciso__Group__0 : rule__Inciso__Group__0__Impl rule__Inciso__Group__1 ;
    public final void rule__Inciso__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2198:1: ( rule__Inciso__Group__0__Impl rule__Inciso__Group__1 )
            // InternalLegisFacile.g:2199:2: rule__Inciso__Group__0__Impl rule__Inciso__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Inciso__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inciso__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Group__0"


    // $ANTLR start "rule__Inciso__Group__0__Impl"
    // InternalLegisFacile.g:2206:1: rule__Inciso__Group__0__Impl : ( ( rule__Inciso__Alternatives_0 ) ) ;
    public final void rule__Inciso__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2210:1: ( ( ( rule__Inciso__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2211:1: ( ( rule__Inciso__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2211:1: ( ( rule__Inciso__Alternatives_0 ) )
            // InternalLegisFacile.g:2212:2: ( rule__Inciso__Alternatives_0 )
            {
             before(grammarAccess.getIncisoAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2213:2: ( rule__Inciso__Alternatives_0 )
            // InternalLegisFacile.g:2213:3: rule__Inciso__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Inciso__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getIncisoAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Group__0__Impl"


    // $ANTLR start "rule__Inciso__Group__1"
    // InternalLegisFacile.g:2221:1: rule__Inciso__Group__1 : rule__Inciso__Group__1__Impl rule__Inciso__Group__2 ;
    public final void rule__Inciso__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2225:1: ( rule__Inciso__Group__1__Impl rule__Inciso__Group__2 )
            // InternalLegisFacile.g:2226:2: rule__Inciso__Group__1__Impl rule__Inciso__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Inciso__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inciso__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Group__1"


    // $ANTLR start "rule__Inciso__Group__1__Impl"
    // InternalLegisFacile.g:2233:1: rule__Inciso__Group__1__Impl : ( '(' ) ;
    public final void rule__Inciso__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2237:1: ( ( '(' ) )
            // InternalLegisFacile.g:2238:1: ( '(' )
            {
            // InternalLegisFacile.g:2238:1: ( '(' )
            // InternalLegisFacile.g:2239:2: '('
            {
             before(grammarAccess.getIncisoAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getIncisoAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Group__1__Impl"


    // $ANTLR start "rule__Inciso__Group__2"
    // InternalLegisFacile.g:2248:1: rule__Inciso__Group__2 : rule__Inciso__Group__2__Impl rule__Inciso__Group__3 ;
    public final void rule__Inciso__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2252:1: ( rule__Inciso__Group__2__Impl rule__Inciso__Group__3 )
            // InternalLegisFacile.g:2253:2: rule__Inciso__Group__2__Impl rule__Inciso__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Inciso__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inciso__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Group__2"


    // $ANTLR start "rule__Inciso__Group__2__Impl"
    // InternalLegisFacile.g:2260:1: rule__Inciso__Group__2__Impl : ( ( rule__Inciso__TextoAssignment_2 ) ) ;
    public final void rule__Inciso__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2264:1: ( ( ( rule__Inciso__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:2265:1: ( ( rule__Inciso__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:2265:1: ( ( rule__Inciso__TextoAssignment_2 ) )
            // InternalLegisFacile.g:2266:2: ( rule__Inciso__TextoAssignment_2 )
            {
             before(grammarAccess.getIncisoAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:2267:2: ( rule__Inciso__TextoAssignment_2 )
            // InternalLegisFacile.g:2267:3: rule__Inciso__TextoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Inciso__TextoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIncisoAccess().getTextoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Group__2__Impl"


    // $ANTLR start "rule__Inciso__Group__3"
    // InternalLegisFacile.g:2275:1: rule__Inciso__Group__3 : rule__Inciso__Group__3__Impl rule__Inciso__Group__4 ;
    public final void rule__Inciso__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2279:1: ( rule__Inciso__Group__3__Impl rule__Inciso__Group__4 )
            // InternalLegisFacile.g:2280:2: rule__Inciso__Group__3__Impl rule__Inciso__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Inciso__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inciso__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Group__3"


    // $ANTLR start "rule__Inciso__Group__3__Impl"
    // InternalLegisFacile.g:2287:1: rule__Inciso__Group__3__Impl : ( ')' ) ;
    public final void rule__Inciso__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2291:1: ( ( ')' ) )
            // InternalLegisFacile.g:2292:1: ( ')' )
            {
            // InternalLegisFacile.g:2292:1: ( ')' )
            // InternalLegisFacile.g:2293:2: ')'
            {
             before(grammarAccess.getIncisoAccess().getRightParenthesisKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIncisoAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Group__3__Impl"


    // $ANTLR start "rule__Inciso__Group__4"
    // InternalLegisFacile.g:2302:1: rule__Inciso__Group__4 : rule__Inciso__Group__4__Impl ;
    public final void rule__Inciso__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2306:1: ( rule__Inciso__Group__4__Impl )
            // InternalLegisFacile.g:2307:2: rule__Inciso__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inciso__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Group__4"


    // $ANTLR start "rule__Inciso__Group__4__Impl"
    // InternalLegisFacile.g:2313:1: rule__Inciso__Group__4__Impl : ( ( rule__Inciso__Group_4__0 )? ) ;
    public final void rule__Inciso__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2317:1: ( ( ( rule__Inciso__Group_4__0 )? ) )
            // InternalLegisFacile.g:2318:1: ( ( rule__Inciso__Group_4__0 )? )
            {
            // InternalLegisFacile.g:2318:1: ( ( rule__Inciso__Group_4__0 )? )
            // InternalLegisFacile.g:2319:2: ( rule__Inciso__Group_4__0 )?
            {
             before(grammarAccess.getIncisoAccess().getGroup_4()); 
            // InternalLegisFacile.g:2320:2: ( rule__Inciso__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLegisFacile.g:2320:3: rule__Inciso__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inciso__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIncisoAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Group__4__Impl"


    // $ANTLR start "rule__Inciso__Group_4__0"
    // InternalLegisFacile.g:2329:1: rule__Inciso__Group_4__0 : rule__Inciso__Group_4__0__Impl rule__Inciso__Group_4__1 ;
    public final void rule__Inciso__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2333:1: ( rule__Inciso__Group_4__0__Impl rule__Inciso__Group_4__1 )
            // InternalLegisFacile.g:2334:2: rule__Inciso__Group_4__0__Impl rule__Inciso__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__Inciso__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inciso__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Group_4__0"


    // $ANTLR start "rule__Inciso__Group_4__0__Impl"
    // InternalLegisFacile.g:2341:1: rule__Inciso__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Inciso__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2345:1: ( ( '{' ) )
            // InternalLegisFacile.g:2346:1: ( '{' )
            {
            // InternalLegisFacile.g:2346:1: ( '{' )
            // InternalLegisFacile.g:2347:2: '{'
            {
             before(grammarAccess.getIncisoAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getIncisoAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Group_4__0__Impl"


    // $ANTLR start "rule__Inciso__Group_4__1"
    // InternalLegisFacile.g:2356:1: rule__Inciso__Group_4__1 : rule__Inciso__Group_4__1__Impl rule__Inciso__Group_4__2 ;
    public final void rule__Inciso__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2360:1: ( rule__Inciso__Group_4__1__Impl rule__Inciso__Group_4__2 )
            // InternalLegisFacile.g:2361:2: rule__Inciso__Group_4__1__Impl rule__Inciso__Group_4__2
            {
            pushFollow(FOLLOW_23);
            rule__Inciso__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inciso__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Group_4__1"


    // $ANTLR start "rule__Inciso__Group_4__1__Impl"
    // InternalLegisFacile.g:2368:1: rule__Inciso__Group_4__1__Impl : ( ( rule__Inciso__AlineasAssignment_4_1 )* ) ;
    public final void rule__Inciso__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2372:1: ( ( ( rule__Inciso__AlineasAssignment_4_1 )* ) )
            // InternalLegisFacile.g:2373:1: ( ( rule__Inciso__AlineasAssignment_4_1 )* )
            {
            // InternalLegisFacile.g:2373:1: ( ( rule__Inciso__AlineasAssignment_4_1 )* )
            // InternalLegisFacile.g:2374:2: ( rule__Inciso__AlineasAssignment_4_1 )*
            {
             before(grammarAccess.getIncisoAccess().getAlineasAssignment_4_1()); 
            // InternalLegisFacile.g:2375:2: ( rule__Inciso__AlineasAssignment_4_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=29 && LA22_0<=30)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLegisFacile.g:2375:3: rule__Inciso__AlineasAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Inciso__AlineasAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getIncisoAccess().getAlineasAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Group_4__1__Impl"


    // $ANTLR start "rule__Inciso__Group_4__2"
    // InternalLegisFacile.g:2383:1: rule__Inciso__Group_4__2 : rule__Inciso__Group_4__2__Impl ;
    public final void rule__Inciso__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2387:1: ( rule__Inciso__Group_4__2__Impl )
            // InternalLegisFacile.g:2388:2: rule__Inciso__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inciso__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Group_4__2"


    // $ANTLR start "rule__Inciso__Group_4__2__Impl"
    // InternalLegisFacile.g:2394:1: rule__Inciso__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Inciso__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2398:1: ( ( '}' ) )
            // InternalLegisFacile.g:2399:1: ( '}' )
            {
            // InternalLegisFacile.g:2399:1: ( '}' )
            // InternalLegisFacile.g:2400:2: '}'
            {
             before(grammarAccess.getIncisoAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getIncisoAccess().getRightCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__Group_4__2__Impl"


    // $ANTLR start "rule__Alinea__Group__0"
    // InternalLegisFacile.g:2410:1: rule__Alinea__Group__0 : rule__Alinea__Group__0__Impl rule__Alinea__Group__1 ;
    public final void rule__Alinea__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2414:1: ( rule__Alinea__Group__0__Impl rule__Alinea__Group__1 )
            // InternalLegisFacile.g:2415:2: rule__Alinea__Group__0__Impl rule__Alinea__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Alinea__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alinea__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Group__0"


    // $ANTLR start "rule__Alinea__Group__0__Impl"
    // InternalLegisFacile.g:2422:1: rule__Alinea__Group__0__Impl : ( ( rule__Alinea__Alternatives_0 ) ) ;
    public final void rule__Alinea__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2426:1: ( ( ( rule__Alinea__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2427:1: ( ( rule__Alinea__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2427:1: ( ( rule__Alinea__Alternatives_0 ) )
            // InternalLegisFacile.g:2428:2: ( rule__Alinea__Alternatives_0 )
            {
             before(grammarAccess.getAlineaAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2429:2: ( rule__Alinea__Alternatives_0 )
            // InternalLegisFacile.g:2429:3: rule__Alinea__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Alinea__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAlineaAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Group__0__Impl"


    // $ANTLR start "rule__Alinea__Group__1"
    // InternalLegisFacile.g:2437:1: rule__Alinea__Group__1 : rule__Alinea__Group__1__Impl rule__Alinea__Group__2 ;
    public final void rule__Alinea__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2441:1: ( rule__Alinea__Group__1__Impl rule__Alinea__Group__2 )
            // InternalLegisFacile.g:2442:2: rule__Alinea__Group__1__Impl rule__Alinea__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Alinea__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alinea__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Group__1"


    // $ANTLR start "rule__Alinea__Group__1__Impl"
    // InternalLegisFacile.g:2449:1: rule__Alinea__Group__1__Impl : ( '(' ) ;
    public final void rule__Alinea__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2453:1: ( ( '(' ) )
            // InternalLegisFacile.g:2454:1: ( '(' )
            {
            // InternalLegisFacile.g:2454:1: ( '(' )
            // InternalLegisFacile.g:2455:2: '('
            {
             before(grammarAccess.getAlineaAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAlineaAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Group__1__Impl"


    // $ANTLR start "rule__Alinea__Group__2"
    // InternalLegisFacile.g:2464:1: rule__Alinea__Group__2 : rule__Alinea__Group__2__Impl rule__Alinea__Group__3 ;
    public final void rule__Alinea__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2468:1: ( rule__Alinea__Group__2__Impl rule__Alinea__Group__3 )
            // InternalLegisFacile.g:2469:2: rule__Alinea__Group__2__Impl rule__Alinea__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Alinea__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alinea__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Group__2"


    // $ANTLR start "rule__Alinea__Group__2__Impl"
    // InternalLegisFacile.g:2476:1: rule__Alinea__Group__2__Impl : ( ( rule__Alinea__TextoAssignment_2 ) ) ;
    public final void rule__Alinea__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2480:1: ( ( ( rule__Alinea__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:2481:1: ( ( rule__Alinea__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:2481:1: ( ( rule__Alinea__TextoAssignment_2 ) )
            // InternalLegisFacile.g:2482:2: ( rule__Alinea__TextoAssignment_2 )
            {
             before(grammarAccess.getAlineaAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:2483:2: ( rule__Alinea__TextoAssignment_2 )
            // InternalLegisFacile.g:2483:3: rule__Alinea__TextoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Alinea__TextoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlineaAccess().getTextoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Group__2__Impl"


    // $ANTLR start "rule__Alinea__Group__3"
    // InternalLegisFacile.g:2491:1: rule__Alinea__Group__3 : rule__Alinea__Group__3__Impl rule__Alinea__Group__4 ;
    public final void rule__Alinea__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2495:1: ( rule__Alinea__Group__3__Impl rule__Alinea__Group__4 )
            // InternalLegisFacile.g:2496:2: rule__Alinea__Group__3__Impl rule__Alinea__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Alinea__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alinea__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Group__3"


    // $ANTLR start "rule__Alinea__Group__3__Impl"
    // InternalLegisFacile.g:2503:1: rule__Alinea__Group__3__Impl : ( ')' ) ;
    public final void rule__Alinea__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2507:1: ( ( ')' ) )
            // InternalLegisFacile.g:2508:1: ( ')' )
            {
            // InternalLegisFacile.g:2508:1: ( ')' )
            // InternalLegisFacile.g:2509:2: ')'
            {
             before(grammarAccess.getAlineaAccess().getRightParenthesisKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAlineaAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Group__3__Impl"


    // $ANTLR start "rule__Alinea__Group__4"
    // InternalLegisFacile.g:2518:1: rule__Alinea__Group__4 : rule__Alinea__Group__4__Impl ;
    public final void rule__Alinea__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2522:1: ( rule__Alinea__Group__4__Impl )
            // InternalLegisFacile.g:2523:2: rule__Alinea__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alinea__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Group__4"


    // $ANTLR start "rule__Alinea__Group__4__Impl"
    // InternalLegisFacile.g:2529:1: rule__Alinea__Group__4__Impl : ( ( rule__Alinea__Group_4__0 )? ) ;
    public final void rule__Alinea__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2533:1: ( ( ( rule__Alinea__Group_4__0 )? ) )
            // InternalLegisFacile.g:2534:1: ( ( rule__Alinea__Group_4__0 )? )
            {
            // InternalLegisFacile.g:2534:1: ( ( rule__Alinea__Group_4__0 )? )
            // InternalLegisFacile.g:2535:2: ( rule__Alinea__Group_4__0 )?
            {
             before(grammarAccess.getAlineaAccess().getGroup_4()); 
            // InternalLegisFacile.g:2536:2: ( rule__Alinea__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLegisFacile.g:2536:3: rule__Alinea__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Alinea__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlineaAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Group__4__Impl"


    // $ANTLR start "rule__Alinea__Group_4__0"
    // InternalLegisFacile.g:2545:1: rule__Alinea__Group_4__0 : rule__Alinea__Group_4__0__Impl rule__Alinea__Group_4__1 ;
    public final void rule__Alinea__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2549:1: ( rule__Alinea__Group_4__0__Impl rule__Alinea__Group_4__1 )
            // InternalLegisFacile.g:2550:2: rule__Alinea__Group_4__0__Impl rule__Alinea__Group_4__1
            {
            pushFollow(FOLLOW_25);
            rule__Alinea__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alinea__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Group_4__0"


    // $ANTLR start "rule__Alinea__Group_4__0__Impl"
    // InternalLegisFacile.g:2557:1: rule__Alinea__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Alinea__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2561:1: ( ( '{' ) )
            // InternalLegisFacile.g:2562:1: ( '{' )
            {
            // InternalLegisFacile.g:2562:1: ( '{' )
            // InternalLegisFacile.g:2563:2: '{'
            {
             before(grammarAccess.getAlineaAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAlineaAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Group_4__0__Impl"


    // $ANTLR start "rule__Alinea__Group_4__1"
    // InternalLegisFacile.g:2572:1: rule__Alinea__Group_4__1 : rule__Alinea__Group_4__1__Impl rule__Alinea__Group_4__2 ;
    public final void rule__Alinea__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2576:1: ( rule__Alinea__Group_4__1__Impl rule__Alinea__Group_4__2 )
            // InternalLegisFacile.g:2577:2: rule__Alinea__Group_4__1__Impl rule__Alinea__Group_4__2
            {
            pushFollow(FOLLOW_25);
            rule__Alinea__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alinea__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Group_4__1"


    // $ANTLR start "rule__Alinea__Group_4__1__Impl"
    // InternalLegisFacile.g:2584:1: rule__Alinea__Group_4__1__Impl : ( ( rule__Alinea__ItensAssignment_4_1 )* ) ;
    public final void rule__Alinea__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2588:1: ( ( ( rule__Alinea__ItensAssignment_4_1 )* ) )
            // InternalLegisFacile.g:2589:1: ( ( rule__Alinea__ItensAssignment_4_1 )* )
            {
            // InternalLegisFacile.g:2589:1: ( ( rule__Alinea__ItensAssignment_4_1 )* )
            // InternalLegisFacile.g:2590:2: ( rule__Alinea__ItensAssignment_4_1 )*
            {
             before(grammarAccess.getAlineaAccess().getItensAssignment_4_1()); 
            // InternalLegisFacile.g:2591:2: ( rule__Alinea__ItensAssignment_4_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=31 && LA24_0<=32)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalLegisFacile.g:2591:3: rule__Alinea__ItensAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Alinea__ItensAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getAlineaAccess().getItensAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Group_4__1__Impl"


    // $ANTLR start "rule__Alinea__Group_4__2"
    // InternalLegisFacile.g:2599:1: rule__Alinea__Group_4__2 : rule__Alinea__Group_4__2__Impl ;
    public final void rule__Alinea__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2603:1: ( rule__Alinea__Group_4__2__Impl )
            // InternalLegisFacile.g:2604:2: rule__Alinea__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alinea__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Group_4__2"


    // $ANTLR start "rule__Alinea__Group_4__2__Impl"
    // InternalLegisFacile.g:2610:1: rule__Alinea__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Alinea__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2614:1: ( ( '}' ) )
            // InternalLegisFacile.g:2615:1: ( '}' )
            {
            // InternalLegisFacile.g:2615:1: ( '}' )
            // InternalLegisFacile.g:2616:2: '}'
            {
             before(grammarAccess.getAlineaAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAlineaAccess().getRightCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__Group_4__2__Impl"


    // $ANTLR start "rule__Item__Group__0"
    // InternalLegisFacile.g:2626:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2630:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // InternalLegisFacile.g:2631:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Item__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__0"


    // $ANTLR start "rule__Item__Group__0__Impl"
    // InternalLegisFacile.g:2638:1: rule__Item__Group__0__Impl : ( ( rule__Item__Alternatives_0 ) ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2642:1: ( ( ( rule__Item__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2643:1: ( ( rule__Item__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2643:1: ( ( rule__Item__Alternatives_0 ) )
            // InternalLegisFacile.g:2644:2: ( rule__Item__Alternatives_0 )
            {
             before(grammarAccess.getItemAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2645:2: ( rule__Item__Alternatives_0 )
            // InternalLegisFacile.g:2645:3: rule__Item__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Item__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__0__Impl"


    // $ANTLR start "rule__Item__Group__1"
    // InternalLegisFacile.g:2653:1: rule__Item__Group__1 : rule__Item__Group__1__Impl rule__Item__Group__2 ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2657:1: ( rule__Item__Group__1__Impl rule__Item__Group__2 )
            // InternalLegisFacile.g:2658:2: rule__Item__Group__1__Impl rule__Item__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Item__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__1"


    // $ANTLR start "rule__Item__Group__1__Impl"
    // InternalLegisFacile.g:2665:1: rule__Item__Group__1__Impl : ( '(' ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2669:1: ( ( '(' ) )
            // InternalLegisFacile.g:2670:1: ( '(' )
            {
            // InternalLegisFacile.g:2670:1: ( '(' )
            // InternalLegisFacile.g:2671:2: '('
            {
             before(grammarAccess.getItemAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__1__Impl"


    // $ANTLR start "rule__Item__Group__2"
    // InternalLegisFacile.g:2680:1: rule__Item__Group__2 : rule__Item__Group__2__Impl rule__Item__Group__3 ;
    public final void rule__Item__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2684:1: ( rule__Item__Group__2__Impl rule__Item__Group__3 )
            // InternalLegisFacile.g:2685:2: rule__Item__Group__2__Impl rule__Item__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Item__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__2"


    // $ANTLR start "rule__Item__Group__2__Impl"
    // InternalLegisFacile.g:2692:1: rule__Item__Group__2__Impl : ( ( rule__Item__TextoAssignment_2 ) ) ;
    public final void rule__Item__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2696:1: ( ( ( rule__Item__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:2697:1: ( ( rule__Item__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:2697:1: ( ( rule__Item__TextoAssignment_2 ) )
            // InternalLegisFacile.g:2698:2: ( rule__Item__TextoAssignment_2 )
            {
             before(grammarAccess.getItemAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:2699:2: ( rule__Item__TextoAssignment_2 )
            // InternalLegisFacile.g:2699:3: rule__Item__TextoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Item__TextoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getTextoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__2__Impl"


    // $ANTLR start "rule__Item__Group__3"
    // InternalLegisFacile.g:2707:1: rule__Item__Group__3 : rule__Item__Group__3__Impl ;
    public final void rule__Item__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2711:1: ( rule__Item__Group__3__Impl )
            // InternalLegisFacile.g:2712:2: rule__Item__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__3"


    // $ANTLR start "rule__Item__Group__3__Impl"
    // InternalLegisFacile.g:2718:1: rule__Item__Group__3__Impl : ( ')' ) ;
    public final void rule__Item__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2722:1: ( ( ')' ) )
            // InternalLegisFacile.g:2723:1: ( ')' )
            {
            // InternalLegisFacile.g:2723:1: ( ')' )
            // InternalLegisFacile.g:2724:2: ')'
            {
             before(grammarAccess.getItemAccess().getRightParenthesisKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__3__Impl"


    // $ANTLR start "rule__Final__Group__0"
    // InternalLegisFacile.g:2734:1: rule__Final__Group__0 : rule__Final__Group__0__Impl rule__Final__Group__1 ;
    public final void rule__Final__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2738:1: ( rule__Final__Group__0__Impl rule__Final__Group__1 )
            // InternalLegisFacile.g:2739:2: rule__Final__Group__0__Impl rule__Final__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Final__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__0"


    // $ANTLR start "rule__Final__Group__0__Impl"
    // InternalLegisFacile.g:2746:1: rule__Final__Group__0__Impl : ( ( rule__Final__Alternatives_0 ) ) ;
    public final void rule__Final__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2750:1: ( ( ( rule__Final__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2751:1: ( ( rule__Final__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2751:1: ( ( rule__Final__Alternatives_0 ) )
            // InternalLegisFacile.g:2752:2: ( rule__Final__Alternatives_0 )
            {
             before(grammarAccess.getFinalAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2753:2: ( rule__Final__Alternatives_0 )
            // InternalLegisFacile.g:2753:3: rule__Final__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Final__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__0__Impl"


    // $ANTLR start "rule__Final__Group__1"
    // InternalLegisFacile.g:2761:1: rule__Final__Group__1 : rule__Final__Group__1__Impl rule__Final__Group__2 ;
    public final void rule__Final__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2765:1: ( rule__Final__Group__1__Impl rule__Final__Group__2 )
            // InternalLegisFacile.g:2766:2: rule__Final__Group__1__Impl rule__Final__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Final__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__1"


    // $ANTLR start "rule__Final__Group__1__Impl"
    // InternalLegisFacile.g:2773:1: rule__Final__Group__1__Impl : ( '{' ) ;
    public final void rule__Final__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2777:1: ( ( '{' ) )
            // InternalLegisFacile.g:2778:1: ( '{' )
            {
            // InternalLegisFacile.g:2778:1: ( '{' )
            // InternalLegisFacile.g:2779:2: '{'
            {
             before(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__1__Impl"


    // $ANTLR start "rule__Final__Group__2"
    // InternalLegisFacile.g:2788:1: rule__Final__Group__2 : rule__Final__Group__2__Impl ;
    public final void rule__Final__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2792:1: ( rule__Final__Group__2__Impl )
            // InternalLegisFacile.g:2793:2: rule__Final__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__2"


    // $ANTLR start "rule__Final__Group__2__Impl"
    // InternalLegisFacile.g:2799:1: rule__Final__Group__2__Impl : ( '}' ) ;
    public final void rule__Final__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2803:1: ( ( '}' ) )
            // InternalLegisFacile.g:2804:1: ( '}' )
            {
            // InternalLegisFacile.g:2804:1: ( '}' )
            // InternalLegisFacile.g:2805:2: '}'
            {
             before(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__2__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalLegisFacile.g:2815:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2819:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalLegisFacile.g:2820:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalLegisFacile.g:2827:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2831:1: ( ( 'datatype' ) )
            // InternalLegisFacile.g:2832:1: ( 'datatype' )
            {
            // InternalLegisFacile.g:2832:1: ( 'datatype' )
            // InternalLegisFacile.g:2833:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalLegisFacile.g:2842:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2846:1: ( rule__DataType__Group__1__Impl )
            // InternalLegisFacile.g:2847:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalLegisFacile.g:2853:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2857:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalLegisFacile.g:2858:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalLegisFacile.g:2858:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalLegisFacile.g:2859:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalLegisFacile.g:2860:2: ( rule__DataType__NameAssignment_1 )
            // InternalLegisFacile.g:2860:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalLegisFacile.g:2869:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2873:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalLegisFacile.g:2874:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalLegisFacile.g:2881:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2885:1: ( ( 'entity' ) )
            // InternalLegisFacile.g:2886:1: ( 'entity' )
            {
            // InternalLegisFacile.g:2886:1: ( 'entity' )
            // InternalLegisFacile.g:2887:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalLegisFacile.g:2896:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2900:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalLegisFacile.g:2901:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalLegisFacile.g:2908:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2912:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalLegisFacile.g:2913:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalLegisFacile.g:2913:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalLegisFacile.g:2914:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalLegisFacile.g:2915:2: ( rule__Entity__NameAssignment_1 )
            // InternalLegisFacile.g:2915:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalLegisFacile.g:2923:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2927:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalLegisFacile.g:2928:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalLegisFacile.g:2935:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2939:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalLegisFacile.g:2940:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalLegisFacile.g:2940:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalLegisFacile.g:2941:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalLegisFacile.g:2942:2: ( rule__Entity__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLegisFacile.g:2942:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalLegisFacile.g:2950:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2954:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalLegisFacile.g:2955:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalLegisFacile.g:2962:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2966:1: ( ( '{' ) )
            // InternalLegisFacile.g:2967:1: ( '{' )
            {
            // InternalLegisFacile.g:2967:1: ( '{' )
            // InternalLegisFacile.g:2968:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalLegisFacile.g:2977:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2981:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalLegisFacile.g:2982:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalLegisFacile.g:2989:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FeaturesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2993:1: ( ( ( rule__Entity__FeaturesAssignment_4 )* ) )
            // InternalLegisFacile.g:2994:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            {
            // InternalLegisFacile.g:2994:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            // InternalLegisFacile.g:2995:2: ( rule__Entity__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // InternalLegisFacile.g:2996:2: ( rule__Entity__FeaturesAssignment_4 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==44) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalLegisFacile.g:2996:3: rule__Entity__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Entity__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalLegisFacile.g:3004:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3008:1: ( rule__Entity__Group__5__Impl )
            // InternalLegisFacile.g:3009:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalLegisFacile.g:3015:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3019:1: ( ( '}' ) )
            // InternalLegisFacile.g:3020:1: ( '}' )
            {
            // InternalLegisFacile.g:3020:1: ( '}' )
            // InternalLegisFacile.g:3021:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalLegisFacile.g:3031:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3035:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalLegisFacile.g:3036:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalLegisFacile.g:3043:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3047:1: ( ( 'extends' ) )
            // InternalLegisFacile.g:3048:1: ( 'extends' )
            {
            // InternalLegisFacile.g:3048:1: ( 'extends' )
            // InternalLegisFacile.g:3049:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalLegisFacile.g:3058:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3062:1: ( rule__Entity__Group_2__1__Impl )
            // InternalLegisFacile.g:3063:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalLegisFacile.g:3069:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3073:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // InternalLegisFacile.g:3074:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // InternalLegisFacile.g:3074:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // InternalLegisFacile.g:3075:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // InternalLegisFacile.g:3076:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            // InternalLegisFacile.g:3076:3: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalLegisFacile.g:3085:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3089:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalLegisFacile.g:3090:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalLegisFacile.g:3097:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__ManyAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3101:1: ( ( ( rule__Feature__ManyAssignment_0 )? ) )
            // InternalLegisFacile.g:3102:1: ( ( rule__Feature__ManyAssignment_0 )? )
            {
            // InternalLegisFacile.g:3102:1: ( ( rule__Feature__ManyAssignment_0 )? )
            // InternalLegisFacile.g:3103:2: ( rule__Feature__ManyAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getManyAssignment_0()); 
            // InternalLegisFacile.g:3104:2: ( rule__Feature__ManyAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalLegisFacile.g:3104:3: rule__Feature__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getManyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalLegisFacile.g:3112:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3116:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalLegisFacile.g:3117:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalLegisFacile.g:3124:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3128:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalLegisFacile.g:3129:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalLegisFacile.g:3129:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalLegisFacile.g:3130:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalLegisFacile.g:3131:2: ( rule__Feature__NameAssignment_1 )
            // InternalLegisFacile.g:3131:3: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalLegisFacile.g:3139:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3143:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalLegisFacile.g:3144:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalLegisFacile.g:3151:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3155:1: ( ( ':' ) )
            // InternalLegisFacile.g:3156:1: ( ':' )
            {
            // InternalLegisFacile.g:3156:1: ( ':' )
            // InternalLegisFacile.g:3157:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalLegisFacile.g:3166:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3170:1: ( rule__Feature__Group__3__Impl )
            // InternalLegisFacile.g:3171:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalLegisFacile.g:3177:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3181:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // InternalLegisFacile.g:3182:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // InternalLegisFacile.g:3182:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // InternalLegisFacile.g:3183:2: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // InternalLegisFacile.g:3184:2: ( rule__Feature__TypeAssignment_3 )
            // InternalLegisFacile.g:3184:3: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Lei__ElementsAssignment"
    // InternalLegisFacile.g:3193:1: rule__Lei__ElementsAssignment : ( ruleType ) ;
    public final void rule__Lei__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3197:1: ( ( ruleType ) )
            // InternalLegisFacile.g:3198:2: ( ruleType )
            {
            // InternalLegisFacile.g:3198:2: ( ruleType )
            // InternalLegisFacile.g:3199:3: ruleType
            {
             before(grammarAccess.getLeiAccess().getElementsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getLeiAccess().getElementsTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lei__ElementsAssignment"


    // $ANTLR start "rule__Type__PreliminarAssignment_2_0"
    // InternalLegisFacile.g:3208:1: rule__Type__PreliminarAssignment_2_0 : ( rulePreliminar ) ;
    public final void rule__Type__PreliminarAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3212:1: ( ( rulePreliminar ) )
            // InternalLegisFacile.g:3213:2: ( rulePreliminar )
            {
            // InternalLegisFacile.g:3213:2: ( rulePreliminar )
            // InternalLegisFacile.g:3214:3: rulePreliminar
            {
             before(grammarAccess.getTypeAccess().getPreliminarPreliminarParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            rulePreliminar();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getPreliminarPreliminarParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__PreliminarAssignment_2_0"


    // $ANTLR start "rule__Type__NormativaAssignment_2_1"
    // InternalLegisFacile.g:3223:1: rule__Type__NormativaAssignment_2_1 : ( ruleNormativa ) ;
    public final void rule__Type__NormativaAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3227:1: ( ( ruleNormativa ) )
            // InternalLegisFacile.g:3228:2: ( ruleNormativa )
            {
            // InternalLegisFacile.g:3228:2: ( ruleNormativa )
            // InternalLegisFacile.g:3229:3: ruleNormativa
            {
             before(grammarAccess.getTypeAccess().getNormativaNormativaParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNormativa();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getNormativaNormativaParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NormativaAssignment_2_1"


    // $ANTLR start "rule__Type__FinalAssignment_2_2"
    // InternalLegisFacile.g:3238:1: rule__Type__FinalAssignment_2_2 : ( ruleFinal ) ;
    public final void rule__Type__FinalAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3242:1: ( ( ruleFinal ) )
            // InternalLegisFacile.g:3243:2: ( ruleFinal )
            {
            // InternalLegisFacile.g:3243:2: ( ruleFinal )
            // InternalLegisFacile.g:3244:3: ruleFinal
            {
             before(grammarAccess.getTypeAccess().getFinalFinalParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFinal();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getFinalFinalParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__FinalAssignment_2_2"


    // $ANTLR start "rule__Preliminar__EpigrageAssignment_2"
    // InternalLegisFacile.g:3253:1: rule__Preliminar__EpigrageAssignment_2 : ( ruleEpigrafe ) ;
    public final void rule__Preliminar__EpigrageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3257:1: ( ( ruleEpigrafe ) )
            // InternalLegisFacile.g:3258:2: ( ruleEpigrafe )
            {
            // InternalLegisFacile.g:3258:2: ( ruleEpigrafe )
            // InternalLegisFacile.g:3259:3: ruleEpigrafe
            {
             before(grammarAccess.getPreliminarAccess().getEpigrageEpigrafeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEpigrafe();

            state._fsp--;

             after(grammarAccess.getPreliminarAccess().getEpigrageEpigrafeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__EpigrageAssignment_2"


    // $ANTLR start "rule__Preliminar__EmentaAssignment_4"
    // InternalLegisFacile.g:3268:1: rule__Preliminar__EmentaAssignment_4 : ( ruleEmenta ) ;
    public final void rule__Preliminar__EmentaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3272:1: ( ( ruleEmenta ) )
            // InternalLegisFacile.g:3273:2: ( ruleEmenta )
            {
            // InternalLegisFacile.g:3273:2: ( ruleEmenta )
            // InternalLegisFacile.g:3274:3: ruleEmenta
            {
             before(grammarAccess.getPreliminarAccess().getEmentaEmentaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEmenta();

            state._fsp--;

             after(grammarAccess.getPreliminarAccess().getEmentaEmentaParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__EmentaAssignment_4"


    // $ANTLR start "rule__Preliminar__PreambuloAssignment_6"
    // InternalLegisFacile.g:3283:1: rule__Preliminar__PreambuloAssignment_6 : ( rulePreambulo ) ;
    public final void rule__Preliminar__PreambuloAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3287:1: ( ( rulePreambulo ) )
            // InternalLegisFacile.g:3288:2: ( rulePreambulo )
            {
            // InternalLegisFacile.g:3288:2: ( rulePreambulo )
            // InternalLegisFacile.g:3289:3: rulePreambulo
            {
             before(grammarAccess.getPreliminarAccess().getPreambuloPreambuloParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePreambulo();

            state._fsp--;

             after(grammarAccess.getPreliminarAccess().getPreambuloPreambuloParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preliminar__PreambuloAssignment_6"


    // $ANTLR start "rule__Epigrafe__AtoAssignment_2"
    // InternalLegisFacile.g:3298:1: rule__Epigrafe__AtoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Epigrafe__AtoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3302:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3303:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3303:2: ( RULE_STRING )
            // InternalLegisFacile.g:3304:3: RULE_STRING
            {
             before(grammarAccess.getEpigrafeAccess().getAtoSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEpigrafeAccess().getAtoSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__AtoAssignment_2"


    // $ANTLR start "rule__Epigrafe__NumeroAssignment_4"
    // InternalLegisFacile.g:3313:1: rule__Epigrafe__NumeroAssignment_4 : ( RULE_INT ) ;
    public final void rule__Epigrafe__NumeroAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3317:1: ( ( RULE_INT ) )
            // InternalLegisFacile.g:3318:2: ( RULE_INT )
            {
            // InternalLegisFacile.g:3318:2: ( RULE_INT )
            // InternalLegisFacile.g:3319:3: RULE_INT
            {
             before(grammarAccess.getEpigrafeAccess().getNumeroINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEpigrafeAccess().getNumeroINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__NumeroAssignment_4"


    // $ANTLR start "rule__Epigrafe__AnoAssignment_6"
    // InternalLegisFacile.g:3328:1: rule__Epigrafe__AnoAssignment_6 : ( RULE_INT ) ;
    public final void rule__Epigrafe__AnoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3332:1: ( ( RULE_INT ) )
            // InternalLegisFacile.g:3333:2: ( RULE_INT )
            {
            // InternalLegisFacile.g:3333:2: ( RULE_INT )
            // InternalLegisFacile.g:3334:3: RULE_INT
            {
             before(grammarAccess.getEpigrafeAccess().getAnoINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEpigrafeAccess().getAnoINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Epigrafe__AnoAssignment_6"


    // $ANTLR start "rule__Ementa__EmentaAssignment_2"
    // InternalLegisFacile.g:3343:1: rule__Ementa__EmentaAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Ementa__EmentaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3347:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3348:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3348:2: ( RULE_STRING )
            // InternalLegisFacile.g:3349:3: RULE_STRING
            {
             before(grammarAccess.getEmentaAccess().getEmentaSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEmentaAccess().getEmentaSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ementa__EmentaAssignment_2"


    // $ANTLR start "rule__Preambulo__PreambuloAssignment_2"
    // InternalLegisFacile.g:3358:1: rule__Preambulo__PreambuloAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Preambulo__PreambuloAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3362:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3363:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3363:2: ( RULE_STRING )
            // InternalLegisFacile.g:3364:3: RULE_STRING
            {
             before(grammarAccess.getPreambuloAccess().getPreambuloSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPreambuloAccess().getPreambuloSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preambulo__PreambuloAssignment_2"


    // $ANTLR start "rule__Normativa__ArtigosAssignment_2"
    // InternalLegisFacile.g:3373:1: rule__Normativa__ArtigosAssignment_2 : ( ruleArtigo ) ;
    public final void rule__Normativa__ArtigosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3377:1: ( ( ruleArtigo ) )
            // InternalLegisFacile.g:3378:2: ( ruleArtigo )
            {
            // InternalLegisFacile.g:3378:2: ( ruleArtigo )
            // InternalLegisFacile.g:3379:3: ruleArtigo
            {
             before(grammarAccess.getNormativaAccess().getArtigosArtigoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArtigo();

            state._fsp--;

             after(grammarAccess.getNormativaAccess().getArtigosArtigoParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normativa__ArtigosAssignment_2"


    // $ANTLR start "rule__Artigo__CaputAssignment_2"
    // InternalLegisFacile.g:3388:1: rule__Artigo__CaputAssignment_2 : ( ruleCaput ) ;
    public final void rule__Artigo__CaputAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3392:1: ( ( ruleCaput ) )
            // InternalLegisFacile.g:3393:2: ( ruleCaput )
            {
            // InternalLegisFacile.g:3393:2: ( ruleCaput )
            // InternalLegisFacile.g:3394:3: ruleCaput
            {
             before(grammarAccess.getArtigoAccess().getCaputCaputParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCaput();

            state._fsp--;

             after(grammarAccess.getArtigoAccess().getCaputCaputParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__CaputAssignment_2"


    // $ANTLR start "rule__Artigo__ParagrafosAssignment_3"
    // InternalLegisFacile.g:3403:1: rule__Artigo__ParagrafosAssignment_3 : ( ruleParagrafo ) ;
    public final void rule__Artigo__ParagrafosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3407:1: ( ( ruleParagrafo ) )
            // InternalLegisFacile.g:3408:2: ( ruleParagrafo )
            {
            // InternalLegisFacile.g:3408:2: ( ruleParagrafo )
            // InternalLegisFacile.g:3409:3: ruleParagrafo
            {
             before(grammarAccess.getArtigoAccess().getParagrafosParagrafoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParagrafo();

            state._fsp--;

             after(grammarAccess.getArtigoAccess().getParagrafosParagrafoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__ParagrafosAssignment_3"


    // $ANTLR start "rule__Caput__TextoAssignment_2"
    // InternalLegisFacile.g:3418:1: rule__Caput__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Caput__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3422:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3423:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3423:2: ( RULE_STRING )
            // InternalLegisFacile.g:3424:3: RULE_STRING
            {
             before(grammarAccess.getCaputAccess().getTextoSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCaputAccess().getTextoSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__TextoAssignment_2"


    // $ANTLR start "rule__Caput__IncisosAssignment_4_1"
    // InternalLegisFacile.g:3433:1: rule__Caput__IncisosAssignment_4_1 : ( ruleInciso ) ;
    public final void rule__Caput__IncisosAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3437:1: ( ( ruleInciso ) )
            // InternalLegisFacile.g:3438:2: ( ruleInciso )
            {
            // InternalLegisFacile.g:3438:2: ( ruleInciso )
            // InternalLegisFacile.g:3439:3: ruleInciso
            {
             before(grammarAccess.getCaputAccess().getIncisosIncisoParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInciso();

            state._fsp--;

             after(grammarAccess.getCaputAccess().getIncisosIncisoParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__IncisosAssignment_4_1"


    // $ANTLR start "rule__Paragrafo__TextoAssignment_2"
    // InternalLegisFacile.g:3448:1: rule__Paragrafo__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Paragrafo__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3452:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3453:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3453:2: ( RULE_STRING )
            // InternalLegisFacile.g:3454:3: RULE_STRING
            {
             before(grammarAccess.getParagrafoAccess().getTextoSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParagrafoAccess().getTextoSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__TextoAssignment_2"


    // $ANTLR start "rule__Paragrafo__IncisosAssignment_4_1"
    // InternalLegisFacile.g:3463:1: rule__Paragrafo__IncisosAssignment_4_1 : ( ruleInciso ) ;
    public final void rule__Paragrafo__IncisosAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3467:1: ( ( ruleInciso ) )
            // InternalLegisFacile.g:3468:2: ( ruleInciso )
            {
            // InternalLegisFacile.g:3468:2: ( ruleInciso )
            // InternalLegisFacile.g:3469:3: ruleInciso
            {
             before(grammarAccess.getParagrafoAccess().getIncisosIncisoParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInciso();

            state._fsp--;

             after(grammarAccess.getParagrafoAccess().getIncisosIncisoParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__IncisosAssignment_4_1"


    // $ANTLR start "rule__Inciso__TextoAssignment_2"
    // InternalLegisFacile.g:3478:1: rule__Inciso__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Inciso__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3482:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3483:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3483:2: ( RULE_STRING )
            // InternalLegisFacile.g:3484:3: RULE_STRING
            {
             before(grammarAccess.getIncisoAccess().getTextoSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIncisoAccess().getTextoSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__TextoAssignment_2"


    // $ANTLR start "rule__Inciso__AlineasAssignment_4_1"
    // InternalLegisFacile.g:3493:1: rule__Inciso__AlineasAssignment_4_1 : ( ruleAlinea ) ;
    public final void rule__Inciso__AlineasAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3497:1: ( ( ruleAlinea ) )
            // InternalLegisFacile.g:3498:2: ( ruleAlinea )
            {
            // InternalLegisFacile.g:3498:2: ( ruleAlinea )
            // InternalLegisFacile.g:3499:3: ruleAlinea
            {
             before(grammarAccess.getIncisoAccess().getAlineasAlineaParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAlinea();

            state._fsp--;

             after(grammarAccess.getIncisoAccess().getAlineasAlineaParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inciso__AlineasAssignment_4_1"


    // $ANTLR start "rule__Alinea__TextoAssignment_2"
    // InternalLegisFacile.g:3508:1: rule__Alinea__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Alinea__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3512:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3513:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3513:2: ( RULE_STRING )
            // InternalLegisFacile.g:3514:3: RULE_STRING
            {
             before(grammarAccess.getAlineaAccess().getTextoSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAlineaAccess().getTextoSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__TextoAssignment_2"


    // $ANTLR start "rule__Alinea__ItensAssignment_4_1"
    // InternalLegisFacile.g:3523:1: rule__Alinea__ItensAssignment_4_1 : ( ruleItem ) ;
    public final void rule__Alinea__ItensAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3527:1: ( ( ruleItem ) )
            // InternalLegisFacile.g:3528:2: ( ruleItem )
            {
            // InternalLegisFacile.g:3528:2: ( ruleItem )
            // InternalLegisFacile.g:3529:3: ruleItem
            {
             before(grammarAccess.getAlineaAccess().getItensItemParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getAlineaAccess().getItensItemParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alinea__ItensAssignment_4_1"


    // $ANTLR start "rule__Item__TextoAssignment_2"
    // InternalLegisFacile.g:3538:1: rule__Item__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Item__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3542:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3543:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3543:2: ( RULE_STRING )
            // InternalLegisFacile.g:3544:3: RULE_STRING
            {
             before(grammarAccess.getItemAccess().getTextoSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getTextoSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__TextoAssignment_2"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalLegisFacile.g:3553:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3557:1: ( ( RULE_ID ) )
            // InternalLegisFacile.g:3558:2: ( RULE_ID )
            {
            // InternalLegisFacile.g:3558:2: ( RULE_ID )
            // InternalLegisFacile.g:3559:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalLegisFacile.g:3568:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3572:1: ( ( RULE_ID ) )
            // InternalLegisFacile.g:3573:2: ( RULE_ID )
            {
            // InternalLegisFacile.g:3573:2: ( RULE_ID )
            // InternalLegisFacile.g:3574:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // InternalLegisFacile.g:3583:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3587:1: ( ( ( RULE_ID ) ) )
            // InternalLegisFacile.g:3588:2: ( ( RULE_ID ) )
            {
            // InternalLegisFacile.g:3588:2: ( ( RULE_ID ) )
            // InternalLegisFacile.g:3589:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // InternalLegisFacile.g:3590:3: ( RULE_ID )
            // InternalLegisFacile.g:3591:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_4"
    // InternalLegisFacile.g:3602:1: rule__Entity__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3606:1: ( ( ruleFeature ) )
            // InternalLegisFacile.g:3607:2: ( ruleFeature )
            {
            // InternalLegisFacile.g:3607:2: ( ruleFeature )
            // InternalLegisFacile.g:3608:3: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_4"


    // $ANTLR start "rule__Feature__ManyAssignment_0"
    // InternalLegisFacile.g:3617:1: rule__Feature__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Feature__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3621:1: ( ( ( 'many' ) ) )
            // InternalLegisFacile.g:3622:2: ( ( 'many' ) )
            {
            // InternalLegisFacile.g:3622:2: ( ( 'many' ) )
            // InternalLegisFacile.g:3623:3: ( 'many' )
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            // InternalLegisFacile.g:3624:3: ( 'many' )
            // InternalLegisFacile.g:3625:4: 'many'
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ManyAssignment_0"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // InternalLegisFacile.g:3636:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3640:1: ( ( RULE_ID ) )
            // InternalLegisFacile.g:3641:2: ( RULE_ID )
            {
            // InternalLegisFacile.g:3641:2: ( RULE_ID )
            // InternalLegisFacile.g:3642:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__TypeAssignment_3"
    // InternalLegisFacile.g:3651:1: rule__Feature__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3655:1: ( ( ( RULE_ID ) ) )
            // InternalLegisFacile.g:3656:2: ( ( RULE_ID ) )
            {
            // InternalLegisFacile.g:3656:2: ( ( RULE_ID ) )
            // InternalLegisFacile.g:3657:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 
            // InternalLegisFacile.g:3658:3: ( RULE_ID )
            // InternalLegisFacile.g:3659:4: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000030000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002006000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002018000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002060000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002180000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000102000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000042L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});

}