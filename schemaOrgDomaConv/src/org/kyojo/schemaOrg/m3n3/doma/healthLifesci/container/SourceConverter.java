package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.SOURCE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Source;

@ExternalDomain
public class SourceConverter implements DomainConverter<Source, String> {

	@Override
	public String fromDomainToValue(Source domain) {
		return domain.getNativeValue();
	}

	@Override
	public Source fromValueToDomain(String value) {
		return new SOURCE(value);
	}

}
