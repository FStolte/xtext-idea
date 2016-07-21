/*
 * generated by Xtext
 */
package org.eclipse.xtext.testlanguages.backtracking.idea.highlighting;

import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import org.eclipse.xtext.testlanguages.backtracking.idea.lang.BeeLangTestLanguageLanguage;
import org.jetbrains.annotations.NotNull;

public class BeeLangTestLanguageSyntaxHighlighterFactory extends SingleLazyInstanceSyntaxHighlighterFactory {
	
	@Override
	@NotNull
	protected SyntaxHighlighter createHighlighter() {
		return BeeLangTestLanguageLanguage.INSTANCE.getInstance(SyntaxHighlighter.class);
	}
}