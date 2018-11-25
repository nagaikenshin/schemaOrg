package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LATEX;
import org.kyojo.schemaorg.m3n4.core.Container.LaTeX;

@ExternalDomain
public class LaTeXConverter implements DomainConverter<LaTeX, String> {

	@Override
	public String fromDomainToValue(LaTeX domain) {
		return domain.getNativeValue();
	}

	@Override
	public LaTeX fromValueToDomain(String value) {
		return new LATEX(value);
	}

}
