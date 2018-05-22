package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RELATED_TO;
import org.kyojo.schemaOrg.m3n3.core.Container.RelatedTo;

@ExternalDomain
public class RelatedToConverter implements DomainConverter<RelatedTo, String> {

	@Override
	public String fromDomainToValue(RelatedTo domain) {
		return domain.getNativeValue();
	}

	@Override
	public RelatedTo fromValueToDomain(String value) {
		return new RELATED_TO(value);
	}

}
