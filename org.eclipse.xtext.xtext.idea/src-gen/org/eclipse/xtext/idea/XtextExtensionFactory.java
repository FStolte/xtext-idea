/*
 * generated by Xtext 2.11
 */
package org.eclipse.xtext.idea;

import com.intellij.openapi.extensions.ExtensionFactory;
import org.eclipse.xtext.idea.lang.XtextLanguage;

public class XtextExtensionFactory implements ExtensionFactory {
	@Override
	public Object createInstance(String factoryArgument, String implementationClass) {
		Class<?> clazz;
		try {
			clazz = Class.forName(implementationClass);
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException("Couldn't load "+implementationClass, e);
		}
		return XtextLanguage.INSTANCE.<Object> getInstance(clazz);
	}
}
