/*
 * generated by Xtext 2.23.0
 */
package ufes.mdd.lei.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ufes.mdd.lei.legisFacile.Lei
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import ufes.mdd.lei.legisFacile.Preambulo

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class LegisFacileGenerator extends AbstractGenerator {
	
	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) 
	{
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))	
	}
	
	
}
