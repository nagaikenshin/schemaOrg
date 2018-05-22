package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IS_RELATED_TO;
import org.kyojo.schemaOrg.m3n3.core.Container.IsRelatedTo;

@ExternalDomain
public class IsRelatedToConverter implements DomainConverter<IsRelatedTo, String> {

	@Override
	public String fromDomainToValue(IsRelatedTo domain) {
		return domain.getNativeValue();
	}

	@Override
	public IsRelatedTo fromValueToDomain(String value) {
		return new IS_RELATED_TO(value);
	}

}
