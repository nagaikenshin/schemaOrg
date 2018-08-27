package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PUBLISHING_PRINCIPLES;
import org.kyojo.schemaorg.m3n4.core.Container.PublishingPrinciples;

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
