package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ISSN;
import org.kyojo.schemaorg.m3n5.core.Container.Issn;

@ExternalDomain
public class IssnConverter implements DomainConverter<Issn, String> {

	@Override
	public String fromDomainToValue(Issn domain) {
		return domain.getNativeValue();
	}

	@Override
	public Issn fromValueToDomain(String value) {
		return new ISSN(value);
	}

}
