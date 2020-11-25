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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Preliminar'", "'preliminar'", "'Epigrafe'", "'epigrafe'", "'Ementa'", "'ementa'", "'Preambulo'", "'preambulo'", "'Normativa'", "'normativa'", "'Artigo'", "'artigo'", "'Final'", "'final'", "'{'", "','", "'}'", "'('", "')'", "'datatype'", "'entity'", "'extends'", "':'", "'many'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
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

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=30 && LA1_0<=31)) ) {
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
    // InternalLegisFacile.g:262:1: ruleCaput : ( ( rule__Caput__TextoAssignment ) ) ;
    public final void ruleCaput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:266:2: ( ( ( rule__Caput__TextoAssignment ) ) )
            // InternalLegisFacile.g:267:2: ( ( rule__Caput__TextoAssignment ) )
            {
            // InternalLegisFacile.g:267:2: ( ( rule__Caput__TextoAssignment ) )
            // InternalLegisFacile.g:268:3: ( rule__Caput__TextoAssignment )
            {
             before(grammarAccess.getCaputAccess().getTextoAssignment()); 
            // InternalLegisFacile.g:269:3: ( rule__Caput__TextoAssignment )
            // InternalLegisFacile.g:269:4: rule__Caput__TextoAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Caput__TextoAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCaputAccess().getTextoAssignment()); 

            }


            }

        }
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
    // InternalLegisFacile.g:287:1: ruleParagrafo : ( ( rule__Paragrafo__TextoAssignment ) ) ;
    public final void ruleParagrafo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:291:2: ( ( ( rule__Paragrafo__TextoAssignment ) ) )
            // InternalLegisFacile.g:292:2: ( ( rule__Paragrafo__TextoAssignment ) )
            {
            // InternalLegisFacile.g:292:2: ( ( rule__Paragrafo__TextoAssignment ) )
            // InternalLegisFacile.g:293:3: ( rule__Paragrafo__TextoAssignment )
            {
             before(grammarAccess.getParagrafoAccess().getTextoAssignment()); 
            // InternalLegisFacile.g:294:3: ( rule__Paragrafo__TextoAssignment )
            // InternalLegisFacile.g:294:4: rule__Paragrafo__TextoAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Paragrafo__TextoAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParagrafoAccess().getTextoAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleFinal"
    // InternalLegisFacile.g:303:1: entryRuleFinal : ruleFinal EOF ;
    public final void entryRuleFinal() throws RecognitionException {
        try {
            // InternalLegisFacile.g:304:1: ( ruleFinal EOF )
            // InternalLegisFacile.g:305:1: ruleFinal EOF
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
    // InternalLegisFacile.g:312:1: ruleFinal : ( ( rule__Final__Group__0 ) ) ;
    public final void ruleFinal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:316:2: ( ( ( rule__Final__Group__0 ) ) )
            // InternalLegisFacile.g:317:2: ( ( rule__Final__Group__0 ) )
            {
            // InternalLegisFacile.g:317:2: ( ( rule__Final__Group__0 ) )
            // InternalLegisFacile.g:318:3: ( rule__Final__Group__0 )
            {
             before(grammarAccess.getFinalAccess().getGroup()); 
            // InternalLegisFacile.g:319:3: ( rule__Final__Group__0 )
            // InternalLegisFacile.g:319:4: rule__Final__Group__0
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
    // InternalLegisFacile.g:328:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalLegisFacile.g:329:1: ( ruleDataType EOF )
            // InternalLegisFacile.g:330:1: ruleDataType EOF
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
    // InternalLegisFacile.g:337:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:341:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalLegisFacile.g:342:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalLegisFacile.g:342:2: ( ( rule__DataType__Group__0 ) )
            // InternalLegisFacile.g:343:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalLegisFacile.g:344:3: ( rule__DataType__Group__0 )
            // InternalLegisFacile.g:344:4: rule__DataType__Group__0
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
    // InternalLegisFacile.g:353:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalLegisFacile.g:354:1: ( ruleEntity EOF )
            // InternalLegisFacile.g:355:1: ruleEntity EOF
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
    // InternalLegisFacile.g:362:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:366:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalLegisFacile.g:367:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalLegisFacile.g:367:2: ( ( rule__Entity__Group__0 ) )
            // InternalLegisFacile.g:368:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalLegisFacile.g:369:3: ( rule__Entity__Group__0 )
            // InternalLegisFacile.g:369:4: rule__Entity__Group__0
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
    // InternalLegisFacile.g:378:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalLegisFacile.g:379:1: ( ruleFeature EOF )
            // InternalLegisFacile.g:380:1: ruleFeature EOF
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
    // InternalLegisFacile.g:387:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:391:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalLegisFacile.g:392:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalLegisFacile.g:392:2: ( ( rule__Feature__Group__0 ) )
            // InternalLegisFacile.g:393:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalLegisFacile.g:394:3: ( rule__Feature__Group__0 )
            // InternalLegisFacile.g:394:4: rule__Feature__Group__0
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
    // InternalLegisFacile.g:402:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) | ( ( rule__Type__Group_2__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:406:1: ( ( ruleDataType ) | ( ruleEntity ) | ( ( rule__Type__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 31:
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
                    // InternalLegisFacile.g:407:2: ( ruleDataType )
                    {
                    // InternalLegisFacile.g:407:2: ( ruleDataType )
                    // InternalLegisFacile.g:408:3: ruleDataType
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
                    // InternalLegisFacile.g:413:2: ( ruleEntity )
                    {
                    // InternalLegisFacile.g:413:2: ( ruleEntity )
                    // InternalLegisFacile.g:414:3: ruleEntity
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
                    // InternalLegisFacile.g:419:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalLegisFacile.g:419:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalLegisFacile.g:420:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalLegisFacile.g:421:3: ( rule__Type__Group_2__0 )
                    // InternalLegisFacile.g:421:4: rule__Type__Group_2__0
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
    // InternalLegisFacile.g:429:1: rule__Preliminar__Alternatives_0 : ( ( 'Preliminar' ) | ( 'preliminar' ) );
    public final void rule__Preliminar__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:433:1: ( ( 'Preliminar' ) | ( 'preliminar' ) )
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
                    // InternalLegisFacile.g:434:2: ( 'Preliminar' )
                    {
                    // InternalLegisFacile.g:434:2: ( 'Preliminar' )
                    // InternalLegisFacile.g:435:3: 'Preliminar'
                    {
                     before(grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:440:2: ( 'preliminar' )
                    {
                    // InternalLegisFacile.g:440:2: ( 'preliminar' )
                    // InternalLegisFacile.g:441:3: 'preliminar'
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
    // InternalLegisFacile.g:450:1: rule__Epigrafe__Alternatives_0 : ( ( 'Epigrafe' ) | ( 'epigrafe' ) );
    public final void rule__Epigrafe__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:454:1: ( ( 'Epigrafe' ) | ( 'epigrafe' ) )
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
                    // InternalLegisFacile.g:455:2: ( 'Epigrafe' )
                    {
                    // InternalLegisFacile.g:455:2: ( 'Epigrafe' )
                    // InternalLegisFacile.g:456:3: 'Epigrafe'
                    {
                     before(grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:461:2: ( 'epigrafe' )
                    {
                    // InternalLegisFacile.g:461:2: ( 'epigrafe' )
                    // InternalLegisFacile.g:462:3: 'epigrafe'
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
    // InternalLegisFacile.g:471:1: rule__Ementa__Alternatives_0 : ( ( 'Ementa' ) | ( 'ementa' ) );
    public final void rule__Ementa__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:475:1: ( ( 'Ementa' ) | ( 'ementa' ) )
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
                    // InternalLegisFacile.g:476:2: ( 'Ementa' )
                    {
                    // InternalLegisFacile.g:476:2: ( 'Ementa' )
                    // InternalLegisFacile.g:477:3: 'Ementa'
                    {
                     before(grammarAccess.getEmentaAccess().getEmentaKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEmentaAccess().getEmentaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:482:2: ( 'ementa' )
                    {
                    // InternalLegisFacile.g:482:2: ( 'ementa' )
                    // InternalLegisFacile.g:483:3: 'ementa'
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
    // InternalLegisFacile.g:492:1: rule__Preambulo__Alternatives_0 : ( ( 'Preambulo' ) | ( 'preambulo' ) );
    public final void rule__Preambulo__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:496:1: ( ( 'Preambulo' ) | ( 'preambulo' ) )
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
                    // InternalLegisFacile.g:497:2: ( 'Preambulo' )
                    {
                    // InternalLegisFacile.g:497:2: ( 'Preambulo' )
                    // InternalLegisFacile.g:498:3: 'Preambulo'
                    {
                     before(grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:503:2: ( 'preambulo' )
                    {
                    // InternalLegisFacile.g:503:2: ( 'preambulo' )
                    // InternalLegisFacile.g:504:3: 'preambulo'
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
    // InternalLegisFacile.g:513:1: rule__Normativa__Alternatives_0 : ( ( 'Normativa' ) | ( 'normativa' ) );
    public final void rule__Normativa__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:517:1: ( ( 'Normativa' ) | ( 'normativa' ) )
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
                    // InternalLegisFacile.g:518:2: ( 'Normativa' )
                    {
                    // InternalLegisFacile.g:518:2: ( 'Normativa' )
                    // InternalLegisFacile.g:519:3: 'Normativa'
                    {
                     before(grammarAccess.getNormativaAccess().getNormativaKeyword_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getNormativaAccess().getNormativaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:524:2: ( 'normativa' )
                    {
                    // InternalLegisFacile.g:524:2: ( 'normativa' )
                    // InternalLegisFacile.g:525:3: 'normativa'
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
    // InternalLegisFacile.g:534:1: rule__Artigo__Alternatives_0 : ( ( 'Artigo' ) | ( 'artigo' ) );
    public final void rule__Artigo__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:538:1: ( ( 'Artigo' ) | ( 'artigo' ) )
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
                    // InternalLegisFacile.g:539:2: ( 'Artigo' )
                    {
                    // InternalLegisFacile.g:539:2: ( 'Artigo' )
                    // InternalLegisFacile.g:540:3: 'Artigo'
                    {
                     before(grammarAccess.getArtigoAccess().getArtigoKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getArtigoAccess().getArtigoKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:545:2: ( 'artigo' )
                    {
                    // InternalLegisFacile.g:545:2: ( 'artigo' )
                    // InternalLegisFacile.g:546:3: 'artigo'
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


    // $ANTLR start "rule__Final__Alternatives_0"
    // InternalLegisFacile.g:555:1: rule__Final__Alternatives_0 : ( ( 'Final' ) | ( 'final' ) );
    public final void rule__Final__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:559:1: ( ( 'Final' ) | ( 'final' ) )
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
                    // InternalLegisFacile.g:560:2: ( 'Final' )
                    {
                    // InternalLegisFacile.g:560:2: ( 'Final' )
                    // InternalLegisFacile.g:561:3: 'Final'
                    {
                     before(grammarAccess.getFinalAccess().getFinalKeyword_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getFinalAccess().getFinalKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:566:2: ( 'final' )
                    {
                    // InternalLegisFacile.g:566:2: ( 'final' )
                    // InternalLegisFacile.g:567:3: 'final'
                    {
                     before(grammarAccess.getFinalAccess().getFinalKeyword_0_1()); 
                    match(input,24,FOLLOW_2); 
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
    // InternalLegisFacile.g:576:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:580:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalLegisFacile.g:581:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
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
    // InternalLegisFacile.g:588:1: rule__Type__Group_2__0__Impl : ( ( rule__Type__PreliminarAssignment_2_0 ) ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:592:1: ( ( ( rule__Type__PreliminarAssignment_2_0 ) ) )
            // InternalLegisFacile.g:593:1: ( ( rule__Type__PreliminarAssignment_2_0 ) )
            {
            // InternalLegisFacile.g:593:1: ( ( rule__Type__PreliminarAssignment_2_0 ) )
            // InternalLegisFacile.g:594:2: ( rule__Type__PreliminarAssignment_2_0 )
            {
             before(grammarAccess.getTypeAccess().getPreliminarAssignment_2_0()); 
            // InternalLegisFacile.g:595:2: ( rule__Type__PreliminarAssignment_2_0 )
            // InternalLegisFacile.g:595:3: rule__Type__PreliminarAssignment_2_0
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
    // InternalLegisFacile.g:603:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:607:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalLegisFacile.g:608:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
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
    // InternalLegisFacile.g:615:1: rule__Type__Group_2__1__Impl : ( ( rule__Type__NormativaAssignment_2_1 ) ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:619:1: ( ( ( rule__Type__NormativaAssignment_2_1 ) ) )
            // InternalLegisFacile.g:620:1: ( ( rule__Type__NormativaAssignment_2_1 ) )
            {
            // InternalLegisFacile.g:620:1: ( ( rule__Type__NormativaAssignment_2_1 ) )
            // InternalLegisFacile.g:621:2: ( rule__Type__NormativaAssignment_2_1 )
            {
             before(grammarAccess.getTypeAccess().getNormativaAssignment_2_1()); 
            // InternalLegisFacile.g:622:2: ( rule__Type__NormativaAssignment_2_1 )
            // InternalLegisFacile.g:622:3: rule__Type__NormativaAssignment_2_1
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
    // InternalLegisFacile.g:630:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:634:1: ( rule__Type__Group_2__2__Impl )
            // InternalLegisFacile.g:635:2: rule__Type__Group_2__2__Impl
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
    // InternalLegisFacile.g:641:1: rule__Type__Group_2__2__Impl : ( ( rule__Type__FinalAssignment_2_2 ) ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:645:1: ( ( ( rule__Type__FinalAssignment_2_2 ) ) )
            // InternalLegisFacile.g:646:1: ( ( rule__Type__FinalAssignment_2_2 ) )
            {
            // InternalLegisFacile.g:646:1: ( ( rule__Type__FinalAssignment_2_2 ) )
            // InternalLegisFacile.g:647:2: ( rule__Type__FinalAssignment_2_2 )
            {
             before(grammarAccess.getTypeAccess().getFinalAssignment_2_2()); 
            // InternalLegisFacile.g:648:2: ( rule__Type__FinalAssignment_2_2 )
            // InternalLegisFacile.g:648:3: rule__Type__FinalAssignment_2_2
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
    // InternalLegisFacile.g:657:1: rule__Preliminar__Group__0 : rule__Preliminar__Group__0__Impl rule__Preliminar__Group__1 ;
    public final void rule__Preliminar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:661:1: ( rule__Preliminar__Group__0__Impl rule__Preliminar__Group__1 )
            // InternalLegisFacile.g:662:2: rule__Preliminar__Group__0__Impl rule__Preliminar__Group__1
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
    // InternalLegisFacile.g:669:1: rule__Preliminar__Group__0__Impl : ( ( rule__Preliminar__Alternatives_0 ) ) ;
    public final void rule__Preliminar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:673:1: ( ( ( rule__Preliminar__Alternatives_0 ) ) )
            // InternalLegisFacile.g:674:1: ( ( rule__Preliminar__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:674:1: ( ( rule__Preliminar__Alternatives_0 ) )
            // InternalLegisFacile.g:675:2: ( rule__Preliminar__Alternatives_0 )
            {
             before(grammarAccess.getPreliminarAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:676:2: ( rule__Preliminar__Alternatives_0 )
            // InternalLegisFacile.g:676:3: rule__Preliminar__Alternatives_0
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
    // InternalLegisFacile.g:684:1: rule__Preliminar__Group__1 : rule__Preliminar__Group__1__Impl rule__Preliminar__Group__2 ;
    public final void rule__Preliminar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:688:1: ( rule__Preliminar__Group__1__Impl rule__Preliminar__Group__2 )
            // InternalLegisFacile.g:689:2: rule__Preliminar__Group__1__Impl rule__Preliminar__Group__2
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
    // InternalLegisFacile.g:696:1: rule__Preliminar__Group__1__Impl : ( '{' ) ;
    public final void rule__Preliminar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:700:1: ( ( '{' ) )
            // InternalLegisFacile.g:701:1: ( '{' )
            {
            // InternalLegisFacile.g:701:1: ( '{' )
            // InternalLegisFacile.g:702:2: '{'
            {
             before(grammarAccess.getPreliminarAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalLegisFacile.g:711:1: rule__Preliminar__Group__2 : rule__Preliminar__Group__2__Impl rule__Preliminar__Group__3 ;
    public final void rule__Preliminar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:715:1: ( rule__Preliminar__Group__2__Impl rule__Preliminar__Group__3 )
            // InternalLegisFacile.g:716:2: rule__Preliminar__Group__2__Impl rule__Preliminar__Group__3
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
    // InternalLegisFacile.g:723:1: rule__Preliminar__Group__2__Impl : ( ( rule__Preliminar__EpigrageAssignment_2 ) ) ;
    public final void rule__Preliminar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:727:1: ( ( ( rule__Preliminar__EpigrageAssignment_2 ) ) )
            // InternalLegisFacile.g:728:1: ( ( rule__Preliminar__EpigrageAssignment_2 ) )
            {
            // InternalLegisFacile.g:728:1: ( ( rule__Preliminar__EpigrageAssignment_2 ) )
            // InternalLegisFacile.g:729:2: ( rule__Preliminar__EpigrageAssignment_2 )
            {
             before(grammarAccess.getPreliminarAccess().getEpigrageAssignment_2()); 
            // InternalLegisFacile.g:730:2: ( rule__Preliminar__EpigrageAssignment_2 )
            // InternalLegisFacile.g:730:3: rule__Preliminar__EpigrageAssignment_2
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
    // InternalLegisFacile.g:738:1: rule__Preliminar__Group__3 : rule__Preliminar__Group__3__Impl rule__Preliminar__Group__4 ;
    public final void rule__Preliminar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:742:1: ( rule__Preliminar__Group__3__Impl rule__Preliminar__Group__4 )
            // InternalLegisFacile.g:743:2: rule__Preliminar__Group__3__Impl rule__Preliminar__Group__4
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
    // InternalLegisFacile.g:750:1: rule__Preliminar__Group__3__Impl : ( ',' ) ;
    public final void rule__Preliminar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:754:1: ( ( ',' ) )
            // InternalLegisFacile.g:755:1: ( ',' )
            {
            // InternalLegisFacile.g:755:1: ( ',' )
            // InternalLegisFacile.g:756:2: ','
            {
             before(grammarAccess.getPreliminarAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalLegisFacile.g:765:1: rule__Preliminar__Group__4 : rule__Preliminar__Group__4__Impl rule__Preliminar__Group__5 ;
    public final void rule__Preliminar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:769:1: ( rule__Preliminar__Group__4__Impl rule__Preliminar__Group__5 )
            // InternalLegisFacile.g:770:2: rule__Preliminar__Group__4__Impl rule__Preliminar__Group__5
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
    // InternalLegisFacile.g:777:1: rule__Preliminar__Group__4__Impl : ( ( rule__Preliminar__EmentaAssignment_4 ) ) ;
    public final void rule__Preliminar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:781:1: ( ( ( rule__Preliminar__EmentaAssignment_4 ) ) )
            // InternalLegisFacile.g:782:1: ( ( rule__Preliminar__EmentaAssignment_4 ) )
            {
            // InternalLegisFacile.g:782:1: ( ( rule__Preliminar__EmentaAssignment_4 ) )
            // InternalLegisFacile.g:783:2: ( rule__Preliminar__EmentaAssignment_4 )
            {
             before(grammarAccess.getPreliminarAccess().getEmentaAssignment_4()); 
            // InternalLegisFacile.g:784:2: ( rule__Preliminar__EmentaAssignment_4 )
            // InternalLegisFacile.g:784:3: rule__Preliminar__EmentaAssignment_4
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
    // InternalLegisFacile.g:792:1: rule__Preliminar__Group__5 : rule__Preliminar__Group__5__Impl rule__Preliminar__Group__6 ;
    public final void rule__Preliminar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:796:1: ( rule__Preliminar__Group__5__Impl rule__Preliminar__Group__6 )
            // InternalLegisFacile.g:797:2: rule__Preliminar__Group__5__Impl rule__Preliminar__Group__6
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
    // InternalLegisFacile.g:804:1: rule__Preliminar__Group__5__Impl : ( ',' ) ;
    public final void rule__Preliminar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:808:1: ( ( ',' ) )
            // InternalLegisFacile.g:809:1: ( ',' )
            {
            // InternalLegisFacile.g:809:1: ( ',' )
            // InternalLegisFacile.g:810:2: ','
            {
             before(grammarAccess.getPreliminarAccess().getCommaKeyword_5()); 
            match(input,26,FOLLOW_2); 
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
    // InternalLegisFacile.g:819:1: rule__Preliminar__Group__6 : rule__Preliminar__Group__6__Impl rule__Preliminar__Group__7 ;
    public final void rule__Preliminar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:823:1: ( rule__Preliminar__Group__6__Impl rule__Preliminar__Group__7 )
            // InternalLegisFacile.g:824:2: rule__Preliminar__Group__6__Impl rule__Preliminar__Group__7
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
    // InternalLegisFacile.g:831:1: rule__Preliminar__Group__6__Impl : ( ( rule__Preliminar__PreambuloAssignment_6 ) ) ;
    public final void rule__Preliminar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:835:1: ( ( ( rule__Preliminar__PreambuloAssignment_6 ) ) )
            // InternalLegisFacile.g:836:1: ( ( rule__Preliminar__PreambuloAssignment_6 ) )
            {
            // InternalLegisFacile.g:836:1: ( ( rule__Preliminar__PreambuloAssignment_6 ) )
            // InternalLegisFacile.g:837:2: ( rule__Preliminar__PreambuloAssignment_6 )
            {
             before(grammarAccess.getPreliminarAccess().getPreambuloAssignment_6()); 
            // InternalLegisFacile.g:838:2: ( rule__Preliminar__PreambuloAssignment_6 )
            // InternalLegisFacile.g:838:3: rule__Preliminar__PreambuloAssignment_6
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
    // InternalLegisFacile.g:846:1: rule__Preliminar__Group__7 : rule__Preliminar__Group__7__Impl rule__Preliminar__Group__8 ;
    public final void rule__Preliminar__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:850:1: ( rule__Preliminar__Group__7__Impl rule__Preliminar__Group__8 )
            // InternalLegisFacile.g:851:2: rule__Preliminar__Group__7__Impl rule__Preliminar__Group__8
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
    // InternalLegisFacile.g:858:1: rule__Preliminar__Group__7__Impl : ( ',' ) ;
    public final void rule__Preliminar__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:862:1: ( ( ',' ) )
            // InternalLegisFacile.g:863:1: ( ',' )
            {
            // InternalLegisFacile.g:863:1: ( ',' )
            // InternalLegisFacile.g:864:2: ','
            {
             before(grammarAccess.getPreliminarAccess().getCommaKeyword_7()); 
            match(input,26,FOLLOW_2); 
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
    // InternalLegisFacile.g:873:1: rule__Preliminar__Group__8 : rule__Preliminar__Group__8__Impl ;
    public final void rule__Preliminar__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:877:1: ( rule__Preliminar__Group__8__Impl )
            // InternalLegisFacile.g:878:2: rule__Preliminar__Group__8__Impl
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
    // InternalLegisFacile.g:884:1: rule__Preliminar__Group__8__Impl : ( '}' ) ;
    public final void rule__Preliminar__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:888:1: ( ( '}' ) )
            // InternalLegisFacile.g:889:1: ( '}' )
            {
            // InternalLegisFacile.g:889:1: ( '}' )
            // InternalLegisFacile.g:890:2: '}'
            {
             before(grammarAccess.getPreliminarAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
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
    // InternalLegisFacile.g:900:1: rule__Epigrafe__Group__0 : rule__Epigrafe__Group__0__Impl rule__Epigrafe__Group__1 ;
    public final void rule__Epigrafe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:904:1: ( rule__Epigrafe__Group__0__Impl rule__Epigrafe__Group__1 )
            // InternalLegisFacile.g:905:2: rule__Epigrafe__Group__0__Impl rule__Epigrafe__Group__1
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
    // InternalLegisFacile.g:912:1: rule__Epigrafe__Group__0__Impl : ( ( rule__Epigrafe__Alternatives_0 ) ) ;
    public final void rule__Epigrafe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:916:1: ( ( ( rule__Epigrafe__Alternatives_0 ) ) )
            // InternalLegisFacile.g:917:1: ( ( rule__Epigrafe__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:917:1: ( ( rule__Epigrafe__Alternatives_0 ) )
            // InternalLegisFacile.g:918:2: ( rule__Epigrafe__Alternatives_0 )
            {
             before(grammarAccess.getEpigrafeAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:919:2: ( rule__Epigrafe__Alternatives_0 )
            // InternalLegisFacile.g:919:3: rule__Epigrafe__Alternatives_0
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
    // InternalLegisFacile.g:927:1: rule__Epigrafe__Group__1 : rule__Epigrafe__Group__1__Impl rule__Epigrafe__Group__2 ;
    public final void rule__Epigrafe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:931:1: ( rule__Epigrafe__Group__1__Impl rule__Epigrafe__Group__2 )
            // InternalLegisFacile.g:932:2: rule__Epigrafe__Group__1__Impl rule__Epigrafe__Group__2
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
    // InternalLegisFacile.g:939:1: rule__Epigrafe__Group__1__Impl : ( '(' ) ;
    public final void rule__Epigrafe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:943:1: ( ( '(' ) )
            // InternalLegisFacile.g:944:1: ( '(' )
            {
            // InternalLegisFacile.g:944:1: ( '(' )
            // InternalLegisFacile.g:945:2: '('
            {
             before(grammarAccess.getEpigrafeAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalLegisFacile.g:954:1: rule__Epigrafe__Group__2 : rule__Epigrafe__Group__2__Impl rule__Epigrafe__Group__3 ;
    public final void rule__Epigrafe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:958:1: ( rule__Epigrafe__Group__2__Impl rule__Epigrafe__Group__3 )
            // InternalLegisFacile.g:959:2: rule__Epigrafe__Group__2__Impl rule__Epigrafe__Group__3
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
    // InternalLegisFacile.g:966:1: rule__Epigrafe__Group__2__Impl : ( ( rule__Epigrafe__AtoAssignment_2 ) ) ;
    public final void rule__Epigrafe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:970:1: ( ( ( rule__Epigrafe__AtoAssignment_2 ) ) )
            // InternalLegisFacile.g:971:1: ( ( rule__Epigrafe__AtoAssignment_2 ) )
            {
            // InternalLegisFacile.g:971:1: ( ( rule__Epigrafe__AtoAssignment_2 ) )
            // InternalLegisFacile.g:972:2: ( rule__Epigrafe__AtoAssignment_2 )
            {
             before(grammarAccess.getEpigrafeAccess().getAtoAssignment_2()); 
            // InternalLegisFacile.g:973:2: ( rule__Epigrafe__AtoAssignment_2 )
            // InternalLegisFacile.g:973:3: rule__Epigrafe__AtoAssignment_2
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
    // InternalLegisFacile.g:981:1: rule__Epigrafe__Group__3 : rule__Epigrafe__Group__3__Impl rule__Epigrafe__Group__4 ;
    public final void rule__Epigrafe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:985:1: ( rule__Epigrafe__Group__3__Impl rule__Epigrafe__Group__4 )
            // InternalLegisFacile.g:986:2: rule__Epigrafe__Group__3__Impl rule__Epigrafe__Group__4
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
    // InternalLegisFacile.g:993:1: rule__Epigrafe__Group__3__Impl : ( ',' ) ;
    public final void rule__Epigrafe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:997:1: ( ( ',' ) )
            // InternalLegisFacile.g:998:1: ( ',' )
            {
            // InternalLegisFacile.g:998:1: ( ',' )
            // InternalLegisFacile.g:999:2: ','
            {
             before(grammarAccess.getEpigrafeAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalLegisFacile.g:1008:1: rule__Epigrafe__Group__4 : rule__Epigrafe__Group__4__Impl rule__Epigrafe__Group__5 ;
    public final void rule__Epigrafe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1012:1: ( rule__Epigrafe__Group__4__Impl rule__Epigrafe__Group__5 )
            // InternalLegisFacile.g:1013:2: rule__Epigrafe__Group__4__Impl rule__Epigrafe__Group__5
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
    // InternalLegisFacile.g:1020:1: rule__Epigrafe__Group__4__Impl : ( ( rule__Epigrafe__NumeroAssignment_4 ) ) ;
    public final void rule__Epigrafe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1024:1: ( ( ( rule__Epigrafe__NumeroAssignment_4 ) ) )
            // InternalLegisFacile.g:1025:1: ( ( rule__Epigrafe__NumeroAssignment_4 ) )
            {
            // InternalLegisFacile.g:1025:1: ( ( rule__Epigrafe__NumeroAssignment_4 ) )
            // InternalLegisFacile.g:1026:2: ( rule__Epigrafe__NumeroAssignment_4 )
            {
             before(grammarAccess.getEpigrafeAccess().getNumeroAssignment_4()); 
            // InternalLegisFacile.g:1027:2: ( rule__Epigrafe__NumeroAssignment_4 )
            // InternalLegisFacile.g:1027:3: rule__Epigrafe__NumeroAssignment_4
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
    // InternalLegisFacile.g:1035:1: rule__Epigrafe__Group__5 : rule__Epigrafe__Group__5__Impl rule__Epigrafe__Group__6 ;
    public final void rule__Epigrafe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1039:1: ( rule__Epigrafe__Group__5__Impl rule__Epigrafe__Group__6 )
            // InternalLegisFacile.g:1040:2: rule__Epigrafe__Group__5__Impl rule__Epigrafe__Group__6
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
    // InternalLegisFacile.g:1047:1: rule__Epigrafe__Group__5__Impl : ( ',' ) ;
    public final void rule__Epigrafe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1051:1: ( ( ',' ) )
            // InternalLegisFacile.g:1052:1: ( ',' )
            {
            // InternalLegisFacile.g:1052:1: ( ',' )
            // InternalLegisFacile.g:1053:2: ','
            {
             before(grammarAccess.getEpigrafeAccess().getCommaKeyword_5()); 
            match(input,26,FOLLOW_2); 
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
    // InternalLegisFacile.g:1062:1: rule__Epigrafe__Group__6 : rule__Epigrafe__Group__6__Impl rule__Epigrafe__Group__7 ;
    public final void rule__Epigrafe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1066:1: ( rule__Epigrafe__Group__6__Impl rule__Epigrafe__Group__7 )
            // InternalLegisFacile.g:1067:2: rule__Epigrafe__Group__6__Impl rule__Epigrafe__Group__7
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
    // InternalLegisFacile.g:1074:1: rule__Epigrafe__Group__6__Impl : ( ( rule__Epigrafe__AnoAssignment_6 ) ) ;
    public final void rule__Epigrafe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1078:1: ( ( ( rule__Epigrafe__AnoAssignment_6 ) ) )
            // InternalLegisFacile.g:1079:1: ( ( rule__Epigrafe__AnoAssignment_6 ) )
            {
            // InternalLegisFacile.g:1079:1: ( ( rule__Epigrafe__AnoAssignment_6 ) )
            // InternalLegisFacile.g:1080:2: ( rule__Epigrafe__AnoAssignment_6 )
            {
             before(grammarAccess.getEpigrafeAccess().getAnoAssignment_6()); 
            // InternalLegisFacile.g:1081:2: ( rule__Epigrafe__AnoAssignment_6 )
            // InternalLegisFacile.g:1081:3: rule__Epigrafe__AnoAssignment_6
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
    // InternalLegisFacile.g:1089:1: rule__Epigrafe__Group__7 : rule__Epigrafe__Group__7__Impl ;
    public final void rule__Epigrafe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1093:1: ( rule__Epigrafe__Group__7__Impl )
            // InternalLegisFacile.g:1094:2: rule__Epigrafe__Group__7__Impl
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
    // InternalLegisFacile.g:1100:1: rule__Epigrafe__Group__7__Impl : ( ')' ) ;
    public final void rule__Epigrafe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1104:1: ( ( ')' ) )
            // InternalLegisFacile.g:1105:1: ( ')' )
            {
            // InternalLegisFacile.g:1105:1: ( ')' )
            // InternalLegisFacile.g:1106:2: ')'
            {
             before(grammarAccess.getEpigrafeAccess().getRightParenthesisKeyword_7()); 
            match(input,29,FOLLOW_2); 
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
    // InternalLegisFacile.g:1116:1: rule__Ementa__Group__0 : rule__Ementa__Group__0__Impl rule__Ementa__Group__1 ;
    public final void rule__Ementa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1120:1: ( rule__Ementa__Group__0__Impl rule__Ementa__Group__1 )
            // InternalLegisFacile.g:1121:2: rule__Ementa__Group__0__Impl rule__Ementa__Group__1
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
    // InternalLegisFacile.g:1128:1: rule__Ementa__Group__0__Impl : ( ( rule__Ementa__Alternatives_0 ) ) ;
    public final void rule__Ementa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1132:1: ( ( ( rule__Ementa__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1133:1: ( ( rule__Ementa__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1133:1: ( ( rule__Ementa__Alternatives_0 ) )
            // InternalLegisFacile.g:1134:2: ( rule__Ementa__Alternatives_0 )
            {
             before(grammarAccess.getEmentaAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1135:2: ( rule__Ementa__Alternatives_0 )
            // InternalLegisFacile.g:1135:3: rule__Ementa__Alternatives_0
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
    // InternalLegisFacile.g:1143:1: rule__Ementa__Group__1 : rule__Ementa__Group__1__Impl rule__Ementa__Group__2 ;
    public final void rule__Ementa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1147:1: ( rule__Ementa__Group__1__Impl rule__Ementa__Group__2 )
            // InternalLegisFacile.g:1148:2: rule__Ementa__Group__1__Impl rule__Ementa__Group__2
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
    // InternalLegisFacile.g:1155:1: rule__Ementa__Group__1__Impl : ( '(' ) ;
    public final void rule__Ementa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1159:1: ( ( '(' ) )
            // InternalLegisFacile.g:1160:1: ( '(' )
            {
            // InternalLegisFacile.g:1160:1: ( '(' )
            // InternalLegisFacile.g:1161:2: '('
            {
             before(grammarAccess.getEmentaAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalLegisFacile.g:1170:1: rule__Ementa__Group__2 : rule__Ementa__Group__2__Impl rule__Ementa__Group__3 ;
    public final void rule__Ementa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1174:1: ( rule__Ementa__Group__2__Impl rule__Ementa__Group__3 )
            // InternalLegisFacile.g:1175:2: rule__Ementa__Group__2__Impl rule__Ementa__Group__3
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
    // InternalLegisFacile.g:1182:1: rule__Ementa__Group__2__Impl : ( ( rule__Ementa__EmentaAssignment_2 ) ) ;
    public final void rule__Ementa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1186:1: ( ( ( rule__Ementa__EmentaAssignment_2 ) ) )
            // InternalLegisFacile.g:1187:1: ( ( rule__Ementa__EmentaAssignment_2 ) )
            {
            // InternalLegisFacile.g:1187:1: ( ( rule__Ementa__EmentaAssignment_2 ) )
            // InternalLegisFacile.g:1188:2: ( rule__Ementa__EmentaAssignment_2 )
            {
             before(grammarAccess.getEmentaAccess().getEmentaAssignment_2()); 
            // InternalLegisFacile.g:1189:2: ( rule__Ementa__EmentaAssignment_2 )
            // InternalLegisFacile.g:1189:3: rule__Ementa__EmentaAssignment_2
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
    // InternalLegisFacile.g:1197:1: rule__Ementa__Group__3 : rule__Ementa__Group__3__Impl ;
    public final void rule__Ementa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1201:1: ( rule__Ementa__Group__3__Impl )
            // InternalLegisFacile.g:1202:2: rule__Ementa__Group__3__Impl
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
    // InternalLegisFacile.g:1208:1: rule__Ementa__Group__3__Impl : ( ')' ) ;
    public final void rule__Ementa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1212:1: ( ( ')' ) )
            // InternalLegisFacile.g:1213:1: ( ')' )
            {
            // InternalLegisFacile.g:1213:1: ( ')' )
            // InternalLegisFacile.g:1214:2: ')'
            {
             before(grammarAccess.getEmentaAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalLegisFacile.g:1224:1: rule__Preambulo__Group__0 : rule__Preambulo__Group__0__Impl rule__Preambulo__Group__1 ;
    public final void rule__Preambulo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1228:1: ( rule__Preambulo__Group__0__Impl rule__Preambulo__Group__1 )
            // InternalLegisFacile.g:1229:2: rule__Preambulo__Group__0__Impl rule__Preambulo__Group__1
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
    // InternalLegisFacile.g:1236:1: rule__Preambulo__Group__0__Impl : ( ( rule__Preambulo__Alternatives_0 ) ) ;
    public final void rule__Preambulo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1240:1: ( ( ( rule__Preambulo__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1241:1: ( ( rule__Preambulo__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1241:1: ( ( rule__Preambulo__Alternatives_0 ) )
            // InternalLegisFacile.g:1242:2: ( rule__Preambulo__Alternatives_0 )
            {
             before(grammarAccess.getPreambuloAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1243:2: ( rule__Preambulo__Alternatives_0 )
            // InternalLegisFacile.g:1243:3: rule__Preambulo__Alternatives_0
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
    // InternalLegisFacile.g:1251:1: rule__Preambulo__Group__1 : rule__Preambulo__Group__1__Impl rule__Preambulo__Group__2 ;
    public final void rule__Preambulo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1255:1: ( rule__Preambulo__Group__1__Impl rule__Preambulo__Group__2 )
            // InternalLegisFacile.g:1256:2: rule__Preambulo__Group__1__Impl rule__Preambulo__Group__2
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
    // InternalLegisFacile.g:1263:1: rule__Preambulo__Group__1__Impl : ( '(' ) ;
    public final void rule__Preambulo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1267:1: ( ( '(' ) )
            // InternalLegisFacile.g:1268:1: ( '(' )
            {
            // InternalLegisFacile.g:1268:1: ( '(' )
            // InternalLegisFacile.g:1269:2: '('
            {
             before(grammarAccess.getPreambuloAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalLegisFacile.g:1278:1: rule__Preambulo__Group__2 : rule__Preambulo__Group__2__Impl rule__Preambulo__Group__3 ;
    public final void rule__Preambulo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1282:1: ( rule__Preambulo__Group__2__Impl rule__Preambulo__Group__3 )
            // InternalLegisFacile.g:1283:2: rule__Preambulo__Group__2__Impl rule__Preambulo__Group__3
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
    // InternalLegisFacile.g:1290:1: rule__Preambulo__Group__2__Impl : ( ( rule__Preambulo__PreambuloAssignment_2 ) ) ;
    public final void rule__Preambulo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1294:1: ( ( ( rule__Preambulo__PreambuloAssignment_2 ) ) )
            // InternalLegisFacile.g:1295:1: ( ( rule__Preambulo__PreambuloAssignment_2 ) )
            {
            // InternalLegisFacile.g:1295:1: ( ( rule__Preambulo__PreambuloAssignment_2 ) )
            // InternalLegisFacile.g:1296:2: ( rule__Preambulo__PreambuloAssignment_2 )
            {
             before(grammarAccess.getPreambuloAccess().getPreambuloAssignment_2()); 
            // InternalLegisFacile.g:1297:2: ( rule__Preambulo__PreambuloAssignment_2 )
            // InternalLegisFacile.g:1297:3: rule__Preambulo__PreambuloAssignment_2
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
    // InternalLegisFacile.g:1305:1: rule__Preambulo__Group__3 : rule__Preambulo__Group__3__Impl ;
    public final void rule__Preambulo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1309:1: ( rule__Preambulo__Group__3__Impl )
            // InternalLegisFacile.g:1310:2: rule__Preambulo__Group__3__Impl
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
    // InternalLegisFacile.g:1316:1: rule__Preambulo__Group__3__Impl : ( ')' ) ;
    public final void rule__Preambulo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1320:1: ( ( ')' ) )
            // InternalLegisFacile.g:1321:1: ( ')' )
            {
            // InternalLegisFacile.g:1321:1: ( ')' )
            // InternalLegisFacile.g:1322:2: ')'
            {
             before(grammarAccess.getPreambuloAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalLegisFacile.g:1332:1: rule__Normativa__Group__0 : rule__Normativa__Group__0__Impl rule__Normativa__Group__1 ;
    public final void rule__Normativa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1336:1: ( rule__Normativa__Group__0__Impl rule__Normativa__Group__1 )
            // InternalLegisFacile.g:1337:2: rule__Normativa__Group__0__Impl rule__Normativa__Group__1
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
    // InternalLegisFacile.g:1344:1: rule__Normativa__Group__0__Impl : ( ( rule__Normativa__Alternatives_0 ) ) ;
    public final void rule__Normativa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1348:1: ( ( ( rule__Normativa__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1349:1: ( ( rule__Normativa__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1349:1: ( ( rule__Normativa__Alternatives_0 ) )
            // InternalLegisFacile.g:1350:2: ( rule__Normativa__Alternatives_0 )
            {
             before(grammarAccess.getNormativaAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1351:2: ( rule__Normativa__Alternatives_0 )
            // InternalLegisFacile.g:1351:3: rule__Normativa__Alternatives_0
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
    // InternalLegisFacile.g:1359:1: rule__Normativa__Group__1 : rule__Normativa__Group__1__Impl rule__Normativa__Group__2 ;
    public final void rule__Normativa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1363:1: ( rule__Normativa__Group__1__Impl rule__Normativa__Group__2 )
            // InternalLegisFacile.g:1364:2: rule__Normativa__Group__1__Impl rule__Normativa__Group__2
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
    // InternalLegisFacile.g:1371:1: rule__Normativa__Group__1__Impl : ( '{' ) ;
    public final void rule__Normativa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1375:1: ( ( '{' ) )
            // InternalLegisFacile.g:1376:1: ( '{' )
            {
            // InternalLegisFacile.g:1376:1: ( '{' )
            // InternalLegisFacile.g:1377:2: '{'
            {
             before(grammarAccess.getNormativaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalLegisFacile.g:1386:1: rule__Normativa__Group__2 : rule__Normativa__Group__2__Impl rule__Normativa__Group__3 ;
    public final void rule__Normativa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1390:1: ( rule__Normativa__Group__2__Impl rule__Normativa__Group__3 )
            // InternalLegisFacile.g:1391:2: rule__Normativa__Group__2__Impl rule__Normativa__Group__3
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
    // InternalLegisFacile.g:1398:1: rule__Normativa__Group__2__Impl : ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) ) ;
    public final void rule__Normativa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1402:1: ( ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) ) )
            // InternalLegisFacile.g:1403:1: ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) )
            {
            // InternalLegisFacile.g:1403:1: ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) )
            // InternalLegisFacile.g:1404:2: ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* )
            {
            // InternalLegisFacile.g:1404:2: ( ( rule__Normativa__ArtigosAssignment_2 ) )
            // InternalLegisFacile.g:1405:3: ( rule__Normativa__ArtigosAssignment_2 )
            {
             before(grammarAccess.getNormativaAccess().getArtigosAssignment_2()); 
            // InternalLegisFacile.g:1406:3: ( rule__Normativa__ArtigosAssignment_2 )
            // InternalLegisFacile.g:1406:4: rule__Normativa__ArtigosAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__Normativa__ArtigosAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNormativaAccess().getArtigosAssignment_2()); 

            }

            // InternalLegisFacile.g:1409:2: ( ( rule__Normativa__ArtigosAssignment_2 )* )
            // InternalLegisFacile.g:1410:3: ( rule__Normativa__ArtigosAssignment_2 )*
            {
             before(grammarAccess.getNormativaAccess().getArtigosAssignment_2()); 
            // InternalLegisFacile.g:1411:3: ( rule__Normativa__ArtigosAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=21 && LA10_0<=22)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLegisFacile.g:1411:4: rule__Normativa__ArtigosAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Normativa__ArtigosAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalLegisFacile.g:1420:1: rule__Normativa__Group__3 : rule__Normativa__Group__3__Impl ;
    public final void rule__Normativa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1424:1: ( rule__Normativa__Group__3__Impl )
            // InternalLegisFacile.g:1425:2: rule__Normativa__Group__3__Impl
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
    // InternalLegisFacile.g:1431:1: rule__Normativa__Group__3__Impl : ( '}' ) ;
    public final void rule__Normativa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1435:1: ( ( '}' ) )
            // InternalLegisFacile.g:1436:1: ( '}' )
            {
            // InternalLegisFacile.g:1436:1: ( '}' )
            // InternalLegisFacile.g:1437:2: '}'
            {
             before(grammarAccess.getNormativaAccess().getRightCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalLegisFacile.g:1447:1: rule__Artigo__Group__0 : rule__Artigo__Group__0__Impl rule__Artigo__Group__1 ;
    public final void rule__Artigo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1451:1: ( rule__Artigo__Group__0__Impl rule__Artigo__Group__1 )
            // InternalLegisFacile.g:1452:2: rule__Artigo__Group__0__Impl rule__Artigo__Group__1
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
    // InternalLegisFacile.g:1459:1: rule__Artigo__Group__0__Impl : ( ( rule__Artigo__Alternatives_0 ) ) ;
    public final void rule__Artigo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1463:1: ( ( ( rule__Artigo__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1464:1: ( ( rule__Artigo__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1464:1: ( ( rule__Artigo__Alternatives_0 ) )
            // InternalLegisFacile.g:1465:2: ( rule__Artigo__Alternatives_0 )
            {
             before(grammarAccess.getArtigoAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1466:2: ( rule__Artigo__Alternatives_0 )
            // InternalLegisFacile.g:1466:3: rule__Artigo__Alternatives_0
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
    // InternalLegisFacile.g:1474:1: rule__Artigo__Group__1 : rule__Artigo__Group__1__Impl rule__Artigo__Group__2 ;
    public final void rule__Artigo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1478:1: ( rule__Artigo__Group__1__Impl rule__Artigo__Group__2 )
            // InternalLegisFacile.g:1479:2: rule__Artigo__Group__1__Impl rule__Artigo__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegisFacile.g:1486:1: rule__Artigo__Group__1__Impl : ( '{' ) ;
    public final void rule__Artigo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1490:1: ( ( '{' ) )
            // InternalLegisFacile.g:1491:1: ( '{' )
            {
            // InternalLegisFacile.g:1491:1: ( '{' )
            // InternalLegisFacile.g:1492:2: '{'
            {
             before(grammarAccess.getArtigoAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalLegisFacile.g:1501:1: rule__Artigo__Group__2 : rule__Artigo__Group__2__Impl rule__Artigo__Group__3 ;
    public final void rule__Artigo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1505:1: ( rule__Artigo__Group__2__Impl rule__Artigo__Group__3 )
            // InternalLegisFacile.g:1506:2: rule__Artigo__Group__2__Impl rule__Artigo__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalLegisFacile.g:1513:1: rule__Artigo__Group__2__Impl : ( ( rule__Artigo__CaputAssignment_2 ) ) ;
    public final void rule__Artigo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1517:1: ( ( ( rule__Artigo__CaputAssignment_2 ) ) )
            // InternalLegisFacile.g:1518:1: ( ( rule__Artigo__CaputAssignment_2 ) )
            {
            // InternalLegisFacile.g:1518:1: ( ( rule__Artigo__CaputAssignment_2 ) )
            // InternalLegisFacile.g:1519:2: ( rule__Artigo__CaputAssignment_2 )
            {
             before(grammarAccess.getArtigoAccess().getCaputAssignment_2()); 
            // InternalLegisFacile.g:1520:2: ( rule__Artigo__CaputAssignment_2 )
            // InternalLegisFacile.g:1520:3: rule__Artigo__CaputAssignment_2
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
    // InternalLegisFacile.g:1528:1: rule__Artigo__Group__3 : rule__Artigo__Group__3__Impl rule__Artigo__Group__4 ;
    public final void rule__Artigo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1532:1: ( rule__Artigo__Group__3__Impl rule__Artigo__Group__4 )
            // InternalLegisFacile.g:1533:2: rule__Artigo__Group__3__Impl rule__Artigo__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalLegisFacile.g:1540:1: rule__Artigo__Group__3__Impl : ( ',' ) ;
    public final void rule__Artigo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1544:1: ( ( ',' ) )
            // InternalLegisFacile.g:1545:1: ( ',' )
            {
            // InternalLegisFacile.g:1545:1: ( ',' )
            // InternalLegisFacile.g:1546:2: ','
            {
             before(grammarAccess.getArtigoAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getArtigoAccess().getCommaKeyword_3()); 

            }


            }

        }
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
    // InternalLegisFacile.g:1555:1: rule__Artigo__Group__4 : rule__Artigo__Group__4__Impl rule__Artigo__Group__5 ;
    public final void rule__Artigo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1559:1: ( rule__Artigo__Group__4__Impl rule__Artigo__Group__5 )
            // InternalLegisFacile.g:1560:2: rule__Artigo__Group__4__Impl rule__Artigo__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Artigo__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artigo__Group__5();

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
    // InternalLegisFacile.g:1567:1: rule__Artigo__Group__4__Impl : ( ( rule__Artigo__Group_4__0 )* ) ;
    public final void rule__Artigo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1571:1: ( ( ( rule__Artigo__Group_4__0 )* ) )
            // InternalLegisFacile.g:1572:1: ( ( rule__Artigo__Group_4__0 )* )
            {
            // InternalLegisFacile.g:1572:1: ( ( rule__Artigo__Group_4__0 )* )
            // InternalLegisFacile.g:1573:2: ( rule__Artigo__Group_4__0 )*
            {
             before(grammarAccess.getArtigoAccess().getGroup_4()); 
            // InternalLegisFacile.g:1574:2: ( rule__Artigo__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLegisFacile.g:1574:3: rule__Artigo__Group_4__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Artigo__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getArtigoAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Artigo__Group__5"
    // InternalLegisFacile.g:1582:1: rule__Artigo__Group__5 : rule__Artigo__Group__5__Impl ;
    public final void rule__Artigo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1586:1: ( rule__Artigo__Group__5__Impl )
            // InternalLegisFacile.g:1587:2: rule__Artigo__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Artigo__Group__5__Impl();

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
    // $ANTLR end "rule__Artigo__Group__5"


    // $ANTLR start "rule__Artigo__Group__5__Impl"
    // InternalLegisFacile.g:1593:1: rule__Artigo__Group__5__Impl : ( '}' ) ;
    public final void rule__Artigo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1597:1: ( ( '}' ) )
            // InternalLegisFacile.g:1598:1: ( '}' )
            {
            // InternalLegisFacile.g:1598:1: ( '}' )
            // InternalLegisFacile.g:1599:2: '}'
            {
             before(grammarAccess.getArtigoAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getArtigoAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group__5__Impl"


    // $ANTLR start "rule__Artigo__Group_4__0"
    // InternalLegisFacile.g:1609:1: rule__Artigo__Group_4__0 : rule__Artigo__Group_4__0__Impl rule__Artigo__Group_4__1 ;
    public final void rule__Artigo__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1613:1: ( rule__Artigo__Group_4__0__Impl rule__Artigo__Group_4__1 )
            // InternalLegisFacile.g:1614:2: rule__Artigo__Group_4__0__Impl rule__Artigo__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Artigo__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artigo__Group_4__1();

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
    // $ANTLR end "rule__Artigo__Group_4__0"


    // $ANTLR start "rule__Artigo__Group_4__0__Impl"
    // InternalLegisFacile.g:1621:1: rule__Artigo__Group_4__0__Impl : ( ( rule__Artigo__ParagrafosAssignment_4_0 ) ) ;
    public final void rule__Artigo__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1625:1: ( ( ( rule__Artigo__ParagrafosAssignment_4_0 ) ) )
            // InternalLegisFacile.g:1626:1: ( ( rule__Artigo__ParagrafosAssignment_4_0 ) )
            {
            // InternalLegisFacile.g:1626:1: ( ( rule__Artigo__ParagrafosAssignment_4_0 ) )
            // InternalLegisFacile.g:1627:2: ( rule__Artigo__ParagrafosAssignment_4_0 )
            {
             before(grammarAccess.getArtigoAccess().getParagrafosAssignment_4_0()); 
            // InternalLegisFacile.g:1628:2: ( rule__Artigo__ParagrafosAssignment_4_0 )
            // InternalLegisFacile.g:1628:3: rule__Artigo__ParagrafosAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Artigo__ParagrafosAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getArtigoAccess().getParagrafosAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group_4__0__Impl"


    // $ANTLR start "rule__Artigo__Group_4__1"
    // InternalLegisFacile.g:1636:1: rule__Artigo__Group_4__1 : rule__Artigo__Group_4__1__Impl ;
    public final void rule__Artigo__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1640:1: ( rule__Artigo__Group_4__1__Impl )
            // InternalLegisFacile.g:1641:2: rule__Artigo__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Artigo__Group_4__1__Impl();

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
    // $ANTLR end "rule__Artigo__Group_4__1"


    // $ANTLR start "rule__Artigo__Group_4__1__Impl"
    // InternalLegisFacile.g:1647:1: rule__Artigo__Group_4__1__Impl : ( ',' ) ;
    public final void rule__Artigo__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1651:1: ( ( ',' ) )
            // InternalLegisFacile.g:1652:1: ( ',' )
            {
            // InternalLegisFacile.g:1652:1: ( ',' )
            // InternalLegisFacile.g:1653:2: ','
            {
             before(grammarAccess.getArtigoAccess().getCommaKeyword_4_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getArtigoAccess().getCommaKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group_4__1__Impl"


    // $ANTLR start "rule__Final__Group__0"
    // InternalLegisFacile.g:1663:1: rule__Final__Group__0 : rule__Final__Group__0__Impl rule__Final__Group__1 ;
    public final void rule__Final__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1667:1: ( rule__Final__Group__0__Impl rule__Final__Group__1 )
            // InternalLegisFacile.g:1668:2: rule__Final__Group__0__Impl rule__Final__Group__1
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
    // InternalLegisFacile.g:1675:1: rule__Final__Group__0__Impl : ( ( rule__Final__Alternatives_0 ) ) ;
    public final void rule__Final__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1679:1: ( ( ( rule__Final__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1680:1: ( ( rule__Final__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1680:1: ( ( rule__Final__Alternatives_0 ) )
            // InternalLegisFacile.g:1681:2: ( rule__Final__Alternatives_0 )
            {
             before(grammarAccess.getFinalAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1682:2: ( rule__Final__Alternatives_0 )
            // InternalLegisFacile.g:1682:3: rule__Final__Alternatives_0
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
    // InternalLegisFacile.g:1690:1: rule__Final__Group__1 : rule__Final__Group__1__Impl rule__Final__Group__2 ;
    public final void rule__Final__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1694:1: ( rule__Final__Group__1__Impl rule__Final__Group__2 )
            // InternalLegisFacile.g:1695:2: rule__Final__Group__1__Impl rule__Final__Group__2
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
    // InternalLegisFacile.g:1702:1: rule__Final__Group__1__Impl : ( '{' ) ;
    public final void rule__Final__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1706:1: ( ( '{' ) )
            // InternalLegisFacile.g:1707:1: ( '{' )
            {
            // InternalLegisFacile.g:1707:1: ( '{' )
            // InternalLegisFacile.g:1708:2: '{'
            {
             before(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalLegisFacile.g:1717:1: rule__Final__Group__2 : rule__Final__Group__2__Impl ;
    public final void rule__Final__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1721:1: ( rule__Final__Group__2__Impl )
            // InternalLegisFacile.g:1722:2: rule__Final__Group__2__Impl
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
    // InternalLegisFacile.g:1728:1: rule__Final__Group__2__Impl : ( '}' ) ;
    public final void rule__Final__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1732:1: ( ( '}' ) )
            // InternalLegisFacile.g:1733:1: ( '}' )
            {
            // InternalLegisFacile.g:1733:1: ( '}' )
            // InternalLegisFacile.g:1734:2: '}'
            {
             before(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalLegisFacile.g:1744:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1748:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalLegisFacile.g:1749:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalLegisFacile.g:1756:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1760:1: ( ( 'datatype' ) )
            // InternalLegisFacile.g:1761:1: ( 'datatype' )
            {
            // InternalLegisFacile.g:1761:1: ( 'datatype' )
            // InternalLegisFacile.g:1762:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalLegisFacile.g:1771:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1775:1: ( rule__DataType__Group__1__Impl )
            // InternalLegisFacile.g:1776:2: rule__DataType__Group__1__Impl
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
    // InternalLegisFacile.g:1782:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1786:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalLegisFacile.g:1787:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalLegisFacile.g:1787:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalLegisFacile.g:1788:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalLegisFacile.g:1789:2: ( rule__DataType__NameAssignment_1 )
            // InternalLegisFacile.g:1789:3: rule__DataType__NameAssignment_1
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
    // InternalLegisFacile.g:1798:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1802:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalLegisFacile.g:1803:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalLegisFacile.g:1810:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1814:1: ( ( 'entity' ) )
            // InternalLegisFacile.g:1815:1: ( 'entity' )
            {
            // InternalLegisFacile.g:1815:1: ( 'entity' )
            // InternalLegisFacile.g:1816:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalLegisFacile.g:1825:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1829:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalLegisFacile.g:1830:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalLegisFacile.g:1837:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1841:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalLegisFacile.g:1842:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalLegisFacile.g:1842:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalLegisFacile.g:1843:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalLegisFacile.g:1844:2: ( rule__Entity__NameAssignment_1 )
            // InternalLegisFacile.g:1844:3: rule__Entity__NameAssignment_1
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
    // InternalLegisFacile.g:1852:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1856:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalLegisFacile.g:1857:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalLegisFacile.g:1864:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1868:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalLegisFacile.g:1869:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalLegisFacile.g:1869:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalLegisFacile.g:1870:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalLegisFacile.g:1871:2: ( rule__Entity__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLegisFacile.g:1871:3: rule__Entity__Group_2__0
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
    // InternalLegisFacile.g:1879:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1883:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalLegisFacile.g:1884:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalLegisFacile.g:1891:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1895:1: ( ( '{' ) )
            // InternalLegisFacile.g:1896:1: ( '{' )
            {
            // InternalLegisFacile.g:1896:1: ( '{' )
            // InternalLegisFacile.g:1897:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalLegisFacile.g:1906:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1910:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalLegisFacile.g:1911:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalLegisFacile.g:1918:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FeaturesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1922:1: ( ( ( rule__Entity__FeaturesAssignment_4 )* ) )
            // InternalLegisFacile.g:1923:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            {
            // InternalLegisFacile.g:1923:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            // InternalLegisFacile.g:1924:2: ( rule__Entity__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // InternalLegisFacile.g:1925:2: ( rule__Entity__FeaturesAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLegisFacile.g:1925:3: rule__Entity__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Entity__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalLegisFacile.g:1933:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1937:1: ( rule__Entity__Group__5__Impl )
            // InternalLegisFacile.g:1938:2: rule__Entity__Group__5__Impl
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
    // InternalLegisFacile.g:1944:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1948:1: ( ( '}' ) )
            // InternalLegisFacile.g:1949:1: ( '}' )
            {
            // InternalLegisFacile.g:1949:1: ( '}' )
            // InternalLegisFacile.g:1950:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalLegisFacile.g:1960:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1964:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalLegisFacile.g:1965:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalLegisFacile.g:1972:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1976:1: ( ( 'extends' ) )
            // InternalLegisFacile.g:1977:1: ( 'extends' )
            {
            // InternalLegisFacile.g:1977:1: ( 'extends' )
            // InternalLegisFacile.g:1978:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalLegisFacile.g:1987:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1991:1: ( rule__Entity__Group_2__1__Impl )
            // InternalLegisFacile.g:1992:2: rule__Entity__Group_2__1__Impl
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
    // InternalLegisFacile.g:1998:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2002:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // InternalLegisFacile.g:2003:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // InternalLegisFacile.g:2003:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // InternalLegisFacile.g:2004:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // InternalLegisFacile.g:2005:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            // InternalLegisFacile.g:2005:3: rule__Entity__SuperTypeAssignment_2_1
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
    // InternalLegisFacile.g:2014:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2018:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalLegisFacile.g:2019:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalLegisFacile.g:2026:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__ManyAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2030:1: ( ( ( rule__Feature__ManyAssignment_0 )? ) )
            // InternalLegisFacile.g:2031:1: ( ( rule__Feature__ManyAssignment_0 )? )
            {
            // InternalLegisFacile.g:2031:1: ( ( rule__Feature__ManyAssignment_0 )? )
            // InternalLegisFacile.g:2032:2: ( rule__Feature__ManyAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getManyAssignment_0()); 
            // InternalLegisFacile.g:2033:2: ( rule__Feature__ManyAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLegisFacile.g:2033:3: rule__Feature__ManyAssignment_0
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
    // InternalLegisFacile.g:2041:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2045:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalLegisFacile.g:2046:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalLegisFacile.g:2053:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2057:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalLegisFacile.g:2058:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalLegisFacile.g:2058:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalLegisFacile.g:2059:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalLegisFacile.g:2060:2: ( rule__Feature__NameAssignment_1 )
            // InternalLegisFacile.g:2060:3: rule__Feature__NameAssignment_1
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
    // InternalLegisFacile.g:2068:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2072:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalLegisFacile.g:2073:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalLegisFacile.g:2080:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2084:1: ( ( ':' ) )
            // InternalLegisFacile.g:2085:1: ( ':' )
            {
            // InternalLegisFacile.g:2085:1: ( ':' )
            // InternalLegisFacile.g:2086:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalLegisFacile.g:2095:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2099:1: ( rule__Feature__Group__3__Impl )
            // InternalLegisFacile.g:2100:2: rule__Feature__Group__3__Impl
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
    // InternalLegisFacile.g:2106:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2110:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // InternalLegisFacile.g:2111:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // InternalLegisFacile.g:2111:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // InternalLegisFacile.g:2112:2: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // InternalLegisFacile.g:2113:2: ( rule__Feature__TypeAssignment_3 )
            // InternalLegisFacile.g:2113:3: rule__Feature__TypeAssignment_3
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
    // InternalLegisFacile.g:2122:1: rule__Lei__ElementsAssignment : ( ruleType ) ;
    public final void rule__Lei__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2126:1: ( ( ruleType ) )
            // InternalLegisFacile.g:2127:2: ( ruleType )
            {
            // InternalLegisFacile.g:2127:2: ( ruleType )
            // InternalLegisFacile.g:2128:3: ruleType
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
    // InternalLegisFacile.g:2137:1: rule__Type__PreliminarAssignment_2_0 : ( rulePreliminar ) ;
    public final void rule__Type__PreliminarAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2141:1: ( ( rulePreliminar ) )
            // InternalLegisFacile.g:2142:2: ( rulePreliminar )
            {
            // InternalLegisFacile.g:2142:2: ( rulePreliminar )
            // InternalLegisFacile.g:2143:3: rulePreliminar
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
    // InternalLegisFacile.g:2152:1: rule__Type__NormativaAssignment_2_1 : ( ruleNormativa ) ;
    public final void rule__Type__NormativaAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2156:1: ( ( ruleNormativa ) )
            // InternalLegisFacile.g:2157:2: ( ruleNormativa )
            {
            // InternalLegisFacile.g:2157:2: ( ruleNormativa )
            // InternalLegisFacile.g:2158:3: ruleNormativa
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
    // InternalLegisFacile.g:2167:1: rule__Type__FinalAssignment_2_2 : ( ruleFinal ) ;
    public final void rule__Type__FinalAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2171:1: ( ( ruleFinal ) )
            // InternalLegisFacile.g:2172:2: ( ruleFinal )
            {
            // InternalLegisFacile.g:2172:2: ( ruleFinal )
            // InternalLegisFacile.g:2173:3: ruleFinal
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
    // InternalLegisFacile.g:2182:1: rule__Preliminar__EpigrageAssignment_2 : ( ruleEpigrafe ) ;
    public final void rule__Preliminar__EpigrageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2186:1: ( ( ruleEpigrafe ) )
            // InternalLegisFacile.g:2187:2: ( ruleEpigrafe )
            {
            // InternalLegisFacile.g:2187:2: ( ruleEpigrafe )
            // InternalLegisFacile.g:2188:3: ruleEpigrafe
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
    // InternalLegisFacile.g:2197:1: rule__Preliminar__EmentaAssignment_4 : ( ruleEmenta ) ;
    public final void rule__Preliminar__EmentaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2201:1: ( ( ruleEmenta ) )
            // InternalLegisFacile.g:2202:2: ( ruleEmenta )
            {
            // InternalLegisFacile.g:2202:2: ( ruleEmenta )
            // InternalLegisFacile.g:2203:3: ruleEmenta
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
    // InternalLegisFacile.g:2212:1: rule__Preliminar__PreambuloAssignment_6 : ( rulePreambulo ) ;
    public final void rule__Preliminar__PreambuloAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2216:1: ( ( rulePreambulo ) )
            // InternalLegisFacile.g:2217:2: ( rulePreambulo )
            {
            // InternalLegisFacile.g:2217:2: ( rulePreambulo )
            // InternalLegisFacile.g:2218:3: rulePreambulo
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
    // InternalLegisFacile.g:2227:1: rule__Epigrafe__AtoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Epigrafe__AtoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2231:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:2232:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:2232:2: ( RULE_STRING )
            // InternalLegisFacile.g:2233:3: RULE_STRING
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
    // InternalLegisFacile.g:2242:1: rule__Epigrafe__NumeroAssignment_4 : ( RULE_INT ) ;
    public final void rule__Epigrafe__NumeroAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2246:1: ( ( RULE_INT ) )
            // InternalLegisFacile.g:2247:2: ( RULE_INT )
            {
            // InternalLegisFacile.g:2247:2: ( RULE_INT )
            // InternalLegisFacile.g:2248:3: RULE_INT
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
    // InternalLegisFacile.g:2257:1: rule__Epigrafe__AnoAssignment_6 : ( RULE_INT ) ;
    public final void rule__Epigrafe__AnoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2261:1: ( ( RULE_INT ) )
            // InternalLegisFacile.g:2262:2: ( RULE_INT )
            {
            // InternalLegisFacile.g:2262:2: ( RULE_INT )
            // InternalLegisFacile.g:2263:3: RULE_INT
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
    // InternalLegisFacile.g:2272:1: rule__Ementa__EmentaAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Ementa__EmentaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2276:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:2277:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:2277:2: ( RULE_STRING )
            // InternalLegisFacile.g:2278:3: RULE_STRING
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
    // InternalLegisFacile.g:2287:1: rule__Preambulo__PreambuloAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Preambulo__PreambuloAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2291:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:2292:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:2292:2: ( RULE_STRING )
            // InternalLegisFacile.g:2293:3: RULE_STRING
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
    // InternalLegisFacile.g:2302:1: rule__Normativa__ArtigosAssignment_2 : ( ruleArtigo ) ;
    public final void rule__Normativa__ArtigosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2306:1: ( ( ruleArtigo ) )
            // InternalLegisFacile.g:2307:2: ( ruleArtigo )
            {
            // InternalLegisFacile.g:2307:2: ( ruleArtigo )
            // InternalLegisFacile.g:2308:3: ruleArtigo
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
    // InternalLegisFacile.g:2317:1: rule__Artigo__CaputAssignment_2 : ( ruleCaput ) ;
    public final void rule__Artigo__CaputAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2321:1: ( ( ruleCaput ) )
            // InternalLegisFacile.g:2322:2: ( ruleCaput )
            {
            // InternalLegisFacile.g:2322:2: ( ruleCaput )
            // InternalLegisFacile.g:2323:3: ruleCaput
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


    // $ANTLR start "rule__Artigo__ParagrafosAssignment_4_0"
    // InternalLegisFacile.g:2332:1: rule__Artigo__ParagrafosAssignment_4_0 : ( ruleParagrafo ) ;
    public final void rule__Artigo__ParagrafosAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2336:1: ( ( ruleParagrafo ) )
            // InternalLegisFacile.g:2337:2: ( ruleParagrafo )
            {
            // InternalLegisFacile.g:2337:2: ( ruleParagrafo )
            // InternalLegisFacile.g:2338:3: ruleParagrafo
            {
             before(grammarAccess.getArtigoAccess().getParagrafosParagrafoParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParagrafo();

            state._fsp--;

             after(grammarAccess.getArtigoAccess().getParagrafosParagrafoParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__ParagrafosAssignment_4_0"


    // $ANTLR start "rule__Caput__TextoAssignment"
    // InternalLegisFacile.g:2347:1: rule__Caput__TextoAssignment : ( RULE_STRING ) ;
    public final void rule__Caput__TextoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2351:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:2352:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:2352:2: ( RULE_STRING )
            // InternalLegisFacile.g:2353:3: RULE_STRING
            {
             before(grammarAccess.getCaputAccess().getTextoSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCaputAccess().getTextoSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caput__TextoAssignment"


    // $ANTLR start "rule__Paragrafo__TextoAssignment"
    // InternalLegisFacile.g:2362:1: rule__Paragrafo__TextoAssignment : ( RULE_STRING ) ;
    public final void rule__Paragrafo__TextoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2366:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:2367:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:2367:2: ( RULE_STRING )
            // InternalLegisFacile.g:2368:3: RULE_STRING
            {
             before(grammarAccess.getParagrafoAccess().getTextoSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParagrafoAccess().getTextoSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__TextoAssignment"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalLegisFacile.g:2377:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2381:1: ( ( RULE_ID ) )
            // InternalLegisFacile.g:2382:2: ( RULE_ID )
            {
            // InternalLegisFacile.g:2382:2: ( RULE_ID )
            // InternalLegisFacile.g:2383:3: RULE_ID
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
    // InternalLegisFacile.g:2392:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2396:1: ( ( RULE_ID ) )
            // InternalLegisFacile.g:2397:2: ( RULE_ID )
            {
            // InternalLegisFacile.g:2397:2: ( RULE_ID )
            // InternalLegisFacile.g:2398:3: RULE_ID
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
    // InternalLegisFacile.g:2407:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2411:1: ( ( ( RULE_ID ) ) )
            // InternalLegisFacile.g:2412:2: ( ( RULE_ID ) )
            {
            // InternalLegisFacile.g:2412:2: ( ( RULE_ID ) )
            // InternalLegisFacile.g:2413:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // InternalLegisFacile.g:2414:3: ( RULE_ID )
            // InternalLegisFacile.g:2415:4: RULE_ID
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
    // InternalLegisFacile.g:2426:1: rule__Entity__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2430:1: ( ( ruleFeature ) )
            // InternalLegisFacile.g:2431:2: ( ruleFeature )
            {
            // InternalLegisFacile.g:2431:2: ( ruleFeature )
            // InternalLegisFacile.g:2432:3: ruleFeature
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
    // InternalLegisFacile.g:2441:1: rule__Feature__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Feature__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2445:1: ( ( ( 'many' ) ) )
            // InternalLegisFacile.g:2446:2: ( ( 'many' ) )
            {
            // InternalLegisFacile.g:2446:2: ( ( 'many' ) )
            // InternalLegisFacile.g:2447:3: ( 'many' )
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            // InternalLegisFacile.g:2448:3: ( 'many' )
            // InternalLegisFacile.g:2449:4: 'many'
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalLegisFacile.g:2460:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2464:1: ( ( RULE_ID ) )
            // InternalLegisFacile.g:2465:2: ( RULE_ID )
            {
            // InternalLegisFacile.g:2465:2: ( RULE_ID )
            // InternalLegisFacile.g:2466:3: RULE_ID
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
    // InternalLegisFacile.g:2475:1: rule__Feature__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2479:1: ( ( ( RULE_ID ) ) )
            // InternalLegisFacile.g:2480:2: ( ( RULE_ID ) )
            {
            // InternalLegisFacile.g:2480:2: ( ( RULE_ID ) )
            // InternalLegisFacile.g:2481:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 
            // InternalLegisFacile.g:2482:3: ( RULE_ID )
            // InternalLegisFacile.g:2483:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000C0001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000408000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000042L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});

}