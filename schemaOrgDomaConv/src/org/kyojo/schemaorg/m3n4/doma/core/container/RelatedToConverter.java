package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RELATED_TO;
import org.kyojo.schemaorg.m3n4.core.Container.RelatedTo;

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
