/*
 * generated by Xtext 2.23.0
 */
package ufes.mdd.lei.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ufes.mdd.lei.legisFacile.Artigo
import ufes.mdd.lei.legisFacile.Caput
import ufes.mdd.lei.legisFacile.Ementa
import ufes.mdd.lei.legisFacile.Epigrafe
import ufes.mdd.lei.legisFacile.Inciso
import ufes.mdd.lei.legisFacile.Lei
import ufes.mdd.lei.legisFacile.Normativa
import ufes.mdd.lei.legisFacile.Preambulo
import ufes.mdd.lei.legisFacile.Preliminar
import ufes.mdd.lei.legisFacile.Type
import ufes.mdd.lei.legisFacile.Alinea
import ufes.mdd.lei.legisFacile.Item
import ufes.mdd.lei.legisFacile.Paragrafo

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
	
	private def compile(Alinea a, int i)
	{
		var sb = new StringBuilder
		sb.append(a.compileLinha(i))
		for ( var j = 0; j < a.itens.size; j++ )
		{
			sb.append(a.itens.get(j).compile(j))
		}
		return sb.toString
	}
	
	private def compile(Item item, int i)'''
	<p>«i+1». «item.texto»</p>
	'''
	
	private def compileLinha(Alinea a, int i)'''
	<p>«converteEmAlfabeto(i)») «a.texto»</p>
	'''
	
	private def converteEmAlfabeto(int i)
	{
		val alfabeto = "abcdefghijklmnopqrstuvwxyz"
		return String.valueOf(alfabeto.charAt(i % alfabeto.length))
		
	}
	
	private def compile(Inciso i, int j)
	{
		var sb = new StringBuilder
		sb.append(i.compileLinha(j))
		for ( var k = 0; k < i.alineas.size; k++ )
		{
			sb.append(i.alineas.get(k).compile(k))		
		}
		
		return sb.toString		
	}
	
	private def compileLinha(Inciso i, int j)'''
	<p>«converteEmRomanos((j+1))» - «i.texto»</p>
	'''
	
	private def converteEmRomanos(int numero)
	{
		var numeroConvertido = numero
		val valores_lista = newArrayList(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
		val String []char_lista = newArrayList("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
		
		var res = new StringBuilder
		for ( var i = 0; i < valores_lista.size; i++ )
		{
			while ( numeroConvertido >= valores_lista.get(i) )
			{
				numeroConvertido -= valores_lista.get(i)
				res.append(char_lista.get(i))
			}
		}
		
		return res.toString
	}
	
	private def compile(Paragrafo p, boolean ehUnico, int indice)
	{
		var sb = new StringBuilder
		sb.append(p.compileLinha(ehUnico, indice))
		for ( var i = 0; i < p.incisos.size; i++ )
		{
			sb.append(p.incisos.get(i).compile(i))
		}
		
		return sb.toString
	}
	
	private def compileLinha(Paragrafo p, boolean ehUnico, int indice)'''
	«IF ehUnico»
	<p>Parágrafo único. «p.texto»</p>
	«ELSE»
	<p>§«indice+1»º «p.texto»</p>
	«ENDIF»
	'''
	
	private def compile(Normativa n)
	{
		var sb = new StringBuilder
		for ( var i = 0; i < n.artigos.size; i++ )
		{
			sb.append(n.artigos.get(i).compile((i)))
			for ( var j = 0; j < n.artigos.get(i).paragrafos.size; j++ )
			{
				var ehUnico = false
				if ( !ehUnico && n.artigos.get(i).paragrafos.size == 1 )
				{
					ehUnico = true
				}
				
				sb.append(n.artigos.get(i).paragrafos.get(j).compile(ehUnico, j))
								
			}
		}
		return sb.toString
	}
	
	private def compile(Artigo a, int i)
	{
		val resultado = new StringBuilder
		resultado.append(a.caput.compile(i))
		a.caput.incisos.forEach[inciso, j| resultado.append(inciso.compile(j))]
		
		return resultado.toString
		
	}
	
	/*private def insereNovaLinha(StringBuilder sb, String elemento)
	{
		sb.append(elemento)
		sb.append(System.getProperty("line.separator"))
	}*/
	
	private def compile(Caput c, int i)'''
	«IF i < 9 »
	<p>Art. «i+1»º «c.texto»</p>
	«ELSE»
	<p>Art. «i+1». «c.texto»</p>
	«ENDIF»
	
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
