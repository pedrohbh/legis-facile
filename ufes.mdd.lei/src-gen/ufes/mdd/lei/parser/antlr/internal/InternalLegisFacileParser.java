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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Preliminar'", "'preliminar'", "'{'", "','", "'}'", "'Epigrafe'", "'epigrafe'", "'('", "')'", "'Ementa'", "'ementa'", "'Preambulo'", "'preambulo'", "'Normativa'", "'normativa'", "'Artigo'", "'artigo'", "'Caput|caput'", "'Paragrafo'", "'paragrafo'", "'alinea'", "'Alinea'", "'Final'", "'final'", "'datatype'", "'entity'", "'extends'", "'many'", "':'"
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

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=35 && LA1_0<=36)) ) {
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
    // InternalLegisFacile.g:107:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | ( ( (lv_preliminar_2_0= rulePreliminar ) ) ( (lv_normativa_3_0= ruleNormativa ) ) ( (lv_final_4_0= ruleFinal ) ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;

        EObject lv_preliminar_2_0 = null;

        EObject lv_normativa_3_0 = null;

        AntlrDatatypeRuleToken lv_final_4_0 = null;



        	enterRule();

        try {
            // InternalLegisFacile.g:113:2: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | ( ( (lv_preliminar_2_0= rulePreliminar ) ) ( (lv_normativa_3_0= ruleNormativa ) ) ( (lv_final_4_0= ruleFinal ) ) ) ) )
            // InternalLegisFacile.g:114:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | ( ( (lv_preliminar_2_0= rulePreliminar ) ) ( (lv_normativa_3_0= ruleNormativa ) ) ( (lv_final_4_0= ruleFinal ) ) ) )
            {
            // InternalLegisFacile.g:114:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | ( ( (lv_preliminar_2_0= rulePreliminar ) ) ( (lv_normativa_3_0= ruleNormativa ) ) ( (lv_final_4_0= ruleFinal ) ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt2=1;
                }
                break;
            case 36:
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
                    // InternalLegisFacile.g:133:3: ( ( (lv_preliminar_2_0= rulePreliminar ) ) ( (lv_normativa_3_0= ruleNormativa ) ) ( (lv_final_4_0= ruleFinal ) ) )
                    {
                    // InternalLegisFacile.g:133:3: ( ( (lv_preliminar_2_0= rulePreliminar ) ) ( (lv_normativa_3_0= ruleNormativa ) ) ( (lv_final_4_0= ruleFinal ) ) )
                    // InternalLegisFacile.g:134:4: ( (lv_preliminar_2_0= rulePreliminar ) ) ( (lv_normativa_3_0= ruleNormativa ) ) ( (lv_final_4_0= ruleFinal ) )
                    {
                    // InternalLegisFacile.g:134:4: ( (lv_preliminar_2_0= rulePreliminar ) )
                    // InternalLegisFacile.g:135:5: (lv_preliminar_2_0= rulePreliminar )
                    {
                    // InternalLegisFacile.g:135:5: (lv_preliminar_2_0= rulePreliminar )
                    // InternalLegisFacile.g:136:6: lv_preliminar_2_0= rulePreliminar
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getPreliminarPreliminarParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_preliminar_2_0=rulePreliminar();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeRule());
                    						}
                    						set(
                    							current,
                    							"preliminar",
                    							lv_preliminar_2_0,
                    							"ufes.mdd.lei.LegisFacile.Preliminar");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLegisFacile.g:153:4: ( (lv_normativa_3_0= ruleNormativa ) )
                    // InternalLegisFacile.g:154:5: (lv_normativa_3_0= ruleNormativa )
                    {
                    // InternalLegisFacile.g:154:5: (lv_normativa_3_0= ruleNormativa )
                    // InternalLegisFacile.g:155:6: lv_normativa_3_0= ruleNormativa
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getNormativaNormativaParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_normativa_3_0=ruleNormativa();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeRule());
                    						}
                    						set(
                    							current,
                    							"normativa",
                    							lv_normativa_3_0,
                    							"ufes.mdd.lei.LegisFacile.Normativa");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLegisFacile.g:172:4: ( (lv_final_4_0= ruleFinal ) )
                    // InternalLegisFacile.g:173:5: (lv_final_4_0= ruleFinal )
                    {
                    // InternalLegisFacile.g:173:5: (lv_final_4_0= ruleFinal )
                    // InternalLegisFacile.g:174:6: lv_final_4_0= ruleFinal
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getFinalFinalParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_final_4_0=ruleFinal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeRule());
                    						}
                    						set(
                    							current,
                    							"final",
                    							lv_final_4_0,
                    							"ufes.mdd.lei.LegisFacile.Final");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // InternalLegisFacile.g:196:1: entryRulePreliminar returns [EObject current=null] : iv_rulePreliminar= rulePreliminar EOF ;
    public final EObject entryRulePreliminar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreliminar = null;


        try {
            // InternalLegisFacile.g:196:51: (iv_rulePreliminar= rulePreliminar EOF )
            // InternalLegisFacile.g:197:2: iv_rulePreliminar= rulePreliminar EOF
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
    // InternalLegisFacile.g:203:1: rulePreliminar returns [EObject current=null] : ( (otherlv_0= 'Preliminar' | otherlv_1= 'preliminar' ) otherlv_2= '{' ( (lv_epigrage_3_0= ruleEpigrafe ) ) otherlv_4= ',' ( (lv_ementa_5_0= ruleEmenta ) ) otherlv_6= ',' ( (lv_preambulo_7_0= rulePreambulo ) ) otherlv_8= ',' otherlv_9= '}' ) ;
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
            // InternalLegisFacile.g:209:2: ( ( (otherlv_0= 'Preliminar' | otherlv_1= 'preliminar' ) otherlv_2= '{' ( (lv_epigrage_3_0= ruleEpigrafe ) ) otherlv_4= ',' ( (lv_ementa_5_0= ruleEmenta ) ) otherlv_6= ',' ( (lv_preambulo_7_0= rulePreambulo ) ) otherlv_8= ',' otherlv_9= '}' ) )
            // InternalLegisFacile.g:210:2: ( (otherlv_0= 'Preliminar' | otherlv_1= 'preliminar' ) otherlv_2= '{' ( (lv_epigrage_3_0= ruleEpigrafe ) ) otherlv_4= ',' ( (lv_ementa_5_0= ruleEmenta ) ) otherlv_6= ',' ( (lv_preambulo_7_0= rulePreambulo ) ) otherlv_8= ',' otherlv_9= '}' )
            {
            // InternalLegisFacile.g:210:2: ( (otherlv_0= 'Preliminar' | otherlv_1= 'preliminar' ) otherlv_2= '{' ( (lv_epigrage_3_0= ruleEpigrafe ) ) otherlv_4= ',' ( (lv_ementa_5_0= ruleEmenta ) ) otherlv_6= ',' ( (lv_preambulo_7_0= rulePreambulo ) ) otherlv_8= ',' otherlv_9= '}' )
            // InternalLegisFacile.g:211:3: (otherlv_0= 'Preliminar' | otherlv_1= 'preliminar' ) otherlv_2= '{' ( (lv_epigrage_3_0= ruleEpigrafe ) ) otherlv_4= ',' ( (lv_ementa_5_0= ruleEmenta ) ) otherlv_6= ',' ( (lv_preambulo_7_0= rulePreambulo ) ) otherlv_8= ',' otherlv_9= '}'
            {
            // InternalLegisFacile.g:211:3: (otherlv_0= 'Preliminar' | otherlv_1= 'preliminar' )
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
                    // InternalLegisFacile.g:212:4: otherlv_0= 'Preliminar'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:217:4: otherlv_1= 'preliminar'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getPreliminarAccess().getPreliminarKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPreliminarAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLegisFacile.g:226:3: ( (lv_epigrage_3_0= ruleEpigrafe ) )
            // InternalLegisFacile.g:227:4: (lv_epigrage_3_0= ruleEpigrafe )
            {
            // InternalLegisFacile.g:227:4: (lv_epigrage_3_0= ruleEpigrafe )
            // InternalLegisFacile.g:228:5: lv_epigrage_3_0= ruleEpigrafe
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
            		
            // InternalLegisFacile.g:249:3: ( (lv_ementa_5_0= ruleEmenta ) )
            // InternalLegisFacile.g:250:4: (lv_ementa_5_0= ruleEmenta )
            {
            // InternalLegisFacile.g:250:4: (lv_ementa_5_0= ruleEmenta )
            // InternalLegisFacile.g:251:5: lv_ementa_5_0= ruleEmenta
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
            		
            // InternalLegisFacile.g:272:3: ( (lv_preambulo_7_0= rulePreambulo ) )
            // InternalLegisFacile.g:273:4: (lv_preambulo_7_0= rulePreambulo )
            {
            // InternalLegisFacile.g:273:4: (lv_preambulo_7_0= rulePreambulo )
            // InternalLegisFacile.g:274:5: lv_preambulo_7_0= rulePreambulo
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
    // InternalLegisFacile.g:303:1: entryRuleEpigrafe returns [EObject current=null] : iv_ruleEpigrafe= ruleEpigrafe EOF ;
    public final EObject entryRuleEpigrafe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEpigrafe = null;


        try {
            // InternalLegisFacile.g:303:49: (iv_ruleEpigrafe= ruleEpigrafe EOF )
            // InternalLegisFacile.g:304:2: iv_ruleEpigrafe= ruleEpigrafe EOF
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
    // InternalLegisFacile.g:310:1: ruleEpigrafe returns [EObject current=null] : ( (otherlv_0= 'Epigrafe' | otherlv_1= 'epigrafe' ) otherlv_2= '(' ( (lv_ato_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_numero_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_ano_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
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
            // InternalLegisFacile.g:316:2: ( ( (otherlv_0= 'Epigrafe' | otherlv_1= 'epigrafe' ) otherlv_2= '(' ( (lv_ato_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_numero_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_ano_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalLegisFacile.g:317:2: ( (otherlv_0= 'Epigrafe' | otherlv_1= 'epigrafe' ) otherlv_2= '(' ( (lv_ato_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_numero_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_ano_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalLegisFacile.g:317:2: ( (otherlv_0= 'Epigrafe' | otherlv_1= 'epigrafe' ) otherlv_2= '(' ( (lv_ato_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_numero_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_ano_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalLegisFacile.g:318:3: (otherlv_0= 'Epigrafe' | otherlv_1= 'epigrafe' ) otherlv_2= '(' ( (lv_ato_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_numero_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_ano_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalLegisFacile.g:318:3: (otherlv_0= 'Epigrafe' | otherlv_1= 'epigrafe' )
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
                    // InternalLegisFacile.g:319:4: otherlv_0= 'Epigrafe'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:324:4: otherlv_1= 'epigrafe'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getEpigrafeAccess().getEpigrafeKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEpigrafeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLegisFacile.g:333:3: ( (lv_ato_3_0= RULE_STRING ) )
            // InternalLegisFacile.g:334:4: (lv_ato_3_0= RULE_STRING )
            {
            // InternalLegisFacile.g:334:4: (lv_ato_3_0= RULE_STRING )
            // InternalLegisFacile.g:335:5: lv_ato_3_0= RULE_STRING
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
            		
            // InternalLegisFacile.g:355:3: ( (lv_numero_5_0= RULE_INT ) )
            // InternalLegisFacile.g:356:4: (lv_numero_5_0= RULE_INT )
            {
            // InternalLegisFacile.g:356:4: (lv_numero_5_0= RULE_INT )
            // InternalLegisFacile.g:357:5: lv_numero_5_0= RULE_INT
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
            		
            // InternalLegisFacile.g:377:3: ( (lv_ano_7_0= RULE_INT ) )
            // InternalLegisFacile.g:378:4: (lv_ano_7_0= RULE_INT )
            {
            // InternalLegisFacile.g:378:4: (lv_ano_7_0= RULE_INT )
            // InternalLegisFacile.g:379:5: lv_ano_7_0= RULE_INT
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
    // InternalLegisFacile.g:403:1: entryRuleEmenta returns [EObject current=null] : iv_ruleEmenta= ruleEmenta EOF ;
    public final EObject entryRuleEmenta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmenta = null;


        try {
            // InternalLegisFacile.g:403:47: (iv_ruleEmenta= ruleEmenta EOF )
            // InternalLegisFacile.g:404:2: iv_ruleEmenta= ruleEmenta EOF
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
    // InternalLegisFacile.g:410:1: ruleEmenta returns [EObject current=null] : ( (otherlv_0= 'Ementa' | otherlv_1= 'ementa' ) otherlv_2= '(' ( (lv_ementa_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleEmenta() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_ementa_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegisFacile.g:416:2: ( ( (otherlv_0= 'Ementa' | otherlv_1= 'ementa' ) otherlv_2= '(' ( (lv_ementa_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalLegisFacile.g:417:2: ( (otherlv_0= 'Ementa' | otherlv_1= 'ementa' ) otherlv_2= '(' ( (lv_ementa_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalLegisFacile.g:417:2: ( (otherlv_0= 'Ementa' | otherlv_1= 'ementa' ) otherlv_2= '(' ( (lv_ementa_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalLegisFacile.g:418:3: (otherlv_0= 'Ementa' | otherlv_1= 'ementa' ) otherlv_2= '(' ( (lv_ementa_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            // InternalLegisFacile.g:418:3: (otherlv_0= 'Ementa' | otherlv_1= 'ementa' )
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
                    // InternalLegisFacile.g:419:4: otherlv_0= 'Ementa'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getEmentaAccess().getEmentaKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:424:4: otherlv_1= 'ementa'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getEmentaAccess().getEmentaKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEmentaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLegisFacile.g:433:3: ( (lv_ementa_3_0= RULE_STRING ) )
            // InternalLegisFacile.g:434:4: (lv_ementa_3_0= RULE_STRING )
            {
            // InternalLegisFacile.g:434:4: (lv_ementa_3_0= RULE_STRING )
            // InternalLegisFacile.g:435:5: lv_ementa_3_0= RULE_STRING
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
    // InternalLegisFacile.g:459:1: entryRulePreambulo returns [EObject current=null] : iv_rulePreambulo= rulePreambulo EOF ;
    public final EObject entryRulePreambulo() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreambulo = null;


        try {
            // InternalLegisFacile.g:459:50: (iv_rulePreambulo= rulePreambulo EOF )
            // InternalLegisFacile.g:460:2: iv_rulePreambulo= rulePreambulo EOF
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
    // InternalLegisFacile.g:466:1: rulePreambulo returns [EObject current=null] : ( (otherlv_0= 'Preambulo' | otherlv_1= 'preambulo' ) otherlv_2= '(' ( (lv_preambulo_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject rulePreambulo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_preambulo_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegisFacile.g:472:2: ( ( (otherlv_0= 'Preambulo' | otherlv_1= 'preambulo' ) otherlv_2= '(' ( (lv_preambulo_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalLegisFacile.g:473:2: ( (otherlv_0= 'Preambulo' | otherlv_1= 'preambulo' ) otherlv_2= '(' ( (lv_preambulo_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalLegisFacile.g:473:2: ( (otherlv_0= 'Preambulo' | otherlv_1= 'preambulo' ) otherlv_2= '(' ( (lv_preambulo_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalLegisFacile.g:474:3: (otherlv_0= 'Preambulo' | otherlv_1= 'preambulo' ) otherlv_2= '(' ( (lv_preambulo_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            // InternalLegisFacile.g:474:3: (otherlv_0= 'Preambulo' | otherlv_1= 'preambulo' )
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
                    // InternalLegisFacile.g:475:4: otherlv_0= 'Preambulo'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:480:4: otherlv_1= 'preambulo'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getPreambuloAccess().getPreambuloKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPreambuloAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLegisFacile.g:489:3: ( (lv_preambulo_3_0= RULE_STRING ) )
            // InternalLegisFacile.g:490:4: (lv_preambulo_3_0= RULE_STRING )
            {
            // InternalLegisFacile.g:490:4: (lv_preambulo_3_0= RULE_STRING )
            // InternalLegisFacile.g:491:5: lv_preambulo_3_0= RULE_STRING
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
    // InternalLegisFacile.g:515:1: entryRuleNormativa returns [EObject current=null] : iv_ruleNormativa= ruleNormativa EOF ;
    public final EObject entryRuleNormativa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormativa = null;


        try {
            // InternalLegisFacile.g:515:50: (iv_ruleNormativa= ruleNormativa EOF )
            // InternalLegisFacile.g:516:2: iv_ruleNormativa= ruleNormativa EOF
            {
             newCompositeNode(grammarAccess.getNormativaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormativa=ruleNormativa();

            state._fsp--;

             current =iv_ruleNormativa; 
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
    // InternalLegisFacile.g:522:1: ruleNormativa returns [EObject current=null] : ( (otherlv_0= 'Normativa' | otherlv_1= 'normativa' ) otherlv_2= '{' ( (lv_artigos_3_0= ruleArtigo ) )+ otherlv_4= '}' ) ;
    public final EObject ruleNormativa() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_artigos_3_0 = null;



        	enterRule();

        try {
            // InternalLegisFacile.g:528:2: ( ( (otherlv_0= 'Normativa' | otherlv_1= 'normativa' ) otherlv_2= '{' ( (lv_artigos_3_0= ruleArtigo ) )+ otherlv_4= '}' ) )
            // InternalLegisFacile.g:529:2: ( (otherlv_0= 'Normativa' | otherlv_1= 'normativa' ) otherlv_2= '{' ( (lv_artigos_3_0= ruleArtigo ) )+ otherlv_4= '}' )
            {
            // InternalLegisFacile.g:529:2: ( (otherlv_0= 'Normativa' | otherlv_1= 'normativa' ) otherlv_2= '{' ( (lv_artigos_3_0= ruleArtigo ) )+ otherlv_4= '}' )
            // InternalLegisFacile.g:530:3: (otherlv_0= 'Normativa' | otherlv_1= 'normativa' ) otherlv_2= '{' ( (lv_artigos_3_0= ruleArtigo ) )+ otherlv_4= '}'
            {
            // InternalLegisFacile.g:530:3: (otherlv_0= 'Normativa' | otherlv_1= 'normativa' )
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
                    // InternalLegisFacile.g:531:4: otherlv_0= 'Normativa'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getNormativaAccess().getNormativaKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:536:4: otherlv_1= 'normativa'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getNormativaAccess().getNormativaKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getNormativaAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLegisFacile.g:545:3: ( (lv_artigos_3_0= ruleArtigo ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=26 && LA8_0<=27)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLegisFacile.g:546:4: (lv_artigos_3_0= ruleArtigo )
            	    {
            	    // InternalLegisFacile.g:546:4: (lv_artigos_3_0= ruleArtigo )
            	    // InternalLegisFacile.g:547:5: lv_artigos_3_0= ruleArtigo
            	    {

            	    					newCompositeNode(grammarAccess.getNormativaAccess().getArtigosArtigoParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_artigos_3_0=ruleArtigo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNormativaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"artigos",
            	    						lv_artigos_3_0,
            	    						"ufes.mdd.lei.LegisFacile.Artigo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNormativaAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleArtigo"
    // InternalLegisFacile.g:572:1: entryRuleArtigo returns [EObject current=null] : iv_ruleArtigo= ruleArtigo EOF ;
    public final EObject entryRuleArtigo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtigo = null;


        try {
            // InternalLegisFacile.g:572:47: (iv_ruleArtigo= ruleArtigo EOF )
            // InternalLegisFacile.g:573:2: iv_ruleArtigo= ruleArtigo EOF
            {
             newCompositeNode(grammarAccess.getArtigoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtigo=ruleArtigo();

            state._fsp--;

             current =iv_ruleArtigo; 
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
    // $ANTLR end "entryRuleArtigo"


    // $ANTLR start "ruleArtigo"
    // InternalLegisFacile.g:579:1: ruleArtigo returns [EObject current=null] : ( (otherlv_0= 'Artigo' | otherlv_1= 'artigo' ) otherlv_2= '{' ( (lv_caput_3_0= ruleCaput ) ) ( (lv_paragrafos_4_0= ruleParagrafo ) )* otherlv_5= '}' ) ;
    public final EObject ruleArtigo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_caput_3_0 = null;

        EObject lv_paragrafos_4_0 = null;



        	enterRule();

        try {
            // InternalLegisFacile.g:585:2: ( ( (otherlv_0= 'Artigo' | otherlv_1= 'artigo' ) otherlv_2= '{' ( (lv_caput_3_0= ruleCaput ) ) ( (lv_paragrafos_4_0= ruleParagrafo ) )* otherlv_5= '}' ) )
            // InternalLegisFacile.g:586:2: ( (otherlv_0= 'Artigo' | otherlv_1= 'artigo' ) otherlv_2= '{' ( (lv_caput_3_0= ruleCaput ) ) ( (lv_paragrafos_4_0= ruleParagrafo ) )* otherlv_5= '}' )
            {
            // InternalLegisFacile.g:586:2: ( (otherlv_0= 'Artigo' | otherlv_1= 'artigo' ) otherlv_2= '{' ( (lv_caput_3_0= ruleCaput ) ) ( (lv_paragrafos_4_0= ruleParagrafo ) )* otherlv_5= '}' )
            // InternalLegisFacile.g:587:3: (otherlv_0= 'Artigo' | otherlv_1= 'artigo' ) otherlv_2= '{' ( (lv_caput_3_0= ruleCaput ) ) ( (lv_paragrafos_4_0= ruleParagrafo ) )* otherlv_5= '}'
            {
            // InternalLegisFacile.g:587:3: (otherlv_0= 'Artigo' | otherlv_1= 'artigo' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLegisFacile.g:588:4: otherlv_0= 'Artigo'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getArtigoAccess().getArtigoKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:593:4: otherlv_1= 'artigo'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getArtigoAccess().getArtigoKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getArtigoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLegisFacile.g:602:3: ( (lv_caput_3_0= ruleCaput ) )
            // InternalLegisFacile.g:603:4: (lv_caput_3_0= ruleCaput )
            {
            // InternalLegisFacile.g:603:4: (lv_caput_3_0= ruleCaput )
            // InternalLegisFacile.g:604:5: lv_caput_3_0= ruleCaput
            {

            					newCompositeNode(grammarAccess.getArtigoAccess().getCaputCaputParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_caput_3_0=ruleCaput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArtigoRule());
            					}
            					set(
            						current,
            						"caput",
            						lv_caput_3_0,
            						"ufes.mdd.lei.LegisFacile.Caput");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLegisFacile.g:621:3: ( (lv_paragrafos_4_0= ruleParagrafo ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=29 && LA10_0<=30)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLegisFacile.g:622:4: (lv_paragrafos_4_0= ruleParagrafo )
            	    {
            	    // InternalLegisFacile.g:622:4: (lv_paragrafos_4_0= ruleParagrafo )
            	    // InternalLegisFacile.g:623:5: lv_paragrafos_4_0= ruleParagrafo
            	    {

            	    					newCompositeNode(grammarAccess.getArtigoAccess().getParagrafosParagrafoParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_paragrafos_4_0=ruleParagrafo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArtigoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"paragrafos",
            	    						lv_paragrafos_4_0,
            	    						"ufes.mdd.lei.LegisFacile.Paragrafo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getArtigoAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleArtigo"


    // $ANTLR start "entryRuleCaput"
    // InternalLegisFacile.g:648:1: entryRuleCaput returns [EObject current=null] : iv_ruleCaput= ruleCaput EOF ;
    public final EObject entryRuleCaput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaput = null;


        try {
            // InternalLegisFacile.g:648:46: (iv_ruleCaput= ruleCaput EOF )
            // InternalLegisFacile.g:649:2: iv_ruleCaput= ruleCaput EOF
            {
             newCompositeNode(grammarAccess.getCaputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCaput=ruleCaput();

            state._fsp--;

             current =iv_ruleCaput; 
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
    // $ANTLR end "entryRuleCaput"


    // $ANTLR start "ruleCaput"
    // InternalLegisFacile.g:655:1: ruleCaput returns [EObject current=null] : (otherlv_0= 'Caput|caput' otherlv_1= '(' ( (lv_texto_2_0= RULE_STRING ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_paragrafos_5_0= ruleParagrafo ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleCaput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_texto_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_paragrafos_5_0 = null;



        	enterRule();

        try {
            // InternalLegisFacile.g:661:2: ( (otherlv_0= 'Caput|caput' otherlv_1= '(' ( (lv_texto_2_0= RULE_STRING ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_paragrafos_5_0= ruleParagrafo ) )* otherlv_6= '}' )? ) )
            // InternalLegisFacile.g:662:2: (otherlv_0= 'Caput|caput' otherlv_1= '(' ( (lv_texto_2_0= RULE_STRING ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_paragrafos_5_0= ruleParagrafo ) )* otherlv_6= '}' )? )
            {
            // InternalLegisFacile.g:662:2: (otherlv_0= 'Caput|caput' otherlv_1= '(' ( (lv_texto_2_0= RULE_STRING ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_paragrafos_5_0= ruleParagrafo ) )* otherlv_6= '}' )? )
            // InternalLegisFacile.g:663:3: otherlv_0= 'Caput|caput' otherlv_1= '(' ( (lv_texto_2_0= RULE_STRING ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_paragrafos_5_0= ruleParagrafo ) )* otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCaputAccess().getCaputCaputKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCaputAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLegisFacile.g:671:3: ( (lv_texto_2_0= RULE_STRING ) )
            // InternalLegisFacile.g:672:4: (lv_texto_2_0= RULE_STRING )
            {
            // InternalLegisFacile.g:672:4: (lv_texto_2_0= RULE_STRING )
            // InternalLegisFacile.g:673:5: lv_texto_2_0= RULE_STRING
            {
            lv_texto_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_texto_2_0, grammarAccess.getCaputAccess().getTextoSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCaputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texto",
            						lv_texto_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getCaputAccess().getRightParenthesisKeyword_3());
            		
            // InternalLegisFacile.g:693:3: (otherlv_4= '{' ( (lv_paragrafos_5_0= ruleParagrafo ) )* otherlv_6= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLegisFacile.g:694:4: otherlv_4= '{' ( (lv_paragrafos_5_0= ruleParagrafo ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getCaputAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalLegisFacile.g:698:4: ( (lv_paragrafos_5_0= ruleParagrafo ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=29 && LA11_0<=30)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalLegisFacile.g:699:5: (lv_paragrafos_5_0= ruleParagrafo )
                    	    {
                    	    // InternalLegisFacile.g:699:5: (lv_paragrafos_5_0= ruleParagrafo )
                    	    // InternalLegisFacile.g:700:6: lv_paragrafos_5_0= ruleParagrafo
                    	    {

                    	    						newCompositeNode(grammarAccess.getCaputAccess().getParagrafosParagrafoParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_paragrafos_5_0=ruleParagrafo();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCaputRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"paragrafos",
                    	    							lv_paragrafos_5_0,
                    	    							"ufes.mdd.lei.LegisFacile.Paragrafo");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getCaputAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleCaput"


    // $ANTLR start "entryRuleParagrafo"
    // InternalLegisFacile.g:726:1: entryRuleParagrafo returns [EObject current=null] : iv_ruleParagrafo= ruleParagrafo EOF ;
    public final EObject entryRuleParagrafo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagrafo = null;


        try {
            // InternalLegisFacile.g:726:50: (iv_ruleParagrafo= ruleParagrafo EOF )
            // InternalLegisFacile.g:727:2: iv_ruleParagrafo= ruleParagrafo EOF
            {
             newCompositeNode(grammarAccess.getParagrafoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParagrafo=ruleParagrafo();

            state._fsp--;

             current =iv_ruleParagrafo; 
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
    // $ANTLR end "entryRuleParagrafo"


    // $ANTLR start "ruleParagrafo"
    // InternalLegisFacile.g:733:1: ruleParagrafo returns [EObject current=null] : ( (otherlv_0= 'Paragrafo' | otherlv_1= 'paragrafo' ) otherlv_2= '(' ( (lv_texto_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '{' ( (lv_alineas_6_0= ruleAlinea ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleParagrafo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_texto_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_alineas_6_0 = null;



        	enterRule();

        try {
            // InternalLegisFacile.g:739:2: ( ( (otherlv_0= 'Paragrafo' | otherlv_1= 'paragrafo' ) otherlv_2= '(' ( (lv_texto_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '{' ( (lv_alineas_6_0= ruleAlinea ) )* otherlv_7= '}' )? ) )
            // InternalLegisFacile.g:740:2: ( (otherlv_0= 'Paragrafo' | otherlv_1= 'paragrafo' ) otherlv_2= '(' ( (lv_texto_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '{' ( (lv_alineas_6_0= ruleAlinea ) )* otherlv_7= '}' )? )
            {
            // InternalLegisFacile.g:740:2: ( (otherlv_0= 'Paragrafo' | otherlv_1= 'paragrafo' ) otherlv_2= '(' ( (lv_texto_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '{' ( (lv_alineas_6_0= ruleAlinea ) )* otherlv_7= '}' )? )
            // InternalLegisFacile.g:741:3: (otherlv_0= 'Paragrafo' | otherlv_1= 'paragrafo' ) otherlv_2= '(' ( (lv_texto_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '{' ( (lv_alineas_6_0= ruleAlinea ) )* otherlv_7= '}' )?
            {
            // InternalLegisFacile.g:741:3: (otherlv_0= 'Paragrafo' | otherlv_1= 'paragrafo' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalLegisFacile.g:742:4: otherlv_0= 'Paragrafo'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:747:4: otherlv_1= 'paragrafo'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getParagrafoAccess().getParagrafoKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getParagrafoAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLegisFacile.g:756:3: ( (lv_texto_3_0= RULE_STRING ) )
            // InternalLegisFacile.g:757:4: (lv_texto_3_0= RULE_STRING )
            {
            // InternalLegisFacile.g:757:4: (lv_texto_3_0= RULE_STRING )
            // InternalLegisFacile.g:758:5: lv_texto_3_0= RULE_STRING
            {
            lv_texto_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_texto_3_0, grammarAccess.getParagrafoAccess().getTextoSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParagrafoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texto",
            						lv_texto_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getParagrafoAccess().getRightParenthesisKeyword_3());
            		
            // InternalLegisFacile.g:778:3: (otherlv_5= '{' ( (lv_alineas_6_0= ruleAlinea ) )* otherlv_7= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLegisFacile.g:779:4: otherlv_5= '{' ( (lv_alineas_6_0= ruleAlinea ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getParagrafoAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalLegisFacile.g:783:4: ( (lv_alineas_6_0= ruleAlinea ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=31 && LA14_0<=32)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalLegisFacile.g:784:5: (lv_alineas_6_0= ruleAlinea )
                    	    {
                    	    // InternalLegisFacile.g:784:5: (lv_alineas_6_0= ruleAlinea )
                    	    // InternalLegisFacile.g:785:6: lv_alineas_6_0= ruleAlinea
                    	    {

                    	    						newCompositeNode(grammarAccess.getParagrafoAccess().getAlineasAlineaParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_alineas_6_0=ruleAlinea();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getParagrafoRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"alineas",
                    	    							lv_alineas_6_0,
                    	    							"ufes.mdd.lei.LegisFacile.Alinea");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getParagrafoAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleParagrafo"


    // $ANTLR start "entryRuleAlinea"
    // InternalLegisFacile.g:811:1: entryRuleAlinea returns [String current=null] : iv_ruleAlinea= ruleAlinea EOF ;
    public final String entryRuleAlinea() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlinea = null;


        try {
            // InternalLegisFacile.g:811:46: (iv_ruleAlinea= ruleAlinea EOF )
            // InternalLegisFacile.g:812:2: iv_ruleAlinea= ruleAlinea EOF
            {
             newCompositeNode(grammarAccess.getAlineaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlinea=ruleAlinea();

            state._fsp--;

             current =iv_ruleAlinea.getText(); 
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
    // $ANTLR end "entryRuleAlinea"


    // $ANTLR start "ruleAlinea"
    // InternalLegisFacile.g:818:1: ruleAlinea returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'alinea' | kw= 'Alinea' ) kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleAlinea() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLegisFacile.g:824:2: ( ( (kw= 'alinea' | kw= 'Alinea' ) kw= '{' kw= '}' ) )
            // InternalLegisFacile.g:825:2: ( (kw= 'alinea' | kw= 'Alinea' ) kw= '{' kw= '}' )
            {
            // InternalLegisFacile.g:825:2: ( (kw= 'alinea' | kw= 'Alinea' ) kw= '{' kw= '}' )
            // InternalLegisFacile.g:826:3: (kw= 'alinea' | kw= 'Alinea' ) kw= '{' kw= '}'
            {
            // InternalLegisFacile.g:826:3: (kw= 'alinea' | kw= 'Alinea' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            else if ( (LA16_0==32) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalLegisFacile.g:827:4: kw= 'alinea'
                    {
                    kw=(Token)match(input,31,FOLLOW_6); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAlineaAccess().getAlineaKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:833:4: kw= 'Alinea'
                    {
                    kw=(Token)match(input,32,FOLLOW_6); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAlineaAccess().getAlineaKeyword_0_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,13,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAlineaAccess().getLeftCurlyBracketKeyword_1());
            		
            kw=(Token)match(input,15,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAlineaAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleAlinea"


    // $ANTLR start "entryRuleFinal"
    // InternalLegisFacile.g:853:1: entryRuleFinal returns [String current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final String entryRuleFinal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFinal = null;


        try {
            // InternalLegisFacile.g:853:45: (iv_ruleFinal= ruleFinal EOF )
            // InternalLegisFacile.g:854:2: iv_ruleFinal= ruleFinal EOF
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
    // InternalLegisFacile.g:860:1: ruleFinal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'Final' | kw= 'final' ) kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleFinal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLegisFacile.g:866:2: ( ( (kw= 'Final' | kw= 'final' ) kw= '{' kw= '}' ) )
            // InternalLegisFacile.g:867:2: ( (kw= 'Final' | kw= 'final' ) kw= '{' kw= '}' )
            {
            // InternalLegisFacile.g:867:2: ( (kw= 'Final' | kw= 'final' ) kw= '{' kw= '}' )
            // InternalLegisFacile.g:868:3: (kw= 'Final' | kw= 'final' ) kw= '{' kw= '}'
            {
            // InternalLegisFacile.g:868:3: (kw= 'Final' | kw= 'final' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            else if ( (LA17_0==34) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalLegisFacile.g:869:4: kw= 'Final'
                    {
                    kw=(Token)match(input,33,FOLLOW_6); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFinalAccess().getFinalKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLegisFacile.g:875:4: kw= 'final'
                    {
                    kw=(Token)match(input,34,FOLLOW_6); 

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
    // InternalLegisFacile.g:895:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalLegisFacile.g:895:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalLegisFacile.g:896:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalLegisFacile.g:902:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalLegisFacile.g:908:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalLegisFacile.g:909:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalLegisFacile.g:909:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalLegisFacile.g:910:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalLegisFacile.g:914:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLegisFacile.g:915:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLegisFacile.g:915:4: (lv_name_1_0= RULE_ID )
            // InternalLegisFacile.g:916:5: lv_name_1_0= RULE_ID
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
    // InternalLegisFacile.g:936:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalLegisFacile.g:936:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalLegisFacile.g:937:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalLegisFacile.g:943:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
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
            // InternalLegisFacile.g:949:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // InternalLegisFacile.g:950:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // InternalLegisFacile.g:950:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // InternalLegisFacile.g:951:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalLegisFacile.g:955:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLegisFacile.g:956:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLegisFacile.g:956:4: (lv_name_1_0= RULE_ID )
            // InternalLegisFacile.g:957:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

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

            // InternalLegisFacile.g:973:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLegisFacile.g:974:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalLegisFacile.g:978:4: ( (otherlv_3= RULE_ID ) )
                    // InternalLegisFacile.g:979:5: (otherlv_3= RULE_ID )
                    {
                    // InternalLegisFacile.g:979:5: (otherlv_3= RULE_ID )
                    // InternalLegisFacile.g:980:6: otherlv_3= RULE_ID
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

            otherlv_4=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLegisFacile.g:996:3: ( (lv_features_5_0= ruleFeature ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLegisFacile.g:997:4: (lv_features_5_0= ruleFeature )
            	    {
            	    // InternalLegisFacile.g:997:4: (lv_features_5_0= ruleFeature )
            	    // InternalLegisFacile.g:998:5: lv_features_5_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop19;
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
    // InternalLegisFacile.g:1023:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalLegisFacile.g:1023:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalLegisFacile.g:1024:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalLegisFacile.g:1030:1: ruleFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalLegisFacile.g:1036:2: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalLegisFacile.g:1037:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalLegisFacile.g:1037:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalLegisFacile.g:1038:3: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // InternalLegisFacile.g:1038:3: ( (lv_many_0_0= 'many' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLegisFacile.g:1039:4: (lv_many_0_0= 'many' )
                    {
                    // InternalLegisFacile.g:1039:4: (lv_many_0_0= 'many' )
                    // InternalLegisFacile.g:1040:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,38,FOLLOW_22); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getFeatureAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(current, "many", lv_many_0_0 != null, "many");
                    				

                    }


                    }
                    break;

            }

            // InternalLegisFacile.g:1052:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLegisFacile.g:1053:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLegisFacile.g:1053:4: (lv_name_1_0= RULE_ID )
            // InternalLegisFacile.g:1054:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

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

            otherlv_2=(Token)match(input,39,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
            		
            // InternalLegisFacile.g:1074:3: ( (otherlv_3= RULE_ID ) )
            // InternalLegisFacile.g:1075:4: (otherlv_3= RULE_ID )
            {
            // InternalLegisFacile.g:1075:4: (otherlv_3= RULE_ID )
            // InternalLegisFacile.g:1076:5: otherlv_3= RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001800001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000600000000L});
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
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000180008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000008040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});

}