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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLegisFacileParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Preliminar'", "'preliminar'", "'{'", "','", "'}'", "'Epigrafe'", "'epigrafe'", "'('", "')'", "'Ementa'", "'ementa'", "'Preambulo'", "'preambulo'", "'Normativa'", "'normativa'", "'Final'", "'final'", "'datatype'", "'entity'", "'extends'", "'many'", "':'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
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




    // $ANTLR start "entryRuleLei"
    // InternalLegisFacile.g:64:1: entryRuleLei returns [EObject current=null] : iv_ruleLei= ruleLei EOF ;
    public final EObject entryRuleLei() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLei = null;


        try {
            // InternalLegisFacile.g:64:44: (iv_ruleLei= ruleLei EOF )
            // InternalLegisFacile.g:65:2: iv_ruleLei= ruleLei EOF
            {
             newCompositeNode(grammarAccess.getLeiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLei=ruleLei();

            state._fsp--;

             current =iv_ruleLei; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLei"


    // $ANTLR start "ruleLei"
    // InternalLegisFacile.g:71:1: ruleLei returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleLei() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalLegisFacile.g:77:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalLegisFacile.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalLegisFacile.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=28 && LA1_0<=29)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLegisFacile.g:79:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalLegisFacile.g:79:3: (lv_elements_0_0= ruleType )
            	    // InternalLegisFacile.g:80:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getLeiAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getLeiRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"ufes.mdd.lei.LegisFacile.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLei"


    // $ANTLR start "entryRuleType"
    // InternalLegisFacile.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalLegisFacile.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalLegisFacile.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalLegisFacile.g:107:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | (this_Preliminar_2= rulePreliminar ruleNormativa ruleFinal ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;

        EObject this_Preliminar_2 = null;



        	enterRule();

        try {
            // InternalLegisFacile.g:113:2: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | (this_Preliminar_2= rulePreliminar ruleNormativa ruleFinal ) ) )
            // InternalLegisFacile.g:114:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | (this_Preliminar_2= rulePreliminar ruleNormativa ruleFinal ) )
            {
            // InternalLegisFacile.g:114:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | (this_Preliminar_2= rulePreliminar ruleNormativa ruleFinal ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt2=1;
                }
                break;
            case 29:
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
                    // InternalLegisFacile.g:115:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:124:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLegisFacile.g:133:3: (this_Preliminar_2= rulePreliminar ruleNormativa ruleFinal )
                    {
                    // InternalLegisFacile.g:133:3: (this_Preliminar_2= rulePreliminar ruleNormativa ruleFinal )
                    // InternalLegisFacile.g:134:4: this_Preliminar_2= rulePreliminar ruleNormativa ruleFinal
                    {

                    				newCompositeNode(grammarAccess.getTypeAccess().getPreliminarParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_Preliminar_2=rulePreliminar();

                    state._fsp--;


                    				current = this_Preliminar_2;
                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getTypeAccess().getNormativaParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_5);
                    ruleNormativa();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getTypeAccess().getFinalParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_2);
                    ruleFinal();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePreliminar"
    // InternalLegisFacile.g:161:1: entryRulePreliminar returns [EObject current=null] : iv_rulePreliminar= rulePreliminar EOF ;
    public final EObject entryRulePreliminar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreliminar = null;


        try {
            // InternalLegisFacile.g:161:51: (iv_rulePreliminar= rulePreliminar EOF )
            // InternalLegisFacile.g:162:2: iv_rulePreliminar= rulePreliminar EOF
            {
             newCompositeNode(grammarAccess.getPreliminarRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreliminar=rulePreliminar();

            state._fsp--;

             current =iv_rulePreliminar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreliminar"


    // $ANTLR start "rulePreliminar"
    // InternalLegisFacile.g:168:1: rulePreliminar returns [EObject current=null] : ( (otherlv_0= 'Preliminar' | otherlv_1= 'preliminar' ) otherlv_2= '{' ( (lv_epigrage_3_0= ruleEpigrafe ) ) otherlv_4= ',' ( (lv_ementa_5_0= ruleEmenta ) ) otherlv_6= ',' ( (lv_preambulo_7_0= rulePreambulo ) ) otherlv_8= ',' otherlv_9= '}' ) ;
    public final EObject rulePreliminar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_epigrage_3_0 = null;

        EObject lv_ementa_5_0 = null;

        EObject lv_preambulo_7_0 = null;



        	enterRule();

        try {
            // InternalLegisFacile.g:174:2: ( ( (otherlv_0= 'Preliminar' | otherlv_1= 'preliminar' ) otherlv_2= '{' ( (lv_epigrage_3_0= ruleEpigrafe ) ) otherlv_4= ',' ( (lv_ementa_5_0= ruleEmenta ) ) otherlv_6= ',' ( (lv_preambulo_7_0= rulePreambulo ) ) otherlv_8= ',' otherlv_9= '}' ) )
            // InternalLegisFacile.g:175:2: ( (otherlv_0= 'Preliminar' | otherlv_1= 'preliminar' ) otherlv_2= '{' ( (lv_epigrage_3_0= ruleEpigrafe ) ) otherlv_4= ',' ( (lv_ementa_5_0= ruleEmenta ) ) otherlv_6= ',' ( (lv_preambulo_7_0= rulePreambulo ) ) otherlv_8= ',' otherlv_9= '}' )
            {
            // InternalLegisFacile.g:175:2: ( (otherlv_0= 'Preliminar' | otherlv_1= 'preliminar' ) otherlv_2= '{' ( (lv_epigrage_3_0= ruleEpigrafe ) ) otherlv_4= ',' ( (lv_ementa_5_0= ruleEmenta ) ) otherlv_6= ',' ( (lv_preambulo_7_0= rulePreambulo ) ) otherlv_8= ',' otherlv_9= '}' )
            // InternalLegisFacile.g:176:3: (otherlv_0= 'Preliminar' | otherlv_1= 'preliminar' ) otherlv_2= '{' ( (lv_epigrage_3_0= ruleEpigrafe ) ) otherlv_4= ',' ( (lv_ementa_5_0= ruleEmenta ) ) otherlv_6= ',' ( (lv_preambulo_7_0= rulePreambulo ) ) otherlv_8= ',' otherlv_9= '}'
            {
            // InternalLegisFacile.g:176:3: (otherlv_0= 'Preliminar' | otherlv_1= 'preliminar' )
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
                    // InternalLegisFacile.g:177:4: otherlv_0= 'Preliminar'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:182:4: otherlv_1= 'preliminar'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPreliminarAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLegisFacile.g:191:3: ( (lv_epigrage_3_0= ruleEpigrafe ) )
            // InternalLegisFacile.g:192:4: (lv_epigrage_3_0= ruleEpigrafe )
            {
            // InternalLegisFacile.g:192:4: (lv_epigrage_3_0= ruleEpigrafe )
            // InternalLegisFacile.g:193:5: lv_epigrage_3_0= ruleEpigrafe
            {

            					newCompositeNode(grammarAccess.getPreliminarAccess().getEpigrageEpigrafeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_epigrage_3_0=ruleEpigrafe();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreliminarRule());
            					}
            					set(
            						current,
            						"epigrage",
            						lv_epigrage_3_0,
            						"ufes.mdd.lei.LegisFacile.Epigrafe");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getPreliminarAccess().getCommaKeyword_3());
            		
            // InternalLegisFacile.g:214:3: ( (lv_ementa_5_0= ruleEmenta ) )
            // InternalLegisFacile.g:215:4: (lv_ementa_5_0= ruleEmenta )
            {
            // InternalLegisFacile.g:215:4: (lv_ementa_5_0= ruleEmenta )
            // InternalLegisFacile.g:216:5: lv_ementa_5_0= ruleEmenta
            {

            					newCompositeNode(grammarAccess.getPreliminarAccess().getEmentaEmentaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_ementa_5_0=ruleEmenta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreliminarRule());
            					}
            					set(
            						current,
            						"ementa",
            						lv_ementa_5_0,
            						"ufes.mdd.lei.LegisFacile.Ementa");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getPreliminarAccess().getCommaKeyword_5());
            		
            // InternalLegisFacile.g:237:3: ( (lv_preambulo_7_0= rulePreambulo ) )
            // InternalLegisFacile.g:238:4: (lv_preambulo_7_0= rulePreambulo )
            {
            // InternalLegisFacile.g:238:4: (lv_preambulo_7_0= rulePreambulo )
            // InternalLegisFacile.g:239:5: lv_preambulo_7_0= rulePreambulo
            {

            					newCompositeNode(grammarAccess.getPreliminarAccess().getPreambuloPreambuloParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_preambulo_7_0=rulePreambulo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreliminarRule());
            					}
            					set(
            						current,
            						"preambulo",
            						lv_preambulo_7_0,
            						"ufes.mdd.lei.LegisFacile.Preambulo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getPreliminarAccess().getCommaKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPreliminarAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreliminar"


    // $ANTLR start "entryRuleEpigrafe"
    // InternalLegisFacile.g:268:1: entryRuleEpigrafe returns [EObject current=null] : iv_ruleEpigrafe= ruleEpigrafe EOF ;
    public final EObject entryRuleEpigrafe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEpigrafe = null;


        try {
            // InternalLegisFacile.g:268:49: (iv_ruleEpigrafe= ruleEpigrafe EOF )
            // InternalLegisFacile.g:269:2: iv_ruleEpigrafe= ruleEpigrafe EOF
            {
             newCompositeNode(grammarAccess.getEpigrafeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEpigrafe=ruleEpigrafe();

            state._fsp--;

             current =iv_ruleEpigrafe; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEpigrafe"


    // $ANTLR start "ruleEpigrafe"
    // InternalLegisFacile.g:275:1: ruleEpigrafe returns [EObject current=null] : ( (otherlv_0= 'Epigrafe' | otherlv_1= 'epigrafe' ) otherlv_2= '(' ( (lv_ato_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_numero_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_ano_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleEpigrafe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_ato_3_0=null;
        Token otherlv_4=null;
        Token lv_numero_5_0=null;
        Token otherlv_6=null;
        Token lv_ano_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalLegisFacile.g:281:2: ( ( (otherlv_0= 'Epigrafe' | otherlv_1= 'epigrafe' ) otherlv_2= '(' ( (lv_ato_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_numero_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_ano_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalLegisFacile.g:282:2: ( (otherlv_0= 'Epigrafe' | otherlv_1= 'epigrafe' ) otherlv_2= '(' ( (lv_ato_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_numero_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_ano_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalLegisFacile.g:282:2: ( (otherlv_0= 'Epigrafe' | otherlv_1= 'epigrafe' ) otherlv_2= '(' ( (lv_ato_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_numero_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_ano_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalLegisFacile.g:283:3: (otherlv_0= 'Epigrafe' | otherlv_1= 'epigrafe' ) otherlv_2= '(' ( (lv_ato_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_numero_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_ano_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalLegisFacile.g:283:3: (otherlv_0= 'Epigrafe' | otherlv_1= 'epigrafe' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLegisFacile.g:284:4: otherlv_0= 'Epigrafe'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:289:4: otherlv_1= 'epigrafe'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEpigrafeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLegisFacile.g:298:3: ( (lv_ato_3_0= RULE_STRING ) )
            // InternalLegisFacile.g:299:4: (lv_ato_3_0= RULE_STRING )
            {
            // InternalLegisFacile.g:299:4: (lv_ato_3_0= RULE_STRING )
            // InternalLegisFacile.g:300:5: lv_ato_3_0= RULE_STRING
            {
            lv_ato_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_ato_3_0, grammarAccess.getEpigrafeAccess().getAtoSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEpigrafeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ato",
            						lv_ato_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getEpigrafeAccess().getCommaKeyword_3());
            		
            // InternalLegisFacile.g:320:3: ( (lv_numero_5_0= RULE_INT ) )
            // InternalLegisFacile.g:321:4: (lv_numero_5_0= RULE_INT )
            {
            // InternalLegisFacile.g:321:4: (lv_numero_5_0= RULE_INT )
            // InternalLegisFacile.g:322:5: lv_numero_5_0= RULE_INT
            {
            lv_numero_5_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_numero_5_0, grammarAccess.getEpigrafeAccess().getNumeroINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEpigrafeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"numero",
            						lv_numero_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getEpigrafeAccess().getCommaKeyword_5());
            		
            // InternalLegisFacile.g:342:3: ( (lv_ano_7_0= RULE_INT ) )
            // InternalLegisFacile.g:343:4: (lv_ano_7_0= RULE_INT )
            {
            // InternalLegisFacile.g:343:4: (lv_ano_7_0= RULE_INT )
            // InternalLegisFacile.g:344:5: lv_ano_7_0= RULE_INT
            {
            lv_ano_7_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_ano_7_0, grammarAccess.getEpigrafeAccess().getAnoINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEpigrafeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ano",
            						lv_ano_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEpigrafeAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEpigrafe"


    // $ANTLR start "entryRuleEmenta"
    // InternalLegisFacile.g:368:1: entryRuleEmenta returns [EObject current=null] : iv_ruleEmenta= ruleEmenta EOF ;
    public final EObject entryRuleEmenta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmenta = null;


        try {
            // InternalLegisFacile.g:368:47: (iv_ruleEmenta= ruleEmenta EOF )
            // InternalLegisFacile.g:369:2: iv_ruleEmenta= ruleEmenta EOF
            {
             newCompositeNode(grammarAccess.getEmentaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmenta=ruleEmenta();

            state._fsp--;

             current =iv_ruleEmenta; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmenta"


    // $ANTLR start "ruleEmenta"
    // InternalLegisFacile.g:375:1: ruleEmenta returns [EObject current=null] : ( (otherlv_0= 'Ementa' | otherlv_1= 'ementa' ) otherlv_2= '(' ( (lv_ementa_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleEmenta() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_ementa_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegisFacile.g:381:2: ( ( (otherlv_0= 'Ementa' | otherlv_1= 'ementa' ) otherlv_2= '(' ( (lv_ementa_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalLegisFacile.g:382:2: ( (otherlv_0= 'Ementa' | otherlv_1= 'ementa' ) otherlv_2= '(' ( (lv_ementa_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalLegisFacile.g:382:2: ( (otherlv_0= 'Ementa' | otherlv_1= 'ementa' ) otherlv_2= '(' ( (lv_ementa_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalLegisFacile.g:383:3: (otherlv_0= 'Ementa' | otherlv_1= 'ementa' ) otherlv_2= '(' ( (lv_ementa_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            // InternalLegisFacile.g:383:3: (otherlv_0= 'Ementa' | otherlv_1= 'ementa' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLegisFacile.g:384:4: otherlv_0= 'Ementa'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getEmentaAccess().getEmentaKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:389:4: otherlv_1= 'ementa'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getEmentaAccess().getEmentaKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEmentaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLegisFacile.g:398:3: ( (lv_ementa_3_0= RULE_STRING ) )
            // InternalLegisFacile.g:399:4: (lv_ementa_3_0= RULE_STRING )
            {
            // InternalLegisFacile.g:399:4: (lv_ementa_3_0= RULE_STRING )
            // InternalLegisFacile.g:400:5: lv_ementa_3_0= RULE_STRING
            {
            lv_ementa_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_ementa_3_0, grammarAccess.getEmentaAccess().getEmentaSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmentaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ementa",
            						lv_ementa_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEmentaAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmenta"


    // $ANTLR start "entryRulePreambulo"
    // InternalLegisFacile.g:424:1: entryRulePreambulo returns [EObject current=null] : iv_rulePreambulo= rulePreambulo EOF ;
    public final EObject entryRulePreambulo() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreambulo = null;


        try {
            // InternalLegisFacile.g:424:50: (iv_rulePreambulo= rulePreambulo EOF )
            // InternalLegisFacile.g:425:2: iv_rulePreambulo= rulePreambulo EOF
            {
             newCompositeNode(grammarAccess.getPreambuloRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreambulo=rulePreambulo();

            state._fsp--;

             current =iv_rulePreambulo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreambulo"


    // $ANTLR start "rulePreambulo"
    // InternalLegisFacile.g:431:1: rulePreambulo returns [EObject current=null] : ( (otherlv_0= 'Preambulo' | otherlv_1= 'preambulo' ) otherlv_2= '(' ( (lv_preambulo_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject rulePreambulo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_preambulo_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegisFacile.g:437:2: ( ( (otherlv_0= 'Preambulo' | otherlv_1= 'preambulo' ) otherlv_2= '(' ( (lv_preambulo_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalLegisFacile.g:438:2: ( (otherlv_0= 'Preambulo' | otherlv_1= 'preambulo' ) otherlv_2= '(' ( (lv_preambulo_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalLegisFacile.g:438:2: ( (otherlv_0= 'Preambulo' | otherlv_1= 'preambulo' ) otherlv_2= '(' ( (lv_preambulo_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalLegisFacile.g:439:3: (otherlv_0= 'Preambulo' | otherlv_1= 'preambulo' ) otherlv_2= '(' ( (lv_preambulo_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            // InternalLegisFacile.g:439:3: (otherlv_0= 'Preambulo' | otherlv_1= 'preambulo' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLegisFacile.g:440:4: otherlv_0= 'Preambulo'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:445:4: otherlv_1= 'preambulo'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPreambuloAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLegisFacile.g:454:3: ( (lv_preambulo_3_0= RULE_STRING ) )
            // InternalLegisFacile.g:455:4: (lv_preambulo_3_0= RULE_STRING )
            {
            // InternalLegisFacile.g:455:4: (lv_preambulo_3_0= RULE_STRING )
            // InternalLegisFacile.g:456:5: lv_preambulo_3_0= RULE_STRING
            {
            lv_preambulo_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_preambulo_3_0, grammarAccess.getPreambuloAccess().getPreambuloSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreambuloRule());
            					}
            					setWithLastConsumed(
            						current,
            						"preambulo",
            						lv_preambulo_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPreambuloAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreambulo"


    // $ANTLR start "entryRuleNormativa"
    // InternalLegisFacile.g:480:1: entryRuleNormativa returns [String current=null] : iv_ruleNormativa= ruleNormativa EOF ;
    public final String entryRuleNormativa() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNormativa = null;


        try {
            // InternalLegisFacile.g:480:49: (iv_ruleNormativa= ruleNormativa EOF )
            // InternalLegisFacile.g:481:2: iv_ruleNormativa= ruleNormativa EOF
            {
             newCompositeNode(grammarAccess.getNormativaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormativa=ruleNormativa();

            state._fsp--;

             current =iv_ruleNormativa.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNormativa"


    // $ANTLR start "ruleNormativa"
    // InternalLegisFacile.g:487:1: ruleNormativa returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'Normativa' | kw= 'normativa' ) kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleNormativa() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLegisFacile.g:493:2: ( ( (kw= 'Normativa' | kw= 'normativa' ) kw= '{' kw= '}' ) )
            // InternalLegisFacile.g:494:2: ( (kw= 'Normativa' | kw= 'normativa' ) kw= '{' kw= '}' )
            {
            // InternalLegisFacile.g:494:2: ( (kw= 'Normativa' | kw= 'normativa' ) kw= '{' kw= '}' )
            // InternalLegisFacile.g:495:3: (kw= 'Normativa' | kw= 'normativa' ) kw= '{' kw= '}'
            {
            // InternalLegisFacile.g:495:3: (kw= 'Normativa' | kw= 'normativa' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLegisFacile.g:496:4: kw= 'Normativa'
                    {
                    kw=(Token)match(input,24,FOLLOW_6); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNormativaAccess().getNormativaKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:502:4: kw= 'normativa'
                    {
                    kw=(Token)match(input,25,FOLLOW_6); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNormativaAccess().getNormativaKeyword_0_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,13,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getNormativaAccess().getLeftCurlyBracketKeyword_1());
            		
            kw=(Token)match(input,15,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getNormativaAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNormativa"


    // $ANTLR start "entryRuleFinal"
    // InternalLegisFacile.g:522:1: entryRuleFinal returns [String current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final String entryRuleFinal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFinal = null;


        try {
            // InternalLegisFacile.g:522:45: (iv_ruleFinal= ruleFinal EOF )
            // InternalLegisFacile.g:523:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // InternalLegisFacile.g:529:1: ruleFinal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'Final' | kw= 'final' ) kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleFinal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLegisFacile.g:535:2: ( ( (kw= 'Final' | kw= 'final' ) kw= '{' kw= '}' ) )
            // InternalLegisFacile.g:536:2: ( (kw= 'Final' | kw= 'final' ) kw= '{' kw= '}' )
            {
            // InternalLegisFacile.g:536:2: ( (kw= 'Final' | kw= 'final' ) kw= '{' kw= '}' )
            // InternalLegisFacile.g:537:3: (kw= 'Final' | kw= 'final' ) kw= '{' kw= '}'
            {
            // InternalLegisFacile.g:537:3: (kw= 'Final' | kw= 'final' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLegisFacile.g:538:4: kw= 'Final'
                    {
                    kw=(Token)match(input,26,FOLLOW_6); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFinalAccess().getFinalKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:544:4: kw= 'final'
                    {
                    kw=(Token)match(input,27,FOLLOW_6); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFinalAccess().getFinalKeyword_0_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,13,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_1());
            		
            kw=(Token)match(input,15,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinal"


    // $ANTLR start "entryRuleDataType"
    // InternalLegisFacile.g:564:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalLegisFacile.g:564:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalLegisFacile.g:565:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalLegisFacile.g:571:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalLegisFacile.g:577:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalLegisFacile.g:578:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalLegisFacile.g:578:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalLegisFacile.g:579:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalLegisFacile.g:583:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLegisFacile.g:584:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLegisFacile.g:584:4: (lv_name_1_0= RULE_ID )
            // InternalLegisFacile.g:585:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // InternalLegisFacile.g:605:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalLegisFacile.g:605:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalLegisFacile.g:606:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalLegisFacile.g:612:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;



        	enterRule();

        try {
            // InternalLegisFacile.g:618:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // InternalLegisFacile.g:619:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // InternalLegisFacile.g:619:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // InternalLegisFacile.g:620:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalLegisFacile.g:624:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLegisFacile.g:625:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLegisFacile.g:625:4: (lv_name_1_0= RULE_ID )
            // InternalLegisFacile.g:626:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLegisFacile.g:642:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLegisFacile.g:643:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalLegisFacile.g:647:4: ( (otherlv_3= RULE_ID ) )
                    // InternalLegisFacile.g:648:5: (otherlv_3= RULE_ID )
                    {
                    // InternalLegisFacile.g:648:5: (otherlv_3= RULE_ID )
                    // InternalLegisFacile.g:649:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLegisFacile.g:665:3: ( (lv_features_5_0= ruleFeature ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLegisFacile.g:666:4: (lv_features_5_0= ruleFeature )
            	    {
            	    // InternalLegisFacile.g:666:4: (lv_features_5_0= ruleFeature )
            	    // InternalLegisFacile.g:667:5: lv_features_5_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_features_5_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_5_0,
            	    						"ufes.mdd.lei.LegisFacile.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalLegisFacile.g:692:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalLegisFacile.g:692:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalLegisFacile.g:693:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalLegisFacile.g:699:1: ruleFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalLegisFacile.g:705:2: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalLegisFacile.g:706:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalLegisFacile.g:706:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalLegisFacile.g:707:3: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // InternalLegisFacile.g:707:3: ( (lv_many_0_0= 'many' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLegisFacile.g:708:4: (lv_many_0_0= 'many' )
                    {
                    // InternalLegisFacile.g:708:4: (lv_many_0_0= 'many' )
                    // InternalLegisFacile.g:709:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,31,FOLLOW_16); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getFeatureAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(current, "many", lv_many_0_0 != null, "many");
                    				

                    }


                    }
                    break;

            }

            // InternalLegisFacile.g:721:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLegisFacile.g:722:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLegisFacile.g:722:4: (lv_name_1_0= RULE_ID )
            // InternalLegisFacile.g:723:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
            		
            // InternalLegisFacile.g:743:3: ( (otherlv_3= RULE_ID ) )
            // InternalLegisFacile.g:744:4: (otherlv_3= RULE_ID )
            {
            // InternalLegisFacile.g:744:4: (otherlv_3= RULE_ID )
            // InternalLegisFacile.g:745:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000030001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080008040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});

}