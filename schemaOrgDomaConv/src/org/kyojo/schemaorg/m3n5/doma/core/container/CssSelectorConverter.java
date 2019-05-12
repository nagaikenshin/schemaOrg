package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CSS_SELECTOR;
import org.kyojo.schemaorg.m3n5.core.Container.CssSelector;

@ExternalDomain
public class CssSelectorConverter implements DomainConverter<CssSelector, String> {

	@Override
	public String fromDomainToValue(CssSelector domain) {
		return domain.getNativeValue();
	}

	@Override
	public CssSelector fromValueToDomain(String value) {
		return new CSS_SELECTOR(value);
	}

}