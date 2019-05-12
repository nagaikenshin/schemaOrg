package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SIGNIFICANT_LINK;
import org.kyojo.schemaorg.m3n5.core.Container.SignificantLink;

@ExternalDomain
public class SignificantLinkConverter implements DomainConverter<SignificantLink, String> {

	@Override
	public String fromDomainToValue(SignificantLink domain) {
		return domain.getNativeValue();
	}

	@Override
	public SignificantLink fromValueToDomain(String value) {
		return new SIGNIFICANT_LINK(value);
	}

}
