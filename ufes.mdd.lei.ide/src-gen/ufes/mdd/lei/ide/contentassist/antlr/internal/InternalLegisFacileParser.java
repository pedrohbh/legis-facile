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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Preliminar'", "'preliminar'", "'Epigrafe'", "'epigrafe'", "'Ementa'", "'ementa'", "'Preambulo'", "'preambulo'", "'Normativa'", "'normativa'", "'Artigo'", "'artigo'", "'Caput'", "'caput'", "'Paragrafo'", "'paragrafo'", "'Inciso'", "'inciso'", "'alinea'", "'Alinea'", "'Item'", "'item'", "'Final'", "'final'", "'vigencia'", "'Vigencia'", "'revoga'", "'Revoga'", "'{'", "','", "'}'", "'('", "')'"
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

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
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
    // InternalLegisFacile.g:87:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:91:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalLegisFacile.g:92:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalLegisFacile.g:92:2: ( ( rule__Type__Group__0 ) )
            // InternalLegisFacile.g:93:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalLegisFacile.g:94:3: ( rule__Type__Group__0 )
            // InternalLegisFacile.g:94:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "rule__Preliminar__Alternatives_0"
    // InternalLegisFacile.g:452:1: rule__Preliminar__Alternatives_0 : ( ( 'Preliminar' ) | ( 'preliminar' ) );
    public final void rule__Preliminar__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:456:1: ( ( 'Preliminar' ) | ( 'preliminar' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLegisFacile.g:457:2: ( 'Preliminar' )
                    {
                    // InternalLegisFacile.g:457:2: ( 'Preliminar' )
                    // InternalLegisFacile.g:458:3: 'Preliminar'
                    {
                     before(grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:463:2: ( 'preliminar' )
                    {
                    // InternalLegisFacile.g:463:2: ( 'preliminar' )
                    // InternalLegisFacile.g:464:3: 'preliminar'
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
    // InternalLegisFacile.g:473:1: rule__Epigrafe__Alternatives_0 : ( ( 'Epigrafe' ) | ( 'epigrafe' ) );
    public final void rule__Epigrafe__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:477:1: ( ( 'Epigrafe' ) | ( 'epigrafe' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLegisFacile.g:478:2: ( 'Epigrafe' )
                    {
                    // InternalLegisFacile.g:478:2: ( 'Epigrafe' )
                    // InternalLegisFacile.g:479:3: 'Epigrafe'
                    {
                     before(grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:484:2: ( 'epigrafe' )
                    {
                    // InternalLegisFacile.g:484:2: ( 'epigrafe' )
                    // InternalLegisFacile.g:485:3: 'epigrafe'
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
    // InternalLegisFacile.g:494:1: rule__Ementa__Alternatives_0 : ( ( 'Ementa' ) | ( 'ementa' ) );
    public final void rule__Ementa__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:498:1: ( ( 'Ementa' ) | ( 'ementa' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLegisFacile.g:499:2: ( 'Ementa' )
                    {
                    // InternalLegisFacile.g:499:2: ( 'Ementa' )
                    // InternalLegisFacile.g:500:3: 'Ementa'
                    {
                     before(grammarAccess.getEmentaAccess().getEmentaKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEmentaAccess().getEmentaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:505:2: ( 'ementa' )
                    {
                    // InternalLegisFacile.g:505:2: ( 'ementa' )
                    // InternalLegisFacile.g:506:3: 'ementa'
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
    // InternalLegisFacile.g:515:1: rule__Preambulo__Alternatives_0 : ( ( 'Preambulo' ) | ( 'preambulo' ) );
    public final void rule__Preambulo__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:519:1: ( ( 'Preambulo' ) | ( 'preambulo' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLegisFacile.g:520:2: ( 'Preambulo' )
                    {
                    // InternalLegisFacile.g:520:2: ( 'Preambulo' )
                    // InternalLegisFacile.g:521:3: 'Preambulo'
                    {
                     before(grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:526:2: ( 'preambulo' )
                    {
                    // InternalLegisFacile.g:526:2: ( 'preambulo' )
                    // InternalLegisFacile.g:527:3: 'preambulo'
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
    // InternalLegisFacile.g:536:1: rule__Normativa__Alternatives_0 : ( ( 'Normativa' ) | ( 'normativa' ) );
    public final void rule__Normativa__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:540:1: ( ( 'Normativa' ) | ( 'normativa' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLegisFacile.g:541:2: ( 'Normativa' )
                    {
                    // InternalLegisFacile.g:541:2: ( 'Normativa' )
                    // InternalLegisFacile.g:542:3: 'Normativa'
                    {
                     before(grammarAccess.getNormativaAccess().getNormativaKeyword_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getNormativaAccess().getNormativaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:547:2: ( 'normativa' )
                    {
                    // InternalLegisFacile.g:547:2: ( 'normativa' )
                    // InternalLegisFacile.g:548:3: 'normativa'
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
    // InternalLegisFacile.g:557:1: rule__Artigo__Alternatives_0 : ( ( 'Artigo' ) | ( 'artigo' ) );
    public final void rule__Artigo__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:561:1: ( ( 'Artigo' ) | ( 'artigo' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLegisFacile.g:562:2: ( 'Artigo' )
                    {
                    // InternalLegisFacile.g:562:2: ( 'Artigo' )
                    // InternalLegisFacile.g:563:3: 'Artigo'
                    {
                     before(grammarAccess.getArtigoAccess().getArtigoKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getArtigoAccess().getArtigoKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:568:2: ( 'artigo' )
                    {
                    // InternalLegisFacile.g:568:2: ( 'artigo' )
                    // InternalLegisFacile.g:569:3: 'artigo'
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
    // InternalLegisFacile.g:578:1: rule__Caput__Alternatives_0 : ( ( 'Caput' ) | ( 'caput' ) );
    public final void rule__Caput__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:582:1: ( ( 'Caput' ) | ( 'caput' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLegisFacile.g:583:2: ( 'Caput' )
                    {
                    // InternalLegisFacile.g:583:2: ( 'Caput' )
                    // InternalLegisFacile.g:584:3: 'Caput'
                    {
                     before(grammarAccess.getCaputAccess().getCaputKeyword_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getCaputAccess().getCaputKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:589:2: ( 'caput' )
                    {
                    // InternalLegisFacile.g:589:2: ( 'caput' )
                    // InternalLegisFacile.g:590:3: 'caput'
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
    // InternalLegisFacile.g:599:1: rule__Paragrafo__Alternatives_0 : ( ( 'Paragrafo' ) | ( 'paragrafo' ) );
    public final void rule__Paragrafo__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:603:1: ( ( 'Paragrafo' ) | ( 'paragrafo' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLegisFacile.g:604:2: ( 'Paragrafo' )
                    {
                    // InternalLegisFacile.g:604:2: ( 'Paragrafo' )
                    // InternalLegisFacile.g:605:3: 'Paragrafo'
                    {
                     before(grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:610:2: ( 'paragrafo' )
                    {
                    // InternalLegisFacile.g:610:2: ( 'paragrafo' )
                    // InternalLegisFacile.g:611:3: 'paragrafo'
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
    // InternalLegisFacile.g:620:1: rule__Inciso__Alternatives_0 : ( ( 'Inciso' ) | ( 'inciso' ) );
    public final void rule__Inciso__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:624:1: ( ( 'Inciso' ) | ( 'inciso' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalLegisFacile.g:625:2: ( 'Inciso' )
                    {
                    // InternalLegisFacile.g:625:2: ( 'Inciso' )
                    // InternalLegisFacile.g:626:3: 'Inciso'
                    {
                     before(grammarAccess.getIncisoAccess().getIncisoKeyword_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getIncisoAccess().getIncisoKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:631:2: ( 'inciso' )
                    {
                    // InternalLegisFacile.g:631:2: ( 'inciso' )
                    // InternalLegisFacile.g:632:3: 'inciso'
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
    // InternalLegisFacile.g:641:1: rule__Alinea__Alternatives_0 : ( ( 'alinea' ) | ( 'Alinea' ) );
    public final void rule__Alinea__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:645:1: ( ( 'alinea' ) | ( 'Alinea' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            else if ( (LA11_0==30) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalLegisFacile.g:646:2: ( 'alinea' )
                    {
                    // InternalLegisFacile.g:646:2: ( 'alinea' )
                    // InternalLegisFacile.g:647:3: 'alinea'
                    {
                     before(grammarAccess.getAlineaAccess().getAlineaKeyword_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getAlineaAccess().getAlineaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:652:2: ( 'Alinea' )
                    {
                    // InternalLegisFacile.g:652:2: ( 'Alinea' )
                    // InternalLegisFacile.g:653:3: 'Alinea'
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
    // InternalLegisFacile.g:662:1: rule__Item__Alternatives_0 : ( ( 'Item' ) | ( 'item' ) );
    public final void rule__Item__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:666:1: ( ( 'Item' ) | ( 'item' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            else if ( (LA12_0==32) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLegisFacile.g:667:2: ( 'Item' )
                    {
                    // InternalLegisFacile.g:667:2: ( 'Item' )
                    // InternalLegisFacile.g:668:3: 'Item'
                    {
                     before(grammarAccess.getItemAccess().getItemKeyword_0_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getItemAccess().getItemKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:673:2: ( 'item' )
                    {
                    // InternalLegisFacile.g:673:2: ( 'item' )
                    // InternalLegisFacile.g:674:3: 'item'
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
    // InternalLegisFacile.g:683:1: rule__Final__Alternatives_0 : ( ( 'Final' ) | ( 'final' ) );
    public final void rule__Final__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:687:1: ( ( 'Final' ) | ( 'final' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            else if ( (LA13_0==34) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalLegisFacile.g:688:2: ( 'Final' )
                    {
                    // InternalLegisFacile.g:688:2: ( 'Final' )
                    // InternalLegisFacile.g:689:3: 'Final'
                    {
                     before(grammarAccess.getFinalAccess().getFinalKeyword_0_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getFinalAccess().getFinalKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:694:2: ( 'final' )
                    {
                    // InternalLegisFacile.g:694:2: ( 'final' )
                    // InternalLegisFacile.g:695:3: 'final'
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
    // InternalLegisFacile.g:704:1: rule__Final__Alternatives_2 : ( ( ( rule__Final__Group_2_0__0 ) ) | ( ( rule__Final__Group_2_1__0 ) ) );
    public final void rule__Final__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:708:1: ( ( ( rule__Final__Group_2_0__0 ) ) | ( ( rule__Final__Group_2_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=35 && LA14_0<=36)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=37 && LA14_0<=38)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalLegisFacile.g:709:2: ( ( rule__Final__Group_2_0__0 ) )
                    {
                    // InternalLegisFacile.g:709:2: ( ( rule__Final__Group_2_0__0 ) )
                    // InternalLegisFacile.g:710:3: ( rule__Final__Group_2_0__0 )
                    {
                     before(grammarAccess.getFinalAccess().getGroup_2_0()); 
                    // InternalLegisFacile.g:711:3: ( rule__Final__Group_2_0__0 )
                    // InternalLegisFacile.g:711:4: rule__Final__Group_2_0__0
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
                    // InternalLegisFacile.g:715:2: ( ( rule__Final__Group_2_1__0 ) )
                    {
                    // InternalLegisFacile.g:715:2: ( ( rule__Final__Group_2_1__0 ) )
                    // InternalLegisFacile.g:716:3: ( rule__Final__Group_2_1__0 )
                    {
                     before(grammarAccess.getFinalAccess().getGroup_2_1()); 
                    // InternalLegisFacile.g:717:3: ( rule__Final__Group_2_1__0 )
                    // InternalLegisFacile.g:717:4: rule__Final__Group_2_1__0
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
    // InternalLegisFacile.g:725:1: rule__Vigencia__Alternatives_0 : ( ( 'vigencia' ) | ( 'Vigencia' ) );
    public final void rule__Vigencia__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:729:1: ( ( 'vigencia' ) | ( 'Vigencia' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            else if ( (LA15_0==36) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalLegisFacile.g:730:2: ( 'vigencia' )
                    {
                    // InternalLegisFacile.g:730:2: ( 'vigencia' )
                    // InternalLegisFacile.g:731:3: 'vigencia'
                    {
                     before(grammarAccess.getVigenciaAccess().getVigenciaKeyword_0_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getVigenciaAccess().getVigenciaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:736:2: ( 'Vigencia' )
                    {
                    // InternalLegisFacile.g:736:2: ( 'Vigencia' )
                    // InternalLegisFacile.g:737:3: 'Vigencia'
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
    // InternalLegisFacile.g:746:1: rule__Revogacao__Alternatives_0 : ( ( 'revoga' ) | ( 'Revoga' ) );
    public final void rule__Revogacao__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:750:1: ( ( 'revoga' ) | ( 'Revoga' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            else if ( (LA16_0==38) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalLegisFacile.g:751:2: ( 'revoga' )
                    {
                    // InternalLegisFacile.g:751:2: ( 'revoga' )
                    // InternalLegisFacile.g:752:3: 'revoga'
                    {
                     before(grammarAccess.getRevogacaoAccess().getRevogaKeyword_0_0()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getRevogacaoAccess().getRevogaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:757:2: ( 'Revoga' )
                    {
                    // InternalLegisFacile.g:757:2: ( 'Revoga' )
                    // InternalLegisFacile.g:758:3: 'Revoga'
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


    // $ANTLR start "rule__Type__Group__0"
    // InternalLegisFacile.g:767:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:771:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalLegisFacile.g:772:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalLegisFacile.g:779:1: rule__Type__Group__0__Impl : ( ( rule__Type__PreliminarAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:783:1: ( ( ( rule__Type__PreliminarAssignment_0 ) ) )
            // InternalLegisFacile.g:784:1: ( ( rule__Type__PreliminarAssignment_0 ) )
            {
            // InternalLegisFacile.g:784:1: ( ( rule__Type__PreliminarAssignment_0 ) )
            // InternalLegisFacile.g:785:2: ( rule__Type__PreliminarAssignment_0 )
            {
             before(grammarAccess.getTypeAccess().getPreliminarAssignment_0()); 
            // InternalLegisFacile.g:786:2: ( rule__Type__PreliminarAssignment_0 )
            // InternalLegisFacile.g:786:3: rule__Type__PreliminarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__PreliminarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getPreliminarAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalLegisFacile.g:794:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:798:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalLegisFacile.g:799:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalLegisFacile.g:806:1: rule__Type__Group__1__Impl : ( ( rule__Type__NormativaAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:810:1: ( ( ( rule__Type__NormativaAssignment_1 ) ) )
            // InternalLegisFacile.g:811:1: ( ( rule__Type__NormativaAssignment_1 ) )
            {
            // InternalLegisFacile.g:811:1: ( ( rule__Type__NormativaAssignment_1 ) )
            // InternalLegisFacile.g:812:2: ( rule__Type__NormativaAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNormativaAssignment_1()); 
            // InternalLegisFacile.g:813:2: ( rule__Type__NormativaAssignment_1 )
            // InternalLegisFacile.g:813:3: rule__Type__NormativaAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__NormativaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNormativaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalLegisFacile.g:821:1: rule__Type__Group__2 : rule__Type__Group__2__Impl ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:825:1: ( rule__Type__Group__2__Impl )
            // InternalLegisFacile.g:826:2: rule__Type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalLegisFacile.g:832:1: rule__Type__Group__2__Impl : ( ( rule__Type__FinalAssignment_2 )? ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:836:1: ( ( ( rule__Type__FinalAssignment_2 )? ) )
            // InternalLegisFacile.g:837:1: ( ( rule__Type__FinalAssignment_2 )? )
            {
            // InternalLegisFacile.g:837:1: ( ( rule__Type__FinalAssignment_2 )? )
            // InternalLegisFacile.g:838:2: ( rule__Type__FinalAssignment_2 )?
            {
             before(grammarAccess.getTypeAccess().getFinalAssignment_2()); 
            // InternalLegisFacile.g:839:2: ( rule__Type__FinalAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=33 && LA17_0<=34)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLegisFacile.g:839:3: rule__Type__FinalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__FinalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getFinalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Preliminar__Group__0"
    // InternalLegisFacile.g:848:1: rule__Preliminar__Group__0 : rule__Preliminar__Group__0__Impl rule__Preliminar__Group__1 ;
    public final void rule__Preliminar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:852:1: ( rule__Preliminar__Group__0__Impl rule__Preliminar__Group__1 )
            // InternalLegisFacile.g:853:2: rule__Preliminar__Group__0__Impl rule__Preliminar__Group__1
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
    // InternalLegisFacile.g:860:1: rule__Preliminar__Group__0__Impl : ( ( rule__Preliminar__Alternatives_0 ) ) ;
    public final void rule__Preliminar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:864:1: ( ( ( rule__Preliminar__Alternatives_0 ) ) )
            // InternalLegisFacile.g:865:1: ( ( rule__Preliminar__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:865:1: ( ( rule__Preliminar__Alternatives_0 ) )
            // InternalLegisFacile.g:866:2: ( rule__Preliminar__Alternatives_0 )
            {
             before(grammarAccess.getPreliminarAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:867:2: ( rule__Preliminar__Alternatives_0 )
            // InternalLegisFacile.g:867:3: rule__Preliminar__Alternatives_0
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
    // InternalLegisFacile.g:875:1: rule__Preliminar__Group__1 : rule__Preliminar__Group__1__Impl rule__Preliminar__Group__2 ;
    public final void rule__Preliminar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:879:1: ( rule__Preliminar__Group__1__Impl rule__Preliminar__Group__2 )
            // InternalLegisFacile.g:880:2: rule__Preliminar__Group__1__Impl rule__Preliminar__Group__2
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
    // InternalLegisFacile.g:887:1: rule__Preliminar__Group__1__Impl : ( '{' ) ;
    public final void rule__Preliminar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:891:1: ( ( '{' ) )
            // InternalLegisFacile.g:892:1: ( '{' )
            {
            // InternalLegisFacile.g:892:1: ( '{' )
            // InternalLegisFacile.g:893:2: '{'
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
    // InternalLegisFacile.g:902:1: rule__Preliminar__Group__2 : rule__Preliminar__Group__2__Impl rule__Preliminar__Group__3 ;
    public final void rule__Preliminar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:906:1: ( rule__Preliminar__Group__2__Impl rule__Preliminar__Group__3 )
            // InternalLegisFacile.g:907:2: rule__Preliminar__Group__2__Impl rule__Preliminar__Group__3
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
    // InternalLegisFacile.g:914:1: rule__Preliminar__Group__2__Impl : ( ( rule__Preliminar__EpigrageAssignment_2 ) ) ;
    public final void rule__Preliminar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:918:1: ( ( ( rule__Preliminar__EpigrageAssignment_2 ) ) )
            // InternalLegisFacile.g:919:1: ( ( rule__Preliminar__EpigrageAssignment_2 ) )
            {
            // InternalLegisFacile.g:919:1: ( ( rule__Preliminar__EpigrageAssignment_2 ) )
            // InternalLegisFacile.g:920:2: ( rule__Preliminar__EpigrageAssignment_2 )
            {
             before(grammarAccess.getPreliminarAccess().getEpigrageAssignment_2()); 
            // InternalLegisFacile.g:921:2: ( rule__Preliminar__EpigrageAssignment_2 )
            // InternalLegisFacile.g:921:3: rule__Preliminar__EpigrageAssignment_2
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
    // InternalLegisFacile.g:929:1: rule__Preliminar__Group__3 : rule__Preliminar__Group__3__Impl rule__Preliminar__Group__4 ;
    public final void rule__Preliminar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:933:1: ( rule__Preliminar__Group__3__Impl rule__Preliminar__Group__4 )
            // InternalLegisFacile.g:934:2: rule__Preliminar__Group__3__Impl rule__Preliminar__Group__4
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
    // InternalLegisFacile.g:941:1: rule__Preliminar__Group__3__Impl : ( ',' ) ;
    public final void rule__Preliminar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:945:1: ( ( ',' ) )
            // InternalLegisFacile.g:946:1: ( ',' )
            {
            // InternalLegisFacile.g:946:1: ( ',' )
            // InternalLegisFacile.g:947:2: ','
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
    // InternalLegisFacile.g:956:1: rule__Preliminar__Group__4 : rule__Preliminar__Group__4__Impl rule__Preliminar__Group__5 ;
    public final void rule__Preliminar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:960:1: ( rule__Preliminar__Group__4__Impl rule__Preliminar__Group__5 )
            // InternalLegisFacile.g:961:2: rule__Preliminar__Group__4__Impl rule__Preliminar__Group__5
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
    // InternalLegisFacile.g:968:1: rule__Preliminar__Group__4__Impl : ( ( rule__Preliminar__EmentaAssignment_4 ) ) ;
    public final void rule__Preliminar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:972:1: ( ( ( rule__Preliminar__EmentaAssignment_4 ) ) )
            // InternalLegisFacile.g:973:1: ( ( rule__Preliminar__EmentaAssignment_4 ) )
            {
            // InternalLegisFacile.g:973:1: ( ( rule__Preliminar__EmentaAssignment_4 ) )
            // InternalLegisFacile.g:974:2: ( rule__Preliminar__EmentaAssignment_4 )
            {
             before(grammarAccess.getPreliminarAccess().getEmentaAssignment_4()); 
            // InternalLegisFacile.g:975:2: ( rule__Preliminar__EmentaAssignment_4 )
            // InternalLegisFacile.g:975:3: rule__Preliminar__EmentaAssignment_4
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
    // InternalLegisFacile.g:983:1: rule__Preliminar__Group__5 : rule__Preliminar__Group__5__Impl rule__Preliminar__Group__6 ;
    public final void rule__Preliminar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:987:1: ( rule__Preliminar__Group__5__Impl rule__Preliminar__Group__6 )
            // InternalLegisFacile.g:988:2: rule__Preliminar__Group__5__Impl rule__Preliminar__Group__6
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
    // InternalLegisFacile.g:995:1: rule__Preliminar__Group__5__Impl : ( ',' ) ;
    public final void rule__Preliminar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:999:1: ( ( ',' ) )
            // InternalLegisFacile.g:1000:1: ( ',' )
            {
            // InternalLegisFacile.g:1000:1: ( ',' )
            // InternalLegisFacile.g:1001:2: ','
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
    // InternalLegisFacile.g:1010:1: rule__Preliminar__Group__6 : rule__Preliminar__Group__6__Impl rule__Preliminar__Group__7 ;
    public final void rule__Preliminar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1014:1: ( rule__Preliminar__Group__6__Impl rule__Preliminar__Group__7 )
            // InternalLegisFacile.g:1015:2: rule__Preliminar__Group__6__Impl rule__Preliminar__Group__7
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
    // InternalLegisFacile.g:1022:1: rule__Preliminar__Group__6__Impl : ( ( rule__Preliminar__PreambuloAssignment_6 ) ) ;
    public final void rule__Preliminar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1026:1: ( ( ( rule__Preliminar__PreambuloAssignment_6 ) ) )
            // InternalLegisFacile.g:1027:1: ( ( rule__Preliminar__PreambuloAssignment_6 ) )
            {
            // InternalLegisFacile.g:1027:1: ( ( rule__Preliminar__PreambuloAssignment_6 ) )
            // InternalLegisFacile.g:1028:2: ( rule__Preliminar__PreambuloAssignment_6 )
            {
             before(grammarAccess.getPreliminarAccess().getPreambuloAssignment_6()); 
            // InternalLegisFacile.g:1029:2: ( rule__Preliminar__PreambuloAssignment_6 )
            // InternalLegisFacile.g:1029:3: rule__Preliminar__PreambuloAssignment_6
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
    // InternalLegisFacile.g:1037:1: rule__Preliminar__Group__7 : rule__Preliminar__Group__7__Impl rule__Preliminar__Group__8 ;
    public final void rule__Preliminar__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1041:1: ( rule__Preliminar__Group__7__Impl rule__Preliminar__Group__8 )
            // InternalLegisFacile.g:1042:2: rule__Preliminar__Group__7__Impl rule__Preliminar__Group__8
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
    // InternalLegisFacile.g:1049:1: rule__Preliminar__Group__7__Impl : ( ',' ) ;
    public final void rule__Preliminar__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1053:1: ( ( ',' ) )
            // InternalLegisFacile.g:1054:1: ( ',' )
            {
            // InternalLegisFacile.g:1054:1: ( ',' )
            // InternalLegisFacile.g:1055:2: ','
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
    // InternalLegisFacile.g:1064:1: rule__Preliminar__Group__8 : rule__Preliminar__Group__8__Impl ;
    public final void rule__Preliminar__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1068:1: ( rule__Preliminar__Group__8__Impl )
            // InternalLegisFacile.g:1069:2: rule__Preliminar__Group__8__Impl
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
    // InternalLegisFacile.g:1075:1: rule__Preliminar__Group__8__Impl : ( '}' ) ;
    public final void rule__Preliminar__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1079:1: ( ( '}' ) )
            // InternalLegisFacile.g:1080:1: ( '}' )
            {
            // InternalLegisFacile.g:1080:1: ( '}' )
            // InternalLegisFacile.g:1081:2: '}'
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
    // InternalLegisFacile.g:1091:1: rule__Epigrafe__Group__0 : rule__Epigrafe__Group__0__Impl rule__Epigrafe__Group__1 ;
    public final void rule__Epigrafe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1095:1: ( rule__Epigrafe__Group__0__Impl rule__Epigrafe__Group__1 )
            // InternalLegisFacile.g:1096:2: rule__Epigrafe__Group__0__Impl rule__Epigrafe__Group__1
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
    // InternalLegisFacile.g:1103:1: rule__Epigrafe__Group__0__Impl : ( ( rule__Epigrafe__Alternatives_0 ) ) ;
    public final void rule__Epigrafe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1107:1: ( ( ( rule__Epigrafe__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1108:1: ( ( rule__Epigrafe__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1108:1: ( ( rule__Epigrafe__Alternatives_0 ) )
            // InternalLegisFacile.g:1109:2: ( rule__Epigrafe__Alternatives_0 )
            {
             before(grammarAccess.getEpigrafeAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1110:2: ( rule__Epigrafe__Alternatives_0 )
            // InternalLegisFacile.g:1110:3: rule__Epigrafe__Alternatives_0
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
    // InternalLegisFacile.g:1118:1: rule__Epigrafe__Group__1 : rule__Epigrafe__Group__1__Impl rule__Epigrafe__Group__2 ;
    public final void rule__Epigrafe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1122:1: ( rule__Epigrafe__Group__1__Impl rule__Epigrafe__Group__2 )
            // InternalLegisFacile.g:1123:2: rule__Epigrafe__Group__1__Impl rule__Epigrafe__Group__2
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
    // InternalLegisFacile.g:1130:1: rule__Epigrafe__Group__1__Impl : ( '(' ) ;
    public final void rule__Epigrafe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1134:1: ( ( '(' ) )
            // InternalLegisFacile.g:1135:1: ( '(' )
            {
            // InternalLegisFacile.g:1135:1: ( '(' )
            // InternalLegisFacile.g:1136:2: '('
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
    // InternalLegisFacile.g:1145:1: rule__Epigrafe__Group__2 : rule__Epigrafe__Group__2__Impl rule__Epigrafe__Group__3 ;
    public final void rule__Epigrafe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1149:1: ( rule__Epigrafe__Group__2__Impl rule__Epigrafe__Group__3 )
            // InternalLegisFacile.g:1150:2: rule__Epigrafe__Group__2__Impl rule__Epigrafe__Group__3
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
    // InternalLegisFacile.g:1157:1: rule__Epigrafe__Group__2__Impl : ( ( rule__Epigrafe__AtoAssignment_2 ) ) ;
    public final void rule__Epigrafe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1161:1: ( ( ( rule__Epigrafe__AtoAssignment_2 ) ) )
            // InternalLegisFacile.g:1162:1: ( ( rule__Epigrafe__AtoAssignment_2 ) )
            {
            // InternalLegisFacile.g:1162:1: ( ( rule__Epigrafe__AtoAssignment_2 ) )
            // InternalLegisFacile.g:1163:2: ( rule__Epigrafe__AtoAssignment_2 )
            {
             before(grammarAccess.getEpigrafeAccess().getAtoAssignment_2()); 
            // InternalLegisFacile.g:1164:2: ( rule__Epigrafe__AtoAssignment_2 )
            // InternalLegisFacile.g:1164:3: rule__Epigrafe__AtoAssignment_2
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
    // InternalLegisFacile.g:1172:1: rule__Epigrafe__Group__3 : rule__Epigrafe__Group__3__Impl rule__Epigrafe__Group__4 ;
    public final void rule__Epigrafe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1176:1: ( rule__Epigrafe__Group__3__Impl rule__Epigrafe__Group__4 )
            // InternalLegisFacile.g:1177:2: rule__Epigrafe__Group__3__Impl rule__Epigrafe__Group__4
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
    // InternalLegisFacile.g:1184:1: rule__Epigrafe__Group__3__Impl : ( ',' ) ;
    public final void rule__Epigrafe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1188:1: ( ( ',' ) )
            // InternalLegisFacile.g:1189:1: ( ',' )
            {
            // InternalLegisFacile.g:1189:1: ( ',' )
            // InternalLegisFacile.g:1190:2: ','
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
    // InternalLegisFacile.g:1199:1: rule__Epigrafe__Group__4 : rule__Epigrafe__Group__4__Impl rule__Epigrafe__Group__5 ;
    public final void rule__Epigrafe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1203:1: ( rule__Epigrafe__Group__4__Impl rule__Epigrafe__Group__5 )
            // InternalLegisFacile.g:1204:2: rule__Epigrafe__Group__4__Impl rule__Epigrafe__Group__5
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
    // InternalLegisFacile.g:1211:1: rule__Epigrafe__Group__4__Impl : ( ( rule__Epigrafe__NumeroAssignment_4 ) ) ;
    public final void rule__Epigrafe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1215:1: ( ( ( rule__Epigrafe__NumeroAssignment_4 ) ) )
            // InternalLegisFacile.g:1216:1: ( ( rule__Epigrafe__NumeroAssignment_4 ) )
            {
            // InternalLegisFacile.g:1216:1: ( ( rule__Epigrafe__NumeroAssignment_4 ) )
            // InternalLegisFacile.g:1217:2: ( rule__Epigrafe__NumeroAssignment_4 )
            {
             before(grammarAccess.getEpigrafeAccess().getNumeroAssignment_4()); 
            // InternalLegisFacile.g:1218:2: ( rule__Epigrafe__NumeroAssignment_4 )
            // InternalLegisFacile.g:1218:3: rule__Epigrafe__NumeroAssignment_4
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
    // InternalLegisFacile.g:1226:1: rule__Epigrafe__Group__5 : rule__Epigrafe__Group__5__Impl rule__Epigrafe__Group__6 ;
    public final void rule__Epigrafe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1230:1: ( rule__Epigrafe__Group__5__Impl rule__Epigrafe__Group__6 )
            // InternalLegisFacile.g:1231:2: rule__Epigrafe__Group__5__Impl rule__Epigrafe__Group__6
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
    // InternalLegisFacile.g:1238:1: rule__Epigrafe__Group__5__Impl : ( ',' ) ;
    public final void rule__Epigrafe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1242:1: ( ( ',' ) )
            // InternalLegisFacile.g:1243:1: ( ',' )
            {
            // InternalLegisFacile.g:1243:1: ( ',' )
            // InternalLegisFacile.g:1244:2: ','
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
    // InternalLegisFacile.g:1253:1: rule__Epigrafe__Group__6 : rule__Epigrafe__Group__6__Impl rule__Epigrafe__Group__7 ;
    public final void rule__Epigrafe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1257:1: ( rule__Epigrafe__Group__6__Impl rule__Epigrafe__Group__7 )
            // InternalLegisFacile.g:1258:2: rule__Epigrafe__Group__6__Impl rule__Epigrafe__Group__7
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
    // InternalLegisFacile.g:1265:1: rule__Epigrafe__Group__6__Impl : ( ( rule__Epigrafe__AnoAssignment_6 ) ) ;
    public final void rule__Epigrafe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1269:1: ( ( ( rule__Epigrafe__AnoAssignment_6 ) ) )
            // InternalLegisFacile.g:1270:1: ( ( rule__Epigrafe__AnoAssignment_6 ) )
            {
            // InternalLegisFacile.g:1270:1: ( ( rule__Epigrafe__AnoAssignment_6 ) )
            // InternalLegisFacile.g:1271:2: ( rule__Epigrafe__AnoAssignment_6 )
            {
             before(grammarAccess.getEpigrafeAccess().getAnoAssignment_6()); 
            // InternalLegisFacile.g:1272:2: ( rule__Epigrafe__AnoAssignment_6 )
            // InternalLegisFacile.g:1272:3: rule__Epigrafe__AnoAssignment_6
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
    // InternalLegisFacile.g:1280:1: rule__Epigrafe__Group__7 : rule__Epigrafe__Group__7__Impl ;
    public final void rule__Epigrafe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1284:1: ( rule__Epigrafe__Group__7__Impl )
            // InternalLegisFacile.g:1285:2: rule__Epigrafe__Group__7__Impl
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
    // InternalLegisFacile.g:1291:1: rule__Epigrafe__Group__7__Impl : ( ')' ) ;
    public final void rule__Epigrafe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1295:1: ( ( ')' ) )
            // InternalLegisFacile.g:1296:1: ( ')' )
            {
            // InternalLegisFacile.g:1296:1: ( ')' )
            // InternalLegisFacile.g:1297:2: ')'
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
    // InternalLegisFacile.g:1307:1: rule__Ementa__Group__0 : rule__Ementa__Group__0__Impl rule__Ementa__Group__1 ;
    public final void rule__Ementa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1311:1: ( rule__Ementa__Group__0__Impl rule__Ementa__Group__1 )
            // InternalLegisFacile.g:1312:2: rule__Ementa__Group__0__Impl rule__Ementa__Group__1
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
    // InternalLegisFacile.g:1319:1: rule__Ementa__Group__0__Impl : ( ( rule__Ementa__Alternatives_0 ) ) ;
    public final void rule__Ementa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1323:1: ( ( ( rule__Ementa__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1324:1: ( ( rule__Ementa__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1324:1: ( ( rule__Ementa__Alternatives_0 ) )
            // InternalLegisFacile.g:1325:2: ( rule__Ementa__Alternatives_0 )
            {
             before(grammarAccess.getEmentaAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1326:2: ( rule__Ementa__Alternatives_0 )
            // InternalLegisFacile.g:1326:3: rule__Ementa__Alternatives_0
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
    // InternalLegisFacile.g:1334:1: rule__Ementa__Group__1 : rule__Ementa__Group__1__Impl rule__Ementa__Group__2 ;
    public final void rule__Ementa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1338:1: ( rule__Ementa__Group__1__Impl rule__Ementa__Group__2 )
            // InternalLegisFacile.g:1339:2: rule__Ementa__Group__1__Impl rule__Ementa__Group__2
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
    // InternalLegisFacile.g:1346:1: rule__Ementa__Group__1__Impl : ( '(' ) ;
    public final void rule__Ementa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1350:1: ( ( '(' ) )
            // InternalLegisFacile.g:1351:1: ( '(' )
            {
            // InternalLegisFacile.g:1351:1: ( '(' )
            // InternalLegisFacile.g:1352:2: '('
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
    // InternalLegisFacile.g:1361:1: rule__Ementa__Group__2 : rule__Ementa__Group__2__Impl rule__Ementa__Group__3 ;
    public final void rule__Ementa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1365:1: ( rule__Ementa__Group__2__Impl rule__Ementa__Group__3 )
            // InternalLegisFacile.g:1366:2: rule__Ementa__Group__2__Impl rule__Ementa__Group__3
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
    // InternalLegisFacile.g:1373:1: rule__Ementa__Group__2__Impl : ( ( rule__Ementa__EmentaAssignment_2 ) ) ;
    public final void rule__Ementa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1377:1: ( ( ( rule__Ementa__EmentaAssignment_2 ) ) )
            // InternalLegisFacile.g:1378:1: ( ( rule__Ementa__EmentaAssignment_2 ) )
            {
            // InternalLegisFacile.g:1378:1: ( ( rule__Ementa__EmentaAssignment_2 ) )
            // InternalLegisFacile.g:1379:2: ( rule__Ementa__EmentaAssignment_2 )
            {
             before(grammarAccess.getEmentaAccess().getEmentaAssignment_2()); 
            // InternalLegisFacile.g:1380:2: ( rule__Ementa__EmentaAssignment_2 )
            // InternalLegisFacile.g:1380:3: rule__Ementa__EmentaAssignment_2
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
    // InternalLegisFacile.g:1388:1: rule__Ementa__Group__3 : rule__Ementa__Group__3__Impl ;
    public final void rule__Ementa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1392:1: ( rule__Ementa__Group__3__Impl )
            // InternalLegisFacile.g:1393:2: rule__Ementa__Group__3__Impl
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
    // InternalLegisFacile.g:1399:1: rule__Ementa__Group__3__Impl : ( ')' ) ;
    public final void rule__Ementa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1403:1: ( ( ')' ) )
            // InternalLegisFacile.g:1404:1: ( ')' )
            {
            // InternalLegisFacile.g:1404:1: ( ')' )
            // InternalLegisFacile.g:1405:2: ')'
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
    // InternalLegisFacile.g:1415:1: rule__Preambulo__Group__0 : rule__Preambulo__Group__0__Impl rule__Preambulo__Group__1 ;
    public final void rule__Preambulo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1419:1: ( rule__Preambulo__Group__0__Impl rule__Preambulo__Group__1 )
            // InternalLegisFacile.g:1420:2: rule__Preambulo__Group__0__Impl rule__Preambulo__Group__1
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
    // InternalLegisFacile.g:1427:1: rule__Preambulo__Group__0__Impl : ( ( rule__Preambulo__Alternatives_0 ) ) ;
    public final void rule__Preambulo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1431:1: ( ( ( rule__Preambulo__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1432:1: ( ( rule__Preambulo__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1432:1: ( ( rule__Preambulo__Alternatives_0 ) )
            // InternalLegisFacile.g:1433:2: ( rule__Preambulo__Alternatives_0 )
            {
             before(grammarAccess.getPreambuloAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1434:2: ( rule__Preambulo__Alternatives_0 )
            // InternalLegisFacile.g:1434:3: rule__Preambulo__Alternatives_0
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
    // InternalLegisFacile.g:1442:1: rule__Preambulo__Group__1 : rule__Preambulo__Group__1__Impl rule__Preambulo__Group__2 ;
    public final void rule__Preambulo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1446:1: ( rule__Preambulo__Group__1__Impl rule__Preambulo__Group__2 )
            // InternalLegisFacile.g:1447:2: rule__Preambulo__Group__1__Impl rule__Preambulo__Group__2
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
    // InternalLegisFacile.g:1454:1: rule__Preambulo__Group__1__Impl : ( '(' ) ;
    public final void rule__Preambulo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1458:1: ( ( '(' ) )
            // InternalLegisFacile.g:1459:1: ( '(' )
            {
            // InternalLegisFacile.g:1459:1: ( '(' )
            // InternalLegisFacile.g:1460:2: '('
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
    // InternalLegisFacile.g:1469:1: rule__Preambulo__Group__2 : rule__Preambulo__Group__2__Impl rule__Preambulo__Group__3 ;
    public final void rule__Preambulo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1473:1: ( rule__Preambulo__Group__2__Impl rule__Preambulo__Group__3 )
            // InternalLegisFacile.g:1474:2: rule__Preambulo__Group__2__Impl rule__Preambulo__Group__3
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
    // InternalLegisFacile.g:1481:1: rule__Preambulo__Group__2__Impl : ( ( rule__Preambulo__PreambuloAssignment_2 ) ) ;
    public final void rule__Preambulo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1485:1: ( ( ( rule__Preambulo__PreambuloAssignment_2 ) ) )
            // InternalLegisFacile.g:1486:1: ( ( rule__Preambulo__PreambuloAssignment_2 ) )
            {
            // InternalLegisFacile.g:1486:1: ( ( rule__Preambulo__PreambuloAssignment_2 ) )
            // InternalLegisFacile.g:1487:2: ( rule__Preambulo__PreambuloAssignment_2 )
            {
             before(grammarAccess.getPreambuloAccess().getPreambuloAssignment_2()); 
            // InternalLegisFacile.g:1488:2: ( rule__Preambulo__PreambuloAssignment_2 )
            // InternalLegisFacile.g:1488:3: rule__Preambulo__PreambuloAssignment_2
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
    // InternalLegisFacile.g:1496:1: rule__Preambulo__Group__3 : rule__Preambulo__Group__3__Impl ;
    public final void rule__Preambulo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1500:1: ( rule__Preambulo__Group__3__Impl )
            // InternalLegisFacile.g:1501:2: rule__Preambulo__Group__3__Impl
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
    // InternalLegisFacile.g:1507:1: rule__Preambulo__Group__3__Impl : ( ')' ) ;
    public final void rule__Preambulo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1511:1: ( ( ')' ) )
            // InternalLegisFacile.g:1512:1: ( ')' )
            {
            // InternalLegisFacile.g:1512:1: ( ')' )
            // InternalLegisFacile.g:1513:2: ')'
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
    // InternalLegisFacile.g:1523:1: rule__Normativa__Group__0 : rule__Normativa__Group__0__Impl rule__Normativa__Group__1 ;
    public final void rule__Normativa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1527:1: ( rule__Normativa__Group__0__Impl rule__Normativa__Group__1 )
            // InternalLegisFacile.g:1528:2: rule__Normativa__Group__0__Impl rule__Normativa__Group__1
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
    // InternalLegisFacile.g:1535:1: rule__Normativa__Group__0__Impl : ( ( rule__Normativa__Alternatives_0 ) ) ;
    public final void rule__Normativa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1539:1: ( ( ( rule__Normativa__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1540:1: ( ( rule__Normativa__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1540:1: ( ( rule__Normativa__Alternatives_0 ) )
            // InternalLegisFacile.g:1541:2: ( rule__Normativa__Alternatives_0 )
            {
             before(grammarAccess.getNormativaAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1542:2: ( rule__Normativa__Alternatives_0 )
            // InternalLegisFacile.g:1542:3: rule__Normativa__Alternatives_0
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
    // InternalLegisFacile.g:1550:1: rule__Normativa__Group__1 : rule__Normativa__Group__1__Impl rule__Normativa__Group__2 ;
    public final void rule__Normativa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1554:1: ( rule__Normativa__Group__1__Impl rule__Normativa__Group__2 )
            // InternalLegisFacile.g:1555:2: rule__Normativa__Group__1__Impl rule__Normativa__Group__2
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
    // InternalLegisFacile.g:1562:1: rule__Normativa__Group__1__Impl : ( '{' ) ;
    public final void rule__Normativa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1566:1: ( ( '{' ) )
            // InternalLegisFacile.g:1567:1: ( '{' )
            {
            // InternalLegisFacile.g:1567:1: ( '{' )
            // InternalLegisFacile.g:1568:2: '{'
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
    // InternalLegisFacile.g:1577:1: rule__Normativa__Group__2 : rule__Normativa__Group__2__Impl rule__Normativa__Group__3 ;
    public final void rule__Normativa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1581:1: ( rule__Normativa__Group__2__Impl rule__Normativa__Group__3 )
            // InternalLegisFacile.g:1582:2: rule__Normativa__Group__2__Impl rule__Normativa__Group__3
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
    // InternalLegisFacile.g:1589:1: rule__Normativa__Group__2__Impl : ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) ) ;
    public final void rule__Normativa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1593:1: ( ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) ) )
            // InternalLegisFacile.g:1594:1: ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) )
            {
            // InternalLegisFacile.g:1594:1: ( ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* ) )
            // InternalLegisFacile.g:1595:2: ( ( rule__Normativa__ArtigosAssignment_2 ) ) ( ( rule__Normativa__ArtigosAssignment_2 )* )
            {
            // InternalLegisFacile.g:1595:2: ( ( rule__Normativa__ArtigosAssignment_2 ) )
            // InternalLegisFacile.g:1596:3: ( rule__Normativa__ArtigosAssignment_2 )
            {
             before(grammarAccess.getNormativaAccess().getArtigosAssignment_2()); 
            // InternalLegisFacile.g:1597:3: ( rule__Normativa__ArtigosAssignment_2 )
            // InternalLegisFacile.g:1597:4: rule__Normativa__ArtigosAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__Normativa__ArtigosAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNormativaAccess().getArtigosAssignment_2()); 

            }

            // InternalLegisFacile.g:1600:2: ( ( rule__Normativa__ArtigosAssignment_2 )* )
            // InternalLegisFacile.g:1601:3: ( rule__Normativa__ArtigosAssignment_2 )*
            {
             before(grammarAccess.getNormativaAccess().getArtigosAssignment_2()); 
            // InternalLegisFacile.g:1602:3: ( rule__Normativa__ArtigosAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=21 && LA18_0<=22)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLegisFacile.g:1602:4: rule__Normativa__ArtigosAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Normativa__ArtigosAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalLegisFacile.g:1611:1: rule__Normativa__Group__3 : rule__Normativa__Group__3__Impl ;
    public final void rule__Normativa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1615:1: ( rule__Normativa__Group__3__Impl )
            // InternalLegisFacile.g:1616:2: rule__Normativa__Group__3__Impl
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
    // InternalLegisFacile.g:1622:1: rule__Normativa__Group__3__Impl : ( '}' ) ;
    public final void rule__Normativa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1626:1: ( ( '}' ) )
            // InternalLegisFacile.g:1627:1: ( '}' )
            {
            // InternalLegisFacile.g:1627:1: ( '}' )
            // InternalLegisFacile.g:1628:2: '}'
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
    // InternalLegisFacile.g:1638:1: rule__Artigo__Group__0 : rule__Artigo__Group__0__Impl rule__Artigo__Group__1 ;
    public final void rule__Artigo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1642:1: ( rule__Artigo__Group__0__Impl rule__Artigo__Group__1 )
            // InternalLegisFacile.g:1643:2: rule__Artigo__Group__0__Impl rule__Artigo__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalLegisFacile.g:1650:1: rule__Artigo__Group__0__Impl : ( ( rule__Artigo__Alternatives_0 ) ) ;
    public final void rule__Artigo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1654:1: ( ( ( rule__Artigo__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1655:1: ( ( rule__Artigo__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1655:1: ( ( rule__Artigo__Alternatives_0 ) )
            // InternalLegisFacile.g:1656:2: ( rule__Artigo__Alternatives_0 )
            {
             before(grammarAccess.getArtigoAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1657:2: ( rule__Artigo__Alternatives_0 )
            // InternalLegisFacile.g:1657:3: rule__Artigo__Alternatives_0
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
    // InternalLegisFacile.g:1665:1: rule__Artigo__Group__1 : rule__Artigo__Group__1__Impl rule__Artigo__Group__2 ;
    public final void rule__Artigo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1669:1: ( rule__Artigo__Group__1__Impl rule__Artigo__Group__2 )
            // InternalLegisFacile.g:1670:2: rule__Artigo__Group__1__Impl rule__Artigo__Group__2
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
    // InternalLegisFacile.g:1677:1: rule__Artigo__Group__1__Impl : ( ( rule__Artigo__Group_1__0 )? ) ;
    public final void rule__Artigo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1681:1: ( ( ( rule__Artigo__Group_1__0 )? ) )
            // InternalLegisFacile.g:1682:1: ( ( rule__Artigo__Group_1__0 )? )
            {
            // InternalLegisFacile.g:1682:1: ( ( rule__Artigo__Group_1__0 )? )
            // InternalLegisFacile.g:1683:2: ( rule__Artigo__Group_1__0 )?
            {
             before(grammarAccess.getArtigoAccess().getGroup_1()); 
            // InternalLegisFacile.g:1684:2: ( rule__Artigo__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLegisFacile.g:1684:3: rule__Artigo__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Artigo__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArtigoAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalLegisFacile.g:1692:1: rule__Artigo__Group__2 : rule__Artigo__Group__2__Impl rule__Artigo__Group__3 ;
    public final void rule__Artigo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1696:1: ( rule__Artigo__Group__2__Impl rule__Artigo__Group__3 )
            // InternalLegisFacile.g:1697:2: rule__Artigo__Group__2__Impl rule__Artigo__Group__3
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
    // InternalLegisFacile.g:1704:1: rule__Artigo__Group__2__Impl : ( '{' ) ;
    public final void rule__Artigo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1708:1: ( ( '{' ) )
            // InternalLegisFacile.g:1709:1: ( '{' )
            {
            // InternalLegisFacile.g:1709:1: ( '{' )
            // InternalLegisFacile.g:1710:2: '{'
            {
             before(grammarAccess.getArtigoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getArtigoAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalLegisFacile.g:1719:1: rule__Artigo__Group__3 : rule__Artigo__Group__3__Impl rule__Artigo__Group__4 ;
    public final void rule__Artigo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1723:1: ( rule__Artigo__Group__3__Impl rule__Artigo__Group__4 )
            // InternalLegisFacile.g:1724:2: rule__Artigo__Group__3__Impl rule__Artigo__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalLegisFacile.g:1731:1: rule__Artigo__Group__3__Impl : ( ( rule__Artigo__CaputAssignment_3 ) ) ;
    public final void rule__Artigo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1735:1: ( ( ( rule__Artigo__CaputAssignment_3 ) ) )
            // InternalLegisFacile.g:1736:1: ( ( rule__Artigo__CaputAssignment_3 ) )
            {
            // InternalLegisFacile.g:1736:1: ( ( rule__Artigo__CaputAssignment_3 ) )
            // InternalLegisFacile.g:1737:2: ( rule__Artigo__CaputAssignment_3 )
            {
             before(grammarAccess.getArtigoAccess().getCaputAssignment_3()); 
            // InternalLegisFacile.g:1738:2: ( rule__Artigo__CaputAssignment_3 )
            // InternalLegisFacile.g:1738:3: rule__Artigo__CaputAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Artigo__CaputAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArtigoAccess().getCaputAssignment_3()); 

            }


            }

        }
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
    // InternalLegisFacile.g:1746:1: rule__Artigo__Group__4 : rule__Artigo__Group__4__Impl rule__Artigo__Group__5 ;
    public final void rule__Artigo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1750:1: ( rule__Artigo__Group__4__Impl rule__Artigo__Group__5 )
            // InternalLegisFacile.g:1751:2: rule__Artigo__Group__4__Impl rule__Artigo__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalLegisFacile.g:1758:1: rule__Artigo__Group__4__Impl : ( ( rule__Artigo__ParagrafosAssignment_4 )* ) ;
    public final void rule__Artigo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1762:1: ( ( ( rule__Artigo__ParagrafosAssignment_4 )* ) )
            // InternalLegisFacile.g:1763:1: ( ( rule__Artigo__ParagrafosAssignment_4 )* )
            {
            // InternalLegisFacile.g:1763:1: ( ( rule__Artigo__ParagrafosAssignment_4 )* )
            // InternalLegisFacile.g:1764:2: ( rule__Artigo__ParagrafosAssignment_4 )*
            {
             before(grammarAccess.getArtigoAccess().getParagrafosAssignment_4()); 
            // InternalLegisFacile.g:1765:2: ( rule__Artigo__ParagrafosAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=25 && LA20_0<=26)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLegisFacile.g:1765:3: rule__Artigo__ParagrafosAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Artigo__ParagrafosAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getArtigoAccess().getParagrafosAssignment_4()); 

            }


            }

        }
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
    // InternalLegisFacile.g:1773:1: rule__Artigo__Group__5 : rule__Artigo__Group__5__Impl ;
    public final void rule__Artigo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1777:1: ( rule__Artigo__Group__5__Impl )
            // InternalLegisFacile.g:1778:2: rule__Artigo__Group__5__Impl
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
    // InternalLegisFacile.g:1784:1: rule__Artigo__Group__5__Impl : ( '}' ) ;
    public final void rule__Artigo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1788:1: ( ( '}' ) )
            // InternalLegisFacile.g:1789:1: ( '}' )
            {
            // InternalLegisFacile.g:1789:1: ( '}' )
            // InternalLegisFacile.g:1790:2: '}'
            {
             before(grammarAccess.getArtigoAccess().getRightCurlyBracketKeyword_5()); 
            match(input,41,FOLLOW_2); 
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


    // $ANTLR start "rule__Artigo__Group_1__0"
    // InternalLegisFacile.g:1800:1: rule__Artigo__Group_1__0 : rule__Artigo__Group_1__0__Impl rule__Artigo__Group_1__1 ;
    public final void rule__Artigo__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1804:1: ( rule__Artigo__Group_1__0__Impl rule__Artigo__Group_1__1 )
            // InternalLegisFacile.g:1805:2: rule__Artigo__Group_1__0__Impl rule__Artigo__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Artigo__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artigo__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group_1__0"


    // $ANTLR start "rule__Artigo__Group_1__0__Impl"
    // InternalLegisFacile.g:1812:1: rule__Artigo__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Artigo__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1816:1: ( ( '(' ) )
            // InternalLegisFacile.g:1817:1: ( '(' )
            {
            // InternalLegisFacile.g:1817:1: ( '(' )
            // InternalLegisFacile.g:1818:2: '('
            {
             before(grammarAccess.getArtigoAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getArtigoAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group_1__0__Impl"


    // $ANTLR start "rule__Artigo__Group_1__1"
    // InternalLegisFacile.g:1827:1: rule__Artigo__Group_1__1 : rule__Artigo__Group_1__1__Impl rule__Artigo__Group_1__2 ;
    public final void rule__Artigo__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1831:1: ( rule__Artigo__Group_1__1__Impl rule__Artigo__Group_1__2 )
            // InternalLegisFacile.g:1832:2: rule__Artigo__Group_1__1__Impl rule__Artigo__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Artigo__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artigo__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group_1__1"


    // $ANTLR start "rule__Artigo__Group_1__1__Impl"
    // InternalLegisFacile.g:1839:1: rule__Artigo__Group_1__1__Impl : ( ( rule__Artigo__LabelAssignment_1_1 ) ) ;
    public final void rule__Artigo__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1843:1: ( ( ( rule__Artigo__LabelAssignment_1_1 ) ) )
            // InternalLegisFacile.g:1844:1: ( ( rule__Artigo__LabelAssignment_1_1 ) )
            {
            // InternalLegisFacile.g:1844:1: ( ( rule__Artigo__LabelAssignment_1_1 ) )
            // InternalLegisFacile.g:1845:2: ( rule__Artigo__LabelAssignment_1_1 )
            {
             before(grammarAccess.getArtigoAccess().getLabelAssignment_1_1()); 
            // InternalLegisFacile.g:1846:2: ( rule__Artigo__LabelAssignment_1_1 )
            // InternalLegisFacile.g:1846:3: rule__Artigo__LabelAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Artigo__LabelAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArtigoAccess().getLabelAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group_1__1__Impl"


    // $ANTLR start "rule__Artigo__Group_1__2"
    // InternalLegisFacile.g:1854:1: rule__Artigo__Group_1__2 : rule__Artigo__Group_1__2__Impl ;
    public final void rule__Artigo__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1858:1: ( rule__Artigo__Group_1__2__Impl )
            // InternalLegisFacile.g:1859:2: rule__Artigo__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Artigo__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group_1__2"


    // $ANTLR start "rule__Artigo__Group_1__2__Impl"
    // InternalLegisFacile.g:1865:1: rule__Artigo__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Artigo__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1869:1: ( ( ')' ) )
            // InternalLegisFacile.g:1870:1: ( ')' )
            {
            // InternalLegisFacile.g:1870:1: ( ')' )
            // InternalLegisFacile.g:1871:2: ')'
            {
             before(grammarAccess.getArtigoAccess().getRightParenthesisKeyword_1_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getArtigoAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__Group_1__2__Impl"


    // $ANTLR start "rule__Caput__Group__0"
    // InternalLegisFacile.g:1881:1: rule__Caput__Group__0 : rule__Caput__Group__0__Impl rule__Caput__Group__1 ;
    public final void rule__Caput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1885:1: ( rule__Caput__Group__0__Impl rule__Caput__Group__1 )
            // InternalLegisFacile.g:1886:2: rule__Caput__Group__0__Impl rule__Caput__Group__1
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
    // InternalLegisFacile.g:1893:1: rule__Caput__Group__0__Impl : ( ( rule__Caput__Alternatives_0 ) ) ;
    public final void rule__Caput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1897:1: ( ( ( rule__Caput__Alternatives_0 ) ) )
            // InternalLegisFacile.g:1898:1: ( ( rule__Caput__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:1898:1: ( ( rule__Caput__Alternatives_0 ) )
            // InternalLegisFacile.g:1899:2: ( rule__Caput__Alternatives_0 )
            {
             before(grammarAccess.getCaputAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:1900:2: ( rule__Caput__Alternatives_0 )
            // InternalLegisFacile.g:1900:3: rule__Caput__Alternatives_0
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
    // InternalLegisFacile.g:1908:1: rule__Caput__Group__1 : rule__Caput__Group__1__Impl rule__Caput__Group__2 ;
    public final void rule__Caput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1912:1: ( rule__Caput__Group__1__Impl rule__Caput__Group__2 )
            // InternalLegisFacile.g:1913:2: rule__Caput__Group__1__Impl rule__Caput__Group__2
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
    // InternalLegisFacile.g:1920:1: rule__Caput__Group__1__Impl : ( '(' ) ;
    public final void rule__Caput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1924:1: ( ( '(' ) )
            // InternalLegisFacile.g:1925:1: ( '(' )
            {
            // InternalLegisFacile.g:1925:1: ( '(' )
            // InternalLegisFacile.g:1926:2: '('
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
    // InternalLegisFacile.g:1935:1: rule__Caput__Group__2 : rule__Caput__Group__2__Impl rule__Caput__Group__3 ;
    public final void rule__Caput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1939:1: ( rule__Caput__Group__2__Impl rule__Caput__Group__3 )
            // InternalLegisFacile.g:1940:2: rule__Caput__Group__2__Impl rule__Caput__Group__3
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
    // InternalLegisFacile.g:1947:1: rule__Caput__Group__2__Impl : ( ( rule__Caput__TextoAssignment_2 ) ) ;
    public final void rule__Caput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1951:1: ( ( ( rule__Caput__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:1952:1: ( ( rule__Caput__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:1952:1: ( ( rule__Caput__TextoAssignment_2 ) )
            // InternalLegisFacile.g:1953:2: ( rule__Caput__TextoAssignment_2 )
            {
             before(grammarAccess.getCaputAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:1954:2: ( rule__Caput__TextoAssignment_2 )
            // InternalLegisFacile.g:1954:3: rule__Caput__TextoAssignment_2
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
    // InternalLegisFacile.g:1962:1: rule__Caput__Group__3 : rule__Caput__Group__3__Impl rule__Caput__Group__4 ;
    public final void rule__Caput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1966:1: ( rule__Caput__Group__3__Impl rule__Caput__Group__4 )
            // InternalLegisFacile.g:1967:2: rule__Caput__Group__3__Impl rule__Caput__Group__4
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
    // InternalLegisFacile.g:1974:1: rule__Caput__Group__3__Impl : ( ')' ) ;
    public final void rule__Caput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1978:1: ( ( ')' ) )
            // InternalLegisFacile.g:1979:1: ( ')' )
            {
            // InternalLegisFacile.g:1979:1: ( ')' )
            // InternalLegisFacile.g:1980:2: ')'
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
    // InternalLegisFacile.g:1989:1: rule__Caput__Group__4 : rule__Caput__Group__4__Impl ;
    public final void rule__Caput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:1993:1: ( rule__Caput__Group__4__Impl )
            // InternalLegisFacile.g:1994:2: rule__Caput__Group__4__Impl
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
    // InternalLegisFacile.g:2000:1: rule__Caput__Group__4__Impl : ( ( rule__Caput__Group_4__0 )? ) ;
    public final void rule__Caput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2004:1: ( ( ( rule__Caput__Group_4__0 )? ) )
            // InternalLegisFacile.g:2005:1: ( ( rule__Caput__Group_4__0 )? )
            {
            // InternalLegisFacile.g:2005:1: ( ( rule__Caput__Group_4__0 )? )
            // InternalLegisFacile.g:2006:2: ( rule__Caput__Group_4__0 )?
            {
             before(grammarAccess.getCaputAccess().getGroup_4()); 
            // InternalLegisFacile.g:2007:2: ( rule__Caput__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLegisFacile.g:2007:3: rule__Caput__Group_4__0
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
    // InternalLegisFacile.g:2016:1: rule__Caput__Group_4__0 : rule__Caput__Group_4__0__Impl rule__Caput__Group_4__1 ;
    public final void rule__Caput__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2020:1: ( rule__Caput__Group_4__0__Impl rule__Caput__Group_4__1 )
            // InternalLegisFacile.g:2021:2: rule__Caput__Group_4__0__Impl rule__Caput__Group_4__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalLegisFacile.g:2028:1: rule__Caput__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Caput__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2032:1: ( ( '{' ) )
            // InternalLegisFacile.g:2033:1: ( '{' )
            {
            // InternalLegisFacile.g:2033:1: ( '{' )
            // InternalLegisFacile.g:2034:2: '{'
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
    // InternalLegisFacile.g:2043:1: rule__Caput__Group_4__1 : rule__Caput__Group_4__1__Impl rule__Caput__Group_4__2 ;
    public final void rule__Caput__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2047:1: ( rule__Caput__Group_4__1__Impl rule__Caput__Group_4__2 )
            // InternalLegisFacile.g:2048:2: rule__Caput__Group_4__1__Impl rule__Caput__Group_4__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalLegisFacile.g:2055:1: rule__Caput__Group_4__1__Impl : ( ( rule__Caput__IncisosAssignment_4_1 )* ) ;
    public final void rule__Caput__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2059:1: ( ( ( rule__Caput__IncisosAssignment_4_1 )* ) )
            // InternalLegisFacile.g:2060:1: ( ( rule__Caput__IncisosAssignment_4_1 )* )
            {
            // InternalLegisFacile.g:2060:1: ( ( rule__Caput__IncisosAssignment_4_1 )* )
            // InternalLegisFacile.g:2061:2: ( rule__Caput__IncisosAssignment_4_1 )*
            {
             before(grammarAccess.getCaputAccess().getIncisosAssignment_4_1()); 
            // InternalLegisFacile.g:2062:2: ( rule__Caput__IncisosAssignment_4_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=27 && LA22_0<=28)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLegisFacile.g:2062:3: rule__Caput__IncisosAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalLegisFacile.g:2070:1: rule__Caput__Group_4__2 : rule__Caput__Group_4__2__Impl ;
    public final void rule__Caput__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2074:1: ( rule__Caput__Group_4__2__Impl )
            // InternalLegisFacile.g:2075:2: rule__Caput__Group_4__2__Impl
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
    // InternalLegisFacile.g:2081:1: rule__Caput__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Caput__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2085:1: ( ( '}' ) )
            // InternalLegisFacile.g:2086:1: ( '}' )
            {
            // InternalLegisFacile.g:2086:1: ( '}' )
            // InternalLegisFacile.g:2087:2: '}'
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
    // InternalLegisFacile.g:2097:1: rule__Paragrafo__Group__0 : rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1 ;
    public final void rule__Paragrafo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2101:1: ( rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1 )
            // InternalLegisFacile.g:2102:2: rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1
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
    // InternalLegisFacile.g:2109:1: rule__Paragrafo__Group__0__Impl : ( ( rule__Paragrafo__Alternatives_0 ) ) ;
    public final void rule__Paragrafo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2113:1: ( ( ( rule__Paragrafo__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2114:1: ( ( rule__Paragrafo__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2114:1: ( ( rule__Paragrafo__Alternatives_0 ) )
            // InternalLegisFacile.g:2115:2: ( rule__Paragrafo__Alternatives_0 )
            {
             before(grammarAccess.getParagrafoAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2116:2: ( rule__Paragrafo__Alternatives_0 )
            // InternalLegisFacile.g:2116:3: rule__Paragrafo__Alternatives_0
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
    // InternalLegisFacile.g:2124:1: rule__Paragrafo__Group__1 : rule__Paragrafo__Group__1__Impl rule__Paragrafo__Group__2 ;
    public final void rule__Paragrafo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2128:1: ( rule__Paragrafo__Group__1__Impl rule__Paragrafo__Group__2 )
            // InternalLegisFacile.g:2129:2: rule__Paragrafo__Group__1__Impl rule__Paragrafo__Group__2
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
    // InternalLegisFacile.g:2136:1: rule__Paragrafo__Group__1__Impl : ( '(' ) ;
    public final void rule__Paragrafo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2140:1: ( ( '(' ) )
            // InternalLegisFacile.g:2141:1: ( '(' )
            {
            // InternalLegisFacile.g:2141:1: ( '(' )
            // InternalLegisFacile.g:2142:2: '('
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
    // InternalLegisFacile.g:2151:1: rule__Paragrafo__Group__2 : rule__Paragrafo__Group__2__Impl rule__Paragrafo__Group__3 ;
    public final void rule__Paragrafo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2155:1: ( rule__Paragrafo__Group__2__Impl rule__Paragrafo__Group__3 )
            // InternalLegisFacile.g:2156:2: rule__Paragrafo__Group__2__Impl rule__Paragrafo__Group__3
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
    // InternalLegisFacile.g:2163:1: rule__Paragrafo__Group__2__Impl : ( ( rule__Paragrafo__TextoAssignment_2 ) ) ;
    public final void rule__Paragrafo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2167:1: ( ( ( rule__Paragrafo__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:2168:1: ( ( rule__Paragrafo__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:2168:1: ( ( rule__Paragrafo__TextoAssignment_2 ) )
            // InternalLegisFacile.g:2169:2: ( rule__Paragrafo__TextoAssignment_2 )
            {
             before(grammarAccess.getParagrafoAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:2170:2: ( rule__Paragrafo__TextoAssignment_2 )
            // InternalLegisFacile.g:2170:3: rule__Paragrafo__TextoAssignment_2
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
    // InternalLegisFacile.g:2178:1: rule__Paragrafo__Group__3 : rule__Paragrafo__Group__3__Impl rule__Paragrafo__Group__4 ;
    public final void rule__Paragrafo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2182:1: ( rule__Paragrafo__Group__3__Impl rule__Paragrafo__Group__4 )
            // InternalLegisFacile.g:2183:2: rule__Paragrafo__Group__3__Impl rule__Paragrafo__Group__4
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
    // InternalLegisFacile.g:2190:1: rule__Paragrafo__Group__3__Impl : ( ')' ) ;
    public final void rule__Paragrafo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2194:1: ( ( ')' ) )
            // InternalLegisFacile.g:2195:1: ( ')' )
            {
            // InternalLegisFacile.g:2195:1: ( ')' )
            // InternalLegisFacile.g:2196:2: ')'
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
    // InternalLegisFacile.g:2205:1: rule__Paragrafo__Group__4 : rule__Paragrafo__Group__4__Impl ;
    public final void rule__Paragrafo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2209:1: ( rule__Paragrafo__Group__4__Impl )
            // InternalLegisFacile.g:2210:2: rule__Paragrafo__Group__4__Impl
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
    // InternalLegisFacile.g:2216:1: rule__Paragrafo__Group__4__Impl : ( ( rule__Paragrafo__Group_4__0 )? ) ;
    public final void rule__Paragrafo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2220:1: ( ( ( rule__Paragrafo__Group_4__0 )? ) )
            // InternalLegisFacile.g:2221:1: ( ( rule__Paragrafo__Group_4__0 )? )
            {
            // InternalLegisFacile.g:2221:1: ( ( rule__Paragrafo__Group_4__0 )? )
            // InternalLegisFacile.g:2222:2: ( rule__Paragrafo__Group_4__0 )?
            {
             before(grammarAccess.getParagrafoAccess().getGroup_4()); 
            // InternalLegisFacile.g:2223:2: ( rule__Paragrafo__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLegisFacile.g:2223:3: rule__Paragrafo__Group_4__0
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
    // InternalLegisFacile.g:2232:1: rule__Paragrafo__Group_4__0 : rule__Paragrafo__Group_4__0__Impl rule__Paragrafo__Group_4__1 ;
    public final void rule__Paragrafo__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2236:1: ( rule__Paragrafo__Group_4__0__Impl rule__Paragrafo__Group_4__1 )
            // InternalLegisFacile.g:2237:2: rule__Paragrafo__Group_4__0__Impl rule__Paragrafo__Group_4__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalLegisFacile.g:2244:1: rule__Paragrafo__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Paragrafo__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2248:1: ( ( '{' ) )
            // InternalLegisFacile.g:2249:1: ( '{' )
            {
            // InternalLegisFacile.g:2249:1: ( '{' )
            // InternalLegisFacile.g:2250:2: '{'
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
    // InternalLegisFacile.g:2259:1: rule__Paragrafo__Group_4__1 : rule__Paragrafo__Group_4__1__Impl rule__Paragrafo__Group_4__2 ;
    public final void rule__Paragrafo__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2263:1: ( rule__Paragrafo__Group_4__1__Impl rule__Paragrafo__Group_4__2 )
            // InternalLegisFacile.g:2264:2: rule__Paragrafo__Group_4__1__Impl rule__Paragrafo__Group_4__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalLegisFacile.g:2271:1: rule__Paragrafo__Group_4__1__Impl : ( ( rule__Paragrafo__IncisosAssignment_4_1 )* ) ;
    public final void rule__Paragrafo__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2275:1: ( ( ( rule__Paragrafo__IncisosAssignment_4_1 )* ) )
            // InternalLegisFacile.g:2276:1: ( ( rule__Paragrafo__IncisosAssignment_4_1 )* )
            {
            // InternalLegisFacile.g:2276:1: ( ( rule__Paragrafo__IncisosAssignment_4_1 )* )
            // InternalLegisFacile.g:2277:2: ( rule__Paragrafo__IncisosAssignment_4_1 )*
            {
             before(grammarAccess.getParagrafoAccess().getIncisosAssignment_4_1()); 
            // InternalLegisFacile.g:2278:2: ( rule__Paragrafo__IncisosAssignment_4_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=27 && LA24_0<=28)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalLegisFacile.g:2278:3: rule__Paragrafo__IncisosAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalLegisFacile.g:2286:1: rule__Paragrafo__Group_4__2 : rule__Paragrafo__Group_4__2__Impl ;
    public final void rule__Paragrafo__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2290:1: ( rule__Paragrafo__Group_4__2__Impl )
            // InternalLegisFacile.g:2291:2: rule__Paragrafo__Group_4__2__Impl
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
    // InternalLegisFacile.g:2297:1: rule__Paragrafo__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Paragrafo__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2301:1: ( ( '}' ) )
            // InternalLegisFacile.g:2302:1: ( '}' )
            {
            // InternalLegisFacile.g:2302:1: ( '}' )
            // InternalLegisFacile.g:2303:2: '}'
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
    // InternalLegisFacile.g:2313:1: rule__Inciso__Group__0 : rule__Inciso__Group__0__Impl rule__Inciso__Group__1 ;
    public final void rule__Inciso__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2317:1: ( rule__Inciso__Group__0__Impl rule__Inciso__Group__1 )
            // InternalLegisFacile.g:2318:2: rule__Inciso__Group__0__Impl rule__Inciso__Group__1
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
    // InternalLegisFacile.g:2325:1: rule__Inciso__Group__0__Impl : ( ( rule__Inciso__Alternatives_0 ) ) ;
    public final void rule__Inciso__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2329:1: ( ( ( rule__Inciso__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2330:1: ( ( rule__Inciso__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2330:1: ( ( rule__Inciso__Alternatives_0 ) )
            // InternalLegisFacile.g:2331:2: ( rule__Inciso__Alternatives_0 )
            {
             before(grammarAccess.getIncisoAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2332:2: ( rule__Inciso__Alternatives_0 )
            // InternalLegisFacile.g:2332:3: rule__Inciso__Alternatives_0
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
    // InternalLegisFacile.g:2340:1: rule__Inciso__Group__1 : rule__Inciso__Group__1__Impl rule__Inciso__Group__2 ;
    public final void rule__Inciso__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2344:1: ( rule__Inciso__Group__1__Impl rule__Inciso__Group__2 )
            // InternalLegisFacile.g:2345:2: rule__Inciso__Group__1__Impl rule__Inciso__Group__2
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
    // InternalLegisFacile.g:2352:1: rule__Inciso__Group__1__Impl : ( '(' ) ;
    public final void rule__Inciso__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2356:1: ( ( '(' ) )
            // InternalLegisFacile.g:2357:1: ( '(' )
            {
            // InternalLegisFacile.g:2357:1: ( '(' )
            // InternalLegisFacile.g:2358:2: '('
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
    // InternalLegisFacile.g:2367:1: rule__Inciso__Group__2 : rule__Inciso__Group__2__Impl rule__Inciso__Group__3 ;
    public final void rule__Inciso__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2371:1: ( rule__Inciso__Group__2__Impl rule__Inciso__Group__3 )
            // InternalLegisFacile.g:2372:2: rule__Inciso__Group__2__Impl rule__Inciso__Group__3
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
    // InternalLegisFacile.g:2379:1: rule__Inciso__Group__2__Impl : ( ( rule__Inciso__TextoAssignment_2 ) ) ;
    public final void rule__Inciso__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2383:1: ( ( ( rule__Inciso__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:2384:1: ( ( rule__Inciso__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:2384:1: ( ( rule__Inciso__TextoAssignment_2 ) )
            // InternalLegisFacile.g:2385:2: ( rule__Inciso__TextoAssignment_2 )
            {
             before(grammarAccess.getIncisoAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:2386:2: ( rule__Inciso__TextoAssignment_2 )
            // InternalLegisFacile.g:2386:3: rule__Inciso__TextoAssignment_2
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
    // InternalLegisFacile.g:2394:1: rule__Inciso__Group__3 : rule__Inciso__Group__3__Impl rule__Inciso__Group__4 ;
    public final void rule__Inciso__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2398:1: ( rule__Inciso__Group__3__Impl rule__Inciso__Group__4 )
            // InternalLegisFacile.g:2399:2: rule__Inciso__Group__3__Impl rule__Inciso__Group__4
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
    // InternalLegisFacile.g:2406:1: rule__Inciso__Group__3__Impl : ( ')' ) ;
    public final void rule__Inciso__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2410:1: ( ( ')' ) )
            // InternalLegisFacile.g:2411:1: ( ')' )
            {
            // InternalLegisFacile.g:2411:1: ( ')' )
            // InternalLegisFacile.g:2412:2: ')'
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
    // InternalLegisFacile.g:2421:1: rule__Inciso__Group__4 : rule__Inciso__Group__4__Impl ;
    public final void rule__Inciso__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2425:1: ( rule__Inciso__Group__4__Impl )
            // InternalLegisFacile.g:2426:2: rule__Inciso__Group__4__Impl
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
    // InternalLegisFacile.g:2432:1: rule__Inciso__Group__4__Impl : ( ( rule__Inciso__Group_4__0 )? ) ;
    public final void rule__Inciso__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2436:1: ( ( ( rule__Inciso__Group_4__0 )? ) )
            // InternalLegisFacile.g:2437:1: ( ( rule__Inciso__Group_4__0 )? )
            {
            // InternalLegisFacile.g:2437:1: ( ( rule__Inciso__Group_4__0 )? )
            // InternalLegisFacile.g:2438:2: ( rule__Inciso__Group_4__0 )?
            {
             before(grammarAccess.getIncisoAccess().getGroup_4()); 
            // InternalLegisFacile.g:2439:2: ( rule__Inciso__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLegisFacile.g:2439:3: rule__Inciso__Group_4__0
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
    // InternalLegisFacile.g:2448:1: rule__Inciso__Group_4__0 : rule__Inciso__Group_4__0__Impl rule__Inciso__Group_4__1 ;
    public final void rule__Inciso__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2452:1: ( rule__Inciso__Group_4__0__Impl rule__Inciso__Group_4__1 )
            // InternalLegisFacile.g:2453:2: rule__Inciso__Group_4__0__Impl rule__Inciso__Group_4__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalLegisFacile.g:2460:1: rule__Inciso__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Inciso__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2464:1: ( ( '{' ) )
            // InternalLegisFacile.g:2465:1: ( '{' )
            {
            // InternalLegisFacile.g:2465:1: ( '{' )
            // InternalLegisFacile.g:2466:2: '{'
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
    // InternalLegisFacile.g:2475:1: rule__Inciso__Group_4__1 : rule__Inciso__Group_4__1__Impl rule__Inciso__Group_4__2 ;
    public final void rule__Inciso__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2479:1: ( rule__Inciso__Group_4__1__Impl rule__Inciso__Group_4__2 )
            // InternalLegisFacile.g:2480:2: rule__Inciso__Group_4__1__Impl rule__Inciso__Group_4__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalLegisFacile.g:2487:1: rule__Inciso__Group_4__1__Impl : ( ( rule__Inciso__AlineasAssignment_4_1 )* ) ;
    public final void rule__Inciso__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2491:1: ( ( ( rule__Inciso__AlineasAssignment_4_1 )* ) )
            // InternalLegisFacile.g:2492:1: ( ( rule__Inciso__AlineasAssignment_4_1 )* )
            {
            // InternalLegisFacile.g:2492:1: ( ( rule__Inciso__AlineasAssignment_4_1 )* )
            // InternalLegisFacile.g:2493:2: ( rule__Inciso__AlineasAssignment_4_1 )*
            {
             before(grammarAccess.getIncisoAccess().getAlineasAssignment_4_1()); 
            // InternalLegisFacile.g:2494:2: ( rule__Inciso__AlineasAssignment_4_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=29 && LA26_0<=30)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalLegisFacile.g:2494:3: rule__Inciso__AlineasAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_25);
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
    // InternalLegisFacile.g:2502:1: rule__Inciso__Group_4__2 : rule__Inciso__Group_4__2__Impl ;
    public final void rule__Inciso__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2506:1: ( rule__Inciso__Group_4__2__Impl )
            // InternalLegisFacile.g:2507:2: rule__Inciso__Group_4__2__Impl
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
    // InternalLegisFacile.g:2513:1: rule__Inciso__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Inciso__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2517:1: ( ( '}' ) )
            // InternalLegisFacile.g:2518:1: ( '}' )
            {
            // InternalLegisFacile.g:2518:1: ( '}' )
            // InternalLegisFacile.g:2519:2: '}'
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
    // InternalLegisFacile.g:2529:1: rule__Alinea__Group__0 : rule__Alinea__Group__0__Impl rule__Alinea__Group__1 ;
    public final void rule__Alinea__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2533:1: ( rule__Alinea__Group__0__Impl rule__Alinea__Group__1 )
            // InternalLegisFacile.g:2534:2: rule__Alinea__Group__0__Impl rule__Alinea__Group__1
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
    // InternalLegisFacile.g:2541:1: rule__Alinea__Group__0__Impl : ( ( rule__Alinea__Alternatives_0 ) ) ;
    public final void rule__Alinea__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2545:1: ( ( ( rule__Alinea__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2546:1: ( ( rule__Alinea__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2546:1: ( ( rule__Alinea__Alternatives_0 ) )
            // InternalLegisFacile.g:2547:2: ( rule__Alinea__Alternatives_0 )
            {
             before(grammarAccess.getAlineaAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2548:2: ( rule__Alinea__Alternatives_0 )
            // InternalLegisFacile.g:2548:3: rule__Alinea__Alternatives_0
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
    // InternalLegisFacile.g:2556:1: rule__Alinea__Group__1 : rule__Alinea__Group__1__Impl rule__Alinea__Group__2 ;
    public final void rule__Alinea__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2560:1: ( rule__Alinea__Group__1__Impl rule__Alinea__Group__2 )
            // InternalLegisFacile.g:2561:2: rule__Alinea__Group__1__Impl rule__Alinea__Group__2
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
    // InternalLegisFacile.g:2568:1: rule__Alinea__Group__1__Impl : ( '(' ) ;
    public final void rule__Alinea__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2572:1: ( ( '(' ) )
            // InternalLegisFacile.g:2573:1: ( '(' )
            {
            // InternalLegisFacile.g:2573:1: ( '(' )
            // InternalLegisFacile.g:2574:2: '('
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
    // InternalLegisFacile.g:2583:1: rule__Alinea__Group__2 : rule__Alinea__Group__2__Impl rule__Alinea__Group__3 ;
    public final void rule__Alinea__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2587:1: ( rule__Alinea__Group__2__Impl rule__Alinea__Group__3 )
            // InternalLegisFacile.g:2588:2: rule__Alinea__Group__2__Impl rule__Alinea__Group__3
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
    // InternalLegisFacile.g:2595:1: rule__Alinea__Group__2__Impl : ( ( rule__Alinea__TextoAssignment_2 ) ) ;
    public final void rule__Alinea__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2599:1: ( ( ( rule__Alinea__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:2600:1: ( ( rule__Alinea__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:2600:1: ( ( rule__Alinea__TextoAssignment_2 ) )
            // InternalLegisFacile.g:2601:2: ( rule__Alinea__TextoAssignment_2 )
            {
             before(grammarAccess.getAlineaAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:2602:2: ( rule__Alinea__TextoAssignment_2 )
            // InternalLegisFacile.g:2602:3: rule__Alinea__TextoAssignment_2
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
    // InternalLegisFacile.g:2610:1: rule__Alinea__Group__3 : rule__Alinea__Group__3__Impl rule__Alinea__Group__4 ;
    public final void rule__Alinea__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2614:1: ( rule__Alinea__Group__3__Impl rule__Alinea__Group__4 )
            // InternalLegisFacile.g:2615:2: rule__Alinea__Group__3__Impl rule__Alinea__Group__4
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
    // InternalLegisFacile.g:2622:1: rule__Alinea__Group__3__Impl : ( ')' ) ;
    public final void rule__Alinea__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2626:1: ( ( ')' ) )
            // InternalLegisFacile.g:2627:1: ( ')' )
            {
            // InternalLegisFacile.g:2627:1: ( ')' )
            // InternalLegisFacile.g:2628:2: ')'
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
    // InternalLegisFacile.g:2637:1: rule__Alinea__Group__4 : rule__Alinea__Group__4__Impl ;
    public final void rule__Alinea__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2641:1: ( rule__Alinea__Group__4__Impl )
            // InternalLegisFacile.g:2642:2: rule__Alinea__Group__4__Impl
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
    // InternalLegisFacile.g:2648:1: rule__Alinea__Group__4__Impl : ( ( rule__Alinea__Group_4__0 )? ) ;
    public final void rule__Alinea__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2652:1: ( ( ( rule__Alinea__Group_4__0 )? ) )
            // InternalLegisFacile.g:2653:1: ( ( rule__Alinea__Group_4__0 )? )
            {
            // InternalLegisFacile.g:2653:1: ( ( rule__Alinea__Group_4__0 )? )
            // InternalLegisFacile.g:2654:2: ( rule__Alinea__Group_4__0 )?
            {
             before(grammarAccess.getAlineaAccess().getGroup_4()); 
            // InternalLegisFacile.g:2655:2: ( rule__Alinea__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalLegisFacile.g:2655:3: rule__Alinea__Group_4__0
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
    // InternalLegisFacile.g:2664:1: rule__Alinea__Group_4__0 : rule__Alinea__Group_4__0__Impl rule__Alinea__Group_4__1 ;
    public final void rule__Alinea__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2668:1: ( rule__Alinea__Group_4__0__Impl rule__Alinea__Group_4__1 )
            // InternalLegisFacile.g:2669:2: rule__Alinea__Group_4__0__Impl rule__Alinea__Group_4__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalLegisFacile.g:2676:1: rule__Alinea__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Alinea__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2680:1: ( ( '{' ) )
            // InternalLegisFacile.g:2681:1: ( '{' )
            {
            // InternalLegisFacile.g:2681:1: ( '{' )
            // InternalLegisFacile.g:2682:2: '{'
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
    // InternalLegisFacile.g:2691:1: rule__Alinea__Group_4__1 : rule__Alinea__Group_4__1__Impl rule__Alinea__Group_4__2 ;
    public final void rule__Alinea__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2695:1: ( rule__Alinea__Group_4__1__Impl rule__Alinea__Group_4__2 )
            // InternalLegisFacile.g:2696:2: rule__Alinea__Group_4__1__Impl rule__Alinea__Group_4__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalLegisFacile.g:2703:1: rule__Alinea__Group_4__1__Impl : ( ( rule__Alinea__ItensAssignment_4_1 )* ) ;
    public final void rule__Alinea__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2707:1: ( ( ( rule__Alinea__ItensAssignment_4_1 )* ) )
            // InternalLegisFacile.g:2708:1: ( ( rule__Alinea__ItensAssignment_4_1 )* )
            {
            // InternalLegisFacile.g:2708:1: ( ( rule__Alinea__ItensAssignment_4_1 )* )
            // InternalLegisFacile.g:2709:2: ( rule__Alinea__ItensAssignment_4_1 )*
            {
             before(grammarAccess.getAlineaAccess().getItensAssignment_4_1()); 
            // InternalLegisFacile.g:2710:2: ( rule__Alinea__ItensAssignment_4_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=31 && LA28_0<=32)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalLegisFacile.g:2710:3: rule__Alinea__ItensAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_27);
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
    // InternalLegisFacile.g:2718:1: rule__Alinea__Group_4__2 : rule__Alinea__Group_4__2__Impl ;
    public final void rule__Alinea__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2722:1: ( rule__Alinea__Group_4__2__Impl )
            // InternalLegisFacile.g:2723:2: rule__Alinea__Group_4__2__Impl
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
    // InternalLegisFacile.g:2729:1: rule__Alinea__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Alinea__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2733:1: ( ( '}' ) )
            // InternalLegisFacile.g:2734:1: ( '}' )
            {
            // InternalLegisFacile.g:2734:1: ( '}' )
            // InternalLegisFacile.g:2735:2: '}'
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
    // InternalLegisFacile.g:2745:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2749:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // InternalLegisFacile.g:2750:2: rule__Item__Group__0__Impl rule__Item__Group__1
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
    // InternalLegisFacile.g:2757:1: rule__Item__Group__0__Impl : ( ( rule__Item__Alternatives_0 ) ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2761:1: ( ( ( rule__Item__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2762:1: ( ( rule__Item__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2762:1: ( ( rule__Item__Alternatives_0 ) )
            // InternalLegisFacile.g:2763:2: ( rule__Item__Alternatives_0 )
            {
             before(grammarAccess.getItemAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2764:2: ( rule__Item__Alternatives_0 )
            // InternalLegisFacile.g:2764:3: rule__Item__Alternatives_0
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
    // InternalLegisFacile.g:2772:1: rule__Item__Group__1 : rule__Item__Group__1__Impl rule__Item__Group__2 ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2776:1: ( rule__Item__Group__1__Impl rule__Item__Group__2 )
            // InternalLegisFacile.g:2777:2: rule__Item__Group__1__Impl rule__Item__Group__2
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
    // InternalLegisFacile.g:2784:1: rule__Item__Group__1__Impl : ( '(' ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2788:1: ( ( '(' ) )
            // InternalLegisFacile.g:2789:1: ( '(' )
            {
            // InternalLegisFacile.g:2789:1: ( '(' )
            // InternalLegisFacile.g:2790:2: '('
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
    // InternalLegisFacile.g:2799:1: rule__Item__Group__2 : rule__Item__Group__2__Impl rule__Item__Group__3 ;
    public final void rule__Item__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2803:1: ( rule__Item__Group__2__Impl rule__Item__Group__3 )
            // InternalLegisFacile.g:2804:2: rule__Item__Group__2__Impl rule__Item__Group__3
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
    // InternalLegisFacile.g:2811:1: rule__Item__Group__2__Impl : ( ( rule__Item__TextoAssignment_2 ) ) ;
    public final void rule__Item__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2815:1: ( ( ( rule__Item__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:2816:1: ( ( rule__Item__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:2816:1: ( ( rule__Item__TextoAssignment_2 ) )
            // InternalLegisFacile.g:2817:2: ( rule__Item__TextoAssignment_2 )
            {
             before(grammarAccess.getItemAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:2818:2: ( rule__Item__TextoAssignment_2 )
            // InternalLegisFacile.g:2818:3: rule__Item__TextoAssignment_2
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
    // InternalLegisFacile.g:2826:1: rule__Item__Group__3 : rule__Item__Group__3__Impl ;
    public final void rule__Item__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2830:1: ( rule__Item__Group__3__Impl )
            // InternalLegisFacile.g:2831:2: rule__Item__Group__3__Impl
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
    // InternalLegisFacile.g:2837:1: rule__Item__Group__3__Impl : ( ')' ) ;
    public final void rule__Item__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2841:1: ( ( ')' ) )
            // InternalLegisFacile.g:2842:1: ( ')' )
            {
            // InternalLegisFacile.g:2842:1: ( ')' )
            // InternalLegisFacile.g:2843:2: ')'
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
    // InternalLegisFacile.g:2853:1: rule__Final__Group__0 : rule__Final__Group__0__Impl rule__Final__Group__1 ;
    public final void rule__Final__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2857:1: ( rule__Final__Group__0__Impl rule__Final__Group__1 )
            // InternalLegisFacile.g:2858:2: rule__Final__Group__0__Impl rule__Final__Group__1
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
    // InternalLegisFacile.g:2865:1: rule__Final__Group__0__Impl : ( ( rule__Final__Alternatives_0 ) ) ;
    public final void rule__Final__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2869:1: ( ( ( rule__Final__Alternatives_0 ) ) )
            // InternalLegisFacile.g:2870:1: ( ( rule__Final__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:2870:1: ( ( rule__Final__Alternatives_0 ) )
            // InternalLegisFacile.g:2871:2: ( rule__Final__Alternatives_0 )
            {
             before(grammarAccess.getFinalAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:2872:2: ( rule__Final__Alternatives_0 )
            // InternalLegisFacile.g:2872:3: rule__Final__Alternatives_0
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
    // InternalLegisFacile.g:2880:1: rule__Final__Group__1 : rule__Final__Group__1__Impl rule__Final__Group__2 ;
    public final void rule__Final__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2884:1: ( rule__Final__Group__1__Impl rule__Final__Group__2 )
            // InternalLegisFacile.g:2885:2: rule__Final__Group__1__Impl rule__Final__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalLegisFacile.g:2892:1: rule__Final__Group__1__Impl : ( '{' ) ;
    public final void rule__Final__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2896:1: ( ( '{' ) )
            // InternalLegisFacile.g:2897:1: ( '{' )
            {
            // InternalLegisFacile.g:2897:1: ( '{' )
            // InternalLegisFacile.g:2898:2: '{'
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
    // InternalLegisFacile.g:2907:1: rule__Final__Group__2 : rule__Final__Group__2__Impl rule__Final__Group__3 ;
    public final void rule__Final__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2911:1: ( rule__Final__Group__2__Impl rule__Final__Group__3 )
            // InternalLegisFacile.g:2912:2: rule__Final__Group__2__Impl rule__Final__Group__3
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
    // InternalLegisFacile.g:2919:1: rule__Final__Group__2__Impl : ( ( rule__Final__Alternatives_2 ) ) ;
    public final void rule__Final__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2923:1: ( ( ( rule__Final__Alternatives_2 ) ) )
            // InternalLegisFacile.g:2924:1: ( ( rule__Final__Alternatives_2 ) )
            {
            // InternalLegisFacile.g:2924:1: ( ( rule__Final__Alternatives_2 ) )
            // InternalLegisFacile.g:2925:2: ( rule__Final__Alternatives_2 )
            {
             before(grammarAccess.getFinalAccess().getAlternatives_2()); 
            // InternalLegisFacile.g:2926:2: ( rule__Final__Alternatives_2 )
            // InternalLegisFacile.g:2926:3: rule__Final__Alternatives_2
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
    // InternalLegisFacile.g:2934:1: rule__Final__Group__3 : rule__Final__Group__3__Impl ;
    public final void rule__Final__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2938:1: ( rule__Final__Group__3__Impl )
            // InternalLegisFacile.g:2939:2: rule__Final__Group__3__Impl
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
    // InternalLegisFacile.g:2945:1: rule__Final__Group__3__Impl : ( '}' ) ;
    public final void rule__Final__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2949:1: ( ( '}' ) )
            // InternalLegisFacile.g:2950:1: ( '}' )
            {
            // InternalLegisFacile.g:2950:1: ( '}' )
            // InternalLegisFacile.g:2951:2: '}'
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
    // InternalLegisFacile.g:2961:1: rule__Final__Group_2_0__0 : rule__Final__Group_2_0__0__Impl rule__Final__Group_2_0__1 ;
    public final void rule__Final__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2965:1: ( rule__Final__Group_2_0__0__Impl rule__Final__Group_2_0__1 )
            // InternalLegisFacile.g:2966:2: rule__Final__Group_2_0__0__Impl rule__Final__Group_2_0__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalLegisFacile.g:2973:1: rule__Final__Group_2_0__0__Impl : ( ( rule__Final__VigenciaAssignment_2_0_0 ) ) ;
    public final void rule__Final__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2977:1: ( ( ( rule__Final__VigenciaAssignment_2_0_0 ) ) )
            // InternalLegisFacile.g:2978:1: ( ( rule__Final__VigenciaAssignment_2_0_0 ) )
            {
            // InternalLegisFacile.g:2978:1: ( ( rule__Final__VigenciaAssignment_2_0_0 ) )
            // InternalLegisFacile.g:2979:2: ( rule__Final__VigenciaAssignment_2_0_0 )
            {
             before(grammarAccess.getFinalAccess().getVigenciaAssignment_2_0_0()); 
            // InternalLegisFacile.g:2980:2: ( rule__Final__VigenciaAssignment_2_0_0 )
            // InternalLegisFacile.g:2980:3: rule__Final__VigenciaAssignment_2_0_0
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
    // InternalLegisFacile.g:2988:1: rule__Final__Group_2_0__1 : rule__Final__Group_2_0__1__Impl ;
    public final void rule__Final__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:2992:1: ( rule__Final__Group_2_0__1__Impl )
            // InternalLegisFacile.g:2993:2: rule__Final__Group_2_0__1__Impl
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
    // InternalLegisFacile.g:2999:1: rule__Final__Group_2_0__1__Impl : ( ( rule__Final__RevogacaoAssignment_2_0_1 )? ) ;
    public final void rule__Final__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3003:1: ( ( ( rule__Final__RevogacaoAssignment_2_0_1 )? ) )
            // InternalLegisFacile.g:3004:1: ( ( rule__Final__RevogacaoAssignment_2_0_1 )? )
            {
            // InternalLegisFacile.g:3004:1: ( ( rule__Final__RevogacaoAssignment_2_0_1 )? )
            // InternalLegisFacile.g:3005:2: ( rule__Final__RevogacaoAssignment_2_0_1 )?
            {
             before(grammarAccess.getFinalAccess().getRevogacaoAssignment_2_0_1()); 
            // InternalLegisFacile.g:3006:2: ( rule__Final__RevogacaoAssignment_2_0_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=37 && LA29_0<=38)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalLegisFacile.g:3006:3: rule__Final__RevogacaoAssignment_2_0_1
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
    // InternalLegisFacile.g:3015:1: rule__Final__Group_2_1__0 : rule__Final__Group_2_1__0__Impl rule__Final__Group_2_1__1 ;
    public final void rule__Final__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3019:1: ( rule__Final__Group_2_1__0__Impl rule__Final__Group_2_1__1 )
            // InternalLegisFacile.g:3020:2: rule__Final__Group_2_1__0__Impl rule__Final__Group_2_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalLegisFacile.g:3027:1: rule__Final__Group_2_1__0__Impl : ( ( rule__Final__RevogacaoAssignment_2_1_0 ) ) ;
    public final void rule__Final__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3031:1: ( ( ( rule__Final__RevogacaoAssignment_2_1_0 ) ) )
            // InternalLegisFacile.g:3032:1: ( ( rule__Final__RevogacaoAssignment_2_1_0 ) )
            {
            // InternalLegisFacile.g:3032:1: ( ( rule__Final__RevogacaoAssignment_2_1_0 ) )
            // InternalLegisFacile.g:3033:2: ( rule__Final__RevogacaoAssignment_2_1_0 )
            {
             before(grammarAccess.getFinalAccess().getRevogacaoAssignment_2_1_0()); 
            // InternalLegisFacile.g:3034:2: ( rule__Final__RevogacaoAssignment_2_1_0 )
            // InternalLegisFacile.g:3034:3: rule__Final__RevogacaoAssignment_2_1_0
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
    // InternalLegisFacile.g:3042:1: rule__Final__Group_2_1__1 : rule__Final__Group_2_1__1__Impl ;
    public final void rule__Final__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3046:1: ( rule__Final__Group_2_1__1__Impl )
            // InternalLegisFacile.g:3047:2: rule__Final__Group_2_1__1__Impl
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
    // InternalLegisFacile.g:3053:1: rule__Final__Group_2_1__1__Impl : ( ( rule__Final__VigenciaAssignment_2_1_1 )? ) ;
    public final void rule__Final__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3057:1: ( ( ( rule__Final__VigenciaAssignment_2_1_1 )? ) )
            // InternalLegisFacile.g:3058:1: ( ( rule__Final__VigenciaAssignment_2_1_1 )? )
            {
            // InternalLegisFacile.g:3058:1: ( ( rule__Final__VigenciaAssignment_2_1_1 )? )
            // InternalLegisFacile.g:3059:2: ( rule__Final__VigenciaAssignment_2_1_1 )?
            {
             before(grammarAccess.getFinalAccess().getVigenciaAssignment_2_1_1()); 
            // InternalLegisFacile.g:3060:2: ( rule__Final__VigenciaAssignment_2_1_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=35 && LA30_0<=36)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalLegisFacile.g:3060:3: rule__Final__VigenciaAssignment_2_1_1
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
    // InternalLegisFacile.g:3069:1: rule__Vigencia__Group__0 : rule__Vigencia__Group__0__Impl rule__Vigencia__Group__1 ;
    public final void rule__Vigencia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3073:1: ( rule__Vigencia__Group__0__Impl rule__Vigencia__Group__1 )
            // InternalLegisFacile.g:3074:2: rule__Vigencia__Group__0__Impl rule__Vigencia__Group__1
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
    // InternalLegisFacile.g:3081:1: rule__Vigencia__Group__0__Impl : ( ( rule__Vigencia__Alternatives_0 ) ) ;
    public final void rule__Vigencia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3085:1: ( ( ( rule__Vigencia__Alternatives_0 ) ) )
            // InternalLegisFacile.g:3086:1: ( ( rule__Vigencia__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:3086:1: ( ( rule__Vigencia__Alternatives_0 ) )
            // InternalLegisFacile.g:3087:2: ( rule__Vigencia__Alternatives_0 )
            {
             before(grammarAccess.getVigenciaAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:3088:2: ( rule__Vigencia__Alternatives_0 )
            // InternalLegisFacile.g:3088:3: rule__Vigencia__Alternatives_0
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
    // InternalLegisFacile.g:3096:1: rule__Vigencia__Group__1 : rule__Vigencia__Group__1__Impl rule__Vigencia__Group__2 ;
    public final void rule__Vigencia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3100:1: ( rule__Vigencia__Group__1__Impl rule__Vigencia__Group__2 )
            // InternalLegisFacile.g:3101:2: rule__Vigencia__Group__1__Impl rule__Vigencia__Group__2
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
    // InternalLegisFacile.g:3108:1: rule__Vigencia__Group__1__Impl : ( '(' ) ;
    public final void rule__Vigencia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3112:1: ( ( '(' ) )
            // InternalLegisFacile.g:3113:1: ( '(' )
            {
            // InternalLegisFacile.g:3113:1: ( '(' )
            // InternalLegisFacile.g:3114:2: '('
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
    // InternalLegisFacile.g:3123:1: rule__Vigencia__Group__2 : rule__Vigencia__Group__2__Impl rule__Vigencia__Group__3 ;
    public final void rule__Vigencia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3127:1: ( rule__Vigencia__Group__2__Impl rule__Vigencia__Group__3 )
            // InternalLegisFacile.g:3128:2: rule__Vigencia__Group__2__Impl rule__Vigencia__Group__3
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
    // InternalLegisFacile.g:3135:1: rule__Vigencia__Group__2__Impl : ( ( rule__Vigencia__TextoAssignment_2 ) ) ;
    public final void rule__Vigencia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3139:1: ( ( ( rule__Vigencia__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:3140:1: ( ( rule__Vigencia__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:3140:1: ( ( rule__Vigencia__TextoAssignment_2 ) )
            // InternalLegisFacile.g:3141:2: ( rule__Vigencia__TextoAssignment_2 )
            {
             before(grammarAccess.getVigenciaAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:3142:2: ( rule__Vigencia__TextoAssignment_2 )
            // InternalLegisFacile.g:3142:3: rule__Vigencia__TextoAssignment_2
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
    // InternalLegisFacile.g:3150:1: rule__Vigencia__Group__3 : rule__Vigencia__Group__3__Impl ;
    public final void rule__Vigencia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3154:1: ( rule__Vigencia__Group__3__Impl )
            // InternalLegisFacile.g:3155:2: rule__Vigencia__Group__3__Impl
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
    // InternalLegisFacile.g:3161:1: rule__Vigencia__Group__3__Impl : ( ')' ) ;
    public final void rule__Vigencia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3165:1: ( ( ')' ) )
            // InternalLegisFacile.g:3166:1: ( ')' )
            {
            // InternalLegisFacile.g:3166:1: ( ')' )
            // InternalLegisFacile.g:3167:2: ')'
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
    // InternalLegisFacile.g:3177:1: rule__Revogacao__Group__0 : rule__Revogacao__Group__0__Impl rule__Revogacao__Group__1 ;
    public final void rule__Revogacao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3181:1: ( rule__Revogacao__Group__0__Impl rule__Revogacao__Group__1 )
            // InternalLegisFacile.g:3182:2: rule__Revogacao__Group__0__Impl rule__Revogacao__Group__1
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
    // InternalLegisFacile.g:3189:1: rule__Revogacao__Group__0__Impl : ( ( rule__Revogacao__Alternatives_0 ) ) ;
    public final void rule__Revogacao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3193:1: ( ( ( rule__Revogacao__Alternatives_0 ) ) )
            // InternalLegisFacile.g:3194:1: ( ( rule__Revogacao__Alternatives_0 ) )
            {
            // InternalLegisFacile.g:3194:1: ( ( rule__Revogacao__Alternatives_0 ) )
            // InternalLegisFacile.g:3195:2: ( rule__Revogacao__Alternatives_0 )
            {
             before(grammarAccess.getRevogacaoAccess().getAlternatives_0()); 
            // InternalLegisFacile.g:3196:2: ( rule__Revogacao__Alternatives_0 )
            // InternalLegisFacile.g:3196:3: rule__Revogacao__Alternatives_0
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
    // InternalLegisFacile.g:3204:1: rule__Revogacao__Group__1 : rule__Revogacao__Group__1__Impl rule__Revogacao__Group__2 ;
    public final void rule__Revogacao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3208:1: ( rule__Revogacao__Group__1__Impl rule__Revogacao__Group__2 )
            // InternalLegisFacile.g:3209:2: rule__Revogacao__Group__1__Impl rule__Revogacao__Group__2
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
    // InternalLegisFacile.g:3216:1: rule__Revogacao__Group__1__Impl : ( '(' ) ;
    public final void rule__Revogacao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3220:1: ( ( '(' ) )
            // InternalLegisFacile.g:3221:1: ( '(' )
            {
            // InternalLegisFacile.g:3221:1: ( '(' )
            // InternalLegisFacile.g:3222:2: '('
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
    // InternalLegisFacile.g:3231:1: rule__Revogacao__Group__2 : rule__Revogacao__Group__2__Impl rule__Revogacao__Group__3 ;
    public final void rule__Revogacao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3235:1: ( rule__Revogacao__Group__2__Impl rule__Revogacao__Group__3 )
            // InternalLegisFacile.g:3236:2: rule__Revogacao__Group__2__Impl rule__Revogacao__Group__3
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
    // InternalLegisFacile.g:3243:1: rule__Revogacao__Group__2__Impl : ( ( rule__Revogacao__TextoAssignment_2 ) ) ;
    public final void rule__Revogacao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3247:1: ( ( ( rule__Revogacao__TextoAssignment_2 ) ) )
            // InternalLegisFacile.g:3248:1: ( ( rule__Revogacao__TextoAssignment_2 ) )
            {
            // InternalLegisFacile.g:3248:1: ( ( rule__Revogacao__TextoAssignment_2 ) )
            // InternalLegisFacile.g:3249:2: ( rule__Revogacao__TextoAssignment_2 )
            {
             before(grammarAccess.getRevogacaoAccess().getTextoAssignment_2()); 
            // InternalLegisFacile.g:3250:2: ( rule__Revogacao__TextoAssignment_2 )
            // InternalLegisFacile.g:3250:3: rule__Revogacao__TextoAssignment_2
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
    // InternalLegisFacile.g:3258:1: rule__Revogacao__Group__3 : rule__Revogacao__Group__3__Impl ;
    public final void rule__Revogacao__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3262:1: ( rule__Revogacao__Group__3__Impl )
            // InternalLegisFacile.g:3263:2: rule__Revogacao__Group__3__Impl
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
    // InternalLegisFacile.g:3269:1: rule__Revogacao__Group__3__Impl : ( ')' ) ;
    public final void rule__Revogacao__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3273:1: ( ( ')' ) )
            // InternalLegisFacile.g:3274:1: ( ')' )
            {
            // InternalLegisFacile.g:3274:1: ( ')' )
            // InternalLegisFacile.g:3275:2: ')'
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


    // $ANTLR start "rule__Lei__ElementsAssignment"
    // InternalLegisFacile.g:3285:1: rule__Lei__ElementsAssignment : ( ruleType ) ;
    public final void rule__Lei__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3289:1: ( ( ruleType ) )
            // InternalLegisFacile.g:3290:2: ( ruleType )
            {
            // InternalLegisFacile.g:3290:2: ( ruleType )
            // InternalLegisFacile.g:3291:3: ruleType
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


    // $ANTLR start "rule__Type__PreliminarAssignment_0"
    // InternalLegisFacile.g:3300:1: rule__Type__PreliminarAssignment_0 : ( rulePreliminar ) ;
    public final void rule__Type__PreliminarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3304:1: ( ( rulePreliminar ) )
            // InternalLegisFacile.g:3305:2: ( rulePreliminar )
            {
            // InternalLegisFacile.g:3305:2: ( rulePreliminar )
            // InternalLegisFacile.g:3306:3: rulePreliminar
            {
             before(grammarAccess.getTypeAccess().getPreliminarPreliminarParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePreliminar();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getPreliminarPreliminarParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__PreliminarAssignment_0"


    // $ANTLR start "rule__Type__NormativaAssignment_1"
    // InternalLegisFacile.g:3315:1: rule__Type__NormativaAssignment_1 : ( ruleNormativa ) ;
    public final void rule__Type__NormativaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3319:1: ( ( ruleNormativa ) )
            // InternalLegisFacile.g:3320:2: ( ruleNormativa )
            {
            // InternalLegisFacile.g:3320:2: ( ruleNormativa )
            // InternalLegisFacile.g:3321:3: ruleNormativa
            {
             before(grammarAccess.getTypeAccess().getNormativaNormativaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNormativa();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getNormativaNormativaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NormativaAssignment_1"


    // $ANTLR start "rule__Type__FinalAssignment_2"
    // InternalLegisFacile.g:3330:1: rule__Type__FinalAssignment_2 : ( ruleFinal ) ;
    public final void rule__Type__FinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3334:1: ( ( ruleFinal ) )
            // InternalLegisFacile.g:3335:2: ( ruleFinal )
            {
            // InternalLegisFacile.g:3335:2: ( ruleFinal )
            // InternalLegisFacile.g:3336:3: ruleFinal
            {
             before(grammarAccess.getTypeAccess().getFinalFinalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFinal();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getFinalFinalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__FinalAssignment_2"


    // $ANTLR start "rule__Preliminar__EpigrageAssignment_2"
    // InternalLegisFacile.g:3345:1: rule__Preliminar__EpigrageAssignment_2 : ( ruleEpigrafe ) ;
    public final void rule__Preliminar__EpigrageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3349:1: ( ( ruleEpigrafe ) )
            // InternalLegisFacile.g:3350:2: ( ruleEpigrafe )
            {
            // InternalLegisFacile.g:3350:2: ( ruleEpigrafe )
            // InternalLegisFacile.g:3351:3: ruleEpigrafe
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
    // InternalLegisFacile.g:3360:1: rule__Preliminar__EmentaAssignment_4 : ( ruleEmenta ) ;
    public final void rule__Preliminar__EmentaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3364:1: ( ( ruleEmenta ) )
            // InternalLegisFacile.g:3365:2: ( ruleEmenta )
            {
            // InternalLegisFacile.g:3365:2: ( ruleEmenta )
            // InternalLegisFacile.g:3366:3: ruleEmenta
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
    // InternalLegisFacile.g:3375:1: rule__Preliminar__PreambuloAssignment_6 : ( rulePreambulo ) ;
    public final void rule__Preliminar__PreambuloAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3379:1: ( ( rulePreambulo ) )
            // InternalLegisFacile.g:3380:2: ( rulePreambulo )
            {
            // InternalLegisFacile.g:3380:2: ( rulePreambulo )
            // InternalLegisFacile.g:3381:3: rulePreambulo
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
    // InternalLegisFacile.g:3390:1: rule__Epigrafe__AtoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Epigrafe__AtoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3394:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3395:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3395:2: ( RULE_STRING )
            // InternalLegisFacile.g:3396:3: RULE_STRING
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
    // InternalLegisFacile.g:3405:1: rule__Epigrafe__NumeroAssignment_4 : ( RULE_INT ) ;
    public final void rule__Epigrafe__NumeroAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3409:1: ( ( RULE_INT ) )
            // InternalLegisFacile.g:3410:2: ( RULE_INT )
            {
            // InternalLegisFacile.g:3410:2: ( RULE_INT )
            // InternalLegisFacile.g:3411:3: RULE_INT
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
    // InternalLegisFacile.g:3420:1: rule__Epigrafe__AnoAssignment_6 : ( RULE_INT ) ;
    public final void rule__Epigrafe__AnoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3424:1: ( ( RULE_INT ) )
            // InternalLegisFacile.g:3425:2: ( RULE_INT )
            {
            // InternalLegisFacile.g:3425:2: ( RULE_INT )
            // InternalLegisFacile.g:3426:3: RULE_INT
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
    // InternalLegisFacile.g:3435:1: rule__Ementa__EmentaAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Ementa__EmentaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3439:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3440:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3440:2: ( RULE_STRING )
            // InternalLegisFacile.g:3441:3: RULE_STRING
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
    // InternalLegisFacile.g:3450:1: rule__Preambulo__PreambuloAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Preambulo__PreambuloAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3454:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3455:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3455:2: ( RULE_STRING )
            // InternalLegisFacile.g:3456:3: RULE_STRING
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
    // InternalLegisFacile.g:3465:1: rule__Normativa__ArtigosAssignment_2 : ( ruleArtigo ) ;
    public final void rule__Normativa__ArtigosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3469:1: ( ( ruleArtigo ) )
            // InternalLegisFacile.g:3470:2: ( ruleArtigo )
            {
            // InternalLegisFacile.g:3470:2: ( ruleArtigo )
            // InternalLegisFacile.g:3471:3: ruleArtigo
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


    // $ANTLR start "rule__Artigo__LabelAssignment_1_1"
    // InternalLegisFacile.g:3480:1: rule__Artigo__LabelAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Artigo__LabelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3484:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3485:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3485:2: ( RULE_STRING )
            // InternalLegisFacile.g:3486:3: RULE_STRING
            {
             before(grammarAccess.getArtigoAccess().getLabelSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArtigoAccess().getLabelSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__LabelAssignment_1_1"


    // $ANTLR start "rule__Artigo__CaputAssignment_3"
    // InternalLegisFacile.g:3495:1: rule__Artigo__CaputAssignment_3 : ( ruleCaput ) ;
    public final void rule__Artigo__CaputAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3499:1: ( ( ruleCaput ) )
            // InternalLegisFacile.g:3500:2: ( ruleCaput )
            {
            // InternalLegisFacile.g:3500:2: ( ruleCaput )
            // InternalLegisFacile.g:3501:3: ruleCaput
            {
             before(grammarAccess.getArtigoAccess().getCaputCaputParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCaput();

            state._fsp--;

             after(grammarAccess.getArtigoAccess().getCaputCaputParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__CaputAssignment_3"


    // $ANTLR start "rule__Artigo__ParagrafosAssignment_4"
    // InternalLegisFacile.g:3510:1: rule__Artigo__ParagrafosAssignment_4 : ( ruleParagrafo ) ;
    public final void rule__Artigo__ParagrafosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3514:1: ( ( ruleParagrafo ) )
            // InternalLegisFacile.g:3515:2: ( ruleParagrafo )
            {
            // InternalLegisFacile.g:3515:2: ( ruleParagrafo )
            // InternalLegisFacile.g:3516:3: ruleParagrafo
            {
             before(grammarAccess.getArtigoAccess().getParagrafosParagrafoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParagrafo();

            state._fsp--;

             after(grammarAccess.getArtigoAccess().getParagrafosParagrafoParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artigo__ParagrafosAssignment_4"


    // $ANTLR start "rule__Caput__TextoAssignment_2"
    // InternalLegisFacile.g:3525:1: rule__Caput__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Caput__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3529:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3530:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3530:2: ( RULE_STRING )
            // InternalLegisFacile.g:3531:3: RULE_STRING
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
    // InternalLegisFacile.g:3540:1: rule__Caput__IncisosAssignment_4_1 : ( ruleInciso ) ;
    public final void rule__Caput__IncisosAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3544:1: ( ( ruleInciso ) )
            // InternalLegisFacile.g:3545:2: ( ruleInciso )
            {
            // InternalLegisFacile.g:3545:2: ( ruleInciso )
            // InternalLegisFacile.g:3546:3: ruleInciso
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
    // InternalLegisFacile.g:3555:1: rule__Paragrafo__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Paragrafo__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3559:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3560:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3560:2: ( RULE_STRING )
            // InternalLegisFacile.g:3561:3: RULE_STRING
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
    // InternalLegisFacile.g:3570:1: rule__Paragrafo__IncisosAssignment_4_1 : ( ruleInciso ) ;
    public final void rule__Paragrafo__IncisosAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3574:1: ( ( ruleInciso ) )
            // InternalLegisFacile.g:3575:2: ( ruleInciso )
            {
            // InternalLegisFacile.g:3575:2: ( ruleInciso )
            // InternalLegisFacile.g:3576:3: ruleInciso
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
    // InternalLegisFacile.g:3585:1: rule__Inciso__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Inciso__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3589:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3590:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3590:2: ( RULE_STRING )
            // InternalLegisFacile.g:3591:3: RULE_STRING
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
    // InternalLegisFacile.g:3600:1: rule__Inciso__AlineasAssignment_4_1 : ( ruleAlinea ) ;
    public final void rule__Inciso__AlineasAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3604:1: ( ( ruleAlinea ) )
            // InternalLegisFacile.g:3605:2: ( ruleAlinea )
            {
            // InternalLegisFacile.g:3605:2: ( ruleAlinea )
            // InternalLegisFacile.g:3606:3: ruleAlinea
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
    // InternalLegisFacile.g:3615:1: rule__Alinea__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Alinea__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3619:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3620:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3620:2: ( RULE_STRING )
            // InternalLegisFacile.g:3621:3: RULE_STRING
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
    // InternalLegisFacile.g:3630:1: rule__Alinea__ItensAssignment_4_1 : ( ruleItem ) ;
    public final void rule__Alinea__ItensAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3634:1: ( ( ruleItem ) )
            // InternalLegisFacile.g:3635:2: ( ruleItem )
            {
            // InternalLegisFacile.g:3635:2: ( ruleItem )
            // InternalLegisFacile.g:3636:3: ruleItem
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
    // InternalLegisFacile.g:3645:1: rule__Item__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Item__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3649:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3650:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3650:2: ( RULE_STRING )
            // InternalLegisFacile.g:3651:3: RULE_STRING
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
    // InternalLegisFacile.g:3660:1: rule__Final__VigenciaAssignment_2_0_0 : ( ruleVigencia ) ;
    public final void rule__Final__VigenciaAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3664:1: ( ( ruleVigencia ) )
            // InternalLegisFacile.g:3665:2: ( ruleVigencia )
            {
            // InternalLegisFacile.g:3665:2: ( ruleVigencia )
            // InternalLegisFacile.g:3666:3: ruleVigencia
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
    // InternalLegisFacile.g:3675:1: rule__Final__RevogacaoAssignment_2_0_1 : ( ruleRevogacao ) ;
    public final void rule__Final__RevogacaoAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3679:1: ( ( ruleRevogacao ) )
            // InternalLegisFacile.g:3680:2: ( ruleRevogacao )
            {
            // InternalLegisFacile.g:3680:2: ( ruleRevogacao )
            // InternalLegisFacile.g:3681:3: ruleRevogacao
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
    // InternalLegisFacile.g:3690:1: rule__Final__RevogacaoAssignment_2_1_0 : ( ruleRevogacao ) ;
    public final void rule__Final__RevogacaoAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3694:1: ( ( ruleRevogacao ) )
            // InternalLegisFacile.g:3695:2: ( ruleRevogacao )
            {
            // InternalLegisFacile.g:3695:2: ( ruleRevogacao )
            // InternalLegisFacile.g:3696:3: ruleRevogacao
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
    // InternalLegisFacile.g:3705:1: rule__Final__VigenciaAssignment_2_1_1 : ( ruleVigencia ) ;
    public final void rule__Final__VigenciaAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3709:1: ( ( ruleVigencia ) )
            // InternalLegisFacile.g:3710:2: ( ruleVigencia )
            {
            // InternalLegisFacile.g:3710:2: ( ruleVigencia )
            // InternalLegisFacile.g:3711:3: ruleVigencia
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
    // InternalLegisFacile.g:3720:1: rule__Vigencia__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Vigencia__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3724:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3725:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3725:2: ( RULE_STRING )
            // InternalLegisFacile.g:3726:3: RULE_STRING
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
    // InternalLegisFacile.g:3735:1: rule__Revogacao__TextoAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Revogacao__TextoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegisFacile.g:3739:1: ( ( RULE_STRING ) )
            // InternalLegisFacile.g:3740:2: ( RULE_STRING )
            {
            // InternalLegisFacile.g:3740:2: ( RULE_STRING )
            // InternalLegisFacile.g:3741:3: RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
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
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000048000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020006000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020018000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020060000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020180000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001800000000L});

}