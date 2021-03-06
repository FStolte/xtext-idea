/*
 * generated by Xtext
 */
package org.eclipse.xtext.purexbase.idea

import com.google.inject.Guice
import org.eclipse.xtext.purexbase.PureXbaseRuntimeModule
import org.eclipse.xtext.purexbase.PureXbaseStandaloneSetupGenerated
import org.eclipse.xtext.util.Modules2

class PureXbaseStandaloneSetupIdea extends PureXbaseStandaloneSetupGenerated {
	override createInjector() {
		val runtimeModule = new PureXbaseRuntimeModule()
		val ideaModule = new PureXbaseIdeaModule()
		val mergedModule = Modules2.mixin(runtimeModule, ideaModule)
		return Guice.createInjector(mergedModule)
	}
}
