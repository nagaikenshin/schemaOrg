package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PUBLISHING_PRINCIPLES;
import org.kyojo.schemaOrg.m3n3.core.Container.PublishingPrinciples;

@ExternalDomain
public class PublishingPrinciplesConverter implements DomainConverter<PublishingPrinciples, String> {

	@Override
	public String fromDomainToValue(PublishingPrinciples domain) {
		return domain.getNativeValue();
	}

	@Override
	public PublishingPrinciples fromValueToDomain(String value) {
		return new PUBLISHING_PRINCIPLES(value);
	}

}
