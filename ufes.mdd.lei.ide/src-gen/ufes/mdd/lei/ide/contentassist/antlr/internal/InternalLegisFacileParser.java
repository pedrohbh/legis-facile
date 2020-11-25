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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Preliminar'", "'preliminar'", "'Epigrafe'", "'epigrafe'", "'Ementa'", "'ementa'", "'Preambulo'", "'preambulo'", "'Normativa'", "'normativa'", "'Artigo'", "'artigo'", "'Paragrafo'", "'paragrafo'", "'alinea'", "'Alinea'", "'Item'", "'item'", "'Final'", "'final'", "'{'", "','", "'}'", "'('", "')'", "'Caput|caput'", "'datatype'", "'entity'", "'extends'", "':'", "'many'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

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

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=37 && LA1_0<=38)) ) {
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


    // $ANTLR start "entryRuleAlinea"
    // InternalLegisFacile.g:303:1: entryRuleAlinea : ruleAlinea EOF ;
    public final void entryRuleAlinea() throws RecognitionException {
        try {
            // InternalLegisFacile.g:304:1: ( ruleAlinea EOF )
            // InternalLegisFacile.g:305:1: ruleAlinea EOF
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
    // InternalLegisFacile.g:312:1: ruleAlinea : ( ( rule__Alinea__Group__0 ) ) ;
    public final void ruleAlinea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:316:2: ( ( ( rule__Alinea__Group__0 ) ) )
            // InternalLegisFacile.g:317:2: ( ( rule__Alinea__Group__0 ) )
            {
            // InternalLegisFacile.g:317:2: ( ( rule__Alinea__Group__0 ) )
            // InternalLegisFacile.g:318:3: ( rule__Alinea__Group__0 )
            {
             before(grammarAccess.getAlineaAccess().getGroup()); 
            // InternalLegisFacile.g:319:3: ( rule__Alinea__Group__0 )
            // InternalLegisFacile.g:319:4: rule__Alinea__Group__0
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
    // InternalLegisFacile.g:328:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalLegisFacile.g:329:1: ( ruleItem EOF )
            // InternalLegisFacile.g:330:1: ruleItem EOF
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
    // InternalLegisFacile.g:337:1: ruleItem : ( ( rule__Item__Group__0 ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:341:2: ( ( ( rule__Item__Group__0 ) ) )
            // InternalLegisFacile.g:342:2: ( ( rule__Item__Group__0 ) )
            {
            // InternalLegisFacile.g:342:2: ( ( rule__Item__Group__0 ) )
            // InternalLegisFacile.g:343:3: ( rule__Item__Group__0 )
            {
             before(grammarAccess.getItemAccess().getGroup()); 
            // InternalLegisFacile.g:344:3: ( rule__Item__Group__0 )
            // InternalLegisFacile.g:344:4: rule__Item__Group__0
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
    // InternalLegisFacile.g:353:1: entryRuleFinal : ruleFinal EOF ;
    public final void entryRuleFinal() throws RecognitionException {
        try {
            // InternalLegisFacile.g:354:1: ( ruleFinal EOF )
            // InternalLegisFacile.g:355:1: ruleFinal EOF
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
    // InternalLegisFacile.g:362:1: ruleFinal : ( ( rule__Final__Group__0 ) ) ;
    public final void ruleFinal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:366:2: ( ( ( rule__Final__Group__0 ) ) )
            // InternalLegisFacile.g:367:2: ( ( rule__Final__Group__0 ) )
            {
            // InternalLegisFacile.g:367:2: ( ( rule__Final__Group__0 ) )
            // InternalLegisFacile.g:368:3: ( rule__Final__Group__0 )
            {
             before(grammarAccess.getFinalAccess().getGroup()); 
            // InternalLegisFacile.g:369:3: ( rule__Final__Group__0 )
            // InternalLegisFacile.g:369:4: rule__Final__Group__0
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
    // InternalLegisFacile.g:378:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalLegisFacile.g:379:1: ( ruleDataType EOF )
            // InternalLegisFacile.g:380:1: ruleDataType EOF
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
    // InternalLegisFacile.g:387:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:391:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalLegisFacile.g:392:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalLegisFacile.g:392:2: ( ( rule__DataType__Group__0 ) )
            // InternalLegisFacile.g:393:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalLegisFacile.g:394:3: ( rule__DataType__Group__0 )
            // InternalLegisFacile.g:394:4: rule__DataType__Group__0
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
    // InternalLegisFacile.g:403:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalLegisFacile.g:404:1: ( ruleEntity EOF )
            // InternalLegisFacile.g:405:1: ruleEntity EOF
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
    // InternalLegisFacile.g:412:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:416:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalLegisFacile.g:417:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalLegisFacile.g:417:2: ( ( rule__Entity__Group__0 ) )
            // InternalLegisFacile.g:418:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalLegisFacile.g:419:3: ( rule__Entity__Group__0 )
            // InternalLegisFacile.g:419:4: rule__Entity__Group__0
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
    // InternalLegisFacile.g:428:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalLegisFacile.g:429:1: ( ruleFeature EOF )
            // InternalLegisFacile.g:430:1: ruleFeature EOF
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
    // InternalLegisFacile.g:437:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:441:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalLegisFacile.g:442:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalLegisFacile.g:442:2: ( ( rule__Feature__Group__0 ) )
            // InternalLegisFacile.g:443:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalLegisFacile.g:444:3: ( rule__Feature__Group__0 )
            // InternalLegisFacile.g:444:4: rule__Feature__Group__0
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
    // InternalLegisFacile.g:452:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) | ( ( rule__Type__Group_2__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:456:1: ( ( ruleDataType ) | ( ruleEntity ) | ( ( rule__Type__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt2=1;
                }
                break;
            case 38:
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
                    // InternalLegisFacile.g:457:2: ( ruleDataType )
                    {
                    // InternalLegisFacile.g:457:2: ( ruleDataType )
                    // InternalLegisFacile.g:458:3: ruleDataType
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
                    // InternalLegisFacile.g:463:2: ( ruleEntity )
                    {
                    // InternalLegisFacile.g:463:2: ( ruleEntity )
                    // InternalLegisFacile.g:464:3: ruleEntity
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
                    // InternalLegisFacile.g:469:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalLegisFacile.g:469:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalLegisFacile.g:470:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalLegisFacile.g:471:3: ( rule__Type__Group_2__0 )
                    // InternalLegisFacile.g:471:4: rule__Type__Group_2__0
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
    // InternalLegisFacile.g:479:1: rule__Preliminar__Alternatives_0 : ( ( 'Preliminar' ) | ( 'preliminar' ) );
    public final void rule__Preliminar__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:483:1: ( ( 'Preliminar' ) | ( 'preliminar' ) )
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
                    // InternalLegisFacile.g:484:2: ( 'Preliminar' )
                    {
                    // InternalLegisFacile.g:484:2: ( 'Preliminar' )
                    // InternalLegisFacile.g:485:3: 'Preliminar'
                    {
                     before(grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:490:2: ( 'preliminar' )
                    {
                    // InternalLegisFacile.g:490:2: ( 'preliminar' )
                    // InternalLegisFacile.g:491:3: 'preliminar'
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
    // InternalLegisFacile.g:500:1: rule__Epigrafe__Alternatives_0 : ( ( 'Epigrafe' ) | ( 'epigrafe' ) );
    public final void rule__Epigrafe__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:504:1: ( ( 'Epigrafe' ) | ( 'epigrafe' ) )
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
                    // InternalLegisFacile.g:505:2: ( 'Epigrafe' )
                    {
                    // InternalLegisFacile.g:505:2: ( 'Epigrafe' )
                    // InternalLegisFacile.g:506:3: 'Epigrafe'
                    {
                     before(grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:511:2: ( 'epigrafe' )
                    {
                    // InternalLegisFacile.g:511:2: ( 'epigrafe' )
                    // InternalLegisFacile.g:512:3: 'epigrafe'
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
    // InternalLegisFacile.g:521:1: rule__Ementa__Alternatives_0 : ( ( 'Ementa' ) | ( 'ementa' ) );
    public final void rule__Ementa__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:525:1: ( ( 'Ementa' ) | ( 'ementa' ) )
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
                    // InternalLegisFacile.g:526:2: ( 'Ementa' )
                    {
                    // InternalLegisFacile.g:526:2: ( 'Ementa' )
                    // InternalLegisFacile.g:527:3: 'Ementa'
                    {
                     before(grammarAccess.getEmentaAccess().getEmentaKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEmentaAccess().getEmentaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:532:2: ( 'ementa' )
                    {
                    // InternalLegisFacile.g:532:2: ( 'ementa' )
                    // InternalLegisFacile.g:533:3: 'ementa'
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
    // InternalLegisFacile.g:542:1: rule__Preambulo__Alternatives_0 : ( ( 'Preambulo' ) | ( 'preambulo' ) );
    public final void rule__Preambulo__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:546:1: ( ( 'Preambulo' ) | ( 'preambulo' ) )
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
                    // InternalLegisFacile.g:547:2: ( 'Preambulo' )
                    {
                    // InternalLegisFacile.g:547:2: ( 'Preambulo' )
                    // InternalLegisFacile.g:548:3: 'Preambulo'
                    {
                     before(grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:553:2: ( 'preambulo' )
                    {
                    // InternalLegisFacile.g:553:2: ( 'preambulo' )
                    // InternalLegisFacile.g:554:3: 'preambulo'
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
    // InternalLegisFacile.g:563:1: rule__Normativa__Alternatives_0 : ( ( 'Normativa' ) | ( 'normativa' ) );
    public final void rule__Normativa__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:567:1: ( ( 'Normativa' ) | ( 'normativa' ) )
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
                    // InternalLegisFacile.g:568:2: ( 'Normativa' )
                    {
                    // InternalLegisFacile.g:568:2: ( 'Normativa' )
                    // InternalLegisFacile.g:569:3: 'Normativa'
                    {
                     before(grammarAccess.getNormativaAccess().getNormativaKeyword_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getNormativaAccess().getNormativaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:574:2: ( 'normativa' )
                    {
                    // InternalLegisFacile.g:574:2: ( 'normativa' )
                    // InternalLegisFacile.g:575:3: 'normativa'
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
    // InternalLegisFacile.g:584:1: rule__Artigo__Alternatives_0 : ( ( 'Artigo' ) | ( 'artigo' ) );
    public final void rule__Artigo__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:588:1: ( ( 'Artigo' ) | ( 'artigo' ) )
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
                    // InternalLegisFacile.g:589:2: ( 'Artigo' )
                    {
                    // InternalLegisFacile.g:589:2: ( 'Artigo' )
                    // InternalLegisFacile.g:590:3: 'Artigo'
                    {
                     before(grammarAccess.getArtigoAccess().getArtigoKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getArtigoAccess().getArtigoKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:595:2: ( 'artigo' )
                    {
                    // InternalLegisFacile.g:595:2: ( 'artigo' )
                    // InternalLegisFacile.g:596:3: 'artigo'
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


    // $ANTLR start "rule__Paragrafo__Alternatives_0"
    // InternalLegisFacile.g:605:1: rule__Paragrafo__Alternatives_0 : ( ( 'Paragrafo' ) | ( 'paragrafo' ) );
    public final void rule__Paragrafo__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:609:1: ( ( 'Paragrafo' ) | ( 'paragrafo' ) )
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
                    // InternalLegisFacile.g:610:2: ( 'Paragrafo' )
                    {
                    // InternalLegisFacile.g:610:2: ( 'Paragrafo' )
                    // InternalLegisFacile.g:611:3: 'Paragrafo'
                    {
                     before(grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:616:2: ( 'paragrafo' )
                    {
                    // InternalLegisFacile.g:616:2: ( 'paragrafo' )
                    // InternalLegisFacile.g:617:3: 'paragrafo'
                    {
                     before(grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_1()); 
                    match(input,24,FOLLOW_2); 
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


    // $ANTLR start "rule__Alinea__Alternatives_0"
    // InternalLegisFacile.g:626:1: rule__Alinea__Alternatives_0 : ( ( 'alinea' ) | ( 'Alinea' ) );
    public final void rule__Alinea__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:630:1: ( ( 'alinea' ) | ( 'Alinea' ) )
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
                    // InternalLegisFacile.g:631:2: ( 'alinea' )
                    {
                    // InternalLegisFacile.g:631:2: ( 'alinea' )
                    // InternalLegisFacile.g:632:3: 'alinea'
                    {
                     before(grammarAccess.getAlineaAccess().getAlineaKeyword_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getAlineaAccess().getAlineaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:637:2: ( 'Alinea' )
                    {
                    // InternalLegisFacile.g:637:2: ( 'Alinea' )
                    // InternalLegisFacile.g:638:3: 'Alinea'
                    {
                     before(grammarAccess.getAlineaAccess().getAlineaKeyword_0_1()); 
                    match(input,26,FOLLOW_2); 
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
    // InternalLegisFacile.g:647:1: rule__Item__Alternatives_0 : ( ( 'Item' ) | ( 'item' ) );
    public final void rule__Item__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:651:1: ( ( 'Item' ) | ( 'item' ) )
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
                    // InternalLegisFacile.g:652:2: ( 'Item' )
                    {
                    // InternalLegisFacile.g:652:2: ( 'Item' )
                    // InternalLegisFacile.g:653:3: 'Item'
                    {
                     before(grammarAccess.getItemAccess().getItemKeyword_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getItemAccess().getItemKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:658:2: ( 'item' )
                    {
                    // InternalLegisFacile.g:658:2: ( 'item' )
                    // InternalLegisFacile.g:659:3: 'item'
                    {
                     before(grammarAccess.getItemAccess().getItemKeyword_0_1()); 
                    match(input,28,FOLLOW_2); 
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
    // InternalLegisFacile.g:668:1: rule__Final__Alternatives_0 : ( ( 'Final' ) | ( 'final' ) );
    public final void rule__Final__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:672:1: ( ( 'Final' ) | ( 'final' ) )
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
                    // InternalLegisFacile.g:673:2: ( 'Final' )
                    {
                    // InternalLegisFacile.g:673:2: ( 'Final' )
                    // InternalLegisFacile.g:674:3: 'Final'
                    {
                     before(grammarAccess.getFinalAccess().getFinalKeyword_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getFinalAccess().getFinalKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:679:2: ( 'final' )
                    {
                    // InternalLegisFacile.g:679:2: ( 'final' )
                    // InternalLegisFacile.g:680:3: 'final'
                    {
                     before(grammarAccess.getFinalAccess().getFinalKeyword_0_1()); 
                    match(input,30,FOLLOW_2); 
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
    // InternalLegisFacile.g:689:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:693:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalLegisFacile.g:694:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
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
    // InternalLegisFacile.g:701:1: rule__Type__Group_2__0__Impl : ( ( rule__Type__PreliminarAssignment_2_0 ) ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:705:1: ( ( ( rule__Type__PreliminarAssignment_2_0 ) ) )
            // InternalLegisFacile.g:706:1: ( ( rule__Type__PreliminarAssignment_2_0 ) )
            {
            // InternalLegisFacile.g:706:1: ( ( rule__Type__PreliminarAssignment_2_0 ) )
            // InternalLegisFacile.g:707:2: ( rule__Type__PreliminarAssignment_2_0 )
            {
             before(grammarAccess.getTypeAccess().getPreliminarAssignment_2_0()); 
            // InternalLegisFacile.g:708:2: ( rule__Type__PreliminarAssignment_2_0 )
            // InternalLegisFacile.g:708:3: rule__Type__PreliminarAssignment_2_0
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
    // InternalLegisFacile.g:716:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:720:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalLegisFacile.g:721:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
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
    // InternalLegisFacile.g:728:1: rule__Type__Group_2__1__Impl : ( ( rule__Type__NormativaAssignment_2_1 ) ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:732:1: ( ( ( rule__Type__NormativaAssignment_2_1 ) ) )
            // InternalLegisFacile.g:733:1: ( ( rule__Type__NormativaAssignment_2_1 ) )
            {
            // InternalLegisFacile.g:733:1: ( ( rule__Type__NormativaAssignment_2_1 ) )
            // InternalLegisFacile.g:734:2: ( rule__Type__NormativaAssignment_2_1 )
            {
             before(grammarAccess.getTypeAccess().getNormativaAssignment_2_1()); 
            // InternalLegisFacile.g:735:2: ( rule__Type__NormativaAssignment_2_1 )
            // InternalLegisFacile.g:735:3: rule__Type__NormativaAssignment_2_1
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
    // InternalLegisFacile.g:743:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:747:1: ( rule__Type__Group_2__2__Impl )
            // InternalLegisFacile.g:748:2: rule__Type__Group_2__2__Impl
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
    // InternalLegisFacile.g:754:1: rule__Type__Group_2__2__Impl : ( ( rule__Type__FinalAssignment_2_2 ) ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:758:1: ( ( ( rule__Type__FinalAssignment_2_2 ) ) )
            // InternalLegisFacile.g:759:1: ( ( rule__Type__FinalAssignment_2_2 ) )
            {
            // InternalLegisFacile.g:759:1: ( ( rule__Type__FinalAssignment_2_2 ) )
            // InternalLegisFacile.g:760:2: ( rule__Type__FinalAssignment_2_2 )
            {
             before(grammarAccess.getTypeAccess().getFinalAssignment_2_2()); 
            // InternalLegisFacile.g:761:2: ( rule__Type__FinalAssignment_2_2 )
            // InternalLegisFacile.g:761:3: rule__Type__FinalAssignment_2_2
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
    // InternalLegisFacile.g:770:1: rule__Preliminar__Group__0 : rule__Preliminar__Group__0__Impl rule__Preliminar__Group__1 ;
    public final void rule__Preliminar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:774:1: ( rule__Preliminar__Group__0__Impl rule__Preliminar__Group__1 )
            // InternalLegisFacile.g:775:2: rule__Preliminar__Group__0__Impl rule__Preliminar__Group__1
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
    // InternalLegisFacile.g:782:1: rule__Preliminar__Group__0__Impl : ( ( rule__Preliminar__Alternatives_0 ) ) ;
    public final void rule__Preliminar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:786:1: ( ( ( rule__Preliminar__Alternatives_0 ) ) )
            // InternalLegisFacile.g:787:1: ( ( rule__Preliminar__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:787:1: ( ( rule__Preliminar__Alternatives_0 ) )
            // InternalLegisFacile.g:788:2: ( rule__Preliminar__Alternatives_0 )
            {
             before(grammarAccess.getPreliminarAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:789:2: ( rule__Preliminar__Alternatives_0 )
            // InternalLegisFacile.g:789:3: rule__Preliminar__Alternatives_0
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
    // InternalLegisFacile.g:797:1: rule__Preliminar__Group__1 : rule__Preliminar__Group__1__Impl rule__Preliminar__Group__2 ;
    public final void rule__Preliminar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:801:1: ( rule__Preliminar__Group__1__Impl rule__Preliminar__Group__2 )
            // InternalLegisFacile.g:802:2: rule__Preliminar__Group__1__Impl rule__Preliminar__Group__2
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
    // InternalLegisFacile.g:809:1: rule__Preliminar__Group__1__Impl : ( '{' ) ;
    public final void rule__Preliminar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:813:1: ( ( '{' ) )
            // InternalLegisFacile.g:814:1: ( '{' )
            {
            // InternalLegisFacile.g:814:1: ( '{' )
            // InternalLegisFacile.g:815:2: '{'
            {
             before(grammarAccess.getPreliminarAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalLegisFacile.g:824:1: rule__Preliminar__Group__2 : rule__Preliminar__Group__2__Impl rule__Preliminar__Group__3 ;
    public final void rule__Preliminar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:828:1: ( rule__Preliminar__Group__2__Impl rule__Preliminar__Group__3 )
            // InternalLegisFacile.g:829:2: rule__Preliminar__Group__2__Impl rule__Preliminar__Group__3
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
    // InternalLegisFacile.g:836:1: rule__Preliminar__Group__2__Impl : ( ( rule__Preliminar__EpigrageAssignment_2 ) ) ;
    public final void rule__Preliminar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:840:1: ( ( ( rule__Preliminar__EpigrageAssignment_2 ) ) )
            // InternalLegisFacile.g:841:1: ( ( rule__Preliminar__EpigrageAssignment_2 ) )
            {
            // InternalLegisFacile.g:841:1: ( ( rule__Preliminar__EpigrageAssignment_2 ) )
            // InternalLegisFacile.g:842:2: ( rule__Preliminar__EpigrageAssignment_2 )
            {
             before(grammarAccess.getPreliminarAccess().getEpigrageAssignment_2()); 
            // InternalLegisFacile.g:843:2: ( rule__Preliminar__EpigrageAssignment_2 )
            // InternalLegisFacile.g:843:3: rule__Preliminar__EpigrageAssignment_2
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
    // InternalLegisFacile.g:851:1: rule__Preliminar__Group__3 : rule__Preliminar__Group__3__Impl rule__Preliminar__Group__4 ;
    public final void rule__Preliminar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:855:1: ( rule__Preliminar__Group__3__Impl rule__Preliminar__Group__4 )
            // InternalLegisFacile.g:856:2: rule__Preliminar__Group__3__Impl rule__Preliminar__Group__4
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
    // InternalLegisFacile.g:863:1: rule__Preliminar__Group__3__Impl : ( ',' ) ;
    public final void rule__Preliminar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:867:1: ( ( ',' ) )
            // InternalLegisFacile.g:868:1: ( ',' )
            {
            // InternalLegisFacile.g:868:1: ( ',' )
            // InternalLegisFacile.g:869:2: ','
            {
             before(grammarAccess.getPreliminarAccess().getCommaKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalLegisFacile.g:878:1: rule__Preliminar__Group__4 : rule__Preliminar__Group__4__Impl rule__Preliminar__Group__5 ;
    public final void rule__Preliminar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:882:1: ( rule__Preliminar__Group__4__Impl rule__Preliminar__Group__5 )
            // InternalLegisFacile.g:883:2: rule__Preliminar__Group__4__Impl rule__Preliminar__Group__5
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
    // InternalLegisFacile.g:890:1: rule__Preliminar__Group__4__Impl : ( ( rule__Preliminar__EmentaAssignment_4 ) ) ;
    public final void rule__Preliminar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:894:1: ( ( ( rule__Preliminar__EmentaAssignment_4 ) ) )
            // InternalLegisFacile.g:895:1: ( ( rule__Preliminar__EmentaAssignment_4 ) )
            {
            // InternalLegisFacile.g:895:1: ( ( rule__Preliminar__EmentaAssignment_4 ) )
            // InternalLegisFacile.g:896:2: ( rule__Preliminar__EmentaAssignment_4 )
            {
             before(grammarAccess.getPreliminarAccess().getEmentaAssignment_4()); 
            // InternalLegisFacile.g:897:2: ( rule__Preliminar__EmentaAssignment_4 )
            // InternalLegisFacile.g:897:3: rule__Preliminar__EmentaAssignment_4
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
    // InternalLegisFacile.g:905:1: rule__Preliminar__Group__5 : rule__Preliminar__Group__5__Impl rule__Preliminar__Group__6 ;
    public final void rule__Preliminar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:909:1: ( rule__Preliminar__Group__5__Impl rule__Preliminar__Group__6 )
            // InternalLegisFacile.g:910:2: rule__Preliminar__Group__5__Impl rule__Preliminar__Group__6
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
    // InternalLegisFacile.g:917:1: rule__Preliminar__Group__5__Impl : ( ',' ) ;
    public final void rule__Preliminar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:921:1: ( ( ',' ) )
            // InternalLegisFacile.g:922:1: ( ',' )
            {
            // InternalLegisFacile.g:922:1: ( ',' )
            // InternalLegisFacile.g:923:2: ','
            {
             before(grammarAccess.getPreliminarAccess().getCommaKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalLegisFacile.g:932:1: rule__Preliminar__Group__6 : rule__Preliminar__Group__6__Impl rule__Preliminar__Group__7 ;
    public final void rule__Preliminar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:936:1: ( rule__Preliminar__Group__6__Impl rule__Preliminar__Group__7 )
            // InternalLegisFacile.g:937:2: rule__Preliminar__Group__6__Impl rule__Preliminar__Group__7
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
    // InternalLegisFacile.g:944:1: rule__Preliminar__Group__6__Impl : ( ( rule__Preliminar__PreambuloAssignment_6 ) ) ;
    public final void rule__Preliminar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:948:1: ( ( ( rule__Preliminar__PreambuloAssignment_6 ) ) )
            // InternalLegisFacile.g:949:1: ( ( rule__Preliminar__PreambuloAssignment_6 ) )
            {
            // InternalLegisFacile.g:949:1: ( ( rule__Preliminar__PreambuloAssignment_6 ) )
            // InternalLegisFacile.g:950:2: ( rule__Preliminar__PreambuloAssignment_6 )
            {
             before(grammarAccess.getPreliminarAccess().getPreambuloAssignment_6()); 
            // InternalLegisFacile.g:951:2: ( rule__Preliminar__PreambuloAssignment_6 )
            // InternalLegisFacile.g:951:3: rule__Preliminar__PreambuloAssignment_6
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
    // InternalLegisFacile.g:959:1: rule__Preliminar__Group__7 : rule__Preliminar__Group__7__Impl rule__Preliminar__Group__8 ;
    public final void rule__Preliminar__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:963:1: ( rule__Preliminar__Group__7__Impl rule__Preliminar__Group__8 )
            // InternalLegisFacile.g:964:2: rule__Preliminar__Group__7__Impl rule__Preliminar__Group__8
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
    // InternalLegisFacile.g:971:1: rule__Preliminar__Group__7__Impl : ( ',' ) ;
    public final void rule__Preliminar__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:975:1: ( ( ',' ) )
            // InternalLegisFacile.g:976:1: ( ',' )
            {
            // InternalLegisFacile.g:976:1: ( ',' )
            // InternalLegisFacile.g:977:2: ','
            {
             before(grammarAccess.getPreliminarAccess().getCommaKeyword_7()); 
            match(input,32,FOLLOW_2); 
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
    // InternalLegisFacile.g:986:1: rule__Preliminar__Group__8 : rule__Preliminar__Group__8__Impl ;
    public final void rule__Preliminar__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:990:1: ( rule__Preliminar__Group__8__Impl )
            // InternalLegisFacile.g:991:2: rule__Preliminar__Group__8__Impl
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
    // InternalLegisFacile.g:997:1: rule__Preliminar__Group__8__Impl : ( '}' ) ;
    public final void rule__Preliminar__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1001:1: ( ( '}' ) )
            // InternalLegisFacile.g:1002:1: ( '}' )
            {
            // InternalLegisFacile.g:1002:1: ( '}' )
            // InternalLegisFacile.g:1003:2: '}'
            {
             before(grammarAccess.getPreliminarAccess().getRightCurlyBracketKeyword_8()); 
            match(input,33,FOLLOW_2); 
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
    // InternalLegisFacile.g:1013:1: rule__Epigrafe__Group__0 : rule__Epigrafe__Group__0__Impl rule__Epigrafe__Group__1 ;
    public final void rule__Epigrafe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1017:1: ( rule__Epigrafe__Group__0__Impl rule__Epigrafe__Group__1 )
            // InternalLegisFacile.g:1018:2: rule__Epigrafe__Group__0__Impl rule__Epigrafe__Group__1
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
    // InternalLegisFacile.g:1025:1: rule__Epigrafe__Group__0__Impl : ( ( rule__Epigrafe__Alternatives_0 ) ) ;
    public final void rule__Epigrafe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1029:1: ( ( ( rule__Epigrafe__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1030:1: ( ( rule__Epigrafe__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1030:1: ( ( rule__Epigrafe__Alternatives_0 ) )
            // InternalLegisFacile.g:1031:2: ( rule__Epigrafe__Alternatives_0 )
            {
             before(grammarAccess.getEpigrafeAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1032:2: ( rule__Epigrafe__Alternatives_0 )
            // InternalLegisFacile.g:1032:3: rule__Epigrafe__Alternatives_0
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
    // InternalLegisFacile.g:1040:1: rule__Epigrafe__Group__1 : rule__Epigrafe__Group__1__Impl rule__Epigrafe__Group__2 ;
    public final void rule__Epigrafe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1044:1: ( rule__Epigrafe__Group__1__Impl rule__Epigrafe__Group__2 )
            // InternalLegisFacile.g:1045:2: rule__Epigrafe__Group__1__Impl rule__Epigrafe__Group__2
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
    // InternalLegisFacile.g:1052:1: rule__Epigrafe__Group__1__Impl : ( '(' ) ;
    public final void rule__Epigrafe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1056:1: ( ( '(' ) )
            // InternalLegisFacile.g:1057:1: ( '(' )
            {
            // InternalLegisFacile.g:1057:1: ( '(' )
            // InternalLegisFacile.g:1058:2: '('
            {
             before(grammarAccess.getEpigrafeAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalLegisFacile.g:1067:1: rule__Epigrafe__Group__2 : rule__Epigrafe__Group__2__Impl rule__Epigrafe__Group__3 ;
    public final void rule__Epigrafe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1071:1: ( rule__Epigrafe__Group__2__Impl rule__Epigrafe__Group__3 )
            // InternalLegisFacile.g:1072:2: rule__Epigrafe__Group__2__Impl rule__Epigrafe__Group__3
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
    // InternalLegisFacile.g:1079:1: rule__Epigrafe__Group__2__Impl : ( ( rule__Epigrafe__AtoAssignment_2 ) ) ;
    public final void rule__Epigrafe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1083:1: ( ( ( rule__Epigrafe__AtoAssignment_2 ) ) )
            // InternalLegisFacile.g:1084:1: ( ( rule__Epigrafe__AtoAssignment_2 ) )
            {
            // InternalLegisFacile.g:1084:1: ( ( rule__Epigrafe__AtoAssignment_2 ) )
            // InternalLegisFacile.g:1085:2: ( rule__Epigrafe__AtoAssignment_2 )
            {
             before(grammarAccess.getEpigrafeAccess().getAtoAssignment_2()); 
            // InternalLegisFacile.g:1086:2: ( rule__Epigrafe__AtoAssignment_2 )
            // InternalLegisFacile.g:1086:3: rule__Epigrafe__AtoAssignment_2
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
    // InternalLegisFacile.g:1094:1: rule__Epigrafe__Group__3 : rule__Epigrafe__Group__3__Impl rule__Epigrafe__Group__4 ;
    public final void rule__Epigrafe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1098:1: ( rule__Epigrafe__Group__3__Impl rule__Epigrafe__Group__4 )
            // InternalLegisFacile.g:1099:2: rule__Epigrafe__Group__3__Impl rule__Epigrafe__Group__4
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
    // InternalLegisFacile.g:1106:1: rule__Epigrafe__Group__3__Impl : ( ',' ) ;
    public final void rule__Epigrafe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1110:1: ( ( ',' ) )
            // InternalLegisFacile.g:1111:1: ( ',' )
            {
            // InternalLegisFacile.g:1111:1: ( ',' )
            // InternalLegisFacile.g:1112:2: ','
            {
             before(grammarAccess.getEpigrafeAccess().getCommaKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalLegisFacile.g:1121:1: rule__Epigrafe__Group__4 : rule__Epigrafe__Group__4__Impl rule__Epigrafe__Group__5 ;
    public final void rule__Epigrafe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1125:1: ( rule__Epigrafe__Group__4__Impl rule__Epigrafe__Group__5 )
            // InternalLegisFacile.g:1126:2: rule__Epigrafe__Group__4__Impl rule__Epigrafe__Group__5
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
    // InternalLegisFacile.g:1133:1: rule__Epigrafe__Group__4__Impl : ( ( rule__Epigrafe__NumeroAssignment_4 ) ) ;
    public final void rule__Epigrafe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1137:1: ( ( ( rule__Epigrafe__NumeroAssignment_4 ) ) )
            // InternalLegisFacile.g:1138:1: ( ( rule__Epigrafe__NumeroAssignment_4 ) )
            {
            // InternalLegisFacile.g:1138:1: ( ( rule__Epigrafe__NumeroAssignment_4 ) )
            // InternalLegisFacile.g:1139:2: ( rule__Epigrafe__NumeroAssignment_4 )
            {
             before(grammarAccess.getEpigrafeAccess().getNumeroAssignment_4()); 
            // InternalLegisFacile.g:1140:2: ( rule__Epigrafe__NumeroAssignment_4 )
            // InternalLegisFacile.g:1140:3: rule__Epigrafe__NumeroAssignment_4
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
    // InternalLegisFacile.g:1148:1: rule__Epigrafe__Group__5 : rule__Epigrafe__Group__5__Impl rule__Epigrafe__Group__6 ;
    public final void rule__Epigrafe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1152:1: ( rule__Epigrafe__Group__5__Impl rule__Epigrafe__Group__6 )
            // InternalLegisFacile.g:1153:2: rule__Epigrafe__Group__5__Impl rule__Epigrafe__Group__6
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
    // InternalLegisFacile.g:1160:1: rule__Epigrafe__Group__5__Impl : ( ',' ) ;
    public final void rule__Epigrafe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1164:1: ( ( ',' ) )
            // InternalLegisFacile.g:1165:1: ( ',' )
            {
            // InternalLegisFacile.g:1165:1: ( ',' )
            // InternalLegisFacile.g:1166:2: ','
            {
             before(grammarAccess.getEpigrafeAccess().getCommaKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalLegisFacile.g:1175:1: rule__Epigrafe__Group__6 : rule__Epigrafe__Group__6__Impl rule__Epigrafe__Group__7 ;
    public final void rule__Epigrafe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1179:1: ( rule__Epigrafe__Group__6__Impl rule__Epigrafe__Group__7 )
            // InternalLegisFacile.g:1180:2: rule__Epigrafe__Group__6__Impl rule__Epigrafe__Group__7
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
    // InternalLegisFacile.g:1187:1: rule__Epigrafe__Group__6__Impl : ( ( rule__Epigrafe__AnoAssignment_6 ) ) ;
    public final void rule__Epigrafe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1191:1: ( ( ( rule__Epigrafe__AnoAssignment_6 ) ) )
            // InternalLegisFacile.g:1192:1: ( ( rule__Epigrafe__AnoAssignment_6 ) )
            {
            // InternalLegisFacile.g:1192:1: ( ( rule__Epigrafe__AnoAssignment_6 ) )
            // InternalLegisFacile.g:1193:2: ( rule__Epigrafe__AnoAssignment_6 )
            {
             before(grammarAccess.getEpigrafeAccess().getAnoAssignment_6()); 
            // InternalLegisFacile.g:1194:2: ( rule__Epigrafe__AnoAssignment_6 )
            // InternalLegisFacile.g:1194:3: rule__Epigrafe__AnoAssignment_6
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
    // InternalLegisFacile.g:1202:1: rule__Epigrafe__Group__7 : rule__Epigrafe__Group__7__Impl ;
    public final void rule__Epigrafe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1206:1: ( rule__Epigrafe__Group__7__Impl )
            // InternalLegisFacile.g:1207:2: rule__Epigrafe__Group__7__Impl
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
    // InternalLegisFacile.g:1213:1: rule__Epigrafe__Group__7__Impl : ( ')' ) ;
    public final void rule__Epigrafe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1217:1: ( ( ')' ) )
            // InternalLegisFacile.g:1218:1: ( ')' )
            {
            // InternalLegisFacile.g:1218:1: ( ')' )
            // InternalLegisFacile.g:1219:2: ')'
            {
             before(grammarAccess.getEpigrafeAccess().getRightParenthesisKeyword_7()); 
            match(input,35,FOLLOW_2); 
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
    // InternalLegisFacile.g:1229:1: rule__Ementa__Group__0 : rule__Ementa__Group__0__Impl rule__Ementa__Group__1 ;
    public final void rule__Ementa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1233:1: ( rule__Ementa__Group__0__Impl rule__Ementa__Group__1 )
            // InternalLegisFacile.g:1234:2: rule__Ementa__Group__0__Impl rule__Ementa__Group__1
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
    // InternalLegisFacile.g:1241:1: rule__Ementa__Group__0__Impl : ( ( rule__Ementa__Alternatives_0 ) ) ;
    public final void rule__Ementa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1245:1: ( ( ( rule__Ementa__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1246:1: ( ( rule__Ementa__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1246:1: ( ( rule__Ementa__Alternatives_0 ) )
            // InternalLegisFacile.g:1247:2: ( rule__Ementa__Alternatives_0 )
            {
             before(grammarAccess.getEmentaAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1248:2: ( rule__Ementa__Alternatives_0 )
            // InternalLegisFacile.g:1248:3: rule__Ementa__Alternatives_0
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
    // InternalLegisFacile.g:1256:1: rule__Ementa__Group__1 : rule__Ementa__Group__1__Impl rule__Ementa__Group__2 ;
    public final void rule__Ementa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1260:1: ( rule__Ementa__Group__1__Impl rule__Ementa__Group__2 )
            // InternalLegisFacile.g:1261:2: rule__Ementa__Group__1__Impl rule__Ementa__Group__2
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
    // InternalLegisFacile.g:1268:1: rule__Ementa__Group__1__Impl : ( '(' ) ;
    public final void rule__Ementa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1272:1: ( ( '(' ) )
            // InternalLegisFacile.g:1273:1: ( '(' )
            {
            // InternalLegisFacile.g:1273:1: ( '(' )
            // InternalLegisFacile.g:1274:2: '('
            {
             before(grammarAccess.getEmentaAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalLegisFacile.g:1283:1: rule__Ementa__Group__2 : rule__Ementa__Group__2__Impl rule__Ementa__Group__3 ;
    public final void rule__Ementa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1287:1: ( rule__Ementa__Group__2__Impl rule__Ementa__Group__3 )
            // InternalLegisFacile.g:1288:2: rule__Ementa__Group__2__Impl rule__Ementa__Group__3
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
    // InternalLegisFacile.g:1295:1: rule__Ementa__Group__2__Impl : ( ( rule__Ementa__EmentaAssignment_2 ) ) ;
    public final void rule__Ementa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1299:1: ( ( ( rule__Ementa__EmentaAssignment_2 ) ) )
            // InternalLegisFacile.g:1300:1: ( ( rule__Ementa__EmentaAssignment_2 ) )
            {
            // InternalLegisFacile.g:1300:1: ( ( rule__Ementa__EmentaAssignment_2 ) )
            // InternalLegisFacile.g:1301:2: ( rule__Ementa__EmentaAssignment_2 )
            {
             before(grammarAccess.getEmentaAccess().getEmentaAssignment_2()); 
            // InternalLegisFacile.g:1302:2: ( rule__Ementa__EmentaAssignment_2 )
            // InternalLegisFacile.g:1302:3: rule__Ementa__EmentaAssignment_2
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
    // InternalLegisFacile.g:1310:1: rule__Ementa__Group__3 : rule__Ementa__Group__3__Impl ;
    public final void rule__Ementa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1314:1: ( rule__Ementa__Group__3__Impl )
            // InternalLegisFacile.g:1315:2: rule__Ementa__Group__3__Impl
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
    // InternalLegisFacile.g:1321:1: rule__Ementa__Group__3__Impl : ( ')' ) ;
    public final void rule__Ementa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1325:1: ( ( ')' ) )
            // InternalLegisFacile.g:1326:1: ( ')' )
            {
            // InternalLegisFacile.g:1326:1: ( ')' )
            // InternalLegisFacile.g:1327:2: ')'
            {
             before(grammarAccess.getEmentaAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalLegisFacile.g:1337:1: rule__Preambulo__Group__0 : rule__Preambulo__Group__0__Impl rule__Preambulo__Group__1 ;
    public final void rule__Preambulo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1341:1: ( rule__Preambulo__Group__0__Impl rule__Preambulo__Group__1 )
            // InternalLegisFacile.g:1342:2: rule__Preambulo__Group__0__Impl rule__Preambulo__Group__1
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
    // InternalLegisFacile.g:1349:1: rule__Preambulo__Group__0__Impl : ( ( rule__Preambulo__Alternatives_0 ) ) ;
    public final void rule__Preambulo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1353:1: ( ( ( rule__Preambulo__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1354:1: ( ( rule__Preambulo__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1354:1: ( ( rule__Preambulo__Alternatives_0 ) )
            // InternalLegisFacile.g:1355:2: ( rule__Preambulo__Alternatives_0 )
            {
             before(grammarAccess.getPreambuloAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1356:2: ( rule__Preambulo__Alternatives_0 )
            // InternalLegisFacile.g:1356:3: rule__Preambulo__Alternatives_0
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
    // InternalLegisFacile.g:1364:1: rule__Preambulo__Group__1 : rule__Preambulo__Group__1__Impl rule__Preambulo__Group__2 ;
    public final void rule__Preambulo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1368:1: ( rule__Preambulo__Group__1__Impl rule__Preambulo__Group__2 )
            // InternalLegisFacile.g:1369:2: rule__Preambulo__Group__1__Impl rule__Preambulo__Group__2
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
    // InternalLegisFacile.g:1376:1: rule__Preambulo__Group__1__Impl : ( '(' ) ;
    public final void rule__Preambulo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1380:1: ( ( '(' ) )
            // InternalLegisFacile.g:1381:1: ( '(' )
            {
            // InternalLegisFacile.g:1381:1: ( '(' )
            // InternalLegisFacile.g:1382:2: '('
            {
             before(grammarAccess.getPreambuloAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalLegisFacile.g:1391:1: rule__Preambulo__Group__2 : rule__Preambulo__Group__2__Impl rule__Preambulo__Group__3 ;
    public final void rule__Preambulo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1395:1: ( rule__Preambulo__Group__2__Impl rule__Preambulo__Group__3 )
            // InternalLegisFacile.g:1396:2: rule__Preambulo__Group__2__Impl rule__Preambulo__Group__3
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
    // InternalLegisFacile.g:1403:1: rule__Preambulo__Group__2__Impl : ( ( rule__Preambulo__PreambuloAssignment_2 ) ) ;
    public final void rule__Preambulo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1407:1: ( ( ( rule__Preambulo__PreambuloAssignment_2 ) ) )
            // InternalLegisFacile.g:1408:1: ( ( rule__Preambulo__PreambuloAssignment_2 ) )
            {
            // InternalLegisFacile.g:1408:1: ( ( rule__Preambulo__PreambuloAssignment_2 ) )
            // InternalLegisFacile.g:1409:2: ( rule__Preambulo__PreambuloAssignment_2 )
            {
             before(grammarAccess.getPreambuloAccess().getPreambuloAssignment_2()); 
            // InternalLegisFacile.g:1410:2: ( rule__Preambulo__PreambuloAssignment_2 )
            // InternalLegisFacile.g:1410:3: rule__Preambulo__PreambuloAssignment_2
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
    // InternalLegisFacile.g:1418:1: rule__Preambulo__Group__3 : rule__Preambulo__Group__3__Impl ;
    public final void rule__Preambulo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1422:1: ( rule__Preambulo__Group__3__Impl )
            // InternalLegisFacile.g:1423:2: rule__Preambulo__Group__3__Impl
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
    // InternalLegisFacile.g:1429:1: rule__Preambulo__Group__3__Impl : ( ')' ) ;
    public final void rule__Preambulo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1433:1: ( ( ')' ) )
            // InternalLegisFacile.g:1434:1: ( ')' )
            {
            // InternalLegisFacile.g:1434:1: ( ')' )
            // InternalLegisFacile.g:1435:2: ')'
            {
             before(grammarAccess.getPreambuloAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalLegisFacile.g:1445:1: rule__Normativa__Group__0 : rule__Normativa__Group__0__Impl rule__Normativa__Group__1 ;
    public final void rule__Normativa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1449:1: ( rule__Normativa__Group__0__Impl rule__Normativa__Group__1 )
            // InternalLegisFacile.g:1450:2: rule__Normativa__Group__0__Impl rule__Normativa__Group__1
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
    // InternalLegisFacile.g:1457:1: rule__Normativa__Group__0__Impl : ( ( rule__Normativa__Alternatives_0 ) ) ;
    public final void rule__Normativa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1461:1: ( ( ( rule__Normativa__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1462:1: ( ( rule__Normativa__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1462:1: ( ( rule__Normativa__Alternatives_0 ) )
            // InternalLegisFacile.g:1463:2: ( rule__Normativa__Alternatives_0 )
            {
             before(grammarAccess.getNormativaAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1464:2: ( rule__Normativa__Alternatives_0 )
            // InternalLegisFacile.g:1464:3: rule__Normativa__Alternatives_0
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
    // InternalLegisFacile.g:1472:1: rule__Normativa__Group__1 : rule__Normativa__Group__1__Impl rule__Normativa__Group__2 ;
    public final void rule__Normativa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1476:1: ( rule__Normativa__Group__1__Impl rule__Normativa__Group__2 )
            // InternalLegisFacile.g:1477:2: rule__Normativa__Group__1__Impl rule__Normativa__Group__2
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
    // InternalLegisFacile.g:1484:1: rule__Normativa__Group__1__Impl : ( '{' ) ;
    public final void rule__Normativa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1488:1: ( ( '{' ) )
            // InternalLegisFacile.g:1489:1: ( '{' )
            {
            // InternalLegisFacile.g:1489:1: ( '{' )
            // InternalLegisFacile.g:1490:2: '{'
            {
             before(grammarAccess.getNormativaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalLegisFacile.g:1499:1: rule__Normativa__Group__2 : rule__Normativa__Group__2__Impl rule__Normativa__Group__3 ;
    public final void rule__Normativa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1503:1: ( rule__Normativa__Group__2__Impl rule__Normativa__Group__3 )
            // InternalLegisFacile.g:1504:2: rule__Normativa__Group__2__Impl rule__Normativa__Group__3
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
    // InternalLegisFacile.g:1511:1: rule__Normativa__Group__2__Impl : ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) ) ;
    public final void rule__Normativa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1515:1: ( ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) ) )
            // InternalLegisFacile.g:1516:1: ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) )
            {
            // InternalLegisFacile.g:1516:1: ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) )
            // InternalLegisFacile.g:1517:2: ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* )
            {
            // InternalLegisFacile.g:1517:2: ( ( rule__Normativa__ArtigosAssignment_2 ) )
            // InternalLegisFacile.g:1518:3: ( rule__Normativa__ArtigosAssignment_2 )
            {
             before(grammarAccess.getNormativaAccess().getArtigosAssignment_2()); 
            // InternalLegisFacile.g:1519:3: ( rule__Normativa__ArtigosAssignment_2 )
            // InternalLegisFacile.g:1519:4: rule__Normativa__ArtigosAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__Normativa__ArtigosAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNormativaAccess().getArtigosAssignment_2()); 

            }

            // InternalLegisFacile.g:1522:2: ( ( rule__Normativa__ArtigosAssignment_2 )* )
            // InternalLegisFacile.g:1523:3: ( rule__Normativa__ArtigosAssignment_2 )*
            {
             before(grammarAccess.getNormativaAccess().getArtigosAssignment_2()); 
            // InternalLegisFacile.g:1524:3: ( rule__Normativa__ArtigosAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=21 && LA13_0<=22)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLegisFacile.g:1524:4: rule__Normativa__ArtigosAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Normativa__ArtigosAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalLegisFacile.g:1533:1: rule__Normativa__Group__3 : rule__Normativa__Group__3__Impl ;
    public final void rule__Normativa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1537:1: ( rule__Normativa__Group__3__Impl )
            // InternalLegisFacile.g:1538:2: rule__Normativa__Group__3__Impl
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
    // InternalLegisFacile.g:1544:1: rule__Normativa__Group__3__Impl : ( '}' ) ;
    public final void rule__Normativa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1548:1: ( ( '}' ) )
            // InternalLegisFacile.g:1549:1: ( '}' )
            {
            // InternalLegisFacile.g:1549:1: ( '}' )
            // InternalLegisFacile.g:1550:2: '}'
            {
             before(grammarAccess.getNormativaAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalLegisFacile.g:1560:1: rule__Artigo__Group__0 : rule__Artigo__Group__0__Impl rule__Artigo__Group__1 ;
    public final void rule__Artigo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1564:1: ( rule__Artigo__Group__0__Impl rule__Artigo__Group__1 )
            // InternalLegisFacile.g:1565:2: rule__Artigo__Group__0__Impl rule__Artigo__Group__1
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
    // InternalLegisFacile.g:1572:1: rule__Artigo__Group__0__Impl : ( ( rule__Artigo__Alternatives_0 ) ) ;
    public final void rule__Artigo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1576:1: ( ( ( rule__Artigo__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1577:1: ( ( rule__Artigo__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1577:1: ( ( rule__Artigo__Alternatives_0 ) )
            // InternalLegisFacile.g:1578:2: ( rule__Artigo__Alternatives_0 )
            {
             before(grammarAccess.getArtigoAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1579:2: ( rule__Artigo__Alternatives_0 )
            // InternalLegisFacile.g:1579:3: rule__Artigo__Alternatives_0
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
    // InternalLegisFacile.g:1587:1: rule__Artigo__Group__1 : rule__Artigo__Group__1__Impl rule__Artigo__Group__2 ;
    public final void rule__Artigo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1591:1: ( rule__Artigo__Group__1__Impl rule__Artigo__Group__2 )
            // InternalLegisFacile.g:1592:2: rule__Artigo__Group__1__Impl rule__Artigo__Group__2
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
    // InternalLegisFacile.g:1599:1: rule__Artigo__Group__1__Impl : ( '{' ) ;
    public final void rule__Artigo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1603:1: ( ( '{' ) )
            // InternalLegisFacile.g:1604:1: ( '{' )
            {
            // InternalLegisFacile.g:1604:1: ( '{' )
            // InternalLegisFacile.g:1605:2: '{'
            {
             before(grammarAccess.getArtigoAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalLegisFacile.g:1614:1: rule__Artigo__Group__2 : rule__Artigo__Group__2__Impl rule__Artigo__Group__3 ;
    public final void rule__Artigo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1618:1: ( rule__Artigo__Group__2__Impl rule__Artigo__Group__3 )
            // InternalLegisFacile.g:1619:2: rule__Artigo__Group__2__Impl rule__Artigo__Group__3
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
    // InternalLegisFacile.g:1626:1: rule__Artigo__Group__2__Impl : ( ( rule__Artigo__CaputAssignment_2 ) ) ;
    public final void rule__Artigo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1630:1: ( ( ( rule__Artigo__CaputAssignment_2 ) ) )
            // InternalLegisFacile.g:1631:1: ( ( rule__Artigo__CaputAssignment_2 ) )
            {
            // InternalLegisFacile.g:1631:1: ( ( rule__Artigo__CaputAssignment_2 ) )
            // InternalLegisFacile.g:1632:2: ( rule__Artigo__CaputAssignment_2 )
            {
             before(grammarAccess.getArtigoAccess().getCaputAssignment_2()); 
            // InternalLegisFacile.g:1633:2: ( rule__Artigo__CaputAssignment_2 )
            // InternalLegisFacile.g:1633:3: rule__Artigo__CaputAssignment_2
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
    // InternalLegisFacile.g:1641:1: rule__Artigo__Group__3 : rule__Artigo__Group__3__Impl rule__Artigo__Group__4 ;
    public final void rule__Artigo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1645:1: ( rule__Artigo__Group__3__Impl rule__Artigo__Group__4 )
            // InternalLegisFacile.g:1646:2: rule__Artigo__Group__3__Impl rule__Artigo__Group__4
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
    // InternalLegisFacile.g:1653:1: rule__Artigo__Group__3__Impl : ( ( rule__Artigo__ParagrafosAssignment_3 )* ) ;
    public final void rule__Artigo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1657:1: ( ( ( rule__Artigo__ParagrafosAssignment_3 )* ) )
            // InternalLegisFacile.g:1658:1: ( ( rule__Artigo__ParagrafosAssignment_3 )* )
            {
            // InternalLegisFacile.g:1658:1: ( ( rule__Artigo__ParagrafosAssignment_3 )* )
            // InternalLegisFacile.g:1659:2: ( rule__Artigo__ParagrafosAssignment_3 )*
            {
             before(grammarAccess.getArtigoAccess().getParagrafosAssignment_3()); 
            // InternalLegisFacile.g:1660:2: ( rule__Artigo__ParagrafosAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=23 && LA14_0<=24)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLegisFacile.g:1660:3: rule__Artigo__ParagrafosAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Artigo__ParagrafosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalLegisFacile.g:1668:1: rule__Artigo__Group__4 : rule__Artigo__Group__4__Impl ;
    public final void rule__Artigo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1672:1: ( rule__Artigo__Group__4__Impl )
            // InternalLegisFacile.g:1673:2: rule__Artigo__Group__4__Impl
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
    // InternalLegisFacile.g:1679:1: rule__Artigo__Group__4__Impl : ( '}' ) ;
    public final void rule__Artigo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1683:1: ( ( '}' ) )
            // InternalLegisFacile.g:1684:1: ( '}' )
            {
            // InternalLegisFacile.g:1684:1: ( '}' )
            // InternalLegisFacile.g:1685:2: '}'
            {
             before(grammarAccess.getArtigoAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalLegisFacile.g:1695:1: rule__Caput__Group__0 : rule__Caput__Group__0__Impl rule__Caput__Group__1 ;
    public final void rule__Caput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1699:1: ( rule__Caput__Group__0__Impl rule__Caput__Group__1 )
            // InternalLegisFacile.g:1700:2: rule__Caput__Group__0__Impl rule__Caput__Group__1
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
    // InternalLegisFacile.g:1707:1: rule__Caput__Group__0__Impl : ( 'Caput|caput' ) ;
    public final void rule__Caput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1711:1: ( ( 'Caput|caput' ) )
            // InternalLegisFacile.g:1712:1: ( 'Caput|caput' )
            {
            // InternalLegisFacile.g:1712:1: ( 'Caput|caput' )
            // InternalLegisFacile.g:1713:2: 'Caput|caput'
            {
             before(grammarAccess.getCaputAccess().getCaputCaputKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCaputAccess().getCaputCaputKeyword_0()); 

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
    // InternalLegisFacile.g:1722:1: rule__Caput__Group__1 : rule__Caput__Group__1__Impl rule__Caput__Group__2 ;
    public final void rule__Caput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1726:1: ( rule__Caput__Group__1__Impl rule__Caput__Group__2 )
            // InternalLegisFacile.g:1727:2: rule__Caput__Group__1__Impl rule__Caput__Group__2
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
    // InternalLegisFacile.g:1734:1: rule__Caput__Group__1__Impl : ( '(' ) ;
    public final void rule__Caput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1738:1: ( ( '(' ) )
            // InternalLegisFacile.g:1739:1: ( '(' )
            {
            // InternalLegisFacile.g:1739:1: ( '(' )
            // InternalLegisFacile.g:1740:2: '('
            {
             before(grammarAccess.getCaputAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalLegisFacile.g:1749:1: rule__Caput__Group__2 : rule__Caput__Group__2__Impl rule__Caput__Group__3 ;
    public final void rule__Caput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1753:1: ( rule__Caput__Group__2__Impl rule__Caput__Group__3 )
            // InternalLegisFacile.g:1754:2: rule__Caput__Group__2__Impl rule__Caput__Group__3
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
    // InternalLegisFacile.g:1761:1: rule__Caput__Group__2__Impl : ( ( rule__Caput__TextoAssignment_2 ) ) ;
    public final void rule__Caput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1765:1: ( ( ( rule__Caput__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:1766:1: ( ( rule__Caput__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:1766:1: ( ( rule__Caput__TextoAssignment_2 ) )
            // InternalLegisFacile.g:1767:2: ( rule__Caput__TextoAssignment_2 )
            {
             before(grammarAccess.getCaputAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:1768:2: ( rule__Caput__TextoAssignment_2 )
            // InternalLegisFacile.g:1768:3: rule__Caput__TextoAssignment_2
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
    // InternalLegisFacile.g:1776:1: rule__Caput__Group__3 : rule__Caput__Group__3__Impl rule__Caput__Group__4 ;
    public final void rule__Caput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1780:1: ( rule__Caput__Group__3__Impl rule__Caput__Group__4 )
            // InternalLegisFacile.g:1781:2: rule__Caput__Group__3__Impl rule__Caput__Group__4
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
    // InternalLegisFacile.g:1788:1: rule__Caput__Group__3__Impl : ( ')' ) ;
    public final void rule__Caput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1792:1: ( ( ')' ) )
            // InternalLegisFacile.g:1793:1: ( ')' )
            {
            // InternalLegisFacile.g:1793:1: ( ')' )
            // InternalLegisFacile.g:1794:2: ')'
            {
             before(grammarAccess.getCaputAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalLegisFacile.g:1803:1: rule__Caput__Group__4 : rule__Caput__Group__4__Impl ;
    public final void rule__Caput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1807:1: ( rule__Caput__Group__4__Impl )
            // InternalLegisFacile.g:1808:2: rule__Caput__Group__4__Impl
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
    // InternalLegisFacile.g:1814:1: rule__Caput__Group__4__Impl : ( ( rule__Caput__Group_4__0 )? ) ;
    public final void rule__Caput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1818:1: ( ( ( rule__Caput__Group_4__0 )? ) )
            // InternalLegisFacile.g:1819:1: ( ( rule__Caput__Group_4__0 )? )
            {
            // InternalLegisFacile.g:1819:1: ( ( rule__Caput__Group_4__0 )? )
            // InternalLegisFacile.g:1820:2: ( rule__Caput__Group_4__0 )?
            {
             before(grammarAccess.getCaputAccess().getGroup_4()); 
            // InternalLegisFacile.g:1821:2: ( rule__Caput__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLegisFacile.g:1821:3: rule__Caput__Group_4__0
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
    // InternalLegisFacile.g:1830:1: rule__Caput__Group_4__0 : rule__Caput__Group_4__0__Impl rule__Caput__Group_4__1 ;
    public final void rule__Caput__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1834:1: ( rule__Caput__Group_4__0__Impl rule__Caput__Group_4__1 )
            // InternalLegisFacile.g:1835:2: rule__Caput__Group_4__0__Impl rule__Caput__Group_4__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalLegisFacile.g:1842:1: rule__Caput__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Caput__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1846:1: ( ( '{' ) )
            // InternalLegisFacile.g:1847:1: ( '{' )
            {
            // InternalLegisFacile.g:1847:1: ( '{' )
            // InternalLegisFacile.g:1848:2: '{'
            {
             before(grammarAccess.getCaputAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalLegisFacile.g:1857:1: rule__Caput__Group_4__1 : rule__Caput__Group_4__1__Impl rule__Caput__Group_4__2 ;
    public final void rule__Caput__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1861:1: ( rule__Caput__Group_4__1__Impl rule__Caput__Group_4__2 )
            // InternalLegisFacile.g:1862:2: rule__Caput__Group_4__1__Impl rule__Caput__Group_4__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalLegisFacile.g:1869:1: rule__Caput__Group_4__1__Impl : ( ( rule__Caput__ParagrafosAssignment_4_1 )* ) ;
    public final void rule__Caput__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1873:1: ( ( ( rule__Caput__ParagrafosAssignment_4_1 )* ) )
            // InternalLegisFacile.g:1874:1: ( ( rule__Caput__ParagrafosAssignment_4_1 )* )
            {
            // InternalLegisFacile.g:1874:1: ( ( rule__Caput__ParagrafosAssignment_4_1 )* )
            // InternalLegisFacile.g:1875:2: ( rule__Caput__ParagrafosAssignment_4_1 )*
            {
             before(grammarAccess.getCaputAccess().getParagrafosAssignment_4_1()); 
            // InternalLegisFacile.g:1876:2: ( rule__Caput__ParagrafosAssignment_4_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=23 && LA16_0<=24)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLegisFacile.g:1876:3: rule__Caput__ParagrafosAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Caput__ParagrafosAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getCaputAccess().getParagrafosAssignment_4_1()); 

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
    // InternalLegisFacile.g:1884:1: rule__Caput__Group_4__2 : rule__Caput__Group_4__2__Impl ;
    public final void rule__Caput__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1888:1: ( rule__Caput__Group_4__2__Impl )
            // InternalLegisFacile.g:1889:2: rule__Caput__Group_4__2__Impl
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
    // InternalLegisFacile.g:1895:1: rule__Caput__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Caput__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1899:1: ( ( '}' ) )
            // InternalLegisFacile.g:1900:1: ( '}' )
            {
            // InternalLegisFacile.g:1900:1: ( '}' )
            // InternalLegisFacile.g:1901:2: '}'
            {
             before(grammarAccess.getCaputAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalLegisFacile.g:1911:1: rule__Paragrafo__Group__0 : rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1 ;
    public final void rule__Paragrafo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1915:1: ( rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1 )
            // InternalLegisFacile.g:1916:2: rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1
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
    // InternalLegisFacile.g:1923:1: rule__Paragrafo__Group__0__Impl : ( ( rule__Paragrafo__Alternatives_0 ) ) ;
    public final void rule__Paragrafo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1927:1: ( ( ( rule__Paragrafo__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1928:1: ( ( rule__Paragrafo__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1928:1: ( ( rule__Paragrafo__Alternatives_0 ) )
            // InternalLegisFacile.g:1929:2: ( rule__Paragrafo__Alternatives_0 )
            {
             before(grammarAccess.getParagrafoAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1930:2: ( rule__Paragrafo__Alternatives_0 )
            // InternalLegisFacile.g:1930:3: rule__Paragrafo__Alternatives_0
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
    // InternalLegisFacile.g:1938:1: rule__Paragrafo__Group__1 : rule__Paragrafo__Group__1__Impl rule__Paragrafo__Group__2 ;
    public final void rule__Paragrafo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1942:1: ( rule__Paragrafo__Group__1__Impl rule__Paragrafo__Group__2 )
            // InternalLegisFacile.g:1943:2: rule__Paragrafo__Group__1__Impl rule__Paragrafo__Group__2
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
    // InternalLegisFacile.g:1950:1: rule__Paragrafo__Group__1__Impl : ( '(' ) ;
    public final void rule__Paragrafo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1954:1: ( ( '(' ) )
            // InternalLegisFacile.g:1955:1: ( '(' )
            {
            // InternalLegisFacile.g:1955:1: ( '(' )
            // InternalLegisFacile.g:1956:2: '('
            {
             before(grammarAccess.getParagrafoAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalLegisFacile.g:1965:1: rule__Paragrafo__Group__2 : rule__Paragrafo__Group__2__Impl rule__Paragrafo__Group__3 ;
    public final void rule__Paragrafo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1969:1: ( rule__Paragrafo__Group__2__Impl rule__Paragrafo__Group__3 )
            // InternalLegisFacile.g:1970:2: rule__Paragrafo__Group__2__Impl rule__Paragrafo__Group__3
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
    // InternalLegisFacile.g:1977:1: rule__Paragrafo__Group__2__Impl : ( ( rule__Paragrafo__TextoAssignment_2 ) ) ;
    public final void rule__Paragrafo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1981:1: ( ( ( rule__Paragrafo__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:1982:1: ( ( rule__Paragrafo__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:1982:1: ( ( rule__Paragrafo__TextoAssignment_2 ) )
            // InternalLegisFacile.g:1983:2: ( rule__Paragrafo__TextoAssignment_2 )
            {
             before(grammarAccess.getParagrafoAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:1984:2: ( rule__Paragrafo__TextoAssignment_2 )
            // InternalLegisFacile.g:1984:3: rule__Paragrafo__TextoAssignment_2
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
    // InternalLegisFacile.g:1992:1: rule__Paragrafo__Group__3 : rule__Paragrafo__Group__3__Impl rule__Paragrafo__Group__4 ;
    public final void rule__Paragrafo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1996:1: ( rule__Paragrafo__Group__3__Impl rule__Paragrafo__Group__4 )
            // InternalLegisFacile.g:1997:2: rule__Paragrafo__Group__3__Impl rule__Paragrafo__Group__4
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
    // InternalLegisFacile.g:2004:1: rule__Paragrafo__Group__3__Impl : ( ')' ) ;
    public final void rule__Paragrafo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2008:1: ( ( ')' ) )
            // InternalLegisFacile.g:2009:1: ( ')' )
            {
            // InternalLegisFacile.g:2009:1: ( ')' )
            // InternalLegisFacile.g:2010:2: ')'
            {
             before(grammarAccess.getParagrafoAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalLegisFacile.g:2019:1: rule__Paragrafo__Group__4 : rule__Paragrafo__Group__4__Impl ;
    public final void rule__Paragrafo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2023:1: ( rule__Paragrafo__Group__4__Impl )
            // InternalLegisFacile.g:2024:2: rule__Paragrafo__Group__4__Impl
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
    // InternalLegisFacile.g:2030:1: rule__Paragrafo__Group__4__Impl : ( ( rule__Paragrafo__Group_4__0 )? ) ;
    public final void rule__Paragrafo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2034:1: ( ( ( rule__Paragrafo__Group_4__0 )? ) )
            // InternalLegisFacile.g:2035:1: ( ( rule__Paragrafo__Group_4__0 )? )
            {
            // InternalLegisFacile.g:2035:1: ( ( rule__Paragrafo__Group_4__0 )? )
            // InternalLegisFacile.g:2036:2: ( rule__Paragrafo__Group_4__0 )?
            {
             before(grammarAccess.getParagrafoAccess().getGroup_4()); 
            // InternalLegisFacile.g:2037:2: ( rule__Paragrafo__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLegisFacile.g:2037:3: rule__Paragrafo__Group_4__0
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
    // InternalLegisFacile.g:2046:1: rule__Paragrafo__Group_4__0 : rule__Paragrafo__Group_4__0__Impl rule__Paragrafo__Group_4__1 ;
    public final void rule__Paragrafo__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2050:1: ( rule__Paragrafo__Group_4__0__Impl rule__Paragrafo__Group_4__1 )
            // InternalLegisFacile.g:2051:2: rule__Paragrafo__Group_4__0__Impl rule__Paragrafo__Group_4__1
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
    // InternalLegisFacile.g:2058:1: rule__Paragrafo__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Paragrafo__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2062:1: ( ( '{' ) )
            // InternalLegisFacile.g:2063:1: ( '{' )
            {
            // InternalLegisFacile.g:2063:1: ( '{' )
            // InternalLegisFacile.g:2064:2: '{'
            {
             before(grammarAccess.getParagrafoAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalLegisFacile.g:2073:1: rule__Paragrafo__Group_4__1 : rule__Paragrafo__Group_4__1__Impl rule__Paragrafo__Group_4__2 ;
    public final void rule__Paragrafo__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2077:1: ( rule__Paragrafo__Group_4__1__Impl rule__Paragrafo__Group_4__2 )
            // InternalLegisFacile.g:2078:2: rule__Paragrafo__Group_4__1__Impl rule__Paragrafo__Group_4__2
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
    // InternalLegisFacile.g:2085:1: rule__Paragrafo__Group_4__1__Impl : ( ( rule__Paragrafo__AlineasAssignment_4_1 )* ) ;
    public final void rule__Paragrafo__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2089:1: ( ( ( rule__Paragrafo__AlineasAssignment_4_1 )* ) )
            // InternalLegisFacile.g:2090:1: ( ( rule__Paragrafo__AlineasAssignment_4_1 )* )
            {
            // InternalLegisFacile.g:2090:1: ( ( rule__Paragrafo__AlineasAssignment_4_1 )* )
            // InternalLegisFacile.g:2091:2: ( rule__Paragrafo__AlineasAssignment_4_1 )*
            {
             before(grammarAccess.getParagrafoAccess().getAlineasAssignment_4_1()); 
            // InternalLegisFacile.g:2092:2: ( rule__Paragrafo__AlineasAssignment_4_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=25 && LA18_0<=26)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLegisFacile.g:2092:3: rule__Paragrafo__AlineasAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Paragrafo__AlineasAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getParagrafoAccess().getAlineasAssignment_4_1()); 

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
    // InternalLegisFacile.g:2100:1: rule__Paragrafo__Group_4__2 : rule__Paragrafo__Group_4__2__Impl ;
    public final void rule__Paragrafo__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2104:1: ( rule__Paragrafo__Group_4__2__Impl )
            // InternalLegisFacile.g:2105:2: rule__Paragrafo__Group_4__2__Impl
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
    // InternalLegisFacile.g:2111:1: rule__Paragrafo__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Paragrafo__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2115:1: ( ( '}' ) )
            // InternalLegisFacile.g:2116:1: ( '}' )
            {
            // InternalLegisFacile.g:2116:1: ( '}' )
            // InternalLegisFacile.g:2117:2: '}'
            {
             before(grammarAccess.getParagrafoAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,33,FOLLOW_2); 
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


    // $ANTLR start "rule__Alinea__Group__0"
    // InternalLegisFacile.g:2127:1: rule__Alinea__Group__0 : rule__Alinea__Group__0__Impl rule__Alinea__Group__1 ;
    public final void rule__Alinea__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2131:1: ( rule__Alinea__Group__0__Impl rule__Alinea__Group__1 )
            // InternalLegisFacile.g:2132:2: rule__Alinea__Group__0__Impl rule__Alinea__Group__1
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
    // InternalLegisFacile.g:2139:1: rule__Alinea__Group__0__Impl : ( ( rule__Alinea__Alternatives_0 ) ) ;
    public final void rule__Alinea__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2143:1: ( ( ( rule__Alinea__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2144:1: ( ( rule__Alinea__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2144:1: ( ( rule__Alinea__Alternatives_0 ) )
            // InternalLegisFacile.g:2145:2: ( rule__Alinea__Alternatives_0 )
            {
             before(grammarAccess.getAlineaAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2146:2: ( rule__Alinea__Alternatives_0 )
            // InternalLegisFacile.g:2146:3: rule__Alinea__Alternatives_0
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
    // InternalLegisFacile.g:2154:1: rule__Alinea__Group__1 : rule__Alinea__Group__1__Impl rule__Alinea__Group__2 ;
    public final void rule__Alinea__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2158:1: ( rule__Alinea__Group__1__Impl rule__Alinea__Group__2 )
            // InternalLegisFacile.g:2159:2: rule__Alinea__Group__1__Impl rule__Alinea__Group__2
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
    // InternalLegisFacile.g:2166:1: rule__Alinea__Group__1__Impl : ( '(' ) ;
    public final void rule__Alinea__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2170:1: ( ( '(' ) )
            // InternalLegisFacile.g:2171:1: ( '(' )
            {
            // InternalLegisFacile.g:2171:1: ( '(' )
            // InternalLegisFacile.g:2172:2: '('
            {
             before(grammarAccess.getAlineaAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalLegisFacile.g:2181:1: rule__Alinea__Group__2 : rule__Alinea__Group__2__Impl rule__Alinea__Group__3 ;
    public final void rule__Alinea__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2185:1: ( rule__Alinea__Group__2__Impl rule__Alinea__Group__3 )
            // InternalLegisFacile.g:2186:2: rule__Alinea__Group__2__Impl rule__Alinea__Group__3
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
    // InternalLegisFacile.g:2193:1: rule__Alinea__Group__2__Impl : ( ( rule__Alinea__TextoAssignment_2 ) ) ;
    public final void rule__Alinea__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2197:1: ( ( ( rule__Alinea__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:2198:1: ( ( rule__Alinea__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:2198:1: ( ( rule__Alinea__TextoAssignment_2 ) )
            // InternalLegisFacile.g:2199:2: ( rule__Alinea__TextoAssignment_2 )
            {
             before(grammarAccess.getAlineaAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:2200:2: ( rule__Alinea__TextoAssignment_2 )
            // InternalLegisFacile.g:2200:3: rule__Alinea__TextoAssignment_2
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
    // InternalLegisFacile.g:2208:1: rule__Alinea__Group__3 : rule__Alinea__Group__3__Impl rule__Alinea__Group__4 ;
    public final void rule__Alinea__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2212:1: ( rule__Alinea__Group__3__Impl rule__Alinea__Group__4 )
            // InternalLegisFacile.g:2213:2: rule__Alinea__Group__3__Impl rule__Alinea__Group__4
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
    // InternalLegisFacile.g:2220:1: rule__Alinea__Group__3__Impl : ( ')' ) ;
    public final void rule__Alinea__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2224:1: ( ( ')' ) )
            // InternalLegisFacile.g:2225:1: ( ')' )
            {
            // InternalLegisFacile.g:2225:1: ( ')' )
            // InternalLegisFacile.g:2226:2: ')'
            {
             before(grammarAccess.getAlineaAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalLegisFacile.g:2235:1: rule__Alinea__Group__4 : rule__Alinea__Group__4__Impl ;
    public final void rule__Alinea__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2239:1: ( rule__Alinea__Group__4__Impl )
            // InternalLegisFacile.g:2240:2: rule__Alinea__Group__4__Impl
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
    // InternalLegisFacile.g:2246:1: rule__Alinea__Group__4__Impl : ( ( rule__Alinea__Group_4__0 )? ) ;
    public final void rule__Alinea__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2250:1: ( ( ( rule__Alinea__Group_4__0 )? ) )
            // InternalLegisFacile.g:2251:1: ( ( rule__Alinea__Group_4__0 )? )
            {
            // InternalLegisFacile.g:2251:1: ( ( rule__Alinea__Group_4__0 )? )
            // InternalLegisFacile.g:2252:2: ( rule__Alinea__Group_4__0 )?
            {
             before(grammarAccess.getAlineaAccess().getGroup_4()); 
            // InternalLegisFacile.g:2253:2: ( rule__Alinea__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLegisFacile.g:2253:3: rule__Alinea__Group_4__0
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
    // InternalLegisFacile.g:2262:1: rule__Alinea__Group_4__0 : rule__Alinea__Group_4__0__Impl rule__Alinea__Group_4__1 ;
    public final void rule__Alinea__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2266:1: ( rule__Alinea__Group_4__0__Impl rule__Alinea__Group_4__1 )
            // InternalLegisFacile.g:2267:2: rule__Alinea__Group_4__0__Impl rule__Alinea__Group_4__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalLegisFacile.g:2274:1: rule__Alinea__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Alinea__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2278:1: ( ( '{' ) )
            // InternalLegisFacile.g:2279:1: ( '{' )
            {
            // InternalLegisFacile.g:2279:1: ( '{' )
            // InternalLegisFacile.g:2280:2: '{'
            {
             before(grammarAccess.getAlineaAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalLegisFacile.g:2289:1: rule__Alinea__Group_4__1 : rule__Alinea__Group_4__1__Impl rule__Alinea__Group_4__2 ;
    public final void rule__Alinea__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2293:1: ( rule__Alinea__Group_4__1__Impl rule__Alinea__Group_4__2 )
            // InternalLegisFacile.g:2294:2: rule__Alinea__Group_4__1__Impl rule__Alinea__Group_4__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalLegisFacile.g:2301:1: rule__Alinea__Group_4__1__Impl : ( ( rule__Alinea__ItensAssignment_4_1 )* ) ;
    public final void rule__Alinea__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2305:1: ( ( ( rule__Alinea__ItensAssignment_4_1 )* ) )
            // InternalLegisFacile.g:2306:1: ( ( rule__Alinea__ItensAssignment_4_1 )* )
            {
            // InternalLegisFacile.g:2306:1: ( ( rule__Alinea__ItensAssignment_4_1 )* )
            // InternalLegisFacile.g:2307:2: ( rule__Alinea__ItensAssignment_4_1 )*
            {
             before(grammarAccess.getAlineaAccess().getItensAssignment_4_1()); 
            // InternalLegisFacile.g:2308:2: ( rule__Alinea__ItensAssignment_4_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=27 && LA20_0<=28)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLegisFacile.g:2308:3: rule__Alinea__ItensAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Alinea__ItensAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalLegisFacile.g:2316:1: rule__Alinea__Group_4__2 : rule__Alinea__Group_4__2__Impl ;
    public final void rule__Alinea__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2320:1: ( rule__Alinea__Group_4__2__Impl )
            // InternalLegisFacile.g:2321:2: rule__Alinea__Group_4__2__Impl
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
    // InternalLegisFacile.g:2327:1: rule__Alinea__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Alinea__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2331:1: ( ( '}' ) )
            // InternalLegisFacile.g:2332:1: ( '}' )
            {
            // InternalLegisFacile.g:2332:1: ( '}' )
            // InternalLegisFacile.g:2333:2: '}'
            {
             before(grammarAccess.getAlineaAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalLegisFacile.g:2343:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2347:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // InternalLegisFacile.g:2348:2: rule__Item__Group__0__Impl rule__Item__Group__1
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
    // InternalLegisFacile.g:2355:1: rule__Item__Group__0__Impl : ( ( rule__Item__Alternatives_0 ) ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2359:1: ( ( ( rule__Item__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2360:1: ( ( rule__Item__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2360:1: ( ( rule__Item__Alternatives_0 ) )
            // InternalLegisFacile.g:2361:2: ( rule__Item__Alternatives_0 )
            {
             before(grammarAccess.getItemAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2362:2: ( rule__Item__Alternatives_0 )
            // InternalLegisFacile.g:2362:3: rule__Item__Alternatives_0
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
    // InternalLegisFacile.g:2370:1: rule__Item__Group__1 : rule__Item__Group__1__Impl rule__Item__Group__2 ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2374:1: ( rule__Item__Group__1__Impl rule__Item__Group__2 )
            // InternalLegisFacile.g:2375:2: rule__Item__Group__1__Impl rule__Item__Group__2
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
    // InternalLegisFacile.g:2382:1: rule__Item__Group__1__Impl : ( '(' ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2386:1: ( ( '(' ) )
            // InternalLegisFacile.g:2387:1: ( '(' )
            {
            // InternalLegisFacile.g:2387:1: ( '(' )
            // InternalLegisFacile.g:2388:2: '('
            {
             before(grammarAccess.getItemAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalLegisFacile.g:2397:1: rule__Item__Group__2 : rule__Item__Group__2__Impl rule__Item__Group__3 ;
    public final void rule__Item__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2401:1: ( rule__Item__Group__2__Impl rule__Item__Group__3 )
            // InternalLegisFacile.g:2402:2: rule__Item__Group__2__Impl rule__Item__Group__3
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
    // InternalLegisFacile.g:2409:1: rule__Item__Group__2__Impl : ( ( rule__Item__TextoAssignment_2 ) ) ;
    public final void rule__Item__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2413:1: ( ( ( rule__Item__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:2414:1: ( ( rule__Item__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:2414:1: ( ( rule__Item__TextoAssignment_2 ) )
            // InternalLegisFacile.g:2415:2: ( rule__Item__TextoAssignment_2 )
            {
             before(grammarAccess.getItemAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:2416:2: ( rule__Item__TextoAssignment_2 )
            // InternalLegisFacile.g:2416:3: rule__Item__TextoAssignment_2
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
    // InternalLegisFacile.g:2424:1: rule__Item__Group__3 : rule__Item__Group__3__Impl ;
    public final void rule__Item__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2428:1: ( rule__Item__Group__3__Impl )
            // InternalLegisFacile.g:2429:2: rule__Item__Group__3__Impl
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
    // InternalLegisFacile.g:2435:1: rule__Item__Group__3__Impl : ( ')' ) ;
    public final void rule__Item__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2439:1: ( ( ')' ) )
            // InternalLegisFacile.g:2440:1: ( ')' )
            {
            // InternalLegisFacile.g:2440:1: ( ')' )
            // InternalLegisFacile.g:2441:2: ')'
            {
             before(grammarAccess.getItemAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalLegisFacile.g:2451:1: rule__Final__Group__0 : rule__Final__Group__0__Impl rule__Final__Group__1 ;
    public final void rule__Final__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2455:1: ( rule__Final__Group__0__Impl rule__Final__Group__1 )
            // InternalLegisFacile.g:2456:2: rule__Final__Group__0__Impl rule__Final__Group__1
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
    // InternalLegisFacile.g:2463:1: rule__Final__Group__0__Impl : ( ( rule__Final__Alternatives_0 ) ) ;
    public final void rule__Final__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2467:1: ( ( ( rule__Final__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2468:1: ( ( rule__Final__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2468:1: ( ( rule__Final__Alternatives_0 ) )
            // InternalLegisFacile.g:2469:2: ( rule__Final__Alternatives_0 )
            {
             before(grammarAccess.getFinalAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2470:2: ( rule__Final__Alternatives_0 )
            // InternalLegisFacile.g:2470:3: rule__Final__Alternatives_0
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
    // InternalLegisFacile.g:2478:1: rule__Final__Group__1 : rule__Final__Group__1__Impl rule__Final__Group__2 ;
    public final void rule__Final__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2482:1: ( rule__Final__Group__1__Impl rule__Final__Group__2 )
            // InternalLegisFacile.g:2483:2: rule__Final__Group__1__Impl rule__Final__Group__2
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
    // InternalLegisFacile.g:2490:1: rule__Final__Group__1__Impl : ( '{' ) ;
    public final void rule__Final__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2494:1: ( ( '{' ) )
            // InternalLegisFacile.g:2495:1: ( '{' )
            {
            // InternalLegisFacile.g:2495:1: ( '{' )
            // InternalLegisFacile.g:2496:2: '{'
            {
             before(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalLegisFacile.g:2505:1: rule__Final__Group__2 : rule__Final__Group__2__Impl ;
    public final void rule__Final__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2509:1: ( rule__Final__Group__2__Impl )
            // InternalLegisFacile.g:2510:2: rule__Final__Group__2__Impl
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
    // InternalLegisFacile.g:2516:1: rule__Final__Group__2__Impl : ( '}' ) ;
    public final void rule__Final__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2520:1: ( ( '}' ) )
            // InternalLegisFacile.g:2521:1: ( '}' )
            {
            // InternalLegisFacile.g:2521:1: ( '}' )
            // InternalLegisFacile.g:2522:2: '}'
            {
             before(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalLegisFacile.g:2532:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2536:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalLegisFacile.g:2537:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalLegisFacile.g:2544:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2548:1: ( ( 'datatype' ) )
            // InternalLegisFacile.g:2549:1: ( 'datatype' )
            {
            // InternalLegisFacile.g:2549:1: ( 'datatype' )
            // InternalLegisFacile.g:2550:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalLegisFacile.g:2559:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2563:1: ( rule__DataType__Group__1__Impl )
            // InternalLegisFacile.g:2564:2: rule__DataType__Group__1__Impl
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
    // InternalLegisFacile.g:2570:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2574:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalLegisFacile.g:2575:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalLegisFacile.g:2575:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalLegisFacile.g:2576:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalLegisFacile.g:2577:2: ( rule__DataType__NameAssignment_1 )
            // InternalLegisFacile.g:2577:3: rule__DataType__NameAssignment_1
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
    // InternalLegisFacile.g:2586:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2590:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalLegisFacile.g:2591:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalLegisFacile.g:2598:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2602:1: ( ( 'entity' ) )
            // InternalLegisFacile.g:2603:1: ( 'entity' )
            {
            // InternalLegisFacile.g:2603:1: ( 'entity' )
            // InternalLegisFacile.g:2604:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalLegisFacile.g:2613:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2617:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalLegisFacile.g:2618:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalLegisFacile.g:2625:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2629:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalLegisFacile.g:2630:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalLegisFacile.g:2630:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalLegisFacile.g:2631:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalLegisFacile.g:2632:2: ( rule__Entity__NameAssignment_1 )
            // InternalLegisFacile.g:2632:3: rule__Entity__NameAssignment_1
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
    // InternalLegisFacile.g:2640:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2644:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalLegisFacile.g:2645:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalLegisFacile.g:2652:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2656:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalLegisFacile.g:2657:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalLegisFacile.g:2657:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalLegisFacile.g:2658:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalLegisFacile.g:2659:2: ( rule__Entity__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLegisFacile.g:2659:3: rule__Entity__Group_2__0
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
    // InternalLegisFacile.g:2667:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2671:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalLegisFacile.g:2672:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalLegisFacile.g:2679:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2683:1: ( ( '{' ) )
            // InternalLegisFacile.g:2684:1: ( '{' )
            {
            // InternalLegisFacile.g:2684:1: ( '{' )
            // InternalLegisFacile.g:2685:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalLegisFacile.g:2694:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2698:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalLegisFacile.g:2699:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalLegisFacile.g:2706:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FeaturesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2710:1: ( ( ( rule__Entity__FeaturesAssignment_4 )* ) )
            // InternalLegisFacile.g:2711:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            {
            // InternalLegisFacile.g:2711:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            // InternalLegisFacile.g:2712:2: ( rule__Entity__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // InternalLegisFacile.g:2713:2: ( rule__Entity__FeaturesAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==41) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLegisFacile.g:2713:3: rule__Entity__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Entity__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalLegisFacile.g:2721:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2725:1: ( rule__Entity__Group__5__Impl )
            // InternalLegisFacile.g:2726:2: rule__Entity__Group__5__Impl
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
    // InternalLegisFacile.g:2732:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2736:1: ( ( '}' ) )
            // InternalLegisFacile.g:2737:1: ( '}' )
            {
            // InternalLegisFacile.g:2737:1: ( '}' )
            // InternalLegisFacile.g:2738:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
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
    // InternalLegisFacile.g:2748:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2752:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalLegisFacile.g:2753:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalLegisFacile.g:2760:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2764:1: ( ( 'extends' ) )
            // InternalLegisFacile.g:2765:1: ( 'extends' )
            {
            // InternalLegisFacile.g:2765:1: ( 'extends' )
            // InternalLegisFacile.g:2766:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalLegisFacile.g:2775:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2779:1: ( rule__Entity__Group_2__1__Impl )
            // InternalLegisFacile.g:2780:2: rule__Entity__Group_2__1__Impl
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
    // InternalLegisFacile.g:2786:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2790:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // InternalLegisFacile.g:2791:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // InternalLegisFacile.g:2791:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // InternalLegisFacile.g:2792:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // InternalLegisFacile.g:2793:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            // InternalLegisFacile.g:2793:3: rule__Entity__SuperTypeAssignment_2_1
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
    // InternalLegisFacile.g:2802:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2806:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalLegisFacile.g:2807:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalLegisFacile.g:2814:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__ManyAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2818:1: ( ( ( rule__Feature__ManyAssignment_0 )? ) )
            // InternalLegisFacile.g:2819:1: ( ( rule__Feature__ManyAssignment_0 )? )
            {
            // InternalLegisFacile.g:2819:1: ( ( rule__Feature__ManyAssignment_0 )? )
            // InternalLegisFacile.g:2820:2: ( rule__Feature__ManyAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getManyAssignment_0()); 
            // InternalLegisFacile.g:2821:2: ( rule__Feature__ManyAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLegisFacile.g:2821:3: rule__Feature__ManyAssignment_0
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
    // InternalLegisFacile.g:2829:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2833:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalLegisFacile.g:2834:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalLegisFacile.g:2841:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2845:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalLegisFacile.g:2846:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalLegisFacile.g:2846:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalLegisFacile.g:2847:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalLegisFacile.g:2848:2: ( rule__Feature__NameAssignment_1 )
            // InternalLegisFacile.g:2848:3: rule__Feature__NameAssignment_1
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
    // InternalLegisFacile.g:2856:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2860:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalLegisFacile.g:2861:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalLegisFacile.g:2868:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2872:1: ( ( ':' ) )
            // InternalLegisFacile.g:2873:1: ( ':' )
            {
            // InternalLegisFacile.g:2873:1: ( ':' )
            // InternalLegisFacile.g:2874:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalLegisFacile.g:2883:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2887:1: ( rule__Feature__Group__3__Impl )
            // InternalLegisFacile.g:2888:2: rule__Feature__Group__3__Impl
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
    // InternalLegisFacile.g:2894:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2898:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // InternalLegisFacile.g:2899:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // InternalLegisFacile.g:2899:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // InternalLegisFacile.g:2900:2: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // InternalLegisFacile.g:2901:2: ( rule__Feature__TypeAssignment_3 )
            // InternalLegisFacile.g:2901:3: rule__Feature__TypeAssignment_3
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
    // InternalLegisFacile.g:2910:1: rule__Lei__ElementsAssignment : ( ruleType ) ;
    public final void rule__Lei__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2914:1: ( ( ruleType ) )
            // InternalLegisFacile.g:2915:2: ( ruleType )
            {
            // InternalLegisFacile.g:2915:2: ( ruleType )
            // InternalLegisFacile.g:2916:3: ruleType
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
    // InternalLegisFacile.g:2925:1: rule__Type__PreliminarAssignment_2_0 : ( rulePreliminar ) ;
    public final void rule__Type__PreliminarAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2929:1: ( ( rulePreliminar ) )
            // InternalLegisFacile.g:2930:2: ( rulePreliminar )
            {
            // InternalLegisFacile.g:2930:2: ( rulePreliminar )
            // InternalLegisFacile.g:2931:3: rulePreliminar
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
    // InternalLegisFacile.g:2940:1: rule__Type__NormativaAssignment_2_1 : ( ruleNormativa ) ;
    public final void rule__Type__NormativaAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2944:1: ( ( ruleNormativa ) )
            // InternalLegisFacile.g:2945:2: ( ruleNormativa )
            {
            // InternalLegisFacile.g:2945:2: ( ruleNormativa )
            // InternalLegisFacile.g:2946:3: ruleNormativa
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
    // InternalLegisFacile.g:2955:1: rule__Type__FinalAssignment_2_2 : ( ruleFinal ) ;
    public final void rule__Type__FinalAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2959:1: ( ( ruleFinal ) )
            // InternalLegisFacile.g:2960:2: ( ruleFinal )
            {
            // InternalLegisFacile.g:2960:2: ( ruleFinal )
            // InternalLegisFacile.g:2961:3: ruleFinal
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
    // InternalLegisFacile.g:2970:1: rule__Preliminar__EpigrageAssignment_2 : ( ruleEpigrafe ) ;
    public final void rule__Preliminar__EpigrageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2974:1: ( ( ruleEpigrafe ) )
            // InternalLegisFacile.g:2975:2: ( ruleEpigrafe )
            {
            // InternalLegisFacile.g:2975:2: ( ruleEpigrafe )
            // InternalLegisFacile.g:2976:3: ruleEpigrafe
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
    // InternalLegisFacile.g:2985:1: rule__Preliminar__EmentaAssignment_4 : ( ruleEmenta ) ;
    public final void rule__Preliminar__EmentaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2989:1: ( ( ruleEmenta ) )
            // InternalLegisFacile.g:2990:2: ( ruleEmenta )
            {
            // InternalLegisFacile.g:2990:2: ( ruleEmenta )
            // InternalLegisFacile.g:2991:3: ruleEmenta
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
    // InternalLegisFacile.g:3000:1: rule__Preliminar__PreambuloAssignment_6 : ( rulePreambulo ) ;
    public final void rule__Preliminar__PreambuloAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3004:1: ( ( rulePreambulo ) )
            // InternalLegisFacile.g:3005:2: ( rulePreambulo )
            {
            // InternalLegisFacile.g:3005:2: ( rulePreambulo )
            // InternalLegisFacile.g:3006:3: rulePreambulo
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
    // InternalLegisFacile.g:3015:1: rule__Epigrafe__AtoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Epigrafe__AtoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3019:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3020:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3020:2: ( RULE_STRING )
            // InternalLegisFacile.g:3021:3: RULE_STRING
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
    // InternalLegisFacile.g:3030:1: rule__Epigrafe__NumeroAssignment_4 : ( RULE_INT ) ;
    public final void rule__Epigrafe__NumeroAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3034:1: ( ( RULE_INT ) )
            // InternalLegisFacile.g:3035:2: ( RULE_INT )
            {
            // InternalLegisFacile.g:3035:2: ( RULE_INT )
            // InternalLegisFacile.g:3036:3: RULE_INT
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
    // InternalLegisFacile.g:3045:1: rule__Epigrafe__AnoAssignment_6 : ( RULE_INT ) ;
    public final void rule__Epigrafe__AnoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3049:1: ( ( RULE_INT ) )
            // InternalLegisFacile.g:3050:2: ( RULE_INT )
            {
            // InternalLegisFacile.g:3050:2: ( RULE_INT )
            // InternalLegisFacile.g:3051:3: RULE_INT
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
    // InternalLegisFacile.g:3060:1: rule__Ementa__EmentaAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Ementa__EmentaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3064:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3065:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3065:2: ( RULE_STRING )
            // InternalLegisFacile.g:3066:3: RULE_STRING
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
    // InternalLegisFacile.g:3075:1: rule__Preambulo__PreambuloAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Preambulo__PreambuloAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3079:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3080:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3080:2: ( RULE_STRING )
            // InternalLegisFacile.g:3081:3: RULE_STRING
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
    // InternalLegisFacile.g:3090:1: rule__Normativa__ArtigosAssignment_2 : ( ruleArtigo ) ;
    public final void rule__Normativa__ArtigosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3094:1: ( ( ruleArtigo ) )
            // InternalLegisFacile.g:3095:2: ( ruleArtigo )
            {
            // InternalLegisFacile.g:3095:2: ( ruleArtigo )
            // InternalLegisFacile.g:3096:3: ruleArtigo
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
    // InternalLegisFacile.g:3105:1: rule__Artigo__CaputAssignment_2 : ( ruleCaput ) ;
    public final void rule__Artigo__CaputAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3109:1: ( ( ruleCaput ) )
            // InternalLegisFacile.g:3110:2: ( ruleCaput )
            {
            // InternalLegisFacile.g:3110:2: ( ruleCaput )
            // InternalLegisFacile.g:3111:3: ruleCaput
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
    // InternalLegisFacile.g:3120:1: rule__Artigo__ParagrafosAssignment_3 : ( ruleParagrafo ) ;
    public final void rule__Artigo__ParagrafosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3124:1: ( ( ruleParagrafo ) )
            // InternalLegisFacile.g:3125:2: ( ruleParagrafo )
            {
            // InternalLegisFacile.g:3125:2: ( ruleParagrafo )
            // InternalLegisFacile.g:3126:3: ruleParagrafo
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
    // InternalLegisFacile.g:3135:1: rule__Caput__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Caput__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3139:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3140:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3140:2: ( RULE_STRING )
            // InternalLegisFacile.g:3141:3: RULE_STRING
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


    // $ANTLR start "rule__Caput__ParagrafosAssignment_4_1"
    // InternalLegisFacile.g:3150:1: rule__Caput__ParagrafosAssignment_4_1 : ( ruleParagrafo ) ;
    public final void rule__Caput__ParagrafosAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3154:1: ( ( ruleParagrafo ) )
            // InternalLegisFacile.g:3155:2: ( ruleParagrafo )
            {
            // InternalLegisFacile.g:3155:2: ( ruleParagrafo )
            // InternalLegisFacile.g:3156:3: ruleParagrafo
            {
             before(grammarAccess.getCaputAccess().getParagrafosParagrafoParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParagrafo();

            state._fsp--;

             after(grammarAccess.getCaputAccess().getParagrafosParagrafoParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Caput__ParagrafosAssignment_4_1"


    // $ANTLR start "rule__Paragrafo__TextoAssignment_2"
    // InternalLegisFacile.g:3165:1: rule__Paragrafo__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Paragrafo__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3169:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3170:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3170:2: ( RULE_STRING )
            // InternalLegisFacile.g:3171:3: RULE_STRING
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


    // $ANTLR start "rule__Paragrafo__AlineasAssignment_4_1"
    // InternalLegisFacile.g:3180:1: rule__Paragrafo__AlineasAssignment_4_1 : ( ruleAlinea ) ;
    public final void rule__Paragrafo__AlineasAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3184:1: ( ( ruleAlinea ) )
            // InternalLegisFacile.g:3185:2: ( ruleAlinea )
            {
            // InternalLegisFacile.g:3185:2: ( ruleAlinea )
            // InternalLegisFacile.g:3186:3: ruleAlinea
            {
             before(grammarAccess.getParagrafoAccess().getAlineasAlineaParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAlinea();

            state._fsp--;

             after(grammarAccess.getParagrafoAccess().getAlineasAlineaParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Paragrafo__AlineasAssignment_4_1"


    // $ANTLR start "rule__Alinea__TextoAssignment_2"
    // InternalLegisFacile.g:3195:1: rule__Alinea__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Alinea__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3199:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3200:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3200:2: ( RULE_STRING )
            // InternalLegisFacile.g:3201:3: RULE_STRING
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
    // InternalLegisFacile.g:3210:1: rule__Alinea__ItensAssignment_4_1 : ( ruleItem ) ;
    public final void rule__Alinea__ItensAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3214:1: ( ( ruleItem ) )
            // InternalLegisFacile.g:3215:2: ( ruleItem )
            {
            // InternalLegisFacile.g:3215:2: ( ruleItem )
            // InternalLegisFacile.g:3216:3: ruleItem
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
    // InternalLegisFacile.g:3225:1: rule__Item__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Item__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3229:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3230:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3230:2: ( RULE_STRING )
            // InternalLegisFacile.g:3231:3: RULE_STRING
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
    // InternalLegisFacile.g:3240:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3244:1: ( ( RULE_ID ) )
            // InternalLegisFacile.g:3245:2: ( RULE_ID )
            {
            // InternalLegisFacile.g:3245:2: ( RULE_ID )
            // InternalLegisFacile.g:3246:3: RULE_ID
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
    // InternalLegisFacile.g:3255:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3259:1: ( ( RULE_ID ) )
            // InternalLegisFacile.g:3260:2: ( RULE_ID )
            {
            // InternalLegisFacile.g:3260:2: ( RULE_ID )
            // InternalLegisFacile.g:3261:3: RULE_ID
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
    // InternalLegisFacile.g:3270:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3274:1: ( ( ( RULE_ID ) ) )
            // InternalLegisFacile.g:3275:2: ( ( RULE_ID ) )
            {
            // InternalLegisFacile.g:3275:2: ( ( RULE_ID ) )
            // InternalLegisFacile.g:3276:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // InternalLegisFacile.g:3277:3: ( RULE_ID )
            // InternalLegisFacile.g:3278:4: RULE_ID
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
    // InternalLegisFacile.g:3289:1: rule__Entity__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3293:1: ( ( ruleFeature ) )
            // InternalLegisFacile.g:3294:2: ( ruleFeature )
            {
            // InternalLegisFacile.g:3294:2: ( ruleFeature )
            // InternalLegisFacile.g:3295:3: ruleFeature
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
    // InternalLegisFacile.g:3304:1: rule__Feature__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Feature__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3308:1: ( ( ( 'many' ) ) )
            // InternalLegisFacile.g:3309:2: ( ( 'many' ) )
            {
            // InternalLegisFacile.g:3309:2: ( ( 'many' ) )
            // InternalLegisFacile.g:3310:3: ( 'many' )
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            // InternalLegisFacile.g:3311:3: ( 'many' )
            // InternalLegisFacile.g:3312:4: 'many'
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalLegisFacile.g:3323:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3327:1: ( ( RULE_ID ) )
            // InternalLegisFacile.g:3328:2: ( RULE_ID )
            {
            // InternalLegisFacile.g:3328:2: ( RULE_ID )
            // InternalLegisFacile.g:3329:3: RULE_ID
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
    // InternalLegisFacile.g:3338:1: rule__Feature__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3342:1: ( ( ( RULE_ID ) ) )
            // InternalLegisFacile.g:3343:2: ( ( RULE_ID ) )
            {
            // InternalLegisFacile.g:3343:2: ( ( RULE_ID ) )
            // InternalLegisFacile.g:3344:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 
            // InternalLegisFacile.g:3345:3: ( RULE_ID )
            // InternalLegisFacile.g:3346:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000006000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000201800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000206000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000218000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020200000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000042L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});

}