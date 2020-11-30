/*
 * generated by Xtext 2.23.0
 */
package ufes.mdd.lei.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ufes.mdd.lei.legisFacile.Lei
import ufes.mdd.lei.legisFacile.Type
import ufes.mdd.lei.legisFacile.Preliminar
import ufes.mdd.lei.legisFacile.Epigrafe
import ufes.mdd.lei.legisFacile.Ementa
import ufes.mdd.lei.legisFacile.Preambulo
import ufes.mdd.lei.legisFacile.Normativa
import ufes.mdd.lei.legisFacile.Artigo

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class LegisFacileGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) 
	{
		for ( e : resource.allContents.toIterable.filter(Lei) )
		{
			fsa.generateFile(resource.className + ".html", e.compile)
		}
		
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))	
	}
	
	private def className(Resource res)
	{
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf(".")).toFirstUpper
	}
	
	
	private def compile(Lei l)'''
	«FOR t : l.elements »
		«t.compile»	
	«ENDFOR»
	'''
	
	private def compile(Type t)'''
	<!DOCTYPE html>
	<html>
	<head>
	    <meta charset='utf-8'>
	    <!--<meta http-equiv='X-UA-Compatible' content='IE=edge'>-->
	    <title>Lei protótipo</title>
	    <meta name='viewport' content='width=device-width, initial-scale=1'>
	    <!--<link rel='stylesheet' type='text/css' media='screen' href='main.css'>
	    <script src='main.js'></script>-->
	</head>
	<body>
	«t.preliminar.compile»
	«t.normativa.compile»
	</body>
	</html>		         
	'''
	
	
	private def compile(Normativa n)
	{
		var elemento = new StringBuilder
		for ( var i = 0; i < n.artigos.size; i++ )
		{
			elemento.append(n.artigos.get(i).compile((i+1)))
		}
		return elemento.toString
	}
	
	private def compile(Artigo a, Integer i)'''
	<p>Art. «i»: «a.caput.texto»</p>
	'''
	
	private def compile(Preliminar p)'''
	«p.epigrage.compile»	
	«p.ementa.compile»
	«p.preambulo.compile»
	'''
	
	private def compile(Epigrafe e)'''
	<div style="margin: 0 0 1.0% 50%;"><a href="http://informatica.ufes.br">
		        <font color="#000080">
		         «e.ato» Nº «e.numero», de «e.ano» </font></a></div>
	'''
	
	private def compile(Ementa e)'''
	<table width="100%" cellspacing="0" cellpadding="0" border="0">
	   <tbody><tr>
	    <td width="52%">
	    	&nbsp;</td>
	    <td width="48%">
	  <p align="justify">
	  <font size="2" face="Arial">
		<span style="font-size: 10.0pt; font-family: Arial,sans-serif">
		<font color="#800000">«e.ementa»</font></span></font></p></td>
	   </tr>
	  </tbody></table>
	'''
	
	private def compile(Preambulo p)'''
	<p class="MsoNormal" style="text-indent: 1.0cm; line-height: normal; text-align: justify; margin-top: 20px; margin-bottom: 20px">
		<span style="font-size:10.0pt;font-family:&quot;Arial&quot;sans-serif">«p.preambulo»</span>
		<span style="font-size:10.0pt;font-family:&quot;Arial&quot;sans-serif">&nbsp;</span></p>
	'''

	
	
}
