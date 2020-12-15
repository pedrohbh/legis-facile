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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Preliminar'", "'preliminar'", "'Epigrafe'", "'epigrafe'", "'Ementa'", "'ementa'", "'Preambulo'", "'preambulo'", "'Normativa'", "'normativa'", "'Artigo'", "'artigo'", "'Caput'", "'caput'", "'Paragrafo'", "'paragrafo'", "'Inciso'", "'inciso'", "'alinea'", "'Alinea'", "'Item'", "'item'", "'Final'", "'final'", "'vigencia'", "'Vigencia'", "'revoga'", "'Revoga'", "'{'", "','", "'}'", "'('", "')'", "'datatype'", "'entity'", "'extends'", "':'", "'many'"
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
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=44 && LA1_0<=45)) ) {
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


    // $ANTLR start "entryRuleVigencia"
    // InternalLegisFacile.g:403:1: entryRuleVigencia : ruleVigencia EOF ;
    public final void entryRuleVigencia() throws RecognitionException {
        try {
            // InternalLegisFacile.g:404:1: ( ruleVigencia EOF )
            // InternalLegisFacile.g:405:1: ruleVigencia EOF
            {
             before(grammarAccess.getVigenciaRule()); 
            pushFollow(FOLLOW_1);
            ruleVigencia();

            state._fsp--;

             after(grammarAccess.getVigenciaRule()); 
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
    // $ANTLR end "entryRuleVigencia"


    // $ANTLR start "ruleVigencia"
    // InternalLegisFacile.g:412:1: ruleVigencia : ( ( rule__Vigencia__Group__0 ) ) ;
    public final void ruleVigencia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:416:2: ( ( ( rule__Vigencia__Group__0 ) ) )
            // InternalLegisFacile.g:417:2: ( ( rule__Vigencia__Group__0 ) )
            {
            // InternalLegisFacile.g:417:2: ( ( rule__Vigencia__Group__0 ) )
            // InternalLegisFacile.g:418:3: ( rule__Vigencia__Group__0 )
            {
             before(grammarAccess.getVigenciaAccess().getGroup()); 
            // InternalLegisFacile.g:419:3: ( rule__Vigencia__Group__0 )
            // InternalLegisFacile.g:419:4: rule__Vigencia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vigencia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVigenciaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVigencia"


    // $ANTLR start "entryRuleRevogacao"
    // InternalLegisFacile.g:428:1: entryRuleRevogacao : ruleRevogacao EOF ;
    public final void entryRuleRevogacao() throws RecognitionException {
        try {
            // InternalLegisFacile.g:429:1: ( ruleRevogacao EOF )
            // InternalLegisFacile.g:430:1: ruleRevogacao EOF
            {
             before(grammarAccess.getRevogacaoRule()); 
            pushFollow(FOLLOW_1);
            ruleRevogacao();

            state._fsp--;

             after(grammarAccess.getRevogacaoRule()); 
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
    // $ANTLR end "entryRuleRevogacao"


    // $ANTLR start "ruleRevogacao"
    // InternalLegisFacile.g:437:1: ruleRevogacao : ( ( rule__Revogacao__Group__0 ) ) ;
    public final void ruleRevogacao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:441:2: ( ( ( rule__Revogacao__Group__0 ) ) )
            // InternalLegisFacile.g:442:2: ( ( rule__Revogacao__Group__0 ) )
            {
            // InternalLegisFacile.g:442:2: ( ( rule__Revogacao__Group__0 ) )
            // InternalLegisFacile.g:443:3: ( rule__Revogacao__Group__0 )
            {
             before(grammarAccess.getRevogacaoAccess().getGroup()); 
            // InternalLegisFacile.g:444:3: ( rule__Revogacao__Group__0 )
            // InternalLegisFacile.g:444:4: rule__Revogacao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Revogacao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRevogacaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRevogacao"


    // $ANTLR start "entryRuleDataType"
    // InternalLegisFacile.g:453:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalLegisFacile.g:454:1: ( ruleDataType EOF )
            // InternalLegisFacile.g:455:1: ruleDataType EOF
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
    // InternalLegisFacile.g:462:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:466:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalLegisFacile.g:467:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalLegisFacile.g:467:2: ( ( rule__DataType__Group__0 ) )
            // InternalLegisFacile.g:468:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalLegisFacile.g:469:3: ( rule__DataType__Group__0 )
            // InternalLegisFacile.g:469:4: rule__DataType__Group__0
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
    // InternalLegisFacile.g:478:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalLegisFacile.g:479:1: ( ruleEntity EOF )
            // InternalLegisFacile.g:480:1: ruleEntity EOF
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
    // InternalLegisFacile.g:487:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:491:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalLegisFacile.g:492:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalLegisFacile.g:492:2: ( ( rule__Entity__Group__0 ) )
            // InternalLegisFacile.g:493:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalLegisFacile.g:494:3: ( rule__Entity__Group__0 )
            // InternalLegisFacile.g:494:4: rule__Entity__Group__0
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
    // InternalLegisFacile.g:503:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalLegisFacile.g:504:1: ( ruleFeature EOF )
            // InternalLegisFacile.g:505:1: ruleFeature EOF
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
    // InternalLegisFacile.g:512:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:516:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalLegisFacile.g:517:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalLegisFacile.g:517:2: ( ( rule__Feature__Group__0 ) )
            // InternalLegisFacile.g:518:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalLegisFacile.g:519:3: ( rule__Feature__Group__0 )
            // InternalLegisFacile.g:519:4: rule__Feature__Group__0
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
    // InternalLegisFacile.g:527:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) | ( ( rule__Type__Group_2__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:531:1: ( ( ruleDataType ) | ( ruleEntity ) | ( ( rule__Type__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt2=1;
                }
                break;
            case 45:
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
                    // InternalLegisFacile.g:532:2: ( ruleDataType )
                    {
                    // InternalLegisFacile.g:532:2: ( ruleDataType )
                    // InternalLegisFacile.g:533:3: ruleDataType
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
                    // InternalLegisFacile.g:538:2: ( ruleEntity )
                    {
                    // InternalLegisFacile.g:538:2: ( ruleEntity )
                    // InternalLegisFacile.g:539:3: ruleEntity
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
                    // InternalLegisFacile.g:544:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalLegisFacile.g:544:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalLegisFacile.g:545:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalLegisFacile.g:546:3: ( rule__Type__Group_2__0 )
                    // InternalLegisFacile.g:546:4: rule__Type__Group_2__0
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
    // InternalLegisFacile.g:554:1: rule__Preliminar__Alternatives_0 : ( ( 'Preliminar' ) | ( 'preliminar' ) );
    public final void rule__Preliminar__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:558:1: ( ( 'Preliminar' ) | ( 'preliminar' ) )
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
                    // InternalLegisFacile.g:559:2: ( 'Preliminar' )
                    {
                    // InternalLegisFacile.g:559:2: ( 'Preliminar' )
                    // InternalLegisFacile.g:560:3: 'Preliminar'
                    {
                     before(grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:565:2: ( 'preliminar' )
                    {
                    // InternalLegisFacile.g:565:2: ( 'preliminar' )
                    // InternalLegisFacile.g:566:3: 'preliminar'
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
    // InternalLegisFacile.g:575:1: rule__Epigrafe__Alternatives_0 : ( ( 'Epigrafe' ) | ( 'epigrafe' ) );
    public final void rule__Epigrafe__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:579:1: ( ( 'Epigrafe' ) | ( 'epigrafe' ) )
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
                    // InternalLegisFacile.g:580:2: ( 'Epigrafe' )
                    {
                    // InternalLegisFacile.g:580:2: ( 'Epigrafe' )
                    // InternalLegisFacile.g:581:3: 'Epigrafe'
                    {
                     before(grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:586:2: ( 'epigrafe' )
                    {
                    // InternalLegisFacile.g:586:2: ( 'epigrafe' )
                    // InternalLegisFacile.g:587:3: 'epigrafe'
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
    // InternalLegisFacile.g:596:1: rule__Ementa__Alternatives_0 : ( ( 'Ementa' ) | ( 'ementa' ) );
    public final void rule__Ementa__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:600:1: ( ( 'Ementa' ) | ( 'ementa' ) )
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
                    // InternalLegisFacile.g:601:2: ( 'Ementa' )
                    {
                    // InternalLegisFacile.g:601:2: ( 'Ementa' )
                    // InternalLegisFacile.g:602:3: 'Ementa'
                    {
                     before(grammarAccess.getEmentaAccess().getEmentaKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEmentaAccess().getEmentaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:607:2: ( 'ementa' )
                    {
                    // InternalLegisFacile.g:607:2: ( 'ementa' )
                    // InternalLegisFacile.g:608:3: 'ementa'
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
    // InternalLegisFacile.g:617:1: rule__Preambulo__Alternatives_0 : ( ( 'Preambulo' ) | ( 'preambulo' ) );
    public final void rule__Preambulo__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:621:1: ( ( 'Preambulo' ) | ( 'preambulo' ) )
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
                    // InternalLegisFacile.g:622:2: ( 'Preambulo' )
                    {
                    // InternalLegisFacile.g:622:2: ( 'Preambulo' )
                    // InternalLegisFacile.g:623:3: 'Preambulo'
                    {
                     before(grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:628:2: ( 'preambulo' )
                    {
                    // InternalLegisFacile.g:628:2: ( 'preambulo' )
                    // InternalLegisFacile.g:629:3: 'preambulo'
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
    // InternalLegisFacile.g:638:1: rule__Normativa__Alternatives_0 : ( ( 'Normativa' ) | ( 'normativa' ) );
    public final void rule__Normativa__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:642:1: ( ( 'Normativa' ) | ( 'normativa' ) )
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
                    // InternalLegisFacile.g:643:2: ( 'Normativa' )
                    {
                    // InternalLegisFacile.g:643:2: ( 'Normativa' )
                    // InternalLegisFacile.g:644:3: 'Normativa'
                    {
                     before(grammarAccess.getNormativaAccess().getNormativaKeyword_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getNormativaAccess().getNormativaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:649:2: ( 'normativa' )
                    {
                    // InternalLegisFacile.g:649:2: ( 'normativa' )
                    // InternalLegisFacile.g:650:3: 'normativa'
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
    // InternalLegisFacile.g:659:1: rule__Artigo__Alternatives_0 : ( ( 'Artigo' ) | ( 'artigo' ) );
    public final void rule__Artigo__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:663:1: ( ( 'Artigo' ) | ( 'artigo' ) )
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
                    // InternalLegisFacile.g:664:2: ( 'Artigo' )
                    {
                    // InternalLegisFacile.g:664:2: ( 'Artigo' )
                    // InternalLegisFacile.g:665:3: 'Artigo'
                    {
                     before(grammarAccess.getArtigoAccess().getArtigoKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getArtigoAccess().getArtigoKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:670:2: ( 'artigo' )
                    {
                    // InternalLegisFacile.g:670:2: ( 'artigo' )
                    // InternalLegisFacile.g:671:3: 'artigo'
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
    // InternalLegisFacile.g:680:1: rule__Caput__Alternatives_0 : ( ( 'Caput' ) | ( 'caput' ) );
    public final void rule__Caput__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:684:1: ( ( 'Caput' ) | ( 'caput' ) )
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
                    // InternalLegisFacile.g:685:2: ( 'Caput' )
                    {
                    // InternalLegisFacile.g:685:2: ( 'Caput' )
                    // InternalLegisFacile.g:686:3: 'Caput'
                    {
                     before(grammarAccess.getCaputAccess().getCaputKeyword_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getCaputAccess().getCaputKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:691:2: ( 'caput' )
                    {
                    // InternalLegisFacile.g:691:2: ( 'caput' )
                    // InternalLegisFacile.g:692:3: 'caput'
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
    // InternalLegisFacile.g:701:1: rule__Paragrafo__Alternatives_0 : ( ( 'Paragrafo' ) | ( 'paragrafo' ) );
    public final void rule__Paragrafo__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:705:1: ( ( 'Paragrafo' ) | ( 'paragrafo' ) )
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
                    // InternalLegisFacile.g:706:2: ( 'Paragrafo' )
                    {
                    // InternalLegisFacile.g:706:2: ( 'Paragrafo' )
                    // InternalLegisFacile.g:707:3: 'Paragrafo'
                    {
                     before(grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:712:2: ( 'paragrafo' )
                    {
                    // InternalLegisFacile.g:712:2: ( 'paragrafo' )
                    // InternalLegisFacile.g:713:3: 'paragrafo'
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
    // InternalLegisFacile.g:722:1: rule__Inciso__Alternatives_0 : ( ( 'Inciso' ) | ( 'inciso' ) );
    public final void rule__Inciso__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:726:1: ( ( 'Inciso' ) | ( 'inciso' ) )
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
                    // InternalLegisFacile.g:727:2: ( 'Inciso' )
                    {
                    // InternalLegisFacile.g:727:2: ( 'Inciso' )
                    // InternalLegisFacile.g:728:3: 'Inciso'
                    {
                     before(grammarAccess.getIncisoAccess().getIncisoKeyword_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getIncisoAccess().getIncisoKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:733:2: ( 'inciso' )
                    {
                    // InternalLegisFacile.g:733:2: ( 'inciso' )
                    // InternalLegisFacile.g:734:3: 'inciso'
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
    // InternalLegisFacile.g:743:1: rule__Alinea__Alternatives_0 : ( ( 'alinea' ) | ( 'Alinea' ) );
    public final void rule__Alinea__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:747:1: ( ( 'alinea' ) | ( 'Alinea' ) )
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
                    // InternalLegisFacile.g:748:2: ( 'alinea' )
                    {
                    // InternalLegisFacile.g:748:2: ( 'alinea' )
                    // InternalLegisFacile.g:749:3: 'alinea'
                    {
                     before(grammarAccess.getAlineaAccess().getAlineaKeyword_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getAlineaAccess().getAlineaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:754:2: ( 'Alinea' )
                    {
                    // InternalLegisFacile.g:754:2: ( 'Alinea' )
                    // InternalLegisFacile.g:755:3: 'Alinea'
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
    // InternalLegisFacile.g:764:1: rule__Item__Alternatives_0 : ( ( 'Item' ) | ( 'item' ) );
    public final void rule__Item__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:768:1: ( ( 'Item' ) | ( 'item' ) )
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
                    // InternalLegisFacile.g:769:2: ( 'Item' )
                    {
                    // InternalLegisFacile.g:769:2: ( 'Item' )
                    // InternalLegisFacile.g:770:3: 'Item'
                    {
                     before(grammarAccess.getItemAccess().getItemKeyword_0_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getItemAccess().getItemKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:775:2: ( 'item' )
                    {
                    // InternalLegisFacile.g:775:2: ( 'item' )
                    // InternalLegisFacile.g:776:3: 'item'
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
    // InternalLegisFacile.g:785:1: rule__Final__Alternatives_0 : ( ( 'Final' ) | ( 'final' ) );
    public final void rule__Final__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:789:1: ( ( 'Final' ) | ( 'final' ) )
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
                    // InternalLegisFacile.g:790:2: ( 'Final' )
                    {
                    // InternalLegisFacile.g:790:2: ( 'Final' )
                    // InternalLegisFacile.g:791:3: 'Final'
                    {
                     before(grammarAccess.getFinalAccess().getFinalKeyword_0_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getFinalAccess().getFinalKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:796:2: ( 'final' )
                    {
                    // InternalLegisFacile.g:796:2: ( 'final' )
                    // InternalLegisFacile.g:797:3: 'final'
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


    // $ANTLR start "rule__Final__Alternatives_2"
    // InternalLegisFacile.g:806:1: rule__Final__Alternatives_2 : ( ( ( rule__Final__Group_2_0__0 ) ) | ( ( rule__Final__Group_2_1__0 ) ) );
    public final void rule__Final__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:810:1: ( ( ( rule__Final__Group_2_0__0 ) ) | ( ( rule__Final__Group_2_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=35 && LA15_0<=36)) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=37 && LA15_0<=38)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalLegisFacile.g:811:2: ( ( rule__Final__Group_2_0__0 ) )
                    {
                    // InternalLegisFacile.g:811:2: ( ( rule__Final__Group_2_0__0 ) )
                    // InternalLegisFacile.g:812:3: ( rule__Final__Group_2_0__0 )
                    {
                     before(grammarAccess.getFinalAccess().getGroup_2_0()); 
                    // InternalLegisFacile.g:813:3: ( rule__Final__Group_2_0__0 )
                    // InternalLegisFacile.g:813:4: rule__Final__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Final__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFinalAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:817:2: ( ( rule__Final__Group_2_1__0 ) )
                    {
                    // InternalLegisFacile.g:817:2: ( ( rule__Final__Group_2_1__0 ) )
                    // InternalLegisFacile.g:818:3: ( rule__Final__Group_2_1__0 )
                    {
                     before(grammarAccess.getFinalAccess().getGroup_2_1()); 
                    // InternalLegisFacile.g:819:3: ( rule__Final__Group_2_1__0 )
                    // InternalLegisFacile.g:819:4: rule__Final__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Final__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFinalAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Final__Alternatives_2"


    // $ANTLR start "rule__Vigencia__Alternatives_0"
    // InternalLegisFacile.g:827:1: rule__Vigencia__Alternatives_0 : ( ( 'vigencia' ) | ( 'Vigencia' ) );
    public final void rule__Vigencia__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:831:1: ( ( 'vigencia' ) | ( 'Vigencia' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            else if ( (LA16_0==36) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalLegisFacile.g:832:2: ( 'vigencia' )
                    {
                    // InternalLegisFacile.g:832:2: ( 'vigencia' )
                    // InternalLegisFacile.g:833:3: 'vigencia'
                    {
                     before(grammarAccess.getVigenciaAccess().getVigenciaKeyword_0_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getVigenciaAccess().getVigenciaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:838:2: ( 'Vigencia' )
                    {
                    // InternalLegisFacile.g:838:2: ( 'Vigencia' )
                    // InternalLegisFacile.g:839:3: 'Vigencia'
                    {
                     before(grammarAccess.getVigenciaAccess().getVigenciaKeyword_0_1()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getVigenciaAccess().getVigenciaKeyword_0_1()); 

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
    // $ANTLR end "rule__Vigencia__Alternatives_0"


    // $ANTLR start "rule__Revogacao__Alternatives_0"
    // InternalLegisFacile.g:848:1: rule__Revogacao__Alternatives_0 : ( ( 'revoga' ) | ( 'Revoga' ) );
    public final void rule__Revogacao__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:852:1: ( ( 'revoga' ) | ( 'Revoga' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            else if ( (LA17_0==38) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalLegisFacile.g:853:2: ( 'revoga' )
                    {
                    // InternalLegisFacile.g:853:2: ( 'revoga' )
                    // InternalLegisFacile.g:854:3: 'revoga'
                    {
                     before(grammarAccess.getRevogacaoAccess().getRevogaKeyword_0_0()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getRevogacaoAccess().getRevogaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:859:2: ( 'Revoga' )
                    {
                    // InternalLegisFacile.g:859:2: ( 'Revoga' )
                    // InternalLegisFacile.g:860:3: 'Revoga'
                    {
                     before(grammarAccess.getRevogacaoAccess().getRevogaKeyword_0_1()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getRevogacaoAccess().getRevogaKeyword_0_1()); 

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
    // $ANTLR end "rule__Revogacao__Alternatives_0"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalLegisFacile.g:869:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:873:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalLegisFacile.g:874:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
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
    // InternalLegisFacile.g:881:1: rule__Type__Group_2__0__Impl : ( ( rule__Type__PreliminarAssignment_2_0 ) ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:885:1: ( ( ( rule__Type__PreliminarAssignment_2_0 ) ) )
            // InternalLegisFacile.g:886:1: ( ( rule__Type__PreliminarAssignment_2_0 ) )
            {
            // InternalLegisFacile.g:886:1: ( ( rule__Type__PreliminarAssignment_2_0 ) )
            // InternalLegisFacile.g:887:2: ( rule__Type__PreliminarAssignment_2_0 )
            {
             before(grammarAccess.getTypeAccess().getPreliminarAssignment_2_0()); 
            // InternalLegisFacile.g:888:2: ( rule__Type__PreliminarAssignment_2_0 )
            // InternalLegisFacile.g:888:3: rule__Type__PreliminarAssignment_2_0
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
    // InternalLegisFacile.g:896:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:900:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalLegisFacile.g:901:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
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
    // InternalLegisFacile.g:908:1: rule__Type__Group_2__1__Impl : ( ( rule__Type__NormativaAssignment_2_1 ) ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:912:1: ( ( ( rule__Type__NormativaAssignment_2_1 ) ) )
            // InternalLegisFacile.g:913:1: ( ( rule__Type__NormativaAssignment_2_1 ) )
            {
            // InternalLegisFacile.g:913:1: ( ( rule__Type__NormativaAssignment_2_1 ) )
            // InternalLegisFacile.g:914:2: ( rule__Type__NormativaAssignment_2_1 )
            {
             before(grammarAccess.getTypeAccess().getNormativaAssignment_2_1()); 
            // InternalLegisFacile.g:915:2: ( rule__Type__NormativaAssignment_2_1 )
            // InternalLegisFacile.g:915:3: rule__Type__NormativaAssignment_2_1
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
    // InternalLegisFacile.g:923:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:927:1: ( rule__Type__Group_2__2__Impl )
            // InternalLegisFacile.g:928:2: rule__Type__Group_2__2__Impl
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
    // InternalLegisFacile.g:934:1: rule__Type__Group_2__2__Impl : ( ( rule__Type__FinalAssignment_2_2 )? ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:938:1: ( ( ( rule__Type__FinalAssignment_2_2 )? ) )
            // InternalLegisFacile.g:939:1: ( ( rule__Type__FinalAssignment_2_2 )? )
            {
            // InternalLegisFacile.g:939:1: ( ( rule__Type__FinalAssignment_2_2 )? )
            // InternalLegisFacile.g:940:2: ( rule__Type__FinalAssignment_2_2 )?
            {
             before(grammarAccess.getTypeAccess().getFinalAssignment_2_2()); 
            // InternalLegisFacile.g:941:2: ( rule__Type__FinalAssignment_2_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=33 && LA18_0<=34)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLegisFacile.g:941:3: rule__Type__FinalAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__FinalAssignment_2_2();

                    state._fsp--;


                    }
                    break;

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
    // InternalLegisFacile.g:950:1: rule__Preliminar__Group__0 : rule__Preliminar__Group__0__Impl rule__Preliminar__Group__1 ;
    public final void rule__Preliminar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:954:1: ( rule__Preliminar__Group__0__Impl rule__Preliminar__Group__1 )
            // InternalLegisFacile.g:955:2: rule__Preliminar__Group__0__Impl rule__Preliminar__Group__1
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
    // InternalLegisFacile.g:962:1: rule__Preliminar__Group__0__Impl : ( ( rule__Preliminar__Alternatives_0 ) ) ;
    public final void rule__Preliminar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:966:1: ( ( ( rule__Preliminar__Alternatives_0 ) ) )
            // InternalLegisFacile.g:967:1: ( ( rule__Preliminar__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:967:1: ( ( rule__Preliminar__Alternatives_0 ) )
            // InternalLegisFacile.g:968:2: ( rule__Preliminar__Alternatives_0 )
            {
             before(grammarAccess.getPreliminarAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:969:2: ( rule__Preliminar__Alternatives_0 )
            // InternalLegisFacile.g:969:3: rule__Preliminar__Alternatives_0
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
    // InternalLegisFacile.g:977:1: rule__Preliminar__Group__1 : rule__Preliminar__Group__1__Impl rule__Preliminar__Group__2 ;
    public final void rule__Preliminar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:981:1: ( rule__Preliminar__Group__1__Impl rule__Preliminar__Group__2 )
            // InternalLegisFacile.g:982:2: rule__Preliminar__Group__1__Impl rule__Preliminar__Group__2
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
    // InternalLegisFacile.g:989:1: rule__Preliminar__Group__1__Impl : ( '{' ) ;
    public final void rule__Preliminar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:993:1: ( ( '{' ) )
            // InternalLegisFacile.g:994:1: ( '{' )
            {
            // InternalLegisFacile.g:994:1: ( '{' )
            // InternalLegisFacile.g:995:2: '{'
            {
             before(grammarAccess.getPreliminarAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalLegisFacile.g:1004:1: rule__Preliminar__Group__2 : rule__Preliminar__Group__2__Impl rule__Preliminar__Group__3 ;
    public final void rule__Preliminar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1008:1: ( rule__Preliminar__Group__2__Impl rule__Preliminar__Group__3 )
            // InternalLegisFacile.g:1009:2: rule__Preliminar__Group__2__Impl rule__Preliminar__Group__3
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
    // InternalLegisFacile.g:1016:1: rule__Preliminar__Group__2__Impl : ( ( rule__Preliminar__EpigrageAssignment_2 ) ) ;
    public final void rule__Preliminar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1020:1: ( ( ( rule__Preliminar__EpigrageAssignment_2 ) ) )
            // InternalLegisFacile.g:1021:1: ( ( rule__Preliminar__EpigrageAssignment_2 ) )
            {
            // InternalLegisFacile.g:1021:1: ( ( rule__Preliminar__EpigrageAssignment_2 ) )
            // InternalLegisFacile.g:1022:2: ( rule__Preliminar__EpigrageAssignment_2 )
            {
             before(grammarAccess.getPreliminarAccess().getEpigrageAssignment_2()); 
            // InternalLegisFacile.g:1023:2: ( rule__Preliminar__EpigrageAssignment_2 )
            // InternalLegisFacile.g:1023:3: rule__Preliminar__EpigrageAssignment_2
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
    // InternalLegisFacile.g:1031:1: rule__Preliminar__Group__3 : rule__Preliminar__Group__3__Impl rule__Preliminar__Group__4 ;
    public final void rule__Preliminar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1035:1: ( rule__Preliminar__Group__3__Impl rule__Preliminar__Group__4 )
            // InternalLegisFacile.g:1036:2: rule__Preliminar__Group__3__Impl rule__Preliminar__Group__4
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
    // InternalLegisFacile.g:1043:1: rule__Preliminar__Group__3__Impl : ( ',' ) ;
    public final void rule__Preliminar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1047:1: ( ( ',' ) )
            // InternalLegisFacile.g:1048:1: ( ',' )
            {
            // InternalLegisFacile.g:1048:1: ( ',' )
            // InternalLegisFacile.g:1049:2: ','
            {
             before(grammarAccess.getPreliminarAccess().getCommaKeyword_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalLegisFacile.g:1058:1: rule__Preliminar__Group__4 : rule__Preliminar__Group__4__Impl rule__Preliminar__Group__5 ;
    public final void rule__Preliminar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1062:1: ( rule__Preliminar__Group__4__Impl rule__Preliminar__Group__5 )
            // InternalLegisFacile.g:1063:2: rule__Preliminar__Group__4__Impl rule__Preliminar__Group__5
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
    // InternalLegisFacile.g:1070:1: rule__Preliminar__Group__4__Impl : ( ( rule__Preliminar__EmentaAssignment_4 ) ) ;
    public final void rule__Preliminar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1074:1: ( ( ( rule__Preliminar__EmentaAssignment_4 ) ) )
            // InternalLegisFacile.g:1075:1: ( ( rule__Preliminar__EmentaAssignment_4 ) )
            {
            // InternalLegisFacile.g:1075:1: ( ( rule__Preliminar__EmentaAssignment_4 ) )
            // InternalLegisFacile.g:1076:2: ( rule__Preliminar__EmentaAssignment_4 )
            {
             before(grammarAccess.getPreliminarAccess().getEmentaAssignment_4()); 
            // InternalLegisFacile.g:1077:2: ( rule__Preliminar__EmentaAssignment_4 )
            // InternalLegisFacile.g:1077:3: rule__Preliminar__EmentaAssignment_4
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
    // InternalLegisFacile.g:1085:1: rule__Preliminar__Group__5 : rule__Preliminar__Group__5__Impl rule__Preliminar__Group__6 ;
    public final void rule__Preliminar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1089:1: ( rule__Preliminar__Group__5__Impl rule__Preliminar__Group__6 )
            // InternalLegisFacile.g:1090:2: rule__Preliminar__Group__5__Impl rule__Preliminar__Group__6
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
    // InternalLegisFacile.g:1097:1: rule__Preliminar__Group__5__Impl : ( ',' ) ;
    public final void rule__Preliminar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1101:1: ( ( ',' ) )
            // InternalLegisFacile.g:1102:1: ( ',' )
            {
            // InternalLegisFacile.g:1102:1: ( ',' )
            // InternalLegisFacile.g:1103:2: ','
            {
             before(grammarAccess.getPreliminarAccess().getCommaKeyword_5()); 
            match(input,40,FOLLOW_2); 
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
    // InternalLegisFacile.g:1112:1: rule__Preliminar__Group__6 : rule__Preliminar__Group__6__Impl rule__Preliminar__Group__7 ;
    public final void rule__Preliminar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1116:1: ( rule__Preliminar__Group__6__Impl rule__Preliminar__Group__7 )
            // InternalLegisFacile.g:1117:2: rule__Preliminar__Group__6__Impl rule__Preliminar__Group__7
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
    // InternalLegisFacile.g:1124:1: rule__Preliminar__Group__6__Impl : ( ( rule__Preliminar__PreambuloAssignment_6 ) ) ;
    public final void rule__Preliminar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1128:1: ( ( ( rule__Preliminar__PreambuloAssignment_6 ) ) )
            // InternalLegisFacile.g:1129:1: ( ( rule__Preliminar__PreambuloAssignment_6 ) )
            {
            // InternalLegisFacile.g:1129:1: ( ( rule__Preliminar__PreambuloAssignment_6 ) )
            // InternalLegisFacile.g:1130:2: ( rule__Preliminar__PreambuloAssignment_6 )
            {
             before(grammarAccess.getPreliminarAccess().getPreambuloAssignment_6()); 
            // InternalLegisFacile.g:1131:2: ( rule__Preliminar__PreambuloAssignment_6 )
            // InternalLegisFacile.g:1131:3: rule__Preliminar__PreambuloAssignment_6
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
    // InternalLegisFacile.g:1139:1: rule__Preliminar__Group__7 : rule__Preliminar__Group__7__Impl rule__Preliminar__Group__8 ;
    public final void rule__Preliminar__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1143:1: ( rule__Preliminar__Group__7__Impl rule__Preliminar__Group__8 )
            // InternalLegisFacile.g:1144:2: rule__Preliminar__Group__7__Impl rule__Preliminar__Group__8
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
    // InternalLegisFacile.g:1151:1: rule__Preliminar__Group__7__Impl : ( ',' ) ;
    public final void rule__Preliminar__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1155:1: ( ( ',' ) )
            // InternalLegisFacile.g:1156:1: ( ',' )
            {
            // InternalLegisFacile.g:1156:1: ( ',' )
            // InternalLegisFacile.g:1157:2: ','
            {
             before(grammarAccess.getPreliminarAccess().getCommaKeyword_7()); 
            match(input,40,FOLLOW_2); 
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
    // InternalLegisFacile.g:1166:1: rule__Preliminar__Group__8 : rule__Preliminar__Group__8__Impl ;
    public final void rule__Preliminar__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1170:1: ( rule__Preliminar__Group__8__Impl )
            // InternalLegisFacile.g:1171:2: rule__Preliminar__Group__8__Impl
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
    // InternalLegisFacile.g:1177:1: rule__Preliminar__Group__8__Impl : ( '}' ) ;
    public final void rule__Preliminar__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1181:1: ( ( '}' ) )
            // InternalLegisFacile.g:1182:1: ( '}' )
            {
            // InternalLegisFacile.g:1182:1: ( '}' )
            // InternalLegisFacile.g:1183:2: '}'
            {
             before(grammarAccess.getPreliminarAccess().getRightCurlyBracketKeyword_8()); 
            match(input,41,FOLLOW_2); 
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
    // InternalLegisFacile.g:1193:1: rule__Epigrafe__Group__0 : rule__Epigrafe__Group__0__Impl rule__Epigrafe__Group__1 ;
    public final void rule__Epigrafe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1197:1: ( rule__Epigrafe__Group__0__Impl rule__Epigrafe__Group__1 )
            // InternalLegisFacile.g:1198:2: rule__Epigrafe__Group__0__Impl rule__Epigrafe__Group__1
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
    // InternalLegisFacile.g:1205:1: rule__Epigrafe__Group__0__Impl : ( ( rule__Epigrafe__Alternatives_0 ) ) ;
    public final void rule__Epigrafe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1209:1: ( ( ( rule__Epigrafe__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1210:1: ( ( rule__Epigrafe__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1210:1: ( ( rule__Epigrafe__Alternatives_0 ) )
            // InternalLegisFacile.g:1211:2: ( rule__Epigrafe__Alternatives_0 )
            {
             before(grammarAccess.getEpigrafeAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1212:2: ( rule__Epigrafe__Alternatives_0 )
            // InternalLegisFacile.g:1212:3: rule__Epigrafe__Alternatives_0
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
    // InternalLegisFacile.g:1220:1: rule__Epigrafe__Group__1 : rule__Epigrafe__Group__1__Impl rule__Epigrafe__Group__2 ;
    public final void rule__Epigrafe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1224:1: ( rule__Epigrafe__Group__1__Impl rule__Epigrafe__Group__2 )
            // InternalLegisFacile.g:1225:2: rule__Epigrafe__Group__1__Impl rule__Epigrafe__Group__2
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
    // InternalLegisFacile.g:1232:1: rule__Epigrafe__Group__1__Impl : ( '(' ) ;
    public final void rule__Epigrafe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1236:1: ( ( '(' ) )
            // InternalLegisFacile.g:1237:1: ( '(' )
            {
            // InternalLegisFacile.g:1237:1: ( '(' )
            // InternalLegisFacile.g:1238:2: '('
            {
             before(grammarAccess.getEpigrafeAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalLegisFacile.g:1247:1: rule__Epigrafe__Group__2 : rule__Epigrafe__Group__2__Impl rule__Epigrafe__Group__3 ;
    public final void rule__Epigrafe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1251:1: ( rule__Epigrafe__Group__2__Impl rule__Epigrafe__Group__3 )
            // InternalLegisFacile.g:1252:2: rule__Epigrafe__Group__2__Impl rule__Epigrafe__Group__3
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
    // InternalLegisFacile.g:1259:1: rule__Epigrafe__Group__2__Impl : ( ( rule__Epigrafe__AtoAssignment_2 ) ) ;
    public final void rule__Epigrafe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1263:1: ( ( ( rule__Epigrafe__AtoAssignment_2 ) ) )
            // InternalLegisFacile.g:1264:1: ( ( rule__Epigrafe__AtoAssignment_2 ) )
            {
            // InternalLegisFacile.g:1264:1: ( ( rule__Epigrafe__AtoAssignment_2 ) )
            // InternalLegisFacile.g:1265:2: ( rule__Epigrafe__AtoAssignment_2 )
            {
             before(grammarAccess.getEpigrafeAccess().getAtoAssignment_2()); 
            // InternalLegisFacile.g:1266:2: ( rule__Epigrafe__AtoAssignment_2 )
            // InternalLegisFacile.g:1266:3: rule__Epigrafe__AtoAssignment_2
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
    // InternalLegisFacile.g:1274:1: rule__Epigrafe__Group__3 : rule__Epigrafe__Group__3__Impl rule__Epigrafe__Group__4 ;
    public final void rule__Epigrafe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1278:1: ( rule__Epigrafe__Group__3__Impl rule__Epigrafe__Group__4 )
            // InternalLegisFacile.g:1279:2: rule__Epigrafe__Group__3__Impl rule__Epigrafe__Group__4
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
    // InternalLegisFacile.g:1286:1: rule__Epigrafe__Group__3__Impl : ( ',' ) ;
    public final void rule__Epigrafe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1290:1: ( ( ',' ) )
            // InternalLegisFacile.g:1291:1: ( ',' )
            {
            // InternalLegisFacile.g:1291:1: ( ',' )
            // InternalLegisFacile.g:1292:2: ','
            {
             before(grammarAccess.getEpigrafeAccess().getCommaKeyword_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalLegisFacile.g:1301:1: rule__Epigrafe__Group__4 : rule__Epigrafe__Group__4__Impl rule__Epigrafe__Group__5 ;
    public final void rule__Epigrafe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1305:1: ( rule__Epigrafe__Group__4__Impl rule__Epigrafe__Group__5 )
            // InternalLegisFacile.g:1306:2: rule__Epigrafe__Group__4__Impl rule__Epigrafe__Group__5
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
    // InternalLegisFacile.g:1313:1: rule__Epigrafe__Group__4__Impl : ( ( rule__Epigrafe__NumeroAssignment_4 ) ) ;
    public final void rule__Epigrafe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1317:1: ( ( ( rule__Epigrafe__NumeroAssignment_4 ) ) )
            // InternalLegisFacile.g:1318:1: ( ( rule__Epigrafe__NumeroAssignment_4 ) )
            {
            // InternalLegisFacile.g:1318:1: ( ( rule__Epigrafe__NumeroAssignment_4 ) )
            // InternalLegisFacile.g:1319:2: ( rule__Epigrafe__NumeroAssignment_4 )
            {
             before(grammarAccess.getEpigrafeAccess().getNumeroAssignment_4()); 
            // InternalLegisFacile.g:1320:2: ( rule__Epigrafe__NumeroAssignment_4 )
            // InternalLegisFacile.g:1320:3: rule__Epigrafe__NumeroAssignment_4
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
    // InternalLegisFacile.g:1328:1: rule__Epigrafe__Group__5 : rule__Epigrafe__Group__5__Impl rule__Epigrafe__Group__6 ;
    public final void rule__Epigrafe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1332:1: ( rule__Epigrafe__Group__5__Impl rule__Epigrafe__Group__6 )
            // InternalLegisFacile.g:1333:2: rule__Epigrafe__Group__5__Impl rule__Epigrafe__Group__6
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
    // InternalLegisFacile.g:1340:1: rule__Epigrafe__Group__5__Impl : ( ',' ) ;
    public final void rule__Epigrafe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1344:1: ( ( ',' ) )
            // InternalLegisFacile.g:1345:1: ( ',' )
            {
            // InternalLegisFacile.g:1345:1: ( ',' )
            // InternalLegisFacile.g:1346:2: ','
            {
             before(grammarAccess.getEpigrafeAccess().getCommaKeyword_5()); 
            match(input,40,FOLLOW_2); 
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
    // InternalLegisFacile.g:1355:1: rule__Epigrafe__Group__6 : rule__Epigrafe__Group__6__Impl rule__Epigrafe__Group__7 ;
    public final void rule__Epigrafe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1359:1: ( rule__Epigrafe__Group__6__Impl rule__Epigrafe__Group__7 )
            // InternalLegisFacile.g:1360:2: rule__Epigrafe__Group__6__Impl rule__Epigrafe__Group__7
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
    // InternalLegisFacile.g:1367:1: rule__Epigrafe__Group__6__Impl : ( ( rule__Epigrafe__AnoAssignment_6 ) ) ;
    public final void rule__Epigrafe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1371:1: ( ( ( rule__Epigrafe__AnoAssignment_6 ) ) )
            // InternalLegisFacile.g:1372:1: ( ( rule__Epigrafe__AnoAssignment_6 ) )
            {
            // InternalLegisFacile.g:1372:1: ( ( rule__Epigrafe__AnoAssignment_6 ) )
            // InternalLegisFacile.g:1373:2: ( rule__Epigrafe__AnoAssignment_6 )
            {
             before(grammarAccess.getEpigrafeAccess().getAnoAssignment_6()); 
            // InternalLegisFacile.g:1374:2: ( rule__Epigrafe__AnoAssignment_6 )
            // InternalLegisFacile.g:1374:3: rule__Epigrafe__AnoAssignment_6
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
    // InternalLegisFacile.g:1382:1: rule__Epigrafe__Group__7 : rule__Epigrafe__Group__7__Impl ;
    public final void rule__Epigrafe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1386:1: ( rule__Epigrafe__Group__7__Impl )
            // InternalLegisFacile.g:1387:2: rule__Epigrafe__Group__7__Impl
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
    // InternalLegisFacile.g:1393:1: rule__Epigrafe__Group__7__Impl : ( ')' ) ;
    public final void rule__Epigrafe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1397:1: ( ( ')' ) )
            // InternalLegisFacile.g:1398:1: ( ')' )
            {
            // InternalLegisFacile.g:1398:1: ( ')' )
            // InternalLegisFacile.g:1399:2: ')'
            {
             before(grammarAccess.getEpigrafeAccess().getRightParenthesisKeyword_7()); 
            match(input,43,FOLLOW_2); 
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
    // InternalLegisFacile.g:1409:1: rule__Ementa__Group__0 : rule__Ementa__Group__0__Impl rule__Ementa__Group__1 ;
    public final void rule__Ementa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1413:1: ( rule__Ementa__Group__0__Impl rule__Ementa__Group__1 )
            // InternalLegisFacile.g:1414:2: rule__Ementa__Group__0__Impl rule__Ementa__Group__1
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
    // InternalLegisFacile.g:1421:1: rule__Ementa__Group__0__Impl : ( ( rule__Ementa__Alternatives_0 ) ) ;
    public final void rule__Ementa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1425:1: ( ( ( rule__Ementa__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1426:1: ( ( rule__Ementa__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1426:1: ( ( rule__Ementa__Alternatives_0 ) )
            // InternalLegisFacile.g:1427:2: ( rule__Ementa__Alternatives_0 )
            {
             before(grammarAccess.getEmentaAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1428:2: ( rule__Ementa__Alternatives_0 )
            // InternalLegisFacile.g:1428:3: rule__Ementa__Alternatives_0
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
    // InternalLegisFacile.g:1436:1: rule__Ementa__Group__1 : rule__Ementa__Group__1__Impl rule__Ementa__Group__2 ;
    public final void rule__Ementa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1440:1: ( rule__Ementa__Group__1__Impl rule__Ementa__Group__2 )
            // InternalLegisFacile.g:1441:2: rule__Ementa__Group__1__Impl rule__Ementa__Group__2
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
    // InternalLegisFacile.g:1448:1: rule__Ementa__Group__1__Impl : ( '(' ) ;
    public final void rule__Ementa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1452:1: ( ( '(' ) )
            // InternalLegisFacile.g:1453:1: ( '(' )
            {
            // InternalLegisFacile.g:1453:1: ( '(' )
            // InternalLegisFacile.g:1454:2: '('
            {
             before(grammarAccess.getEmentaAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalLegisFacile.g:1463:1: rule__Ementa__Group__2 : rule__Ementa__Group__2__Impl rule__Ementa__Group__3 ;
    public final void rule__Ementa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1467:1: ( rule__Ementa__Group__2__Impl rule__Ementa__Group__3 )
            // InternalLegisFacile.g:1468:2: rule__Ementa__Group__2__Impl rule__Ementa__Group__3
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
    // InternalLegisFacile.g:1475:1: rule__Ementa__Group__2__Impl : ( ( rule__Ementa__EmentaAssignment_2 ) ) ;
    public final void rule__Ementa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1479:1: ( ( ( rule__Ementa__EmentaAssignment_2 ) ) )
            // InternalLegisFacile.g:1480:1: ( ( rule__Ementa__EmentaAssignment_2 ) )
            {
            // InternalLegisFacile.g:1480:1: ( ( rule__Ementa__EmentaAssignment_2 ) )
            // InternalLegisFacile.g:1481:2: ( rule__Ementa__EmentaAssignment_2 )
            {
             before(grammarAccess.getEmentaAccess().getEmentaAssignment_2()); 
            // InternalLegisFacile.g:1482:2: ( rule__Ementa__EmentaAssignment_2 )
            // InternalLegisFacile.g:1482:3: rule__Ementa__EmentaAssignment_2
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
    // InternalLegisFacile.g:1490:1: rule__Ementa__Group__3 : rule__Ementa__Group__3__Impl ;
    public final void rule__Ementa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1494:1: ( rule__Ementa__Group__3__Impl )
            // InternalLegisFacile.g:1495:2: rule__Ementa__Group__3__Impl
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
    // InternalLegisFacile.g:1501:1: rule__Ementa__Group__3__Impl : ( ')' ) ;
    public final void rule__Ementa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1505:1: ( ( ')' ) )
            // InternalLegisFacile.g:1506:1: ( ')' )
            {
            // InternalLegisFacile.g:1506:1: ( ')' )
            // InternalLegisFacile.g:1507:2: ')'
            {
             before(grammarAccess.getEmentaAccess().getRightParenthesisKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalLegisFacile.g:1517:1: rule__Preambulo__Group__0 : rule__Preambulo__Group__0__Impl rule__Preambulo__Group__1 ;
    public final void rule__Preambulo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1521:1: ( rule__Preambulo__Group__0__Impl rule__Preambulo__Group__1 )
            // InternalLegisFacile.g:1522:2: rule__Preambulo__Group__0__Impl rule__Preambulo__Group__1
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
    // InternalLegisFacile.g:1529:1: rule__Preambulo__Group__0__Impl : ( ( rule__Preambulo__Alternatives_0 ) ) ;
    public final void rule__Preambulo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1533:1: ( ( ( rule__Preambulo__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1534:1: ( ( rule__Preambulo__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1534:1: ( ( rule__Preambulo__Alternatives_0 ) )
            // InternalLegisFacile.g:1535:2: ( rule__Preambulo__Alternatives_0 )
            {
             before(grammarAccess.getPreambuloAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1536:2: ( rule__Preambulo__Alternatives_0 )
            // InternalLegisFacile.g:1536:3: rule__Preambulo__Alternatives_0
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
    // InternalLegisFacile.g:1544:1: rule__Preambulo__Group__1 : rule__Preambulo__Group__1__Impl rule__Preambulo__Group__2 ;
    public final void rule__Preambulo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1548:1: ( rule__Preambulo__Group__1__Impl rule__Preambulo__Group__2 )
            // InternalLegisFacile.g:1549:2: rule__Preambulo__Group__1__Impl rule__Preambulo__Group__2
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
    // InternalLegisFacile.g:1556:1: rule__Preambulo__Group__1__Impl : ( '(' ) ;
    public final void rule__Preambulo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1560:1: ( ( '(' ) )
            // InternalLegisFacile.g:1561:1: ( '(' )
            {
            // InternalLegisFacile.g:1561:1: ( '(' )
            // InternalLegisFacile.g:1562:2: '('
            {
             before(grammarAccess.getPreambuloAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalLegisFacile.g:1571:1: rule__Preambulo__Group__2 : rule__Preambulo__Group__2__Impl rule__Preambulo__Group__3 ;
    public final void rule__Preambulo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1575:1: ( rule__Preambulo__Group__2__Impl rule__Preambulo__Group__3 )
            // InternalLegisFacile.g:1576:2: rule__Preambulo__Group__2__Impl rule__Preambulo__Group__3
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
    // InternalLegisFacile.g:1583:1: rule__Preambulo__Group__2__Impl : ( ( rule__Preambulo__PreambuloAssignment_2 ) ) ;
    public final void rule__Preambulo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1587:1: ( ( ( rule__Preambulo__PreambuloAssignment_2 ) ) )
            // InternalLegisFacile.g:1588:1: ( ( rule__Preambulo__PreambuloAssignment_2 ) )
            {
            // InternalLegisFacile.g:1588:1: ( ( rule__Preambulo__PreambuloAssignment_2 ) )
            // InternalLegisFacile.g:1589:2: ( rule__Preambulo__PreambuloAssignment_2 )
            {
             before(grammarAccess.getPreambuloAccess().getPreambuloAssignment_2()); 
            // InternalLegisFacile.g:1590:2: ( rule__Preambulo__PreambuloAssignment_2 )
            // InternalLegisFacile.g:1590:3: rule__Preambulo__PreambuloAssignment_2
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
    // InternalLegisFacile.g:1598:1: rule__Preambulo__Group__3 : rule__Preambulo__Group__3__Impl ;
    public final void rule__Preambulo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1602:1: ( rule__Preambulo__Group__3__Impl )
            // InternalLegisFacile.g:1603:2: rule__Preambulo__Group__3__Impl
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
    // InternalLegisFacile.g:1609:1: rule__Preambulo__Group__3__Impl : ( ')' ) ;
    public final void rule__Preambulo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1613:1: ( ( ')' ) )
            // InternalLegisFacile.g:1614:1: ( ')' )
            {
            // InternalLegisFacile.g:1614:1: ( ')' )
            // InternalLegisFacile.g:1615:2: ')'
            {
             before(grammarAccess.getPreambuloAccess().getRightParenthesisKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalLegisFacile.g:1625:1: rule__Normativa__Group__0 : rule__Normativa__Group__0__Impl rule__Normativa__Group__1 ;
    public final void rule__Normativa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1629:1: ( rule__Normativa__Group__0__Impl rule__Normativa__Group__1 )
            // InternalLegisFacile.g:1630:2: rule__Normativa__Group__0__Impl rule__Normativa__Group__1
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
    // InternalLegisFacile.g:1637:1: rule__Normativa__Group__0__Impl : ( ( rule__Normativa__Alternatives_0 ) ) ;
    public final void rule__Normativa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1641:1: ( ( ( rule__Normativa__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1642:1: ( ( rule__Normativa__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1642:1: ( ( rule__Normativa__Alternatives_0 ) )
            // InternalLegisFacile.g:1643:2: ( rule__Normativa__Alternatives_0 )
            {
             before(grammarAccess.getNormativaAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1644:2: ( rule__Normativa__Alternatives_0 )
            // InternalLegisFacile.g:1644:3: rule__Normativa__Alternatives_0
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
    // InternalLegisFacile.g:1652:1: rule__Normativa__Group__1 : rule__Normativa__Group__1__Impl rule__Normativa__Group__2 ;
    public final void rule__Normativa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1656:1: ( rule__Normativa__Group__1__Impl rule__Normativa__Group__2 )
            // InternalLegisFacile.g:1657:2: rule__Normativa__Group__1__Impl rule__Normativa__Group__2
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
    // InternalLegisFacile.g:1664:1: rule__Normativa__Group__1__Impl : ( '{' ) ;
    public final void rule__Normativa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1668:1: ( ( '{' ) )
            // InternalLegisFacile.g:1669:1: ( '{' )
            {
            // InternalLegisFacile.g:1669:1: ( '{' )
            // InternalLegisFacile.g:1670:2: '{'
            {
             before(grammarAccess.getNormativaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalLegisFacile.g:1679:1: rule__Normativa__Group__2 : rule__Normativa__Group__2__Impl rule__Normativa__Group__3 ;
    public final void rule__Normativa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1683:1: ( rule__Normativa__Group__2__Impl rule__Normativa__Group__3 )
            // InternalLegisFacile.g:1684:2: rule__Normativa__Group__2__Impl rule__Normativa__Group__3
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
    // InternalLegisFacile.g:1691:1: rule__Normativa__Group__2__Impl : ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) ) ;
    public final void rule__Normativa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1695:1: ( ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) ) )
            // InternalLegisFacile.g:1696:1: ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) )
            {
            // InternalLegisFacile.g:1696:1: ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) )
            // InternalLegisFacile.g:1697:2: ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* )
            {
            // InternalLegisFacile.g:1697:2: ( ( rule__Normativa__ArtigosAssignment_2 ) )
            // InternalLegisFacile.g:1698:3: ( rule__Normativa__ArtigosAssignment_2 )
            {
             before(grammarAccess.getNormativaAccess().getArtigosAssignment_2()); 
            // InternalLegisFacile.g:1699:3: ( rule__Normativa__ArtigosAssignment_2 )
            // InternalLegisFacile.g:1699:4: rule__Normativa__ArtigosAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__Normativa__ArtigosAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNormativaAccess().getArtigosAssignment_2()); 

            }

            // InternalLegisFacile.g:1702:2: ( ( rule__Normativa__ArtigosAssignment_2 )* )
            // InternalLegisFacile.g:1703:3: ( rule__Normativa__ArtigosAssignment_2 )*
            {
             before(grammarAccess.getNormativaAccess().getArtigosAssignment_2()); 
            // InternalLegisFacile.g:1704:3: ( rule__Normativa__ArtigosAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=21 && LA19_0<=22)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLegisFacile.g:1704:4: rule__Normativa__ArtigosAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Normativa__ArtigosAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalLegisFacile.g:1713:1: rule__Normativa__Group__3 : rule__Normativa__Group__3__Impl ;
    public final void rule__Normativa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1717:1: ( rule__Normativa__Group__3__Impl )
            // InternalLegisFacile.g:1718:2: rule__Normativa__Group__3__Impl
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
    // InternalLegisFacile.g:1724:1: rule__Normativa__Group__3__Impl : ( '}' ) ;
    public final void rule__Normativa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1728:1: ( ( '}' ) )
            // InternalLegisFacile.g:1729:1: ( '}' )
            {
            // InternalLegisFacile.g:1729:1: ( '}' )
            // InternalLegisFacile.g:1730:2: '}'
            {
             before(grammarAccess.getNormativaAccess().getRightCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalLegisFacile.g:1740:1: rule__Artigo__Group__0 : rule__Artigo__Group__0__Impl rule__Artigo__Group__1 ;
    public final void rule__Artigo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1744:1: ( rule__Artigo__Group__0__Impl rule__Artigo__Group__1 )
            // InternalLegisFacile.g:1745:2: rule__Artigo__Group__0__Impl rule__Artigo__Group__1
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
    // InternalLegisFacile.g:1752:1: rule__Artigo__Group__0__Impl : ( ( rule__Artigo__Alternatives_0 ) ) ;
    public final void rule__Artigo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1756:1: ( ( ( rule__Artigo__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1757:1: ( ( rule__Artigo__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1757:1: ( ( rule__Artigo__Alternatives_0 ) )
            // InternalLegisFacile.g:1758:2: ( rule__Artigo__Alternatives_0 )
            {
             before(grammarAccess.getArtigoAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1759:2: ( rule__Artigo__Alternatives_0 )
            // InternalLegisFacile.g:1759:3: rule__Artigo__Alternatives_0
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
    // InternalLegisFacile.g:1767:1: rule__Artigo__Group__1 : rule__Artigo__Group__1__Impl rule__Artigo__Group__2 ;
    public final void rule__Artigo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1771:1: ( rule__Artigo__Group__1__Impl rule__Artigo__Group__2 )
            // InternalLegisFacile.g:1772:2: rule__Artigo__Group__1__Impl rule__Artigo__Group__2
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
    // InternalLegisFacile.g:1779:1: rule__Artigo__Group__1__Impl : ( '{' ) ;
    public final void rule__Artigo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1783:1: ( ( '{' ) )
            // InternalLegisFacile.g:1784:1: ( '{' )
            {
            // InternalLegisFacile.g:1784:1: ( '{' )
            // InternalLegisFacile.g:1785:2: '{'
            {
             before(grammarAccess.getArtigoAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalLegisFacile.g:1794:1: rule__Artigo__Group__2 : rule__Artigo__Group__2__Impl rule__Artigo__Group__3 ;
    public final void rule__Artigo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1798:1: ( rule__Artigo__Group__2__Impl rule__Artigo__Group__3 )
            // InternalLegisFacile.g:1799:2: rule__Artigo__Group__2__Impl rule__Artigo__Group__3
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
    // InternalLegisFacile.g:1806:1: rule__Artigo__Group__2__Impl : ( ( rule__Artigo__CaputAssignment_2 ) ) ;
    public final void rule__Artigo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1810:1: ( ( ( rule__Artigo__CaputAssignment_2 ) ) )
            // InternalLegisFacile.g:1811:1: ( ( rule__Artigo__CaputAssignment_2 ) )
            {
            // InternalLegisFacile.g:1811:1: ( ( rule__Artigo__CaputAssignment_2 ) )
            // InternalLegisFacile.g:1812:2: ( rule__Artigo__CaputAssignment_2 )
            {
             before(grammarAccess.getArtigoAccess().getCaputAssignment_2()); 
            // InternalLegisFacile.g:1813:2: ( rule__Artigo__CaputAssignment_2 )
            // InternalLegisFacile.g:1813:3: rule__Artigo__CaputAssignment_2
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
    // InternalLegisFacile.g:1821:1: rule__Artigo__Group__3 : rule__Artigo__Group__3__Impl rule__Artigo__Group__4 ;
    public final void rule__Artigo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1825:1: ( rule__Artigo__Group__3__Impl rule__Artigo__Group__4 )
            // InternalLegisFacile.g:1826:2: rule__Artigo__Group__3__Impl rule__Artigo__Group__4
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
    // InternalLegisFacile.g:1833:1: rule__Artigo__Group__3__Impl : ( ( rule__Artigo__ParagrafosAssignment_3 )* ) ;
    public final void rule__Artigo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1837:1: ( ( ( rule__Artigo__ParagrafosAssignment_3 )* ) )
            // InternalLegisFacile.g:1838:1: ( ( rule__Artigo__ParagrafosAssignment_3 )* )
            {
            // InternalLegisFacile.g:1838:1: ( ( rule__Artigo__ParagrafosAssignment_3 )* )
            // InternalLegisFacile.g:1839:2: ( rule__Artigo__ParagrafosAssignment_3 )*
            {
             before(grammarAccess.getArtigoAccess().getParagrafosAssignment_3()); 
            // InternalLegisFacile.g:1840:2: ( rule__Artigo__ParagrafosAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=25 && LA20_0<=26)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLegisFacile.g:1840:3: rule__Artigo__ParagrafosAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Artigo__ParagrafosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalLegisFacile.g:1848:1: rule__Artigo__Group__4 : rule__Artigo__Group__4__Impl ;
    public final void rule__Artigo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1852:1: ( rule__Artigo__Group__4__Impl )
            // InternalLegisFacile.g:1853:2: rule__Artigo__Group__4__Impl
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
    // InternalLegisFacile.g:1859:1: rule__Artigo__Group__4__Impl : ( '}' ) ;
    public final void rule__Artigo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1863:1: ( ( '}' ) )
            // InternalLegisFacile.g:1864:1: ( '}' )
            {
            // InternalLegisFacile.g:1864:1: ( '}' )
            // InternalLegisFacile.g:1865:2: '}'
            {
             before(grammarAccess.getArtigoAccess().getRightCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalLegisFacile.g:1875:1: rule__Caput__Group__0 : rule__Caput__Group__0__Impl rule__Caput__Group__1 ;
    public final void rule__Caput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1879:1: ( rule__Caput__Group__0__Impl rule__Caput__Group__1 )
            // InternalLegisFacile.g:1880:2: rule__Caput__Group__0__Impl rule__Caput__Group__1
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
    // InternalLegisFacile.g:1887:1: rule__Caput__Group__0__Impl : ( ( rule__Caput__Alternatives_0 ) ) ;
    public final void rule__Caput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1891:1: ( ( ( rule__Caput__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1892:1: ( ( rule__Caput__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1892:1: ( ( rule__Caput__Alternatives_0 ) )
            // InternalLegisFacile.g:1893:2: ( rule__Caput__Alternatives_0 )
            {
             before(grammarAccess.getCaputAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1894:2: ( rule__Caput__Alternatives_0 )
            // InternalLegisFacile.g:1894:3: rule__Caput__Alternatives_0
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
    // InternalLegisFacile.g:1902:1: rule__Caput__Group__1 : rule__Caput__Group__1__Impl rule__Caput__Group__2 ;
    public final void rule__Caput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1906:1: ( rule__Caput__Group__1__Impl rule__Caput__Group__2 )
            // InternalLegisFacile.g:1907:2: rule__Caput__Group__1__Impl rule__Caput__Group__2
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
    // InternalLegisFacile.g:1914:1: rule__Caput__Group__1__Impl : ( '(' ) ;
    public final void rule__Caput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1918:1: ( ( '(' ) )
            // InternalLegisFacile.g:1919:1: ( '(' )
            {
            // InternalLegisFacile.g:1919:1: ( '(' )
            // InternalLegisFacile.g:1920:2: '('
            {
             before(grammarAccess.getCaputAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalLegisFacile.g:1929:1: rule__Caput__Group__2 : rule__Caput__Group__2__Impl rule__Caput__Group__3 ;
    public final void rule__Caput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1933:1: ( rule__Caput__Group__2__Impl rule__Caput__Group__3 )
            // InternalLegisFacile.g:1934:2: rule__Caput__Group__2__Impl rule__Caput__Group__3
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
    // InternalLegisFacile.g:1941:1: rule__Caput__Group__2__Impl : ( ( rule__Caput__TextoAssignment_2 ) ) ;
    public final void rule__Caput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1945:1: ( ( ( rule__Caput__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:1946:1: ( ( rule__Caput__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:1946:1: ( ( rule__Caput__TextoAssignment_2 ) )
            // InternalLegisFacile.g:1947:2: ( rule__Caput__TextoAssignment_2 )
            {
             before(grammarAccess.getCaputAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:1948:2: ( rule__Caput__TextoAssignment_2 )
            // InternalLegisFacile.g:1948:3: rule__Caput__TextoAssignment_2
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
    // InternalLegisFacile.g:1956:1: rule__Caput__Group__3 : rule__Caput__Group__3__Impl rule__Caput__Group__4 ;
    public final void rule__Caput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1960:1: ( rule__Caput__Group__3__Impl rule__Caput__Group__4 )
            // InternalLegisFacile.g:1961:2: rule__Caput__Group__3__Impl rule__Caput__Group__4
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
    // InternalLegisFacile.g:1968:1: rule__Caput__Group__3__Impl : ( ')' ) ;
    public final void rule__Caput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1972:1: ( ( ')' ) )
            // InternalLegisFacile.g:1973:1: ( ')' )
            {
            // InternalLegisFacile.g:1973:1: ( ')' )
            // InternalLegisFacile.g:1974:2: ')'
            {
             before(grammarAccess.getCaputAccess().getRightParenthesisKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalLegisFacile.g:1983:1: rule__Caput__Group__4 : rule__Caput__Group__4__Impl ;
    public final void rule__Caput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1987:1: ( rule__Caput__Group__4__Impl )
            // InternalLegisFacile.g:1988:2: rule__Caput__Group__4__Impl
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
    // InternalLegisFacile.g:1994:1: rule__Caput__Group__4__Impl : ( ( rule__Caput__Group_4__0 )? ) ;
    public final void rule__Caput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1998:1: ( ( ( rule__Caput__Group_4__0 )? ) )
            // InternalLegisFacile.g:1999:1: ( ( rule__Caput__Group_4__0 )? )
            {
            // InternalLegisFacile.g:1999:1: ( ( rule__Caput__Group_4__0 )? )
            // InternalLegisFacile.g:2000:2: ( rule__Caput__Group_4__0 )?
            {
             before(grammarAccess.getCaputAccess().getGroup_4()); 
            // InternalLegisFacile.g:2001:2: ( rule__Caput__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLegisFacile.g:2001:3: rule__Caput__Group_4__0
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
    // InternalLegisFacile.g:2010:1: rule__Caput__Group_4__0 : rule__Caput__Group_4__0__Impl rule__Caput__Group_4__1 ;
    public final void rule__Caput__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2014:1: ( rule__Caput__Group_4__0__Impl rule__Caput__Group_4__1 )
            // InternalLegisFacile.g:2015:2: rule__Caput__Group_4__0__Impl rule__Caput__Group_4__1
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
    // InternalLegisFacile.g:2022:1: rule__Caput__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Caput__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2026:1: ( ( '{' ) )
            // InternalLegisFacile.g:2027:1: ( '{' )
            {
            // InternalLegisFacile.g:2027:1: ( '{' )
            // InternalLegisFacile.g:2028:2: '{'
            {
             before(grammarAccess.getCaputAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalLegisFacile.g:2037:1: rule__Caput__Group_4__1 : rule__Caput__Group_4__1__Impl rule__Caput__Group_4__2 ;
    public final void rule__Caput__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2041:1: ( rule__Caput__Group_4__1__Impl rule__Caput__Group_4__2 )
            // InternalLegisFacile.g:2042:2: rule__Caput__Group_4__1__Impl rule__Caput__Group_4__2
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
    // InternalLegisFacile.g:2049:1: rule__Caput__Group_4__1__Impl : ( ( rule__Caput__IncisosAssignment_4_1 )* ) ;
    public final void rule__Caput__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2053:1: ( ( ( rule__Caput__IncisosAssignment_4_1 )* ) )
            // InternalLegisFacile.g:2054:1: ( ( rule__Caput__IncisosAssignment_4_1 )* )
            {
            // InternalLegisFacile.g:2054:1: ( ( rule__Caput__IncisosAssignment_4_1 )* )
            // InternalLegisFacile.g:2055:2: ( rule__Caput__IncisosAssignment_4_1 )*
            {
             before(grammarAccess.getCaputAccess().getIncisosAssignment_4_1()); 
            // InternalLegisFacile.g:2056:2: ( rule__Caput__IncisosAssignment_4_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=27 && LA22_0<=28)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLegisFacile.g:2056:3: rule__Caput__IncisosAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Caput__IncisosAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalLegisFacile.g:2064:1: rule__Caput__Group_4__2 : rule__Caput__Group_4__2__Impl ;
    public final void rule__Caput__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2068:1: ( rule__Caput__Group_4__2__Impl )
            // InternalLegisFacile.g:2069:2: rule__Caput__Group_4__2__Impl
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
    // InternalLegisFacile.g:2075:1: rule__Caput__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Caput__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2079:1: ( ( '}' ) )
            // InternalLegisFacile.g:2080:1: ( '}' )
            {
            // InternalLegisFacile.g:2080:1: ( '}' )
            // InternalLegisFacile.g:2081:2: '}'
            {
             before(grammarAccess.getCaputAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalLegisFacile.g:2091:1: rule__Paragrafo__Group__0 : rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1 ;
    public final void rule__Paragrafo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2095:1: ( rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1 )
            // InternalLegisFacile.g:2096:2: rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1
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
    // InternalLegisFacile.g:2103:1: rule__Paragrafo__Group__0__Impl : ( ( rule__Paragrafo__Alternatives_0 ) ) ;
    public final void rule__Paragrafo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2107:1: ( ( ( rule__Paragrafo__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2108:1: ( ( rule__Paragrafo__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2108:1: ( ( rule__Paragrafo__Alternatives_0 ) )
            // InternalLegisFacile.g:2109:2: ( rule__Paragrafo__Alternatives_0 )
            {
             before(grammarAccess.getParagrafoAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2110:2: ( rule__Paragrafo__Alternatives_0 )
            // InternalLegisFacile.g:2110:3: rule__Paragrafo__Alternatives_0
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
    // InternalLegisFacile.g:2118:1: rule__Paragrafo__Group__1 : rule__Paragrafo__Group__1__Impl rule__Paragrafo__Group__2 ;
    public final void rule__Paragrafo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2122:1: ( rule__Paragrafo__Group__1__Impl rule__Paragrafo__Group__2 )
            // InternalLegisFacile.g:2123:2: rule__Paragrafo__Group__1__Impl rule__Paragrafo__Group__2
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
    // InternalLegisFacile.g:2130:1: rule__Paragrafo__Group__1__Impl : ( '(' ) ;
    public final void rule__Paragrafo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2134:1: ( ( '(' ) )
            // InternalLegisFacile.g:2135:1: ( '(' )
            {
            // InternalLegisFacile.g:2135:1: ( '(' )
            // InternalLegisFacile.g:2136:2: '('
            {
             before(grammarAccess.getParagrafoAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalLegisFacile.g:2145:1: rule__Paragrafo__Group__2 : rule__Paragrafo__Group__2__Impl rule__Paragrafo__Group__3 ;
    public final void rule__Paragrafo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2149:1: ( rule__Paragrafo__Group__2__Impl rule__Paragrafo__Group__3 )
            // InternalLegisFacile.g:2150:2: rule__Paragrafo__Group__2__Impl rule__Paragrafo__Group__3
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
    // InternalLegisFacile.g:2157:1: rule__Paragrafo__Group__2__Impl : ( ( rule__Paragrafo__TextoAssignment_2 ) ) ;
    public final void rule__Paragrafo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2161:1: ( ( ( rule__Paragrafo__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:2162:1: ( ( rule__Paragrafo__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:2162:1: ( ( rule__Paragrafo__TextoAssignment_2 ) )
            // InternalLegisFacile.g:2163:2: ( rule__Paragrafo__TextoAssignment_2 )
            {
             before(grammarAccess.getParagrafoAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:2164:2: ( rule__Paragrafo__TextoAssignment_2 )
            // InternalLegisFacile.g:2164:3: rule__Paragrafo__TextoAssignment_2
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
    // InternalLegisFacile.g:2172:1: rule__Paragrafo__Group__3 : rule__Paragrafo__Group__3__Impl rule__Paragrafo__Group__4 ;
    public final void rule__Paragrafo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2176:1: ( rule__Paragrafo__Group__3__Impl rule__Paragrafo__Group__4 )
            // InternalLegisFacile.g:2177:2: rule__Paragrafo__Group__3__Impl rule__Paragrafo__Group__4
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
    // InternalLegisFacile.g:2184:1: rule__Paragrafo__Group__3__Impl : ( ')' ) ;
    public final void rule__Paragrafo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2188:1: ( ( ')' ) )
            // InternalLegisFacile.g:2189:1: ( ')' )
            {
            // InternalLegisFacile.g:2189:1: ( ')' )
            // InternalLegisFacile.g:2190:2: ')'
            {
             before(grammarAccess.getParagrafoAccess().getRightParenthesisKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalLegisFacile.g:2199:1: rule__Paragrafo__Group__4 : rule__Paragrafo__Group__4__Impl ;
    public final void rule__Paragrafo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2203:1: ( rule__Paragrafo__Group__4__Impl )
            // InternalLegisFacile.g:2204:2: rule__Paragrafo__Group__4__Impl
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
    // InternalLegisFacile.g:2210:1: rule__Paragrafo__Group__4__Impl : ( ( rule__Paragrafo__Group_4__0 )? ) ;
    public final void rule__Paragrafo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2214:1: ( ( ( rule__Paragrafo__Group_4__0 )? ) )
            // InternalLegisFacile.g:2215:1: ( ( rule__Paragrafo__Group_4__0 )? )
            {
            // InternalLegisFacile.g:2215:1: ( ( rule__Paragrafo__Group_4__0 )? )
            // InternalLegisFacile.g:2216:2: ( rule__Paragrafo__Group_4__0 )?
            {
             before(grammarAccess.getParagrafoAccess().getGroup_4()); 
            // InternalLegisFacile.g:2217:2: ( rule__Paragrafo__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLegisFacile.g:2217:3: rule__Paragrafo__Group_4__0
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
    // InternalLegisFacile.g:2226:1: rule__Paragrafo__Group_4__0 : rule__Paragrafo__Group_4__0__Impl rule__Paragrafo__Group_4__1 ;
    public final void rule__Paragrafo__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2230:1: ( rule__Paragrafo__Group_4__0__Impl rule__Paragrafo__Group_4__1 )
            // InternalLegisFacile.g:2231:2: rule__Paragrafo__Group_4__0__Impl rule__Paragrafo__Group_4__1
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
    // InternalLegisFacile.g:2238:1: rule__Paragrafo__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Paragrafo__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2242:1: ( ( '{' ) )
            // InternalLegisFacile.g:2243:1: ( '{' )
            {
            // InternalLegisFacile.g:2243:1: ( '{' )
            // InternalLegisFacile.g:2244:2: '{'
            {
             before(grammarAccess.getParagrafoAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalLegisFacile.g:2253:1: rule__Paragrafo__Group_4__1 : rule__Paragrafo__Group_4__1__Impl rule__Paragrafo__Group_4__2 ;
    public final void rule__Paragrafo__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2257:1: ( rule__Paragrafo__Group_4__1__Impl rule__Paragrafo__Group_4__2 )
            // InternalLegisFacile.g:2258:2: rule__Paragrafo__Group_4__1__Impl rule__Paragrafo__Group_4__2
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
    // InternalLegisFacile.g:2265:1: rule__Paragrafo__Group_4__1__Impl : ( ( rule__Paragrafo__IncisosAssignment_4_1 )* ) ;
    public final void rule__Paragrafo__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2269:1: ( ( ( rule__Paragrafo__IncisosAssignment_4_1 )* ) )
            // InternalLegisFacile.g:2270:1: ( ( rule__Paragrafo__IncisosAssignment_4_1 )* )
            {
            // InternalLegisFacile.g:2270:1: ( ( rule__Paragrafo__IncisosAssignment_4_1 )* )
            // InternalLegisFacile.g:2271:2: ( rule__Paragrafo__IncisosAssignment_4_1 )*
            {
             before(grammarAccess.getParagrafoAccess().getIncisosAssignment_4_1()); 
            // InternalLegisFacile.g:2272:2: ( rule__Paragrafo__IncisosAssignment_4_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=27 && LA24_0<=28)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalLegisFacile.g:2272:3: rule__Paragrafo__IncisosAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Paragrafo__IncisosAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalLegisFacile.g:2280:1: rule__Paragrafo__Group_4__2 : rule__Paragrafo__Group_4__2__Impl ;
    public final void rule__Paragrafo__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2284:1: ( rule__Paragrafo__Group_4__2__Impl )
            // InternalLegisFacile.g:2285:2: rule__Paragrafo__Group_4__2__Impl
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
    // InternalLegisFacile.g:2291:1: rule__Paragrafo__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Paragrafo__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2295:1: ( ( '}' ) )
            // InternalLegisFacile.g:2296:1: ( '}' )
            {
            // InternalLegisFacile.g:2296:1: ( '}' )
            // InternalLegisFacile.g:2297:2: '}'
            {
             before(grammarAccess.getParagrafoAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalLegisFacile.g:2307:1: rule__Inciso__Group__0 : rule__Inciso__Group__0__Impl rule__Inciso__Group__1 ;
    public final void rule__Inciso__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2311:1: ( rule__Inciso__Group__0__Impl rule__Inciso__Group__1 )
            // InternalLegisFacile.g:2312:2: rule__Inciso__Group__0__Impl rule__Inciso__Group__1
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
    // InternalLegisFacile.g:2319:1: rule__Inciso__Group__0__Impl : ( ( rule__Inciso__Alternatives_0 ) ) ;
    public final void rule__Inciso__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2323:1: ( ( ( rule__Inciso__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2324:1: ( ( rule__Inciso__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2324:1: ( ( rule__Inciso__Alternatives_0 ) )
            // InternalLegisFacile.g:2325:2: ( rule__Inciso__Alternatives_0 )
            {
             before(grammarAccess.getIncisoAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2326:2: ( rule__Inciso__Alternatives_0 )
            // InternalLegisFacile.g:2326:3: rule__Inciso__Alternatives_0
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
    // InternalLegisFacile.g:2334:1: rule__Inciso__Group__1 : rule__Inciso__Group__1__Impl rule__Inciso__Group__2 ;
    public final void rule__Inciso__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2338:1: ( rule__Inciso__Group__1__Impl rule__Inciso__Group__2 )
            // InternalLegisFacile.g:2339:2: rule__Inciso__Group__1__Impl rule__Inciso__Group__2
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
    // InternalLegisFacile.g:2346:1: rule__Inciso__Group__1__Impl : ( '(' ) ;
    public final void rule__Inciso__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2350:1: ( ( '(' ) )
            // InternalLegisFacile.g:2351:1: ( '(' )
            {
            // InternalLegisFacile.g:2351:1: ( '(' )
            // InternalLegisFacile.g:2352:2: '('
            {
             before(grammarAccess.getIncisoAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalLegisFacile.g:2361:1: rule__Inciso__Group__2 : rule__Inciso__Group__2__Impl rule__Inciso__Group__3 ;
    public final void rule__Inciso__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2365:1: ( rule__Inciso__Group__2__Impl rule__Inciso__Group__3 )
            // InternalLegisFacile.g:2366:2: rule__Inciso__Group__2__Impl rule__Inciso__Group__3
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
    // InternalLegisFacile.g:2373:1: rule__Inciso__Group__2__Impl : ( ( rule__Inciso__TextoAssignment_2 ) ) ;
    public final void rule__Inciso__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2377:1: ( ( ( rule__Inciso__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:2378:1: ( ( rule__Inciso__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:2378:1: ( ( rule__Inciso__TextoAssignment_2 ) )
            // InternalLegisFacile.g:2379:2: ( rule__Inciso__TextoAssignment_2 )
            {
             before(grammarAccess.getIncisoAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:2380:2: ( rule__Inciso__TextoAssignment_2 )
            // InternalLegisFacile.g:2380:3: rule__Inciso__TextoAssignment_2
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
    // InternalLegisFacile.g:2388:1: rule__Inciso__Group__3 : rule__Inciso__Group__3__Impl rule__Inciso__Group__4 ;
    public final void rule__Inciso__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2392:1: ( rule__Inciso__Group__3__Impl rule__Inciso__Group__4 )
            // InternalLegisFacile.g:2393:2: rule__Inciso__Group__3__Impl rule__Inciso__Group__4
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
    // InternalLegisFacile.g:2400:1: rule__Inciso__Group__3__Impl : ( ')' ) ;
    public final void rule__Inciso__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2404:1: ( ( ')' ) )
            // InternalLegisFacile.g:2405:1: ( ')' )
            {
            // InternalLegisFacile.g:2405:1: ( ')' )
            // InternalLegisFacile.g:2406:2: ')'
            {
             before(grammarAccess.getIncisoAccess().getRightParenthesisKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalLegisFacile.g:2415:1: rule__Inciso__Group__4 : rule__Inciso__Group__4__Impl ;
    public final void rule__Inciso__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2419:1: ( rule__Inciso__Group__4__Impl )
            // InternalLegisFacile.g:2420:2: rule__Inciso__Group__4__Impl
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
    // InternalLegisFacile.g:2426:1: rule__Inciso__Group__4__Impl : ( ( rule__Inciso__Group_4__0 )? ) ;
    public final void rule__Inciso__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2430:1: ( ( ( rule__Inciso__Group_4__0 )? ) )
            // InternalLegisFacile.g:2431:1: ( ( rule__Inciso__Group_4__0 )? )
            {
            // InternalLegisFacile.g:2431:1: ( ( rule__Inciso__Group_4__0 )? )
            // InternalLegisFacile.g:2432:2: ( rule__Inciso__Group_4__0 )?
            {
             before(grammarAccess.getIncisoAccess().getGroup_4()); 
            // InternalLegisFacile.g:2433:2: ( rule__Inciso__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLegisFacile.g:2433:3: rule__Inciso__Group_4__0
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
    // InternalLegisFacile.g:2442:1: rule__Inciso__Group_4__0 : rule__Inciso__Group_4__0__Impl rule__Inciso__Group_4__1 ;
    public final void rule__Inciso__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2446:1: ( rule__Inciso__Group_4__0__Impl rule__Inciso__Group_4__1 )
            // InternalLegisFacile.g:2447:2: rule__Inciso__Group_4__0__Impl rule__Inciso__Group_4__1
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
    // InternalLegisFacile.g:2454:1: rule__Inciso__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Inciso__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2458:1: ( ( '{' ) )
            // InternalLegisFacile.g:2459:1: ( '{' )
            {
            // InternalLegisFacile.g:2459:1: ( '{' )
            // InternalLegisFacile.g:2460:2: '{'
            {
             before(grammarAccess.getIncisoAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalLegisFacile.g:2469:1: rule__Inciso__Group_4__1 : rule__Inciso__Group_4__1__Impl rule__Inciso__Group_4__2 ;
    public final void rule__Inciso__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2473:1: ( rule__Inciso__Group_4__1__Impl rule__Inciso__Group_4__2 )
            // InternalLegisFacile.g:2474:2: rule__Inciso__Group_4__1__Impl rule__Inciso__Group_4__2
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
    // InternalLegisFacile.g:2481:1: rule__Inciso__Group_4__1__Impl : ( ( rule__Inciso__AlineasAssignment_4_1 )* ) ;
    public final void rule__Inciso__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2485:1: ( ( ( rule__Inciso__AlineasAssignment_4_1 )* ) )
            // InternalLegisFacile.g:2486:1: ( ( rule__Inciso__AlineasAssignment_4_1 )* )
            {
            // InternalLegisFacile.g:2486:1: ( ( rule__Inciso__AlineasAssignment_4_1 )* )
            // InternalLegisFacile.g:2487:2: ( rule__Inciso__AlineasAssignment_4_1 )*
            {
             before(grammarAccess.getIncisoAccess().getAlineasAssignment_4_1()); 
            // InternalLegisFacile.g:2488:2: ( rule__Inciso__AlineasAssignment_4_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=29 && LA26_0<=30)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalLegisFacile.g:2488:3: rule__Inciso__AlineasAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Inciso__AlineasAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalLegisFacile.g:2496:1: rule__Inciso__Group_4__2 : rule__Inciso__Group_4__2__Impl ;
    public final void rule__Inciso__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2500:1: ( rule__Inciso__Group_4__2__Impl )
            // InternalLegisFacile.g:2501:2: rule__Inciso__Group_4__2__Impl
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
    // InternalLegisFacile.g:2507:1: rule__Inciso__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Inciso__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2511:1: ( ( '}' ) )
            // InternalLegisFacile.g:2512:1: ( '}' )
            {
            // InternalLegisFacile.g:2512:1: ( '}' )
            // InternalLegisFacile.g:2513:2: '}'
            {
             before(grammarAccess.getIncisoAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalLegisFacile.g:2523:1: rule__Alinea__Group__0 : rule__Alinea__Group__0__Impl rule__Alinea__Group__1 ;
    public final void rule__Alinea__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2527:1: ( rule__Alinea__Group__0__Impl rule__Alinea__Group__1 )
            // InternalLegisFacile.g:2528:2: rule__Alinea__Group__0__Impl rule__Alinea__Group__1
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
    // InternalLegisFacile.g:2535:1: rule__Alinea__Group__0__Impl : ( ( rule__Alinea__Alternatives_0 ) ) ;
    public final void rule__Alinea__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2539:1: ( ( ( rule__Alinea__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2540:1: ( ( rule__Alinea__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2540:1: ( ( rule__Alinea__Alternatives_0 ) )
            // InternalLegisFacile.g:2541:2: ( rule__Alinea__Alternatives_0 )
            {
             before(grammarAccess.getAlineaAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2542:2: ( rule__Alinea__Alternatives_0 )
            // InternalLegisFacile.g:2542:3: rule__Alinea__Alternatives_0
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
    // InternalLegisFacile.g:2550:1: rule__Alinea__Group__1 : rule__Alinea__Group__1__Impl rule__Alinea__Group__2 ;
    public final void rule__Alinea__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2554:1: ( rule__Alinea__Group__1__Impl rule__Alinea__Group__2 )
            // InternalLegisFacile.g:2555:2: rule__Alinea__Group__1__Impl rule__Alinea__Group__2
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
    // InternalLegisFacile.g:2562:1: rule__Alinea__Group__1__Impl : ( '(' ) ;
    public final void rule__Alinea__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2566:1: ( ( '(' ) )
            // InternalLegisFacile.g:2567:1: ( '(' )
            {
            // InternalLegisFacile.g:2567:1: ( '(' )
            // InternalLegisFacile.g:2568:2: '('
            {
             before(grammarAccess.getAlineaAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalLegisFacile.g:2577:1: rule__Alinea__Group__2 : rule__Alinea__Group__2__Impl rule__Alinea__Group__3 ;
    public final void rule__Alinea__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2581:1: ( rule__Alinea__Group__2__Impl rule__Alinea__Group__3 )
            // InternalLegisFacile.g:2582:2: rule__Alinea__Group__2__Impl rule__Alinea__Group__3
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
    // InternalLegisFacile.g:2589:1: rule__Alinea__Group__2__Impl : ( ( rule__Alinea__TextoAssignment_2 ) ) ;
    public final void rule__Alinea__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2593:1: ( ( ( rule__Alinea__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:2594:1: ( ( rule__Alinea__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:2594:1: ( ( rule__Alinea__TextoAssignment_2 ) )
            // InternalLegisFacile.g:2595:2: ( rule__Alinea__TextoAssignment_2 )
            {
             before(grammarAccess.getAlineaAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:2596:2: ( rule__Alinea__TextoAssignment_2 )
            // InternalLegisFacile.g:2596:3: rule__Alinea__TextoAssignment_2
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
    // InternalLegisFacile.g:2604:1: rule__Alinea__Group__3 : rule__Alinea__Group__3__Impl rule__Alinea__Group__4 ;
    public final void rule__Alinea__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2608:1: ( rule__Alinea__Group__3__Impl rule__Alinea__Group__4 )
            // InternalLegisFacile.g:2609:2: rule__Alinea__Group__3__Impl rule__Alinea__Group__4
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
    // InternalLegisFacile.g:2616:1: rule__Alinea__Group__3__Impl : ( ')' ) ;
    public final void rule__Alinea__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2620:1: ( ( ')' ) )
            // InternalLegisFacile.g:2621:1: ( ')' )
            {
            // InternalLegisFacile.g:2621:1: ( ')' )
            // InternalLegisFacile.g:2622:2: ')'
            {
             before(grammarAccess.getAlineaAccess().getRightParenthesisKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalLegisFacile.g:2631:1: rule__Alinea__Group__4 : rule__Alinea__Group__4__Impl ;
    public final void rule__Alinea__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2635:1: ( rule__Alinea__Group__4__Impl )
            // InternalLegisFacile.g:2636:2: rule__Alinea__Group__4__Impl
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
    // InternalLegisFacile.g:2642:1: rule__Alinea__Group__4__Impl : ( ( rule__Alinea__Group_4__0 )? ) ;
    public final void rule__Alinea__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2646:1: ( ( ( rule__Alinea__Group_4__0 )? ) )
            // InternalLegisFacile.g:2647:1: ( ( rule__Alinea__Group_4__0 )? )
            {
            // InternalLegisFacile.g:2647:1: ( ( rule__Alinea__Group_4__0 )? )
            // InternalLegisFacile.g:2648:2: ( rule__Alinea__Group_4__0 )?
            {
             before(grammarAccess.getAlineaAccess().getGroup_4()); 
            // InternalLegisFacile.g:2649:2: ( rule__Alinea__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalLegisFacile.g:2649:3: rule__Alinea__Group_4__0
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
    // InternalLegisFacile.g:2658:1: rule__Alinea__Group_4__0 : rule__Alinea__Group_4__0__Impl rule__Alinea__Group_4__1 ;
    public final void rule__Alinea__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2662:1: ( rule__Alinea__Group_4__0__Impl rule__Alinea__Group_4__1 )
            // InternalLegisFacile.g:2663:2: rule__Alinea__Group_4__0__Impl rule__Alinea__Group_4__1
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
    // InternalLegisFacile.g:2670:1: rule__Alinea__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Alinea__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2674:1: ( ( '{' ) )
            // InternalLegisFacile.g:2675:1: ( '{' )
            {
            // InternalLegisFacile.g:2675:1: ( '{' )
            // InternalLegisFacile.g:2676:2: '{'
            {
             before(grammarAccess.getAlineaAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalLegisFacile.g:2685:1: rule__Alinea__Group_4__1 : rule__Alinea__Group_4__1__Impl rule__Alinea__Group_4__2 ;
    public final void rule__Alinea__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2689:1: ( rule__Alinea__Group_4__1__Impl rule__Alinea__Group_4__2 )
            // InternalLegisFacile.g:2690:2: rule__Alinea__Group_4__1__Impl rule__Alinea__Group_4__2
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
    // InternalLegisFacile.g:2697:1: rule__Alinea__Group_4__1__Impl : ( ( rule__Alinea__ItensAssignment_4_1 )* ) ;
    public final void rule__Alinea__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2701:1: ( ( ( rule__Alinea__ItensAssignment_4_1 )* ) )
            // InternalLegisFacile.g:2702:1: ( ( rule__Alinea__ItensAssignment_4_1 )* )
            {
            // InternalLegisFacile.g:2702:1: ( ( rule__Alinea__ItensAssignment_4_1 )* )
            // InternalLegisFacile.g:2703:2: ( rule__Alinea__ItensAssignment_4_1 )*
            {
             before(grammarAccess.getAlineaAccess().getItensAssignment_4_1()); 
            // InternalLegisFacile.g:2704:2: ( rule__Alinea__ItensAssignment_4_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=31 && LA28_0<=32)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalLegisFacile.g:2704:3: rule__Alinea__ItensAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Alinea__ItensAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalLegisFacile.g:2712:1: rule__Alinea__Group_4__2 : rule__Alinea__Group_4__2__Impl ;
    public final void rule__Alinea__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2716:1: ( rule__Alinea__Group_4__2__Impl )
            // InternalLegisFacile.g:2717:2: rule__Alinea__Group_4__2__Impl
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
    // InternalLegisFacile.g:2723:1: rule__Alinea__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Alinea__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2727:1: ( ( '}' ) )
            // InternalLegisFacile.g:2728:1: ( '}' )
            {
            // InternalLegisFacile.g:2728:1: ( '}' )
            // InternalLegisFacile.g:2729:2: '}'
            {
             before(grammarAccess.getAlineaAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalLegisFacile.g:2739:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2743:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // InternalLegisFacile.g:2744:2: rule__Item__Group__0__Impl rule__Item__Group__1
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
    // InternalLegisFacile.g:2751:1: rule__Item__Group__0__Impl : ( ( rule__Item__Alternatives_0 ) ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2755:1: ( ( ( rule__Item__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2756:1: ( ( rule__Item__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2756:1: ( ( rule__Item__Alternatives_0 ) )
            // InternalLegisFacile.g:2757:2: ( rule__Item__Alternatives_0 )
            {
             before(grammarAccess.getItemAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2758:2: ( rule__Item__Alternatives_0 )
            // InternalLegisFacile.g:2758:3: rule__Item__Alternatives_0
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
    // InternalLegisFacile.g:2766:1: rule__Item__Group__1 : rule__Item__Group__1__Impl rule__Item__Group__2 ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2770:1: ( rule__Item__Group__1__Impl rule__Item__Group__2 )
            // InternalLegisFacile.g:2771:2: rule__Item__Group__1__Impl rule__Item__Group__2
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
    // InternalLegisFacile.g:2778:1: rule__Item__Group__1__Impl : ( '(' ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2782:1: ( ( '(' ) )
            // InternalLegisFacile.g:2783:1: ( '(' )
            {
            // InternalLegisFacile.g:2783:1: ( '(' )
            // InternalLegisFacile.g:2784:2: '('
            {
             before(grammarAccess.getItemAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalLegisFacile.g:2793:1: rule__Item__Group__2 : rule__Item__Group__2__Impl rule__Item__Group__3 ;
    public final void rule__Item__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2797:1: ( rule__Item__Group__2__Impl rule__Item__Group__3 )
            // InternalLegisFacile.g:2798:2: rule__Item__Group__2__Impl rule__Item__Group__3
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
    // InternalLegisFacile.g:2805:1: rule__Item__Group__2__Impl : ( ( rule__Item__TextoAssignment_2 ) ) ;
    public final void rule__Item__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2809:1: ( ( ( rule__Item__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:2810:1: ( ( rule__Item__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:2810:1: ( ( rule__Item__TextoAssignment_2 ) )
            // InternalLegisFacile.g:2811:2: ( rule__Item__TextoAssignment_2 )
            {
             before(grammarAccess.getItemAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:2812:2: ( rule__Item__TextoAssignment_2 )
            // InternalLegisFacile.g:2812:3: rule__Item__TextoAssignment_2
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
    // InternalLegisFacile.g:2820:1: rule__Item__Group__3 : rule__Item__Group__3__Impl ;
    public final void rule__Item__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2824:1: ( rule__Item__Group__3__Impl )
            // InternalLegisFacile.g:2825:2: rule__Item__Group__3__Impl
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
    // InternalLegisFacile.g:2831:1: rule__Item__Group__3__Impl : ( ')' ) ;
    public final void rule__Item__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2835:1: ( ( ')' ) )
            // InternalLegisFacile.g:2836:1: ( ')' )
            {
            // InternalLegisFacile.g:2836:1: ( ')' )
            // InternalLegisFacile.g:2837:2: ')'
            {
             before(grammarAccess.getItemAccess().getRightParenthesisKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalLegisFacile.g:2847:1: rule__Final__Group__0 : rule__Final__Group__0__Impl rule__Final__Group__1 ;
    public final void rule__Final__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2851:1: ( rule__Final__Group__0__Impl rule__Final__Group__1 )
            // InternalLegisFacile.g:2852:2: rule__Final__Group__0__Impl rule__Final__Group__1
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
    // InternalLegisFacile.g:2859:1: rule__Final__Group__0__Impl : ( ( rule__Final__Alternatives_0 ) ) ;
    public final void rule__Final__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2863:1: ( ( ( rule__Final__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2864:1: ( ( rule__Final__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2864:1: ( ( rule__Final__Alternatives_0 ) )
            // InternalLegisFacile.g:2865:2: ( rule__Final__Alternatives_0 )
            {
             before(grammarAccess.getFinalAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2866:2: ( rule__Final__Alternatives_0 )
            // InternalLegisFacile.g:2866:3: rule__Final__Alternatives_0
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
    // InternalLegisFacile.g:2874:1: rule__Final__Group__1 : rule__Final__Group__1__Impl rule__Final__Group__2 ;
    public final void rule__Final__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2878:1: ( rule__Final__Group__1__Impl rule__Final__Group__2 )
            // InternalLegisFacile.g:2879:2: rule__Final__Group__1__Impl rule__Final__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalLegisFacile.g:2886:1: rule__Final__Group__1__Impl : ( '{' ) ;
    public final void rule__Final__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2890:1: ( ( '{' ) )
            // InternalLegisFacile.g:2891:1: ( '{' )
            {
            // InternalLegisFacile.g:2891:1: ( '{' )
            // InternalLegisFacile.g:2892:2: '{'
            {
             before(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalLegisFacile.g:2901:1: rule__Final__Group__2 : rule__Final__Group__2__Impl rule__Final__Group__3 ;
    public final void rule__Final__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2905:1: ( rule__Final__Group__2__Impl rule__Final__Group__3 )
            // InternalLegisFacile.g:2906:2: rule__Final__Group__2__Impl rule__Final__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Final__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__3();

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
    // InternalLegisFacile.g:2913:1: rule__Final__Group__2__Impl : ( ( rule__Final__Alternatives_2 ) ) ;
    public final void rule__Final__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2917:1: ( ( ( rule__Final__Alternatives_2 ) ) )
            // InternalLegisFacile.g:2918:1: ( ( rule__Final__Alternatives_2 ) )
            {
            // InternalLegisFacile.g:2918:1: ( ( rule__Final__Alternatives_2 ) )
            // InternalLegisFacile.g:2919:2: ( rule__Final__Alternatives_2 )
            {
             before(grammarAccess.getFinalAccess().getAlternatives_2()); 
            // InternalLegisFacile.g:2920:2: ( rule__Final__Alternatives_2 )
            // InternalLegisFacile.g:2920:3: rule__Final__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Final__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getAlternatives_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Final__Group__3"
    // InternalLegisFacile.g:2928:1: rule__Final__Group__3 : rule__Final__Group__3__Impl ;
    public final void rule__Final__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2932:1: ( rule__Final__Group__3__Impl )
            // InternalLegisFacile.g:2933:2: rule__Final__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group__3__Impl();

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
    // $ANTLR end "rule__Final__Group__3"


    // $ANTLR start "rule__Final__Group__3__Impl"
    // InternalLegisFacile.g:2939:1: rule__Final__Group__3__Impl : ( '}' ) ;
    public final void rule__Final__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2943:1: ( ( '}' ) )
            // InternalLegisFacile.g:2944:1: ( '}' )
            {
            // InternalLegisFacile.g:2944:1: ( '}' )
            // InternalLegisFacile.g:2945:2: '}'
            {
             before(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__3__Impl"


    // $ANTLR start "rule__Final__Group_2_0__0"
    // InternalLegisFacile.g:2955:1: rule__Final__Group_2_0__0 : rule__Final__Group_2_0__0__Impl rule__Final__Group_2_0__1 ;
    public final void rule__Final__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2959:1: ( rule__Final__Group_2_0__0__Impl rule__Final__Group_2_0__1 )
            // InternalLegisFacile.g:2960:2: rule__Final__Group_2_0__0__Impl rule__Final__Group_2_0__1
            {
            pushFollow(FOLLOW_27);
            rule__Final__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_2_0__1();

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
    // $ANTLR end "rule__Final__Group_2_0__0"


    // $ANTLR start "rule__Final__Group_2_0__0__Impl"
    // InternalLegisFacile.g:2967:1: rule__Final__Group_2_0__0__Impl : ( ( rule__Final__VigenciaAssignment_2_0_0 ) ) ;
    public final void rule__Final__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2971:1: ( ( ( rule__Final__VigenciaAssignment_2_0_0 ) ) )
            // InternalLegisFacile.g:2972:1: ( ( rule__Final__VigenciaAssignment_2_0_0 ) )
            {
            // InternalLegisFacile.g:2972:1: ( ( rule__Final__VigenciaAssignment_2_0_0 ) )
            // InternalLegisFacile.g:2973:2: ( rule__Final__VigenciaAssignment_2_0_0 )
            {
             before(grammarAccess.getFinalAccess().getVigenciaAssignment_2_0_0()); 
            // InternalLegisFacile.g:2974:2: ( rule__Final__VigenciaAssignment_2_0_0 )
            // InternalLegisFacile.g:2974:3: rule__Final__VigenciaAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Final__VigenciaAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getVigenciaAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_2_0__0__Impl"


    // $ANTLR start "rule__Final__Group_2_0__1"
    // InternalLegisFacile.g:2982:1: rule__Final__Group_2_0__1 : rule__Final__Group_2_0__1__Impl ;
    public final void rule__Final__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2986:1: ( rule__Final__Group_2_0__1__Impl )
            // InternalLegisFacile.g:2987:2: rule__Final__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__Final__Group_2_0__1"


    // $ANTLR start "rule__Final__Group_2_0__1__Impl"
    // InternalLegisFacile.g:2993:1: rule__Final__Group_2_0__1__Impl : ( ( rule__Final__RevogacaoAssignment_2_0_1 )? ) ;
    public final void rule__Final__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2997:1: ( ( ( rule__Final__RevogacaoAssignment_2_0_1 )? ) )
            // InternalLegisFacile.g:2998:1: ( ( rule__Final__RevogacaoAssignment_2_0_1 )? )
            {
            // InternalLegisFacile.g:2998:1: ( ( rule__Final__RevogacaoAssignment_2_0_1 )? )
            // InternalLegisFacile.g:2999:2: ( rule__Final__RevogacaoAssignment_2_0_1 )?
            {
             before(grammarAccess.getFinalAccess().getRevogacaoAssignment_2_0_1()); 
            // InternalLegisFacile.g:3000:2: ( rule__Final__RevogacaoAssignment_2_0_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=37 && LA29_0<=38)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalLegisFacile.g:3000:3: rule__Final__RevogacaoAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Final__RevogacaoAssignment_2_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFinalAccess().getRevogacaoAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_2_0__1__Impl"


    // $ANTLR start "rule__Final__Group_2_1__0"
    // InternalLegisFacile.g:3009:1: rule__Final__Group_2_1__0 : rule__Final__Group_2_1__0__Impl rule__Final__Group_2_1__1 ;
    public final void rule__Final__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3013:1: ( rule__Final__Group_2_1__0__Impl rule__Final__Group_2_1__1 )
            // InternalLegisFacile.g:3014:2: rule__Final__Group_2_1__0__Impl rule__Final__Group_2_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Final__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_2_1__1();

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
    // $ANTLR end "rule__Final__Group_2_1__0"


    // $ANTLR start "rule__Final__Group_2_1__0__Impl"
    // InternalLegisFacile.g:3021:1: rule__Final__Group_2_1__0__Impl : ( ( rule__Final__RevogacaoAssignment_2_1_0 ) ) ;
    public final void rule__Final__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3025:1: ( ( ( rule__Final__RevogacaoAssignment_2_1_0 ) ) )
            // InternalLegisFacile.g:3026:1: ( ( rule__Final__RevogacaoAssignment_2_1_0 ) )
            {
            // InternalLegisFacile.g:3026:1: ( ( rule__Final__RevogacaoAssignment_2_1_0 ) )
            // InternalLegisFacile.g:3027:2: ( rule__Final__RevogacaoAssignment_2_1_0 )
            {
             before(grammarAccess.getFinalAccess().getRevogacaoAssignment_2_1_0()); 
            // InternalLegisFacile.g:3028:2: ( rule__Final__RevogacaoAssignment_2_1_0 )
            // InternalLegisFacile.g:3028:3: rule__Final__RevogacaoAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Final__RevogacaoAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getRevogacaoAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_2_1__0__Impl"


    // $ANTLR start "rule__Final__Group_2_1__1"
    // InternalLegisFacile.g:3036:1: rule__Final__Group_2_1__1 : rule__Final__Group_2_1__1__Impl ;
    public final void rule__Final__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3040:1: ( rule__Final__Group_2_1__1__Impl )
            // InternalLegisFacile.g:3041:2: rule__Final__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Final__Group_2_1__1"


    // $ANTLR start "rule__Final__Group_2_1__1__Impl"
    // InternalLegisFacile.g:3047:1: rule__Final__Group_2_1__1__Impl : ( ( rule__Final__VigenciaAssignment_2_1_1 )? ) ;
    public final void rule__Final__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3051:1: ( ( ( rule__Final__VigenciaAssignment_2_1_1 )? ) )
            // InternalLegisFacile.g:3052:1: ( ( rule__Final__VigenciaAssignment_2_1_1 )? )
            {
            // InternalLegisFacile.g:3052:1: ( ( rule__Final__VigenciaAssignment_2_1_1 )? )
            // InternalLegisFacile.g:3053:2: ( rule__Final__VigenciaAssignment_2_1_1 )?
            {
             before(grammarAccess.getFinalAccess().getVigenciaAssignment_2_1_1()); 
            // InternalLegisFacile.g:3054:2: ( rule__Final__VigenciaAssignment_2_1_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=35 && LA30_0<=36)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalLegisFacile.g:3054:3: rule__Final__VigenciaAssignment_2_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Final__VigenciaAssignment_2_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFinalAccess().getVigenciaAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_2_1__1__Impl"


    // $ANTLR start "rule__Vigencia__Group__0"
    // InternalLegisFacile.g:3063:1: rule__Vigencia__Group__0 : rule__Vigencia__Group__0__Impl rule__Vigencia__Group__1 ;
    public final void rule__Vigencia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3067:1: ( rule__Vigencia__Group__0__Impl rule__Vigencia__Group__1 )
            // InternalLegisFacile.g:3068:2: rule__Vigencia__Group__0__Impl rule__Vigencia__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Vigencia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vigencia__Group__1();

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
    // $ANTLR end "rule__Vigencia__Group__0"


    // $ANTLR start "rule__Vigencia__Group__0__Impl"
    // InternalLegisFacile.g:3075:1: rule__Vigencia__Group__0__Impl : ( ( rule__Vigencia__Alternatives_0 ) ) ;
    public final void rule__Vigencia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3079:1: ( ( ( rule__Vigencia__Alternatives_0 ) ) )
            // InternalLegisFacile.g:3080:1: ( ( rule__Vigencia__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:3080:1: ( ( rule__Vigencia__Alternatives_0 ) )
            // InternalLegisFacile.g:3081:2: ( rule__Vigencia__Alternatives_0 )
            {
             before(grammarAccess.getVigenciaAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:3082:2: ( rule__Vigencia__Alternatives_0 )
            // InternalLegisFacile.g:3082:3: rule__Vigencia__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Vigencia__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getVigenciaAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vigencia__Group__0__Impl"


    // $ANTLR start "rule__Vigencia__Group__1"
    // InternalLegisFacile.g:3090:1: rule__Vigencia__Group__1 : rule__Vigencia__Group__1__Impl rule__Vigencia__Group__2 ;
    public final void rule__Vigencia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3094:1: ( rule__Vigencia__Group__1__Impl rule__Vigencia__Group__2 )
            // InternalLegisFacile.g:3095:2: rule__Vigencia__Group__1__Impl rule__Vigencia__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Vigencia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vigencia__Group__2();

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
    // $ANTLR end "rule__Vigencia__Group__1"


    // $ANTLR start "rule__Vigencia__Group__1__Impl"
    // InternalLegisFacile.g:3102:1: rule__Vigencia__Group__1__Impl : ( '(' ) ;
    public final void rule__Vigencia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3106:1: ( ( '(' ) )
            // InternalLegisFacile.g:3107:1: ( '(' )
            {
            // InternalLegisFacile.g:3107:1: ( '(' )
            // InternalLegisFacile.g:3108:2: '('
            {
             before(grammarAccess.getVigenciaAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVigenciaAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vigencia__Group__1__Impl"


    // $ANTLR start "rule__Vigencia__Group__2"
    // InternalLegisFacile.g:3117:1: rule__Vigencia__Group__2 : rule__Vigencia__Group__2__Impl rule__Vigencia__Group__3 ;
    public final void rule__Vigencia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3121:1: ( rule__Vigencia__Group__2__Impl rule__Vigencia__Group__3 )
            // InternalLegisFacile.g:3122:2: rule__Vigencia__Group__2__Impl rule__Vigencia__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Vigencia__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vigencia__Group__3();

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
    // $ANTLR end "rule__Vigencia__Group__2"


    // $ANTLR start "rule__Vigencia__Group__2__Impl"
    // InternalLegisFacile.g:3129:1: rule__Vigencia__Group__2__Impl : ( ( rule__Vigencia__TextoAssignment_2 ) ) ;
    public final void rule__Vigencia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3133:1: ( ( ( rule__Vigencia__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:3134:1: ( ( rule__Vigencia__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:3134:1: ( ( rule__Vigencia__TextoAssignment_2 ) )
            // InternalLegisFacile.g:3135:2: ( rule__Vigencia__TextoAssignment_2 )
            {
             before(grammarAccess.getVigenciaAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:3136:2: ( rule__Vigencia__TextoAssignment_2 )
            // InternalLegisFacile.g:3136:3: rule__Vigencia__TextoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Vigencia__TextoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVigenciaAccess().getTextoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vigencia__Group__2__Impl"


    // $ANTLR start "rule__Vigencia__Group__3"
    // InternalLegisFacile.g:3144:1: rule__Vigencia__Group__3 : rule__Vigencia__Group__3__Impl ;
    public final void rule__Vigencia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3148:1: ( rule__Vigencia__Group__3__Impl )
            // InternalLegisFacile.g:3149:2: rule__Vigencia__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vigencia__Group__3__Impl();

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
    // $ANTLR end "rule__Vigencia__Group__3"


    // $ANTLR start "rule__Vigencia__Group__3__Impl"
    // InternalLegisFacile.g:3155:1: rule__Vigencia__Group__3__Impl : ( ')' ) ;
    public final void rule__Vigencia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3159:1: ( ( ')' ) )
            // InternalLegisFacile.g:3160:1: ( ')' )
            {
            // InternalLegisFacile.g:3160:1: ( ')' )
            // InternalLegisFacile.g:3161:2: ')'
            {
             before(grammarAccess.getVigenciaAccess().getRightParenthesisKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getVigenciaAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vigencia__Group__3__Impl"


    // $ANTLR start "rule__Revogacao__Group__0"
    // InternalLegisFacile.g:3171:1: rule__Revogacao__Group__0 : rule__Revogacao__Group__0__Impl rule__Revogacao__Group__1 ;
    public final void rule__Revogacao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3175:1: ( rule__Revogacao__Group__0__Impl rule__Revogacao__Group__1 )
            // InternalLegisFacile.g:3176:2: rule__Revogacao__Group__0__Impl rule__Revogacao__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Revogacao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Revogacao__Group__1();

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
    // $ANTLR end "rule__Revogacao__Group__0"


    // $ANTLR start "rule__Revogacao__Group__0__Impl"
    // InternalLegisFacile.g:3183:1: rule__Revogacao__Group__0__Impl : ( ( rule__Revogacao__Alternatives_0 ) ) ;
    public final void rule__Revogacao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3187:1: ( ( ( rule__Revogacao__Alternatives_0 ) ) )
            // InternalLegisFacile.g:3188:1: ( ( rule__Revogacao__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:3188:1: ( ( rule__Revogacao__Alternatives_0 ) )
            // InternalLegisFacile.g:3189:2: ( rule__Revogacao__Alternatives_0 )
            {
             before(grammarAccess.getRevogacaoAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:3190:2: ( rule__Revogacao__Alternatives_0 )
            // InternalLegisFacile.g:3190:3: rule__Revogacao__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Revogacao__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRevogacaoAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Revogacao__Group__0__Impl"


    // $ANTLR start "rule__Revogacao__Group__1"
    // InternalLegisFacile.g:3198:1: rule__Revogacao__Group__1 : rule__Revogacao__Group__1__Impl rule__Revogacao__Group__2 ;
    public final void rule__Revogacao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3202:1: ( rule__Revogacao__Group__1__Impl rule__Revogacao__Group__2 )
            // InternalLegisFacile.g:3203:2: rule__Revogacao__Group__1__Impl rule__Revogacao__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Revogacao__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Revogacao__Group__2();

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
    // $ANTLR end "rule__Revogacao__Group__1"


    // $ANTLR start "rule__Revogacao__Group__1__Impl"
    // InternalLegisFacile.g:3210:1: rule__Revogacao__Group__1__Impl : ( '(' ) ;
    public final void rule__Revogacao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3214:1: ( ( '(' ) )
            // InternalLegisFacile.g:3215:1: ( '(' )
            {
            // InternalLegisFacile.g:3215:1: ( '(' )
            // InternalLegisFacile.g:3216:2: '('
            {
             before(grammarAccess.getRevogacaoAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRevogacaoAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Revogacao__Group__1__Impl"


    // $ANTLR start "rule__Revogacao__Group__2"
    // InternalLegisFacile.g:3225:1: rule__Revogacao__Group__2 : rule__Revogacao__Group__2__Impl rule__Revogacao__Group__3 ;
    public final void rule__Revogacao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3229:1: ( rule__Revogacao__Group__2__Impl rule__Revogacao__Group__3 )
            // InternalLegisFacile.g:3230:2: rule__Revogacao__Group__2__Impl rule__Revogacao__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Revogacao__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Revogacao__Group__3();

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
    // $ANTLR end "rule__Revogacao__Group__2"


    // $ANTLR start "rule__Revogacao__Group__2__Impl"
    // InternalLegisFacile.g:3237:1: rule__Revogacao__Group__2__Impl : ( ( rule__Revogacao__TextoAssignment_2 ) ) ;
    public final void rule__Revogacao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3241:1: ( ( ( rule__Revogacao__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:3242:1: ( ( rule__Revogacao__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:3242:1: ( ( rule__Revogacao__TextoAssignment_2 ) )
            // InternalLegisFacile.g:3243:2: ( rule__Revogacao__TextoAssignment_2 )
            {
             before(grammarAccess.getRevogacaoAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:3244:2: ( rule__Revogacao__TextoAssignment_2 )
            // InternalLegisFacile.g:3244:3: rule__Revogacao__TextoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Revogacao__TextoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRevogacaoAccess().getTextoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Revogacao__Group__2__Impl"


    // $ANTLR start "rule__Revogacao__Group__3"
    // InternalLegisFacile.g:3252:1: rule__Revogacao__Group__3 : rule__Revogacao__Group__3__Impl ;
    public final void rule__Revogacao__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3256:1: ( rule__Revogacao__Group__3__Impl )
            // InternalLegisFacile.g:3257:2: rule__Revogacao__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Revogacao__Group__3__Impl();

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
    // $ANTLR end "rule__Revogacao__Group__3"


    // $ANTLR start "rule__Revogacao__Group__3__Impl"
    // InternalLegisFacile.g:3263:1: rule__Revogacao__Group__3__Impl : ( ')' ) ;
    public final void rule__Revogacao__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3267:1: ( ( ')' ) )
            // InternalLegisFacile.g:3268:1: ( ')' )
            {
            // InternalLegisFacile.g:3268:1: ( ')' )
            // InternalLegisFacile.g:3269:2: ')'
            {
             before(grammarAccess.getRevogacaoAccess().getRightParenthesisKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRevogacaoAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Revogacao__Group__3__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalLegisFacile.g:3279:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3283:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalLegisFacile.g:3284:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalLegisFacile.g:3291:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3295:1: ( ( 'datatype' ) )
            // InternalLegisFacile.g:3296:1: ( 'datatype' )
            {
            // InternalLegisFacile.g:3296:1: ( 'datatype' )
            // InternalLegisFacile.g:3297:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalLegisFacile.g:3306:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3310:1: ( rule__DataType__Group__1__Impl )
            // InternalLegisFacile.g:3311:2: rule__DataType__Group__1__Impl
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
    // InternalLegisFacile.g:3317:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3321:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalLegisFacile.g:3322:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalLegisFacile.g:3322:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalLegisFacile.g:3323:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalLegisFacile.g:3324:2: ( rule__DataType__NameAssignment_1 )
            // InternalLegisFacile.g:3324:3: rule__DataType__NameAssignment_1
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
    // InternalLegisFacile.g:3333:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3337:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalLegisFacile.g:3338:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalLegisFacile.g:3345:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3349:1: ( ( 'entity' ) )
            // InternalLegisFacile.g:3350:1: ( 'entity' )
            {
            // InternalLegisFacile.g:3350:1: ( 'entity' )
            // InternalLegisFacile.g:3351:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalLegisFacile.g:3360:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3364:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalLegisFacile.g:3365:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalLegisFacile.g:3372:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3376:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalLegisFacile.g:3377:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalLegisFacile.g:3377:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalLegisFacile.g:3378:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalLegisFacile.g:3379:2: ( rule__Entity__NameAssignment_1 )
            // InternalLegisFacile.g:3379:3: rule__Entity__NameAssignment_1
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
    // InternalLegisFacile.g:3387:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3391:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalLegisFacile.g:3392:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalLegisFacile.g:3399:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3403:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalLegisFacile.g:3404:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalLegisFacile.g:3404:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalLegisFacile.g:3405:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalLegisFacile.g:3406:2: ( rule__Entity__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalLegisFacile.g:3406:3: rule__Entity__Group_2__0
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
    // InternalLegisFacile.g:3414:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3418:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalLegisFacile.g:3419:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalLegisFacile.g:3426:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3430:1: ( ( '{' ) )
            // InternalLegisFacile.g:3431:1: ( '{' )
            {
            // InternalLegisFacile.g:3431:1: ( '{' )
            // InternalLegisFacile.g:3432:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalLegisFacile.g:3441:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3445:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalLegisFacile.g:3446:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalLegisFacile.g:3453:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FeaturesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3457:1: ( ( ( rule__Entity__FeaturesAssignment_4 )* ) )
            // InternalLegisFacile.g:3458:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            {
            // InternalLegisFacile.g:3458:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            // InternalLegisFacile.g:3459:2: ( rule__Entity__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // InternalLegisFacile.g:3460:2: ( rule__Entity__FeaturesAssignment_4 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||LA32_0==48) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalLegisFacile.g:3460:3: rule__Entity__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Entity__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalLegisFacile.g:3468:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3472:1: ( rule__Entity__Group__5__Impl )
            // InternalLegisFacile.g:3473:2: rule__Entity__Group__5__Impl
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
    // InternalLegisFacile.g:3479:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3483:1: ( ( '}' ) )
            // InternalLegisFacile.g:3484:1: ( '}' )
            {
            // InternalLegisFacile.g:3484:1: ( '}' )
            // InternalLegisFacile.g:3485:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,41,FOLLOW_2); 
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
    // InternalLegisFacile.g:3495:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3499:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalLegisFacile.g:3500:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalLegisFacile.g:3507:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3511:1: ( ( 'extends' ) )
            // InternalLegisFacile.g:3512:1: ( 'extends' )
            {
            // InternalLegisFacile.g:3512:1: ( 'extends' )
            // InternalLegisFacile.g:3513:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalLegisFacile.g:3522:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3526:1: ( rule__Entity__Group_2__1__Impl )
            // InternalLegisFacile.g:3527:2: rule__Entity__Group_2__1__Impl
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
    // InternalLegisFacile.g:3533:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3537:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // InternalLegisFacile.g:3538:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // InternalLegisFacile.g:3538:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // InternalLegisFacile.g:3539:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // InternalLegisFacile.g:3540:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            // InternalLegisFacile.g:3540:3: rule__Entity__SuperTypeAssignment_2_1
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
    // InternalLegisFacile.g:3549:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3553:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalLegisFacile.g:3554:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalLegisFacile.g:3561:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__ManyAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3565:1: ( ( ( rule__Feature__ManyAssignment_0 )? ) )
            // InternalLegisFacile.g:3566:1: ( ( rule__Feature__ManyAssignment_0 )? )
            {
            // InternalLegisFacile.g:3566:1: ( ( rule__Feature__ManyAssignment_0 )? )
            // InternalLegisFacile.g:3567:2: ( rule__Feature__ManyAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getManyAssignment_0()); 
            // InternalLegisFacile.g:3568:2: ( rule__Feature__ManyAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalLegisFacile.g:3568:3: rule__Feature__ManyAssignment_0
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
    // InternalLegisFacile.g:3576:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3580:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalLegisFacile.g:3581:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalLegisFacile.g:3588:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3592:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalLegisFacile.g:3593:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalLegisFacile.g:3593:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalLegisFacile.g:3594:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalLegisFacile.g:3595:2: ( rule__Feature__NameAssignment_1 )
            // InternalLegisFacile.g:3595:3: rule__Feature__NameAssignment_1
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
    // InternalLegisFacile.g:3603:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3607:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalLegisFacile.g:3608:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalLegisFacile.g:3615:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3619:1: ( ( ':' ) )
            // InternalLegisFacile.g:3620:1: ( ':' )
            {
            // InternalLegisFacile.g:3620:1: ( ':' )
            // InternalLegisFacile.g:3621:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalLegisFacile.g:3630:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3634:1: ( rule__Feature__Group__3__Impl )
            // InternalLegisFacile.g:3635:2: rule__Feature__Group__3__Impl
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
    // InternalLegisFacile.g:3641:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3645:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // InternalLegisFacile.g:3646:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // InternalLegisFacile.g:3646:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // InternalLegisFacile.g:3647:2: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // InternalLegisFacile.g:3648:2: ( rule__Feature__TypeAssignment_3 )
            // InternalLegisFacile.g:3648:3: rule__Feature__TypeAssignment_3
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
    // InternalLegisFacile.g:3657:1: rule__Lei__ElementsAssignment : ( ruleType ) ;
    public final void rule__Lei__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3661:1: ( ( ruleType ) )
            // InternalLegisFacile.g:3662:2: ( ruleType )
            {
            // InternalLegisFacile.g:3662:2: ( ruleType )
            // InternalLegisFacile.g:3663:3: ruleType
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
    // InternalLegisFacile.g:3672:1: rule__Type__PreliminarAssignment_2_0 : ( rulePreliminar ) ;
    public final void rule__Type__PreliminarAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3676:1: ( ( rulePreliminar ) )
            // InternalLegisFacile.g:3677:2: ( rulePreliminar )
            {
            // InternalLegisFacile.g:3677:2: ( rulePreliminar )
            // InternalLegisFacile.g:3678:3: rulePreliminar
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
    // InternalLegisFacile.g:3687:1: rule__Type__NormativaAssignment_2_1 : ( ruleNormativa ) ;
    public final void rule__Type__NormativaAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3691:1: ( ( ruleNormativa ) )
            // InternalLegisFacile.g:3692:2: ( ruleNormativa )
            {
            // InternalLegisFacile.g:3692:2: ( ruleNormativa )
            // InternalLegisFacile.g:3693:3: ruleNormativa
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
    // InternalLegisFacile.g:3702:1: rule__Type__FinalAssignment_2_2 : ( ruleFinal ) ;
    public final void rule__Type__FinalAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3706:1: ( ( ruleFinal ) )
            // InternalLegisFacile.g:3707:2: ( ruleFinal )
            {
            // InternalLegisFacile.g:3707:2: ( ruleFinal )
            // InternalLegisFacile.g:3708:3: ruleFinal
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
    // InternalLegisFacile.g:3717:1: rule__Preliminar__EpigrageAssignment_2 : ( ruleEpigrafe ) ;
    public final void rule__Preliminar__EpigrageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3721:1: ( ( ruleEpigrafe ) )
            // InternalLegisFacile.g:3722:2: ( ruleEpigrafe )
            {
            // InternalLegisFacile.g:3722:2: ( ruleEpigrafe )
            // InternalLegisFacile.g:3723:3: ruleEpigrafe
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
    // InternalLegisFacile.g:3732:1: rule__Preliminar__EmentaAssignment_4 : ( ruleEmenta ) ;
    public final void rule__Preliminar__EmentaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3736:1: ( ( ruleEmenta ) )
            // InternalLegisFacile.g:3737:2: ( ruleEmenta )
            {
            // InternalLegisFacile.g:3737:2: ( ruleEmenta )
            // InternalLegisFacile.g:3738:3: ruleEmenta
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
    // InternalLegisFacile.g:3747:1: rule__Preliminar__PreambuloAssignment_6 : ( rulePreambulo ) ;
    public final void rule__Preliminar__PreambuloAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3751:1: ( ( rulePreambulo ) )
            // InternalLegisFacile.g:3752:2: ( rulePreambulo )
            {
            // InternalLegisFacile.g:3752:2: ( rulePreambulo )
            // InternalLegisFacile.g:3753:3: rulePreambulo
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
    // InternalLegisFacile.g:3762:1: rule__Epigrafe__AtoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Epigrafe__AtoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3766:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3767:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3767:2: ( RULE_STRING )
            // InternalLegisFacile.g:3768:3: RULE_STRING
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
    // InternalLegisFacile.g:3777:1: rule__Epigrafe__NumeroAssignment_4 : ( RULE_INT ) ;
    public final void rule__Epigrafe__NumeroAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3781:1: ( ( RULE_INT ) )
            // InternalLegisFacile.g:3782:2: ( RULE_INT )
            {
            // InternalLegisFacile.g:3782:2: ( RULE_INT )
            // InternalLegisFacile.g:3783:3: RULE_INT
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
    // InternalLegisFacile.g:3792:1: rule__Epigrafe__AnoAssignment_6 : ( RULE_INT ) ;
    public final void rule__Epigrafe__AnoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3796:1: ( ( RULE_INT ) )
            // InternalLegisFacile.g:3797:2: ( RULE_INT )
            {
            // InternalLegisFacile.g:3797:2: ( RULE_INT )
            // InternalLegisFacile.g:3798:3: RULE_INT
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
    // InternalLegisFacile.g:3807:1: rule__Ementa__EmentaAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Ementa__EmentaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3811:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3812:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3812:2: ( RULE_STRING )
            // InternalLegisFacile.g:3813:3: RULE_STRING
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
    // InternalLegisFacile.g:3822:1: rule__Preambulo__PreambuloAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Preambulo__PreambuloAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3826:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3827:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3827:2: ( RULE_STRING )
            // InternalLegisFacile.g:3828:3: RULE_STRING
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
    // InternalLegisFacile.g:3837:1: rule__Normativa__ArtigosAssignment_2 : ( ruleArtigo ) ;
    public final void rule__Normativa__ArtigosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3841:1: ( ( ruleArtigo ) )
            // InternalLegisFacile.g:3842:2: ( ruleArtigo )
            {
            // InternalLegisFacile.g:3842:2: ( ruleArtigo )
            // InternalLegisFacile.g:3843:3: ruleArtigo
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
    // InternalLegisFacile.g:3852:1: rule__Artigo__CaputAssignment_2 : ( ruleCaput ) ;
    public final void rule__Artigo__CaputAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3856:1: ( ( ruleCaput ) )
            // InternalLegisFacile.g:3857:2: ( ruleCaput )
            {
            // InternalLegisFacile.g:3857:2: ( ruleCaput )
            // InternalLegisFacile.g:3858:3: ruleCaput
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
    // InternalLegisFacile.g:3867:1: rule__Artigo__ParagrafosAssignment_3 : ( ruleParagrafo ) ;
    public final void rule__Artigo__ParagrafosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3871:1: ( ( ruleParagrafo ) )
            // InternalLegisFacile.g:3872:2: ( ruleParagrafo )
            {
            // InternalLegisFacile.g:3872:2: ( ruleParagrafo )
            // InternalLegisFacile.g:3873:3: ruleParagrafo
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
    // InternalLegisFacile.g:3882:1: rule__Caput__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Caput__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3886:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3887:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3887:2: ( RULE_STRING )
            // InternalLegisFacile.g:3888:3: RULE_STRING
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
    // InternalLegisFacile.g:3897:1: rule__Caput__IncisosAssignment_4_1 : ( ruleInciso ) ;
    public final void rule__Caput__IncisosAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3901:1: ( ( ruleInciso ) )
            // InternalLegisFacile.g:3902:2: ( ruleInciso )
            {
            // InternalLegisFacile.g:3902:2: ( ruleInciso )
            // InternalLegisFacile.g:3903:3: ruleInciso
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
    // InternalLegisFacile.g:3912:1: rule__Paragrafo__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Paragrafo__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3916:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3917:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3917:2: ( RULE_STRING )
            // InternalLegisFacile.g:3918:3: RULE_STRING
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
    // InternalLegisFacile.g:3927:1: rule__Paragrafo__IncisosAssignment_4_1 : ( ruleInciso ) ;
    public final void rule__Paragrafo__IncisosAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3931:1: ( ( ruleInciso ) )
            // InternalLegisFacile.g:3932:2: ( ruleInciso )
            {
            // InternalLegisFacile.g:3932:2: ( ruleInciso )
            // InternalLegisFacile.g:3933:3: ruleInciso
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
    // InternalLegisFacile.g:3942:1: rule__Inciso__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Inciso__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3946:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3947:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3947:2: ( RULE_STRING )
            // InternalLegisFacile.g:3948:3: RULE_STRING
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
    // InternalLegisFacile.g:3957:1: rule__Inciso__AlineasAssignment_4_1 : ( ruleAlinea ) ;
    public final void rule__Inciso__AlineasAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3961:1: ( ( ruleAlinea ) )
            // InternalLegisFacile.g:3962:2: ( ruleAlinea )
            {
            // InternalLegisFacile.g:3962:2: ( ruleAlinea )
            // InternalLegisFacile.g:3963:3: ruleAlinea
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
    // InternalLegisFacile.g:3972:1: rule__Alinea__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Alinea__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3976:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3977:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3977:2: ( RULE_STRING )
            // InternalLegisFacile.g:3978:3: RULE_STRING
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
    // InternalLegisFacile.g:3987:1: rule__Alinea__ItensAssignment_4_1 : ( ruleItem ) ;
    public final void rule__Alinea__ItensAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3991:1: ( ( ruleItem ) )
            // InternalLegisFacile.g:3992:2: ( ruleItem )
            {
            // InternalLegisFacile.g:3992:2: ( ruleItem )
            // InternalLegisFacile.g:3993:3: ruleItem
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
    // InternalLegisFacile.g:4002:1: rule__Item__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Item__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:4006:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:4007:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:4007:2: ( RULE_STRING )
            // InternalLegisFacile.g:4008:3: RULE_STRING
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


    // $ANTLR start "rule__Final__VigenciaAssignment_2_0_0"
    // InternalLegisFacile.g:4017:1: rule__Final__VigenciaAssignment_2_0_0 : ( ruleVigencia ) ;
    public final void rule__Final__VigenciaAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:4021:1: ( ( ruleVigencia ) )
            // InternalLegisFacile.g:4022:2: ( ruleVigencia )
            {
            // InternalLegisFacile.g:4022:2: ( ruleVigencia )
            // InternalLegisFacile.g:4023:3: ruleVigencia
            {
             before(grammarAccess.getFinalAccess().getVigenciaVigenciaParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVigencia();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getVigenciaVigenciaParserRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__VigenciaAssignment_2_0_0"


    // $ANTLR start "rule__Final__RevogacaoAssignment_2_0_1"
    // InternalLegisFacile.g:4032:1: rule__Final__RevogacaoAssignment_2_0_1 : ( ruleRevogacao ) ;
    public final void rule__Final__RevogacaoAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:4036:1: ( ( ruleRevogacao ) )
            // InternalLegisFacile.g:4037:2: ( ruleRevogacao )
            {
            // InternalLegisFacile.g:4037:2: ( ruleRevogacao )
            // InternalLegisFacile.g:4038:3: ruleRevogacao
            {
             before(grammarAccess.getFinalAccess().getRevogacaoRevogacaoParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRevogacao();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getRevogacaoRevogacaoParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__RevogacaoAssignment_2_0_1"


    // $ANTLR start "rule__Final__RevogacaoAssignment_2_1_0"
    // InternalLegisFacile.g:4047:1: rule__Final__RevogacaoAssignment_2_1_0 : ( ruleRevogacao ) ;
    public final void rule__Final__RevogacaoAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:4051:1: ( ( ruleRevogacao ) )
            // InternalLegisFacile.g:4052:2: ( ruleRevogacao )
            {
            // InternalLegisFacile.g:4052:2: ( ruleRevogacao )
            // InternalLegisFacile.g:4053:3: ruleRevogacao
            {
             before(grammarAccess.getFinalAccess().getRevogacaoRevogacaoParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRevogacao();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getRevogacaoRevogacaoParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__RevogacaoAssignment_2_1_0"


    // $ANTLR start "rule__Final__VigenciaAssignment_2_1_1"
    // InternalLegisFacile.g:4062:1: rule__Final__VigenciaAssignment_2_1_1 : ( ruleVigencia ) ;
    public final void rule__Final__VigenciaAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:4066:1: ( ( ruleVigencia ) )
            // InternalLegisFacile.g:4067:2: ( ruleVigencia )
            {
            // InternalLegisFacile.g:4067:2: ( ruleVigencia )
            // InternalLegisFacile.g:4068:3: ruleVigencia
            {
             before(grammarAccess.getFinalAccess().getVigenciaVigenciaParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVigencia();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getVigenciaVigenciaParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__VigenciaAssignment_2_1_1"


    // $ANTLR start "rule__Vigencia__TextoAssignment_2"
    // InternalLegisFacile.g:4077:1: rule__Vigencia__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Vigencia__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:4081:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:4082:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:4082:2: ( RULE_STRING )
            // InternalLegisFacile.g:4083:3: RULE_STRING
            {
             before(grammarAccess.getVigenciaAccess().getTextoSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVigenciaAccess().getTextoSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vigencia__TextoAssignment_2"


    // $ANTLR start "rule__Revogacao__TextoAssignment_2"
    // InternalLegisFacile.g:4092:1: rule__Revogacao__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Revogacao__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:4096:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:4097:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:4097:2: ( RULE_STRING )
            // InternalLegisFacile.g:4098:3: RULE_STRING
            {
             before(grammarAccess.getRevogacaoAccess().getTextoSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRevogacaoAccess().getTextoSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Revogacao__TextoAssignment_2"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalLegisFacile.g:4107:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:4111:1: ( ( RULE_ID ) )
            // InternalLegisFacile.g:4112:2: ( RULE_ID )
            {
            // InternalLegisFacile.g:4112:2: ( RULE_ID )
            // InternalLegisFacile.g:4113:3: RULE_ID
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
    // InternalLegisFacile.g:4122:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:4126:1: ( ( RULE_ID ) )
            // InternalLegisFacile.g:4127:2: ( RULE_ID )
            {
            // InternalLegisFacile.g:4127:2: ( RULE_ID )
            // InternalLegisFacile.g:4128:3: RULE_ID
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
    // InternalLegisFacile.g:4137:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:4141:1: ( ( ( RULE_ID ) ) )
            // InternalLegisFacile.g:4142:2: ( ( RULE_ID ) )
            {
            // InternalLegisFacile.g:4142:2: ( ( RULE_ID ) )
            // InternalLegisFacile.g:4143:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // InternalLegisFacile.g:4144:3: ( RULE_ID )
            // InternalLegisFacile.g:4145:4: RULE_ID
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
    // InternalLegisFacile.g:4156:1: rule__Entity__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:4160:1: ( ( ruleFeature ) )
            // InternalLegisFacile.g:4161:2: ( ruleFeature )
            {
            // InternalLegisFacile.g:4161:2: ( ruleFeature )
            // InternalLegisFacile.g:4162:3: ruleFeature
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
    // InternalLegisFacile.g:4171:1: rule__Feature__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Feature__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:4175:1: ( ( ( 'many' ) ) )
            // InternalLegisFacile.g:4176:2: ( ( 'many' ) )
            {
            // InternalLegisFacile.g:4176:2: ( ( 'many' ) )
            // InternalLegisFacile.g:4177:3: ( 'many' )
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            // InternalLegisFacile.g:4178:3: ( 'many' )
            // InternalLegisFacile.g:4179:4: 'many'
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalLegisFacile.g:4190:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:4194:1: ( ( RULE_ID ) )
            // InternalLegisFacile.g:4195:2: ( RULE_ID )
            {
            // InternalLegisFacile.g:4195:2: ( RULE_ID )
            // InternalLegisFacile.g:4196:3: RULE_ID
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
    // InternalLegisFacile.g:4205:1: rule__Feature__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:4209:1: ( ( ( RULE_ID ) ) )
            // InternalLegisFacile.g:4210:2: ( ( RULE_ID ) )
            {
            // InternalLegisFacile.g:4210:2: ( ( RULE_ID ) )
            // InternalLegisFacile.g:4211:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 
            // InternalLegisFacile.g:4212:3: ( RULE_ID )
            // InternalLegisFacile.g:4213:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000300000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020006000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020018000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020060000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020180000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001020000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001000000000042L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000000L});

}